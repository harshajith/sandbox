
package org.datacontract.schemas._2004._07.epicor_mfg;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OrdDtlQuoteQtyDataSetTypeQuoteQty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrdDtlQuoteQtyDataSetTypeQuoteQty">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaseCurrSymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BitFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BurdenMarkUp" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CalcMarkup" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CalcMarkupProfit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CalcProfit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CalcProfitProfit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CalcUPCommMarkup" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CalcUPCommProfit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CalcUnitCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CalcUnitPriceMarkup" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CalcUnitPriceProfit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ChangeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ChangeTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ChangedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Character01" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Character02" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Character03" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Character04" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Character05" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Character06" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Character07" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Character08" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Character09" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Character10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CheckBox01" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CheckBox02" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CheckBox03" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CheckBox04" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CheckBox05" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CheckBox06" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CheckBox07" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CheckBox08" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CheckBox09" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CheckBox10" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CommissionPct" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
 *         &lt;element name="Date06" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Date07" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Date08" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Date09" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Date10" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DisableMtlMarkup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DocInUnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocUnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="IUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InUnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LaborMarkUp" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MarkUpID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaterialMarkUp" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MaterialMarkupM" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MaterialMarkupP" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MiscChrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiscCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MiscCostDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiscCostMarkUp" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MtlBurMarkUp" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Number01" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Number02" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Number03" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Number04" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Number05" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Number06" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Number07" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Number08" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Number09" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Number10" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OurQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PercentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceBurMarkup" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PriceBurProfit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PriceLbrMarkup" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PriceLbrProfit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PriceMscChrgMarkup" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PriceMscChrgProfit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PriceMtlBurMarkup" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PriceMtlBurProfit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PriceMtlMarkup" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PriceMtlProfit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PricePerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PricePerFactor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PriceSubMarkup" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PriceSubProfit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PriceTotalCommMarkup" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PriceTotalCommProfit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PriceTotalMarkup" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PriceTotalProfit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="QtyNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="QuoteLine" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="QuoteNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="QuoteNumCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuotedMarkup" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="QuotedProfit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RollUpCostNeeded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RowIdent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RowMod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rpt1InUnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1UnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2InUnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2UnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3InUnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3UnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SalesUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SellingFactor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SellingFactorDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SellingQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SubcontractMarkUp" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SysRevID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SysRowID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalBurCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalCommProfit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalCommission" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalLbrCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalMarkup" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalMtlBurCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalMtlCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalProdBurHrs" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalProdLbrHrs" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalProfit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalQuotedPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalSetupBurHrs" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalSetupLbrHrs" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalSubCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="UserChangedUnitPrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WQUnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrdDtlQuoteQtyDataSetTypeQuoteQty", propOrder = {
    "baseCurrSymbol",
    "bitFlag",
    "burdenMarkUp",
    "calcMarkup",
    "calcMarkupProfit",
    "calcProfit",
    "calcProfitProfit",
    "calcUPCommMarkup",
    "calcUPCommProfit",
    "calcUnitCost",
    "calcUnitPriceMarkup",
    "calcUnitPriceProfit",
    "changeDate",
    "changeTime",
    "changedBy",
    "character01",
    "character02",
    "character03",
    "character04",
    "character05",
    "character06",
    "character07",
    "character08",
    "character09",
    "character10",
    "checkBox01",
    "checkBox02",
    "checkBox03",
    "checkBox04",
    "checkBox05",
    "checkBox06",
    "checkBox07",
    "checkBox08",
    "checkBox09",
    "checkBox10",
    "commissionPct",
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
    "date06",
    "date07",
    "date08",
    "date09",
    "date10",
    "disableMtlMarkup",
    "docInUnitPrice",
    "docUnitPrice",
    "ium",
    "inUnitPrice",
    "laborMarkUp",
    "markUpID",
    "materialMarkUp",
    "materialMarkupM",
    "materialMarkupP",
    "miscChrg",
    "miscCost",
    "miscCostDesc",
    "miscCostMarkUp",
    "mtlBurMarkUp",
    "number01",
    "number02",
    "number03",
    "number04",
    "number05",
    "number06",
    "number07",
    "number08",
    "number09",
    "number10",
    "ourQuantity",
    "percentType",
    "priceBurMarkup",
    "priceBurProfit",
    "priceLbrMarkup",
    "priceLbrProfit",
    "priceMscChrgMarkup",
    "priceMscChrgProfit",
    "priceMtlBurMarkup",
    "priceMtlBurProfit",
    "priceMtlMarkup",
    "priceMtlProfit",
    "pricePerCode",
    "pricePerFactor",
    "priceSubMarkup",
    "priceSubProfit",
    "priceTotalCommMarkup",
    "priceTotalCommProfit",
    "priceTotalMarkup",
    "priceTotalProfit",
    "qtyNum",
    "quoteLine",
    "quoteNum",
    "quoteNumCurrencyCode",
    "quotedMarkup",
    "quotedProfit",
    "rollUpCostNeeded",
    "rowIdent",
    "rowMod",
    "rpt1InUnitPrice",
    "rpt1UnitPrice",
    "rpt2InUnitPrice",
    "rpt2UnitPrice",
    "rpt3InUnitPrice",
    "rpt3UnitPrice",
    "salesUM",
    "sellingFactor",
    "sellingFactorDirection",
    "sellingQuantity",
    "subcontractMarkUp",
    "sysRevID",
    "sysRowID",
    "totalBurCost",
    "totalCommProfit",
    "totalCommission",
    "totalCost",
    "totalLbrCost",
    "totalMarkup",
    "totalMtlBurCost",
    "totalMtlCost",
    "totalProdBurHrs",
    "totalProdLbrHrs",
    "totalProfit",
    "totalQuotedPrice",
    "totalSetupBurHrs",
    "totalSetupLbrHrs",
    "totalSubCost",
    "unitPrice",
    "userChangedUnitPrice",
    "wqUnitPrice"
})
public class OrdDtlQuoteQtyDataSetTypeQuoteQty {

