
package iap.soapprovisioning;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="commonData" type="{http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_user/}GetUserCommonDataType" form="qualified"/>
 *         &lt;element name="services" type="{http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_user/}UserServicesType" form="qualified"/>
 *       &lt;/sequence>
 *       &lt;attribute name="userId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "userId",
    "commonData",
    "services"
})
@XmlRootElement(name = "getResponseUser", namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_user/")
public class GetResponseUser {

    @XmlElement(namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_user/", required = true)
    protected String userId;
    @XmlElement(namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_user/", required = true)
    protected GetUserCommonDataType commonData;
    @XmlElement(namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_user/", required = true)
    protected UserServicesType services;
    @XmlAttribute(name = "userId", required = true)
    protected String getResponseUserIdattribute;

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the commonData property.
     * 
     * @return
     *     possible object is
     *     {@link GetUserCommonDataType }
     *     
     */
    public GetUserCommonDataType getCommonData() {
        return commonData;
    }

    /**
     * Sets the value of the commonData property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetUserCommonDataType }
     *     
     */
    public void setCommonData(GetUserCommonDataType value) {
        this.commonData = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link UserServicesType }
     *     
     */
    public UserServicesType getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserServicesType }
     *     
     */
    public void setServices(UserServicesType value) {
        this.services = value;
    }

    /**
     * Gets the value of the getResponseUserIdattribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetResponseUserIdattribute() {
        return getResponseUserIdattribute;
    }

    /**
     * Sets the value of the getResponseUserIdattribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetResponseUserIdattribute(String value) {
        this.getResponseUserIdattribute = value;
    }

}
