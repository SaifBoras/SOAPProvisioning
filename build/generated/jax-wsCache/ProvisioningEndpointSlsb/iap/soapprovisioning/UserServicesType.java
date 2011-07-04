
package iap.soapprovisioning;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserServicesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserServicesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="charging" type="{http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_user/}ChargingType" minOccurs="0" form="qualified"/>
 *         &lt;element name="userAccountIdentity" type="{http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_user/}UserAccountIdentityType" minOccurs="0" form="qualified"/>
 *         &lt;element name="userPortalPreferences" type="{http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_user/}UserPortalPreferencesType" minOccurs="0" form="qualified"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserServicesType", namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_user/", propOrder = {

})
public class UserServicesType {

    protected ChargingType charging;
    protected UserAccountIdentityType userAccountIdentity;
    protected UserPortalPreferencesType userPortalPreferences;

    /**
     * Gets the value of the charging property.
     * 
     * @return
     *     possible object is
     *     {@link ChargingType }
     *     
     */
    public ChargingType getCharging() {
        return charging;
    }

    /**
     * Sets the value of the charging property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargingType }
     *     
     */
    public void setCharging(ChargingType value) {
        this.charging = value;
    }

    /**
     * Gets the value of the userAccountIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link UserAccountIdentityType }
     *     
     */
    public UserAccountIdentityType getUserAccountIdentity() {
        return userAccountIdentity;
    }

    /**
     * Sets the value of the userAccountIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAccountIdentityType }
     *     
     */
    public void setUserAccountIdentity(UserAccountIdentityType value) {
        this.userAccountIdentity = value;
    }

    /**
     * Gets the value of the userPortalPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link UserPortalPreferencesType }
     *     
     */
    public UserPortalPreferencesType getUserPortalPreferences() {
        return userPortalPreferences;
    }

    /**
     * Sets the value of the userPortalPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserPortalPreferencesType }
     *     
     */
    public void setUserPortalPreferences(UserPortalPreferencesType value) {
        this.userPortalPreferences = value;
    }

}
