//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.28 at 09:09:38 AM CET 
//


package com.dac6.convert.dac6.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Header" type="{urn:eu:taxud:dac6:v1}Header_Type"/&gt;
 *         &lt;element name="VersionTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ArrangementID"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="17"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DAC6Disclosures" type="{urn:eu:taxud:dac6:v1}DAC6Disclosure_Type" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "header",
    "versionTimestamp",
    "arrangementID",
    "dac6Disclosures"
})
@XmlRootElement(name = "DAC6_Arrangement")
public class DAC6Arrangement {

    @XmlElement(name = "Header", required = true)
    protected HeaderType header;
    @XmlElement(name = "VersionTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar versionTimestamp;
    @XmlElement(name = "ArrangementID", required = true)
    protected String arrangementID;
    @XmlElement(name = "DAC6Disclosures", required = true)
    protected List<DAC6DisclosureType> dac6Disclosures;
    @XmlAttribute(name = "version")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar version;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderType }
     *     
     */
    public HeaderType getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderType }
     *     
     */
    public void setHeader(HeaderType value) {
        this.header = value;
    }

    /**
     * Gets the value of the versionTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVersionTimestamp() {
        return versionTimestamp;
    }

    /**
     * Sets the value of the versionTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVersionTimestamp(XMLGregorianCalendar value) {
        this.versionTimestamp = value;
    }

    /**
     * Gets the value of the arrangementID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrangementID() {
        return arrangementID;
    }

    /**
     * Sets the value of the arrangementID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrangementID(String value) {
        this.arrangementID = value;
    }

    /**
     * Gets the value of the dac6Disclosures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dac6Disclosures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDAC6Disclosures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DAC6DisclosureType }
     * 
     * 
     */
    public List<DAC6DisclosureType> getDAC6Disclosures() {
        if (dac6Disclosures == null) {
            dac6Disclosures = new ArrayList<DAC6DisclosureType>();
        }
        return this.dac6Disclosures;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVersion(XMLGregorianCalendar value) {
        this.version = value;
    }

}
