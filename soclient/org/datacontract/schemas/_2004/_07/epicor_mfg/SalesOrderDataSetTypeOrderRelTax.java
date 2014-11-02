
package org.datacontract.schemas._2004._07.epicor_mfg;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SalesOrderDataSetTypeOrderRelTax complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrderDataSetTypeOrderRelTax">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BitFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ChangeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ChangeTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ChangedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CheckBox01" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CheckBox02" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CheckBox03" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CheckBox04" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CheckBox05" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CollectionType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CollectionTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencySwitch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DBRowIdent" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="Date01" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Date02" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Date03" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Date04" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Date05" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DedTaxAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DefTaxAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DefTaxableAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DisplaySymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocDedTaxAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocDefTaxAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocDefTaxableAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocDisplaySymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocFixedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocReportableAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocTaxAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocTaxableAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ECAcquisitionSeq" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EntryProcess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExemptPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ExemptType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FixedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ManAdd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Manual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NoChangeManual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Number01" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Number02" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Number03" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Number04" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Number05" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OrderLine" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OrderNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OrderRelNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RateCodeDescDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReportableAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ResolutionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ResolutionNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReverseCharge" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RowIdent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RowMod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rpt1DedTaxAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1DefTaxAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1DefTaxableAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1Discount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1FixedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1ReportableAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1TaxAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1TaxableAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2DedTaxAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2DefTaxAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2DefTaxableAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2Discount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2FixedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2ReportableAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2TaxAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2TaxableAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3DedTaxAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3DefTaxAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3DefTaxableAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3Discount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3FixedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3ReportableAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3TaxAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3TaxableAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SalesTaxDescDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortChar01" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortChar02" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortChar03" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortChar04" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortChar05" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SysRevID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SysRowID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxRateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TaxableAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TextCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Timing" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesOrderDataSetTypeOrderRelTax", propOrder = {
    "bitFlag",
    "changeDate",
    "changeTime",
    "changedBy",
    "checkBox01",
    "checkBox02",
    "checkBox03",
    "checkBox04",
    "checkBox05",
    "collectionType",
    "collectionTypeDescription",
    "company",
    "currencyCode",
    "currencySwitch",
    "dbRowIdent",
    "date01",
    "date02",
    "date03",
    "date04",
    "date05",
    "dedTaxAmt",
    "defTaxAmt",
    "defTaxableAmt",
    "discount",
    "displaySymbol",
    "docDedTaxAmt",
    "docDefTaxAmt",
    "docDefTaxableAmt",
    "docDiscount",
    "docDisplaySymbol",
    "docFixedAmount",
    "docReportableAmt",
    "docTaxAmt",
    "docTaxableAmt",
    "ecAcquisitionSeq",
    "entryProcess",
    "exemptPercent",
    "exemptType",
    "fixedAmount",
    "manAdd",
    "manual",
    "noChangeManual",
    "number01",
    "number02",
    "number03",
    "number04",
    "number05",
    "orderLine",
    "orderNum",
    "orderRelNum",
    "percent",
    "rateCode",
    "rateCodeDescDescription",
    "reportableAmt",
    "resolutionDate",
    "resolutionNum",
    "reverseCharge",
    "rowIdent",
    "rowMod",
    "rpt1DedTaxAmt",
    "rpt1DefTaxAmt",
    "rpt1DefTaxableAmt",
    "rpt1Discount",
    "rpt1FixedAmount",
    "rpt1ReportableAmt",
    "rpt1TaxAmt",
    "rpt1TaxableAmt",
    "rpt2DedTaxAmt",
    "rpt2DefTaxAmt",
    "rpt2DefTaxableAmt",
    "rpt2Discount",
    "rpt2FixedAmount",
    "rpt2ReportableAmt",
    "rpt2TaxAmt",
    "rpt2TaxableAmt",
    "rpt3DedTaxAmt",
    "rpt3DefTaxAmt",
    "rpt3DefTaxableAmt",
    "rpt3Discount",
    "rpt3FixedAmount",
    "rpt3ReportableAmt",
    "rpt3TaxAmt",
    "rpt3TaxableAmt",
    "salesTaxDescDescription",
    "shortChar01",
    "shortChar02",
    "shortChar03",
    "shortChar04",
    "shortChar05",
    "sysRevID",
    "sysRowID",
    "taxAmt",
    "taxCode",
    "taxRateDate",
    "taxableAmt",
    "textCode",
    "timing"
})
public class SalesOrderDataSetTypeOrderRelTax {

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
    @XmlElement(name = "CollectionType", nillable = true)
    protected Integer collectionType;
    @XmlElement(name = "CollectionTypeDescription", nillable = true)
    protected String collectionTypeDescription;
    @XmlElement(name = "Company", nillable = true)
    protected String company;
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
    @XmlElement(name = "DedTaxAmt", nillable = true)
    protected BigDecimal dedTaxAmt;
    @XmlElement(name = "DefTaxAmt", nillable = true)
    protected BigDecimal defTaxAmt;
    @XmlElement(name = "DefTaxableAmt", nillable = true)
    protected BigDecimal defTaxableAmt;
    @XmlElement(name = "Discount", nillable = true)
    protected BigDecimal discount;
    @XmlElement(name = "DisplaySymbol", nillable = true)
    protected String displaySymbol;
    @XmlElement(name = "DocDedTaxAmt", nillable = true)
    protected BigDecimal docDedTaxAmt;
    @XmlElement(name = "DocDefTaxAmt", nillable = true)
    protected BigDecimal docDefTaxAmt;
    @XmlElement(name = "DocDefTaxableAmt", nillable = true)
    protected BigDecimal docDefTaxableAmt;
    @XmlElement(name = "DocDiscount", nillable = true)
    protected BigDecimal docDiscount;
    @XmlElement(name = "DocDisplaySymbol", nillable = true)
    protected String docDisplaySymbol;
    @XmlElement(name = "DocFixedAmount", nillable = true)
    protected BigDecimal docFixedAmount;
    @XmlElement(name = "DocReportableAmt", nillable = true)
    protected BigDecimal docReportableAmt;
    @XmlElement(name = "DocTaxAmt", nillable = true)
    protected BigDecimal docTaxAmt;
    @XmlElement(name = "DocTaxableAmt", nillable = true)
    protected BigDecimal docTaxableAmt;
    @XmlElement(name = "ECAcquisitionSeq", nillable = true)
    protected Integer ecAcquisitionSeq;
    @XmlElement(name = "EntryProcess", nillable = true)
    protected String entryProcess;
    @XmlElement(name = "ExemptPercent", nillable = true)
    protected BigDecimal exemptPercent;
    @XmlElement(name = "ExemptType", nillable = true)
    protected Integer exemptType;
    @XmlElement(name = "FixedAmount", nillable = true)
    protected BigDecimal fixedAmount;
    @XmlElement(name = "ManAdd", nillable = true)
    protected Boolean manAdd;
    @XmlElement(name = "Manual", nillable = true)
    protected Boolean manual;
    @XmlElement(name = "NoChangeManual", nillable = true)
    protected Boolean noChangeManual;
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
    @XmlElement(name = "OrderLine", nillable = true)
    protected Integer orderLine;
    @XmlElement(name = "OrderNum", nillable = true)
    protected Integer orderNum;
    @XmlElement(name = "OrderRelNum", nillable = true)
    protected Integer orderRelNum;
    @XmlElement(name = "Percent", nillable = true)
    protected BigDecimal percent;
    @XmlElement(name = "RateCode", nillable = true)
    protected String rateCode;
    @XmlElement(name = "RateCodeDescDescription", nillable = true)
    protected String rateCodeDescDescription;
    @XmlElement(name = "ReportableAmt", nillable = true)
    protected BigDecimal reportableAmt;
    @XmlElement(name = "ResolutionDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar resolutionDate;
    @XmlElement(name = "ResolutionNum", nillable = true)
    protected String resolutionNum;
    @XmlElement(name = "ReverseCharge", nillable = true)
    protected Boolean reverseCharge;
    @XmlElement(name = "RowIdent", nillable = true)
    protected String rowIdent;
    @XmlElement(name = "RowMod", nillable = true)
    protected String rowMod;
    @XmlElement(name = "Rpt1DedTaxAmt", nillable = true)
    protected BigDecimal rpt1DedTaxAmt;
    @XmlElement(name = "Rpt1DefTaxAmt", nillable = true)
    protected BigDecimal rpt1DefTaxAmt;
    @XmlElement(name = "Rpt1DefTaxableAmt", nillable = true)
    protected BigDecimal rpt1DefTaxableAmt;
    @XmlElement(name = "Rpt1Discount", nillable = true)
    protected BigDecimal rpt1Discount;
    @XmlElement(name = "Rpt1FixedAmount", nillable = true)
    protected BigDecimal rpt1FixedAmount;
    @XmlElement(name = "Rpt1ReportableAmt", nillable = true)
    protected BigDecimal rpt1ReportableAmt;
    @XmlElement(name = "Rpt1TaxAmt", nillable = true)
    protected BigDecimal rpt1TaxAmt;
    @XmlElement(name = "Rpt1TaxableAmt", nillable = true)
    protected BigDecimal rpt1TaxableAmt;
    @XmlElement(name = "Rpt2DedTaxAmt", nillable = true)
    protected BigDecimal rpt2DedTaxAmt;
    @XmlElement(name = "Rpt2DefTaxAmt", nillable = true)
    protected BigDecimal rpt2DefTaxAmt;
    @XmlElement(name = "Rpt2DefTaxableAmt", nillable = true)
    protected BigDecimal rpt2DefTaxableAmt;
    @XmlElement(name = "Rpt2Discount", nillable = true)
    protected BigDecimal rpt2Discount;
    @XmlElement(name = "Rpt2FixedAmount", nillable = true)
    protected BigDecimal rpt2FixedAmount;
    @XmlElement(name = "Rpt2ReportableAmt", nillable = true)
    protected BigDecimal rpt2ReportableAmt;
    @XmlElement(name = "Rpt2TaxAmt", nillable = true)
    protected BigDecimal rpt2TaxAmt;
    @XmlElement(name = "Rpt2TaxableAmt", nillable = true)
    protected BigDecimal rpt2TaxableAmt;
    @XmlElement(name = "Rpt3DedTaxAmt", nillable = true)
    protected BigDecimal rpt3DedTaxAmt;
    @XmlElement(name = "Rpt3DefTaxAmt", nillable = true)
    protected BigDecimal rpt3DefTaxAmt;
    @XmlElement(name = "Rpt3DefTaxableAmt", nillable = true)
    protected BigDecimal rpt3DefTaxableAmt;
    @XmlElement(name = "Rpt3Discount", nillable = true)
    protected BigDecimal rpt3Discount;
    @XmlElement(name = "Rpt3FixedAmount", nillable = true)
    protected BigDecimal rpt3FixedAmount;
    @XmlElement(name = "Rpt3ReportableAmt", nillable = true)
    protected BigDecimal rpt3ReportableAmt;
    @XmlElement(name = "Rpt3TaxAmt", nillable = true)
    protected BigDecimal rpt3TaxAmt;
    @XmlElement(name = "Rpt3TaxableAmt", nillable = true)
    protected BigDecimal rpt3TaxableAmt;
    @XmlElement(name = "SalesTaxDescDescription", nillable = true)
    protected String salesTaxDescDescription;
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
    @XmlElement(name = "TaxAmt", nillable = true)
    protected BigDecimal taxAmt;
    @XmlElement(name = "TaxCode", nillable = true)
    protected String taxCode;
    @XmlElement(name = "TaxRateDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar taxRateDate;
    @XmlElement(name = "TaxableAmt", nillable = true)
    protected BigDecimal taxableAmt;
    @XmlElement(name = "TextCode", nillable = true)
    protected String textCode;
    @XmlElement(name = "Timing", nillable = true)
    protected Integer timing;

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
     * Gets the value of the collectionType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCollectionType() {
        return collectionType;
    }

    /**
     * Sets the value of the collectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCollectionType(Integer value) {
        this.collectionType = value;
    }

    /**
     * Gets the value of the collectionTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionTypeDescription() {
        return collectionTypeDescription;
    }

    /**
     * Sets the value of the collectionTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionTypeDescription(String value) {
        this.collectionTypeDescription = value;
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
     * Gets the value of the dedTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDedTaxAmt() {
        return dedTaxAmt;
    }

    /**
     * Sets the value of the dedTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDedTaxAmt(BigDecimal value) {
        this.dedTaxAmt = value;
    }

    /**
     * Gets the value of the defTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDefTaxAmt() {
        return defTaxAmt;
    }

    /**
     * Sets the value of the defTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDefTaxAmt(BigDecimal value) {
        this.defTaxAmt = value;
    }

    /**
     * Gets the value of the defTaxableAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDefTaxableAmt() {
        return defTaxableAmt;
    }

    /**
     * Sets the value of the defTaxableAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDefTaxableAmt(BigDecimal value) {
        this.defTaxableAmt = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscount(BigDecimal value) {
        this.discount = value;
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
     * Gets the value of the docDedTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocDedTaxAmt() {
        return docDedTaxAmt;
    }

    /**
     * Sets the value of the docDedTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocDedTaxAmt(BigDecimal value) {
        this.docDedTaxAmt = value;
    }

    /**
     * Gets the value of the docDefTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocDefTaxAmt() {
        return docDefTaxAmt;
    }

    /**
     * Sets the value of the docDefTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocDefTaxAmt(BigDecimal value) {
        this.docDefTaxAmt = value;
    }

    /**
     * Gets the value of the docDefTaxableAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocDefTaxableAmt() {
        return docDefTaxableAmt;
    }

    /**
     * Sets the value of the docDefTaxableAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocDefTaxableAmt(BigDecimal value) {
        this.docDefTaxableAmt = value;
    }

    /**
     * Gets the value of the docDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocDiscount() {
        return docDiscount;
    }

    /**
     * Sets the value of the docDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocDiscount(BigDecimal value) {
        this.docDiscount = value;
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
     * Gets the value of the docFixedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocFixedAmount() {
        return docFixedAmount;
    }

    /**
     * Sets the value of the docFixedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocFixedAmount(BigDecimal value) {
        this.docFixedAmount = value;
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
     * Gets the value of the ecAcquisitionSeq property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getECAcquisitionSeq() {
        return ecAcquisitionSeq;
    }

    /**
     * Sets the value of the ecAcquisitionSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setECAcquisitionSeq(Integer value) {
        this.ecAcquisitionSeq = value;
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
     * Gets the value of the exemptPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExemptPercent() {
        return exemptPercent;
    }

    /**
     * Sets the value of the exemptPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExemptPercent(BigDecimal value) {
        this.exemptPercent = value;
    }

    /**
     * Gets the value of the exemptType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExemptType() {
        return exemptType;
    }

    /**
     * Sets the value of the exemptType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExemptType(Integer value) {
        this.exemptType = value;
    }

    /**
     * Gets the value of the fixedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFixedAmount() {
        return fixedAmount;
    }

    /**
     * Sets the value of the fixedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFixedAmount(BigDecimal value) {
        this.fixedAmount = value;
    }

    /**
     * Gets the value of the manAdd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isManAdd() {
        return manAdd;
    }

    /**
     * Sets the value of the manAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManAdd(Boolean value) {
        this.manAdd = value;
    }

    /**
     * Gets the value of the manual property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isManual() {
        return manual;
    }

    /**
     * Sets the value of the manual property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManual(Boolean value) {
        this.manual = value;
    }

    /**
     * Gets the value of the noChangeManual property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoChangeManual() {
        return noChangeManual;
    }

    /**
     * Sets the value of the noChangeManual property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoChangeManual(Boolean value) {
        this.noChangeManual = value;
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
     * Gets the value of the orderRelNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrderRelNum() {
        return orderRelNum;
    }

    /**
     * Sets the value of the orderRelNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrderRelNum(Integer value) {
        this.orderRelNum = value;
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
     * Gets the value of the rateCodeDescDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateCodeDescDescription() {
        return rateCodeDescDescription;
    }

    /**
     * Sets the value of the rateCodeDescDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateCodeDescDescription(String value) {
        this.rateCodeDescDescription = value;
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
     * Gets the value of the resolutionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResolutionDate() {
        return resolutionDate;
    }

    /**
     * Sets the value of the resolutionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResolutionDate(XMLGregorianCalendar value) {
        this.resolutionDate = value;
    }

    /**
     * Gets the value of the resolutionNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolutionNum() {
        return resolutionNum;
    }

    /**
     * Sets the value of the resolutionNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolutionNum(String value) {
        this.resolutionNum = value;
    }

    /**
     * Gets the value of the reverseCharge property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReverseCharge() {
        return reverseCharge;
    }

    /**
     * Sets the value of the reverseCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReverseCharge(Boolean value) {
        this.reverseCharge = value;
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
     * Gets the value of the rpt1DedTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1DedTaxAmt() {
        return rpt1DedTaxAmt;
    }

    /**
     * Sets the value of the rpt1DedTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1DedTaxAmt(BigDecimal value) {
        this.rpt1DedTaxAmt = value;
    }

    /**
     * Gets the value of the rpt1DefTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1DefTaxAmt() {
        return rpt1DefTaxAmt;
    }

    /**
     * Sets the value of the rpt1DefTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1DefTaxAmt(BigDecimal value) {
        this.rpt1DefTaxAmt = value;
    }

    /**
     * Gets the value of the rpt1DefTaxableAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1DefTaxableAmt() {
        return rpt1DefTaxableAmt;
    }

    /**
     * Sets the value of the rpt1DefTaxableAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1DefTaxableAmt(BigDecimal value) {
        this.rpt1DefTaxableAmt = value;
    }

    /**
     * Gets the value of the rpt1Discount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1Discount() {
        return rpt1Discount;
    }

    /**
     * Sets the value of the rpt1Discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1Discount(BigDecimal value) {
        this.rpt1Discount = value;
    }

    /**
     * Gets the value of the rpt1FixedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1FixedAmount() {
        return rpt1FixedAmount;
    }

    /**
     * Sets the value of the rpt1FixedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1FixedAmount(BigDecimal value) {
        this.rpt1FixedAmount = value;
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
     * Gets the value of the rpt2DedTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2DedTaxAmt() {
        return rpt2DedTaxAmt;
    }

    /**
     * Sets the value of the rpt2DedTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2DedTaxAmt(BigDecimal value) {
        this.rpt2DedTaxAmt = value;
    }

    /**
     * Gets the value of the rpt2DefTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2DefTaxAmt() {
        return rpt2DefTaxAmt;
    }

    /**
     * Sets the value of the rpt2DefTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2DefTaxAmt(BigDecimal value) {
        this.rpt2DefTaxAmt = value;
    }

    /**
     * Gets the value of the rpt2DefTaxableAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2DefTaxableAmt() {
        return rpt2DefTaxableAmt;
    }

    /**
     * Sets the value of the rpt2DefTaxableAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2DefTaxableAmt(BigDecimal value) {
        this.rpt2DefTaxableAmt = value;
    }

    /**
     * Gets the value of the rpt2Discount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2Discount() {
        return rpt2Discount;
    }

    /**
     * Sets the value of the rpt2Discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2Discount(BigDecimal value) {
        this.rpt2Discount = value;
    }

    /**
     * Gets the value of the rpt2FixedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2FixedAmount() {
        return rpt2FixedAmount;
    }

    /**
     * Sets the value of the rpt2FixedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2FixedAmount(BigDecimal value) {
        this.rpt2FixedAmount = value;
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
     * Gets the value of the rpt3DedTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3DedTaxAmt() {
        return rpt3DedTaxAmt;
    }

    /**
     * Sets the value of the rpt3DedTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3DedTaxAmt(BigDecimal value) {
        this.rpt3DedTaxAmt = value;
    }

    /**
     * Gets the value of the rpt3DefTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3DefTaxAmt() {
        return rpt3DefTaxAmt;
    }

    /**
     * Sets the value of the rpt3DefTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3DefTaxAmt(BigDecimal value) {
        this.rpt3DefTaxAmt = value;
    }

    /**
     * Gets the value of the rpt3DefTaxableAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3DefTaxableAmt() {
        return rpt3DefTaxableAmt;
    }

    /**
     * Sets the value of the rpt3DefTaxableAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3DefTaxableAmt(BigDecimal value) {
        this.rpt3DefTaxableAmt = value;
    }

    /**
     * Gets the value of the rpt3Discount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3Discount() {
        return rpt3Discount;
    }

    /**
     * Sets the value of the rpt3Discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3Discount(BigDecimal value) {
        this.rpt3Discount = value;
    }

    /**
     * Gets the value of the rpt3FixedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3FixedAmount() {
        return rpt3FixedAmount;
    }

    /**
     * Sets the value of the rpt3FixedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3FixedAmount(BigDecimal value) {
        this.rpt3FixedAmount = value;
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
     * Gets the value of the salesTaxDescDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesTaxDescDescription() {
        return salesTaxDescDescription;
    }

    /**
     * Sets the value of the salesTaxDescDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesTaxDescDescription(String value) {
        this.salesTaxDescDescription = value;
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
     * Gets the value of the taxRateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTaxRateDate() {
        return taxRateDate;
    }

    /**
     * Sets the value of the taxRateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTaxRateDate(XMLGregorianCalendar value) {
        this.taxRateDate = value;
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

    /**
     * Gets the value of the textCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextCode() {
        return textCode;
    }

    /**
     * Sets the value of the textCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextCode(String value) {
        this.textCode = value;
    }

    /**
     * Gets the value of the timing property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTiming() {
        return timing;
    }

    /**
     * Sets the value of the timing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTiming(Integer value) {
        this.timing = value;
    }

}
