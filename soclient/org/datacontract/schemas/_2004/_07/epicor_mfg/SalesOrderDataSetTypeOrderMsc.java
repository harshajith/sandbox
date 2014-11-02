
package org.datacontract.schemas._2004._07.epicor_mfg;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SalesOrderDataSetTypeOrderMsc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrderDataSetTypeOrderMsc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaseCurrSymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BitFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ChangeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ChangeTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ChangedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CheckBox01" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CheckBox02" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CheckBox03" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CheckBox04" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CheckBox05" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrSymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencySwitch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DBRowIdent" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="Date01" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Date02" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Date03" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Date04" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Date05" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocDspMiscAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocInMiscAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocMiscAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DspMiscAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EntryProcess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExtCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FreqCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ICPOLine" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ICPONum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ICPOSeqNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InMiscAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Linked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MiscAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MiscCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiscCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Number01" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Number02" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Number03" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Number04" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Number05" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OpenLine" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrderLine" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OrderLineLineDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OrderNumCardMemberName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderNumCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Percentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Quoting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RowIdent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RowMod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rpt1DspMiscAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1InMiscAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1MiscAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2DspMiscAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2InMiscAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2MiscAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3DspMiscAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3InMiscAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3MiscAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SeqNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ShortChar01" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortChar02" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortChar03" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortChar04" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortChar05" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SysRevID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SysRowID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesOrderDataSetTypeOrderMsc", propOrder = {
    "baseCurrSymbol",
    "bitFlag",
    "changeDate",
    "changeTime",
    "changedBy",
    "checkBox01",
    "checkBox02",
    "checkBox03",
    "checkBox04",
    "checkBox05",
    "company",
    "currSymbol",
    "currencyCode",
    "currencySwitch",
    "dbRowIdent",
    "date01",
    "date02",
    "date03",
    "date04",
    "date05",
    "description",
    "docDspMiscAmt",
    "docInMiscAmt",
    "docMiscAmt",
    "dspMiscAmt",
    "entryProcess",
    "extCompany",
    "freqCode",
    "icpoLine",
    "icpoNum",
    "icpoSeqNum",
    "inMiscAmt",
    "linked",
    "miscAmt",
    "miscCode",
    "miscCodeDescription",
    "number01",
    "number02",
    "number03",
    "number04",
    "number05",
    "openLine",
    "orderLine",
    "orderLineLineDesc",
    "orderNum",
    "orderNumCardMemberName",
    "orderNumCurrencyCode",
    "percentage",
    "quoting",
    "rowIdent",
    "rowMod",
    "rpt1DspMiscAmt",
    "rpt1InMiscAmt",
    "rpt1MiscAmt",
    "rpt2DspMiscAmt",
    "rpt2InMiscAmt",
    "rpt2MiscAmt",
    "rpt3DspMiscAmt",
    "rpt3InMiscAmt",
    "rpt3MiscAmt",
    "seqNum",
    "shortChar01",
    "shortChar02",
    "shortChar03",
    "shortChar04",
    "shortChar05",
    "sysRevID",
    "sysRowID",
    "type"
})
public class SalesOrderDataSetTypeOrderMsc {

