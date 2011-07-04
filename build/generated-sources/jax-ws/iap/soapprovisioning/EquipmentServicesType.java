
package iap.soapprovisioning;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EquipmentServicesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquipmentServicesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="equipmentPortalPreferences" type="{http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_equipment/}EquipmentPortalPreferencesType" minOccurs="0" form="qualified"/>
 *         &lt;element name="plainBootstrap" type="{http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_equipment/}PlainBootstrapType" minOccurs="0" form="qualified"/>
 *         &lt;element name="imsBootstrap" type="{http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_equipment/}ImsBootstrapType" minOccurs="0" form="qualified"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentServicesType", namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_equipment/", propOrder = {

})
public class EquipmentServicesType {

    protected EquipmentPortalPreferencesType equipmentPortalPreferences;
    protected PlainBootstrapType plainBootstrap;
    protected ImsBootstrapType imsBootstrap;

    /**
     * Gets the value of the equipmentPortalPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentPortalPreferencesType }
     *     
     */
    public EquipmentPortalPreferencesType getEquipmentPortalPreferences() {
        return equipmentPortalPreferences;
    }

    /**
     * Sets the value of the equipmentPortalPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentPortalPreferencesType }
     *     
     */
    public void setEquipmentPortalPreferences(EquipmentPortalPreferencesType value) {
        this.equipmentPortalPreferences = value;
    }

    /**
     * Gets the value of the plainBootstrap property.
     * 
     * @return
     *     possible object is
     *     {@link PlainBootstrapType }
     *     
     */
    public PlainBootstrapType getPlainBootstrap() {
        return plainBootstrap;
    }

    /**
     * Sets the value of the plainBootstrap property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlainBootstrapType }
     *     
     */
    public void setPlainBootstrap(PlainBootstrapType value) {
        this.plainBootstrap = value;
    }

    /**
     * Gets the value of the imsBootstrap property.
     * 
     * @return
     *     possible object is
     *     {@link ImsBootstrapType }
     *     
     */
    public ImsBootstrapType getImsBootstrap() {
        return imsBootstrap;
    }

    /**
     * Sets the value of the imsBootstrap property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImsBootstrapType }
     *     
     */
    public void setImsBootstrap(ImsBootstrapType value) {
        this.imsBootstrap = value;
    }

}
