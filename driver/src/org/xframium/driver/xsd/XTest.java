//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.04 at 12:47:01 PM EDT 
//


package org.xframium.driver.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines a single test
 * 
 * <p>Java class for xTest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xTest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.xframium.org/xFramiumDriver}xDescription" minOccurs="0"/>
 *         &lt;element name="step" type="{http://www.xframium.org/xFramiumDriver}xStep" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" default="XML">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="XML"/>
 *             &lt;enumeration value="BDD"/>
 *             &lt;enumeration value="CSV"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dataDriver" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dataProvider" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tagNames" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="linkId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="timed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="threshold" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *       &lt;attribute name="active" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="browser" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contentKeys" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="deviceTags" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="os" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *       &lt;attribute name="priority" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *       &lt;attribute name="severity" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *       &lt;attribute name="reliesOn" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xTest", propOrder = {
    "description",
    "step"
})
public class XTest {

    protected XDescription description;
    protected List<XStep> step;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "dataDriver")
    protected String dataDriver;
    @XmlAttribute(name = "dataProvider")
    protected String dataProvider;
    @XmlAttribute(name = "tagNames")
    protected String tagNames;
    @XmlAttribute(name = "linkId")
    protected String linkId;
    @XmlAttribute(name = "timed")
    protected Boolean timed;
    @XmlAttribute(name = "threshold")
    protected Integer threshold;
    @XmlAttribute(name = "active")
    protected Boolean active;
    @XmlAttribute(name = "browser")
    protected String browser;
    @XmlAttribute(name = "contentKeys")
    protected String contentKeys;
    @XmlAttribute(name = "deviceTags")
    protected String deviceTags;
    @XmlAttribute(name = "os")
    protected String os;
    @XmlAttribute(name = "count")
    protected Integer count;
    @XmlAttribute(name = "priority")
    protected Integer priority;
    @XmlAttribute(name = "severity")
    protected Integer severity;
    @XmlAttribute(name = "reliesOn")
    protected String reliesOn;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link XDescription }
     *     
     */
    public XDescription getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link XDescription }
     *     
     */
    public void setDescription(XDescription value) {
        this.description = value;
    }

    /**
     * Gets the value of the step property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the step property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XStep }
     * 
     * 
     */
    public List<XStep> getStep() {
        if (step == null) {
            step = new ArrayList<XStep>();
        }
        return this.step;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        if (type == null) {
            return "XML";
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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
     * Gets the value of the dataDriver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataDriver() {
        return dataDriver;
    }

    /**
     * Sets the value of the dataDriver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataDriver(String value) {
        this.dataDriver = value;
    }

    /**
     * Gets the value of the dataProvider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataProvider() {
        return dataProvider;
    }

    /**
     * Sets the value of the dataProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataProvider(String value) {
        this.dataProvider = value;
    }

    /**
     * Gets the value of the tagNames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagNames() {
        return tagNames;
    }

    /**
     * Sets the value of the tagNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagNames(String value) {
        this.tagNames = value;
    }

    /**
     * Gets the value of the linkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkId() {
        return linkId;
    }

    /**
     * Sets the value of the linkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkId(String value) {
        this.linkId = value;
    }

    /**
     * Gets the value of the timed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTimed() {
        if (timed == null) {
            return false;
        } else {
            return timed;
        }
    }

    /**
     * Sets the value of the timed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimed(Boolean value) {
        this.timed = value;
    }

    /**
     * Gets the value of the threshold property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getThreshold() {
        if (threshold == null) {
            return  0;
        } else {
            return threshold;
        }
    }

    /**
     * Sets the value of the threshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setThreshold(Integer value) {
        this.threshold = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isActive() {
        if (active == null) {
            return true;
        } else {
            return active;
        }
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the browser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrowser() {
        return browser;
    }

    /**
     * Sets the value of the browser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrowser(String value) {
        this.browser = value;
    }

    /**
     * Gets the value of the contentKeys property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentKeys() {
        return contentKeys;
    }

    /**
     * Sets the value of the contentKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentKeys(String value) {
        this.contentKeys = value;
    }

    /**
     * Gets the value of the deviceTags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceTags() {
        return deviceTags;
    }

    /**
     * Sets the value of the deviceTags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceTags(String value) {
        this.deviceTags = value;
    }

    /**
     * Gets the value of the os property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOs() {
        return os;
    }

    /**
     * Sets the value of the os property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOs(String value) {
        this.os = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getCount() {
        if (count == null) {
            return  0;
        } else {
            return count;
        }
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCount(Integer value) {
        this.count = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getPriority() {
        if (priority == null) {
            return  0;
        } else {
            return priority;
        }
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPriority(Integer value) {
        this.priority = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getSeverity() {
        if (severity == null) {
            return  0;
        } else {
            return severity;
        }
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSeverity(Integer value) {
        this.severity = value;
    }

    /**
     * Gets the value of the reliesOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReliesOn() {
        return reliesOn;
    }

    /**
     * Sets the value of the reliesOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReliesOn(String value) {
        this.reliesOn = value;
    }

}
