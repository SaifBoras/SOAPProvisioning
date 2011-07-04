
package iap.sessioncontrol;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for NotificationHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cai3gUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MOType" type="{http://schemas.ericsson.com/cai3g1.2/}MoType"/>
 *         &lt;element name="MOId" type="{http://schemas.ericsson.com/cai3g1.2/}AnyMOIdType"/>
 *         &lt;element name="notificationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eventTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="notificationActor" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="operation" type="{http://schemas.ericsson.com/cai3g1.2/}NotificationOperationType"/>
 *         &lt;element name="subscriptionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationHeaderType", propOrder = {
    "cai3GUser",
    "moType",
    "moId",
    "notificationId",
    "eventTime",
    "notificationActor",
    "operation",
    "subscriptionId"
})
public class NotificationHeaderType {

    @XmlElement(name = "cai3gUser", required = true)
    protected String cai3GUser;
    @XmlElement(name = "MOType", required = true)
    protected MoType moType;
    @XmlElement(name = "MOId", required = true)
    protected AnyMOIdType moId;
    protected String notificationId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventTime;
    @XmlSchemaType(name = "anyURI")
    protected String notificationActor;
    @XmlElement(required = true)
    protected NotificationOperationType operation;
    @XmlElement(required = true)
    protected String subscriptionId;

    /**
     * Gets the value of the cai3GUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCai3GUser() {
        return cai3GUser;
    }

    /**
     * Sets the value of the cai3GUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCai3GUser(String value) {
        this.cai3GUser = value;
    }

    /**
     * Gets the value of the moType property.
     * 
     * @return
     *     possible object is
     *     {@link MoType }
     *     
     */
    public MoType getMOType() {
        return moType;
    }

    /**
     * Sets the value of the moType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoType }
     *     
     */
    public void setMOType(MoType value) {
        this.moType = value;
    }

    /**
     * Gets the value of the moId property.
     * 
     * @return
     *     possible object is
     *     {@link AnyMOIdType }
     *     
     */
    public AnyMOIdType getMOId() {
        return moId;
    }

    /**
     * Sets the value of the moId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyMOIdType }
     *     
     */
    public void setMOId(AnyMOIdType value) {
        this.moId = value;
    }

    /**
     * Gets the value of the notificationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationId() {
        return notificationId;
    }

    /**
     * Sets the value of the notificationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationId(String value) {
        this.notificationId = value;
    }

    /**
     * Gets the value of the eventTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventTime() {
        return eventTime;
    }

    /**
     * Sets the value of the eventTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventTime(XMLGregorianCalendar value) {
        this.eventTime = value;
    }

    /**
     * Gets the value of the notificationActor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationActor() {
        return notificationActor;
    }

    /**
     * Sets the value of the notificationActor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationActor(String value) {
        this.notificationActor = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationOperationType }
     *     
     */
    public NotificationOperationType getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationOperationType }
     *     
     */
    public void setOperation(NotificationOperationType value) {
        this.operation = value;
    }

    /**
     * Gets the value of the subscriptionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Sets the value of the subscriptionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionId(String value) {
        this.subscriptionId = value;
    }

}
