
package iap.soapprovisioning;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImsBootstrapType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImsBootstrapType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ericsson.com/cai3g1.2/}AbstractServiceType">
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
 *         &lt;element name="blocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImsBootstrapType", namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_equipment/", propOrder = {
    "deviceSettings",
    "noAuthentication",
    "simplePasswordAuthentication",
    "blocked"
})
public class ImsBootstrapType
    extends AbstractServiceType
{

    protected ImsBootstrapType.DeviceSettings deviceSettings;
    protected ImsBootstrapType.NoAuthentication noAuthentication;
    protected ImsBootstrapType.SimplePasswordAuthentication simplePasswordAuthentication;
    @XmlElement(defaultValue = "false")
    protected Boolean blocked;

    /**
     * Gets the value of the deviceSettings property.
     * 
     * @return
     *     possible object is
     *     {@link ImsBootstrapType.DeviceSettings }
     *     
     */
    public ImsBootstrapType.DeviceSettings getDeviceSettings() {
        return deviceSettings;
    }

    /**
     * Sets the value of the deviceSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImsBootstrapType.DeviceSettings }
     *     
     */
    public void setDeviceSettings(ImsBootstrapType.DeviceSettings value) {
        this.deviceSettings = value;
    }

    /**
     * Gets the value of the noAuthentication property.
     * 
     * @return
     *     possible object is
     *     {@link ImsBootstrapType.NoAuthentication }
     *     
     */
    public ImsBootstrapType.NoAuthentication getNoAuthentication() {
        return noAuthentication;
    }

    /**
     * Sets the value of the noAuthentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImsBootstrapType.NoAuthentication }
     *     
     */
    public void setNoAuthentication(ImsBootstrapType.NoAuthentication value) {
        this.noAuthentication = value;
    }

    /**
     * Gets the value of the simplePasswordAuthentication property.
     * 
     * @return
     *     possible object is
     *     {@link ImsBootstrapType.SimplePasswordAuthentication }
     *     
     */
    public ImsBootstrapType.SimplePasswordAuthentication getSimplePasswordAuthentication() {
        return simplePasswordAuthentication;
    }

    /**
     * Sets the value of the simplePasswordAuthentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImsBootstrapType.SimplePasswordAuthentication }
     *     
     */
    public void setSimplePasswordAuthentication(ImsBootstrapType.SimplePasswordAuthentication value) {
        this.simplePasswordAuthentication = value;
    }

    /**
     * Gets the value of the blocked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBlocked() {
        return blocked;
    }

    /**
     * Sets the value of the blocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBlocked(Boolean value) {
        this.blocked = value;
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

        @XmlElement(namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_equipment/")
        protected ImsBootstrapType.DeviceSettings.Subscriber subscriber;
        @XmlElement(namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_equipment/")
        protected List<ImsBootstrapType.DeviceSettings.User> user;
        @XmlAttribute(name = "delete", namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_equipment/")
        protected Boolean delete;

        /**
         * Gets the value of the subscriber property.
         * 
         * @return
         *     possible object is
         *     {@link ImsBootstrapType.DeviceSettings.Subscriber }
         *     
         */
        public ImsBootstrapType.DeviceSettings.Subscriber getSubscriber() {
            return subscriber;
        }

        /**
         * Sets the value of the subscriber property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImsBootstrapType.DeviceSettings.Subscriber }
         *     
         */
        public void setSubscriber(ImsBootstrapType.DeviceSettings.Subscriber value) {
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
         * {@link ImsBootstrapType.DeviceSettings.User }
         * 
         * 
         */
        public List<ImsBootstrapType.DeviceSettings.User> getUser() {
            if (user == null) {
                user = new ArrayList<ImsBootstrapType.DeviceSettings.User>();
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

        @XmlElement(namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_equipment/")
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
