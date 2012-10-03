/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package soapprovisioning;


//import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import iap.sessioncontrol.Cai3GFaultException;
import iap.soapprovisioning.MOId;
import iap.sessioncontrol.SessionControlEndpointSlsbService;
import iap.sessioncontrol.SessionControl;
import iap.soapprovisioning.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
//import java.util.Formatter.DateTime;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.ws.Holder;


/**
 *
 * @author Igor Korsun
 */
public class Main {
    public static Properties mainProp;
    private static Properties SubscriberSvcTemplates;
    private static Properties UserSvcTemplates;
    private static Properties EquipmentServices;
    private static IapSubscriber iapSubscriber;
    private static IapUser  iapUser;
    private static IapEquipment iapEquipment;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        String PropFileName = args[0];
        String TaskName = args[1];
        //Load main properties
        mainProp = new Properties();
        mainProp = getMainProp(PropFileName);

        //Get access credentials
        String cai3gUser = mainProp.getProperty("com.ericsson.soapprovisioning.cai3g.user");
        String cai3gPwd  = mainProp.getProperty("com.ericsson.soapprovisioning.cai3g.pwd");
        IapSessionCred iapSessionCred = new IapSessionCred();
        iapSessionCred = IapSessionLogin(cai3gUser,cai3gPwd);

        if(TaskName.equals("create")){
            //Provision subscribers
            CreateIapSubscribers(iapSessionCred);
            //Provision users
            CreateIapUsers(iapSessionCred);
            //Provision STBs
            CreateIapEquipment(iapSessionCred);

        } else if(TaskName.equals("delete")){
            DeleteIapEquipment(iapSessionCred);
            DeleteIapUsers(iapSessionCred);
            DeleteIapSubscribers(iapSessionCred);
        } else if(TaskName.equals("bootstrap")){
            SetBootstrapAllEquipment(iapSessionCred);
        }
        

    }
