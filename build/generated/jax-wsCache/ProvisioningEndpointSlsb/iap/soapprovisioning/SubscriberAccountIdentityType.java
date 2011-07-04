
package iap.soapprovisioning;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriberAccountIdentityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriberAccountIdentityType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ericsson.com/cai3g1.2/}AbstractServiceType">
 *       &lt;all>
 *         &lt;element name="impu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="httpAuthenticationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *       &lt;/all>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriberAccountIdentityType", namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/", propOrder = {
    "impu",
    "httpAuthenticationId"
})
public class SubscriberAccountIdentityType
    extends AbstractServiceType
{

    protected String impu;
    protected String httpAuthenticationId;

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
     * Gets the value of the httpAuthenticationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpAuthenticationId() {
        return httpAuthenticationId;
    }

    /**
     * Sets the value of the httpAuthenticationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpAuthenticationId(String value) {
        this.httpAuthenticationId = value;
    }

}
