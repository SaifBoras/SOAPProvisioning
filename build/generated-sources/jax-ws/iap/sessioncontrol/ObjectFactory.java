
package iap.sessioncontrol;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the iap.sessioncontrol package. 
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

    private final static QName _DeleteRequestMODefinition_QNAME = new QName("http://schemas.ericsson.com/cai3g1.2/", "DeleteRequestMODefinition");
    private final static QName _SetMODefinition_QNAME = new QName("http://schemas.ericsson.com/cai3g1.2/", "SetMODefinition");
    private final static QName _TransactionId_QNAME = new QName("http://schemas.ericsson.com/cai3g1.2/", "TransactionId");
    private final static QName _SessionId_QNAME = new QName("http://schemas.ericsson.com/cai3g1.2/", "SessionId");
    private final static QName _SequenceId_QNAME = new QName("http://schemas.ericsson.com/cai3g1.2/", "SequenceId");
    private final static QName _CreateMODefinition_QNAME = new QName("http://schemas.ericsson.com/cai3g1.2/", "CreateMODefinition");
    private final static QName _GetMODefinition_QNAME = new QName("http://schemas.ericsson.com/cai3g1.2/", "GetMODefinition");
    private final static QName _GetRequestMODefinition_QNAME = new QName("http://schemas.ericsson.com/cai3g1.2/", "GetRequestMODefinition");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: iap.sessioncontrol
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateEquipment }
     * 
     */
    public CreateEquipment createCreateEquipment() {
        return new CreateEquipment();
    }

    /**
     * Create an instance of {@link GetUserCommonDataType }
     * 
     */
    public GetUserCommonDataType createGetUserCommonDataType() {
        return new GetUserCommonDataType();
    }

    /**
     * Create an instance of {@link SetMoAttributes }
     * 
     */
    public SetMoAttributes createSetMoAttributes() {
        return new SetMoAttributes();
    }

    /**
     * Create an instance of {@link GetSubscriberCommonDataType }
     * 
     */
    public GetSubscriberCommonDataType createGetSubscriberCommonDataType() {
        return new GetSubscriberCommonDataType();
    }

    /**
     * Create an instance of {@link Cai3GFault.Faultreason }
     * 
     */
    public Cai3GFault.Faultreason createCai3GFaultFaultreason() {
        return new Cai3GFault.Faultreason();
    }

    /**
     * Create an instance of {@link SetUser }
     * 
     */
    public SetUser createSetUser() {
        return new SetUser();
    }

    /**
     * Create an instance of {@link BlockedStateType }
     * 
     */
    public BlockedStateType createBlockedStateType() {
        return new BlockedStateType();
    }

    /**
     * Create an instance of {@link Cai3GFault.Details }
     * 
     */
    public Cai3GFault.Details createCai3GFaultDetails() {
        return new Cai3GFault.Details();
    }

    /**
     * Create an instance of {@link SetEquipment }
     * 
     */
    public SetEquipment createSetEquipment() {
        return new SetEquipment();
    }

    /**
     * Create an instance of {@link CreateUserCommonDataType }
     * 
     */
    public CreateUserCommonDataType createCreateUserCommonDataType() {
        return new CreateUserCommonDataType();
    }

    /**
     * Create an instance of {@link Logout }
     * 
     */
    public Logout createLogout() {
        return new Logout();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link AnySequenceType }
     * 
     */
    public AnySequenceType createAnySequenceType() {
        return new AnySequenceType();
    }

    /**
     * Create an instance of {@link Notify.NotificationData }
     * 
     */
    public Notify.NotificationData createNotifyNotificationData() {
        return new Notify.NotificationData();
    }

    /**
     * Create an instance of {@link SearchFiltersType }
     * 
     */
    public SearchFiltersType createSearchFiltersType() {
        return new SearchFiltersType();
    }

    /**
     * Create an instance of {@link CreateUser }
     * 
     */
    public CreateUser createCreateUser() {
        return new CreateUser();
    }

    /**
     * Create an instance of {@link SetResponse }
     * 
     */
    public SetResponse createSetResponse() {
        return new SetResponse();
    }

    /**
     * Create an instance of {@link SearchFilterType }
     * 
     */
    public SearchFilterType createSearchFilterType() {
        return new SearchFilterType();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link Subscribe }
     * 
     */
    public Subscribe createSubscribe() {
        return new Subscribe();
    }

    /**
     * Create an instance of {@link Delete.MOAttributes }
     * 
     */
    public Delete.MOAttributes createDeleteMOAttributes() {
        return new Delete.MOAttributes();
    }

    /**
     * Create an instance of {@link CreateGetEquipmentCommonDataType }
     * 
     */
    public CreateGetEquipmentCommonDataType createCreateGetEquipmentCommonDataType() {
        return new CreateGetEquipmentCommonDataType();
    }

    /**
     * Create an instance of {@link Unsubscribe }
     * 
     */
    public Unsubscribe createUnsubscribe() {
        return new Unsubscribe();
    }

    /**
     * Create an instance of {@link CreateMoAttributes }
     * 
     */
    public CreateMoAttributes createCreateMoAttributes() {
        return new CreateMoAttributes();
    }

    /**
     * Create an instance of {@link SearchResponse }
     * 
     */
    public SearchResponse createSearchResponse() {
        return new SearchResponse();
    }

    /**
     * Create an instance of {@link UnsubscribeResponse }
     * 
     */
    public UnsubscribeResponse createUnsubscribeResponse() {
        return new UnsubscribeResponse();
    }

    /**
     * Create an instance of {@link TransactionIdFault }
     * 
     */
    public TransactionIdFault createTransactionIdFault() {
        return new TransactionIdFault();
    }

    /**
     * Create an instance of {@link NotifyResponse }
     * 
     */
    public NotifyResponse createNotifyResponse() {
        return new NotifyResponse();
    }

    /**
     * Create an instance of {@link Blocked }
     * 
     */
    public Blocked createBlocked() {
        return new Blocked();
    }

    /**
     * Create an instance of {@link CreateSubscriberCommonDataType }
     * 
     */
    public CreateSubscriberCommonDataType createCreateSubscriberCommonDataType() {
        return new CreateSubscriberCommonDataType();
    }

    /**
     * Create an instance of {@link AnyMOIdType }
     * 
     */
    public AnyMOIdType createAnyMOIdType() {
        return new AnyMOIdType();
    }

    /**
     * Create an instance of {@link GetResponseMOAttributesType }
     * 
     */
    public GetResponseMOAttributesType createGetResponseMOAttributesType() {
        return new GetResponseMOAttributesType();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link Get.MOAttributes }
     * 
     */
    public Get.MOAttributes createGetMOAttributes() {
        return new Get.MOAttributes();
    }

    /**
     * Create an instance of {@link GetResponseUser }
     * 
     */
    public GetResponseUser createGetResponseUser() {
        return new GetResponseUser();
    }

    /**
     * Create an instance of {@link NotificationFilterType }
     * 
     */
    public NotificationFilterType createNotificationFilterType() {
        return new NotificationFilterType();
    }

    /**
     * Create an instance of {@link MOId }
     * 
     */
    public MOId createMOId() {
        return new MOId();
    }

    /**
     * Create an instance of {@link Get }
     * 
     */
    public Get createGet() {
        return new Get();
    }

    /**
     * Create an instance of {@link HeaderFaultType }
     * 
     */
    public HeaderFaultType createHeaderFaultType() {
        return new HeaderFaultType();
    }

    /**
     * Create an instance of {@link SequenceIdFault }
     * 
     */
    public SequenceIdFault createSequenceIdFault() {
        return new SequenceIdFault();
    }

    /**
     * Create an instance of {@link Cai3GFault }
     * 
     */
    public Cai3GFault createCai3GFault() {
        return new Cai3GFault();
    }

    /**
     * Create an instance of {@link NotificationFiltersType }
     * 
     */
    public NotificationFiltersType createNotificationFiltersType() {
        return new NotificationFiltersType();
    }

    /**
     * Create an instance of {@link GetResponse }
     * 
     */
    public GetResponse createGetResponse() {
        return new GetResponse();
    }

    /**
     * Create an instance of {@link Notify }
     * 
     */
    public Notify createNotify() {
        return new Notify();
    }

    /**
     * Create an instance of {@link GetResponseSubscriber.Equipment }
     * 
     */
    public GetResponseSubscriber.Equipment createGetResponseSubscriberEquipment() {
        return new GetResponseSubscriber.Equipment();
    }

    /**
     * Create an instance of {@link CreateSubscriber }
     * 
     */
    public CreateSubscriber createCreateSubscriber() {
        return new CreateSubscriber();
    }

    /**
     * Create an instance of {@link SetUserCommonDataType }
     * 
     */
    public SetUserCommonDataType createSetUserCommonDataType() {
        return new SetUserCommonDataType();
    }

    /**
     * Create an instance of {@link SetEquipmentCommonDataType }
     * 
     */
    public SetEquipmentCommonDataType createSetEquipmentCommonDataType() {
        return new SetEquipmentCommonDataType();
    }

    /**
     * Create an instance of {@link SetSubscriber }
     * 
     */
    public SetSubscriber createSetSubscriber() {
        return new SetSubscriber();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link Create }
     * 
     */
    public Create createCreate() {
        return new Create();
    }

    /**
     * Create an instance of {@link GetResponseEquipment }
     * 
     */
    public GetResponseEquipment createGetResponseEquipment() {
        return new GetResponseEquipment();
    }

    /**
     * Create an instance of {@link Search }
     * 
     */
    public Search createSearch() {
        return new Search();
    }

    /**
     * Create an instance of {@link Set }
     * 
     */
    public Set createSet() {
        return new Set();
    }

    /**
     * Create an instance of {@link SubscribeResponse }
     * 
     */
    public SubscribeResponse createSubscribeResponse() {
        return new SubscribeResponse();
    }

    /**
     * Create an instance of {@link SessionIdFault }
     * 
     */
    public SessionIdFault createSessionIdFault() {
        return new SessionIdFault();
    }

    /**
     * Create an instance of {@link NotificationHeaderType }
     * 
     */
    public NotificationHeaderType createNotificationHeaderType() {
        return new NotificationHeaderType();
    }

    /**
     * Create an instance of {@link GetResponseMoAttributes }
     * 
     */
    public GetResponseMoAttributes createGetResponseMoAttributes() {
        return new GetResponseMoAttributes();
    }

    /**
     * Create an instance of {@link CreateResponse }
     * 
     */
    public CreateResponse createCreateResponse() {
        return new CreateResponse();
    }

    /**
     * Create an instance of {@link SetSubscriberCommonDataType }
     * 
     */
    public SetSubscriberCommonDataType createSetSubscriberCommonDataType() {
        return new SetSubscriberCommonDataType();
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
     * Create an instance of {@link GetResponseSubscriber }
     * 
     */
    public GetResponseSubscriber createGetResponseSubscriber() {
        return new GetResponseSubscriber();
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

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractGetAttributeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ericsson.com/cai3g1.2/", name = "GetMODefinition")
    public JAXBElement<AbstractGetAttributeType> createGetMODefinition(AbstractGetAttributeType value) {
        return new JAXBElement<AbstractGetAttributeType>(_GetMODefinition_QNAME, AbstractGetAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractGetRequestAttributeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.ericsson.com/cai3g1.2/", name = "GetRequestMODefinition")
    public JAXBElement<AbstractGetRequestAttributeType> createGetRequestMODefinition(AbstractGetRequestAttributeType value) {
        return new JAXBElement<AbstractGetRequestAttributeType>(_GetRequestMODefinition_QNAME, AbstractGetRequestAttributeType.class, null, value);
    }

}
