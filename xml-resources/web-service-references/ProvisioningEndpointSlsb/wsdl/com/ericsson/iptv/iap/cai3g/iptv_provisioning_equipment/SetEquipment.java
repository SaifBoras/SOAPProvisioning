//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.09.28 at 06:45:39 PM EEST 
//


package com.ericsson.iptv.iap.cai3g.iptv_provisioning_equipment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.ericsson.schemas.cai3g1.AnySequenceType;


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
 *         &lt;element name="commonData" type="{http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_equipment/}SetEquipmentCommonDataType" minOccurs="0" form="qualified"/>
 *         &lt;element name="services" type="{http://schemas.ericsson.com/cai3g1.2/}AnySequenceType" minOccurs="0" form="qualified"/>
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
    "commonData",
    "services"
})
@XmlRootElement(name = "setEquipment")
public class SetEquipment {

    protected SetEquipmentCommonDataType commonData;
    protected AnySequenceType services;
    @XmlAttribute(required = true)
    protected String equipmentId;

    /**
     * Gets the value of the commonData property.
     * 
     * @return
     *     possible object is
     *     {@link SetEquipmentCommonDataType }
     *     
     */
    public SetEquipmentCommonDataType getCommonData() {
        return commonData;
    }

    /**
     * Sets the value of the commonData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetEquipmentCommonDataType }
     *     
     */
    public void setCommonData(SetEquipmentCommonDataType value) {
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

}