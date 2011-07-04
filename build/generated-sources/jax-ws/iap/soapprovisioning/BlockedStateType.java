
package iap.soapprovisioning;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BlockedStateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BlockedStateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="unBlocked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="blocked" type="{http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/}Blocked" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BlockedStateType", namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/", propOrder = {
    "unBlocked",
    "blocked"
})
public class BlockedStateType {

    protected String unBlocked;
    protected Blocked blocked;

    /**
     * Gets the value of the unBlocked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnBlocked() {
        return unBlocked;
    }

    /**
     * Sets the value of the unBlocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnBlocked(String value) {
        this.unBlocked = value;
    }

    /**
     * Gets the value of the blocked property.
     * 
     * @return
     *     possible object is
     *     {@link Blocked }
     *     
     */
    public Blocked getBlocked() {
        return blocked;
    }

    /**
     * Sets the value of the blocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Blocked }
     *     
     */
    public void setBlocked(Blocked value) {
        this.blocked = value;
    }

}
