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
 * <p>Java class for DisclosureInformation_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisclosureInformation_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ImplementingDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Reason" type="{urn:eu:taxud:dac6:v1}DisclosureReason_EnumType" minOccurs="0"/&gt;
 *         &lt;element name="Summary" type="{urn:eu:taxud:dac6:v1}Summary_Type"/&gt;
 *         &lt;element name="NationalProvision" type="{urn:eu:taxud:dac6:v1}StringMin1Max4000WithLang_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Amount" type="{urn:eu:taxud:dac6:v1}Amount_Type"/&gt;
 *         &lt;element name="ArrangementChart" type="{urn:eu:taxud:dac6:v1}ArrangementChart_Type" minOccurs="0"/&gt;
 *         &lt;element name="ConcernedMSs" type="{urn:eu:taxud:dac6:v1}ConcernedMSs_Type"/&gt;
 *         &lt;element name="MainBenefitTest1" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Hallmarks" type="{urn:eu:taxud:dac6:v1}Hallmarks_Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisclosureInformation_Type", propOrder = {
    "implementingDate",
    "reason",
    "summary",
    "nationalProvision",
    "amount",
    "arrangementChart",
    "concernedMSs",
    "mainBenefitTest1",
    "hallmarks"
})
public class DisclosureInformationType {

    @XmlElement(name = "ImplementingDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar implementingDate;
    @XmlElement(name = "Reason")
    @XmlSchemaType(name = "string")
    protected DisclosureReasonEnumType reason;
    @XmlElement(name = "Summary", required = true)
    protected SummaryType summary;
    @XmlElement(name = "NationalProvision", required = true)
    protected List<StringMin1Max4000WithLangType> nationalProvision;
    @XmlElement(name = "Amount", required = true)
    protected AmountType amount;
    @XmlElement(name = "ArrangementChart")
    protected ArrangementChartType arrangementChart;
    @XmlElement(name = "ConcernedMSs", required = true)
    protected ConcernedMSsType concernedMSs;
    @XmlElement(name = "MainBenefitTest1", defaultValue = "false")
    protected boolean mainBenefitTest1;
    @XmlElement(name = "Hallmarks", required = true)
    protected HallmarksType hallmarks;

    /**
     * Gets the value of the implementingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getImplementingDate() {
        return implementingDate;
    }

    /**
     * Sets the value of the implementingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setImplementingDate(XMLGregorianCalendar value) {
        this.implementingDate = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link DisclosureReasonEnumType }
     *     
     */
    public DisclosureReasonEnumType getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisclosureReasonEnumType }
     *     
     */
    public void setReason(DisclosureReasonEnumType value) {
        this.reason = value;
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryType }
     *     
     */
    public SummaryType getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryType }
     *     
     */
    public void setSummary(SummaryType value) {
        this.summary = value;
    }

    /**
     * Gets the value of the nationalProvision property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nationalProvision property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNationalProvision().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringMin1Max4000WithLangType }
     * 
     * 
     */
    public List<StringMin1Max4000WithLangType> getNationalProvision() {
        if (nationalProvision == null) {
            nationalProvision = new ArrayList<StringMin1Max4000WithLangType>();
        }
        return this.nationalProvision;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmount(AmountType value) {
        this.amount = value;
    }

    /**
     * Gets the value of the arrangementChart property.
     * 
     * @return
     *     possible object is
     *     {@link ArrangementChartType }
     *     
     */
    public ArrangementChartType getArrangementChart() {
        return arrangementChart;
    }

    /**
     * Sets the value of the arrangementChart property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrangementChartType }
     *     
     */
    public void setArrangementChart(ArrangementChartType value) {
        this.arrangementChart = value;
    }

    /**
     * Gets the value of the concernedMSs property.
     * 
     * @return
     *     possible object is
     *     {@link ConcernedMSsType }
     *     
     */
    public ConcernedMSsType getConcernedMSs() {
        return concernedMSs;
    }

    /**
     * Sets the value of the concernedMSs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConcernedMSsType }
     *     
     */
    public void setConcernedMSs(ConcernedMSsType value) {
        this.concernedMSs = value;
    }

    /**
     * Gets the value of the mainBenefitTest1 property.
     * 
     */
    public boolean isMainBenefitTest1() {
        return mainBenefitTest1;
    }

    /**
     * Sets the value of the mainBenefitTest1 property.
     * 
     */
    public void setMainBenefitTest1(boolean value) {
        this.mainBenefitTest1 = value;
    }

    /**
     * Gets the value of the hallmarks property.
     * 
     * @return
     *     possible object is
     *     {@link HallmarksType }
     *     
     */
    public HallmarksType getHallmarks() {
        return hallmarks;
    }

    /**
     * Sets the value of the hallmarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link HallmarksType }
     *     
     */
    public void setHallmarks(HallmarksType value) {
        this.hallmarks = value;
    }

}
