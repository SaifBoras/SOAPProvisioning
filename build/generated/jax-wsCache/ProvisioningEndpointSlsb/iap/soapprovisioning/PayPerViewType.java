
package iap.soapprovisioning;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PayPerViewType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayPerViewType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ericsson.com/cai3g1.2/}AbstractServiceType">
 *       &lt;all>
 *         &lt;element name="blockList" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="block" maxOccurs="unbounded" minOccurs="0" form="qualified">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="offeringId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="purchaseStartDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
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
 *         &lt;element name="eventList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="event" maxOccurs="unbounded" minOccurs="0" form="qualified">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="offeringTemplateId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="programId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "PayPerViewType", namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/", propOrder = {
    "blockList",
    "eventList"
})
public class PayPerViewType
    extends AbstractServiceType
{

    protected PayPerViewType.BlockList blockList;
    @XmlElement(namespace = "")
    protected PayPerViewType.EventList eventList;

    /**
     * Gets the value of the blockList property.
     * 
     * @return
     *     possible object is
     *     {@link PayPerViewType.BlockList }
     *     
     */
    public PayPerViewType.BlockList getBlockList() {
        return blockList;
    }

    /**
     * Sets the value of the blockList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPerViewType.BlockList }
     *     
     */
    public void setBlockList(PayPerViewType.BlockList value) {
        this.blockList = value;
    }

    /**
     * Gets the value of the eventList property.
     * 
     * @return
     *     possible object is
     *     {@link PayPerViewType.EventList }
     *     
     */
    public PayPerViewType.EventList getEventList() {
        return eventList;
    }

    /**
     * Sets the value of the eventList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPerViewType.EventList }
     *     
     */
    public void setEventList(PayPerViewType.EventList value) {
        this.eventList = value;
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
     *         &lt;element name="block" maxOccurs="unbounded" minOccurs="0" form="qualified">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="offeringId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="purchaseStartDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
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
        "block"
    })
    public static class BlockList {

        @XmlElement(namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/")
        protected List<PayPerViewType.BlockList.Block> block;
        @XmlAttribute(name = "delete")
        protected Boolean delete;

        /**
         * Gets the value of the block property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the block property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBlock().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PayPerViewType.BlockList.Block }
         * 
         * 
         */
        public List<PayPerViewType.BlockList.Block> getBlock() {
            if (block == null) {
                block = new ArrayList<PayPerViewType.BlockList.Block>();
            }
            return this.block;
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
         *       &lt;attribute name="offeringId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="purchaseStartDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
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
        public static class Block {

            @XmlAttribute(name = "offeringId", required = true)
            protected String offeringId;
            @XmlAttribute(name = "purchaseStartDate", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar purchaseStartDate;
            @XmlAttribute(name = "delete")
            protected Boolean delete;

            /**
             * Gets the value of the offeringId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOfferingId() {
                return offeringId;
            }

            /**
             * Sets the value of the offeringId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOfferingId(String value) {
                this.offeringId = value;
            }

            /**
             * Gets the value of the purchaseStartDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getPurchaseStartDate() {
                return purchaseStartDate;
            }

            /**
             * Sets the value of the purchaseStartDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setPurchaseStartDate(XMLGregorianCalendar value) {
                this.purchaseStartDate = value;
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
     *         &lt;element name="event" maxOccurs="unbounded" minOccurs="0" form="qualified">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="offeringTemplateId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="programId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "event"
    })
    public static class EventList {

        @XmlElement(namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/")
        protected List<PayPerViewType.EventList.Event> event;
        @XmlAttribute(name = "delete")
        protected Boolean delete;

        /**
         * Gets the value of the event property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the event property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEvent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PayPerViewType.EventList.Event }
         * 
         * 
         */
        public List<PayPerViewType.EventList.Event> getEvent() {
            if (event == null) {
                event = new ArrayList<PayPerViewType.EventList.Event>();
            }
            return this.event;
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
         *       &lt;attribute name="offeringTemplateId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="programId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        public static class Event {

            @XmlAttribute(name = "offeringTemplateId", required = true)
            protected String offeringTemplateId;
            @XmlAttribute(name = "programId", required = true)
            protected String programId;
            @XmlAttribute(name = "delete")
            protected Boolean delete;

            /**
             * Gets the value of the offeringTemplateId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOfferingTemplateId() {
                return offeringTemplateId;
            }

            /**
             * Sets the value of the offeringTemplateId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOfferingTemplateId(String value) {
                this.offeringTemplateId = value;
            }

            /**
             * Gets the value of the programId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProgramId() {
                return programId;
            }

            /**
             * Sets the value of the programId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProgramId(String value) {
                this.programId = value;
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
