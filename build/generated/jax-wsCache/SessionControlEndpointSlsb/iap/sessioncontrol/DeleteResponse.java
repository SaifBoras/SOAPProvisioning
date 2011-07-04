
package iap.sessioncontrol;

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
 *         &lt;element name="MOId" type="{http://schemas.ericsson.com/cai3g1.2/}MOId" minOccurs="0"/>
 *         &lt;element name="MOAttributes" type="{http://schemas.ericsson.com/cai3g1.2/}GetResponseMOAttributesType" minOccurs="0"/>
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
    "moId",
    "moAttributes",
    "extension"
})
@XmlRootElement(name = "DeleteResponse")
public class DeleteResponse {

    @XmlElement(name = "MOId")
    protected MOId moId;
    @XmlElement(name = "MOAttributes")
    protected GetResponseMOAttributesType moAttributes;
    protected AnySequenceType extension;

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
     *     {@link GetResponseMOAttributesType }
     *     
     */
    public GetResponseMOAttributesType getMOAttributes() {
        return moAttributes;
    }

    /**
     * Sets the value of the moAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetResponseMOAttributesType }
     *     
     */
    public void setMOAttributes(GetResponseMOAttributesType value) {
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

}
