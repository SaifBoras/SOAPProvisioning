
package iap.soapprovisioning;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="MOId" type="{http://schemas.ericsson.com/cai3g1.2/}AnyMOIdType" maxOccurs="unbounded" minOccurs="0"/>
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
    "extension"
})
@XmlRootElement(name = "SearchResponse")
public class SearchResponse {

    @XmlElement(name = "MOId")
    protected List<AnyMOIdType> moId;
    protected AnySequenceType extension;

    /**
     * Gets the value of the moId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the moId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMOId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnyMOIdType }
     * 
     * 
     */
    public List<AnyMOIdType> getMOId() {
        if (moId == null) {
            moId = new ArrayList<AnyMOIdType>();
        }
        return this.moId;
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
