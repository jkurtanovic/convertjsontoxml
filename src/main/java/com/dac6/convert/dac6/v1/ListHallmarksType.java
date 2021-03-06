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


/**
 * <p>Java class for ListHallmarks_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListHallmarks_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Hallmark" type="{urn:eu:taxud:dac6:v1}HallmarkEnum_Type" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListHallmarks_Type", propOrder = {
    "hallmark"
})
public class ListHallmarksType {

    @XmlElement(name = "Hallmark", required = true)
    @XmlSchemaType(name = "string")
    protected List<HallmarkEnumType> hallmark;

    /**
     * Gets the value of the hallmark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hallmark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHallmark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HallmarkEnumType }
     * 
     * 
     */
    public List<HallmarkEnumType> getHallmark() {
        if (hallmark == null) {
            hallmark = new ArrayList<HallmarkEnumType>();
        }
        return this.hallmark;
    }

}
