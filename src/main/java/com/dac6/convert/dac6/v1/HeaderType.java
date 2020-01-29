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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Information in the message header identifies the Member State that is sending the message.
 * 
 * <p>Java class for Header_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Header_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransmittingCountry" type="{urn:eu:taxud:isotypes:v1}CountryCode_Type"/&gt;
 *         &lt;element name="ReceivingCountries" type="{urn:eu:taxud:isotypes:v1}CountryCode_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MessageRefId" type="{urn:eu:taxud:dac6:v1}StringMin1Max200_Type"/&gt;
 *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Header_Type", propOrder = {
    "transmittingCountry",
    "receivingCountries",
    "messageRefId",
    "timestamp"
})
public class HeaderType {

    @XmlElement(name = "TransmittingCountry", required = true)
    @XmlSchemaType(name = "string")
    protected CountryCodeType transmittingCountry;
    @XmlElement(name = "ReceivingCountries")
    @XmlSchemaType(name = "string")
    protected List<CountryCodeType> receivingCountries;
    @XmlElement(name = "MessageRefId", required = true)
    protected String messageRefId;
    @XmlElement(name = "Timestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;

    /**
     * Gets the value of the transmittingCountry property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getTransmittingCountry() {
        return transmittingCountry;
    }

    /**
     * Sets the value of the transmittingCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setTransmittingCountry(CountryCodeType value) {
        this.transmittingCountry = value;
    }

    /**
     * Gets the value of the receivingCountries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receivingCountries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceivingCountries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryCodeType }
     * 
     * 
     */
    public List<CountryCodeType> getReceivingCountries() {
        if (receivingCountries == null) {
            receivingCountries = new ArrayList<CountryCodeType>();
        }
        return this.receivingCountries;
    }

    /**
     * Gets the value of the messageRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageRefId() {
        return messageRefId;
    }

    /**
     * Sets the value of the messageRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageRefId(String value) {
        this.messageRefId = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

}