
package org.datacontract.schemas._2004._07.epicor_mfg;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdExtSalesOrderDataSetTypeHedTaxSum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdExtSalesOrderDataSetTypeHedTaxSum">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AllocDepInvcNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencySwitch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DBRowIdent" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="DisplaySymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocDisplaySymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocReportableAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocTaxAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocTaxableAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="GroupID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HedNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReportableAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RowIdent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RowMod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rpt1ReportableAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1TaxAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1TaxableAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2ReportableAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2TaxAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2TaxableAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3ReportableAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3TaxAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3TaxableAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TaxAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxableAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdExtSalesOrderDataSetTypeHedTaxSum", propOrder = {
    "allocDepInvcNum",
    "company",
    "currencyCode",
    "currencySwitch",
    "dbRowIdent",
    "displaySymbol",
    "docDisplaySymbol",
    "docReportableAmt",
    "docTaxAmt",
    "docTaxableAmt",
    "groupID",
    "hedNum",
    "percent",
    "rateCode",
    "reportableAmt",
    "rowIdent",
    "rowMod",
    "rpt1ReportableAmt",
    "rpt1TaxAmt",
    "rpt1TaxableAmt",
    "rpt2ReportableAmt",
    "rpt2TaxAmt",
    "rpt2TaxableAmt",
    "rpt3ReportableAmt",
    "rpt3TaxAmt",
    "rpt3TaxableAmt",
    "taxAmt",
    "taxCode",
    "taxDescription",
    "taxableAmt"
})
public class UpdExtSalesOrderDataSetTypeHedTaxSum {

    @XmlElement(name = "AllocDepInvcNum", nillable = true)
    protected Integer allocDepInvcNum;
    @XmlElement(name = "Company", nillable = true)
    protected String company;
    @XmlElement(name = "CurrencyCode", nillable = true)
    protected String currencyCode;
    @XmlElement(name = "CurrencySwitch", nillable = true)
    protected Boolean currencySwitch;
    @XmlElement(name = "DBRowIdent", nillable = true)
    protected byte[] dbRowIdent;
    @XmlElement(name = "DisplaySymbol", nillable = true)
    protected String displaySymbol;
    @XmlElement(name = "DocDisplaySymbol", nillable = true)
    protected String docDisplaySymbol;
    @XmlElement(name = "DocReportableAmt", nillable = true)
    protected BigDecimal docReportableAmt;
    @XmlElement(name = "DocTaxAmt", nillable = true)
    protected BigDecimal docTaxAmt;
    @XmlElement(name = "DocTaxableAmt", nillable = true)
    protected BigDecimal docTaxableAmt;
    @XmlElement(name = "GroupID", nillable = true)
    protected String groupID;
    @XmlElement(name = "HedNum", nillable = true)
    protected Integer hedNum;
    @XmlElement(name = "Percent", nillable = true)
    protected BigDecimal percent;
    @XmlElement(name = "RateCode", nillable = true)
    protected String rateCode;
    @XmlElement(name = "ReportableAmt", nillable = true)
    protected BigDecimal reportableAmt;
    @XmlElement(name = "RowIdent", nillable = true)
    protected String rowIdent;
    @XmlElement(name = "RowMod", nillable = true)
    protected String rowMod;
    @XmlElement(name = "Rpt1ReportableAmt", nillable = true)
    protected BigDecimal rpt1ReportableAmt;
    @XmlElement(name = "Rpt1TaxAmt", nillable = true)
    protected BigDecimal rpt1TaxAmt;
    @XmlElement(name = "Rpt1TaxableAmt", nillable = true)
    protected BigDecimal rpt1TaxableAmt;
    @XmlElement(name = "Rpt2ReportableAmt", nillable = true)
    protected BigDecimal rpt2ReportableAmt;
    @XmlElement(name = "Rpt2TaxAmt", nillable = true)
    protected BigDecimal rpt2TaxAmt;
    @XmlElement(name = "Rpt2TaxableAmt", nillable = true)
    protected BigDecimal rpt2TaxableAmt;
    @XmlElement(name = "Rpt3ReportableAmt", nillable = true)
    protected BigDecimal rpt3ReportableAmt;
    @XmlElement(name = "Rpt3TaxAmt", nillable = true)
    protected BigDecimal rpt3TaxAmt;
    @XmlElement(name = "Rpt3TaxableAmt", nillable = true)
    protected BigDecimal rpt3TaxableAmt;
    @XmlElement(name = "TaxAmt", nillable = true)
    protected BigDecimal taxAmt;
    @XmlElement(name = "TaxCode", nillable = true)
    protected String taxCode;
    @XmlElement(name = "TaxDescription", nillable = true)
    protected String taxDescription;
    @XmlElement(name = "TaxableAmt", nillable = true)
    protected BigDecimal taxableAmt;

