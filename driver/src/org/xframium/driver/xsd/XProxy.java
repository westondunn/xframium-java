//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.02 at 03:24:46 PM EST 
//


package org.xframium.driver.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Defines global proxy settings required if the device executing the xFramium tests is behind an outbound proxy
 * 
 * <p>Java class for xProxy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xProxy">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="proxyHost" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="proxyPort" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="proxyIgnoreHost" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="proxyUser" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="proxyPassword" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="proxyAuthenticator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xProxy", propOrder = {
    "value"
})
public class XProxy {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "proxyHost", required = true)
    protected String proxyHost;
    @XmlAttribute(name = "proxyPort", required = true)
    protected String proxyPort;
    @XmlAttribute(name = "proxyIgnoreHost")
    protected String proxyIgnoreHost;
    @XmlAttribute(name = "proxyUser")
    protected String proxyUser;
    @XmlAttribute(name = "proxyPassword")
    protected String proxyPassword;
    @XmlAttribute(name = "proxyAuthenticator")
    protected String proxyAuthenticator;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the proxyHost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxyHost() {
        return proxyHost;
    }

    /**
     * Sets the value of the proxyHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxyHost(String value) {
        this.proxyHost = value;
    }

    /**
     * Gets the value of the proxyPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxyPort() {
        return proxyPort;
    }

    /**
     * Sets the value of the proxyPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxyPort(String value) {
        this.proxyPort = value;
    }

    /**
     * Gets the value of the proxyIgnoreHost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxyIgnoreHost() {
        return proxyIgnoreHost;
    }

    /**
     * Sets the value of the proxyIgnoreHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxyIgnoreHost(String value) {
        this.proxyIgnoreHost = value;
    }

    /**
     * Gets the value of the proxyUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxyUser() {
        return proxyUser;
    }

    /**
     * Sets the value of the proxyUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxyUser(String value) {
        this.proxyUser = value;
    }

    /**
     * Gets the value of the proxyPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxyPassword() {
        return proxyPassword;
    }

    /**
     * Sets the value of the proxyPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxyPassword(String value) {
        this.proxyPassword = value;
    }

    /**
     * Gets the value of the proxyAuthenticator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxyAuthenticator() {
        return proxyAuthenticator;
    }

    /**
     * Sets the value of the proxyAuthenticator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxyAuthenticator(String value) {
        this.proxyAuthenticator = value;
    }

}