    @XmlElement(name = "BaseCurrSymbol", nillable = true)
    protected String baseCurrSymbol;
    @XmlElement(name = "BitFlag", nillable = true)
    protected Integer bitFlag;
    @XmlElement(name = "ChangeDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changeDate;
    @XmlElement(name = "ChangeTime", nillable = true)
    protected Integer changeTime;
    @XmlElement(name = "ChangedBy", nillable = true)
    protected String changedBy;
    @XmlElement(name = "CheckBox01", nillable = true)
    protected Boolean checkBox01;
    @XmlElement(name = "CheckBox02", nillable = true)
    protected Boolean checkBox02;
    @XmlElement(name = "CheckBox03", nillable = true)
    protected Boolean checkBox03;
    @XmlElement(name = "CheckBox04", nillable = true)
    protected Boolean checkBox04;
    @XmlElement(name = "CheckBox05", nillable = true)
    protected Boolean checkBox05;
    @XmlElement(name = "Company", nillable = true)
    protected String company;
    @XmlElement(name = "CurrSymbol", nillable = true)
    protected String currSymbol;
    @XmlElement(name = "CurrencyCode", nillable = true)
    protected String currencyCode;
    @XmlElement(name = "CurrencySwitch", nillable = true)
    protected Boolean currencySwitch;
    @XmlElement(name = "DBRowIdent", nillable = true)
    protected byte[] dbRowIdent;
    @XmlElement(name = "Date01", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date01;
    @XmlElement(name = "Date02", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date02;
    @XmlElement(name = "Date03", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date03;
    @XmlElement(name = "Date04", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date04;
    @XmlElement(name = "Date05", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date05;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "DocDspMiscAmt", nillable = true)
    protected BigDecimal docDspMiscAmt;
    @XmlElement(name = "DocInMiscAmt", nillable = true)
    protected BigDecimal docInMiscAmt;
    @XmlElement(name = "DocMiscAmt", nillable = true)
    protected BigDecimal docMiscAmt;
    @XmlElement(name = "DspMiscAmt", nillable = true)
    protected BigDecimal dspMiscAmt;
    @XmlElement(name = "EntryProcess", nillable = true)
    protected String entryProcess;
    @XmlElement(name = "ExtCompany", nillable = true)
    protected String extCompany;
    @XmlElement(name = "FreqCode", nillable = true)
    protected String freqCode;
    @XmlElement(name = "ICPOLine", nillable = true)
    protected Integer icpoLine;
    @XmlElement(name = "ICPONum", nillable = true)
    protected Integer icpoNum;
    @XmlElement(name = "ICPOSeqNum", nillable = true)
    protected Integer icpoSeqNum;
    @XmlElement(name = "InMiscAmt", nillable = true)
    protected BigDecimal inMiscAmt;
    @XmlElement(name = "Linked", nillable = true)
    protected Boolean linked;
    @XmlElement(name = "MiscAmt", nillable = true)
    protected BigDecimal miscAmt;
    @XmlElement(name = "MiscCode", nillable = true)
    protected String miscCode;
    @XmlElement(name = "MiscCodeDescription", nillable = true)
    protected String miscCodeDescription;
    @XmlElement(name = "Number01", nillable = true)
    protected BigDecimal number01;
    @XmlElement(name = "Number02", nillable = true)
    protected BigDecimal number02;
    @XmlElement(name = "Number03", nillable = true)
    protected BigDecimal number03;
    @XmlElement(name = "Number04", nillable = true)
    protected BigDecimal number04;
    @XmlElement(name = "Number05", nillable = true)
    protected BigDecimal number05;
    @XmlElement(name = "OpenLine", nillable = true)
    protected Boolean openLine;
    @XmlElement(name = "OrderLine", nillable = true)
    protected Integer orderLine;
    @XmlElement(name = "OrderLineLineDesc", nillable = true)
    protected String orderLineLineDesc;
    @XmlElement(name = "OrderNum", nillable = true)
    protected Integer orderNum;
    @XmlElement(name = "OrderNumCardMemberName", nillable = true)
    protected String orderNumCardMemberName;
    @XmlElement(name = "OrderNumCurrencyCode", nillable = true)
    protected String orderNumCurrencyCode;
    @XmlElement(name = "Percentage", nillable = true)
    protected BigDecimal percentage;
    @XmlElement(name = "Quoting", nillable = true)
    protected String quoting;
    @XmlElement(name = "RowIdent", nillable = true)
    protected String rowIdent;
    @XmlElement(name = "RowMod", nillable = true)
    protected String rowMod;
    @XmlElement(name = "Rpt1DspMiscAmt", nillable = true)
    protected BigDecimal rpt1DspMiscAmt;
    @XmlElement(name = "Rpt1InMiscAmt", nillable = true)
    protected BigDecimal rpt1InMiscAmt;
    @XmlElement(name = "Rpt1MiscAmt", nillable = true)
    protected BigDecimal rpt1MiscAmt;
    @XmlElement(name = "Rpt2DspMiscAmt", nillable = true)
    protected BigDecimal rpt2DspMiscAmt;
    @XmlElement(name = "Rpt2InMiscAmt", nillable = true)
    protected BigDecimal rpt2InMiscAmt;
    @XmlElement(name = "Rpt2MiscAmt", nillable = true)
    protected BigDecimal rpt2MiscAmt;
    @XmlElement(name = "Rpt3DspMiscAmt", nillable = true)
    protected BigDecimal rpt3DspMiscAmt;
    @XmlElement(name = "Rpt3InMiscAmt", nillable = true)
    protected BigDecimal rpt3InMiscAmt;
    @XmlElement(name = "Rpt3MiscAmt", nillable = true)
    protected BigDecimal rpt3MiscAmt;
    @XmlElement(name = "SeqNum", nillable = true)
    protected Integer seqNum;
    @XmlElement(name = "ShortChar01", nillable = true)
    protected String shortChar01;
    @XmlElement(name = "ShortChar02", nillable = true)
    protected String shortChar02;
    @XmlElement(name = "ShortChar03", nillable = true)
    protected String shortChar03;
    @XmlElement(name = "ShortChar04", nillable = true)
    protected String shortChar04;
    @XmlElement(name = "ShortChar05", nillable = true)
    protected String shortChar05;
    @XmlElement(name = "SysRevID", nillable = true)
    protected Integer sysRevID;
    @XmlElement(name = "SysRowID", nillable = true)
    protected String sysRowID;
    @XmlElement(name = "Type", nillable = true)
    protected String type;

    /**
     * Gets the value of the baseCurrSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseCurrSymbol() {
        return baseCurrSymbol;
    }

    /**
     * Sets the value of the baseCurrSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseCurrSymbol(String value) {
        this.baseCurrSymbol = value;
    }

    /**
     * Gets the value of the bitFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBitFlag() {
        return bitFlag;
    }

    /**
     * Sets the value of the bitFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBitFlag(Integer value) {
        this.bitFlag = value;
    }

    /**
     * Gets the value of the changeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChangeDate() {
        return changeDate;
    }

    /**
     * Sets the value of the changeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChangeDate(XMLGregorianCalendar value) {
        this.changeDate = value;
    }

    /**
     * Gets the value of the changeTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChangeTime() {
        return changeTime;
    }

    /**
     * Sets the value of the changeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChangeTime(Integer value) {
        this.changeTime = value;
    }

    /**
     * Gets the value of the changedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangedBy() {
        return changedBy;
    }

    /**
     * Sets the value of the changedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangedBy(String value) {
        this.changedBy = value;
    }

    /**
     * Gets the value of the checkBox01 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckBox01() {
        return checkBox01;
    }

    /**
     * Sets the value of the checkBox01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckBox01(Boolean value) {
        this.checkBox01 = value;
    }

    /**
     * Gets the value of the checkBox02 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckBox02() {
        return checkBox02;
    }

    /**
     * Sets the value of the checkBox02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckBox02(Boolean value) {
        this.checkBox02 = value;
    }

    /**
     * Gets the value of the checkBox03 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckBox03() {
        return checkBox03;
    }

    /**
     * Sets the value of the checkBox03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckBox03(Boolean value) {
        this.checkBox03 = value;
    }

    /**
     * Gets the value of the checkBox04 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckBox04() {
        return checkBox04;
    }

    /**
     * Sets the value of the checkBox04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckBox04(Boolean value) {
        this.checkBox04 = value;
    }

    /**
     * Gets the value of the checkBox05 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckBox05() {
        return checkBox05;
    }

    /**
     * Sets the value of the checkBox05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckBox05(Boolean value) {
        this.checkBox05 = value;
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
     * Gets the value of the currSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrSymbol() {
        return currSymbol;
    }

    /**
     * Sets the value of the currSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrSymbol(String value) {
        this.currSymbol = value;
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
     * Gets the value of the date01 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate01() {
        return date01;
    }

    /**
     * Sets the value of the date01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate01(XMLGregorianCalendar value) {
        this.date01 = value;
    }

    /**
     * Gets the value of the date02 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate02() {
        return date02;
    }

    /**
     * Sets the value of the date02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate02(XMLGregorianCalendar value) {
        this.date02 = value;
    }

    /**
     * Gets the value of the date03 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate03() {
        return date03;
    }

    /**
     * Sets the value of the date03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate03(XMLGregorianCalendar value) {
        this.date03 = value;
    }

    /**
     * Gets the value of the date04 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate04() {
        return date04;
    }

    /**
     * Sets the value of the date04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate04(XMLGregorianCalendar value) {
        this.date04 = value;
    }

    /**
     * Gets the value of the date05 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate05() {
        return date05;
    }

    /**
     * Sets the value of the date05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate05(XMLGregorianCalendar value) {
        this.date05 = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the docDspMiscAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocDspMiscAmt() {
        return docDspMiscAmt;
    }

    /**
     * Sets the value of the docDspMiscAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocDspMiscAmt(BigDecimal value) {
        this.docDspMiscAmt = value;
    }

    /**
     * Gets the value of the docInMiscAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocInMiscAmt() {
        return docInMiscAmt;
    }

    /**
     * Sets the value of the docInMiscAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocInMiscAmt(BigDecimal value) {
        this.docInMiscAmt = value;
    }

    /**
     * Gets the value of the docMiscAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocMiscAmt() {
        return docMiscAmt;
    }

    /**
     * Sets the value of the docMiscAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocMiscAmt(BigDecimal value) {
        this.docMiscAmt = value;
    }

    /**
     * Gets the value of the dspMiscAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDspMiscAmt() {
        return dspMiscAmt;
    }

    /**
     * Sets the value of the dspMiscAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDspMiscAmt(BigDecimal value) {
        this.dspMiscAmt = value;
    }

    /**
     * Gets the value of the entryProcess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryProcess() {
        return entryProcess;
    }

    /**
     * Sets the value of the entryProcess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryProcess(String value) {
        this.entryProcess = value;
    }

    /**
     * Gets the value of the extCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtCompany() {
        return extCompany;
    }

    /**
     * Sets the value of the extCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtCompany(String value) {
        this.extCompany = value;
    }

    /**
     * Gets the value of the freqCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreqCode() {
        return freqCode;
    }

    /**
     * Sets the value of the freqCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreqCode(String value) {
        this.freqCode = value;
    }

    /**
     * Gets the value of the icpoLine property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getICPOLine() {
        return icpoLine;
    }

    /**
     * Sets the value of the icpoLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setICPOLine(Integer value) {
        this.icpoLine = value;
    }

    /**
     * Gets the value of the icpoNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getICPONum() {
        return icpoNum;
    }

    /**
     * Sets the value of the icpoNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setICPONum(Integer value) {
        this.icpoNum = value;
    }

    /**
     * Gets the value of the icpoSeqNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getICPOSeqNum() {
        return icpoSeqNum;
    }

    /**
     * Sets the value of the icpoSeqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setICPOSeqNum(Integer value) {
        this.icpoSeqNum = value;
    }

    /**
     * Gets the value of the inMiscAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInMiscAmt() {
        return inMiscAmt;
    }

    /**
     * Sets the value of the inMiscAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInMiscAmt(BigDecimal value) {
        this.inMiscAmt = value;
    }

    /**
     * Gets the value of the linked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLinked() {
        return linked;
    }

    /**
     * Sets the value of the linked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLinked(Boolean value) {
        this.linked = value;
    }

    /**
     * Gets the value of the miscAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMiscAmt() {
        return miscAmt;
    }

    /**
     * Sets the value of the miscAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMiscAmt(BigDecimal value) {
        this.miscAmt = value;
    }

    /**
     * Gets the value of the miscCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiscCode() {
        return miscCode;
    }

    /**
     * Sets the value of the miscCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiscCode(String value) {
        this.miscCode = value;
    }

    /**
     * Gets the value of the miscCodeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiscCodeDescription() {
        return miscCodeDescription;
    }

    /**
     * Sets the value of the miscCodeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiscCodeDescription(String value) {
        this.miscCodeDescription = value;
    }

    /**
     * Gets the value of the number01 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumber01() {
        return number01;
    }

    /**
     * Sets the value of the number01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumber01(BigDecimal value) {
        this.number01 = value;
    }

    /**
     * Gets the value of the number02 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumber02() {
        return number02;
    }

    /**
     * Sets the value of the number02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumber02(BigDecimal value) {
        this.number02 = value;
    }

    /**
     * Gets the value of the number03 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumber03() {
        return number03;
    }

    /**
     * Sets the value of the number03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumber03(BigDecimal value) {
        this.number03 = value;
    }

    /**
     * Gets the value of the number04 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumber04() {
        return number04;
    }

    /**
     * Sets the value of the number04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumber04(BigDecimal value) {
        this.number04 = value;
    }

    /**
     * Gets the value of the number05 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumber05() {
        return number05;
    }

    /**
     * Sets the value of the number05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumber05(BigDecimal value) {
        this.number05 = value;
    }

    /**
     * Gets the value of the openLine property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpenLine() {
        return openLine;
    }

    /**
     * Sets the value of the openLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpenLine(Boolean value) {
        this.openLine = value;
    }

    /**
     * Gets the value of the orderLine property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrderLine() {
        return orderLine;
    }

    /**
     * Sets the value of the orderLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrderLine(Integer value) {
        this.orderLine = value;
    }

    /**
     * Gets the value of the orderLineLineDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderLineLineDesc() {
        return orderLineLineDesc;
    }

    /**
     * Sets the value of the orderLineLineDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderLineLineDesc(String value) {
        this.orderLineLineDesc = value;
    }

    /**
     * Gets the value of the orderNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrderNum() {
        return orderNum;
    }

    /**
     * Sets the value of the orderNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrderNum(Integer value) {
        this.orderNum = value;
    }

    /**
     * Gets the value of the orderNumCardMemberName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNumCardMemberName() {
        return orderNumCardMemberName;
    }

    /**
     * Sets the value of the orderNumCardMemberName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNumCardMemberName(String value) {
        this.orderNumCardMemberName = value;
    }

    /**
     * Gets the value of the orderNumCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNumCurrencyCode() {
        return orderNumCurrencyCode;
    }

    /**
     * Sets the value of the orderNumCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNumCurrencyCode(String value) {
        this.orderNumCurrencyCode = value;
    }

    /**
     * Gets the value of the percentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentage() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentage(BigDecimal value) {
        this.percentage = value;
    }

    /**
     * Gets the value of the quoting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoting() {
        return quoting;
    }

    /**
     * Sets the value of the quoting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoting(String value) {
        this.quoting = value;
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
     * Gets the value of the rpt1DspMiscAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1DspMiscAmt() {
        return rpt1DspMiscAmt;
    }

    /**
     * Sets the value of the rpt1DspMiscAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1DspMiscAmt(BigDecimal value) {
        this.rpt1DspMiscAmt = value;
    }

    /**
     * Gets the value of the rpt1InMiscAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1InMiscAmt() {
        return rpt1InMiscAmt;
    }

    /**
     * Sets the value of the rpt1InMiscAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1InMiscAmt(BigDecimal value) {
        this.rpt1InMiscAmt = value;
    }

    /**
     * Gets the value of the rpt1MiscAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1MiscAmt() {
        return rpt1MiscAmt;
    }

    /**
     * Sets the value of the rpt1MiscAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1MiscAmt(BigDecimal value) {
        this.rpt1MiscAmt = value;
    }

    /**
     * Gets the value of the rpt2DspMiscAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2DspMiscAmt() {
        return rpt2DspMiscAmt;
    }

    /**
     * Sets the value of the rpt2DspMiscAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2DspMiscAmt(BigDecimal value) {
        this.rpt2DspMiscAmt = value;
    }

    /**
     * Gets the value of the rpt2InMiscAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2InMiscAmt() {
        return rpt2InMiscAmt;
    }

    /**
     * Sets the value of the rpt2InMiscAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2InMiscAmt(BigDecimal value) {
        this.rpt2InMiscAmt = value;
    }

    /**
     * Gets the value of the rpt2MiscAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2MiscAmt() {
        return rpt2MiscAmt;
    }

    /**
     * Sets the value of the rpt2MiscAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2MiscAmt(BigDecimal value) {
        this.rpt2MiscAmt = value;
    }

    /**
     * Gets the value of the rpt3DspMiscAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3DspMiscAmt() {
        return rpt3DspMiscAmt;
    }

    /**
     * Sets the value of the rpt3DspMiscAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3DspMiscAmt(BigDecimal value) {
        this.rpt3DspMiscAmt = value;
    }

    /**
     * Gets the value of the rpt3InMiscAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3InMiscAmt() {
        return rpt3InMiscAmt;
    }

    /**
     * Sets the value of the rpt3InMiscAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3InMiscAmt(BigDecimal value) {
        this.rpt3InMiscAmt = value;
    }

    /**
     * Gets the value of the rpt3MiscAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3MiscAmt() {
        return rpt3MiscAmt;
    }

    /**
     * Sets the value of the rpt3MiscAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3MiscAmt(BigDecimal value) {
        this.rpt3MiscAmt = value;
    }

    /**
     * Gets the value of the seqNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSeqNum() {
        return seqNum;
    }

    /**
     * Sets the value of the seqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSeqNum(Integer value) {
        this.seqNum = value;
    }

    /**
     * Gets the value of the shortChar01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortChar01() {
        return shortChar01;
    }

    /**
     * Sets the value of the shortChar01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortChar01(String value) {
        this.shortChar01 = value;
    }

    /**
     * Gets the value of the shortChar02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortChar02() {
        return shortChar02;
    }

    /**
     * Sets the value of the shortChar02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortChar02(String value) {
        this.shortChar02 = value;
    }

    /**
     * Gets the value of the shortChar03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortChar03() {
        return shortChar03;
    }

    /**
     * Sets the value of the shortChar03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortChar03(String value) {
        this.shortChar03 = value;
    }

    /**
     * Gets the value of the shortChar04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortChar04() {
        return shortChar04;
    }

    /**
     * Sets the value of the shortChar04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortChar04(String value) {
        this.shortChar04 = value;
    }

    /**
     * Gets the value of the shortChar05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortChar05() {
        return shortChar05;
    }

    /**
     * Sets the value of the shortChar05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortChar05(String value) {
        this.shortChar05 = value;
    }

    /**
     * Gets the value of the sysRevID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSysRevID() {
        return sysRevID;
    }

    /**
     * Sets the value of the sysRevID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSysRevID(Integer value) {
        this.sysRevID = value;
    }

    /**
     * Gets the value of the sysRowID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysRowID() {
        return sysRowID;
    }

    /**
     * Sets the value of the sysRowID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysRowID(String value) {
        this.sysRowID = value;
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
        return type;
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

}
