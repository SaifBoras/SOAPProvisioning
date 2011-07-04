
package iap.sessioncontrol;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateSubscriberCommonDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateSubscriberCommonDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="blockedState" type="{http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/}BlockedStateType" form="qualified"/>
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="serviceRegion" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateSubscriberCommonDataType", namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/", propOrder = {
    "blockedState",
    "postalCode",
    "serviceRegion"
})
public class CreateSubscriberCommonDataType {

    @XmlElement(required = true)
    protected BlockedStateType blockedState;
    @XmlElement(required = true)
    protected String postalCode;
    @XmlElement(required = true)
    protected String serviceRegion;

    /**
     * Gets the value of the blockedState property.
     * 
     * @return
     *     possible object is
     *     {@link BlockedStateType }
     *     
     */
    public BlockedStateType getBlockedState() {
        return blockedState;
    }

    /**
     * Sets the value of the blockedState property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockedStateType }
     *     
     */
    public void setBlockedState(BlockedStateType value) {
        this.blockedState = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the serviceRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceRegion() {
        return serviceRegion;
    }

    /**
     * Sets the value of the serviceRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceRegion(String value) {
        this.serviceRegion = value;
    }

}
