
package iap.soapprovisioning;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bootstrapType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bootstrapType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ericsson.com/cai3g1.2/}AbstractServiceType">
 *       &lt;sequence>
 *         &lt;element name="bootstrapReservePlainEquipment" maxOccurs="unbounded" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="deviceSettings" minOccurs="0" form="qualified">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="authentication" minOccurs="0" form="qualified">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="password" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="delete" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="noAuthentication" minOccurs="0" form="qualified">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="delete" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="simplePasswordAuthentication" minOccurs="0" form="qualified">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="delete" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="registrationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="equipmentId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="equipmentName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="bootstrapReserveIMSEquipment" maxOccurs="unbounded" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="deviceSettings" minOccurs="0" form="qualified">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="subscriber" minOccurs="0" form="qualified">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="impu" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="impi" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="password" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="user" maxOccurs="unbounded" minOccurs="0" form="qualified">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="delete" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                                     &lt;attribute name="impu" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="impi" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="password" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="delete" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="noAuthentication" minOccurs="0" form="qualified">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="delete" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="simplePasswordAuthentication" minOccurs="0" form="qualified">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="delete" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="registrationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="equipmentId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="equipmentName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bootstrapType", namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/", propOrder = {
    "bootstrapReservePlainEquipment",
    "bootstrapReserveIMSEquipment"
})
public class BootstrapType
    extends AbstractServiceType
{

    protected List<BootstrapType.BootstrapReservePlainEquipment> bootstrapReservePlainEquipment;
    protected List<BootstrapType.BootstrapReserveIMSEquipment> bootstrapReserveIMSEquipment;

    /**
     * Gets the value of the bootstrapReservePlainEquipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bootstrapReservePlainEquipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBootstrapReservePlainEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BootstrapType.BootstrapReservePlainEquipment }
     * 
     * 
     */
    public List<BootstrapType.BootstrapReservePlainEquipment> getBootstrapReservePlainEquipment() {
        if (bootstrapReservePlainEquipment == null) {
            bootstrapReservePlainEquipment = new ArrayList<BootstrapType.BootstrapReservePlainEquipment>();
        }
        return this.bootstrapReservePlainEquipment;
    }

    /**
     * Gets the value of the bootstrapReserveIMSEquipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bootstrapReserveIMSEquipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBootstrapReserveIMSEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BootstrapType.BootstrapReserveIMSEquipment }
     * 
     * 
     */
    public List<BootstrapType.BootstrapReserveIMSEquipment> getBootstrapReserveIMSEquipment() {
        if (bootstrapReserveIMSEquipment == null) {
            bootstrapReserveIMSEquipment = new ArrayList<BootstrapType.BootstrapReserveIMSEquipment>();
        }
        return this.bootstrapReserveIMSEquipment;
    }


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
     *         &lt;element name="deviceSettings" minOccurs="0" form="qualified">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="subscriber" minOccurs="0" form="qualified">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="impu" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="impi" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="password" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="user" maxOccurs="unbounded" minOccurs="0" form="qualified">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="delete" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *                           &lt;attribute name="impu" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="impi" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="password" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="delete" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="noAuthentication" minOccurs="0" form="qualified">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="delete" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="simplePasswordAuthentication" minOccurs="0" form="qualified">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="delete" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="registrationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="equipmentId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="equipmentName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "deviceSettings",
        "noAuthentication",
        "simplePasswordAuthentication"
    })
    public static class BootstrapReserveIMSEquipment {

        @XmlElement(namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/")
        protected BootstrapType.BootstrapReserveIMSEquipment.DeviceSettings deviceSettings;
        @XmlElement(namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/")
        protected BootstrapType.BootstrapReserveIMSEquipment.NoAuthentication noAuthentication;
        @XmlElement(namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/")
        protected BootstrapType.BootstrapReserveIMSEquipment.SimplePasswordAuthentication simplePasswordAuthentication;
        @XmlAttribute(name = "registrationCode", required = true)
        protected String registrationCode;
        @XmlAttribute(name = "equipmentId", required = true)
        protected String equipmentId;
        @XmlAttribute(name = "equipmentName")
        protected String equipmentName;

        /**
         * Gets the value of the deviceSettings property.
         * 
         * @return
         *     possible object is
         *     {@link BootstrapType.BootstrapReserveIMSEquipment.DeviceSettings }
         *     
         */
        public BootstrapType.BootstrapReserveIMSEquipment.DeviceSettings getDeviceSettings() {
            return deviceSettings;
        }

        /**
         * Sets the value of the deviceSettings property.
         * 
         * @param value
         *     allowed object is
         *     {@link BootstrapType.BootstrapReserveIMSEquipment.DeviceSettings }
         *     
         */
        public void setDeviceSettings(BootstrapType.BootstrapReserveIMSEquipment.DeviceSettings value) {
            this.deviceSettings = value;
        }

        /**
         * Gets the value of the noAuthentication property.
         * 
         * @return
         *     possible object is
         *     {@link BootstrapType.BootstrapReserveIMSEquipment.NoAuthentication }
         *     
         */
        public BootstrapType.BootstrapReserveIMSEquipment.NoAuthentication getNoAuthentication() {
            return noAuthentication;
        }

        /**
         * Sets the value of the noAuthentication property.
         * 
         * @param value
         *     allowed object is
         *     {@link BootstrapType.BootstrapReserveIMSEquipment.NoAuthentication }
         *     
         */
        public void setNoAuthentication(BootstrapType.BootstrapReserveIMSEquipment.NoAuthentication value) {
            this.noAuthentication = value;
        }

        /**
         * Gets the value of the simplePasswordAuthentication property.
         * 
         * @return
         *     possible object is
         *     {@link BootstrapType.BootstrapReserveIMSEquipment.SimplePasswordAuthentication }
         *     
         */
        public BootstrapType.BootstrapReserveIMSEquipment.SimplePasswordAuthentication getSimplePasswordAuthentication() {
            return simplePasswordAuthentication;
        }

        /**
         * Sets the value of the simplePasswordAuthentication property.
         * 
         * @param value
         *     allowed object is
         *     {@link BootstrapType.BootstrapReserveIMSEquipment.SimplePasswordAuthentication }
         *     
         */
        public void setSimplePasswordAuthentication(BootstrapType.BootstrapReserveIMSEquipment.SimplePasswordAuthentication value) {
            this.simplePasswordAuthentication = value;
        }

        /**
         * Gets the value of the registrationCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegistrationCode() {
            return registrationCode;
        }

        /**
         * Sets the value of the registrationCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegistrationCode(String value) {
            this.registrationCode = value;
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

        /**
         * Gets the value of the equipmentName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEquipmentName() {
            return equipmentName;
        }

        /**
         * Sets the value of the equipmentName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEquipmentName(String value) {
            this.equipmentName = value;
        }


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
         *         &lt;element name="subscriber" minOccurs="0" form="qualified">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="impu" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="impi" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="password" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="user" maxOccurs="unbounded" minOccurs="0" form="qualified">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="delete" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *                 &lt;attribute name="impu" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="impi" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="password" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="delete" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "subscriber",
            "user"
        })
        public static class DeviceSettings {

            @XmlElement(namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/")
            protected BootstrapType.BootstrapReserveIMSEquipment.DeviceSettings.Subscriber subscriber;
            @XmlElement(namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/")
            protected List<BootstrapType.BootstrapReserveIMSEquipment.DeviceSettings.User> user;
            @XmlAttribute(name = "delete")
            protected Boolean delete;

            /**
             * Gets the value of the subscriber property.
             * 
             * @return
             *     possible object is
             *     {@link BootstrapType.BootstrapReserveIMSEquipment.DeviceSettings.Subscriber }
             *     
             */
            public BootstrapType.BootstrapReserveIMSEquipment.DeviceSettings.Subscriber getSubscriber() {
                return subscriber;
            }

            /**
             * Sets the value of the subscriber property.
             * 
             * @param value
             *     allowed object is
             *     {@link BootstrapType.BootstrapReserveIMSEquipment.DeviceSettings.Subscriber }
             *     
             */
            public void setSubscriber(BootstrapType.BootstrapReserveIMSEquipment.DeviceSettings.Subscriber value) {
                this.subscriber = value;
            }

            /**
             * Gets the value of the user property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the user property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getUser().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BootstrapType.BootstrapReserveIMSEquipment.DeviceSettings.User }
             * 
             * 
             */
            public List<BootstrapType.BootstrapReserveIMSEquipment.DeviceSettings.User> getUser() {
                if (user == null) {
                    user = new ArrayList<BootstrapType.BootstrapReserveIMSEquipment.DeviceSettings.User>();
                }
                return this.user;
            }

            /**
             * Gets the value of the delete property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isDelete() {
                if (delete == null) {
                    return false;
                } else {
                    return delete;
                }
            }

            /**
             * Sets the value of the delete property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setDelete(Boolean value) {
                this.delete = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="impu" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="impi" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="password" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Subscriber {

                @XmlAttribute(name = "impu", required = true)
                protected String impu;
                @XmlAttribute(name = "impi")
                protected String impi;
                @XmlAttribute(name = "password")
                protected String password;

                /**
                 * Gets the value of the impu property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getImpu() {
                    return impu;
                }

                /**
                 * Sets the value of the impu property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setImpu(String value) {
                    this.impu = value;
                }

                /**
                 * Gets the value of the impi property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getImpi() {
                    return impi;
                }

                /**
                 * Sets the value of the impi property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setImpi(String value) {
                    this.impi = value;
                }

                /**
                 * Gets the value of the password property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPassword() {
                    return password;
                }

                /**
                 * Sets the value of the password property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPassword(String value) {
                    this.password = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="delete" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
             *       &lt;attribute name="impu" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="impi" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="password" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class User {

                @XmlAttribute(name = "delete")
                protected Boolean delete;
                @XmlAttribute(name = "impu", required = true)
                protected String impu;
                @XmlAttribute(name = "impi")
                protected String impi;
                @XmlAttribute(name = "password")
                protected String password;

                /**
                 * Gets the value of the delete property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public boolean isDelete() {
                    if (delete == null) {
                        return false;
                    } else {
                        return delete;
                    }
                }

                /**
                 * Sets the value of the delete property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setDelete(Boolean value) {
                    this.delete = value;
                }

                /**
                 * Gets the value of the impu property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getImpu() {
                    return impu;
                }

                /**
                 * Sets the value of the impu property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setImpu(String value) {
                    this.impu = value;
                }

                /**
                 * Gets the value of the impi property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getImpi() {
                    return impi;
                }

                /**
                 * Sets the value of the impi property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setImpi(String value) {
                    this.impi = value;
                }

                /**
                 * Gets the value of the password property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPassword() {
                    return password;
                }

                /**
                 * Sets the value of the password property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPassword(String value) {
                    this.password = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="delete" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class NoAuthentication {

            @XmlAttribute(name = "delete")
            protected Boolean delete;

            /**
             * Gets the value of the delete property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isDelete() {
                if (delete == null) {
                    return false;
                } else {
                    return delete;
                }
            }

            /**
             * Sets the value of the delete property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setDelete(Boolean value) {
                this.delete = value;
            }

        }


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
         *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
         *       &lt;/sequence>
         *       &lt;attribute name="delete" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "password"
        })
        public static class SimplePasswordAuthentication {

            @XmlElement(namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/")
            protected String password;
            @XmlAttribute(name = "delete")
            protected Boolean delete;

            /**
             * Gets the value of the password property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPassword() {
                return password;
            }

            /**
             * Sets the value of the password property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPassword(String value) {
                this.password = value;
            }

            /**
             * Gets the value of the delete property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isDelete() {
                if (delete == null) {
                    return false;
                } else {
                    return delete;
                }
            }

            /**
             * Sets the value of the delete property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setDelete(Boolean value) {
                this.delete = value;
            }

        }

    }


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
     *         &lt;element name="deviceSettings" minOccurs="0" form="qualified">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="authentication" minOccurs="0" form="qualified">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="password" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="delete" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="noAuthentication" minOccurs="0" form="qualified">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="delete" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="simplePasswordAuthentication" minOccurs="0" form="qualified">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="delete" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="registrationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="equipmentId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="equipmentName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "deviceSettings",
        "noAuthentication",
        "simplePasswordAuthentication"
    })
    public static class BootstrapReservePlainEquipment {

        @XmlElement(namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/")
        protected BootstrapType.BootstrapReservePlainEquipment.DeviceSettings deviceSettings;
        @XmlElement(namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/")
        protected BootstrapType.BootstrapReservePlainEquipment.NoAuthentication noAuthentication;
        @XmlElement(namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/")
        protected BootstrapType.BootstrapReservePlainEquipment.SimplePasswordAuthentication simplePasswordAuthentication;
        @XmlAttribute(name = "registrationCode", required = true)
        protected String registrationCode;
        @XmlAttribute(name = "equipmentId", required = true)
        protected String equipmentId;
        @XmlAttribute(name = "equipmentName")
        protected String equipmentName;

        /**
         * Gets the value of the deviceSettings property.
         * 
         * @return
         *     possible object is
         *     {@link BootstrapType.BootstrapReservePlainEquipment.DeviceSettings }
         *     
         */
        public BootstrapType.BootstrapReservePlainEquipment.DeviceSettings getDeviceSettings() {
            return deviceSettings;
        }

        /**
         * Sets the value of the deviceSettings property.
         * 
         * @param value
         *     allowed object is
         *     {@link BootstrapType.BootstrapReservePlainEquipment.DeviceSettings }
         *     
         */
        public void setDeviceSettings(BootstrapType.BootstrapReservePlainEquipment.DeviceSettings value) {
            this.deviceSettings = value;
        }

        /**
         * Gets the value of the noAuthentication property.
         * 
         * @return
         *     possible object is
         *     {@link BootstrapType.BootstrapReservePlainEquipment.NoAuthentication }
         *     
         */
        public BootstrapType.BootstrapReservePlainEquipment.NoAuthentication getNoAuthentication() {
            return noAuthentication;
        }

        /**
         * Sets the value of the noAuthentication property.
         * 
         * @param value
         *     allowed object is
         *     {@link BootstrapType.BootstrapReservePlainEquipment.NoAuthentication }
         *     
         */
        public void setNoAuthentication(BootstrapType.BootstrapReservePlainEquipment.NoAuthentication value) {
            this.noAuthentication = value;
        }

        /**
         * Gets the value of the simplePasswordAuthentication property.
         * 
         * @return
         *     possible object is
         *     {@link BootstrapType.BootstrapReservePlainEquipment.SimplePasswordAuthentication }
         *     
         */
        public BootstrapType.BootstrapReservePlainEquipment.SimplePasswordAuthentication getSimplePasswordAuthentication() {
            return simplePasswordAuthentication;
        }

        /**
         * Sets the value of the simplePasswordAuthentication property.
         * 
         * @param value
         *     allowed object is
         *     {@link BootstrapType.BootstrapReservePlainEquipment.SimplePasswordAuthentication }
         *     
         */
        public void setSimplePasswordAuthentication(BootstrapType.BootstrapReservePlainEquipment.SimplePasswordAuthentication value) {
            this.simplePasswordAuthentication = value;
        }

        /**
         * Gets the value of the registrationCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegistrationCode() {
            return registrationCode;
        }

        /**
         * Sets the value of the registrationCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegistrationCode(String value) {
            this.registrationCode = value;
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

        /**
         * Gets the value of the equipmentName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEquipmentName() {
            return equipmentName;
        }

        /**
         * Sets the value of the equipmentName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEquipmentName(String value) {
            this.equipmentName = value;
        }


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
         *         &lt;element name="authentication" minOccurs="0" form="qualified">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="password" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="delete" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "authentication"
        })
        public static class DeviceSettings {

            @XmlElement(namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/")
            protected BootstrapType.BootstrapReservePlainEquipment.DeviceSettings.Authentication authentication;
            @XmlAttribute(name = "delete")
            protected Boolean delete;

            /**
             * Gets the value of the authentication property.
             * 
             * @return
             *     possible object is
             *     {@link BootstrapType.BootstrapReservePlainEquipment.DeviceSettings.Authentication }
             *     
             */
            public BootstrapType.BootstrapReservePlainEquipment.DeviceSettings.Authentication getAuthentication() {
                return authentication;
            }

            /**
             * Sets the value of the authentication property.
             * 
             * @param value
             *     allowed object is
             *     {@link BootstrapType.BootstrapReservePlainEquipment.DeviceSettings.Authentication }
             *     
             */
            public void setAuthentication(BootstrapType.BootstrapReservePlainEquipment.DeviceSettings.Authentication value) {
                this.authentication = value;
            }

            /**
             * Gets the value of the delete property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isDelete() {
                if (delete == null) {
                    return false;
                } else {
                    return delete;
                }
            }

            /**
             * Sets the value of the delete property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setDelete(Boolean value) {
                this.delete = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="password" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Authentication {

                @XmlAttribute(name = "id", required = true)
                protected String id;
                @XmlAttribute(name = "password", required = true)
                protected String password;

                /**
                 * Gets the value of the id property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getId() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setId(String value) {
                    this.id = value;
                }

                /**
                 * Gets the value of the password property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPassword() {
                    return password;
                }

                /**
                 * Sets the value of the password property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPassword(String value) {
                    this.password = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="delete" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class NoAuthentication {

            @XmlAttribute(name = "delete")
            protected Boolean delete;

            /**
             * Gets the value of the delete property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isDelete() {
                if (delete == null) {
                    return false;
                } else {
                    return delete;
                }
            }

            /**
             * Sets the value of the delete property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setDelete(Boolean value) {
                this.delete = value;
            }

        }


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
         *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
         *       &lt;/sequence>
         *       &lt;attribute name="delete" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "password"
        })
        public static class SimplePasswordAuthentication {

            @XmlElement(namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/")
            protected String password;
            @XmlAttribute(name = "delete")
            protected Boolean delete;

            /**
             * Gets the value of the password property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPassword() {
                return password;
            }

            /**
             * Sets the value of the password property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPassword(String value) {
                this.password = value;
            }

            /**
             * Gets the value of the delete property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isDelete() {
                if (delete == null) {
                    return false;
                } else {
                    return delete;
                }
            }

            /**
             * Sets the value of the delete property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setDelete(Boolean value) {
                this.delete = value;
            }

        }

    }

}