    /**
     * Gets the value of the allocDepInvcNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAllocDepInvcNum() {
        return allocDepInvcNum;
    }

    /**
     * Sets the value of the allocDepInvcNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAllocDepInvcNum(Integer value) {
        this.allocDepInvcNum = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the currencySwitch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCurrencySwitch() {
        return currencySwitch;
    }

    /**
     * Sets the value of the currencySwitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCurrencySwitch(Boolean value) {
        this.currencySwitch = value;
    }

    /**
     * Gets the value of the dbRowIdent property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDBRowIdent() {
        return dbRowIdent;
    }

    /**
     * Sets the value of the dbRowIdent property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDBRowIdent(byte[] value) {
        this.dbRowIdent = value;
    }

    /**
     * Gets the value of the displaySymbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplaySymbol() {
        return displaySymbol;
    }

    /**
     * Sets the value of the displaySymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplaySymbol(String value) {
        this.displaySymbol = value;
    }

    /**
     * Gets the value of the docDisplaySymbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocDisplaySymbol() {
        return docDisplaySymbol;
    }

    /**
     * Sets the value of the docDisplaySymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocDisplaySymbol(String value) {
        this.docDisplaySymbol = value;
    }

    /**
     * Gets the value of the docReportableAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocReportableAmt() {
        return docReportableAmt;
    }

    /**
     * Sets the value of the docReportableAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocReportableAmt(BigDecimal value) {
        this.docReportableAmt = value;
    }

    /**
     * Gets the value of the docTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocTaxAmt() {
        return docTaxAmt;
    }

    /**
     * Sets the value of the docTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocTaxAmt(BigDecimal value) {
        this.docTaxAmt = value;
    }

    /**
     * Gets the value of the docTaxableAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocTaxableAmt() {
        return docTaxableAmt;
    }

    /**
     * Sets the value of the docTaxableAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocTaxableAmt(BigDecimal value) {
        this.docTaxableAmt = value;
    }

    /**
     * Gets the value of the groupID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupID() {
        return groupID;
    }

    /**
     * Sets the value of the groupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupID(String value) {
        this.groupID = value;
    }

    /**
     * Gets the value of the hedNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHedNum() {
        return hedNum;
    }

    /**
     * Sets the value of the hedNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHedNum(Integer value) {
        this.hedNum = value;
    }

    /**
     * Gets the value of the percent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercent(BigDecimal value) {
        this.percent = value;
    }

    /**
     * Gets the value of the rateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateCode() {
        return rateCode;
    }

    /**
     * Sets the value of the rateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateCode(String value) {
        this.rateCode = value;
    }

    /**
     * Gets the value of the reportableAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReportableAmt() {
        return reportableAmt;
    }

    /**
     * Sets the value of the reportableAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReportableAmt(BigDecimal value) {
        this.reportableAmt = value;
    }

    /**
     * Gets the value of the rowIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowIdent() {
        return rowIdent;
    }

    /**
     * Sets the value of the rowIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowIdent(String value) {
        this.rowIdent = value;
    }

    /**
     * Gets the value of the rowMod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowMod() {
        return rowMod;
    }

    /**
     * Sets the value of the rowMod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowMod(String value) {
        this.rowMod = value;
    }

    /**
     * Gets the value of the rpt1ReportableAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1ReportableAmt() {
        return rpt1ReportableAmt;
    }

    /**
     * Sets the value of the rpt1ReportableAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1ReportableAmt(BigDecimal value) {
        this.rpt1ReportableAmt = value;
    }

    /**
     * Gets the value of the rpt1TaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1TaxAmt() {
        return rpt1TaxAmt;
    }

    /**
     * Sets the value of the rpt1TaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1TaxAmt(BigDecimal value) {
        this.rpt1TaxAmt = value;
    }

    /**
     * Gets the value of the rpt1TaxableAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1TaxableAmt() {
        return rpt1TaxableAmt;
    }

    /**
     * Sets the value of the rpt1TaxableAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1TaxableAmt(BigDecimal value) {
        this.rpt1TaxableAmt = value;
    }

    /**
     * Gets the value of the rpt2ReportableAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2ReportableAmt() {
        return rpt2ReportableAmt;
    }

    /**
     * Sets the value of the rpt2ReportableAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2ReportableAmt(BigDecimal value) {
        this.rpt2ReportableAmt = value;
    }

    /**
     * Gets the value of the rpt2TaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2TaxAmt() {
        return rpt2TaxAmt;
    }

    /**
     * Sets the value of the rpt2TaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2TaxAmt(BigDecimal value) {
        this.rpt2TaxAmt = value;
    }

    /**
     * Gets the value of the rpt2TaxableAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2TaxableAmt() {
        return rpt2TaxableAmt;
    }

    /**
     * Sets the value of the rpt2TaxableAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2TaxableAmt(BigDecimal value) {
        this.rpt2TaxableAmt = value;
    }

    /**
     * Gets the value of the rpt3ReportableAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3ReportableAmt() {
        return rpt3ReportableAmt;
    }

    /**
     * Sets the value of the rpt3ReportableAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3ReportableAmt(BigDecimal value) {
        this.rpt3ReportableAmt = value;
    }

    /**
     * Gets the value of the rpt3TaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3TaxAmt() {
        return rpt3TaxAmt;
    }

    /**
     * Sets the value of the rpt3TaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3TaxAmt(BigDecimal value) {
        this.rpt3TaxAmt = value;
    }

    /**
     * Gets the value of the rpt3TaxableAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3TaxableAmt() {
        return rpt3TaxableAmt;
    }

    /**
     * Sets the value of the rpt3TaxableAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3TaxableAmt(BigDecimal value) {
        this.rpt3TaxableAmt = value;
    }

    /**
     * Gets the value of the taxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxAmt() {
        return taxAmt;
    }

    /**
     * Sets the value of the taxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxAmt(BigDecimal value) {
        this.taxAmt = value;
    }

    /**
     * Gets the value of the taxCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCode() {
        return taxCode;
    }

    /**
     * Sets the value of the taxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCode(String value) {
        this.taxCode = value;
    }

    /**
     * Gets the value of the taxDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxDescription() {
        return taxDescription;
    }

    /**
     * Sets the value of the taxDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxDescription(String value) {
        this.taxDescription = value;
    }

    /**
     * Gets the value of the taxableAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxableAmt() {
        return taxableAmt;
    }

    /**
     * Sets the value of the taxableAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxableAmt(BigDecimal value) {
        this.taxableAmt = value;
    }

}
