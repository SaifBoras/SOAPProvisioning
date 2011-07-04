/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package soapprovisioning;


import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import iap.sessioncontrol.Cai3GFaultException;
import iap.soapprovisioning.MOId;
import iap.sessioncontrol.SessionControlEndpointSlsbService;
import iap.sessioncontrol.SessionControl;
import iap.soapprovisioning.ChargingType;
import iap.soapprovisioning.CreateGetEquipmentCommonDataType;

import iap.soapprovisioning.CreateSubscriber;
import iap.soapprovisioning.CreateUserCommonDataType;
import iap.soapprovisioning.EquipmentServicesType;
import iap.soapprovisioning.ImsBootstrapType;
import iap.soapprovisioning.LocalTimeshiftType;
import iap.soapprovisioning.LpvrType;
import iap.soapprovisioning.NetworkTimeshiftType;
import iap.soapprovisioning.NpvrType;
import iap.soapprovisioning.PlainBootstrapType;
import iap.soapprovisioning.PortalSelectorType;
import iap.soapprovisioning.ProvisioningEndpointSlsbService;
import iap.soapprovisioning.BlockedStateType;
import iap.soapprovisioning.CatchupTvType;
import iap.soapprovisioning.ChannelManagerType;
import iap.soapprovisioning.CreateEquipment;
import iap.soapprovisioning.CreateSubscriberCommonDataType;
import iap.soapprovisioning.CreateUser;
import iap.soapprovisioning.Delete;
import iap.soapprovisioning.IptvProxyType;
import iap.soapprovisioning.Provisioning;
import iap.soapprovisioning.MoType;
import iap.soapprovisioning.NotificationType;
import iap.soapprovisioning.RoleType;
import iap.soapprovisioning.SetMoAttributes;
import iap.soapprovisioning.SetSubscriber;
import iap.soapprovisioning.SetSubscriberCommonDataType;
import iap.soapprovisioning.SubscriberAccountIdentityType;
import iap.soapprovisioning.SubscriberPortalPreferencesType;
import iap.soapprovisioning.SubscriberServicesType;
import iap.soapprovisioning.UserAccountIdentityType;
import iap.soapprovisioning.UserServicesType;
import iap.soapprovisioning.VodType;
import iap.soapprovisioning.VodType.AuthorizationList;
import iap.soapprovisioning.VodType.RentalList;
import iap.soapprovisioning.WhatsOnTvType;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.ws.Holder;

/**
 *
 * @author Igor Korsun
 */
public class Main {
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
        Properties mainProp = new Properties();

        //Load main properties
        mainProp = getServicesTemplates(PropFileName);

        //Load subscriber services templates
        String ServicesTemplateLocation = mainProp.getProperty("com.ericsson.soapprovisioning.subscriber.ServicesTemplateFile");
        System.out.println(ServicesTemplateLocation);
        SubscriberSvcTemplates = getServicesTemplates(ServicesTemplateLocation);

        //Load User services templates
        ServicesTemplateLocation = mainProp.getProperty("com.ericsson.soapprovisioning.user.ServicesTemplateFile");
        UserSvcTemplates = getServicesTemplates(ServicesTemplateLocation);


        ServicesTemplateLocation = mainProp.getProperty("com.ericsson.soapprovisioning.equipment.ServicesTemplateFile");
        EquipmentServices = getServicesTemplates(ServicesTemplateLocation);

       CreateIapAccaunts(mainProp);

       //TestSet();
       //TestDelete();
    }