    @XmlElement(name = "BaseCurrSymbol", nillable = true)
    protected String baseCurrSymbol;
    @XmlElement(name = "BitFlag", nillable = true)
    protected Integer bitFlag;
    @XmlElement(name = "BurdenMarkUp", nillable = true)
    protected BigDecimal burdenMarkUp;
    @XmlElement(name = "CalcMarkup", nillable = true)
    protected BigDecimal calcMarkup;
    @XmlElement(name = "CalcMarkupProfit", nillable = true)
    protected BigDecimal calcMarkupProfit;
    @XmlElement(name = "CalcProfit", nillable = true)
    protected BigDecimal calcProfit;
    @XmlElement(name = "CalcProfitProfit", nillable = true)
    protected BigDecimal calcProfitProfit;
    @XmlElement(name = "CalcUPCommMarkup", nillable = true)
    protected BigDecimal calcUPCommMarkup;
    @XmlElement(name = "CalcUPCommProfit", nillable = true)
    protected BigDecimal calcUPCommProfit;
    @XmlElement(name = "CalcUnitCost", nillable = true)
    protected BigDecimal calcUnitCost;
    @XmlElement(name = "CalcUnitPriceMarkup", nillable = true)
    protected BigDecimal calcUnitPriceMarkup;
    @XmlElement(name = "CalcUnitPriceProfit", nillable = true)
    protected BigDecimal calcUnitPriceProfit;
    @XmlElement(name = "ChangeDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changeDate;
    @XmlElement(name = "ChangeTime", nillable = true)
    protected Integer changeTime;
    @XmlElement(name = "ChangedBy", nillable = true)
    protected String changedBy;
    @XmlElement(name = "Character01", nillable = true)
    protected String character01;
    @XmlElement(name = "Character02", nillable = true)
    protected String character02;
    @XmlElement(name = "Character03", nillable = true)
    protected String character03;
    @XmlElement(name = "Character04", nillable = true)
    protected String character04;
    @XmlElement(name = "Character05", nillable = true)
    protected String character05;
    @XmlElement(name = "Character06", nillable = true)
    protected String character06;
    @XmlElement(name = "Character07", nillable = true)
    protected String character07;
    @XmlElement(name = "Character08", nillable = true)
    protected String character08;
    @XmlElement(name = "Character09", nillable = true)
    protected String character09;
    @XmlElement(name = "Character10", nillable = true)
    protected String character10;
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
    @XmlElement(name = "CheckBox06", nillable = true)
    protected Boolean checkBox06;
    @XmlElement(name = "CheckBox07", nillable = true)
    protected Boolean checkBox07;
    @XmlElement(name = "CheckBox08", nillable = true)
    protected Boolean checkBox08;
    @XmlElement(name = "CheckBox09", nillable = true)
    protected Boolean checkBox09;
    @XmlElement(name = "CheckBox10", nillable = true)
    protected Boolean checkBox10;
    @XmlElement(name = "CommissionPct", nillable = true)
    protected BigDecimal commissionPct;
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
    @XmlElement(name = "Date06", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date06;
    @XmlElement(name = "Date07", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date07;
    @XmlElement(name = "Date08", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date08;
    @XmlElement(name = "Date09", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date09;
    @XmlElement(name = "Date10", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date10;
    @XmlElement(name = "DisableMtlMarkup", nillable = true)
    protected Boolean disableMtlMarkup;
    @XmlElement(name = "DocInUnitPrice", nillable = true)
    protected BigDecimal docInUnitPrice;
    @XmlElement(name = "DocUnitPrice", nillable = true)
    protected BigDecimal docUnitPrice;
    @XmlElement(name = "IUM", nillable = true)
    protected String ium;
    @XmlElement(name = "InUnitPrice", nillable = true)
    protected BigDecimal inUnitPrice;
    @XmlElement(name = "LaborMarkUp", nillable = true)
    protected BigDecimal laborMarkUp;
    @XmlElement(name = "MarkUpID", nillable = true)
    protected String markUpID;
    @XmlElement(name = "MaterialMarkUp", nillable = true)
    protected BigDecimal materialMarkUp;
    @XmlElement(name = "MaterialMarkupM", nillable = true)
    protected BigDecimal materialMarkupM;
    @XmlElement(name = "MaterialMarkupP", nillable = true)
    protected BigDecimal materialMarkupP;
    @XmlElement(name = "MiscChrg", nillable = true)
    protected String miscChrg;
    @XmlElement(name = "MiscCost", nillable = true)
    protected BigDecimal miscCost;
    @XmlElement(name = "MiscCostDesc", nillable = true)
    protected String miscCostDesc;
    @XmlElement(name = "MiscCostMarkUp", nillable = true)
    protected BigDecimal miscCostMarkUp;
    @XmlElement(name = "MtlBurMarkUp", nillable = true)
    protected BigDecimal mtlBurMarkUp;
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
    @XmlElement(name = "Number06", nillable = true)
    protected BigDecimal number06;
    @XmlElement(name = "Number07", nillable = true)
    protected BigDecimal number07;
    @XmlElement(name = "Number08", nillable = true)
    protected BigDecimal number08;
    @XmlElement(name = "Number09", nillable = true)
    protected BigDecimal number09;
    @XmlElement(name = "Number10", nillable = true)
    protected BigDecimal number10;
    @XmlElement(name = "OurQuantity", nillable = true)
    protected BigDecimal ourQuantity;
    @XmlElement(name = "PercentType", nillable = true)
    protected String percentType;
    @XmlElement(name = "PriceBurMarkup", nillable = true)
    protected BigDecimal priceBurMarkup;
    @XmlElement(name = "PriceBurProfit", nillable = true)
    protected BigDecimal priceBurProfit;
    @XmlElement(name = "PriceLbrMarkup", nillable = true)
    protected BigDecimal priceLbrMarkup;
    @XmlElement(name = "PriceLbrProfit", nillable = true)
    protected BigDecimal priceLbrProfit;
    @XmlElement(name = "PriceMscChrgMarkup", nillable = true)
    protected BigDecimal priceMscChrgMarkup;
    @XmlElement(name = "PriceMscChrgProfit", nillable = true)
    protected BigDecimal priceMscChrgProfit;
    @XmlElement(name = "PriceMtlBurMarkup", nillable = true)
    protected BigDecimal priceMtlBurMarkup;
    @XmlElement(name = "PriceMtlBurProfit", nillable = true)
    protected BigDecimal priceMtlBurProfit;
    @XmlElement(name = "PriceMtlMarkup", nillable = true)
    protected BigDecimal priceMtlMarkup;
    @XmlElement(name = "PriceMtlProfit", nillable = true)
    protected BigDecimal priceMtlProfit;
    @XmlElement(name = "PricePerCode", nillable = true)
    protected String pricePerCode;
    @XmlElement(name = "PricePerFactor", nillable = true)
    protected Integer pricePerFactor;
    @XmlElement(name = "PriceSubMarkup", nillable = true)
    protected BigDecimal priceSubMarkup;
    @XmlElement(name = "PriceSubProfit", nillable = true)
    protected BigDecimal priceSubProfit;
    @XmlElement(name = "PriceTotalCommMarkup", nillable = true)
    protected BigDecimal priceTotalCommMarkup;
    @XmlElement(name = "PriceTotalCommProfit", nillable = true)
    protected BigDecimal priceTotalCommProfit;
    @XmlElement(name = "PriceTotalMarkup", nillable = true)
    protected BigDecimal priceTotalMarkup;
    @XmlElement(name = "PriceTotalProfit", nillable = true)
    protected BigDecimal priceTotalProfit;
    @XmlElement(name = "QtyNum", nillable = true)
    protected Integer qtyNum;
    @XmlElement(name = "QuoteLine", nillable = true)
    protected Integer quoteLine;
    @XmlElement(name = "QuoteNum", nillable = true)
    protected Integer quoteNum;
    @XmlElement(name = "QuoteNumCurrencyCode", nillable = true)
    protected String quoteNumCurrencyCode;
    @XmlElement(name = "QuotedMarkup", nillable = true)
    protected BigDecimal quotedMarkup;
    @XmlElement(name = "QuotedProfit", nillable = true)
    protected BigDecimal quotedProfit;
    @XmlElement(name = "RollUpCostNeeded", nillable = true)
    protected Boolean rollUpCostNeeded;
    @XmlElement(name = "RowIdent", nillable = true)
    protected String rowIdent;
    @XmlElement(name = "RowMod", nillable = true)
    protected String rowMod;
    @XmlElement(name = "Rpt1InUnitPrice", nillable = true)
    protected BigDecimal rpt1InUnitPrice;
    @XmlElement(name = "Rpt1UnitPrice", nillable = true)
    protected BigDecimal rpt1UnitPrice;
    @XmlElement(name = "Rpt2InUnitPrice", nillable = true)
    protected BigDecimal rpt2InUnitPrice;
    @XmlElement(name = "Rpt2UnitPrice", nillable = true)
    protected BigDecimal rpt2UnitPrice;
    @XmlElement(name = "Rpt3InUnitPrice", nillable = true)
    protected BigDecimal rpt3InUnitPrice;
    @XmlElement(name = "Rpt3UnitPrice", nillable = true)
    protected BigDecimal rpt3UnitPrice;
    @XmlElement(name = "SalesUM", nillable = true)
    protected String salesUM;
    @XmlElement(name = "SellingFactor", nillable = true)
    protected BigDecimal sellingFactor;
    @XmlElement(name = "SellingFactorDirection", nillable = true)
    protected String sellingFactorDirection;
    @XmlElement(name = "SellingQuantity", nillable = true)
    protected BigDecimal sellingQuantity;
    @XmlElement(name = "SubcontractMarkUp", nillable = true)
    protected BigDecimal subcontractMarkUp;
    @XmlElement(name = "SysRevID", nillable = true)
    protected Integer sysRevID;
    @XmlElement(name = "SysRowID", nillable = true)
    protected String sysRowID;
    @XmlElement(name = "TotalBurCost", nillable = true)
    protected BigDecimal totalBurCost;
    @XmlElement(name = "TotalCommProfit", nillable = true)
    protected BigDecimal totalCommProfit;
    @XmlElement(name = "TotalCommission", nillable = true)
    protected BigDecimal totalCommission;
    @XmlElement(name = "TotalCost", nillable = true)
    protected BigDecimal totalCost;
    @XmlElement(name = "TotalLbrCost", nillable = true)
    protected BigDecimal totalLbrCost;
    @XmlElement(name = "TotalMarkup", nillable = true)
    protected BigDecimal totalMarkup;
    @XmlElement(name = "TotalMtlBurCost", nillable = true)
    protected BigDecimal totalMtlBurCost;
    @XmlElement(name = "TotalMtlCost", nillable = true)
    protected BigDecimal totalMtlCost;
    @XmlElement(name = "TotalProdBurHrs", nillable = true)
    protected BigDecimal totalProdBurHrs;
    @XmlElement(name = "TotalProdLbrHrs", nillable = true)
    protected BigDecimal totalProdLbrHrs;
    @XmlElement(name = "TotalProfit", nillable = true)
    protected BigDecimal totalProfit;
    @XmlElement(name = "TotalQuotedPrice", nillable = true)
    protected BigDecimal totalQuotedPrice;
    @XmlElement(name = "TotalSetupBurHrs", nillable = true)
    protected BigDecimal totalSetupBurHrs;
    @XmlElement(name = "TotalSetupLbrHrs", nillable = true)
    protected BigDecimal totalSetupLbrHrs;
    @XmlElement(name = "TotalSubCost", nillable = true)
    protected BigDecimal totalSubCost;
    @XmlElement(name = "UnitPrice", nillable = true)
    protected BigDecimal unitPrice;
    @XmlElement(name = "UserChangedUnitPrice", nillable = true)
    protected Boolean userChangedUnitPrice;
    @XmlElement(name = "WQUnitPrice", nillable = true)
    protected BigDecimal wqUnitPrice;

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
     * Gets the value of the burdenMarkUp property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBurdenMarkUp() {
        return burdenMarkUp;
    }

    /**
     * Sets the value of the burdenMarkUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBurdenMarkUp(BigDecimal value) {
        this.burdenMarkUp = value;
    }

    /**
     * Gets the value of the calcMarkup property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCalcMarkup() {
        return calcMarkup;
    }

    /**
     * Sets the value of the calcMarkup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCalcMarkup(BigDecimal value) {
        this.calcMarkup = value;
    }

    /**
     * Gets the value of the calcMarkupProfit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCalcMarkupProfit() {
        return calcMarkupProfit;
    }

    /**
     * Sets the value of the calcMarkupProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCalcMarkupProfit(BigDecimal value) {
        this.calcMarkupProfit = value;
    }

    /**
     * Gets the value of the calcProfit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCalcProfit() {
        return calcProfit;
    }

    /**
     * Sets the value of the calcProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCalcProfit(BigDecimal value) {
        this.calcProfit = value;
    }

    /**
     * Gets the value of the calcProfitProfit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCalcProfitProfit() {
        return calcProfitProfit;
    }

    /**
     * Sets the value of the calcProfitProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCalcProfitProfit(BigDecimal value) {
        this.calcProfitProfit = value;
    }

    /**
     * Gets the value of the calcUPCommMarkup property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCalcUPCommMarkup() {
        return calcUPCommMarkup;
    }

    /**
     * Sets the value of the calcUPCommMarkup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCalcUPCommMarkup(BigDecimal value) {
        this.calcUPCommMarkup = value;
    }

    /**
     * Gets the value of the calcUPCommProfit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCalcUPCommProfit() {
        return calcUPCommProfit;
    }

    /**
     * Sets the value of the calcUPCommProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCalcUPCommProfit(BigDecimal value) {
        this.calcUPCommProfit = value;
    }

    /**
     * Gets the value of the calcUnitCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCalcUnitCost() {
        return calcUnitCost;
    }

    /**
     * Sets the value of the calcUnitCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCalcUnitCost(BigDecimal value) {
        this.calcUnitCost = value;
    }

    /**
     * Gets the value of the calcUnitPriceMarkup property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCalcUnitPriceMarkup() {
        return calcUnitPriceMarkup;
    }

    /**
     * Sets the value of the calcUnitPriceMarkup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCalcUnitPriceMarkup(BigDecimal value) {
        this.calcUnitPriceMarkup = value;
    }

    /**
     * Gets the value of the calcUnitPriceProfit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCalcUnitPriceProfit() {
        return calcUnitPriceProfit;
    }

    /**
     * Sets the value of the calcUnitPriceProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCalcUnitPriceProfit(BigDecimal value) {
        this.calcUnitPriceProfit = value;
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
     * Gets the value of the character01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacter01() {
        return character01;
    }

    /**
     * Sets the value of the character01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacter01(String value) {
        this.character01 = value;
    }

    /**
     * Gets the value of the character02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacter02() {
        return character02;
    }

    /**
     * Sets the value of the character02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacter02(String value) {
        this.character02 = value;
    }

    /**
     * Gets the value of the character03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacter03() {
        return character03;
    }

    /**
     * Sets the value of the character03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacter03(String value) {
        this.character03 = value;
    }

    /**
     * Gets the value of the character04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacter04() {
        return character04;
    }

    /**
     * Sets the value of the character04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacter04(String value) {
        this.character04 = value;
    }

    /**
     * Gets the value of the character05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacter05() {
        return character05;
    }

    /**
     * Sets the value of the character05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacter05(String value) {
        this.character05 = value;
    }

    /**
     * Gets the value of the character06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacter06() {
        return character06;
    }

    /**
     * Sets the value of the character06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacter06(String value) {
        this.character06 = value;
    }

    /**
     * Gets the value of the character07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacter07() {
        return character07;
    }

    /**
     * Sets the value of the character07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacter07(String value) {
        this.character07 = value;
    }

    /**
     * Gets the value of the character08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacter08() {
        return character08;
    }

    /**
     * Sets the value of the character08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacter08(String value) {
        this.character08 = value;
    }

    /**
     * Gets the value of the character09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacter09() {
        return character09;
    }

    /**
     * Sets the value of the character09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacter09(String value) {
        this.character09 = value;
    }

    /**
     * Gets the value of the character10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacter10() {
        return character10;
    }

    /**
     * Sets the value of the character10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacter10(String value) {
        this.character10 = value;
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
     * Gets the value of the checkBox06 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckBox06() {
        return checkBox06;
    }

    /**
     * Sets the value of the checkBox06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckBox06(Boolean value) {
        this.checkBox06 = value;
    }

    /**
     * Gets the value of the checkBox07 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckBox07() {
        return checkBox07;
    }

    /**
     * Sets the value of the checkBox07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckBox07(Boolean value) {
        this.checkBox07 = value;
    }

    /**
     * Gets the value of the checkBox08 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckBox08() {
        return checkBox08;
    }

    /**
     * Sets the value of the checkBox08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckBox08(Boolean value) {
        this.checkBox08 = value;
    }

    /**
     * Gets the value of the checkBox09 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckBox09() {
        return checkBox09;
    }

    /**
     * Sets the value of the checkBox09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckBox09(Boolean value) {
        this.checkBox09 = value;
    }

    /**
     * Gets the value of the checkBox10 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckBox10() {
        return checkBox10;
    }

    /**
     * Sets the value of the checkBox10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckBox10(Boolean value) {
        this.checkBox10 = value;
    }

    /**
     * Gets the value of the commissionPct property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCommissionPct() {
        return commissionPct;
    }

    /**
     * Sets the value of the commissionPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCommissionPct(BigDecimal value) {
        this.commissionPct = value;
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
     * Gets the value of the date06 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate06() {
        return date06;
    }

    /**
     * Sets the value of the date06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate06(XMLGregorianCalendar value) {
        this.date06 = value;
    }

    /**
     * Gets the value of the date07 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate07() {
        return date07;
    }

    /**
     * Sets the value of the date07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate07(XMLGregorianCalendar value) {
        this.date07 = value;
    }

    /**
     * Gets the value of the date08 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate08() {
        return date08;
    }

    /**
     * Sets the value of the date08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate08(XMLGregorianCalendar value) {
        this.date08 = value;
    }

    /**
     * Gets the value of the date09 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate09() {
        return date09;
    }

    /**
     * Sets the value of the date09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate09(XMLGregorianCalendar value) {
        this.date09 = value;
    }

    /**
     * Gets the value of the date10 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate10() {
        return date10;
    }

    /**
     * Sets the value of the date10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate10(XMLGregorianCalendar value) {
        this.date10 = value;
    }

    /**
     * Gets the value of the disableMtlMarkup property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableMtlMarkup() {
        return disableMtlMarkup;
    }

    /**
     * Sets the value of the disableMtlMarkup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableMtlMarkup(Boolean value) {
        this.disableMtlMarkup = value;
    }

    /**
     * Gets the value of the docInUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocInUnitPrice() {
        return docInUnitPrice;
    }

    /**
     * Sets the value of the docInUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocInUnitPrice(BigDecimal value) {
        this.docInUnitPrice = value;
    }

    /**
     * Gets the value of the docUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocUnitPrice() {
        return docUnitPrice;
    }

    /**
     * Sets the value of the docUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocUnitPrice(BigDecimal value) {
        this.docUnitPrice = value;
    }

    /**
     * Gets the value of the ium property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIUM() {
        return ium;
    }

    /**
     * Sets the value of the ium property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIUM(String value) {
        this.ium = value;
    }

    /**
     * Gets the value of the inUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInUnitPrice() {
        return inUnitPrice;
    }

    /**
     * Sets the value of the inUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInUnitPrice(BigDecimal value) {
        this.inUnitPrice = value;
    }

    /**
     * Gets the value of the laborMarkUp property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLaborMarkUp() {
        return laborMarkUp;
    }

    /**
     * Sets the value of the laborMarkUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLaborMarkUp(BigDecimal value) {
        this.laborMarkUp = value;
    }

    /**
     * Gets the value of the markUpID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkUpID() {
        return markUpID;
    }

    /**
     * Sets the value of the markUpID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkUpID(String value) {
        this.markUpID = value;
    }

    /**
     * Gets the value of the materialMarkUp property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaterialMarkUp() {
        return materialMarkUp;
    }

    /**
     * Sets the value of the materialMarkUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaterialMarkUp(BigDecimal value) {
        this.materialMarkUp = value;
    }

    /**
     * Gets the value of the materialMarkupM property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaterialMarkupM() {
        return materialMarkupM;
    }

    /**
     * Sets the value of the materialMarkupM property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaterialMarkupM(BigDecimal value) {
        this.materialMarkupM = value;
    }

    /**
     * Gets the value of the materialMarkupP property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaterialMarkupP() {
        return materialMarkupP;
    }

    /**
     * Sets the value of the materialMarkupP property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaterialMarkupP(BigDecimal value) {
        this.materialMarkupP = value;
    }

    /**
     * Gets the value of the miscChrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiscChrg() {
        return miscChrg;
    }

    /**
     * Sets the value of the miscChrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiscChrg(String value) {
        this.miscChrg = value;
    }

    /**
     * Gets the value of the miscCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMiscCost() {
        return miscCost;
    }

    /**
     * Sets the value of the miscCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMiscCost(BigDecimal value) {
        this.miscCost = value;
    }

    /**
     * Gets the value of the miscCostDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiscCostDesc() {
        return miscCostDesc;
    }

    /**
     * Sets the value of the miscCostDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiscCostDesc(String value) {
        this.miscCostDesc = value;
    }

    /**
     * Gets the value of the miscCostMarkUp property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMiscCostMarkUp() {
        return miscCostMarkUp;
    }

    /**
     * Sets the value of the miscCostMarkUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMiscCostMarkUp(BigDecimal value) {
        this.miscCostMarkUp = value;
    }

    /**
     * Gets the value of the mtlBurMarkUp property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMtlBurMarkUp() {
        return mtlBurMarkUp;
    }

    /**
     * Sets the value of the mtlBurMarkUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMtlBurMarkUp(BigDecimal value) {
        this.mtlBurMarkUp = value;
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
     * Gets the value of the number06 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumber06() {
        return number06;
    }

    /**
     * Sets the value of the number06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumber06(BigDecimal value) {
        this.number06 = value;
    }

    /**
     * Gets the value of the number07 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumber07() {
        return number07;
    }

    /**
     * Sets the value of the number07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumber07(BigDecimal value) {
        this.number07 = value;
    }

    /**
     * Gets the value of the number08 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumber08() {
        return number08;
    }

    /**
     * Sets the value of the number08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumber08(BigDecimal value) {
        this.number08 = value;
    }

    /**
     * Gets the value of the number09 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumber09() {
        return number09;
    }

    /**
     * Sets the value of the number09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumber09(BigDecimal value) {
        this.number09 = value;
    }

    /**
     * Gets the value of the number10 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumber10() {
        return number10;
    }

    /**
     * Sets the value of the number10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumber10(BigDecimal value) {
        this.number10 = value;
    }

    /**
     * Gets the value of the ourQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOurQuantity() {
        return ourQuantity;
    }

    /**
     * Sets the value of the ourQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOurQuantity(BigDecimal value) {
        this.ourQuantity = value;
    }

    /**
     * Gets the value of the percentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentType() {
        return percentType;
    }

    /**
     * Sets the value of the percentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentType(String value) {
        this.percentType = value;
    }

    /**
     * Gets the value of the priceBurMarkup property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceBurMarkup() {
        return priceBurMarkup;
    }

    /**
     * Sets the value of the priceBurMarkup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceBurMarkup(BigDecimal value) {
        this.priceBurMarkup = value;
    }

    /**
     * Gets the value of the priceBurProfit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceBurProfit() {
        return priceBurProfit;
    }

    /**
     * Sets the value of the priceBurProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceBurProfit(BigDecimal value) {
        this.priceBurProfit = value;
    }

    /**
     * Gets the value of the priceLbrMarkup property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceLbrMarkup() {
        return priceLbrMarkup;
    }

    /**
     * Sets the value of the priceLbrMarkup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceLbrMarkup(BigDecimal value) {
        this.priceLbrMarkup = value;
    }

    /**
     * Gets the value of the priceLbrProfit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceLbrProfit() {
        return priceLbrProfit;
    }

    /**
     * Sets the value of the priceLbrProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceLbrProfit(BigDecimal value) {
        this.priceLbrProfit = value;
    }

    /**
     * Gets the value of the priceMscChrgMarkup property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceMscChrgMarkup() {
        return priceMscChrgMarkup;
    }

    /**
     * Sets the value of the priceMscChrgMarkup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceMscChrgMarkup(BigDecimal value) {
        this.priceMscChrgMarkup = value;
    }

    /**
     * Gets the value of the priceMscChrgProfit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceMscChrgProfit() {
        return priceMscChrgProfit;
    }

    /**
     * Sets the value of the priceMscChrgProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceMscChrgProfit(BigDecimal value) {
        this.priceMscChrgProfit = value;
    }

    /**
     * Gets the value of the priceMtlBurMarkup property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceMtlBurMarkup() {
        return priceMtlBurMarkup;
    }

    /**
     * Sets the value of the priceMtlBurMarkup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceMtlBurMarkup(BigDecimal value) {
        this.priceMtlBurMarkup = value;
    }

    /**
     * Gets the value of the priceMtlBurProfit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceMtlBurProfit() {
        return priceMtlBurProfit;
    }

    /**
     * Sets the value of the priceMtlBurProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceMtlBurProfit(BigDecimal value) {
        this.priceMtlBurProfit = value;
    }

    /**
     * Gets the value of the priceMtlMarkup property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceMtlMarkup() {
        return priceMtlMarkup;
    }

    /**
     * Sets the value of the priceMtlMarkup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceMtlMarkup(BigDecimal value) {
        this.priceMtlMarkup = value;
    }

    /**
     * Gets the value of the priceMtlProfit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceMtlProfit() {
        return priceMtlProfit;
    }

    /**
     * Sets the value of the priceMtlProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceMtlProfit(BigDecimal value) {
        this.priceMtlProfit = value;
    }

    /**
     * Gets the value of the pricePerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricePerCode() {
        return pricePerCode;
    }

    /**
     * Sets the value of the pricePerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricePerCode(String value) {
        this.pricePerCode = value;
    }

    /**
     * Gets the value of the pricePerFactor property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPricePerFactor() {
        return pricePerFactor;
    }

    /**
     * Sets the value of the pricePerFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPricePerFactor(Integer value) {
        this.pricePerFactor = value;
    }

    /**
     * Gets the value of the priceSubMarkup property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceSubMarkup() {
        return priceSubMarkup;
    }

    /**
     * Sets the value of the priceSubMarkup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceSubMarkup(BigDecimal value) {
        this.priceSubMarkup = value;
    }

    /**
     * Gets the value of the priceSubProfit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceSubProfit() {
        return priceSubProfit;
    }

    /**
     * Sets the value of the priceSubProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceSubProfit(BigDecimal value) {
        this.priceSubProfit = value;
    }

    /**
     * Gets the value of the priceTotalCommMarkup property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceTotalCommMarkup() {
        return priceTotalCommMarkup;
    }

    /**
     * Sets the value of the priceTotalCommMarkup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceTotalCommMarkup(BigDecimal value) {
        this.priceTotalCommMarkup = value;
    }

    /**
     * Gets the value of the priceTotalCommProfit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceTotalCommProfit() {
        return priceTotalCommProfit;
    }

    /**
     * Sets the value of the priceTotalCommProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceTotalCommProfit(BigDecimal value) {
        this.priceTotalCommProfit = value;
    }

    /**
     * Gets the value of the priceTotalMarkup property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceTotalMarkup() {
        return priceTotalMarkup;
    }

    /**
     * Sets the value of the priceTotalMarkup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceTotalMarkup(BigDecimal value) {
        this.priceTotalMarkup = value;
    }

    /**
     * Gets the value of the priceTotalProfit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceTotalProfit() {
        return priceTotalProfit;
    }

    /**
     * Sets the value of the priceTotalProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceTotalProfit(BigDecimal value) {
        this.priceTotalProfit = value;
    }

    /**
     * Gets the value of the qtyNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQtyNum() {
        return qtyNum;
    }

    /**
     * Sets the value of the qtyNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQtyNum(Integer value) {
        this.qtyNum = value;
    }

    /**
     * Gets the value of the quoteLine property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuoteLine() {
        return quoteLine;
    }

    /**
     * Sets the value of the quoteLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuoteLine(Integer value) {
        this.quoteLine = value;
    }

    /**
     * Gets the value of the quoteNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuoteNum() {
        return quoteNum;
    }

    /**
     * Sets the value of the quoteNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuoteNum(Integer value) {
        this.quoteNum = value;
    }

    /**
     * Gets the value of the quoteNumCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteNumCurrencyCode() {
        return quoteNumCurrencyCode;
    }

    /**
     * Sets the value of the quoteNumCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteNumCurrencyCode(String value) {
        this.quoteNumCurrencyCode = value;
    }

    /**
     * Gets the value of the quotedMarkup property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuotedMarkup() {
        return quotedMarkup;
    }

    /**
     * Sets the value of the quotedMarkup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuotedMarkup(BigDecimal value) {
        this.quotedMarkup = value;
    }

    /**
     * Gets the value of the quotedProfit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuotedProfit() {
        return quotedProfit;
    }

    /**
     * Sets the value of the quotedProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuotedProfit(BigDecimal value) {
        this.quotedProfit = value;
    }

    /**
     * Gets the value of the rollUpCostNeeded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRollUpCostNeeded() {
        return rollUpCostNeeded;
    }

    /**
     * Sets the value of the rollUpCostNeeded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRollUpCostNeeded(Boolean value) {
        this.rollUpCostNeeded = value;
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
     * Gets the value of the rpt1InUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1InUnitPrice() {
        return rpt1InUnitPrice;
    }

    /**
     * Sets the value of the rpt1InUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1InUnitPrice(BigDecimal value) {
        this.rpt1InUnitPrice = value;
    }

    /**
     * Gets the value of the rpt1UnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1UnitPrice() {
        return rpt1UnitPrice;
    }

    /**
     * Sets the value of the rpt1UnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1UnitPrice(BigDecimal value) {
        this.rpt1UnitPrice = value;
    }

    /**
     * Gets the value of the rpt2InUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2InUnitPrice() {
        return rpt2InUnitPrice;
    }

    /**
     * Sets the value of the rpt2InUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2InUnitPrice(BigDecimal value) {
        this.rpt2InUnitPrice = value;
    }

    /**
     * Gets the value of the rpt2UnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2UnitPrice() {
        return rpt2UnitPrice;
    }

    /**
     * Sets the value of the rpt2UnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2UnitPrice(BigDecimal value) {
        this.rpt2UnitPrice = value;
    }

    /**
     * Gets the value of the rpt3InUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3InUnitPrice() {
        return rpt3InUnitPrice;
    }

    /**
     * Sets the value of the rpt3InUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3InUnitPrice(BigDecimal value) {
        this.rpt3InUnitPrice = value;
    }

    /**
     * Gets the value of the rpt3UnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3UnitPrice() {
        return rpt3UnitPrice;
    }

    /**
     * Sets the value of the rpt3UnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3UnitPrice(BigDecimal value) {
        this.rpt3UnitPrice = value;
    }

    /**
     * Gets the value of the salesUM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesUM() {
        return salesUM;
    }

    /**
     * Sets the value of the salesUM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesUM(String value) {
        this.salesUM = value;
    }

    /**
     * Gets the value of the sellingFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSellingFactor() {
        return sellingFactor;
    }

    /**
     * Sets the value of the sellingFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSellingFactor(BigDecimal value) {
        this.sellingFactor = value;
    }

    /**
     * Gets the value of the sellingFactorDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellingFactorDirection() {
        return sellingFactorDirection;
    }

    /**
     * Sets the value of the sellingFactorDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellingFactorDirection(String value) {
        this.sellingFactorDirection = value;
    }

    /**
     * Gets the value of the sellingQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSellingQuantity() {
        return sellingQuantity;
    }

    /**
     * Sets the value of the sellingQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSellingQuantity(BigDecimal value) {
        this.sellingQuantity = value;
    }

    /**
     * Gets the value of the subcontractMarkUp property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubcontractMarkUp() {
        return subcontractMarkUp;
    }

    /**
     * Sets the value of the subcontractMarkUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubcontractMarkUp(BigDecimal value) {
        this.subcontractMarkUp = value;
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
     * Gets the value of the totalBurCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalBurCost() {
        return totalBurCost;
    }

    /**
     * Sets the value of the totalBurCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalBurCost(BigDecimal value) {
        this.totalBurCost = value;
    }

    /**
     * Gets the value of the totalCommProfit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalCommProfit() {
        return totalCommProfit;
    }

    /**
     * Sets the value of the totalCommProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalCommProfit(BigDecimal value) {
        this.totalCommProfit = value;
    }

    /**
     * Gets the value of the totalCommission property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalCommission() {
        return totalCommission;
    }

    /**
     * Sets the value of the totalCommission property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalCommission(BigDecimal value) {
        this.totalCommission = value;
    }

    /**
     * Gets the value of the totalCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalCost() {
        return totalCost;
    }

    /**
     * Sets the value of the totalCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalCost(BigDecimal value) {
        this.totalCost = value;
    }

    /**
     * Gets the value of the totalLbrCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalLbrCost() {
        return totalLbrCost;
    }

    /**
     * Sets the value of the totalLbrCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalLbrCost(BigDecimal value) {
        this.totalLbrCost = value;
    }

    /**
     * Gets the value of the totalMarkup property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalMarkup() {
        return totalMarkup;
    }

    /**
     * Sets the value of the totalMarkup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalMarkup(BigDecimal value) {
        this.totalMarkup = value;
    }

    /**
     * Gets the value of the totalMtlBurCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalMtlBurCost() {
        return totalMtlBurCost;
    }

    /**
     * Sets the value of the totalMtlBurCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalMtlBurCost(BigDecimal value) {
        this.totalMtlBurCost = value;
    }

    /**
     * Gets the value of the totalMtlCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalMtlCost() {
        return totalMtlCost;
    }

    /**
     * Sets the value of the totalMtlCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalMtlCost(BigDecimal value) {
        this.totalMtlCost = value;
    }

    /**
     * Gets the value of the totalProdBurHrs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalProdBurHrs() {
        return totalProdBurHrs;
    }

    /**
     * Sets the value of the totalProdBurHrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalProdBurHrs(BigDecimal value) {
        this.totalProdBurHrs = value;
    }

    /**
     * Gets the value of the totalProdLbrHrs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalProdLbrHrs() {
        return totalProdLbrHrs;
    }

    /**
     * Sets the value of the totalProdLbrHrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalProdLbrHrs(BigDecimal value) {
        this.totalProdLbrHrs = value;
    }

    /**
     * Gets the value of the totalProfit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalProfit() {
        return totalProfit;
    }

    /**
     * Sets the value of the totalProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalProfit(BigDecimal value) {
        this.totalProfit = value;
    }

    /**
     * Gets the value of the totalQuotedPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalQuotedPrice() {
        return totalQuotedPrice;
    }

    /**
     * Sets the value of the totalQuotedPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalQuotedPrice(BigDecimal value) {
        this.totalQuotedPrice = value;
    }

    /**
     * Gets the value of the totalSetupBurHrs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalSetupBurHrs() {
        return totalSetupBurHrs;
    }

    /**
     * Sets the value of the totalSetupBurHrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalSetupBurHrs(BigDecimal value) {
        this.totalSetupBurHrs = value;
    }

    /**
     * Gets the value of the totalSetupLbrHrs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalSetupLbrHrs() {
        return totalSetupLbrHrs;
    }

    /**
     * Sets the value of the totalSetupLbrHrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalSetupLbrHrs(BigDecimal value) {
        this.totalSetupLbrHrs = value;
    }

    /**
     * Gets the value of the totalSubCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalSubCost() {
        return totalSubCost;
    }

    /**
     * Sets the value of the totalSubCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalSubCost(BigDecimal value) {
        this.totalSubCost = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitPrice(BigDecimal value) {
        this.unitPrice = value;
    }

    /**
     * Gets the value of the userChangedUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserChangedUnitPrice() {
        return userChangedUnitPrice;
    }

    /**
     * Sets the value of the userChangedUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserChangedUnitPrice(Boolean value) {
        this.userChangedUnitPrice = value;
    }

    /**
     * Gets the value of the wqUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWQUnitPrice() {
        return wqUnitPrice;
    }

    /**
     * Sets the value of the wqUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWQUnitPrice(BigDecimal value) {
        this.wqUnitPrice = value;
    }

}
