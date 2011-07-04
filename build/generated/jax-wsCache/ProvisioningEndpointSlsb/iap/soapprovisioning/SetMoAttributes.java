
package iap.soapprovisioning;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SetMoAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetMoAttributes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/}setSubscriber" minOccurs="0"/>
 *         &lt;element ref="{http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_user/}setUser" minOccurs="0"/>
 *         &lt;element ref="{http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_equipment/}setEquipment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetMoAttributes", propOrder = {
    "setSubscriber",
    "setUser",
    "setEquipment"
})
public class SetMoAttributes {

    @XmlElement(namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/")
    protected SetSubscriber setSubscriber;
    @XmlElement(namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_user/")
    protected SetUser setUser;
    @XmlElement(namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_equipment/")
    protected SetEquipment setEquipment;

    /**
     * Gets the value of the setSubscriber property.
     * 
     * @return
     *     possible object is
     *     {@link SetSubscriber }
     *     
     */
    public SetSubscriber getSetSubscriber() {
        return setSubscriber;
    }

    /**
     * Sets the value of the setSubscriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetSubscriber }
     *     
     */
    public void setSetSubscriber(SetSubscriber value) {
        this.setSubscriber = value;
    }

    /**
     * Gets the value of the setUser property.
     * 
     * @return
     *     possible object is
     *     {@link SetUser }
     *     
     */
    public SetUser getSetUser() {
        return setUser;
    }

    /**
     * Sets the value of the setUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetUser }
     *     
     */
    public void setSetUser(SetUser value) {
        this.setUser = value;
    }

    /**
     * Gets the value of the setEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link SetEquipment }
     *     
     */
    public SetEquipment getSetEquipment() {
        return setEquipment;
    }

    /**
     * Sets the value of the setEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetEquipment }
     *     
     */
    public void setSetEquipment(SetEquipment value) {
        this.setEquipment = value;
    }

}
