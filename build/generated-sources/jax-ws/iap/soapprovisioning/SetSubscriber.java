
package iap.soapprovisioning;

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
 *         &lt;element name="commonData" type="{http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/}SetSubscriberCommonDataType" minOccurs="0" form="qualified"/>
 *         &lt;element name="services" type="{http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/}SubscriberServicesType" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *       &lt;attribute name="subscriberId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "commonData",
    "services"
})
@XmlRootElement(name = "setSubscriber", namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/")
public class SetSubscriber {

    @XmlElement(namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/")
    protected SetSubscriberCommonDataType commonData;
    @XmlElement(namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/")
    protected SubscriberServicesType services;
    @XmlAttribute(name = "subscriberId", required = true)
    protected String subscriberId;

    /**
     * Gets the value of the commonData property.
     * 
     * @return
     *     possible object is
     *     {@link SetSubscriberCommonDataType }
     *     
     */
    public SetSubscriberCommonDataType getCommonData() {
        return commonData;
    }

    /**
     * Sets the value of the commonData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetSubscriberCommonDataType }
     *     
     */
    public void setCommonData(SetSubscriberCommonDataType value) {
        this.commonData = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberServicesType }
     *     
     */
    public SubscriberServicesType getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberServicesType }
     *     
     */
    public void setServices(SubscriberServicesType value) {
        this.services = value;
    }

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

}
