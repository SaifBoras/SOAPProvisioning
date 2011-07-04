
package iap.soapprovisioning;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriberServicesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriberServicesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="catchuptv" type="{http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/}CatchupTvType" minOccurs="0" form="qualified"/>
 *         &lt;element name="networkTimeshift" type="{http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/}NetworkTimeshiftType" minOccurs="0" form="qualified"/>
 *         &lt;element name="localTimeshift" type="{http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/}LocalTimeshiftType" minOccurs="0" form="qualified"/>
 *         &lt;element name="lpvr" type="{http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/}LpvrType" minOccurs="0" form="qualified"/>
 *         &lt;element name="broadcastReminder" type="{http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/}BroadcastReminderType" minOccurs="0" form="qualified"/>
 *         &lt;element name="npvr" type="{http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/}NpvrType" minOccurs="0" form="qualified"/>
 *         &lt;element name="remoteAuthorization" type="{http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/}RemoteAuthorizationType" minOccurs="0" form="qualified"/>
 *         &lt;element name="vod" type="{http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/}VodType" minOccurs="0" form="qualified"/>
 *         &lt;element name="whatsOnTv" type="{http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/}WhatsOnTvType" minOccurs="0" form="qualified"/>
 *         &lt;element name="channelManager" type="{http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/}ChannelManagerType" minOccurs="0" form="qualified"/>
 *         &lt;element name="reservedUsers" type="{http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/}ReservedUsersType" minOccurs="0" form="qualified"/>
 *         &lt;element name="payPerView" type="{http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/}PayPerViewType" minOccurs="0" form="qualified"/>
 *         &lt;element name="subscriberAccountIdentity" type="{http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/}SubscriberAccountIdentityType" minOccurs="0" form="qualified"/>
 *         &lt;element name="iptvProxy" type="{http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/}IptvProxyType" minOccurs="0" form="qualified"/>
 *         &lt;element name="subscriberPortalPreferences" type="{http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/}SubscriberPortalPreferencesType" minOccurs="0" form="qualified"/>
 *         &lt;element name="portalSelector" type="{http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/}PortalSelectorType" minOccurs="0" form="qualified"/>
 *         &lt;element name="bootstrap" type="{http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/}bootstrapType" minOccurs="0" form="qualified"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriberServicesType", namespace = "http://cai3g.iap.iptv.ericsson.com/iptv_provisioning_subscriber/", propOrder = {

})
public class SubscriberServicesType {

    protected CatchupTvType catchuptv;
    protected NetworkTimeshiftType networkTimeshift;
    protected LocalTimeshiftType localTimeshift;
    protected LpvrType lpvr;
    protected BroadcastReminderType broadcastReminder;
    protected NpvrType npvr;
    protected RemoteAuthorizationType remoteAuthorization;
    protected VodType vod;
    protected WhatsOnTvType whatsOnTv;
    protected ChannelManagerType channelManager;
    protected ReservedUsersType reservedUsers;
    protected PayPerViewType payPerView;
    protected SubscriberAccountIdentityType subscriberAccountIdentity;
    protected IptvProxyType iptvProxy;
    protected SubscriberPortalPreferencesType subscriberPortalPreferences;
    protected PortalSelectorType portalSelector;
    protected BootstrapType bootstrap;

    /**
     * Gets the value of the catchuptv property.
     * 
     * @return
     *     possible object is
     *     {@link CatchupTvType }
     *     
     */
    public CatchupTvType getCatchuptv() {
        return catchuptv;
    }

    /**
     * Sets the value of the catchuptv property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatchupTvType }
     *     
     */
    public void setCatchuptv(CatchupTvType value) {
        this.catchuptv = value;
    }

    /**
     * Gets the value of the networkTimeshift property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkTimeshiftType }
     *     
     */
    public NetworkTimeshiftType getNetworkTimeshift() {
        return networkTimeshift;
    }

    /**
     * Sets the value of the networkTimeshift property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkTimeshiftType }
     *     
     */
    public void setNetworkTimeshift(NetworkTimeshiftType value) {
        this.networkTimeshift = value;
    }

    /**
     * Gets the value of the localTimeshift property.
     * 
     * @return
     *     possible object is
     *     {@link LocalTimeshiftType }
     *     
     */
    public LocalTimeshiftType getLocalTimeshift() {
        return localTimeshift;
    }

    /**
     * Sets the value of the localTimeshift property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalTimeshiftType }
     *     
     */
    public void setLocalTimeshift(LocalTimeshiftType value) {
        this.localTimeshift = value;
    }

    /**
     * Gets the value of the lpvr property.
     * 
     * @return
     *     possible object is
     *     {@link LpvrType }
     *     
     */
    public LpvrType getLpvr() {
        return lpvr;
    }

    /**
     * Sets the value of the lpvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link LpvrType }
     *     
     */
    public void setLpvr(LpvrType value) {
        this.lpvr = value;
    }

    /**
     * Gets the value of the broadcastReminder property.
     * 
     * @return
     *     possible object is
     *     {@link BroadcastReminderType }
     *     
     */
    public BroadcastReminderType getBroadcastReminder() {
        return broadcastReminder;
    }

    /**
     * Sets the value of the broadcastReminder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BroadcastReminderType }
     *     
     */
    public void setBroadcastReminder(BroadcastReminderType value) {
        this.broadcastReminder = value;
    }