/**
 * Load main setting of application:
 * cai3g iap login
 * cai3g iap passw
 * sqlite db file name
 *
 * @param PropFileName
 * @return
 */
    private static Properties getMainProp(String PropFileName) {
        mainProp = new Properties();

        try {
            FileInputStream mainPropFile = new FileInputStream(PropFileName);
            try {
                mainProp.load(mainPropFile);
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
                    } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mainProp;
    }
/**
 * Login into IAP Cai3g
 *<p> Java.lang.String user: Login name to IAP cai3g
 *<p> Java.lang.String pwd:  Password to access IAP cai3g
 *@return iapSessionCred
 * <p>Holder<String> <b>SessionId</b>
 * <p>Holder<BigInteger> <b>SeqenceId</b>
 */
    private static IapSessionCred IapSessionLogin(String user, String pwd) {
        IapSessionCred iapSessionCred = new IapSessionCred();
        iapSessionCred.sequenceId = new Holder<BigInteger>();
        iapSessionCred.sessionId =  new Holder<String>();
        try {
            SessionControlEndpointSlsbService iapSessionCtrlService = new SessionControlEndpointSlsbService();
            SessionControl iapSession = iapSessionCtrlService.getSessionControlEndpointSlsbPort();
            iapSession.login(user, pwd, iapSessionCred.sessionId, iapSessionCred.sequenceId);
        } catch (Cai3GFaultException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.ALL, null, ex);
        }
        System.out.println("Login cred:"+iapSessionCred.getSessionId()+" "+iapSessionCred.getSequenceId());
        return iapSessionCred;
    }

    private static void CreateIapSubscribers(IapSessionCred iapSessionCred) {

        List<String> iapSubscribers = new ArrayList<String>();
        try {
            iapSubscribers = GetSubscribersIdList();
            int subscriberCount = iapSubscribers.size();
            int listIdx=0;
            while(listIdx<subscriberCount){
                iapSessionCred.GetNextSequenceId();
                System.out.println(iapSubscribers.get(listIdx));
                CreateSubscriber iapNewSbs = new CreateSubscriber();
                iapNewSbs.setSubscriberId(iapSubscribers.get(listIdx));
                iapNewSbs.setCreateSubscriberIdattribute(iapSubscribers.get(listIdx));
                iapNewSbs.setCommonData(CreateIapSubscriberCommonData(iapSubscribers.get(listIdx)));
                iapNewSbs.setServices(CreateIapSubscriberServices(iapSubscribers.get(listIdx)));
                CreateDocument iapCreateDocument = new CreateDocument();
                iapCreateDocument.setIapSubscriberMoId(iapSubscribers.get(listIdx));
                iapCreateDocument.setIapSubscriberMoAttributes(iapNewSbs);
                iapCreateDocument.iapMoType = MoType.SUBSCRIBER_HTTP_CAI_3_G_IAP_IPTV_ERICSSON_COM_IPTV_PROVISIONING_SUBSCRIBER;
                iapCreateDocument.iapSessionCred = iapSessionCred;

                iapCreateProvisioning(iapCreateDocument);

                //System.out.println("------------------------");
                listIdx++;
            }


        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


    private static void CreateIapUsers(IapSessionCred iapSessionCred) {
        List<String> iapUsers = new ArrayList<String>();
        try {
            iapUsers = GetUsersIdList();
            int usersCount = iapUsers.size();
            int listIdx=0;
            while(listIdx<usersCount){
                iapSessionCred.GetNextSequenceId();
                System.out.println(iapUsers.get(listIdx));
                CreateUser iapNewUser = new CreateUser();

                iapNewUser.setUserId(iapUsers.get(listIdx));
                iapNewUser.setCreateUserIdattribute(iapUsers.get(listIdx));
                iapNewUser.setCommonData(CreateIapUserCommonData(iapUsers.get(listIdx)));
                iapNewUser.setServices(CreateIapUserServices(iapUsers.get(listIdx)));

                CreateDocument iapCreateDocument = new CreateDocument();
                iapCreateDocument.setIapUserMoId(iapUsers.get(listIdx));
                iapCreateDocument.setUserMoAttributes(iapNewUser);
                iapCreateDocument.iapMoType = MoType.USER_HTTP_CAI_3_G_IAP_IPTV_ERICSSON_COM_IPTV_PROVISIONING_USER;
                iapCreateDocument.iapSessionCred = iapSessionCred;

                iapCreateProvisioning(iapCreateDocument);

                //System.out.println("------------------------");
                listIdx++;
            }


        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


    private static void CreateIapEquipment(IapSessionCred iapSessionCred) {
        List<String> iapBoxes = new ArrayList<String>();
           try {
               iapBoxes = GetEquipmentIdList();
               int boxCount = iapBoxes.size();
               int listIdx=0;
               while(listIdx<boxCount){
                   iapSessionCred.GetNextSequenceId();
                   System.out.println(iapBoxes.get(listIdx));

                   CreateEquipment iapNewEquipment = new CreateEquipment();
                   
                   iapNewEquipment.setEquipmentId(iapBoxes.get(listIdx));
                   iapNewEquipment.setCreateEquipmentIdattribute(iapBoxes.get(listIdx));
                   iapNewEquipment.setCommonData(CreateIapEquipmentCommonData(iapBoxes.get(listIdx)));
                   iapNewEquipment.setServices(CreateIapEquipmentServices(iapBoxes.get(listIdx)));

                   CreateDocument iapCreateDocument = new CreateDocument();
                   
                   iapCreateDocument.setIapEquipmentMoId(iapBoxes.get(listIdx));
                   iapCreateDocument.setEquipmentMoAttributes(iapNewEquipment);
                   iapCreateDocument.iapMoType = MoType.EQUIPMENT_HTTP_CAI_3_G_IAP_IPTV_ERICSSON_COM_IPTV_PROVISIONING_EQUIPMENT;
                   iapCreateDocument.iapSessionCred = iapSessionCred;

                    iapCreateProvisioning(iapCreateDocument);
                    listIdx++;
                }

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }


    }



    private static CreateSubscriberCommonDataType CreateIapSubscriberCommonData(String iapSubscriberId) {
        CreateSubscriberCommonDataType subscriberCommonData = new CreateSubscriberCommonDataType();
        try {
            Connection dbconnection = GetDbConnection();
            Statement sqlstatment = dbconnection.createStatement();
            ResultSet request = sqlstatment.executeQuery("select sbsPostal,"
                    + "sbsRegion,sbsBlocked,sbsBlockedUntil "
                    + " from iap_sbs_profile"
                    + " where id='"+iapSubscriberId+"';");

        Blocked iapSbsState = new Blocked();
        XMLGregorianCalendar blockDate = new XMLGregorianCalendarImpl();
        BlockedStateType iapLockState = new BlockedStateType();

        if(request.getString("sbsBlocked").equals("true")){
            Date dt = Date.valueOf(request.getString("sbsBlockedUntil"));
            blockDate = date2Gregorian(dt);
            iapSbsState.setUntilDate(blockDate);
            iapLockState.setBlocked(iapSbsState);
            subscriberCommonData.setBlockedState(iapLockState);
        } else {
            iapLockState.setUnBlocked("unBlocked");
            subscriberCommonData.setBlockedState(iapLockState);
        }

        subscriberCommonData.setPostalCode(request.getString("sbsPostal"));
        subscriberCommonData.setServiceRegion(request.getString("sbsRegion"));
        dbconnection.close();

            } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }



        return subscriberCommonData;
    }


    private static CreateUserCommonDataType CreateIapUserCommonData(String iapUserId) {
        CreateUserCommonDataType userCommonData = new CreateUserCommonDataType();
        try {
        Connection dbconnection = GetDbConnection();
            Statement sqlstatment = dbconnection.createStatement();
            ResultSet request = sqlstatment.executeQuery("select usrAllowedRating,"
                    + "usrFirstName,usrLastName,usrLang,usrMobilePhoneNumber,"
                    + "usrNotification,usrRole,subscriberId"
                    + " from IAP_USR_PROFILE"
                    + " where id='"+iapUserId+"';");
        userCommonData.setAllowedRating(request.getString("usrAllowedRating"));
        userCommonData.setFirstName(request.getString("usrFirstName"));
        userCommonData.setLastName(request.getString("usrLastName"));
        userCommonData.setLanguagePref(request.getString("usrLang"));
        
        if(request.getString("usrNotification").equals("NONE")){
            userCommonData.setNotification(NotificationType.NONE);
        } else
            if(request.getString("usrNotification").equals("BOTH")){
                userCommonData.setNotification(NotificationType.BOTH);
            } else if(request.getString("usrNotification").equals("SIP")){
                userCommonData.setNotification(NotificationType.SIP);
            } else if(request.getString("usrNotification").equals("SMS")){
                userCommonData.setNotification(NotificationType.SMS);
            }

        if(request.getString("usrMobilePhoneNumber") != null && !request.getString("usrMobilePhoneNumber").equals("null")){
            userCommonData.setMobilePhoneNumber(request.getString("usrMobilePhoneNumber"));
        } else {
            userCommonData.setMobilePhoneNumber("");
        }
        
        if(request.getString("usrRole").equals("superUser")){
            userCommonData.setRole(RoleType.SUPER_USER);
        } else {
            userCommonData.setRole(RoleType.LIMITED_USER);
        }
        userCommonData.setSubscriberId(request.getString("subscriberId"));

        dbconnection.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userCommonData;
    }


    private static CreateGetEquipmentCommonDataType CreateIapEquipmentCommonData(String boxId) {
        CreateGetEquipmentCommonDataType equipmentCommonData = new CreateGetEquipmentCommonDataType();
        try {
            Connection dbconnection = GetDbConnection();
            Statement sqlstatment = dbconnection.createStatement();
            ResultSet request = sqlstatment.executeQuery("select subscriberId,"
                    + "iapBoxMac,iapBoxName,iapBoxDefUser"
                    + " from IAP_BOX_PROFILE"
                    + " where id='"+boxId+"';");

        equipmentCommonData.setSubscriberId(request.getString("subscriberId"));
        equipmentCommonData.setMacAddress(request.getString("iapBoxMac"));
        equipmentCommonData.setName(request.getString("iapBoxName"));
        if(!request.getString("iapBoxDefUser").equals("null")){
            equipmentCommonData.setDefaultUser(request.getString("iapBoxDefUser"));
        } else {
            equipmentCommonData.setDefaultUser("");
        }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return equipmentCommonData;
    }

/**
 * Creates SubscriberServices, for CREATE subscriber request according to services template
 * readed from configuration.
 *
 * @return SubscriberServicesType
 */
    private static SubscriberServicesType CreateIapSubscriberServices(String iapSubscriberId) {
        SubscriberServicesType iapServices = new SubscriberServicesType();

        try {
            Connection dbconnection = GetDbConnection();
            Statement sqlstatment = dbconnection.createStatement();
            ResultSet request = sqlstatment.executeQuery("select sbsCatchuptv,"
                    + "sbsNetTimeshift,sbsLclTimeshift,sbsLPVR,sbsBcastReminder,"
                    + "sbsNPVR,sbsNPVRQuota,sbsNPVRTTL,sbsRemoteAuth,sbsVOD,"
                    + "sbsVODRentList,sbsVODAuthList,sbsWatsonTV,sbsChannelMngr,"
                    + "sbsChannelMngrLst,sbsChannelPkgLst,sbsReservedUsers,"
                    + "sbsPPV,sbsAccountIdent,sbsAccountImpu,sbsAccountHttpId,"
                    + "sbsProxy,sbsProxyPass,sbsPortalPref,sbsPortalSelector,"
                    + "sbsPortalId,sbsEffectiveFrom,sbsBootstrap"
                    + " from iap_sbs_profile"
                    + " where id='"+iapSubscriberId+"';");

            
            iapServices.setCatchuptv(getCatchupTvService(request.getString("sbsCatchuptv")));
            iapServices.setNetworkTimeshift(getNetworkTimeshiftService(request.getString("sbsNetTimeshift")));
            iapServices.setLocalTimeshift(getLocalTimeshiftService(request.getString("sbsLclTimeshift")));
            iapServices.setLpvr(getLpvrService(request.getString("sbsLPVR")));
            iapServices.setNpvr(getNpvrService(request.getString("sbsNPVR"),request.getString("sbsNPVRQuota"),request.getString("sbsNPVRTTL")));
            if(request.getString("sbsVOD").equals("on")){ 
                iapServices.setVod(getVodService(request.getString("sbsVOD"),request.getString("sbsVODRentList"),request.getString("sbsVODAuthList"),iapSubscriberId));
            }
            iapServices.setWhatsOnTv(getWhatsOnTv(request.getString("sbsWatsonTV")));
            if(request.getString("sbsChannelMngr").equals("on")){
                iapServices.setChannelManager(getChannelManagerService(request.getString("sbsChannelMngr"),request.getString("sbsChannelMngrLst"),request.getString("sbsChannelPkgLst"),iapSubscriberId));
            }
            iapServices.setSubscriberAccountIdentity(getSubscriberAccountIdentityService(request.getString("sbsAccountIdent"),request.getString("sbsAccountImpu"),request.getString("sbsAccountHttpId")));
            iapServices.setIptvProxy(getIptvProxyService(request.getString("sbsProxy"),request.getString("sbsProxyPass")));
            iapServices.setSubscriberPortalPreferences(getSubscriberPortalPreferences(request.getString("sbsPortalPref"),iapSubscriberId));
            iapServices.setPortalSelector(getSubscriberPortalSelector(request.getString("sbsPortalSelector"),request.getString("sbsPortalId"),request.getString("sbsEffectiveFrom")));


           //TODO implement sbsPPV (not used at MCSCOM)
            if(request.getString("sbsPPV").equals("on")){
                iapServices.setPayPerView(null);
            }

            //TODO implement sbsReservedUsers (not used at MCSCOM)
            if(request.getString("sbsReservedUsers").equals("on")){
                iapServices.setReservedUsers(null);
            }

            //TODO implement sbsBcastReminder (not used at MCSCOM)
            if(request.getString("sbsBcastReminder").equals("on")){
                iapServices.setBroadcastReminder(null);
            }

            //TODO implement sbsRemoteAuth (not used at MCSCOM)
            if(request.getString("sbsRemoteAuth").equals("on")){
                iapServices.setRemoteAuthorization(null);
            }


            dbconnection.close();

            } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }

        return iapServices;
    }

/**
 * Used to create CatchupTv section for CREATE and SET messages.
 * In case of SET, allows "on" to enable service and "off" to disable it
 * as a parameter. for CREATE use only "on" option/defferent from "off".
 * @param state on, off
 * @return CatchupTvType
 */
    private static CatchupTvType getCatchupTvService(String state) {
        CatchupTvType iapCatchup = new CatchupTvType();
        if(state.equals("off")){
            iapCatchup.setDelete("true");
        }
        return iapCatchup;
    }

/**
 * Used to create ChannelManager section for CREATE and SET messages.
 * In case of SET, allows "on" to enable service and "off" to disable it
 * as a parameter. for CREATE use only "on" option/defferent from "off".
 * ChannelList and ChannelPackage list are taken from cfg.
 * @param state on, off
 * @return ChannelManagerType
 */
    private static ChannelManagerType getChannelManagerService(String state,String channelList, String pkgList, String iapSubscriberId) throws ClassNotFoundException {
        ChannelManagerType iapChannelManager= new ChannelManagerType();
        if(state.equals("off")){
            iapChannelManager.setDelete("true");
        } else {
          if(channelList.equals("on")){
            ChannelManagerType.ChannelList sbsChannelList = new ChannelManagerType.ChannelList();
            //if Channel list is not empty, perform adding this list to subscriber
            List<String> iapChannelList = getIapChannelList(iapSubscriberId);

                if(iapChannelList.size()>0){
                    for(int i=0; i<iapChannelList.size(); i++){
                        ChannelManagerType.ChannelList.Channel iapChannel = new ChannelManagerType.ChannelList.Channel();
                        iapChannel.setId(iapChannelList.get(i));
                        iapChannel.setVariant(null);
                        sbsChannelList.getChannel().add(iapChannel);
                    }
                 }
            iapChannelManager.setChannelList(sbsChannelList);
          } else {
              iapChannelManager.getChannelList().setDelete(Boolean.TRUE);
          }


          if(pkgList.equals("on")){
              //if Channel Package is provided, provision it to subscriber
              ChannelManagerType.ChannelPackageList iapChannelPackageList = new ChannelManagerType.ChannelPackageList();
              List<String> iapChPkgList = getIapChannelPkgList(iapSubscriberId);
            
            if(iapChPkgList.size()>0){
                for(int i=0; i<iapChPkgList.size(); i++){
                    ChannelManagerType.ChannelPackageList.ChannelPackage iapChannelPackage = new ChannelManagerType.ChannelPackageList.ChannelPackage();
                    iapChannelPackage.setId(iapChPkgList.get(i));
                    iapChannelPackageList.getChannelPackage().add(iapChannelPackage);
                }
              }
            iapChannelManager.setChannelPackageList(iapChannelPackageList);
            }
        }
        return iapChannelManager;
    }

/**
 * Used to create iptvproxy section for CREATE and SET messages.
 * In case of SET, allows "on" to enable service and "off" to disable it
 * as a parameter. for CREATE use only "on" option/defferent from "off"
 * @param state on, off
 * @return IptvProxyType
 */
    private static IptvProxyType getIptvProxyService(String state, String password) {
        IptvProxyType iapIptvProxy = new IptvProxyType();
        if(state.equals("off")){
            iapIptvProxy.setDelete("true");
        } else {
                 iapIptvProxy.setIptvProxyPassword(password);
        }

     return iapIptvProxy;
    }

/**
 * Used to create iptvproxy section for CREATE and SET messages.
 * In case of SET, allows "on" to enable service and "off" to disable it
 * as a parameter. for CREATE use only "on" option/defferent from "off"
 * @param state on, off
 * @return IptvProxyType
 */
    private static SubscriberAccountIdentityType getSubscriberAccountIdentityService(String state, String impu, String httpId) {
        SubscriberAccountIdentityType iapSubscriberAccountIdentity = new SubscriberAccountIdentityType();
        if(state.equals("off")){
          iapSubscriberAccountIdentity.setDelete("true");
        } else {
           if(!httpId.equals("null")){
                iapSubscriberAccountIdentity.setHttpAuthenticationId(httpId);
           }
           if(!impu.equals("null")){
                iapSubscriberAccountIdentity.setImpu("sip:"+impu);
            }
           //TODO add logic to check suplied parameters Impu||HttpAuthenticationId
        }
        return iapSubscriberAccountIdentity;
    }

/**
 * Used to create Vod section for CREATE and SET messages.
 * In case of SET, allows "on" to enable service and "off" to disable it
 * as a parameter. for CREATE use only "on" option/defferent from "off"
 * @param state on, off
 * @return VodType
 */
    private static VodType getVodService(String state,String rentalList, String sVOD, String iapSubscriberId) throws ClassNotFoundException {
        VodType iapVodService = new VodType();
        if(state.equals("off")){
           iapVodService.setDelete("true");
        } else {
        //if rentallist is set
       if(rentalList.equals("on")){
           VodType.ModStreamRentalList iapVodRentalList = new VodType.ModStreamRentalList();
           //if VOD title for rentalList is set, get array of VOD titles and form rented list
           List<String> vodTitles = new ArrayList<String>();
           vodTitles = GetVodTiteles(iapSubscriberId);

           if(vodTitles.size()>0){
            for(int i=0; i<vodTitles.size(); i++){
              VodType.ModStreamRentalList.VodTitle iapVodRentalListTitle =new VodType.ModStreamRentalList.VodTitle();
              iapVodRentalListTitle.setId(vodTitles.get(i));
              iapVodRentalList.getVodTitle().add(iapVodRentalListTitle);
            }  
           } 
             QName qnm = new QName("http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/", "modStreamRentalList ");
             JAXBElement<VodType.ModStreamRentalList> JvodRent = new JAXBElement<VodType.ModStreamRentalList>(qnm, VodType.ModStreamRentalList.class, iapVodRentalList);
             iapVodService.setModStreamRentalList(JvodRent);
        }

        //if VOD authorizationList is set
        if(sVOD.equals("on")){
            VodType.SvodStreamAuthorizationList iapSvodStreamAuthorizationList = new VodType.SvodStreamAuthorizationList();
            List<String> svodTitles = new ArrayList<String>();
            svodTitles = GetsVodTiteles(iapSubscriberId);
            
            if(svodTitles.size()>0){
                for(int i=0; i<svodTitles.size(); i++){
                    VodType.SvodStreamAuthorizationList.Svod iapAuthorizationListSvodTitle = new VodType.SvodStreamAuthorizationList.Svod();
                    iapAuthorizationListSvodTitle.setId(svodTitles.get(i));
                    iapSvodStreamAuthorizationList.getSvod().add(iapAuthorizationListSvodTitle);
                }
            }
            
            QName qnm = new QName("http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/", "svodStreamAuthorizationList ");
            JAXBElement<VodType.SvodStreamAuthorizationList> JvodAuth = new JAXBElement<VodType.SvodStreamAuthorizationList>(qnm,  VodType.SvodStreamAuthorizationList.class, iapSvodStreamAuthorizationList);
            iapVodService.setSvodStreamAuthorizationList(JvodAuth);
        }
    
   }
  return iapVodService;
}

/**
 * Used to create Npvr section for CREATE and SET messages.
 * In case of SET, allows "on" to enable service and "off" to disable it
 * as a parameter. for CREATE use only "on" option/defferent from "off"
 * @param state on, off
 * @return NpvrType
 */
    private static NpvrType getNpvrService(String state,String Quota, String TTL) {
        NpvrType iapNpvrService = new NpvrType();
        if(state.equals("off")){
            iapNpvrService.setDelete("true");
        } else {
            iapNpvrService.setQuota(BigInteger.valueOf(Integer.valueOf(Quota)));
            iapNpvrService.setRecordingTimeToLive(BigInteger.valueOf(Integer.valueOf(TTL)));
        }
        return iapNpvrService;
    }

/**
 * Used to create NetworkTimeshift section for CREATE and SET messages.
 * In case of SET, allows "on" to enable service and "off" to disable it
 * as a parameter. for CREATE use only "on" option/defferent from "off"
 * @param state on, off
 * @return NetworkTimeshiftType
 */
    private static NetworkTimeshiftType getNetworkTimeshiftService(String state) {
        NetworkTimeshiftType iapNetworkTimeshift = new NetworkTimeshiftType();
        if(state.equals("off")){
            iapNetworkTimeshift.setDelete("true");
        }
        return iapNetworkTimeshift;
    }

/**
 * Used to create LocalTimeshift section for CREATE and SET messages.
 * In case of SET, allows "on" to enable service and "off" to disable it
 * as a parameter. for CREATE use only "on" option/defferent from "off"
 * @param state on, off
 * @return LocalTimeshiftType
 */
    private static LocalTimeshiftType getLocalTimeshiftService(String state) {
        LocalTimeshiftType iapLocalTimeshift = new LocalTimeshiftType();
        if(state.equals("off")){
            iapLocalTimeshift.setDelete("true");
        }
        return iapLocalTimeshift;
    }

/**
 * Used to create Lpvr section for CREATE and SET messages.
 * In case of SET, allows "on" to enable service and "off" to disable it
 * as a parameter. for CREATE use only "on" option/defferent from "off"
 * @param state on, off
 * @return LpvrType
 */
    private static LpvrType getLpvrService(String state) {
        LpvrType iapLpvr = new LpvrType();
        if(state.equals("off")){
            iapLpvr.setDelete("true");
        }
        return iapLpvr;
    }


    private static WhatsOnTvType getWhatsOnTv(String state) {
        WhatsOnTvType iapWhatsOnTv = new WhatsOnTvType();
        if(state.equals("off")){
            iapWhatsOnTv.setDelete("true");
        }
        return iapWhatsOnTv;

    }

    private static PortalSelectorType getSubscriberPortalSelector(String state, String portalName, String Effective) {
        PortalSelectorType iapPortalSelector = new PortalSelectorType();
        if(state.equals("off")){
            iapPortalSelector.setDelete("true");
        } else {

            //Cut off time and zone from subscriber createin time
            int startInd = 0;
            int endInd = 0;
            endInd = Effective.indexOf("T");
            Effective = Effective.substring(startInd, endInd);
            //DateTime dt = DateTime.Parse(Effective);
            Date dt = Date.valueOf(Effective);
           
            iapPortalSelector.setPortalId("portal");
            XMLGregorianCalendar date = new XMLGregorianCalendarImpl();
            

            date = date2Gregorian(dt);
            iapPortalSelector.setEffectiveFrom(date);
        }
        return iapPortalSelector;

    }

    /**
* Transform a date in a long to a GregorianCalendar
*
* @param date
* @return
*/
public static XMLGregorianCalendar long2Gregorian(long date) {
DatatypeFactory dataTypeFactory;
try {
dataTypeFactory = DatatypeFactory.newInstance();
} catch (DatatypeConfigurationException e) {
throw new RuntimeException(e);
}
GregorianCalendar gc = new GregorianCalendar();
gc.setTimeInMillis(date);
return dataTypeFactory.newXMLGregorianCalendar(gc);
}

/**
* Transform a date in Date to XMLGregorianCalendar
*/
public static XMLGregorianCalendar date2Gregorian(Date date) {
return long2Gregorian(date.getTime());
}


    private static SubscriberPortalPreferencesType getSubscriberPortalPreferences(String state,String iapSubscriberId) throws ClassNotFoundException {
        SubscriberPortalPreferencesType sbsPrortalPref = new SubscriberPortalPreferencesType();
        if(state.equals("off")){
            sbsPrortalPref.setDelete("true");
        } else {
            List<iapSbsPortalPref> iapPortalPref = getSbsPortalPrefList(iapSubscriberId);
            SubscriberPortalPreferencesType.Preference portalPreference = new SubscriberPortalPreferencesType.Preference();
            for(int i=0; i<iapPortalPref.size(); i++){
                portalPreference.setName(iapPortalPref.get(i).iapPortalPrefName);
                portalPreference.setValue(iapPortalPref.get(i).iapPortalPrefValue);
                sbsPrortalPref.getPreference().add(portalPreference);
            }


        }
        return sbsPrortalPref;
    }




    private static List<IapEquipment> getIapEquipmentList(String equipmentListFile) {
        List<IapEquipment> iapEquipmentList = new ArrayList<IapEquipment>();
                File file = new File(equipmentListFile);
     try{
            Reader bufread = new InputStreamReader(new FileInputStream(file),"UTF8");
            BufferedReader dis = new BufferedReader(bufread);

     while (dis.ready()) {
        IapEquipment equipment = new IapEquipment();
        String input = dis.readLine();
        String[] params = input.split("\t");
        equipment.EquipmentId = params[0];
        equipment.EquipmentName = params[2];
        equipment.MacAddress = params[1];
        equipment.SubscriberId = params[3];
        equipment.DefaultUser = params[4];
        equipment.ServicesTemplate = params[5];
        equipment.PlainBootstrapId = params[6];
        equipment.PlainBootstarpPwd = params[7];

        iapEquipmentList.add(equipment);
      }

      // dispose all the resources after using them.

      dis.close();

    } catch (FileNotFoundException e) {
        System.out.println("Fiele not found error: "+e);
    } catch (IOException e) {
        System.out.println("IO exception error: "+e);
    }
        return iapEquipmentList;
    }



    private static UserServicesType CreateIapUserServices(String iapUserId) {
        UserServicesType iapUserServices = new UserServicesType();
        UserPortalPreferencesType iapPortalPref = getUsrPortalPrefList(iapUserId);
        iapUserServices.setUserPortalPreferences(iapPortalPref);

        try{
            Connection dbconnection = GetDbConnection();
            Statement sqlstatment = dbconnection.createStatement();
            ResultSet request = sqlstatment.executeQuery("select usrChargingId,"
                    + "usrImpu"
                    + " from IAP_USR_PROFILE"
                    + " where id='"+iapUserId+"';");
            
        if(request.getString("usrChargingId") != null){
            iapUserServices.setCharging(getUserChargingIdService(request.getString("usrChargingId")));
        }

        if(request.getString("usrImpu") != null && !request.getString("usrImpu").equals("null")){
            iapUserServices.setUserAccountIdentity(getUserAccauntIdService(request.getString("usrImpu")));
        }


        dbconnection.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return iapUserServices;
    }
    
     private static EquipmentServicesType CreateIapEquipmentServices(String boxId) {
         EquipmentServicesType iapEquipmentServices = new EquipmentServicesType();
         try{
            Connection dbconnection = GetDbConnection();
            Statement sqlstatment = dbconnection.createStatement();
            ResultSet request = sqlstatment.executeQuery("select portalPref,"
                    + "plainBootstrap,imsBootstrap"
                    + " from IAP_BOX_PROFILE"
                    + " where id='"+boxId+"';");


         if(request.getString("imsBootstrap").equals("on")){
            iapEquipmentServices.setImsBootstrap(getEquipmentImsBootstrap()); 
         }
         
         if(request.getString("plainBootstrap").equals("on")){
             iapEquipmentServices.setPlainBootstrap(getEquipmentPlainBootstrap(boxId));
         }
         
         if(request.getString("portalPref").equals("on")){
             iapEquipmentServices.setPlainBootstrap(getEquipmentPortalPreferences(boxId));
         }


        dbconnection.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return iapEquipmentServices;
    }

/**
 * Common method for create User, Equipment and Subscriber
 * @param iapCreateDocument
 */
    private static void iapCreateProvisioning(CreateDocument iapCreateDocument) {
        ProvisioningEndpointSlsbService iapProvisioningService = new ProvisioningEndpointSlsbService();
        Provisioning iapProvisioning = iapProvisioningService.getProvisioningEndpointSlsbPort();
     
        /*
        try {
  
            JAXBContext jciapSbsSubsType = JAXBContext.newInstance(CreateSubscriber.class);
            Marshaller m = jciapSbsSubsType.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            m.marshal(iapCreateDocument.iapMoAttributes.getCreateSubscriber(), System.out);



        
        } catch (JAXBException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
         */  
        
        
        try {
            iapProvisioning.create(iapCreateDocument.iapMoType, iapCreateDocument.iapMoId, iapCreateDocument.iapMoAttributes, iapCreateDocument.iapSessionCred.sessionId, iapCreateDocument.iapSessionCred.sequenceId, null, null);
        } catch (iap.soapprovisioning.Cai3GFaultException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static ChargingType getUserChargingIdService(String usrChargingId) {
        ChargingType iapCharging = new ChargingType();
        iapCharging.setChargingId(usrChargingId);
    return iapCharging;
    }

    private static UserAccountIdentityType getUserAccauntIdService(String usrImpu) {
        UserAccountIdentityType iapAccountIdentity = new  UserAccountIdentityType();
        iapAccountIdentity.setImpu(usrImpu);
    return iapAccountIdentity;
    }

    private static PlainBootstrapType getEquipmentPortalPreferences(String boxId) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private static PlainBootstrapType getEquipmentPlainBootstrap(String boxId) {
        PlainBootstrapType iapPlainBootstrap = new PlainBootstrapType();
        try{
            Connection dbconnection = GetDbConnection();
            Statement sqlstatment = dbconnection.createStatement();
            ResultSet request = sqlstatment.executeQuery("select BlockedState,"
                    + "deviceSettings,authenticationId,authenticationPwd,"
                    + "noAuthentication,simplePwdAuthPass"
                    + " from IAP_BOX_PROFILE"
                    + " where id='"+boxId+"';");

            
        String forceBootstrap = mainProp.getProperty("com.ericsson.soapprovisioning.forceBootstrap"); 
        
        if(request.getString("BlockedState").equals("false") || forceBootstrap.equals("true")){
            iapPlainBootstrap.setBlocked(Boolean.FALSE);
        } else {
            iapPlainBootstrap.setBlocked(Boolean.TRUE);    
        }
        
        
        
        if(request.getString("deviceSettings").equals("on")){
            PlainBootstrapType.DeviceSettings deviceSettings = new PlainBootstrapType.DeviceSettings();
                PlainBootstrapType.DeviceSettings.Authentication authetication = new PlainBootstrapType.DeviceSettings.Authentication();

                authetication.setId(request.getString("authenticationId"));
                authetication.setPassword(request.getString("authenticationPwd"));
                deviceSettings.setAuthentication(authetication);
                iapPlainBootstrap.setDeviceSettings(deviceSettings);
        }
         if(request.getString("noAuthentication").equals("on")){
            PlainBootstrapType.NoAuthentication noAuth = new PlainBootstrapType.NoAuthentication();
            iapPlainBootstrap.setNoAuthentication(noAuth);
         }

         if(!request.getString("simplePwdAuthPass").equals("null")){
            PlainBootstrapType.SimplePasswordAuthentication simplePwd = new PlainBootstrapType.SimplePasswordAuthentication();
            simplePwd.setPassword(request.getString("simplePwdAuthPass"));
            iapPlainBootstrap.setSimplePasswordAuthentication(simplePwd);
         }


        dbconnection.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

      

    return iapPlainBootstrap;
    }

    private static ImsBootstrapType getEquipmentImsBootstrap() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private static void Set(MOId boxMoId, MoType iapMO,SetMoAttributes boxMOAttr, IapSessionCred iapSessionCred) {
        

        ProvisioningEndpointSlsbService iapProvisioningService = new ProvisioningEndpointSlsbService();
        Provisioning iapProvisioning = iapProvisioningService.getProvisioningEndpointSlsbPort();

        try {
            iapProvisioning.set(iapMO, boxMoId,boxMOAttr, iapSessionCred.sessionId, iapSessionCred.sequenceId, null, null);
        } catch (iap.soapprovisioning.Cai3GFaultException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private static void Delete(Holder<MOId> MOIdHolder, MoType iapMO, IapSessionCred iapSessionCred) {

        Delete.MOAttributes DelMoAttr = new Delete.MOAttributes();


        ProvisioningEndpointSlsbService iapProvisioningService = new ProvisioningEndpointSlsbService();
        Provisioning iapProvisioning = iapProvisioningService.getProvisioningEndpointSlsbPort();

        try {
            iapProvisioning.delete(iapMO, MOIdHolder,null, iapSessionCred.sessionId, iapSessionCred.sequenceId, null, null);
        } catch (iap.soapprovisioning.Cai3GFaultException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    

/**
 * Retrive subscriber list from local sqlite database, Cleanup database for new export
 * @return List<String> subscriberList
 * @throws ClassNotFoundException
 */
    private static List<String> GetSubscribersIdList() throws ClassNotFoundException{
        List<String> subscribersList = new ArrayList<String>();
    //Get connection and retrive subscribers list
    //this list need to be prepared
        try {
          Connection dbconnection = GetDbConnection();
          Statement sqlstatment = dbconnection.createStatement();
          ResultSet request = sqlstatment.executeQuery("select * from iap_subscribers_list;");
          while (request.next()){
              subscribersList.add(request.getString("id"));
          }
          dbconnection.close();

        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

       return subscribersList;
    }

     private static List<String> GetUsersIdList() throws ClassNotFoundException{
        List<String> usersList = new ArrayList<String>();
    //Get connection and retrive users list
    //this list need to be prepared
        try {
          Connection dbconnection = GetDbConnection();
          Statement sqlstatment = dbconnection.createStatement();
          ResultSet request = sqlstatment.executeQuery("select * from iap_sbs_users;");
          while (request.next()){
              usersList.add(request.getString("userId"));
          }
          dbconnection.close();

        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

       return usersList;
    }
    private static List<String> GetEquipmentIdList() throws ClassNotFoundException{
        List<String> boxList = new ArrayList<String>();
    //Get connection and retrive users list
    //this list need to be prepared
        try {
          Connection dbconnection = GetDbConnection();
          Statement sqlstatment = dbconnection.createStatement();
          ResultSet request = sqlstatment.executeQuery("select * from IAP_SBS_EQUIPMENT;");
          while (request.next()){
              boxList.add(request.getString("equipmentId"));
          }
          dbconnection.close();

        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

       return boxList;
    }

    private static Connection GetDbConnection() throws ClassNotFoundException {
        String database  = mainProp.getProperty("com.ericsson.soapprovisioning.sqlite.dbfile");
        Class.forName("org.sqlite.JDBC");
        Connection dbconnection = null;
        try {
            dbconnection = DriverManager.getConnection("jdbc:sqlite:" + database);

        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dbconnection;

    }

    private static List<String> GetVodTiteles(String iapSubscriberId) throws ClassNotFoundException {
        List<String> VodList = new ArrayList<String>();
        String useMapping = mainProp.getProperty("com.ericsson.soapprovisioning.openstream.mapOfferings");

        if(useMapping.equals("true")){
            try {
                Connection dbconnection = GetDbConnection();
                Statement sqlstatment = dbconnection.createStatement();
                ResultSet request = sqlstatment.executeQuery("select newVodTitleId "+
                        "from ops_vod_offering_map where oldVodTitleId in "+
                        "(select sbsVodTitleId from iap_sbs_vod_rentallist "+
                        "where id='"+iapSubscriberId+"');");
                while (request.next()){
                    VodList.add(request.getString("newVodTitleId"));
            }

            } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {

            try {
                Connection dbconnection = GetDbConnection();
                Statement sqlstatment = dbconnection.createStatement();
                ResultSet request = sqlstatment.executeQuery("select sbsVodTitleId "
                        + "from iap_sbs_vod_rentallist "
                        + "where id='"+iapSubscriberId+"';");
                while (request.next()){
                    VodList.add(request.getString("sbsVodTitleId"));
            }

            } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return VodList;
    }

    private static List<String> GetsVodTiteles(String iapSubscriberId) throws ClassNotFoundException {
        List<String> sVodList = new ArrayList<String>();
            try {
                Connection dbconnection = GetDbConnection();
                Statement sqlstatment = dbconnection.createStatement();
                ResultSet request = sqlstatment.executeQuery("select sbsVodTitleId "
                        + "from iap_sbs_svod_rentallist "
                        + "where id='"+iapSubscriberId+"';");
                while (request.next()){
                    sVodList.add(request.getString("sbsVodTitleId"));
            }

            } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sVodList;
    }

    private static List<String> getIapChannelList(String iapSubscriberId) throws ClassNotFoundException {
        List<String> channelList = new ArrayList<String>();
            try {
                Connection dbconnection = GetDbConnection();
                Statement sqlstatment = dbconnection.createStatement();
                ResultSet request = sqlstatment.executeQuery("select sbsChannelId,"
                        + "sbsChannelVar "
                        + "from iap_sbs_channelslist "
                        + "where id='"+iapSubscriberId+"';");
                while (request.next()){
                    channelList.add(request.getString("sbsChannelId"));
            }

            } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return channelList;
    }

    private static List<String> getIapChannelPkgList(String iapSubscriberId) throws ClassNotFoundException {
        List<String> channelPkgList = new ArrayList<String>();
            try {
                Connection dbconnection = GetDbConnection();
                Statement sqlstatment = dbconnection.createStatement();
                ResultSet request = sqlstatment.executeQuery("select sbsChannelPkg "
                        + "from iap_sbs_channelPkg "
                        + "where id='"+iapSubscriberId+"';");
                while (request.next()){
                    channelPkgList.add(request.getString("sbsChannelPkg"));
            }

            } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return channelPkgList;
    }

    private static List<iapSbsPortalPref> getSbsPortalPrefList(String iapSubscriberId) throws ClassNotFoundException {
        List<iapSbsPortalPref> iapPrefList = new ArrayList<iapSbsPortalPref>();
        iapSbsPortalPref iapPreference = new iapSbsPortalPref();
            try {
                Connection dbconnection = GetDbConnection();
                Statement sqlstatment = dbconnection.createStatement();
                ResultSet request = sqlstatment.executeQuery("select sbsPrefName,"
                        + "sbsPrefValue "
                        + "from iap_sbs_portalpref "
                        + "where id='"+iapSubscriberId+"';");
                while (request.next()){
                    iapPreference.iapPortalPrefName = request.getString("sbsPrefName");
                    iapPreference.iapPortalPrefValue = request.getString("sbsPrefValue");
                    iapPrefList.add(iapPreference);
            }

            } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return iapPrefList;
    }

    private static UserPortalPreferencesType getUsrPortalPrefList(String iapUserId) {
        UserPortalPreferencesType userPref = new UserPortalPreferencesType();
        UserPortalPreferencesType.Preference userPortalPref = new UserPortalPreferencesType.Preference();
        try{
            Connection dbconnection = GetDbConnection();
            Statement sqlstatment = dbconnection.createStatement();
            ResultSet request = sqlstatment.executeQuery("select usrPrefName,"
                    + "usrPrefValue"
                    + " from IAP_USR_PORTALPREF "
                    + " where id='"+iapUserId+"';");

            while(request.next()){
                userPortalPref.setName(request.getString("usrPrefName"));
                userPortalPref.setValue(request.getString("usrPrefValue"));
                userPref.getPreference().add(userPortalPref);
            }

                    dbconnection.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userPref;

    }

    private static void DeleteIapEquipment(IapSessionCred iapSessionCred) {
        try {
            List<String> boxList = GetEquipmentIdList();
            MoType iapMO = MoType.EQUIPMENT_HTTP_CAI_3_G_IAP_IPTV_ERICSSON_COM_IPTV_PROVISIONING_EQUIPMENT;
            for (int i = 0; i < boxList.size(); i++) {
                iapSessionCred.GetNextSequenceId();
                Holder<MOId> MOIdHolder = new Holder<MOId>();
                MOIdHolder.value = new MOId();
                MOIdHolder.value.setEquipmentId(boxList.get(i));
                System.out.println("Del:"+boxList.get(i));
                Delete(MOIdHolder, iapMO, iapSessionCred);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void DeleteIapUsers(IapSessionCred iapSessionCred) {
        try {
            List<String> usersList = GetUsersIdList();
            MoType iapMO = MoType.USER_HTTP_CAI_3_G_IAP_IPTV_ERICSSON_COM_IPTV_PROVISIONING_USER;
            for (int i = 0; i < usersList.size(); i++) {
                iapSessionCred.GetNextSequenceId();
                Holder<MOId> MOIdHolder = new Holder<MOId>();
                MOIdHolder.value = new MOId();
                MOIdHolder.value.setUserId(usersList.get(i));
                System.out.println("Del:"+usersList.get(i));
                Delete(MOIdHolder, iapMO, iapSessionCred);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void DeleteIapSubscribers(IapSessionCred iapSessionCred) {
       try {
            List<String> subsList = GetSubscribersIdList();
            MoType iapMO = MoType.SUBSCRIBER_HTTP_CAI_3_G_IAP_IPTV_ERICSSON_COM_IPTV_PROVISIONING_SUBSCRIBER;
            for (int i = 0; i < subsList.size(); i++) {
                iapSessionCred.GetNextSequenceId();
                Holder<MOId> MOIdHolder = new Holder<MOId>();
                MOIdHolder.value = new MOId();
                MOIdHolder.value.setSubscriberId(subsList.get(i));
                System.out.println("Del:"+subsList.get(i));
                Delete(MOIdHolder, iapMO, iapSessionCred);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void SetBootstrapAllEquipment(IapSessionCred iapSessionCred) {
        try {
            List<String> boxList = GetEquipmentIdList();
            MoType iapMO = MoType.EQUIPMENT_HTTP_CAI_3_G_IAP_IPTV_ERICSSON_COM_IPTV_PROVISIONING_EQUIPMENT;
            for (int i = 0; i < boxList.size(); i++) {
                iapSessionCred.GetNextSequenceId();
                MOId boxMoId = new MOId();
                SetMoAttributes boxMOAttr = new SetMoAttributes();
                SetEquipment iapBox = new SetEquipment();
                
                EquipmentServicesType iapEquipmentServices = new EquipmentServicesType();
                PlainBootstrapType iapPlainBootstrap = new PlainBootstrapType();
                iapPlainBootstrap.setBlocked(Boolean.FALSE);
                iapEquipmentServices.setPlainBootstrap(iapPlainBootstrap);
                
                iapBox.setEquipmentId(boxList.get(i));
                iapBox.setServices(iapEquipmentServices);
                boxMoId.setEquipmentId(boxList.get(i));
                
                boxMOAttr.setSetEquipment(iapBox);
                System.out.println("Set bootstrap:"+boxList.get(i));
               
                Set(boxMoId, iapMO, boxMOAttr, iapSessionCred);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

 }

