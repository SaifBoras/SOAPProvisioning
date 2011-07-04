
package iap.soapprovisioning;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="MOType" type="{http://schemas.ericsson.com/cai3g1.2/}MoType"/>
 *         &lt;element name="MOId" type="{http://schemas.ericsson.com/cai3g1.2/}MOId"/>
 *         &lt;element name="MOAttributes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DeleteRequestMODefinition" type="{http://schemas.ericsson.com/cai3g1.2/}AbstractDeleteRequestAttributeType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="extension" type="{http://schemas.ericsson.com/cai3g1.2/}AnySequenceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "moType",
    "moId",
    "moAttributes",
    "extension"
})
@XmlRootElement(name = "Delete")
public class Delete {

    @XmlElement(name = "MOType", required = true)
    protected MoType moType;
    @XmlElement(name = "MOId", required = true)
    protected MOId moId;
    @XmlElement(name = "MOAttributes")
    protected Delete.MOAttributes moAttributes;
    protected AnySequenceType extension;

    /**
     * Gets the value of the moType property.
     * 
     * @return
     *     possible object is
     *     {@link MoType }
     *     
     */
    public MoType getMOType() {
        return moType;
    }

    /**
     * Sets the value of the moType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoType }
     *     
     */
    public void setMOType(MoType value) {
        this.moType = value;
    }

    /**
     * Gets the value of the moId property.
     * 
     * @return
     *     possible object is
     *     {@link MOId }
     *     
     */
    public MOId getMOId() {
        return moId;
    }

    /**
     * Sets the value of the moId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MOId }
     *     
     */
    public void setMOId(MOId value) {
        this.moId = value;
    }

    /**
     * Gets the value of the moAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link Delete.MOAttributes }
     *     
     */
    public Delete.MOAttributes getMOAttributes() {
        return moAttributes;
    }

    /**
     * Sets the value of the moAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Delete.MOAttributes }
     *     
     */
    public void setMOAttributes(Delete.MOAttributes value) {
        this.moAttributes = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link AnySequenceType }
     *     
     */
    public AnySequenceType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnySequenceType }
     *     
     */
    public void setExtension(AnySequenceType value) {
        this.extension = value;
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
     *         &lt;element name="DeleteRequestMODefinition" type="{http://schemas.ericsson.com/cai3g1.2/}AbstractDeleteRequestAttributeType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "deleteRequestMODefinition"
    })
    public static class MOAttributes {

        @XmlElement(name = "DeleteRequestMODefinition", required = true)
        protected AbstractDeleteRequestAttributeType deleteRequestMODefinition;

        /**
         * Gets the value of the deleteRequestMODefinition property.
         * 
         * @return
         *     possible object is
         *     {@link AbstractDeleteRequestAttributeType }
         *     
         */
        public AbstractDeleteRequestAttributeType getDeleteRequestMODefinition() {
            return deleteRequestMODefinition;
        }

        /**
         * Sets the value of the deleteRequestMODefinition property.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractDeleteRequestAttributeType }
         *     
         */
        public void setDeleteRequestMODefinition(AbstractDeleteRequestAttributeType value) {
            this.deleteRequestMODefinition = value;
        }

    }

}
