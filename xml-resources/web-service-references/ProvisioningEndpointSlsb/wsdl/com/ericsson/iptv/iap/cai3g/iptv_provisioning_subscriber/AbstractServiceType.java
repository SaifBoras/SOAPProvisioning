//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.09.28 at 06:45:39 PM EEST 
//


package com.ericsson.iptv.iap.cai3g.iptv_provisioning_subscriber;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbstractServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractServiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="delete" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractServiceType")
@XmlSeeAlso({
    PortalSelectorType.class,
    NetworkTimeshiftType.class,
    SubscriberPortalPreferencesType.class,
    SubscriberAccountIdentityType.class,
    IptvProxyType.class,
    BroadcastReminderType.class,
    VodType.class,
    CatchupTvType.class,
    ChannelManagerType.class,
    BootstrapType.class,
    RemoteAuthorizationType.class,
    PayPerViewType.class,
    WhatsOnTvType.class,
    NpvrType.class,
    LpvrType.class,
    ReservedUsersType.class,
    LocalTimeshiftType.class
})
public abstract class AbstractServiceType {

    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String delete;

    /**
     * Gets the value of the delete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelete() {
        if (delete == null) {
            return "false";
        } else {
            return delete;
        }
    }

    /**
     * Sets the value of the delete property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelete(String value) {
        this.delete = value;
    }

}
