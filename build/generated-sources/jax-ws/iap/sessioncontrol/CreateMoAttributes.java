
package iap.sessioncontrol;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateMoAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateMoAttributes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/}createSubscriber" minOccurs="0"/>
 *         &lt;element ref="{http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_user/}createUser" minOccurs="0"/>
 *         &lt;element ref="{http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_equipment/}createEquipment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateMoAttributes", propOrder = {
    "createSubscriber",
    "createUser",
    "createEquipment"
})
public class CreateMoAttributes {

    @XmlElement(namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/")
    protected CreateSubscriber createSubscriber;
    @XmlElement(namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_user/")
    protected CreateUser createUser;
    @XmlElement(namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_equipment/")
    protected CreateEquipment createEquipment;

    /**
     * Gets the value of the createSubscriber property.
     * 
     * @return
     *     possible object is
     *     {@link CreateSubscriber }
     *     
     */
    public CreateSubscriber getCreateSubscriber() {
        return createSubscriber;
    }

    /**
     * Sets the value of the createSubscriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateSubscriber }
     *     
     */
    public void setCreateSubscriber(CreateSubscriber value) {
        this.createSubscriber = value;
    }

    /**
     * Gets the value of the createUser property.
     * 
     * @return
     *     possible object is
     *     {@link CreateUser }
     *     
     */
    public CreateUser getCreateUser() {
        return createUser;
    }

    /**
     * Sets the value of the createUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateUser }
     *     
     */
    public void setCreateUser(CreateUser value) {
        this.createUser = value;
    }

    /**
     * Gets the value of the createEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link CreateEquipment }
     *     
     */
    public CreateEquipment getCreateEquipment() {
        return createEquipment;
    }

    /**
     * Sets the value of the createEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateEquipment }
     *     
     */
    public void setCreateEquipment(CreateEquipment value) {
        this.createEquipment = value;
    }

}
