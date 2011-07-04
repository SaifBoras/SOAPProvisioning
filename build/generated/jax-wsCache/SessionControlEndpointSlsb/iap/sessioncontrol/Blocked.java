
package iap.sessioncontrol;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Blocked complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Blocked">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="indefinitely" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="untilDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Blocked", namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/", propOrder = {
    "indefinitely",
    "untilDate"
})
public class Blocked {

    protected String indefinitely;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar untilDate;

    /**
     * Gets the value of the indefinitely property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndefinitely() {
        return indefinitely;
    }

    /**
     * Sets the value of the indefinitely property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndefinitely(String value) {
        this.indefinitely = value;
    }

    /**
     * Gets the value of the untilDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUntilDate() {
        return untilDate;
    }

    /**
     * Sets the value of the untilDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUntilDate(XMLGregorianCalendar value) {
        this.untilDate = value;
    }

}
