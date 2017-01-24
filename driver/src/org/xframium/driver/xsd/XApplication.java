//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.23 at 08:11:02 AM EST 
//


package org.xframium.driver.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines the application(s) available for testing.  This will define how an application is installed and launched
 * 
 * <p>Java class for xApplication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xApplication"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="capability" type="{http://www.xframium.org/xFramiumDriver}xDeviceCapability" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="objectCapability" type="{http://www.xframium.org/xFramiumDriver}xObjectDeviceCapability" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="provider" default="LOCAL"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="XML"/&gt;
 *             &lt;enumeration value="SQL"/&gt;
 *             &lt;enumeration value="CSV"/&gt;
 *             &lt;enumeration value="EXCEL"/&gt;
 *             &lt;enumeration value="LOCAL"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="appPackage" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="bundleId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="iosInstall" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="androidInstall" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}double" default="0.0" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xApplication", propOrder = {
    "capability",
    "objectCapability"
})
public class XApplication {

    protected List<XDeviceCapability> capability;
    protected List<XObjectDeviceCapability> objectCapability;
    @XmlAttribute(name = "fileName")
    protected String fileName;
    @XmlAttribute(name = "provider")
    protected String provider;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "appPackage")
    protected String appPackage;
    @XmlAttribute(name = "bundleId")
    protected String bundleId;
    @XmlAttribute(name = "url")
    protected String url;
    @XmlAttribute(name = "iosInstall")
    protected String iosInstall;
    @XmlAttribute(name = "androidInstall")
    protected String androidInstall;
    @XmlAttribute(name = "version")
    protected Double version;

    /**
     * Gets the value of the capability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the capability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCapability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XDeviceCapability }
     * 
     * 
     */
    public List<XDeviceCapability> getCapability() {
        if (capability == null) {
            capability = new ArrayList<XDeviceCapability>();
        }
        return this.capability;
    }

    /**
     * Gets the value of the objectCapability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectCapability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectCapability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XObjectDeviceCapability }
     * 
     * 
     */
    public List<XObjectDeviceCapability> getObjectCapability() {
        if (objectCapability == null) {
            objectCapability = new ArrayList<XObjectDeviceCapability>();
        }
        return this.objectCapability;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the provider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvider() {
        if (provider == null) {
            return "LOCAL";
        } else {
            return provider;
        }
    }

    /**
     * Sets the value of the provider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvider(String value) {
        this.provider = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the appPackage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppPackage() {
        return appPackage;
    }

    /**
     * Sets the value of the appPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppPackage(String value) {
        this.appPackage = value;
    }

    /**
     * Gets the value of the bundleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundleId() {
        return bundleId;
    }

    /**
     * Sets the value of the bundleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundleId(String value) {
        this.bundleId = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the iosInstall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIosInstall() {
        return iosInstall;
    }

    /**
     * Sets the value of the iosInstall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIosInstall(String value) {
        this.iosInstall = value;
    }

    /**
     * Gets the value of the androidInstall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAndroidInstall() {
        return androidInstall;
    }

    /**
     * Sets the value of the androidInstall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAndroidInstall(String value) {
        this.androidInstall = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getVersion() {
        if (version == null) {
            return  0.0D;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVersion(Double value) {
        this.version = value;
    }

}
