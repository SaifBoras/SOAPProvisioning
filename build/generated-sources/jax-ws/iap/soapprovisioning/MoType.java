
package iap.soapprovisioning;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MoType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MoType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="User@http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_user/"/>
 *     &lt;enumeration value="Subscriber@http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/"/>
 *     &lt;enumeration value="Equipment@http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_equipment/"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MoType")
@XmlEnum
public enum MoType {

    @XmlEnumValue("User@http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_user/")
    USER_HTTP_CAI_3_G_IAP_IPTV_ERICSSON_COM_IPTV_PROVISIONING_USER("User@http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_user/"),
    @XmlEnumValue("Subscriber@http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/")
    SUBSCRIBER_HTTP_CAI_3_G_IAP_IPTV_ERICSSON_COM_IPTV_PROVISIONING_SUBSCRIBER("Subscriber@http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/"),
    @XmlEnumValue("Equipment@http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_equipment/")
    EQUIPMENT_HTTP_CAI_3_G_IAP_IPTV_ERICSSON_COM_IPTV_PROVISIONING_EQUIPMENT("Equipment@http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_equipment/");
    private final String value;

    MoType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MoType fromValue(String v) {
        for (MoType c: MoType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
