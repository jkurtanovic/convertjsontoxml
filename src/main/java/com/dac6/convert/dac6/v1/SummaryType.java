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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Summary_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Summary_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Disclosure_Name" type="{urn:eu:taxud:dac6:v1}StringMin1Max400_Type"/&gt;
 *         &lt;element name="Disclosure_Description" type="{urn:eu:taxud:dac6:v1}StringMin1Max4000WithLang_Type" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Summary_Type", propOrder = {
    "disclosureName",
    "disclosureDescription"
})
public class SummaryType {

    @XmlElement(name = "Disclosure_Name", required = true)
    protected String disclosureName;
    @XmlElement(name = "Disclosure_Description", required = true)
    protected List<StringMin1Max4000WithLangType> disclosureDescription;

    /**
     * Gets the value of the disclosureName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisclosureName() {
        return disclosureName;
    }

    /**
     * Sets the value of the disclosureName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisclosureName(String value) {
        this.disclosureName = value;
    }

    /**
     * Gets the value of the disclosureDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disclosureDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisclosureDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringMin1Max4000WithLangType }
     * 
     * 
     */
    public List<StringMin1Max4000WithLangType> getDisclosureDescription() {
        if (disclosureDescription == null) {
            disclosureDescription = new ArrayList<StringMin1Max4000WithLangType>();
        }
        return this.disclosureDescription;
    }

}