/**
 * 1. Creates subscribers
 * 2. Creates users
 * 3. Provision STB hardware
 * 4. Set subscriber additional parameters
 */
    private static void CreateIapAccaunts(Properties mainProp) {


        String cai3gUser = mainProp.getProperty("com.ericsson.soapprovisioning.cai3g.user");
        String cai3gPwd  = mainProp.getProperty("com.ericsson.soapprovisioning.cai3g.pwd");
        String subscribersListFile = mainProp.getProperty("com.ericsson.soapprovisioning.SubscribersListFile");
        String usersListFile = mainProp.getProperty("com.ericsson.soapprovisioning.UsersListFile");
        String equipmentListFile = mainProp.getProperty("com.ericsson.soapprovisioning.EquipmentFile");
        //Get access credentials
        IapSessionCred iapSessionCred = new IapSessionCred();
        iapSessionCred = IapSessionLogin(cai3gUser,cai3gPwd);

        //createSubscribers
        List<IapSubscriber> iapSubscribersList = getIapSubscribersList(subscribersListFile);
        List<IapUser> iapUsersList = getIapUsersList(usersListFile);
        List<IapEquipment> iapEquipmentList = getIapEquipmentList(equipmentListFile);

        for(int i=0; i<iapSubscribersList.size(); i++){
            iapSubscriber = iapSubscribersList.get(i);
            iapSessionCred.GetNextSequenceId();
            CreateIapSubscriber(iapSessionCred);
            System.out.println(iapSubscribersList.get(i).SubscriberId);
        }
       // TODO Implement CreateIapUser
        for(int i=0; i<iapUsersList.size(); i++){
            iapUser = iapUsersList.get(i);
            iapSessionCred.GetNextSequenceId();
            CreateIapUser(iapSessionCred);
            System.out.println("User "+iapUser.FirstName+" for Subscriber "+iapUser.refSubscriberId);
        }
/**/
        // TODO Implement CreateIapHardware
        for(int i=0; i<iapEquipmentList.size(); i++){
           iapEquipment = iapEquipmentList.get(i);
           iapSessionCred.GetNextSequenceId();
           CreateIapEquipment(iapSessionCred);
           System.out.println("Stb "+iapEquipment.EquipmentId+" for Subscriber "+iapEquipment.SubscriberId);
        }
        // TODO Implement SetSubscriberParameters
           for(int i=0; i<iapEquipmentList.size(); i++){
           iapEquipment = iapEquipmentList.get(i);
           iapSessionCred.GetNextSequenceId();
           System.out.println("Stb "+iapEquipment.EquipmentId+" for Subscriber "+iapEquipment.SubscriberId+ " is deleted");
           TestDelete(iapSessionCred);
           
        }
 
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

    private static void CreateIapSubscriber(IapSessionCred iapSessionCred) {

        CreateSubscriber iapNewSbs = new CreateSubscriber();

        iapNewSbs.setSubscriberId(iapSubscriber.SubscriberId);
        iapNewSbs.setCreateSubscriberIdattribute(iapSubscriber.SubscriberId);
        iapNewSbs.setCommonData(CreateIapSubscriberCommonData());
        iapNewSbs.setServices(CreateIapSubscriberServices());

        CreateDocument iapCreateDocument = new CreateDocument();
        iapCreateDocument.setIapSubscriberMoId(iapSubscriber.SubscriberId);
        iapCreateDocument.setIapSubscriberMoAttributes(iapNewSbs);
        iapCreateDocument.iapMoType = MoType.SUBSCRIBER_HTTP_CAI_3_G_IAP_IPTV_ERICSSON_COM_IPTV_PROVISIONING_SUBSCRIBER;
        iapCreateDocument.iapSessionCred = iapSessionCred;

        iapCreateProvisioning(iapCreateDocument);
    }


    private static void CreateIapUser(IapSessionCred iapSessionCred) {

        CreateUser iapNewUser = new CreateUser();

        iapNewUser.setUserId(iapUser.UserId);
        iapNewUser.setCreateUserIdattribute(iapUser.UserId);
        iapNewUser.setCommonData(CreateIapUserCommonData());
        iapNewUser.setServices(CreateIapUserServices());

        CreateDocument iapCreateDocument = new CreateDocument();
        iapCreateDocument.setIapUserMoId(iapUser.UserId);
        iapCreateDocument.setUserMoAttributes(iapNewUser);
        iapCreateDocument.iapMoType = MoType.USER_HTTP_CAI_3_G_IAP_IPTV_ERICSSON_COM_IPTV_PROVISIONING_USER;
        iapCreateDocument.iapSessionCred = iapSessionCred;

        iapCreateProvisioning(iapCreateDocument);
    }


        private static void CreateIapEquipment(IapSessionCred iapSessionCred) {

            CreateEquipment iapNewEquipment = new CreateEquipment();

            iapNewEquipment.setEquipmentId(iapEquipment.EquipmentId);
            iapNewEquipment.setCreateEquipmentIdattribute(iapEquipment.EquipmentId);
            iapNewEquipment.setCommonData(CreateIapEquipmentCommonData());
            iapNewEquipment.setServices(CreateIapEquipmentServices());


            CreateDocument iapCreateDocument = new CreateDocument();
            iapCreateDocument.setIapEquipmentMoId(iapEquipment.EquipmentId);
            iapCreateDocument.setEquipmentMoAttributes(iapNewEquipment);
            iapCreateDocument.iapMoType = MoType.EQUIPMENT_HTTP_CAI_3_G_IAP_IPTV_ERICSSON_COM_IPTV_PROVISIONING_EQUIPMENT;
            iapCreateDocument.iapSessionCred = iapSessionCred;

            iapCreateProvisioning(iapCreateDocument);

    }



    private static CreateSubscriberCommonDataType CreateIapSubscriberCommonData() {

        CreateSubscriberCommonDataType subscriberCommonData = new CreateSubscriberCommonDataType();
        BlockedStateType iapSbsState = new BlockedStateType();
        if(iapSubscriber.BlockState.equals("true")){
            iapSbsState.setUnBlocked("true");
        }
        subscriberCommonData.setBlockedState(iapSbsState);
        subscriberCommonData.setPostalCode(iapSubscriber.PostalCode);
        subscriberCommonData.setServiceRegion(iapSubscriber.ServiceRegion);
        return subscriberCommonData;
    }


    private static CreateUserCommonDataType CreateIapUserCommonData() {
        CreateUserCommonDataType userCommonData = new CreateUserCommonDataType();
        userCommonData.setAllowedRating(iapUser.Raiting);
        userCommonData.setFirstName(iapUser.FirstName);
        userCommonData.setLastName(iapUser.LastName);
        userCommonData.setLanguagePref(iapUser.Lang);
        if(!iapUser.Mobile.equals("000000000000")){
            userCommonData.setMobilePhoneNumber(iapUser.Mobile);
        }
        userCommonData.setNotification(NotificationType.NONE);
        if(iapUser.Role.equals("super")){
            userCommonData.setRole(RoleType.SUPER_USER);
        } else {
            userCommonData.setRole(RoleType.LIMITED_USER);
        }
        userCommonData.setSubscriberId(iapUser.refSubscriberId);
        return userCommonData;
    }


    private static CreateGetEquipmentCommonDataType CreateIapEquipmentCommonData() {
        CreateGetEquipmentCommonDataType equipmentCommonData = new CreateGetEquipmentCommonDataType();
        equipmentCommonData.setSubscriberId(iapEquipment.SubscriberId);
        equipmentCommonData.setMacAddress(iapEquipment.MacAddress);
        equipmentCommonData.setName(iapEquipment.EquipmentName);
        if(!iapEquipment.DefaultUser.equals("none")){
            equipmentCommonData.setDefaultUser(iapEquipment.DefaultUser);
        }

        return equipmentCommonData;
    }

/**
 * Creates SubscriberServices, for CREATE subscriber request according to services template
 * readed from configuration.
 *
 * @return SubscriberServicesType
 */
    private static SubscriberServicesType CreateIapSubscriberServices() {
        SubscriberServicesType iapServices = new SubscriberServicesType();

        if(SubscriberSvcTemplates.getProperty("com.ericsson.iptv.iap.services."
                +iapSubscriber.ServicesTemplate+".Bootstrap").equals("true")){
            iapServices.setBootstrap(null);
        }

        if(SubscriberSvcTemplates.getProperty("com.ericsson.iptv.iap.services."
                +iapSubscriber.ServicesTemplate+".BroadcastReminder").equals("true")){
            iapServices.setBroadcastReminder(null);
        }

        if(SubscriberSvcTemplates.getProperty("com.ericsson.iptv.iap.services."
                +iapSubscriber.ServicesTemplate+".Catchuptv").equals("true")){
            iapServices.setCatchuptv(getCatchupTvService("on"));
        }

        if(SubscriberSvcTemplates.getProperty("com.ericsson.iptv.iap.services."
                +iapSubscriber.ServicesTemplate+".ChannelManager").equals("true")){
            iapServices.setChannelManager(getChannelManagerService("on"));
        }

        if(SubscriberSvcTemplates.getProperty("com.ericsson.iptv.iap.services."
                +iapSubscriber.ServicesTemplate+".IptvProxy").equals("true")){
            iapServices.setIptvProxy(getIptvProxyService("on"));
        }

        if(SubscriberSvcTemplates.getProperty("com.ericsson.iptv.iap.services."
                +iapSubscriber.ServicesTemplate+".LocalTimeshift").equals("true")){
            iapServices.setLocalTimeshift(getLocalTimeshiftService("on"));
        }

        if(SubscriberSvcTemplates.getProperty("com.ericsson.iptv.iap.services."
                +iapSubscriber.ServicesTemplate+".Lpvr").equals("true")){
            iapServices.setLpvr(getLpvrService("on"));
        }

        if(SubscriberSvcTemplates.getProperty("com.ericsson.iptv.iap.services."
                +iapSubscriber.ServicesTemplate+".Npvr").equals("true")){
            iapServices.setNpvr(getNpvrService("on"));
        }

        if(SubscriberSvcTemplates.getProperty("com.ericsson.iptv.iap.services."
                +iapSubscriber.ServicesTemplate+".NetworkTimeshift").equals("true")){
            iapServices.setNetworkTimeshift(getNetworkTimeshiftService("on"));
        }

        if(SubscriberSvcTemplates.getProperty("com.ericsson.iptv.iap.services."
                +iapSubscriber.ServicesTemplate+".PayPerView").equals("true")){
            iapServices.setPayPerView(null);
        }

        if(SubscriberSvcTemplates.getProperty("com.ericsson.iptv.iap.services."
                +iapSubscriber.ServicesTemplate+".PortalSelector").equals("true")){
            iapServices.setPortalSelector(getSubscriberPortalSelector("on"));
        }

        if(SubscriberSvcTemplates.getProperty("com.ericsson.iptv.iap.services."
                +iapSubscriber.ServicesTemplate+".RemoteAuthorization").equals("true")){
            iapServices.setRemoteAuthorization(null);
        }

        if(SubscriberSvcTemplates.getProperty("com.ericsson.iptv.iap.services."
                +iapSubscriber.ServicesTemplate+".ReservedUsers").equals("true")){
            iapServices.setReservedUsers(null);
        }

        if(SubscriberSvcTemplates.getProperty("com.ericsson.iptv.iap.services."
                +iapSubscriber.ServicesTemplate+".SubscriberAccountIdentity").equals("true")){
            iapServices.setSubscriberAccountIdentity(getSubscriberAccountIdentityService("on"));
        }

        if(SubscriberSvcTemplates.getProperty("com.ericsson.iptv.iap.services."
                +iapSubscriber.ServicesTemplate+".SubscriberPortalPreferences").equals("true")){
            iapServices.setSubscriberPortalPreferences(getSubscriberPortalPreferences("on"));
        }

        if(SubscriberSvcTemplates.getProperty("com.ericsson.iptv.iap.services."
                +iapSubscriber.ServicesTemplate+".VodService").equals("true")){
            iapServices.setVod(getVodService("on"));
        }

        if(SubscriberSvcTemplates.getProperty("com.ericsson.iptv.iap.services."
                +iapSubscriber.ServicesTemplate+".WhatsOnTv").equals("true")){
            iapServices.setWhatsOnTv(getWhatsOnTv("on"));
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
    private static ChannelManagerType getChannelManagerService(String state) {
        ChannelManagerType iapChannelManager= new ChannelManagerType();
        if(state.equals("off")){
            iapChannelManager.setDelete("true");
        } else {
          if(SubscriberSvcTemplates.getProperty("com.ericsson.iptv.iap.services."+iapSubscriber.ServicesTemplate+".ChannelManager.ChannelList").equals("true")){
            ChannelManagerType.ChannelList iapchannelList = new ChannelManagerType.ChannelList();   
            //if Channel list is not empty, perform adding this list to subscriber
                if(!SubscriberSvcTemplates.getProperty("com.ericsson.iptv.iap.services."+iapSubscriber.ServicesTemplate+".ChannelManager.ChannelList.Channels").isEmpty()){
                    String Channels[] = SubscriberSvcTemplates.getProperty("com.ericsson.iptv.iap.services."+iapSubscriber.ServicesTemplate+".ChannelManager.ChannelList.Channels").split(",");
                    for(int i=0; i<Channels.length; i++){
                        System.out.println(Channels[i]);
                        ChannelManagerType.ChannelList.Channel iapChannel = new ChannelManagerType.ChannelList.Channel();
                        iapChannel.setId(SubscriberSvcTemplates.getProperty("com.ericsson.iptv.iap.services."+iapSubscriber.ServicesTemplate+".ChannelManager.ChannelList."+Channels[i]+".id"));
                        iapChannel.setVariant(SubscriberSvcTemplates.getProperty("com.ericsson.iptv.iap.services."+iapSubscriber.ServicesTemplate+".ChannelManager.ChannelList."+Channels[i]+".variant"));
                        iapchannelList.getChannel().add(iapChannel);
                    }
                 }
            iapChannelManager.setChannelList(iapchannelList);
          } else {
              iapChannelManager.getChannelList().setDelete(Boolean.TRUE);
          }

          if(SubscriberSvcTemplates.getProperty("com.ericsson.iptv.iap.services."+iapSubscriber.ServicesTemplate+".ChannelManager.ChannelPackageList").equals("true")){
              System.out.println(SubscriberSvcTemplates.getProperty("com.ericsson.iptv.iap.services."+iapSubscriber.ServicesTemplate+".ChannelManager.ChannelPackageList"));
            ChannelManagerType.ChannelPackageList iapChannelPackageList = new ChannelManagerType.ChannelPackageList();
            //if Channel Package is provided, provision it to subscriber
            if(!SubscriberSvcTemplates.getProperty("com.ericsson.iptv.iap.services."+iapSubscriber.ServicesTemplate+".ChannelManager.ChannelPackageList.Packages").isEmpty()){
                String Packages[] = SubscriberSvcTemplates.getProperty("com.ericsson.iptv.iap.services."+iapSubscriber.ServicesTemplate+".ChannelManager.ChannelPackageList.Packages").split(",");
                for(int i=0; i<Packages.length; i++){
                    ChannelManagerType.ChannelPackageList.ChannelPackage iapChannelPackage = new ChannelManagerType.ChannelPackageList.ChannelPackage();
                    iapChannelPackage.setId(Packages[i]);
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
    private static IptvProxyType getIptvProxyService(String state) {
        IptvProxyType iapIptvProxy = new IptvProxyType();
        if(state.equals("off")){
            iapIptvProxy.setDelete("true");
        } else {
                 iapIptvProxy.setIptvProxyPassword(iapSubscriber.ProxyPassword);
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
    private static SubscriberAccountIdentityType getSubscriberAccountIdentityService(String state) {
        SubscriberAccountIdentityType iapSubscriberAccountIdentity = new SubscriberAccountIdentityType();
        if(state.equals("off")){
          iapSubscriberAccountIdentity.setDelete("true");
        } else {
           iapSubscriberAccountIdentity.setHttpAuthenticationId(iapSubscriber.SubscriberId);
           //iapSubscriberAccountIdentity.setImpu("sip:"+iapSubscriber.impu);
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
    private static VodType getVodService(String state) {
        VodType iapVodService = new VodType();
        if(state.equals("off")){
           iapVodService.setDelete("true");
        } else {
        //if rentallist is set
       if(SubscriberSvcTemplates.getProperty("com.ericsson.iptv.iap.services."+iapSubscriber.ServicesTemplate+".VodService.rentalList").equals("true")){
           VodType.RentalList iapVodRentalList = new VodType.RentalList();
           //if VOD title for rentalList is set
           if(!SubscriberSvcTemplates.getProperty("com.ericsson.iptv.iap.services."+iapSubscriber.ServicesTemplate+".VodService.rentalList.id").isEmpty()){
            String[] Titles = SubscriberSvcTemplates.getProperty("com.ericsson.iptv.iap.services."+iapSubscriber.ServicesTemplate+".VodService.rentalList.id").split(",");
            for(int i=0; i<Titles.length; i++){
              VodType.RentalList.VodTitle iapVodRentalListTitle =new RentalList.VodTitle();
              iapVodRentalListTitle.setId(Titles[i]);
              iapVodRentalList.getVodTitle().add(iapVodRentalListTitle);
            }  
           } 
             QName qnm = new QName("http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/", "rentalList");
             JAXBElement<RentalList> JvodRent = new JAXBElement<RentalList>(qnm, VodType.RentalList.class, iapVodRentalList);
             iapVodService.setRentalList(JvodRent);
        }

        //if VOD authorizationList is set
        if(SubscriberSvcTemplates.getProperty("com.ericsson.iptv.iap.services."+iapSubscriber.ServicesTemplate+".VodService.AuthorizationList").equals("true")){
            AuthorizationList iapVodAuthorizationList = new VodType.AuthorizationList();
            if(!SubscriberSvcTemplates.getProperty("com.ericsson.iptv.iap.services."+iapSubscriber.ServicesTemplate+".VodService.AuthorizationList.svodId").isEmpty()){
                String[] SvodId = SubscriberSvcTemplates.getProperty("com.ericsson.iptv.iap.services."+iapSubscriber.ServicesTemplate+".VodService.AuthorizationList.svodId").split(",");
                for(int i=0; i<SvodId.length; i++){
                    AuthorizationList.Svod iapAuthorizationListSvod = new AuthorizationList.Svod();
                    iapAuthorizationListSvod.setId(SvodId[i]);
                    iapVodAuthorizationList.getSvod().add(iapAuthorizationListSvod);
                }
            }
            QName qnm = new QName("http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/", "authorizationList");
            JAXBElement<AuthorizationList> JvodAuth = new JAXBElement<AuthorizationList>(qnm,  VodType.AuthorizationList.class, iapVodAuthorizationList);
            iapVodService.setAuthorizationList(JvodAuth);
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
    private static NpvrType getNpvrService(String state) {
        NpvrType iapNpvrService = new NpvrType();
        if(state.equals("off")){
            iapNpvrService.setDelete("true");
        } else {
            iapNpvrService.setQuota(BigInteger.valueOf(120));
            iapNpvrService.setRecordingTimeToLive(BigInteger.valueOf(120));
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

    private static PortalSelectorType getSubscriberPortalSelector(String state) {
        PortalSelectorType iapPortalSelector = new PortalSelectorType();
        if(state.equals("off")){
            iapPortalSelector.setDelete("true");
        } else {
            iapPortalSelector.setPortalId("portal");
            XMLGregorianCalendar date = new XMLGregorianCalendarImpl();
            iapPortalSelector.setEffectiveFrom(null);
        }
        return iapPortalSelector;

    }

/**
 * Common method to read *.properties files.
 * Used to load application main properties file soapprovisioning.properties
 * which is contains cai3g login credentials
 * subscriber list file, subscriber services properties file,
 * users list file, equipment list files location.
 *
 * reads all templates.
 *
 * @param PropFileName
 * @return
 */
    private static Properties getServicesTemplates(String PropFileName) {
        Properties mainProp = new Properties();
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

    private static SubscriberPortalPreferencesType getSubscriberPortalPreferences(String state) {
        throw new UnsupportedOperationException("Not yet implemented");
    }


/**
 * Load subscribers from TAB separated file, name defined in main config file,
 * given as a parameter type of String
 * As an output, should fill main class property, accesible from all methods
 * <p>File positions are:
 * <p> 0: Subscriber Id (unical value for each subscriber)
 * <p> 1: Postal Code
 * <p> 3: Service Region (must be defined in IAP!)
 * <p> 4: Proxy Password (must be unical)
 * <P> 5: impu
 * <p> 5: Services template name (all services defined in .properties file)
 * <p> 6: Block State
 *
 * @param subscribersListFile
 * @return
 */
    private static List<IapSubscriber> getIapSubscribersList(String subscribersListFile) {
        List<IapSubscriber> iapSubscribersList = new ArrayList<IapSubscriber>();
        File file = new File(subscribersListFile);
     try{
            Reader bufread = new InputStreamReader(new FileInputStream(file),"UTF8");
            BufferedReader dis = new BufferedReader(bufread);

     while (dis.ready()) {
        IapSubscriber subscriber = new IapSubscriber();
        String input = dis.readLine();
        String[] params = input.split("\t");
        subscriber.SubscriberId = params[0];
        subscriber.PostalCode = params[1];
        subscriber.ServiceRegion = params[2];
        subscriber.ProxyPassword = params[3];
        subscriber.impu = params[4];
        subscriber.ServicesTemplate = params[5];
        subscriber.BlockState = params[6];

        iapSubscribersList.add(subscriber);
      }

      // dispose all the resources after using them.

      dis.close();

    } catch (FileNotFoundException e) {
        System.out.println("Fiele not found error: "+e);
    } catch (IOException e) {
        System.out.println("IO exception error: "+e);
    }

        return iapSubscribersList;
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

/**
 * Load user list from TAB separated file , name defined in main config file,
 * given as a parameter type of String
 * As an output, should fill main class property, accesible from all methods
 * <p>File positions are:
 * <p> 1: User Id (must be unical)
 * <p> 2: Referal subscriber Id (relative subscriber id, for which user is linked)
 * <p> 3: First Name
 * <p> 4: Last Name
 * <p> 5: mobile phone name
 * <p> 6: Role (super for => superUser, any for limitedUser)
 * <p> 7: Raiting (shold muth raitings, defined in IAP: G, G-13, etc.)
 * <p> 8: Language (should match RFCxxxx, ua_UA, en_EN)
 * <p> 9: Notification type (SMS, SIP, BOTH, NONE)
 * <p> 10: Charging Id (must be unical)
 * <p> 11: Impu (IMS user Id sip:<user>@<domain>)
 * <p> 12: Services template (template name for user, defined in separate .properties,
 * nonims_charged,nonims_noncharged,ims_noncharged,charged_ims)
 * 
 * @param usersListFile
 * @return
 */
    private static List<IapUser> getIapUsersList(String usersListFile) {
                List<IapUser> iapUserList = new ArrayList<IapUser>();
        File file = new File(usersListFile);
     try{
            Reader bufread = new InputStreamReader(new FileInputStream(file),"UTF8");
            BufferedReader dis = new BufferedReader(bufread);

     while (dis.ready()) {
        IapUser user = new IapUser();
        String input = dis.readLine();
        String[] params = input.split("\t");
        user.UserId = params[0];
        user.refSubscriberId = params[1];
        user.FirstName = params[2];
        user.LastName = params[3];
        user.Mobile = params[4];
        user.Role = params[5];
        user.Raiting = params[6];
        user.Lang = params[7];
        user.Notification = params[8];
        user.ChargId = params[9];
        user.Impu = params[10];
        user.ServicesTemplate = params[11];

        iapUserList.add(user);
      }

      // dispose all the resources after using them.

      dis.close();

    } catch (FileNotFoundException e) {
        System.out.println("Fiele not found error: "+e);
    } catch (IOException e) {
        System.out.println("IO exception error: "+e);
    }

        return iapUserList;
    }



    private static UserServicesType CreateIapUserServices() {
        UserServicesType iapUserServices = new UserServicesType();
        if(UserSvcTemplates.getProperty("com.ericsson.iptv.iap.user.services.templates."+iapUser.ServicesTemplate+".charging").equals("true")){
            iapUserServices.setCharging(getUserChargingIdService());
        }

        if(UserSvcTemplates.getProperty("com.ericsson.iptv.iap.user.services.templates."+iapUser.ServicesTemplate+".userAccountIdentity").equals("true")){
            iapUserServices.setUserAccountIdentity(getUserAccauntIdService());
        }

        return iapUserServices;
    }
    
     private static EquipmentServicesType CreateIapEquipmentServices() {
         EquipmentServicesType iapEquipmentServices = new EquipmentServicesType();
         if(EquipmentServices.getProperty("com.ericsson.iptv.iap.equipment.services."+iapEquipment.ServicesTemplate+".imsBootstrap").equals("true")){
            iapEquipmentServices.setImsBootstrap(getEquipmentImsBootstrap()); 
         }
         
         if(EquipmentServices.getProperty("com.ericsson.iptv.iap.equipment.services."+iapEquipment.ServicesTemplate+".plainBootstrap").equals("true")){
             iapEquipmentServices.setPlainBootstrap(getEquipmentPlainBootstrap());
         }
         
         if(EquipmentServices.getProperty("com.ericsson.iptv.iap.equipment.services."+iapEquipment.ServicesTemplate+".equipmentPortalPreferences").equals("true")){
             iapEquipmentServices.setPlainBootstrap(getEquipmentPortalPreferences());
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
        try {
            /*
            JAXBContext jciapSbsSubsType = JAXBContext.newInstance(CreateSubscriber.class);
            Marshaller m = jciapSbsSubsType.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            m.marshal(iapNewSbs, System.out);
             */
         iapProvisioning.create(iapCreateDocument.iapMoType, iapCreateDocument.iapMoId, iapCreateDocument.iapMoAttributes, iapCreateDocument.iapSessionCred.sessionId, iapCreateDocument.iapSessionCred.sequenceId, null, null);
        } catch (iap.soapprovisioning.Cai3GFaultException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static ChargingType getUserChargingIdService() {
        ChargingType iapCharging = new ChargingType();
        iapCharging.setChargingId(iapUser.ChargId);
    return iapCharging;
    }

    private static UserAccountIdentityType getUserAccauntIdService() {
        UserAccountIdentityType iapAccountIdentity = new  UserAccountIdentityType();
        iapAccountIdentity.setImpu(iapUser.Impu);
    return iapAccountIdentity;
    }

    private static PlainBootstrapType getEquipmentPortalPreferences() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private static PlainBootstrapType getEquipmentPlainBootstrap() {
        PlainBootstrapType iapPlainBootstrap = new PlainBootstrapType();
        iapPlainBootstrap.setBlocked(Boolean.FALSE);
        if(EquipmentServices.getProperty("com.ericsson.iptv.iap.equipment.services."+iapEquipment.ServicesTemplate+".plainBootstrap.deviceSettings").equals("true")){
            PlainBootstrapType.DeviceSettings deviceSettings = new PlainBootstrapType.DeviceSettings();
            if(EquipmentServices.getProperty("com.ericsson.iptv.iap.equipment.services."+iapEquipment.ServicesTemplate+".plainBootstrap.deviceSettings.authentication").equals("true")){
                PlainBootstrapType.DeviceSettings.Authentication authetication = new PlainBootstrapType.DeviceSettings.Authentication();
                authetication.setId(iapEquipment.PlainBootstrapId);
                authetication.setPassword(iapEquipment.PlainBootstarpPwd);
                deviceSettings.setAuthentication(authetication);
            }
            iapPlainBootstrap.setDeviceSettings(deviceSettings);
        }
         if(EquipmentServices.getProperty("com.ericsson.iptv.iap.equipment.services."+iapEquipment.ServicesTemplate+".plainBootstrap.noAuthentication").equals("true")){
            PlainBootstrapType.NoAuthentication noAuth = new PlainBootstrapType.NoAuthentication();
             iapPlainBootstrap.setNoAuthentication(noAuth);
         }


      

    return iapPlainBootstrap;
    }

    private static ImsBootstrapType getEquipmentImsBootstrap() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private static void TestSet() {

            SetSubscriber iapSetSbs = new SetSubscriber();
            SetSubscriberCommonDataType iapSetSubsCommDat = new SetSubscriberCommonDataType();
            //iapSetSubsCommDat.setDefaultUser("zyxel03User1");

            iapSetSbs.setSubscriberId("test");
            iapSetSbs.setCommonData(iapSetSubsCommDat);

             SubscriberServicesType stype = new SubscriberServicesType();

            iapSetSbs.setServices(stype);

            ChannelManagerType.ChannelList chList = new ChannelManagerType.ChannelList();
            ChannelManagerType.ChannelList.Channel ch1 = new ChannelManagerType.ChannelList.Channel();
            ChannelManagerType.ChannelList.Channel ch2 = new ChannelManagerType.ChannelList.Channel();
            ch1.setId("364");
            //ch1.setDelete(Boolean.TRUE);
            chList.getChannel().add(ch1);

            //ch2.setId("361");
            //ch2.setDelete(Boolean.TRUE);
            //chList.getChannel().add(ch2);
            ChannelManagerType chMan = new ChannelManagerType();
            //chList.setDelete(Boolean.TRUE);
            chMan.setChannelList(chList);
            //stype.setChannelManager(chMan);
                    
            //ChannelManagerType.ChannelList chList = new ChannelManagerType.ChannelList();
            //ChannelManagerType.ChannelList.Channel ch1 = new ChannelManagerType.ChannelList.Channel();
            //ch1.setId("358");
            //ch1.setDelete(Boolean.TRUE);
            //chList.getChannel().add(ch1);
            //ChannelManagerType chMan = new ChannelManagerType();
            //chMan.setDelete("true");
            //chMan.setChannelList(chList);
            stype.setChannelManager(chMan);


            SetMoAttributes setMoAttr = new SetMoAttributes();
            setMoAttr.setSetSubscriber(iapSetSbs);


        IapSessionCred iapSessionCred = new IapSessionCred();
        iapSessionCred = IapSessionLogin("admin","admin");
        iapSessionCred.GetNextSequenceId();


            MoType iapMO = MoType.SUBSCRIBER_HTTP_CAI_3_G_IAP_IPTV_ERICSSON_COM_IPTV_PROVISIONING_SUBSCRIBER;
            MOId iapObj = new MOId();
            iapObj.setSubscriberId("test");
            //iapSession.logout(sessionId);



        ProvisioningEndpointSlsbService iapProvisioningService = new ProvisioningEndpointSlsbService();
        Provisioning iapProvisioning = iapProvisioningService.getProvisioningEndpointSlsbPort();
        try {
            
            JAXBContext jciapSbsSubsType = JAXBContext.newInstance(SetSubscriber.class);
            Marshaller m = jciapSbsSubsType.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            m.marshal(iapSetSbs, System.out);
           
         iapProvisioning.set(iapMO,iapObj,setMoAttr,iapSessionCred.sessionId,iapSessionCred.sequenceId,null, null);
        } catch (JAXBException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (iap.soapprovisioning.Cai3GFaultException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static void TestDelete(IapSessionCred iapSessionCred) {
         
            Delete.MOAttributes DelMoAttr = new Delete.MOAttributes();

            //MOId iapObj = new MOId();
            Holder<MOId> MOIdHolder = new Holder<MOId>();
            //iapObj.setEquipmentId(iapEquipment.EquipmentId);
           

        ProvisioningEndpointSlsbService iapProvisioningService = new ProvisioningEndpointSlsbService();
        Provisioning iapProvisioning = iapProvisioningService.getProvisioningEndpointSlsbPort();
        try {
         MOIdHolder.value = new MOId();

         MoType iapMO = MoType.EQUIPMENT_HTTP_CAI_3_G_IAP_IPTV_ERICSSON_COM_IPTV_PROVISIONING_EQUIPMENT;


         MOIdHolder.value.setEquipmentId(iapEquipment.EquipmentId);
         iapProvisioning.delete(iapMO, MOIdHolder,DelMoAttr, iapSessionCred.sessionId, iapSessionCred.sequenceId, null, null);

/**
         iapMO = MoType.USER_HTTP_CAI_3_G_IAP_IPTV_ERICSSON_COM_IPTV_PROVISIONING_USER;
           MOIdHolder.value.setUserId("zyxel03User1");
         iapProvisioning.delete(iapMO, MOIdHolder,DelMoAttr , iapSessionCred.sessionId, iapSessionCred.sequenceId, null, null);
          iapSessionCred.GetNextSequenceId();
         MOIdHolder.value.setUserId("zyxel05User1");
         iapProvisioning.delete(iapMO, MOIdHolder,DelMoAttr , iapSessionCred.sessionId, iapSessionCred.sequenceId, null, null);
          iapSessionCred.GetNextSequenceId();

            iapMO = MoType.SUBSCRIBER_HTTP_CAI_3_G_IAP_IPTV_ERICSSON_COM_IPTV_PROVISIONING_SUBSCRIBER;
         MOIdHolder.value.setSubscriberId("zyxel03");
         iapProvisioning.delete(iapMO, MOIdHolder,DelMoAttr , iapSessionCred.sessionId, iapSessionCred.sequenceId, null, null);
          iapSessionCred.GetNextSequenceId();
         MOIdHolder.value.setSubscriberId("zyxel05");
         iapProvisioning.delete(iapMO, MOIdHolder,DelMoAttr , iapSessionCred.sessionId, iapSessionCred.sequenceId, null, null);
          iapSessionCred.GetNextSequenceId();

   **/
        } catch (iap.soapprovisioning.Cai3GFaultException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


 }

