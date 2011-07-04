
package iap.sessioncontrol;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetResponseMoAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetResponseMoAttributes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/}getResponseSubscriber" minOccurs="0"/>
 *         &lt;element ref="{http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_user/}getResponseUser" minOccurs="0"/>
 *         &lt;element ref="{http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_equipment/}getResponseEquipment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetResponseMoAttributes", propOrder = {
    "getResponseSubscriber",
    "getResponseUser",
    "getResponseEquipment"
})
public class GetResponseMoAttributes {

    @XmlElement(namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/")
    protected GetResponseSubscriber getResponseSubscriber;
    @XmlElement(namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_user/")
    protected GetResponseUser getResponseUser;
    @XmlElement(namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_equipment/")
    protected GetResponseEquipment getResponseEquipment;

    /**
     * Gets the value of the getResponseSubscriber property.
     * 
     * @return
     *     possible object is
     *     {@link GetResponseSubscriber }
     *     
     */
    public GetResponseSubscriber getGetResponseSubscriber() {
        return getResponseSubscriber;
    }

    /**
     * Sets the value of the getResponseSubscriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetResponseSubscriber }
     *     
     */
    public void setGetResponseSubscriber(GetResponseSubscriber value) {
        this.getResponseSubscriber = value;
    }

    /**
     * Gets the value of the getResponseUser property.
     * 
     * @return
     *     possible object is
     *     {@link GetResponseUser }
     *     
     */
    public GetResponseUser getGetResponseUser() {
        return getResponseUser;
    }

    /**
     * Sets the value of the getResponseUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetResponseUser }
     *     
     */
    public void setGetResponseUser(GetResponseUser value) {
        this.getResponseUser = value;
    }

    /**
     * Gets the value of the getResponseEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link GetResponseEquipment }
     *     
     */
    public GetResponseEquipment getGetResponseEquipment() {
        return getResponseEquipment;
    }

    /**
     * Sets the value of the getResponseEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetResponseEquipment }
     *     
     */
    public void setGetResponseEquipment(GetResponseEquipment value) {
        this.getResponseEquipment = value;
    }

}
