
package iap.soapprovisioning;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VodType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ericsson.com/cai3g1.2/}AbstractServiceType">
 *       &lt;all>
 *         &lt;element name="rentalList" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="vodTitle" maxOccurs="unbounded" minOccurs="0" form="qualified">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="delete" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
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
 *         &lt;element name="authorizationList" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="svod" maxOccurs="unbounded" minOccurs="0" form="qualified">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="delete" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
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
 *       &lt;/all>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VodType", namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/", propOrder = {
    "rentalList",
    "authorizationList"
})
public class VodType
    extends AbstractServiceType
{

    @XmlElementRef(name = "rentalList", namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/", type = JAXBElement.class, required = false)
    protected JAXBElement<VodType.RentalList> rentalList;
    @XmlElementRef(name = "authorizationList", namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/", type = JAXBElement.class, required = false)
    protected JAXBElement<VodType.AuthorizationList> authorizationList;

    /**
     * Gets the value of the rentalList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VodType.RentalList }{@code >}
     *     
     */
    public JAXBElement<VodType.RentalList> getRentalList() {
        return rentalList;
    }

    /**
     * Sets the value of the rentalList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VodType.RentalList }{@code >}
     *     
     */
    public void setRentalList(JAXBElement<VodType.RentalList> value) {
        this.rentalList = ((JAXBElement<VodType.RentalList> ) value);
    }

    /**
     * Gets the value of the authorizationList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VodType.AuthorizationList }{@code >}
     *     
     */
    public JAXBElement<VodType.AuthorizationList> getAuthorizationList() {
        return authorizationList;
    }

    /**
     * Sets the value of the authorizationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VodType.AuthorizationList }{@code >}
     *     
     */
    public void setAuthorizationList(JAXBElement<VodType.AuthorizationList> value) {
        this.authorizationList = ((JAXBElement<VodType.AuthorizationList> ) value);
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
     *         &lt;element name="svod" maxOccurs="unbounded" minOccurs="0" form="qualified">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="delete" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
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
        "svod"
    })
    public static class AuthorizationList {

        @XmlElement(namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/")
        protected List<VodType.AuthorizationList.Svod> svod;
        @XmlAttribute(name = "delete")
        protected Boolean delete;

        /**
         * Gets the value of the svod property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the svod property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSvod().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VodType.AuthorizationList.Svod }
         * 
         * 
         */
        public List<VodType.AuthorizationList.Svod> getSvod() {
            if (svod == null) {
                svod = new ArrayList<VodType.AuthorizationList.Svod>();
            }
            return this.svod;
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
        public static class Svod {

            @XmlAttribute(name = "id", required = true)
            protected String id;
            @XmlAttribute(name = "delete")
            protected Boolean delete;

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
     *         &lt;element name="vodTitle" maxOccurs="unbounded" minOccurs="0" form="qualified">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="delete" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
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
        "vodTitle"
    })
    public static class RentalList {

        @XmlElement(namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/")
        protected List<VodType.RentalList.VodTitle> vodTitle;
        @XmlAttribute(name = "delete")
        protected Boolean delete;

        /**
         * Gets the value of the vodTitle property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vodTitle property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVodTitle().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VodType.RentalList.VodTitle }
         * 
         * 
         */
        public List<VodType.RentalList.VodTitle> getVodTitle() {
            if (vodTitle == null) {
                vodTitle = new ArrayList<VodType.RentalList.VodTitle>();
            }
            return this.vodTitle;
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
        public static class VodTitle {

            @XmlAttribute(name = "id", required = true)
            protected String id;
            @XmlAttribute(name = "delete")
            protected Boolean delete;

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
