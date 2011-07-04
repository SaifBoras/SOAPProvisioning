
package iap.soapprovisioning;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetResponseMOAttributesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetResponseMOAttributesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetMODefinition" type="{http://schemas.ericsson.com/cai3g1.2/}AbstractGetAttributeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetResponseMOAttributesType", propOrder = {
    "getMODefinition"
})
public class GetResponseMOAttributesType {

    @XmlElement(name = "GetMODefinition", required = true)
    protected AbstractGetAttributeType getMODefinition;

    /**
     * Gets the value of the getMODefinition property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractGetAttributeType }
     *     
     */
    public AbstractGetAttributeType getGetMODefinition() {
        return getMODefinition;
    }

    /**
     * Sets the value of the getMODefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractGetAttributeType }
     *     
     */
    public void setGetMODefinition(AbstractGetAttributeType value) {
        this.getMODefinition = value;
    }

}
