
package iap.soapprovisioning;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the iap.soapprovisioning package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _VodTypeModDownloadRentalList_QNAME = new QName("http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/", "modDownloadRentalList");
    private final static QName _VodTypeModStreamRentalList_QNAME = new QName("http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/", "modStreamRentalList");
    private final static QName _VodTypeSvodDownloadAuthorizationList_QNAME = new QName("http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/", "svodDownloadAuthorizationList");
    private final static QName _VodTypeSvodStreamAuthorizationList_QNAME = new QName("http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/", "svodStreamAuthorizationList");
    private final static QName _DeleteRequestMODefinition_QNAME = new QName("http://schemas.ericsson.com/cai3g1.2/", "DeleteRequestMODefinition");
    private final static QName _SetMODefinition_QNAME = new QName("http://schemas.ericsson.com/cai3g1.2/", "SetMODefinition");
    private final static QName _TransactionId_QNAME = new QName("http://schemas.ericsson.com/cai3g1.2/", "TransactionId");
    private final static QName _SessionId_QNAME = new QName("http://schemas.ericsson.com/cai3g1.2/", "SessionId");
    private final static QName _SequenceId_QNAME = new QName("http://schemas.ericsson.com/cai3g1.2/", "SequenceId");
    private final static QName _CreateMODefinition_QNAME = new QName("http://schemas.ericsson.com/cai3g1.2/", "CreateMODefinition");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: iap.soapprovisioning
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SetEquipmentCommonDataType }
     * 
     */
    public SetEquipmentCommonDataType createSetEquipmentCommonDataType() {
        return new SetEquipmentCommonDataType();
    }

    /**
     * Create an instance of {@link PayPerViewType }
     * 
     */
    public PayPerViewType createPayPerViewType() {
        return new PayPerViewType();
    }

    /**
     * Create an instance of {@link GetResponseUser }
     * 
     */
    public GetResponseUser createGetResponseUser() {
        return new GetResponseUser();
    }

    /**
     * Create an instance of {@link LpvrType }
     * 
     */
    public LpvrType createLpvrType() {
        return new LpvrType();
    }

    /**
     * Create an instance of {@link SetEquipment }
     * 
     */
    public SetEquipment createSetEquipment() {
        return new SetEquipment();
    }

    /**
     * Create an instance of {@link VodType.SvodStreamAuthorizationList }
     * 
     */
    public VodType.SvodStreamAuthorizationList createVodTypeSvodStreamAuthorizationList() {
        return new VodType.SvodStreamAuthorizationList();
    }

    /**
     * Create an instance of {@link PlainBootstrapType.DeviceSettings }
     * 
     */
    public PlainBootstrapType.DeviceSettings createPlainBootstrapTypeDeviceSettings() {
        return new PlainBootstrapType.DeviceSettings();
    }

    /**
     * Create an instance of {@link BootstrapType.BootstrapReservePlainEquipment }
     * 
     */
    public BootstrapType.BootstrapReservePlainEquipment createBootstrapTypeBootstrapReservePlainEquipment() {
        return new BootstrapType.BootstrapReservePlainEquipment();
    }

    /**
     * Create an instance of {@link RemoteAuthorizationType }
     * 
     */
    public RemoteAuthorizationType createRemoteAuthorizationType() {
        return new RemoteAuthorizationType();
    }

    /**
     * Create an instance of {@link PortalSelectorType }
     * 
     */
    public PortalSelectorType createPortalSelectorType() {
        return new PortalSelectorType();
    }

    /**
     * Create an instance of {@link CreateEquipment }
     * 
     */
    public CreateEquipment createCreateEquipment() {
        return new CreateEquipment();
    }

    /**
     * Create an instance of {@link ReservedUsersType.ReservedUser }
     * 
     */
    public ReservedUsersType.ReservedUser createReservedUsersTypeReservedUser() {
        return new ReservedUsersType.ReservedUser();
    }

    /**
     * Create an instance of {@link NpvrType }
     * 
     */
    public NpvrType createNpvrType() {
        return new NpvrType();
    }

    /**
     * Create an instance of {@link NotificationHeaderType }
     * 
     */
    public NotificationHeaderType createNotificationHeaderType() {
        return new NotificationHeaderType();
    }

    /**
     * Create an instance of {@link HeaderFaultType }
     * 
     */
    public HeaderFaultType createHeaderFaultType() {
        return new HeaderFaultType();
    }

    /**
     * Create an instance of {@link CreateUserCommonDataType }
     * 
     */
    public CreateUserCommonDataType createCreateUserCommonDataType() {
        return new CreateUserCommonDataType();
    }

    /**
     * Create an instance of {@link BootstrapType.BootstrapReservePlainEquipment.DeviceSettings }
     * 
     */
    public BootstrapType.BootstrapReservePlainEquipment.DeviceSettings createBootstrapTypeBootstrapReservePlainEquipmentDeviceSettings() {
        return new BootstrapType.BootstrapReservePlainEquipment.DeviceSettings();
    }

    /**
     * Create an instance of {@link UserPortalPreferencesType }
     * 
     */
    public UserPortalPreferencesType createUserPortalPreferencesType() {
        return new UserPortalPreferencesType();
    }

    /**
     * Create an instance of {@link CreateSubscriberCommonDataType }
     * 
     */
    public CreateSubscriberCommonDataType createCreateSubscriberCommonDataType() {
        return new CreateSubscriberCommonDataType();
    }

    /**
     * Create an instance of {@link PlainBootstrapType.NoAuthentication }
     * 
     */
    public PlainBootstrapType.NoAuthentication createPlainBootstrapTypeNoAuthentication() {
        return new PlainBootstrapType.NoAuthentication();
    }

    /**
     * Create an instance of {@link GetResponseMOAttributesType }
     * 
     */
    public GetResponseMOAttributesType createGetResponseMOAttributesType() {
        return new GetResponseMOAttributesType();
    }

    /**
     * Create an instance of {@link Blocked }
     * 
     */
    public Blocked createBlocked() {
        return new Blocked();
    }

    /**
     * Create an instance of {@link AnyMOIdType }
     * 
     */
    public AnyMOIdType createAnyMOIdType() {
        return new AnyMOIdType();
    }

    /**
     * Create an instance of {@link BootstrapType.BootstrapReservePlainEquipment.SimplePasswordAuthentication }
     * 
     */
    public BootstrapType.BootstrapReservePlainEquipment.SimplePasswordAuthentication createBootstrapTypeBootstrapReservePlainEquipmentSimplePasswordAuthentication() {
        return new BootstrapType.BootstrapReservePlainEquipment.SimplePasswordAuthentication();
    }

    /**
     * Create an instance of {@link ImsBootstrapType }
     * 
     */
    public ImsBootstrapType createImsBootstrapType() {
        return new ImsBootstrapType();
    }

    /**
     * Create an instance of {@link ImsBootstrapType.DeviceSettings }
     * 
     */
    public ImsBootstrapType.DeviceSettings createImsBootstrapTypeDeviceSettings() {
        return new ImsBootstrapType.DeviceSettings();
    }

    /**
     * Create an instance of {@link SubscriberAccountIdentityType }
     * 
     */
    public SubscriberAccountIdentityType createSubscriberAccountIdentityType() {
        return new SubscriberAccountIdentityType();
    }

    /**
     * Create an instance of {@link BootstrapType }
     * 
     */
    public BootstrapType createBootstrapType() {
        return new BootstrapType();
    }

    /**
     * Create an instance of {@link SetMoAttributes }
     * 
     */
    public SetMoAttributes createSetMoAttributes() {
        return new SetMoAttributes();
    }

    /**
     * Create an instance of {@link EquipmentPortalPreferencesType.Preference }
     * 
     */
    public EquipmentPortalPreferencesType.Preference createEquipmentPortalPreferencesTypePreference() {
        return new EquipmentPortalPreferencesType.Preference();
    }

    /**
     * Create an instance of {@link VodType.ModDownloadRentalList.VodTitle }
     * 
     */
    public VodType.ModDownloadRentalList.VodTitle createVodTypeModDownloadRentalListVodTitle() {
        return new VodType.ModDownloadRentalList.VodTitle();
    }

    /**
     * Create an instance of {@link CreateMoAttributes }
     * 
     */
    public CreateMoAttributes createCreateMoAttributes() {
        return new CreateMoAttributes();
    }

    /**
     * Create an instance of {@link BlockedStateType }
     * 
     */
    public BlockedStateType createBlockedStateType() {
        return new BlockedStateType();
    }

    /**
     * Create an instance of {@link CreateResponse }
     * 
     */
    public CreateResponse createCreateResponse() {
        return new CreateResponse();
    }

    /**
     * Create an instance of {@link Subscribe }
     * 
     */
    public Subscribe createSubscribe() {
        return new Subscribe();
    }

    /**
     * Create an instance of {@link SetSubscriber }
     * 
     */
    public SetSubscriber createSetSubscriber() {
        return new SetSubscriber();
    }

    /**
     * Create an instance of {@link SearchFiltersType }
     * 
     */
    public SearchFiltersType createSearchFiltersType() {
        return new SearchFiltersType();
    }

    /**
     * Create an instance of {@link ChannelManagerType.ChannelList }
     * 
     */
    public ChannelManagerType.ChannelList createChannelManagerTypeChannelList() {
        return new ChannelManagerType.ChannelList();
    }

    /**
     * Create an instance of {@link GetResponseSubscriber }
     * 
     */
    public GetResponseSubscriber createGetResponseSubscriber() {
        return new GetResponseSubscriber();
    }

    /**
     * Create an instance of {@link TransactionIdFault }
     * 
     */
    public TransactionIdFault createTransactionIdFault() {
        return new TransactionIdFault();
    }

    /**
     * Create an instance of {@link AnySequenceType }
     * 
     */
    public AnySequenceType createAnySequenceType() {
        return new AnySequenceType();
    }

    /**
     * Create an instance of {@link PlainBootstrapType }
     * 
     */
    public PlainBootstrapType createPlainBootstrapType() {
        return new PlainBootstrapType();
    }

    /**
     * Create an instance of {@link BootstrapType.BootstrapReservePlainEquipment.DeviceSettings.Authentication }
     * 
     */
    public BootstrapType.BootstrapReservePlainEquipment.DeviceSettings.Authentication createBootstrapTypeBootstrapReservePlainEquipmentDeviceSettingsAuthentication() {
        return new BootstrapType.BootstrapReservePlainEquipment.DeviceSettings.Authentication();
    }

    /**
     * Create an instance of {@link ChannelManagerType.ChannelPackageList.ChannelPackage }
     * 
     */
    public ChannelManagerType.ChannelPackageList.ChannelPackage createChannelManagerTypeChannelPackageListChannelPackage() {
        return new ChannelManagerType.ChannelPackageList.ChannelPackage();
    }

    /**
     * Create an instance of {@link BootstrapType.BootstrapReserveIMSEquipment.DeviceSettings.Subscriber }
     * 
     */
    public BootstrapType.BootstrapReserveIMSEquipment.DeviceSettings.Subscriber createBootstrapTypeBootstrapReserveIMSEquipmentDeviceSettingsSubscriber() {
        return new BootstrapType.BootstrapReserveIMSEquipment.DeviceSettings.Subscriber();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link Search }
     * 
     */
    public Search createSearch() {
        return new Search();
    }

    /**
     * Create an instance of {@link GetResponseSubscriber.Equipment }
     * 
     */
    public GetResponseSubscriber.Equipment createGetResponseSubscriberEquipment() {
        return new GetResponseSubscriber.Equipment();
    }

    /**
     * Create an instance of {@link Create }
     * 
     */
    public Create createCreate() {
        return new Create();
    }

    /**
     * Create an instance of {@link PlainBootstrapType.SimplePasswordAuthentication }
     * 
     */
    public PlainBootstrapType.SimplePasswordAuthentication createPlainBootstrapTypeSimplePasswordAuthentication() {
        return new PlainBootstrapType.SimplePasswordAuthentication();
    }

    /**
     * Create an instance of {@link SetUserCommonDataType }
     * 
     */
    public SetUserCommonDataType createSetUserCommonDataType() {
        return new SetUserCommonDataType();
    }

    /**
     * Create an instance of {@link PlainBootstrapType.DeviceSettings.Authentication }
     * 
     */
    public PlainBootstrapType.DeviceSettings.Authentication createPlainBootstrapTypeDeviceSettingsAuthentication() {
        return new PlainBootstrapType.DeviceSettings.Authentication();
    }

    /**
     * Create an instance of {@link NetworkTimeshiftType }
     * 
     */
    public NetworkTimeshiftType createNetworkTimeshiftType() {
        return new NetworkTimeshiftType();
    }

    /**
     * Create an instance of {@link SubscribeResponse }
     * 
     */
    public SubscribeResponse createSubscribeResponse() {
        return new SubscribeResponse();
    }

    /**
     * Create an instance of {@link Notify }
     * 
     */
    public Notify createNotify() {
        return new Notify();
    }

    /**
     * Create an instance of {@link IptvProxyType }
     * 
     */
    public IptvProxyType createIptvProxyType() {
        return new IptvProxyType();
    }

    /**
     * Create an instance of {@link Set }
     * 
     */
    public Set createSet() {
        return new Set();
    }

    /**
     * Create an instance of {@link CreateUser }
     * 
     */
    public CreateUser createCreateUser() {
        return new CreateUser();
    }

    /**
     * Create an instance of {@link SessionHeader }
     * 
     */
    public SessionHeader createSessionHeader() {
        return new SessionHeader();
    }

    /**
     * Create an instance of {@link SubscriberServicesType }
     * 
     */
    public SubscriberServicesType createSubscriberServicesType() {
        return new SubscriberServicesType();
    }

    /**
     * Create an instance of {@link UserAccountIdentityType }
     * 
     */
    public UserAccountIdentityType createUserAccountIdentityType() {
        return new UserAccountIdentityType();
    }

    /**
     * Create an instance of {@link LocalTimeshiftType }
     * 
     */
    public LocalTimeshiftType createLocalTimeshiftType() {
        return new LocalTimeshiftType();
    }

    /**
     * Create an instance of {@link GetResponseEquipment }
     * 
     */
    public GetResponseEquipment createGetResponseEquipment() {
        return new GetResponseEquipment();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link Unsubscribe }
     * 
     */
    public Unsubscribe createUnsubscribe() {
        return new Unsubscribe();
    }

    /**
     * Create an instance of {@link BootstrapType.BootstrapReserveIMSEquipment.NoAuthentication }
     * 
     */
    public BootstrapType.BootstrapReserveIMSEquipment.NoAuthentication createBootstrapTypeBootstrapReserveIMSEquipmentNoAuthentication() {
        return new BootstrapType.BootstrapReserveIMSEquipment.NoAuthentication();
    }

    /**
     * Create an instance of {@link Get }
     * 
     */
    public Get createGet() {
        return new Get();
    }

    /**
     * Create an instance of {@link PayPerViewType.BlockList }
     * 
     */
    public PayPerViewType.BlockList createPayPerViewTypeBlockList() {
        return new PayPerViewType.BlockList();
    }

    /**
     * Create an instance of {@link ChannelManagerType }
     * 
     */
    public ChannelManagerType createChannelManagerType() {
        return new ChannelManagerType();
    }

    /**
     * Create an instance of {@link CreateSubscriber }
     * 
     */
    public CreateSubscriber createCreateSubscriber() {
        return new CreateSubscriber();
    }

    /**
     * Create an instance of {@link Cai3GFault.Faultreason }
     * 
     */
    public Cai3GFault.Faultreason createCai3GFaultFaultreason() {
        return new Cai3GFault.Faultreason();
    }

    /**
     * Create an instance of {@link Cai3GFault }
     * 
     */
    public Cai3GFault createCai3GFault() {
        return new Cai3GFault();
    }

    /**
     * Create an instance of {@link GetUserCommonDataType }
     * 
     */
    public GetUserCommonDataType createGetUserCommonDataType() {
        return new GetUserCommonDataType();
    }

    /**
     * Create an instance of {@link ImsBootstrapType.DeviceSettings.User }
     * 
     */
    public ImsBootstrapType.DeviceSettings.User createImsBootstrapTypeDeviceSettingsUser() {
        return new ImsBootstrapType.DeviceSettings.User();
    }

    /**
     * Create an instance of {@link ImsBootstrapType.SimplePasswordAuthentication }
     * 
     */
    public ImsBootstrapType.SimplePasswordAuthentication createImsBootstrapTypeSimplePasswordAuthentication() {
        return new ImsBootstrapType.SimplePasswordAuthentication();
    }

    /**
     * Create an instance of {@link VodType.ModStreamRentalList.Service }
     * 
     */
    public VodType.ModStreamRentalList.Service createVodTypeModStreamRentalListService() {
        return new VodType.ModStreamRentalList.Service();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link Cai3GFault.Details }
     * 
     */
    public Cai3GFault.Details createCai3GFaultDetails() {
        return new Cai3GFault.Details();
    }

    /**
     * Create an instance of {@link SessionIdFault }
     * 
     */
    public SessionIdFault createSessionIdFault() {
        return new SessionIdFault();
    }

    /**
     * Create an instance of {@link PayPerViewType.EventList }
     * 
     */
    public PayPerViewType.EventList createPayPerViewTypeEventList() {
        return new PayPerViewType.EventList();
    }

    /**
     * Create an instance of {@link SequenceIdFault }
     * 
     */
    public SequenceIdFault createSequenceIdFault() {
        return new SequenceIdFault();
    }

    /**
     * Create an instance of {@link BootstrapType.BootstrapReserveIMSEquipment.SimplePasswordAuthentication }
     * 
     */
    public BootstrapType.BootstrapReserveIMSEquipment.SimplePasswordAuthentication createBootstrapTypeBootstrapReserveIMSEquipmentSimplePasswordAuthentication() {
        return new BootstrapType.BootstrapReserveIMSEquipment.SimplePasswordAuthentication();
    }

    /**
     * Create an instance of {@link VodType.ModDownloadRentalList }
     * 
     */
    public VodType.ModDownloadRentalList createVodTypeModDownloadRentalList() {
        return new VodType.ModDownloadRentalList();
    }

    /**
     * Create an instance of {@link BootstrapType.BootstrapReserveIMSEquipment.DeviceSettings.User }
     * 
     */
    public BootstrapType.BootstrapReserveIMSEquipment.DeviceSettings.User createBootstrapTypeBootstrapReserveIMSEquipmentDeviceSettingsUser() {
        return new BootstrapType.BootstrapReserveIMSEquipment.DeviceSettings.User();
    }

    /**
     * Create an instance of {@link VodType.ModStreamRentalList.VodTitle }
     * 
     */
    public VodType.ModStreamRentalList.VodTitle createVodTypeModStreamRentalListVodTitle() {
        return new VodType.ModStreamRentalList.VodTitle();
    }

    /**
     * Create an instance of {@link PayPerViewType.BlockList.Block }
     * 
     */
    public PayPerViewType.BlockList.Block createPayPerViewTypeBlockListBlock() {
        return new PayPerViewType.BlockList.Block();
    }

    /**
     * Create an instance of {@link NotifyResponse }
     * 
     */
    public NotifyResponse createNotifyResponse() {
        return new NotifyResponse();
    }

    /**
     * Create an instance of {@link Logout }
     * 
     */
    public Logout createLogout() {
        return new Logout();
    }

    /**
     * Create an instance of {@link SubscriberPortalPreferencesType.Preference }
     * 
     */
    public SubscriberPortalPreferencesType.Preference createSubscriberPortalPreferencesTypePreference() {
        return new SubscriberPortalPreferencesType.Preference();
    }

    /**
     * Create an instance of {@link Get.MOAttributes }
     * 
     */
    public Get.MOAttributes createGetMOAttributes() {
        return new Get.MOAttributes();
    }

    /**
     * Create an instance of {@link BootstrapType.BootstrapReserveIMSEquipment.DeviceSettings }
     * 
     */
    public BootstrapType.BootstrapReserveIMSEquipment.DeviceSettings createBootstrapTypeBootstrapReserveIMSEquipmentDeviceSettings() {
        return new BootstrapType.BootstrapReserveIMSEquipment.DeviceSettings();
    }

    /**
     * Create an instance of {@link NotificationFiltersType }
     * 
     */
    public NotificationFiltersType createNotificationFiltersType() {
        return new NotificationFiltersType();
    }

    /**
     * Create an instance of {@link VodType.ModStreamRentalList }
     * 
     */
    public VodType.ModStreamRentalList createVodTypeModStreamRentalList() {
        return new VodType.ModStreamRentalList();
    }

    /**
     * Create an instance of {@link EquipmentServicesType }
     * 
     */
    public EquipmentServicesType createEquipmentServicesType() {
        return new EquipmentServicesType();
    }

    /**
     * Create an instance of {@link SetUser }
     * 
     */
    public SetUser createSetUser() {
        return new SetUser();
    }

    /**
     * Create an instance of {@link ChannelManagerType.ChannelList.Channel }
     * 
     */
    public ChannelManagerType.ChannelList.Channel createChannelManagerTypeChannelListChannel() {
        return new ChannelManagerType.ChannelList.Channel();
    }

    /**
     * Create an instance of {@link UserPortalPreferencesType.Preference }
     * 
     */
    public UserPortalPreferencesType.Preference createUserPortalPreferencesTypePreference() {
        return new UserPortalPreferencesType.Preference();
    }

    /**
     * Create an instance of {@link UserServicesType }
     * 
     */
    public UserServicesType createUserServicesType() {
        return new UserServicesType();
    }

    /**
     * Create an instance of {@link BootstrapType.BootstrapReserveIMSEquipment }
     * 
     */
    public BootstrapType.BootstrapReserveIMSEquipment createBootstrapTypeBootstrapReserveIMSEquipment() {
        return new BootstrapType.BootstrapReserveIMSEquipment();
    }

    /**
     * Create an instance of {@link CreateGetEquipmentCommonDataType }
     * 
     */
    public CreateGetEquipmentCommonDataType createCreateGetEquipmentCommonDataType() {
        return new CreateGetEquipmentCommonDataType();
    }

    /**
     * Create an instance of {@link GetResponseMoAttributes }
     * 
     */
    public GetResponseMoAttributes createGetResponseMoAttributes() {
        return new GetResponseMoAttributes();
    }

    /**
     * Create an instance of {@link GetResponse }
     * 
     */
    public GetResponse createGetResponse() {
        return new GetResponse();
    }

    /**
     * Create an instance of {@link SetSubscriberCommonDataType }
     * 
     */
    public SetSubscriberCommonDataType createSetSubscriberCommonDataType() {
        return new SetSubscriberCommonDataType();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link BroadcastReminderType }
     * 
     */
    public BroadcastReminderType createBroadcastReminderType() {
        return new BroadcastReminderType();
    }

    /**
     * Create an instance of {@link ChargingType }
     * 
     */
    public ChargingType createChargingType() {
        return new ChargingType();
    }

    /**
     * Create an instance of {@link ReservedUsersType }
     * 
     */
    public ReservedUsersType createReservedUsersType() {
        return new ReservedUsersType();
    }

    /**
     * Create an instance of {@link NotificationFilterType }
     * 
     */
    public NotificationFilterType createNotificationFilterType() {
        return new NotificationFilterType();
    }

    /**
     * Create an instance of {@link Delete.MOAttributes }
     * 
     */
    public Delete.MOAttributes createDeleteMOAttributes() {
        return new Delete.MOAttributes();
    }

    /**
     * Create an instance of {@link CatchupTvType }
     * 
     */
    public CatchupTvType createCatchupTvType() {
        return new CatchupTvType();
    }

    /**
     * Create an instance of {@link VodType.SvodDownloadAuthorizationList }
     * 
     */
    public VodType.SvodDownloadAuthorizationList createVodTypeSvodDownloadAuthorizationList() {
        return new VodType.SvodDownloadAuthorizationList();
    }

    /**
     * Create an instance of {@link VodType.SvodDownloadAuthorizationList.Svod }
     * 
     */
    public VodType.SvodDownloadAuthorizationList.Svod createVodTypeSvodDownloadAuthorizationListSvod() {
        return new VodType.SvodDownloadAuthorizationList.Svod();
    }

    /**
     * Create an instance of {@link VodType.ModDownloadRentalList.Service }
     * 
     */
    public VodType.ModDownloadRentalList.Service createVodTypeModDownloadRentalListService() {
        return new VodType.ModDownloadRentalList.Service();
    }

    /**
     * Create an instance of {@link MOId }
     * 
     */
    public MOId createMOId() {
        return new MOId();
    }

    /**
     * Create an instance of {@link GetSubscriberCommonDataType }
     * 
     */
    public GetSubscriberCommonDataType createGetSubscriberCommonDataType() {
        return new GetSubscriberCommonDataType();
    }

    /**
     * Create an instance of {@link WhatsOnTvType }
     * 
     */
    public WhatsOnTvType createWhatsOnTvType() {
        return new WhatsOnTvType();
    }

    /**
     * Create an instance of {@link ImsBootstrapType.NoAuthentication }
     * 
     */
    public ImsBootstrapType.NoAuthentication createImsBootstrapTypeNoAuthentication() {
        return new ImsBootstrapType.NoAuthentication();
    }

    /**
     * Create an instance of {@link PayPerViewType.EventList.Event }
     * 
     */
    public PayPerViewType.EventList.Event createPayPerViewTypeEventListEvent() {
        return new PayPerViewType.EventList.Event();
    }

    /**
     * Create an instance of {@link VodType }
     * 
     */
    public VodType createVodType() {
        return new VodType();
    }

    /**
     * Create an instance of {@link EquipmentPortalPreferencesType }
     * 
     */
    public EquipmentPortalPreferencesType createEquipmentPortalPreferencesType() {
        return new EquipmentPortalPreferencesType();
    }

    /**
     * Create an instance of {@link SetResponse }
     * 
     */
    public SetResponse createSetResponse() {
        return new SetResponse();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link GetResponseSubscriber.Users }
     * 
     */
    public GetResponseSubscriber.Users createGetResponseSubscriberUsers() {
        return new GetResponseSubscriber.Users();
    }

    /**
     * Create an instance of {@link ChannelManagerType.ChannelPackageList }
     * 
     */
    public ChannelManagerType.ChannelPackageList createChannelManagerTypeChannelPackageList() {
        return new ChannelManagerType.ChannelPackageList();
    }

    /**
     * Create an instance of {@link BootstrapType.BootstrapReservePlainEquipment.NoAuthentication }
     * 
     */
    public BootstrapType.BootstrapReservePlainEquipment.NoAuthentication createBootstrapTypeBootstrapReservePlainEquipmentNoAuthentication() {
        return new BootstrapType.BootstrapReservePlainEquipment.NoAuthentication();
    }

    /**
     * Create an instance of {@link Notify.NotificationData }
     * 
     */
    public Notify.NotificationData createNotifyNotificationData() {
        return new Notify.NotificationData();
    }

    /**
     * Create an instance of {@link VodType.SvodStreamAuthorizationList.Svod }
     * 
     */
    public VodType.SvodStreamAuthorizationList.Svod createVodTypeSvodStreamAuthorizationListSvod() {
        return new VodType.SvodStreamAuthorizationList.Svod();
    }

    /**
     * Create an instance of {@link UnsubscribeResponse }
     * 
     */
    public UnsubscribeResponse createUnsubscribeResponse() {
        return new UnsubscribeResponse();
    }

    /**
     * Create an instance of {@link ImsBootstrapType.DeviceSettings.Subscriber }
     * 
     */
    public ImsBootstrapType.DeviceSettings.Subscriber createImsBootstrapTypeDeviceSettingsSubscriber() {
        return new ImsBootstrapType.DeviceSettings.Subscriber();
    }

    /**
     * Create an instance of {@link SearchFilterType }
     * 
     */
    public SearchFilterType createSearchFilterType() {
        return new SearchFilterType();
    }

    /**
     * Create an instance of {@link SubscriberPortalPreferencesType }
     * 
     */
    public SubscriberPortalPreferencesType createSubscriberPortalPreferencesType() {
        return new SubscriberPortalPreferencesType();
    }

    /**
     * Create an instance of {@link SearchResponse }
     * 
     */
    public SearchResponse createSearchResponse() {
        return new SearchResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VodType.ModDownloadRentalList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/", name = "modDownloadRentalList", scope = VodType.class)
    public JAXBElement<VodType.ModDownloadRentalList> createVodTypeModDownloadRentalList(VodType.ModDownloadRentalList value) {
        return new JAXBElement<VodType.ModDownloadRentalList>(_VodTypeModDownloadRentalList_QNAME, VodType.ModDownloadRentalList.class, VodType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VodType.ModStreamRentalList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/", name = "modStreamRentalList", scope = VodType.class)
    public JAXBElement<VodType.ModStreamRentalList> createVodTypeModStreamRentalList(VodType.ModStreamRentalList value) {
        return new JAXBElement<VodType.ModStreamRentalList>(_VodTypeModStreamRentalList_QNAME, VodType.ModStreamRentalList.class, VodType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VodType.SvodDownloadAuthorizationList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/", name = "svodDownloadAuthorizationList", scope = VodType.class)
    public JAXBElement<VodType.SvodDownloadAuthorizationList> createVodTypeSvodDownloadAuthorizationList(VodType.SvodDownloadAuthorizationList value) {
        return new JAXBElement<VodType.SvodDownloadAuthorizationList>(_VodTypeSvodDownloadAuthorizationList_QNAME, VodType.SvodDownloadAuthorizationList.class, VodType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VodType.SvodStreamAuthorizationList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/", name = "svodStreamAuthorizationList", scope = VodType.class)
    public JAXBElement<VodType.SvodStreamAuthorizationList> createVodTypeSvodStreamAuthorizationList(VodType.SvodStreamAuthorizationList value) {
        return new JAXBElement<VodType.SvodStreamAuthorizationList>(_VodTypeSvodStreamAuthorizationList_QNAME, VodType.SvodStreamAuthorizationList.class, VodType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractDeleteRequestAttributeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ericsson.com/cai3g1.2/", name = "DeleteRequestMODefinition")
    public JAXBElement<AbstractDeleteRequestAttributeType> createDeleteRequestMODefinition(AbstractDeleteRequestAttributeType value) {
        return new JAXBElement<AbstractDeleteRequestAttributeType>(_DeleteRequestMODefinition_QNAME, AbstractDeleteRequestAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractSetAttributeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ericsson.com/cai3g1.2/", name = "SetMODefinition")
    public JAXBElement<AbstractSetAttributeType> createSetMODefinition(AbstractSetAttributeType value) {
        return new JAXBElement<AbstractSetAttributeType>(_SetMODefinition_QNAME, AbstractSetAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ericsson.com/cai3g1.2/", name = "TransactionId")
    public JAXBElement<BigInteger> createTransactionId(BigInteger value) {
        return new JAXBElement<BigInteger>(_TransactionId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ericsson.com/cai3g1.2/", name = "SessionId")
    public JAXBElement<String> createSessionId(String value) {
        return new JAXBElement<String>(_SessionId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ericsson.com/cai3g1.2/", name = "SequenceId")
    public JAXBElement<BigInteger> createSequenceId(BigInteger value) {
        return new JAXBElement<BigInteger>(_SequenceId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractCreateAttributeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ericsson.com/cai3g1.2/", name = "CreateMODefinition")
    public JAXBElement<AbstractCreateAttributeType> createCreateMODefinition(AbstractCreateAttributeType value) {
        return new JAXBElement<AbstractCreateAttributeType>(_CreateMODefinition_QNAME, AbstractCreateAttributeType.class, null, value);
    }

}
