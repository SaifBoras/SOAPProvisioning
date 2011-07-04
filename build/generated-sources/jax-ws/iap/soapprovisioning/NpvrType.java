
package iap.soapprovisioning;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NpvrType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NpvrType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ericsson.com/cai3g1.2/}AbstractServiceType">
 *       &lt;all>
 *         &lt;element name="recordingTimeToLive" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="quota" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0" form="qualified"/>
 *       &lt;/all>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NpvrType", namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/", propOrder = {
    "recordingTimeToLive",
    "quota"
})
public class NpvrType
    extends AbstractServiceType
{

    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger recordingTimeToLive;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger quota;

    /**
     * Gets the value of the recordingTimeToLive property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRecordingTimeToLive() {
        return recordingTimeToLive;
    }

    /**
     * Sets the value of the recordingTimeToLive property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRecordingTimeToLive(BigInteger value) {
        this.recordingTimeToLive = value;
    }

    /**
     * Gets the value of the quota property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuota() {
        return quota;
    }

    /**
     * Sets the value of the quota property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuota(BigInteger value) {
        this.quota = value;
    }

}
