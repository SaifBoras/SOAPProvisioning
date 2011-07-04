
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
 *         &lt;element name="equipmentId" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="commonData" type="{http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_equipment/}CreateGetEquipmentCommonDataType" form="qualified"/>
 *         &lt;element name="services" type="{http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_equipment/}EquipmentServicesType" form="qualified"/>
 *       &lt;/sequence>
 *       &lt;attribute name="equipmentId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "equipmentId",
    "commonData",
    "services"
})
@XmlRootElement(name = "getResponseEquipment", namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_equipment/")
public class GetResponseEquipment {

    @XmlElement(namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_equipment/", required = true)
    protected String equipmentId;
    @XmlElement(namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_equipment/", required = true)
    protected CreateGetEquipmentCommonDataType commonData;
    @XmlElement(namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_equipment/", required = true)
    protected EquipmentServicesType services;
    @XmlAttribute(name = "equipmentId", required = true)
    protected String getResponseEquipmentIdattribute;

    /**
     * Gets the value of the equipmentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentId() {
        return equipmentId;
    }

    /**
     * Sets the value of the equipmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentId(String value) {
        this.equipmentId = value;
    }

    /**
     * Gets the value of the commonData property.
     * 
     * @return
     *     possible object is
     *     {@link CreateGetEquipmentCommonDataType }
     *     
     */
    public CreateGetEquipmentCommonDataType getCommonData() {
        return commonData;
    }

    /**
     * Sets the value of the commonData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateGetEquipmentCommonDataType }
     *     
     */
    public void setCommonData(CreateGetEquipmentCommonDataType value) {
        this.commonData = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentServicesType }
     *     
     */
    public EquipmentServicesType getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentServicesType }
     *     
     */
    public void setServices(EquipmentServicesType value) {
        this.services = value;
    }

    /**
     * Gets the value of the getResponseEquipmentIdattribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetResponseEquipmentIdattribute() {
        return getResponseEquipmentIdattribute;
    }

    /**
     * Sets the value of the getResponseEquipmentIdattribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetResponseEquipmentIdattribute(String value) {
        this.getResponseEquipmentIdattribute = value;
    }

}