    /**
     * Gets the value of the npvr property.
     * 
     * @return
     *     possible object is
     *     {@link NpvrType }
     *     
     */
    public NpvrType getNpvr() {
        return npvr;
    }

    /**
     * Sets the value of the npvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NpvrType }
     *     
     */
    public void setNpvr(NpvrType value) {
        this.npvr = value;
    }

    /**
     * Gets the value of the remoteAuthorization property.
     * 
     * @return
     *     possible object is
     *     {@link RemoteAuthorizationType }
     *     
     */
    public RemoteAuthorizationType getRemoteAuthorization() {
        return remoteAuthorization;
    }

    /**
     * Sets the value of the remoteAuthorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemoteAuthorizationType }
     *     
     */
    public void setRemoteAuthorization(RemoteAuthorizationType value) {
        this.remoteAuthorization = value;
    }

    /**
     * Gets the value of the vod property.
     * 
     * @return
     *     possible object is
     *     {@link VodType }
     *     
     */
    public VodType getVod() {
        return vod;
    }

    /**
     * Sets the value of the vod property.
     * 
     * @param value
     *     allowed object is
     *     {@link VodType }
     *     
     */
    public void setVod(VodType value) {
        this.vod = value;
    }

    /**
     * Gets the value of the whatsOnTv property.
     * 
     * @return
     *     possible object is
     *     {@link WhatsOnTvType }
     *     
     */
    public WhatsOnTvType getWhatsOnTv() {
        return whatsOnTv;
    }

    /**
     * Sets the value of the whatsOnTv property.
     * 
     * @param value
     *     allowed object is
     *     {@link WhatsOnTvType }
     *     
     */
    public void setWhatsOnTv(WhatsOnTvType value) {
        this.whatsOnTv = value;
    }

    /**
     * Gets the value of the channelManager property.
     * 
     * @return
     *     possible object is
     *     {@link ChannelManagerType }
     *     
     */
    public ChannelManagerType getChannelManager() {
        return channelManager;
    }

    /**
     * Sets the value of the channelManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelManagerType }
     *     
     */
    public void setChannelManager(ChannelManagerType value) {
        this.channelManager = value;
    }

    /**
     * Gets the value of the reservedUsers property.
     * 
     * @return
     *     possible object is
     *     {@link ReservedUsersType }
     *     
     */
    public ReservedUsersType getReservedUsers() {
        return reservedUsers;
    }

    /**
     * Sets the value of the reservedUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservedUsersType }
     *     
     */
    public void setReservedUsers(ReservedUsersType value) {
        this.reservedUsers = value;
    }

    /**
     * Gets the value of the payPerView property.
     * 
     * @return
     *     possible object is
     *     {@link PayPerViewType }
     *     
     */
    public PayPerViewType getPayPerView() {
        return payPerView;
    }

    /**
     * Sets the value of the payPerView property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPerViewType }
     *     
     */
    public void setPayPerView(PayPerViewType value) {
        this.payPerView = value;
    }

    /**
     * Gets the value of the subscriberAccountIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberAccountIdentityType }
     *     
     */
    public SubscriberAccountIdentityType getSubscriberAccountIdentity() {
        return subscriberAccountIdentity;
    }

    /**
     * Sets the value of the subscriberAccountIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberAccountIdentityType }
     *     
     */
    public void setSubscriberAccountIdentity(SubscriberAccountIdentityType value) {
        this.subscriberAccountIdentity = value;
    }

    /**
     * Gets the value of the iptvProxy property.
     * 
     * @return
     *     possible object is
     *     {@link IptvProxyType }
     *     
     */
    public IptvProxyType getIptvProxy() {
        return iptvProxy;
    }

    /**
     * Sets the value of the iptvProxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link IptvProxyType }
     *     
     */
    public void setIptvProxy(IptvProxyType value) {
        this.iptvProxy = value;
    }

    /**
     * Gets the value of the subscriberPortalPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberPortalPreferencesType }
     *     
     */
    public SubscriberPortalPreferencesType getSubscriberPortalPreferences() {
        return subscriberPortalPreferences;
    }

    /**
     * Sets the value of the subscriberPortalPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberPortalPreferencesType }
     *     
     */
    public void setSubscriberPortalPreferences(SubscriberPortalPreferencesType value) {
        this.subscriberPortalPreferences = value;
    }

    /**
     * Gets the value of the portalSelector property.
     * 
     * @return
     *     possible object is
     *     {@link PortalSelectorType }
     *     
     */
    public PortalSelectorType getPortalSelector() {
        return portalSelector;
    }

    /**
     * Sets the value of the portalSelector property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortalSelectorType }
     *     
     */
    public void setPortalSelector(PortalSelectorType value) {
        this.portalSelector = value;
    }

    /**
     * Gets the value of the bootstrap property.
     * 
     * @return
     *     possible object is
     *     {@link BootstrapType }
     *     
     */
    public BootstrapType getBootstrap() {
        return bootstrap;
    }

    /**
     * Sets the value of the bootstrap property.
     * 
     * @param value
     *     allowed object is
     *     {@link BootstrapType }
     *     
     */
    public void setBootstrap(BootstrapType value) {
        this.bootstrap = value;
    }

}
