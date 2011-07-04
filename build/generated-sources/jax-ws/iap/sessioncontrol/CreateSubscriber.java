
package iap.sessioncontrol;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="commonData" type="{http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/}CreateSubscriberCommonDataType" form="qualified"/>
 *         &lt;element name="services" type="{http://schemas.ericsson.com/cai3g1.2/}AnySequenceType" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *       &lt;attribute name="subscriberID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "subscriberId",
    "commonData",
    "services"
})
@XmlRootElement(name = "createSubscriber", namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/")
public class CreateSubscriber {

    @XmlElement(namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/", required = true)
    protected String subscriberId;
    @XmlElement(namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/", required = true)
    protected CreateSubscriberCommonDataType commonData;
    @XmlElement(namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/")
    protected AnySequenceType services;
    @XmlAttribute(name = "subscriberID", required = true)
    protected String subscriberID;

    /**
     * Gets the value of the subscriberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberId() {
        return subscriberId;
    }

    /**
     * Sets the value of the subscriberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberId(String value) {
        this.subscriberId = value;
    }

    /**
     * Gets the value of the commonData property.
     * 
     * @return
     *     possible object is
     *     {@link CreateSubscriberCommonDataType }
     *     
     */
    public CreateSubscriberCommonDataType getCommonData() {
        return commonData;
    }

    /**
     * Sets the value of the commonData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateSubscriberCommonDataType }
     *     
     */
    public void setCommonData(CreateSubscriberCommonDataType value) {
        this.commonData = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link AnySequenceType }
     *     
     */
    public AnySequenceType getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnySequenceType }
     *     
     */
    public void setServices(AnySequenceType value) {
        this.services = value;
    }

    /**
     * Gets the value of the subscriberID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberID() {
        return subscriberID;
    }

    /**
     * Sets the value of the subscriberID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberID(String value) {
        this.subscriberID = value;
    }

}
