
package iap.soapprovisioning;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="managerRef" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="filters" type="{http://schemas.ericsson.com/cai3g1.2/}NotificationFiltersType"/>
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
    "managerRef",
    "filters"
})
@XmlRootElement(name = "Subscribe")
public class Subscribe {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String managerRef;
    @XmlElement(required = true)
    protected NotificationFiltersType filters;

    /**
     * Gets the value of the managerRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerRef() {
        return managerRef;
    }

    /**
     * Sets the value of the managerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerRef(String value) {
        this.managerRef = value;
    }

    /**
     * Gets the value of the filters property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationFiltersType }
     *     
     */
    public NotificationFiltersType getFilters() {
        return filters;
    }

    /**
     * Sets the value of the filters property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationFiltersType }
     *     
     */
    public void setFilters(NotificationFiltersType value) {
        this.filters = value;
    }

}
