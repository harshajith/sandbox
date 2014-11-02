
package org.datacontract.schemas._2004._07.epicor_mfg;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UpdExtSalesOrderDataSetTypeOrderDtl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdExtSalesOrderDataSetTypeOrderDtl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdvanceBillBal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AvailPriceLists" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AvailUMFromQuote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AvailableQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BaseCurrSymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BaseCurrencyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BasePartNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BaseRevisionNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BinNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BitFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BreakListCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="CheckBox11" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CheckBox12" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CheckBox13" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CheckBox14" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CheckBox15" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CheckBox16" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CheckBox17" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CheckBox18" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CheckBox19" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CheckBox20" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Commissionable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConfigBaseUnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ConfigUnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Configured" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContractCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContractCodeContractDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContractNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CounterSale" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CounterSaleBinNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CounterSaleDimCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CounterSaleLotNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CounterSaleWarehouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreateNewJob" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CreditLimitMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditLimitSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CumeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CumeQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CurrSymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencySwitch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CustNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CustNumBTName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustNumCustID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustNumName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DBRowIdent" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="DUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="Date11" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Date12" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Date13" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Date14" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Date15" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Date16" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Date17" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Date18" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Date19" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Date20" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DemandContractLine" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DemandContractNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DemandDtlRejected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DemandDtlSeq" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DemandHeadSeq" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DemandQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DimCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DimConvFactor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DiscBreakListCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiscBreakListCodeEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DiscBreakListCodeListDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiscBreakListCodeStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DiscListPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DiscountPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DisplaySeq" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DoNotShipAfterDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DoNotShipBeforeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DocAdvanceBillBal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocDspDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocDspUnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocExtPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocExtPriceDtl" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocInDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocInExtPriceDtl" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocInListPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocInMiscCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocInOrdBasedPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocInUnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocLessDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocListPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocMiscCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocOrdBasedPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocTaxAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocTotalPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocUnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DspDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DspJobType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DspUnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EnableCreateNewJob" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EnableGetDtls" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EnableKitUnitPrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EnableRelJob" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EnableRenewalNbr" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EnableSchedJob" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EnableSellingQty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EntryProcess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExtCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExtPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ExtPriceDtl" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="FromQuoteLineFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GetDtls" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasBeenConfigured" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasComplement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasDowngrade" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasSubstitute" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasUpgrade" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ICPOLine" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ICPONum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="InExtPriceDtl" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="InListPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="InMiscCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="InOrdBasedPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="InPrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InUnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="InvoiceComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvtyUOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JobTypeMFG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JobWasCreated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="KitAllowUpdate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="KitBackFlush" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="KitChangeParms" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="KitCompOrigPart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KitCompOrigSeq" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="KitDisable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="KitFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KitFlagDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KitOrderQtyUOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KitParentLine" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="KitPricing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KitPrintCompsInv" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="KitPrintCompsPS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="KitQtyPer" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="KitShipComplete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="KitStandard" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="KitsLoaded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LabCovered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LaborDuration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LaborMod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastConfigDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastConfigTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LastConfigUserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LessDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LineDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Linked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ListPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LockDisc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LockPrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LockQty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LotNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MatCovered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaterialDuration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaterialMod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiscCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MiscCovered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MiscDuration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MktgCampaignID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MktgCampaignIDCampDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MktgEvntEvntDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MktgEvntSeq" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MultipleReleases" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NeedByDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
 *         &lt;element name="Number11" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Number12" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Number13" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Number14" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Number15" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Number16" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Number17" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Number18" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Number19" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Number20" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OldOpenValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OldOurOpenQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OldProdCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OldSellingOpenQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OnHandQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Onsite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OpenLine" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrdBasedPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OrderComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderLine" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OrderNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OrderNumBTCustNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OrderNumCardMemberName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderNumCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OrigWhyNoTax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OverrideDiscPriceList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OverridePriceList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="POLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POLineRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartExists" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PartNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartNumIUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartNumPartDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartNumPricePerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartNumSalesUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartNumSellingFactor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PartNumTrackDimension" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PartNumTrackLots" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PartNumTrackSerialNum" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PartTrackDimension" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PartTrackLots" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PickListComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrevPartNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrevSellQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PrevXPartNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceListCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceListCodeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PricePerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PricingQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PricingValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ProFormaInvComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProcessCounterSale" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProcessQuickEntry" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProdCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProdCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectIDDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuoteLine" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="QuoteNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="QuoteNumCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuoteQtyNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RMALine" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RMANum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelJob" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RelWasRecInvoiced" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RenewalNbr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RepRate1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RepRate2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RepRate3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RepRate4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RepRate5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RepSplit1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RepSplit2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RepSplit3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RepSplit4" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RepSplit5" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RequestDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ReverseCharge" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RevisionNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rework" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RowIdent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RowMod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rpt1AdvanceBillBal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1Discount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1DspDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1DspUnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1ExtPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1ExtPriceDtl" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1InDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1InExtPriceDtl" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1InListPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1InMiscCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1InOrdBasedPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1InUnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1LessDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1ListPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1MiscCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1OrdBasedPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1TaxAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1TotalPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1UnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2AdvanceBillBal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2Discount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2DspDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2DspUnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2ExtPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2ExtPriceDtl" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2InDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2InExtPriceDtl" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2InListPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2InMiscCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2InOrdBasedPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2InUnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2LessDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2ListPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2MiscCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2OrdBasedPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2TaxAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2TotalPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2UnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3AdvanceBillBal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3Discount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3DspDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3DspUnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3ExtPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3ExtPriceDtl" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3InDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3InExtPriceDtl" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3InListPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3InMiscCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3InOrdBasedPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3InUnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3LessDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3ListPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3MiscCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3OrdBasedPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3TaxAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3TotalPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3UnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SalesCatID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesCatIDDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesRepName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesRepName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesRepName3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesRepName4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesRepName5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SchedJob" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SellingFactor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SellingFactorDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SellingQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ShipComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipLineComplete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShortChar01" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortChar02" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortChar03" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortChar04" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortChar05" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortChar06" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortChar07" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortChar08" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortChar09" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortChar10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SmartString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SmartStringProcessed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SysRevID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SysRowID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TMBilling" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TaxAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TaxCatID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxCatIDDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ThisOrderInvtyQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalReleases" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalShipped" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="VoidLine" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WarehouseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WarehouseDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Warranty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WarrantyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WarrantyCodeWarrDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WarrantyComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XPartNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XRevisionNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdExtSalesOrderDataSetTypeOrderDtl", propOrder = {
    "advanceBillBal",
    "availPriceLists",
    "availUMFromQuote",
    "availableQuantity",
    "baseCurrSymbol",
    "baseCurrencyID",
    "basePartNum",
    "baseRevisionNum",
    "binNum",
    "bitFlag",
    "breakListCode",
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
    "checkBox11",
    "checkBox12",
    "checkBox13",
    "checkBox14",
    "checkBox15",
    "checkBox16",
    "checkBox17",
    "checkBox18",
    "checkBox19",
    "checkBox20",
    "commissionable",
    "company",
    "configBaseUnitPrice",
    "configUnitPrice",
    "configured",
    "contractCode",
    "contractCodeContractDescription",
    "contractNum",
    "counterSale",
    "counterSaleBinNum",
    "counterSaleDimCode",
    "counterSaleLotNum",
    "counterSaleWarehouse",
    "createNewJob",
    "creditLimitMessage",
    "creditLimitSource",
    "cumeDate",
    "cumeQty",
    "currSymbol",
    "currencyCode",
    "currencyID",
    "currencySwitch",
    "custNum",
    "custNumBTName",
    "custNumCustID",
    "custNumName",
    "dbRowIdent",
    "dum",
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
    "date11",
    "date12",
    "date13",
    "date14",
    "date15",
    "date16",
    "date17",
    "date18",
    "date19",
    "date20",
    "demandContractLine",
    "demandContractNum",
    "demandDtlRejected",
    "demandDtlSeq",
    "demandHeadSeq",
    "demandQuantity",
    "dimCode",
    "dimConvFactor",
    "discBreakListCode",
    "discBreakListCodeEndDate",
    "discBreakListCodeListDescription",
    "discBreakListCodeStartDate",
    "discListPrice",
    "discount",
    "discountPercent",
    "displaySeq",
    "doNotShipAfterDate",
    "doNotShipBeforeDate",
    "docAdvanceBillBal",
    "docDiscount",
    "docDspDiscount",
    "docDspUnitPrice",
    "docExtPrice",
    "docExtPriceDtl",
    "docInDiscount",
    "docInExtPriceDtl",
    "docInListPrice",
    "docInMiscCharges",
    "docInOrdBasedPrice",
    "docInUnitPrice",
    "docLessDiscount",
    "docListPrice",
    "docMiscCharges",
    "docOrdBasedPrice",
    "docTaxAmt",
    "docTotalPrice",
    "docUnitPrice",
    "dspDiscount",
    "dspJobType",
    "dspUnitPrice",
    "enableCreateNewJob",
    "enableGetDtls",
    "enableKitUnitPrice",
    "enableRelJob",
    "enableRenewalNbr",
    "enableSchedJob",
    "enableSellingQty",
    "entryProcess",
    "extCompany",
    "extPrice",
    "extPriceDtl",
    "fromQuoteLineFlag",
    "getDtls",
    "hasBeenConfigured",
    "hasComplement",
    "hasDowngrade",
    "hasSubstitute",
    "hasUpgrade",
    "icpoLine",
    "icpoNum",
    "ium",
    "inDiscount",
    "inExtPriceDtl",
    "inListPrice",
    "inMiscCharges",
    "inOrdBasedPrice",
    "inPrice",
    "inUnitPrice",
    "invoiceComment",
    "invtyUOM",
    "jobTypeMFG",
    "jobWasCreated",
    "kitAllowUpdate",
    "kitBackFlush",
    "kitChangeParms",
    "kitCompOrigPart",
    "kitCompOrigSeq",
    "kitDisable",
    "kitFlag",
    "kitFlagDescription",
    "kitOrderQtyUOM",
    "kitParentLine",
    "kitPricing",
    "kitPrintCompsInv",
    "kitPrintCompsPS",
    "kitQtyPer",
    "kitShipComplete",
    "kitStandard",
    "kitsLoaded",
    "labCovered",
    "laborDuration",
    "laborMod",
    "lastConfigDate",
    "lastConfigTime",
    "lastConfigUserID",
    "lessDiscount",
    "lineDesc",
    "lineStatus",
    "lineType",
    "linked",
    "listPrice",
    "lockDisc",
    "lockPrice",
    "lockQty",
    "lotNum",
    "matCovered",
    "materialDuration",
    "materialMod",
    "miscCharges",
    "miscCovered",
    "miscDuration",
    "mktgCampaignID",
    "mktgCampaignIDCampDescription",
    "mktgEvntEvntDescription",
    "mktgEvntSeq",
    "multipleReleases",
    "needByDate",
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
    "number11",
    "number12",
    "number13",
    "number14",
    "number15",
    "number16",
    "number17",
    "number18",
    "number19",
    "number20",
    "oldOpenValue",
    "oldOurOpenQty",
    "oldProdCode",
    "oldSellingOpenQty",
    "onHandQuantity",
    "onsite",
    "openLine",
    "ordBasedPrice",
    "orderComment",
    "orderLine",
    "orderNum",
    "orderNumBTCustNum",
    "orderNumCardMemberName",
    "orderNumCurrencyCode",
    "orderQty",
    "origWhyNoTax",
    "overrideDiscPriceList",
    "overridePriceList",
    "poLine",
    "poLineRef",
    "partExists",
    "partNum",
    "partNumIUM",
    "partNumPartDescription",
    "partNumPricePerCode",
    "partNumSalesUM",
    "partNumSellingFactor",
    "partNumTrackDimension",
    "partNumTrackLots",
    "partNumTrackSerialNum",
    "partTrackDimension",
    "partTrackLots",
    "pickListComment",
    "prevPartNum",
    "prevSellQty",
    "prevXPartNum",
    "priceGroupCode",
    "priceListCode",
    "priceListCodeDesc",
    "pricePerCode",
    "pricingQty",
    "pricingValue",
    "proFormaInvComment",
    "processCounterSale",
    "processQuickEntry",
    "prodCode",
    "prodCodeDescription",
    "projectID",
    "projectIDDescription",
    "quoteLine",
    "quoteNum",
    "quoteNumCurrencyCode",
    "quoteQtyNum",
    "rmaLine",
    "rmaNum",
    "reference",
    "relJob",
    "relWasRecInvoiced",
    "renewalNbr",
    "repRate1",
    "repRate2",
    "repRate3",
    "repRate4",
    "repRate5",
    "repSplit1",
    "repSplit2",
    "repSplit3",
    "repSplit4",
    "repSplit5",
    "requestDate",
    "reverseCharge",
    "revisionNum",
    "rework",
    "rowIdent",
    "rowMod",
    "rpt1AdvanceBillBal",
    "rpt1Discount",
    "rpt1DspDiscount",
    "rpt1DspUnitPrice",
    "rpt1ExtPrice",
    "rpt1ExtPriceDtl",
    "rpt1InDiscount",
    "rpt1InExtPriceDtl",
    "rpt1InListPrice",
    "rpt1InMiscCharges",
    "rpt1InOrdBasedPrice",
    "rpt1InUnitPrice",
    "rpt1LessDiscount",
    "rpt1ListPrice",
    "rpt1MiscCharges",
    "rpt1OrdBasedPrice",
    "rpt1TaxAmt",
    "rpt1TotalPrice",
    "rpt1UnitPrice",
    "rpt2AdvanceBillBal",
    "rpt2Discount",
    "rpt2DspDiscount",
    "rpt2DspUnitPrice",
    "rpt2ExtPrice",
    "rpt2ExtPriceDtl",
    "rpt2InDiscount",
    "rpt2InExtPriceDtl",
    "rpt2InListPrice",
    "rpt2InMiscCharges",
    "rpt2InOrdBasedPrice",
    "rpt2InUnitPrice",
    "rpt2LessDiscount",
    "rpt2ListPrice",
    "rpt2MiscCharges",
    "rpt2OrdBasedPrice",
    "rpt2TaxAmt",
    "rpt2TotalPrice",
    "rpt2UnitPrice",
    "rpt3AdvanceBillBal",
    "rpt3Discount",
    "rpt3DspDiscount",
    "rpt3DspUnitPrice",
    "rpt3ExtPrice",
    "rpt3ExtPriceDtl",
    "rpt3InDiscount",
    "rpt3InExtPriceDtl",
    "rpt3InListPrice",
    "rpt3InMiscCharges",
    "rpt3InOrdBasedPrice",
    "rpt3InUnitPrice",
    "rpt3LessDiscount",
    "rpt3ListPrice",
    "rpt3MiscCharges",
    "rpt3OrdBasedPrice",
    "rpt3TaxAmt",
    "rpt3TotalPrice",
    "rpt3UnitPrice",
    "salesCatID",
    "salesCatIDDescription",
    "salesRepName1",
    "salesRepName2",
    "salesRepName3",
    "salesRepName4",
    "salesRepName5",
    "salesUM",
    "schedJob",
    "sellingFactor",
    "sellingFactorDirection",
    "sellingQuantity",
    "shipComment",
    "shipLineComplete",
    "shortChar01",
    "shortChar02",
    "shortChar03",
    "shortChar04",
    "shortChar05",
    "shortChar06",
    "shortChar07",
    "shortChar08",
    "shortChar09",
    "shortChar10",
    "smartString",
    "smartStringProcessed",
    "sysRevID",
    "sysRowID",
    "tmBilling",
    "taxAmt",
    "taxCatID",
    "taxCatIDDescription",
    "thisOrderInvtyQty",
    "totalPrice",
    "totalReleases",
    "totalShipped",
    "unitPrice",
    "voidLine",
    "warehouseCode",
    "warehouseDesc",
    "warranty",
    "warrantyCode",
    "warrantyCodeWarrDescription",
    "warrantyComment",
    "xPartNum",
    "xRevisionNum"
})
public class UpdExtSalesOrderDataSetTypeOrderDtl {

    @XmlElement(name = "AdvanceBillBal", nillable = true)
    protected BigDecimal advanceBillBal;
    @XmlElement(name = "AvailPriceLists", nillable = true)
    protected String availPriceLists;
    @XmlElement(name = "AvailUMFromQuote", nillable = true)
    protected String availUMFromQuote;
    @XmlElement(name = "AvailableQuantity", nillable = true)
    protected BigDecimal availableQuantity;
    @XmlElement(name = "BaseCurrSymbol", nillable = true)
    protected String baseCurrSymbol;
    @XmlElement(name = "BaseCurrencyID", nillable = true)
    protected String baseCurrencyID;
    @XmlElement(name = "BasePartNum", nillable = true)
    protected String basePartNum;
    @XmlElement(name = "BaseRevisionNum", nillable = true)
    protected String baseRevisionNum;
    @XmlElement(name = "BinNum", nillable = true)
    protected String binNum;
    @XmlElement(name = "BitFlag", nillable = true)
    protected Integer bitFlag;
    @XmlElement(name = "BreakListCode", nillable = true)
    protected String breakListCode;
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
    @XmlElement(name = "CheckBox11", nillable = true)
    protected Boolean checkBox11;
    @XmlElement(name = "CheckBox12", nillable = true)
    protected Boolean checkBox12;
    @XmlElement(name = "CheckBox13", nillable = true)
    protected Boolean checkBox13;
    @XmlElement(name = "CheckBox14", nillable = true)
    protected Boolean checkBox14;
    @XmlElement(name = "CheckBox15", nillable = true)
    protected Boolean checkBox15;
    @XmlElement(name = "CheckBox16", nillable = true)
    protected Boolean checkBox16;
    @XmlElement(name = "CheckBox17", nillable = true)
    protected Boolean checkBox17;
    @XmlElement(name = "CheckBox18", nillable = true)
    protected Boolean checkBox18;
    @XmlElement(name = "CheckBox19", nillable = true)
    protected Boolean checkBox19;
    @XmlElement(name = "CheckBox20", nillable = true)
    protected Boolean checkBox20;
    @XmlElement(name = "Commissionable", nillable = true)
    protected Boolean commissionable;
    @XmlElement(name = "Company", nillable = true)
    protected String company;
    @XmlElement(name = "ConfigBaseUnitPrice", nillable = true)
    protected BigDecimal configBaseUnitPrice;
    @XmlElement(name = "ConfigUnitPrice", nillable = true)
    protected BigDecimal configUnitPrice;
    @XmlElement(name = "Configured", nillable = true)
    protected String configured;
    @XmlElement(name = "ContractCode", nillable = true)
    protected String contractCode;
    @XmlElement(name = "ContractCodeContractDescription", nillable = true)
    protected String contractCodeContractDescription;
    @XmlElement(name = "ContractNum", nillable = true)
    protected Integer contractNum;
    @XmlElement(name = "CounterSale", nillable = true)
    protected Boolean counterSale;
    @XmlElement(name = "CounterSaleBinNum", nillable = true)
    protected String counterSaleBinNum;
    @XmlElement(name = "CounterSaleDimCode", nillable = true)
    protected String counterSaleDimCode;
    @XmlElement(name = "CounterSaleLotNum", nillable = true)
    protected String counterSaleLotNum;
    @XmlElement(name = "CounterSaleWarehouse", nillable = true)
    protected String counterSaleWarehouse;
    @XmlElement(name = "CreateNewJob", nillable = true)
    protected Boolean createNewJob;
    @XmlElement(name = "CreditLimitMessage", nillable = true)
    protected String creditLimitMessage;
    @XmlElement(name = "CreditLimitSource", nillable = true)
    protected String creditLimitSource;
    @XmlElement(name = "CumeDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cumeDate;
    @XmlElement(name = "CumeQty", nillable = true)
    protected BigDecimal cumeQty;
    @XmlElement(name = "CurrSymbol", nillable = true)
    protected String currSymbol;
    @XmlElement(name = "CurrencyCode", nillable = true)
    protected String currencyCode;
    @XmlElement(name = "CurrencyID", nillable = true)
    protected String currencyID;
    @XmlElement(name = "CurrencySwitch", nillable = true)
    protected Boolean currencySwitch;
    @XmlElement(name = "CustNum", nillable = true)
    protected Integer custNum;
    @XmlElement(name = "CustNumBTName", nillable = true)
    protected String custNumBTName;
    @XmlElement(name = "CustNumCustID", nillable = true)
    protected String custNumCustID;
    @XmlElement(name = "CustNumName", nillable = true)
    protected String custNumName;
    @XmlElement(name = "DBRowIdent", nillable = true)
    protected byte[] dbRowIdent;
    @XmlElement(name = "DUM", nillable = true)
    protected String dum;
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
    @XmlElement(name = "Date11", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date11;
    @XmlElement(name = "Date12", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date12;
    @XmlElement(name = "Date13", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date13;
    @XmlElement(name = "Date14", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date14;
    @XmlElement(name = "Date15", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date15;
    @XmlElement(name = "Date16", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date16;
    @XmlElement(name = "Date17", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date17;
    @XmlElement(name = "Date18", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date18;
    @XmlElement(name = "Date19", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date19;
    @XmlElement(name = "Date20", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date20;
    @XmlElement(name = "DemandContractLine", nillable = true)
    protected Integer demandContractLine;
    @XmlElement(name = "DemandContractNum", nillable = true)
    protected Integer demandContractNum;
    @XmlElement(name = "DemandDtlRejected", nillable = true)
    protected Boolean demandDtlRejected;
    @XmlElement(name = "DemandDtlSeq", nillable = true)
    protected Integer demandDtlSeq;
    @XmlElement(name = "DemandHeadSeq", nillable = true)
    protected Integer demandHeadSeq;
    @XmlElement(name = "DemandQuantity", nillable = true)
    protected BigDecimal demandQuantity;
    @XmlElement(name = "DimCode", nillable = true)
    protected String dimCode;
    @XmlElement(name = "DimConvFactor", nillable = true)
    protected BigDecimal dimConvFactor;
    @XmlElement(name = "DiscBreakListCode", nillable = true)
    protected String discBreakListCode;
    @XmlElement(name = "DiscBreakListCodeEndDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar discBreakListCodeEndDate;
    @XmlElement(name = "DiscBreakListCodeListDescription", nillable = true)
    protected String discBreakListCodeListDescription;
    @XmlElement(name = "DiscBreakListCodeStartDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar discBreakListCodeStartDate;
    @XmlElement(name = "DiscListPrice", nillable = true)
    protected BigDecimal discListPrice;
    @XmlElement(name = "Discount", nillable = true)
    protected BigDecimal discount;
    @XmlElement(name = "DiscountPercent", nillable = true)
    protected BigDecimal discountPercent;
    @XmlElement(name = "DisplaySeq", nillable = true)
    protected BigDecimal displaySeq;
    @XmlElement(name = "DoNotShipAfterDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar doNotShipAfterDate;
    @XmlElement(name = "DoNotShipBeforeDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar doNotShipBeforeDate;
    @XmlElement(name = "DocAdvanceBillBal", nillable = true)
    protected BigDecimal docAdvanceBillBal;
    @XmlElement(name = "DocDiscount", nillable = true)
    protected BigDecimal docDiscount;
    @XmlElement(name = "DocDspDiscount", nillable = true)
    protected BigDecimal docDspDiscount;
    @XmlElement(name = "DocDspUnitPrice", nillable = true)
    protected BigDecimal docDspUnitPrice;
    @XmlElement(name = "DocExtPrice", nillable = true)
    protected BigDecimal docExtPrice;
    @XmlElement(name = "DocExtPriceDtl", nillable = true)
    protected BigDecimal docExtPriceDtl;
    @XmlElement(name = "DocInDiscount", nillable = true)
    protected BigDecimal docInDiscount;
    @XmlElement(name = "DocInExtPriceDtl", nillable = true)
    protected BigDecimal docInExtPriceDtl;
    @XmlElement(name = "DocInListPrice", nillable = true)
    protected BigDecimal docInListPrice;
    @XmlElement(name = "DocInMiscCharges", nillable = true)
    protected BigDecimal docInMiscCharges;
    @XmlElement(name = "DocInOrdBasedPrice", nillable = true)
    protected BigDecimal docInOrdBasedPrice;
    @XmlElement(name = "DocInUnitPrice", nillable = true)
    protected BigDecimal docInUnitPrice;
    @XmlElement(name = "DocLessDiscount", nillable = true)
    protected BigDecimal docLessDiscount;
    @XmlElement(name = "DocListPrice", nillable = true)
    protected BigDecimal docListPrice;
    @XmlElement(name = "DocMiscCharges", nillable = true)
    protected BigDecimal docMiscCharges;
    @XmlElement(name = "DocOrdBasedPrice", nillable = true)
    protected BigDecimal docOrdBasedPrice;
    @XmlElement(name = "DocTaxAmt", nillable = true)
    protected BigDecimal docTaxAmt;
    @XmlElement(name = "DocTotalPrice", nillable = true)
    protected BigDecimal docTotalPrice;
    @XmlElement(name = "DocUnitPrice", nillable = true)
    protected BigDecimal docUnitPrice;
    @XmlElement(name = "DspDiscount", nillable = true)
    protected BigDecimal dspDiscount;
    @XmlElement(name = "DspJobType", nillable = true)
    protected String dspJobType;
    @XmlElement(name = "DspUnitPrice", nillable = true)
    protected BigDecimal dspUnitPrice;
    @XmlElement(name = "EnableCreateNewJob", nillable = true)
    protected Boolean enableCreateNewJob;
    @XmlElement(name = "EnableGetDtls", nillable = true)
    protected Boolean enableGetDtls;
    @XmlElement(name = "EnableKitUnitPrice", nillable = true)
    protected Boolean enableKitUnitPrice;
    @XmlElement(name = "EnableRelJob", nillable = true)
    protected Boolean enableRelJob;
    @XmlElement(name = "EnableRenewalNbr", nillable = true)
    protected Boolean enableRenewalNbr;
    @XmlElement(name = "EnableSchedJob", nillable = true)
    protected Boolean enableSchedJob;
    @XmlElement(name = "EnableSellingQty", nillable = true)
    protected Boolean enableSellingQty;
    @XmlElement(name = "EntryProcess", nillable = true)
    protected String entryProcess;
    @XmlElement(name = "ExtCompany", nillable = true)
    protected String extCompany;
    @XmlElement(name = "ExtPrice", nillable = true)
    protected BigDecimal extPrice;
    @XmlElement(name = "ExtPriceDtl", nillable = true)
    protected BigDecimal extPriceDtl;
    @XmlElement(name = "FromQuoteLineFlag", nillable = true)
    protected Boolean fromQuoteLineFlag;
    @XmlElement(name = "GetDtls", nillable = true)
    protected Boolean getDtls;
    @XmlElement(name = "HasBeenConfigured", nillable = true)
    protected Boolean hasBeenConfigured;
    @XmlElement(name = "HasComplement", nillable = true)
    protected Boolean hasComplement;
    @XmlElement(name = "HasDowngrade", nillable = true)
    protected Boolean hasDowngrade;
    @XmlElement(name = "HasSubstitute", nillable = true)
    protected Boolean hasSubstitute;
    @XmlElement(name = "HasUpgrade", nillable = true)
    protected Boolean hasUpgrade;
    @XmlElement(name = "ICPOLine", nillable = true)
    protected Integer icpoLine;
    @XmlElement(name = "ICPONum", nillable = true)
    protected Integer icpoNum;
    @XmlElement(name = "IUM", nillable = true)
    protected String ium;
    @XmlElement(name = "InDiscount", nillable = true)
    protected BigDecimal inDiscount;
    @XmlElement(name = "InExtPriceDtl", nillable = true)
    protected BigDecimal inExtPriceDtl;
    @XmlElement(name = "InListPrice", nillable = true)
    protected BigDecimal inListPrice;
    @XmlElement(name = "InMiscCharges", nillable = true)
    protected BigDecimal inMiscCharges;
    @XmlElement(name = "InOrdBasedPrice", nillable = true)
    protected BigDecimal inOrdBasedPrice;
    @XmlElement(name = "InPrice", nillable = true)
    protected Boolean inPrice;
    @XmlElement(name = "InUnitPrice", nillable = true)
    protected BigDecimal inUnitPrice;
    @XmlElement(name = "InvoiceComment", nillable = true)
    protected String invoiceComment;
    @XmlElement(name = "InvtyUOM", nillable = true)
    protected String invtyUOM;
    @XmlElement(name = "JobTypeMFG", nillable = true)
    protected String jobTypeMFG;
    @XmlElement(name = "JobWasCreated", nillable = true)
    protected Boolean jobWasCreated;
    @XmlElement(name = "KitAllowUpdate", nillable = true)
    protected Boolean kitAllowUpdate;
    @XmlElement(name = "KitBackFlush", nillable = true)
    protected Boolean kitBackFlush;
    @XmlElement(name = "KitChangeParms", nillable = true)
    protected Boolean kitChangeParms;
    @XmlElement(name = "KitCompOrigPart", nillable = true)
    protected String kitCompOrigPart;
    @XmlElement(name = "KitCompOrigSeq", nillable = true)
    protected Integer kitCompOrigSeq;
    @XmlElement(name = "KitDisable", nillable = true)
    protected Boolean kitDisable;
    @XmlElement(name = "KitFlag", nillable = true)
    protected String kitFlag;
    @XmlElement(name = "KitFlagDescription", nillable = true)
    protected String kitFlagDescription;
    @XmlElement(name = "KitOrderQtyUOM", nillable = true)
    protected String kitOrderQtyUOM;
    @XmlElement(name = "KitParentLine", nillable = true)
    protected Integer kitParentLine;
    @XmlElement(name = "KitPricing", nillable = true)
    protected String kitPricing;
    @XmlElement(name = "KitPrintCompsInv", nillable = true)
    protected Boolean kitPrintCompsInv;
    @XmlElement(name = "KitPrintCompsPS", nillable = true)
    protected Boolean kitPrintCompsPS;
    @XmlElement(name = "KitQtyPer", nillable = true)
    protected BigDecimal kitQtyPer;
    @XmlElement(name = "KitShipComplete", nillable = true)
    protected Boolean kitShipComplete;
    @XmlElement(name = "KitStandard", nillable = true)
    protected Boolean kitStandard;
    @XmlElement(name = "KitsLoaded", nillable = true)
    protected Boolean kitsLoaded;
    @XmlElement(name = "LabCovered", nillable = true)
    protected Boolean labCovered;
    @XmlElement(name = "LaborDuration", nillable = true)
    protected Integer laborDuration;
    @XmlElement(name = "LaborMod", nillable = true)
    protected String laborMod;
    @XmlElement(name = "LastConfigDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastConfigDate;
    @XmlElement(name = "LastConfigTime", nillable = true)
    protected Integer lastConfigTime;
    @XmlElement(name = "LastConfigUserID", nillable = true)
    protected String lastConfigUserID;
    @XmlElement(name = "LessDiscount", nillable = true)
    protected BigDecimal lessDiscount;
    @XmlElement(name = "LineDesc", nillable = true)
    protected String lineDesc;
    @XmlElement(name = "LineStatus", nillable = true)
    protected String lineStatus;
    @XmlElement(name = "LineType", nillable = true)
    protected String lineType;
    @XmlElement(name = "Linked", nillable = true)
    protected Boolean linked;
    @XmlElement(name = "ListPrice", nillable = true)
    protected BigDecimal listPrice;
    @XmlElement(name = "LockDisc", nillable = true)
    protected Boolean lockDisc;
    @XmlElement(name = "LockPrice", nillable = true)
    protected Boolean lockPrice;
    @XmlElement(name = "LockQty", nillable = true)
    protected Boolean lockQty;
    @XmlElement(name = "LotNum", nillable = true)
    protected String lotNum;
    @XmlElement(name = "MatCovered", nillable = true)
    protected Boolean matCovered;
    @XmlElement(name = "MaterialDuration", nillable = true)
    protected Integer materialDuration;
    @XmlElement(name = "MaterialMod", nillable = true)
    protected String materialMod;
    @XmlElement(name = "MiscCharges", nillable = true)
    protected BigDecimal miscCharges;
    @XmlElement(name = "MiscCovered", nillable = true)
    protected Boolean miscCovered;
    @XmlElement(name = "MiscDuration", nillable = true)
    protected Integer miscDuration;
    @XmlElement(name = "MktgCampaignID", nillable = true)
    protected String mktgCampaignID;
    @XmlElement(name = "MktgCampaignIDCampDescription", nillable = true)
    protected String mktgCampaignIDCampDescription;
    @XmlElement(name = "MktgEvntEvntDescription", nillable = true)
    protected String mktgEvntEvntDescription;
    @XmlElement(name = "MktgEvntSeq", nillable = true)
    protected Integer mktgEvntSeq;
    @XmlElement(name = "MultipleReleases", nillable = true)
    protected Boolean multipleReleases;
    @XmlElement(name = "NeedByDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar needByDate;
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
    @XmlElement(name = "Number11", nillable = true)
    protected BigDecimal number11;
    @XmlElement(name = "Number12", nillable = true)
    protected BigDecimal number12;
    @XmlElement(name = "Number13", nillable = true)
    protected BigDecimal number13;
    @XmlElement(name = "Number14", nillable = true)
    protected BigDecimal number14;
    @XmlElement(name = "Number15", nillable = true)
    protected BigDecimal number15;
    @XmlElement(name = "Number16", nillable = true)
    protected BigDecimal number16;
    @XmlElement(name = "Number17", nillable = true)
    protected BigDecimal number17;
    @XmlElement(name = "Number18", nillable = true)
    protected BigDecimal number18;
    @XmlElement(name = "Number19", nillable = true)
    protected BigDecimal number19;
    @XmlElement(name = "Number20", nillable = true)
    protected BigDecimal number20;
    @XmlElement(name = "OldOpenValue", nillable = true)
    protected BigDecimal oldOpenValue;
    @XmlElement(name = "OldOurOpenQty", nillable = true)
    protected BigDecimal oldOurOpenQty;
    @XmlElement(name = "OldProdCode", nillable = true)
    protected String oldProdCode;
    @XmlElement(name = "OldSellingOpenQty", nillable = true)
    protected BigDecimal oldSellingOpenQty;
    @XmlElement(name = "OnHandQuantity", nillable = true)
    protected BigDecimal onHandQuantity;
    @XmlElement(name = "Onsite", nillable = true)
    protected Boolean onsite;
    @XmlElement(name = "OpenLine", nillable = true)
    protected Boolean openLine;
    @XmlElement(name = "OrdBasedPrice", nillable = true)
    protected BigDecimal ordBasedPrice;
    @XmlElement(name = "OrderComment", nillable = true)
    protected String orderComment;
    @XmlElement(name = "OrderLine", nillable = true)
    protected Integer orderLine;
    @XmlElement(name = "OrderNum", nillable = true)
    protected Integer orderNum;
    @XmlElement(name = "OrderNumBTCustNum", nillable = true)
    protected Integer orderNumBTCustNum;
    @XmlElement(name = "OrderNumCardMemberName", nillable = true)
    protected String orderNumCardMemberName;
    @XmlElement(name = "OrderNumCurrencyCode", nillable = true)
    protected String orderNumCurrencyCode;
    @XmlElement(name = "OrderQty", nillable = true)
    protected BigDecimal orderQty;
    @XmlElement(name = "OrigWhyNoTax", nillable = true)
    protected String origWhyNoTax;
    @XmlElement(name = "OverrideDiscPriceList", nillable = true)
    protected Boolean overrideDiscPriceList;
    @XmlElement(name = "OverridePriceList", nillable = true)
    protected Boolean overridePriceList;
    @XmlElement(name = "POLine", nillable = true)
    protected String poLine;
    @XmlElement(name = "POLineRef", nillable = true)
    protected String poLineRef;
    @XmlElement(name = "PartExists", nillable = true)
    protected Boolean partExists;
    @XmlElement(name = "PartNum", nillable = true)
    protected String partNum;
    @XmlElement(name = "PartNumIUM", nillable = true)
    protected String partNumIUM;
    @XmlElement(name = "PartNumPartDescription", nillable = true)
    protected String partNumPartDescription;
    @XmlElement(name = "PartNumPricePerCode", nillable = true)
    protected String partNumPricePerCode;
    @XmlElement(name = "PartNumSalesUM", nillable = true)
    protected String partNumSalesUM;
    @XmlElement(name = "PartNumSellingFactor", nillable = true)
    protected BigDecimal partNumSellingFactor;
    @XmlElement(name = "PartNumTrackDimension", nillable = true)
    protected Boolean partNumTrackDimension;
    @XmlElement(name = "PartNumTrackLots", nillable = true)
    protected Boolean partNumTrackLots;
    @XmlElement(name = "PartNumTrackSerialNum", nillable = true)
    protected Boolean partNumTrackSerialNum;
    @XmlElement(name = "PartTrackDimension", nillable = true)
    protected Boolean partTrackDimension;
    @XmlElement(name = "PartTrackLots", nillable = true)
    protected Boolean partTrackLots;
    @XmlElement(name = "PickListComment", nillable = true)
    protected String pickListComment;
    @XmlElement(name = "PrevPartNum", nillable = true)
    protected String prevPartNum;
    @XmlElement(name = "PrevSellQty", nillable = true)
    protected BigDecimal prevSellQty;
    @XmlElement(name = "PrevXPartNum", nillable = true)
    protected String prevXPartNum;
    @XmlElement(name = "PriceGroupCode", nillable = true)
    protected String priceGroupCode;
    @XmlElement(name = "PriceListCode", nillable = true)
    protected String priceListCode;
    @XmlElement(name = "PriceListCodeDesc", nillable = true)
    protected String priceListCodeDesc;
    @XmlElement(name = "PricePerCode", nillable = true)
    protected String pricePerCode;
    @XmlElement(name = "PricingQty", nillable = true)
    protected BigDecimal pricingQty;
    @XmlElement(name = "PricingValue", nillable = true)
    protected BigDecimal pricingValue;
    @XmlElement(name = "ProFormaInvComment", nillable = true)
    protected String proFormaInvComment;
    @XmlElement(name = "ProcessCounterSale", nillable = true)
    protected Boolean processCounterSale;
    @XmlElement(name = "ProcessQuickEntry", nillable = true)
    protected Boolean processQuickEntry;
    @XmlElement(name = "ProdCode", nillable = true)
    protected String prodCode;
    @XmlElement(name = "ProdCodeDescription", nillable = true)
    protected String prodCodeDescription;
    @XmlElement(name = "ProjectID", nillable = true)
    protected String projectID;
    @XmlElement(name = "ProjectIDDescription", nillable = true)
    protected String projectIDDescription;
    @XmlElement(name = "QuoteLine", nillable = true)
    protected Integer quoteLine;
    @XmlElement(name = "QuoteNum", nillable = true)
    protected Integer quoteNum;
    @XmlElement(name = "QuoteNumCurrencyCode", nillable = true)
    protected String quoteNumCurrencyCode;
    @XmlElement(name = "QuoteQtyNum", nillable = true)
    protected Integer quoteQtyNum;
    @XmlElement(name = "RMALine", nillable = true)
    protected Integer rmaLine;
    @XmlElement(name = "RMANum", nillable = true)
    protected Integer rmaNum;
    @XmlElement(name = "Reference", nillable = true)
    protected String reference;
    @XmlElement(name = "RelJob", nillable = true)
    protected Boolean relJob;
    @XmlElement(name = "RelWasRecInvoiced", nillable = true)
    protected Boolean relWasRecInvoiced;
    @XmlElement(name = "RenewalNbr", nillable = true)
    protected Integer renewalNbr;
    @XmlElement(name = "RepRate1", nillable = true)
    protected BigDecimal repRate1;
    @XmlElement(name = "RepRate2", nillable = true)
    protected BigDecimal repRate2;
    @XmlElement(name = "RepRate3", nillable = true)
    protected BigDecimal repRate3;
    @XmlElement(name = "RepRate4", nillable = true)
    protected BigDecimal repRate4;
    @XmlElement(name = "RepRate5", nillable = true)
    protected BigDecimal repRate5;
    @XmlElement(name = "RepSplit1", nillable = true)
    protected Integer repSplit1;
    @XmlElement(name = "RepSplit2", nillable = true)
    protected Integer repSplit2;
    @XmlElement(name = "RepSplit3", nillable = true)
    protected Integer repSplit3;
    @XmlElement(name = "RepSplit4", nillable = true)
    protected Integer repSplit4;
    @XmlElement(name = "RepSplit5", nillable = true)
    protected Integer repSplit5;
    @XmlElement(name = "RequestDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestDate;
    @XmlElement(name = "ReverseCharge", nillable = true)
    protected Boolean reverseCharge;
    @XmlElement(name = "RevisionNum", nillable = true)
    protected String revisionNum;
    @XmlElement(name = "Rework", nillable = true)
    protected Boolean rework;
    @XmlElement(name = "RowIdent", nillable = true)
    protected String rowIdent;
    @XmlElement(name = "RowMod", nillable = true)
    protected String rowMod;
    @XmlElement(name = "Rpt1AdvanceBillBal", nillable = true)
    protected BigDecimal rpt1AdvanceBillBal;
    @XmlElement(name = "Rpt1Discount", nillable = true)
    protected BigDecimal rpt1Discount;
    @XmlElement(name = "Rpt1DspDiscount", nillable = true)
    protected BigDecimal rpt1DspDiscount;
    @XmlElement(name = "Rpt1DspUnitPrice", nillable = true)
    protected BigDecimal rpt1DspUnitPrice;
    @XmlElement(name = "Rpt1ExtPrice", nillable = true)
    protected BigDecimal rpt1ExtPrice;
    @XmlElement(name = "Rpt1ExtPriceDtl", nillable = true)
    protected BigDecimal rpt1ExtPriceDtl;
    @XmlElement(name = "Rpt1InDiscount", nillable = true)
    protected BigDecimal rpt1InDiscount;
    @XmlElement(name = "Rpt1InExtPriceDtl", nillable = true)
    protected BigDecimal rpt1InExtPriceDtl;
    @XmlElement(name = "Rpt1InListPrice", nillable = true)
    protected BigDecimal rpt1InListPrice;
    @XmlElement(name = "Rpt1InMiscCharges", nillable = true)
    protected BigDecimal rpt1InMiscCharges;
    @XmlElement(name = "Rpt1InOrdBasedPrice", nillable = true)
    protected BigDecimal rpt1InOrdBasedPrice;
    @XmlElement(name = "Rpt1InUnitPrice", nillable = true)
    protected BigDecimal rpt1InUnitPrice;
    @XmlElement(name = "Rpt1LessDiscount", nillable = true)
    protected BigDecimal rpt1LessDiscount;
    @XmlElement(name = "Rpt1ListPrice", nillable = true)
    protected BigDecimal rpt1ListPrice;
    @XmlElement(name = "Rpt1MiscCharges", nillable = true)
    protected BigDecimal rpt1MiscCharges;
    @XmlElement(name = "Rpt1OrdBasedPrice", nillable = true)
    protected BigDecimal rpt1OrdBasedPrice;
    @XmlElement(name = "Rpt1TaxAmt", nillable = true)
    protected BigDecimal rpt1TaxAmt;
    @XmlElement(name = "Rpt1TotalPrice", nillable = true)
    protected BigDecimal rpt1TotalPrice;
    @XmlElement(name = "Rpt1UnitPrice", nillable = true)
    protected BigDecimal rpt1UnitPrice;
    @XmlElement(name = "Rpt2AdvanceBillBal", nillable = true)
    protected BigDecimal rpt2AdvanceBillBal;
    @XmlElement(name = "Rpt2Discount", nillable = true)
    protected BigDecimal rpt2Discount;
    @XmlElement(name = "Rpt2DspDiscount", nillable = true)
    protected BigDecimal rpt2DspDiscount;
    @XmlElement(name = "Rpt2DspUnitPrice", nillable = true)
    protected BigDecimal rpt2DspUnitPrice;
    @XmlElement(name = "Rpt2ExtPrice", nillable = true)
    protected BigDecimal rpt2ExtPrice;
    @XmlElement(name = "Rpt2ExtPriceDtl", nillable = true)
    protected BigDecimal rpt2ExtPriceDtl;
    @XmlElement(name = "Rpt2InDiscount", nillable = true)
    protected BigDecimal rpt2InDiscount;
    @XmlElement(name = "Rpt2InExtPriceDtl", nillable = true)
    protected BigDecimal rpt2InExtPriceDtl;
    @XmlElement(name = "Rpt2InListPrice", nillable = true)
    protected BigDecimal rpt2InListPrice;
    @XmlElement(name = "Rpt2InMiscCharges", nillable = true)
    protected BigDecimal rpt2InMiscCharges;
    @XmlElement(name = "Rpt2InOrdBasedPrice", nillable = true)
    protected BigDecimal rpt2InOrdBasedPrice;
    @XmlElement(name = "Rpt2InUnitPrice", nillable = true)
    protected BigDecimal rpt2InUnitPrice;
    @XmlElement(name = "Rpt2LessDiscount", nillable = true)
    protected BigDecimal rpt2LessDiscount;
    @XmlElement(name = "Rpt2ListPrice", nillable = true)
    protected BigDecimal rpt2ListPrice;
    @XmlElement(name = "Rpt2MiscCharges", nillable = true)
    protected BigDecimal rpt2MiscCharges;
    @XmlElement(name = "Rpt2OrdBasedPrice", nillable = true)
    protected BigDecimal rpt2OrdBasedPrice;
    @XmlElement(name = "Rpt2TaxAmt", nillable = true)
    protected BigDecimal rpt2TaxAmt;
    @XmlElement(name = "Rpt2TotalPrice", nillable = true)
    protected BigDecimal rpt2TotalPrice;
    @XmlElement(name = "Rpt2UnitPrice", nillable = true)
    protected BigDecimal rpt2UnitPrice;
    @XmlElement(name = "Rpt3AdvanceBillBal", nillable = true)
    protected BigDecimal rpt3AdvanceBillBal;
    @XmlElement(name = "Rpt3Discount", nillable = true)
    protected BigDecimal rpt3Discount;
    @XmlElement(name = "Rpt3DspDiscount", nillable = true)
    protected BigDecimal rpt3DspDiscount;
    @XmlElement(name = "Rpt3DspUnitPrice", nillable = true)
    protected BigDecimal rpt3DspUnitPrice;
    @XmlElement(name = "Rpt3ExtPrice", nillable = true)
    protected BigDecimal rpt3ExtPrice;
    @XmlElement(name = "Rpt3ExtPriceDtl", nillable = true)
    protected BigDecimal rpt3ExtPriceDtl;
    @XmlElement(name = "Rpt3InDiscount", nillable = true)
    protected BigDecimal rpt3InDiscount;
    @XmlElement(name = "Rpt3InExtPriceDtl", nillable = true)
    protected BigDecimal rpt3InExtPriceDtl;
    @XmlElement(name = "Rpt3InListPrice", nillable = true)
    protected BigDecimal rpt3InListPrice;
    @XmlElement(name = "Rpt3InMiscCharges", nillable = true)
    protected BigDecimal rpt3InMiscCharges;
    @XmlElement(name = "Rpt3InOrdBasedPrice", nillable = true)
    protected BigDecimal rpt3InOrdBasedPrice;
    @XmlElement(name = "Rpt3InUnitPrice", nillable = true)
    protected BigDecimal rpt3InUnitPrice;
    @XmlElement(name = "Rpt3LessDiscount", nillable = true)
    protected BigDecimal rpt3LessDiscount;
    @XmlElement(name = "Rpt3ListPrice", nillable = true)
    protected BigDecimal rpt3ListPrice;
    @XmlElement(name = "Rpt3MiscCharges", nillable = true)
    protected BigDecimal rpt3MiscCharges;
    @XmlElement(name = "Rpt3OrdBasedPrice", nillable = true)
    protected BigDecimal rpt3OrdBasedPrice;
    @XmlElement(name = "Rpt3TaxAmt", nillable = true)
    protected BigDecimal rpt3TaxAmt;
    @XmlElement(name = "Rpt3TotalPrice", nillable = true)
    protected BigDecimal rpt3TotalPrice;
    @XmlElement(name = "Rpt3UnitPrice", nillable = true)
    protected BigDecimal rpt3UnitPrice;
    @XmlElement(name = "SalesCatID", nillable = true)
    protected String salesCatID;
    @XmlElement(name = "SalesCatIDDescription", nillable = true)
    protected String salesCatIDDescription;
    @XmlElement(name = "SalesRepName1", nillable = true)
    protected String salesRepName1;
    @XmlElement(name = "SalesRepName2", nillable = true)
    protected String salesRepName2;
    @XmlElement(name = "SalesRepName3", nillable = true)
    protected String salesRepName3;
    @XmlElement(name = "SalesRepName4", nillable = true)
    protected String salesRepName4;
    @XmlElement(name = "SalesRepName5", nillable = true)
    protected String salesRepName5;
    @XmlElement(name = "SalesUM", nillable = true)
    protected String salesUM;
    @XmlElement(name = "SchedJob", nillable = true)
    protected Boolean schedJob;
    @XmlElement(name = "SellingFactor", nillable = true)
    protected BigDecimal sellingFactor;
    @XmlElement(name = "SellingFactorDirection", nillable = true)
    protected String sellingFactorDirection;
    @XmlElement(name = "SellingQuantity", nillable = true)
    protected BigDecimal sellingQuantity;
    @XmlElement(name = "ShipComment", nillable = true)
    protected String shipComment;
    @XmlElement(name = "ShipLineComplete", nillable = true)
    protected Boolean shipLineComplete;
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
    @XmlElement(name = "ShortChar06", nillable = true)
    protected String shortChar06;
    @XmlElement(name = "ShortChar07", nillable = true)
    protected String shortChar07;
    @XmlElement(name = "ShortChar08", nillable = true)
    protected String shortChar08;
    @XmlElement(name = "ShortChar09", nillable = true)
    protected String shortChar09;
    @XmlElement(name = "ShortChar10", nillable = true)
    protected String shortChar10;
    @XmlElement(name = "SmartString", nillable = true)
    protected String smartString;
    @XmlElement(name = "SmartStringProcessed", nillable = true)
    protected Boolean smartStringProcessed;
    @XmlElement(name = "SysRevID", nillable = true)
    protected Integer sysRevID;
    @XmlElement(name = "SysRowID", nillable = true)
    protected String sysRowID;
    @XmlElement(name = "TMBilling", nillable = true)
    protected Boolean tmBilling;
    @XmlElement(name = "TaxAmt", nillable = true)
    protected BigDecimal taxAmt;
    @XmlElement(name = "TaxCatID", nillable = true)
    protected String taxCatID;
    @XmlElement(name = "TaxCatIDDescription", nillable = true)
    protected String taxCatIDDescription;
    @XmlElement(name = "ThisOrderInvtyQty", nillable = true)
    protected BigDecimal thisOrderInvtyQty;
    @XmlElement(name = "TotalPrice", nillable = true)
    protected BigDecimal totalPrice;
    @XmlElement(name = "TotalReleases", nillable = true)
    protected Integer totalReleases;
    @XmlElement(name = "TotalShipped", nillable = true)
    protected BigDecimal totalShipped;
    @XmlElement(name = "UnitPrice", nillable = true)
    protected BigDecimal unitPrice;
    @XmlElement(name = "VoidLine", nillable = true)
    protected Boolean voidLine;
    @XmlElement(name = "WarehouseCode", nillable = true)
    protected String warehouseCode;
    @XmlElement(name = "WarehouseDesc", nillable = true)
    protected String warehouseDesc;
    @XmlElement(name = "Warranty", nillable = true)
    protected Boolean warranty;
    @XmlElement(name = "WarrantyCode", nillable = true)
    protected String warrantyCode;
    @XmlElement(name = "WarrantyCodeWarrDescription", nillable = true)
    protected String warrantyCodeWarrDescription;
    @XmlElement(name = "WarrantyComment", nillable = true)
    protected String warrantyComment;
    @XmlElement(name = "XPartNum", nillable = true)
    protected String xPartNum;
    @XmlElement(name = "XRevisionNum", nillable = true)
    protected String xRevisionNum;

    /**
     * Gets the value of the advanceBillBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdvanceBillBal() {
        return advanceBillBal;
    }

    /**
     * Sets the value of the advanceBillBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdvanceBillBal(BigDecimal value) {
        this.advanceBillBal = value;
    }

    /**
     * Gets the value of the availPriceLists property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailPriceLists() {
        return availPriceLists;
    }

    /**
     * Sets the value of the availPriceLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailPriceLists(String value) {
        this.availPriceLists = value;
    }

    /**
     * Gets the value of the availUMFromQuote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailUMFromQuote() {
        return availUMFromQuote;
    }

    /**
     * Sets the value of the availUMFromQuote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailUMFromQuote(String value) {
        this.availUMFromQuote = value;
    }

    /**
     * Gets the value of the availableQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvailableQuantity() {
        return availableQuantity;
    }

    /**
     * Sets the value of the availableQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvailableQuantity(BigDecimal value) {
        this.availableQuantity = value;
    }

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
     * Gets the value of the baseCurrencyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseCurrencyID() {
        return baseCurrencyID;
    }

    /**
     * Sets the value of the baseCurrencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseCurrencyID(String value) {
        this.baseCurrencyID = value;
    }

    /**
     * Gets the value of the basePartNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasePartNum() {
        return basePartNum;
    }

    /**
     * Sets the value of the basePartNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasePartNum(String value) {
        this.basePartNum = value;
    }

    /**
     * Gets the value of the baseRevisionNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseRevisionNum() {
        return baseRevisionNum;
    }

    /**
     * Sets the value of the baseRevisionNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseRevisionNum(String value) {
        this.baseRevisionNum = value;
    }

    /**
     * Gets the value of the binNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinNum() {
        return binNum;
    }

    /**
     * Sets the value of the binNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinNum(String value) {
        this.binNum = value;
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
     * Gets the value of the breakListCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBreakListCode() {
        return breakListCode;
    }

    /**
     * Sets the value of the breakListCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBreakListCode(String value) {
        this.breakListCode = value;
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
     * Gets the value of the checkBox11 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckBox11() {
        return checkBox11;
    }

    /**
     * Sets the value of the checkBox11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckBox11(Boolean value) {
        this.checkBox11 = value;
    }

    /**
     * Gets the value of the checkBox12 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckBox12() {
        return checkBox12;
    }

    /**
     * Sets the value of the checkBox12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckBox12(Boolean value) {
        this.checkBox12 = value;
    }

    /**
     * Gets the value of the checkBox13 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckBox13() {
        return checkBox13;
    }

    /**
     * Sets the value of the checkBox13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckBox13(Boolean value) {
        this.checkBox13 = value;
    }

    /**
     * Gets the value of the checkBox14 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckBox14() {
        return checkBox14;
    }

    /**
     * Sets the value of the checkBox14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckBox14(Boolean value) {
        this.checkBox14 = value;
    }

    /**
     * Gets the value of the checkBox15 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckBox15() {
        return checkBox15;
    }

    /**
     * Sets the value of the checkBox15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckBox15(Boolean value) {
        this.checkBox15 = value;
    }

    /**
     * Gets the value of the checkBox16 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckBox16() {
        return checkBox16;
    }

    /**
     * Sets the value of the checkBox16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckBox16(Boolean value) {
        this.checkBox16 = value;
    }

    /**
     * Gets the value of the checkBox17 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckBox17() {
        return checkBox17;
    }

    /**
     * Sets the value of the checkBox17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckBox17(Boolean value) {
        this.checkBox17 = value;
    }

    /**
     * Gets the value of the checkBox18 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckBox18() {
        return checkBox18;
    }

    /**
     * Sets the value of the checkBox18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckBox18(Boolean value) {
        this.checkBox18 = value;
    }

    /**
     * Gets the value of the checkBox19 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckBox19() {
        return checkBox19;
    }

    /**
     * Sets the value of the checkBox19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckBox19(Boolean value) {
        this.checkBox19 = value;
    }

    /**
     * Gets the value of the checkBox20 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckBox20() {
        return checkBox20;
    }

    /**
     * Sets the value of the checkBox20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckBox20(Boolean value) {
        this.checkBox20 = value;
    }

    /**
     * Gets the value of the commissionable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCommissionable() {
        return commissionable;
    }

    /**
     * Sets the value of the commissionable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommissionable(Boolean value) {
        this.commissionable = value;
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
     * Gets the value of the configBaseUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConfigBaseUnitPrice() {
        return configBaseUnitPrice;
    }

    /**
     * Sets the value of the configBaseUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConfigBaseUnitPrice(BigDecimal value) {
        this.configBaseUnitPrice = value;
    }

    /**
     * Gets the value of the configUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConfigUnitPrice() {
        return configUnitPrice;
    }

    /**
     * Sets the value of the configUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConfigUnitPrice(BigDecimal value) {
        this.configUnitPrice = value;
    }

    /**
     * Gets the value of the configured property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigured() {
        return configured;
    }

    /**
     * Sets the value of the configured property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigured(String value) {
        this.configured = value;
    }

    /**
     * Gets the value of the contractCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractCode() {
        return contractCode;
    }

    /**
     * Sets the value of the contractCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractCode(String value) {
        this.contractCode = value;
    }

    /**
     * Gets the value of the contractCodeContractDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractCodeContractDescription() {
        return contractCodeContractDescription;
    }

    /**
     * Sets the value of the contractCodeContractDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractCodeContractDescription(String value) {
        this.contractCodeContractDescription = value;
    }

    /**
     * Gets the value of the contractNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContractNum() {
        return contractNum;
    }

    /**
     * Sets the value of the contractNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContractNum(Integer value) {
        this.contractNum = value;
    }

    /**
     * Gets the value of the counterSale property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCounterSale() {
        return counterSale;
    }

    /**
     * Sets the value of the counterSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCounterSale(Boolean value) {
        this.counterSale = value;
    }

    /**
     * Gets the value of the counterSaleBinNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounterSaleBinNum() {
        return counterSaleBinNum;
    }

    /**
     * Sets the value of the counterSaleBinNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounterSaleBinNum(String value) {
        this.counterSaleBinNum = value;
    }

    /**
     * Gets the value of the counterSaleDimCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounterSaleDimCode() {
        return counterSaleDimCode;
    }

    /**
     * Sets the value of the counterSaleDimCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounterSaleDimCode(String value) {
        this.counterSaleDimCode = value;
    }

    /**
     * Gets the value of the counterSaleLotNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounterSaleLotNum() {
        return counterSaleLotNum;
    }

    /**
     * Sets the value of the counterSaleLotNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounterSaleLotNum(String value) {
        this.counterSaleLotNum = value;
    }

    /**
     * Gets the value of the counterSaleWarehouse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounterSaleWarehouse() {
        return counterSaleWarehouse;
    }

    /**
     * Sets the value of the counterSaleWarehouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounterSaleWarehouse(String value) {
        this.counterSaleWarehouse = value;
    }

    /**
     * Gets the value of the createNewJob property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreateNewJob() {
        return createNewJob;
    }

    /**
     * Sets the value of the createNewJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreateNewJob(Boolean value) {
        this.createNewJob = value;
    }

    /**
     * Gets the value of the creditLimitMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditLimitMessage() {
        return creditLimitMessage;
    }

    /**
     * Sets the value of the creditLimitMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditLimitMessage(String value) {
        this.creditLimitMessage = value;
    }

    /**
     * Gets the value of the creditLimitSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditLimitSource() {
        return creditLimitSource;
    }

    /**
     * Sets the value of the creditLimitSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditLimitSource(String value) {
        this.creditLimitSource = value;
    }

    /**
     * Gets the value of the cumeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCumeDate() {
        return cumeDate;
    }

    /**
     * Sets the value of the cumeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCumeDate(XMLGregorianCalendar value) {
        this.cumeDate = value;
    }

    /**
     * Gets the value of the cumeQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCumeQty() {
        return cumeQty;
    }

    /**
     * Sets the value of the cumeQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCumeQty(BigDecimal value) {
        this.cumeQty = value;
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
     * Gets the value of the currencyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyID() {
        return currencyID;
    }

    /**
     * Sets the value of the currencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyID(String value) {
        this.currencyID = value;
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
     * Gets the value of the custNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustNum() {
        return custNum;
    }

    /**
     * Sets the value of the custNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustNum(Integer value) {
        this.custNum = value;
    }

    /**
     * Gets the value of the custNumBTName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustNumBTName() {
        return custNumBTName;
    }

    /**
     * Sets the value of the custNumBTName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustNumBTName(String value) {
        this.custNumBTName = value;
    }

    /**
     * Gets the value of the custNumCustID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustNumCustID() {
        return custNumCustID;
    }

    /**
     * Sets the value of the custNumCustID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustNumCustID(String value) {
        this.custNumCustID = value;
    }

    /**
     * Gets the value of the custNumName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustNumName() {
        return custNumName;
    }

    /**
     * Sets the value of the custNumName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustNumName(String value) {
        this.custNumName = value;
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
     * Gets the value of the dum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUM() {
        return dum;
    }

    /**
     * Sets the value of the dum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUM(String value) {
        this.dum = value;
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
     * Gets the value of the date11 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate11() {
        return date11;
    }

    /**
     * Sets the value of the date11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate11(XMLGregorianCalendar value) {
        this.date11 = value;
    }

    /**
     * Gets the value of the date12 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate12() {
        return date12;
    }

    /**
     * Sets the value of the date12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate12(XMLGregorianCalendar value) {
        this.date12 = value;
    }

    /**
     * Gets the value of the date13 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate13() {
        return date13;
    }

    /**
     * Sets the value of the date13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate13(XMLGregorianCalendar value) {
        this.date13 = value;
    }

    /**
     * Gets the value of the date14 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate14() {
        return date14;
    }

    /**
     * Sets the value of the date14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate14(XMLGregorianCalendar value) {
        this.date14 = value;
    }

    /**
     * Gets the value of the date15 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate15() {
        return date15;
    }

    /**
     * Sets the value of the date15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate15(XMLGregorianCalendar value) {
        this.date15 = value;
    }

    /**
     * Gets the value of the date16 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate16() {
        return date16;
    }

    /**
     * Sets the value of the date16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate16(XMLGregorianCalendar value) {
        this.date16 = value;
    }

    /**
     * Gets the value of the date17 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate17() {
        return date17;
    }

    /**
     * Sets the value of the date17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate17(XMLGregorianCalendar value) {
        this.date17 = value;
    }

    /**
     * Gets the value of the date18 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate18() {
        return date18;
    }

    /**
     * Sets the value of the date18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate18(XMLGregorianCalendar value) {
        this.date18 = value;
    }

    /**
     * Gets the value of the date19 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate19() {
        return date19;
    }

    /**
     * Sets the value of the date19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate19(XMLGregorianCalendar value) {
        this.date19 = value;
    }

    /**
     * Gets the value of the date20 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate20() {
        return date20;
    }

    /**
     * Sets the value of the date20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate20(XMLGregorianCalendar value) {
        this.date20 = value;
    }

    /**
     * Gets the value of the demandContractLine property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDemandContractLine() {
        return demandContractLine;
    }

    /**
     * Sets the value of the demandContractLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDemandContractLine(Integer value) {
        this.demandContractLine = value;
    }

    /**
     * Gets the value of the demandContractNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDemandContractNum() {
        return demandContractNum;
    }

    /**
     * Sets the value of the demandContractNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDemandContractNum(Integer value) {
        this.demandContractNum = value;
    }

    /**
     * Gets the value of the demandDtlRejected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDemandDtlRejected() {
        return demandDtlRejected;
    }

    /**
     * Sets the value of the demandDtlRejected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDemandDtlRejected(Boolean value) {
        this.demandDtlRejected = value;
    }

    /**
     * Gets the value of the demandDtlSeq property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDemandDtlSeq() {
        return demandDtlSeq;
    }

    /**
     * Sets the value of the demandDtlSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDemandDtlSeq(Integer value) {
        this.demandDtlSeq = value;
    }

    /**
     * Gets the value of the demandHeadSeq property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDemandHeadSeq() {
        return demandHeadSeq;
    }

    /**
     * Sets the value of the demandHeadSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDemandHeadSeq(Integer value) {
        this.demandHeadSeq = value;
    }

    /**
     * Gets the value of the demandQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDemandQuantity() {
        return demandQuantity;
    }

    /**
     * Sets the value of the demandQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDemandQuantity(BigDecimal value) {
        this.demandQuantity = value;
    }

    /**
     * Gets the value of the dimCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimCode() {
        return dimCode;
    }

    /**
     * Sets the value of the dimCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimCode(String value) {
        this.dimCode = value;
    }

    /**
     * Gets the value of the dimConvFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDimConvFactor() {
        return dimConvFactor;
    }

    /**
     * Sets the value of the dimConvFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDimConvFactor(BigDecimal value) {
        this.dimConvFactor = value;
    }

    /**
     * Gets the value of the discBreakListCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscBreakListCode() {
        return discBreakListCode;
    }

    /**
     * Sets the value of the discBreakListCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscBreakListCode(String value) {
        this.discBreakListCode = value;
    }

    /**
     * Gets the value of the discBreakListCodeEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDiscBreakListCodeEndDate() {
        return discBreakListCodeEndDate;
    }

    /**
     * Sets the value of the discBreakListCodeEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDiscBreakListCodeEndDate(XMLGregorianCalendar value) {
        this.discBreakListCodeEndDate = value;
    }

    /**
     * Gets the value of the discBreakListCodeListDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscBreakListCodeListDescription() {
        return discBreakListCodeListDescription;
    }

    /**
     * Sets the value of the discBreakListCodeListDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscBreakListCodeListDescription(String value) {
        this.discBreakListCodeListDescription = value;
    }

    /**
     * Gets the value of the discBreakListCodeStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDiscBreakListCodeStartDate() {
        return discBreakListCodeStartDate;
    }

    /**
     * Sets the value of the discBreakListCodeStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDiscBreakListCodeStartDate(XMLGregorianCalendar value) {
        this.discBreakListCodeStartDate = value;
    }

    /**
     * Gets the value of the discListPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscListPrice() {
        return discListPrice;
    }

    /**
     * Sets the value of the discListPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscListPrice(BigDecimal value) {
        this.discListPrice = value;
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
     * Gets the value of the discountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountPercent() {
        return discountPercent;
    }

    /**
     * Sets the value of the discountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountPercent(BigDecimal value) {
        this.discountPercent = value;
    }

    /**
     * Gets the value of the displaySeq property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDisplaySeq() {
        return displaySeq;
    }

    /**
     * Sets the value of the displaySeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDisplaySeq(BigDecimal value) {
        this.displaySeq = value;
    }

    /**
     * Gets the value of the doNotShipAfterDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDoNotShipAfterDate() {
        return doNotShipAfterDate;
    }

    /**
     * Sets the value of the doNotShipAfterDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDoNotShipAfterDate(XMLGregorianCalendar value) {
        this.doNotShipAfterDate = value;
    }

    /**
     * Gets the value of the doNotShipBeforeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDoNotShipBeforeDate() {
        return doNotShipBeforeDate;
    }

    /**
     * Sets the value of the doNotShipBeforeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDoNotShipBeforeDate(XMLGregorianCalendar value) {
        this.doNotShipBeforeDate = value;
    }

    /**
     * Gets the value of the docAdvanceBillBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocAdvanceBillBal() {
        return docAdvanceBillBal;
    }

    /**
     * Sets the value of the docAdvanceBillBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocAdvanceBillBal(BigDecimal value) {
        this.docAdvanceBillBal = value;
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
     * Gets the value of the docDspDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocDspDiscount() {
        return docDspDiscount;
    }

    /**
     * Sets the value of the docDspDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocDspDiscount(BigDecimal value) {
        this.docDspDiscount = value;
    }

    /**
     * Gets the value of the docDspUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocDspUnitPrice() {
        return docDspUnitPrice;
    }

    /**
     * Sets the value of the docDspUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocDspUnitPrice(BigDecimal value) {
        this.docDspUnitPrice = value;
    }

    /**
     * Gets the value of the docExtPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocExtPrice() {
        return docExtPrice;
    }

    /**
     * Sets the value of the docExtPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocExtPrice(BigDecimal value) {
        this.docExtPrice = value;
    }

    /**
     * Gets the value of the docExtPriceDtl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocExtPriceDtl() {
        return docExtPriceDtl;
    }

    /**
     * Sets the value of the docExtPriceDtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocExtPriceDtl(BigDecimal value) {
        this.docExtPriceDtl = value;
    }

    /**
     * Gets the value of the docInDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocInDiscount() {
        return docInDiscount;
    }

    /**
     * Sets the value of the docInDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocInDiscount(BigDecimal value) {
        this.docInDiscount = value;
    }

    /**
     * Gets the value of the docInExtPriceDtl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocInExtPriceDtl() {
        return docInExtPriceDtl;
    }

    /**
     * Sets the value of the docInExtPriceDtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocInExtPriceDtl(BigDecimal value) {
        this.docInExtPriceDtl = value;
    }

    /**
     * Gets the value of the docInListPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocInListPrice() {
        return docInListPrice;
    }

    /**
     * Sets the value of the docInListPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocInListPrice(BigDecimal value) {
        this.docInListPrice = value;
    }

    /**
     * Gets the value of the docInMiscCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocInMiscCharges() {
        return docInMiscCharges;
    }

    /**
     * Sets the value of the docInMiscCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocInMiscCharges(BigDecimal value) {
        this.docInMiscCharges = value;
    }

    /**
     * Gets the value of the docInOrdBasedPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocInOrdBasedPrice() {
        return docInOrdBasedPrice;
    }

    /**
     * Sets the value of the docInOrdBasedPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocInOrdBasedPrice(BigDecimal value) {
        this.docInOrdBasedPrice = value;
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
     * Gets the value of the docLessDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocLessDiscount() {
        return docLessDiscount;
    }

    /**
     * Sets the value of the docLessDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocLessDiscount(BigDecimal value) {
        this.docLessDiscount = value;
    }

    /**
     * Gets the value of the docListPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocListPrice() {
        return docListPrice;
    }

    /**
     * Sets the value of the docListPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocListPrice(BigDecimal value) {
        this.docListPrice = value;
    }

    /**
     * Gets the value of the docMiscCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocMiscCharges() {
        return docMiscCharges;
    }

    /**
     * Sets the value of the docMiscCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocMiscCharges(BigDecimal value) {
        this.docMiscCharges = value;
    }

    /**
     * Gets the value of the docOrdBasedPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocOrdBasedPrice() {
        return docOrdBasedPrice;
    }

    /**
     * Sets the value of the docOrdBasedPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocOrdBasedPrice(BigDecimal value) {
        this.docOrdBasedPrice = value;
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
     * Gets the value of the docTotalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocTotalPrice() {
        return docTotalPrice;
    }

    /**
     * Sets the value of the docTotalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocTotalPrice(BigDecimal value) {
        this.docTotalPrice = value;
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
     * Gets the value of the dspDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDspDiscount() {
        return dspDiscount;
    }

    /**
     * Sets the value of the dspDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDspDiscount(BigDecimal value) {
        this.dspDiscount = value;
    }

    /**
     * Gets the value of the dspJobType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDspJobType() {
        return dspJobType;
    }

    /**
     * Sets the value of the dspJobType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDspJobType(String value) {
        this.dspJobType = value;
    }

    /**
     * Gets the value of the dspUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDspUnitPrice() {
        return dspUnitPrice;
    }

    /**
     * Sets the value of the dspUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDspUnitPrice(BigDecimal value) {
        this.dspUnitPrice = value;
    }

    /**
     * Gets the value of the enableCreateNewJob property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableCreateNewJob() {
        return enableCreateNewJob;
    }

    /**
     * Sets the value of the enableCreateNewJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableCreateNewJob(Boolean value) {
        this.enableCreateNewJob = value;
    }

    /**
     * Gets the value of the enableGetDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableGetDtls() {
        return enableGetDtls;
    }

    /**
     * Sets the value of the enableGetDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableGetDtls(Boolean value) {
        this.enableGetDtls = value;
    }

    /**
     * Gets the value of the enableKitUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableKitUnitPrice() {
        return enableKitUnitPrice;
    }

    /**
     * Sets the value of the enableKitUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableKitUnitPrice(Boolean value) {
        this.enableKitUnitPrice = value;
    }

    /**
     * Gets the value of the enableRelJob property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableRelJob() {
        return enableRelJob;
    }

    /**
     * Sets the value of the enableRelJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableRelJob(Boolean value) {
        this.enableRelJob = value;
    }

    /**
     * Gets the value of the enableRenewalNbr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableRenewalNbr() {
        return enableRenewalNbr;
    }

    /**
     * Sets the value of the enableRenewalNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableRenewalNbr(Boolean value) {
        this.enableRenewalNbr = value;
    }

    /**
     * Gets the value of the enableSchedJob property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableSchedJob() {
        return enableSchedJob;
    }

    /**
     * Sets the value of the enableSchedJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableSchedJob(Boolean value) {
        this.enableSchedJob = value;
    }

    /**
     * Gets the value of the enableSellingQty property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableSellingQty() {
        return enableSellingQty;
    }

    /**
     * Sets the value of the enableSellingQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableSellingQty(Boolean value) {
        this.enableSellingQty = value;
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
     * Gets the value of the extPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExtPrice() {
        return extPrice;
    }

    /**
     * Sets the value of the extPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExtPrice(BigDecimal value) {
        this.extPrice = value;
    }

    /**
     * Gets the value of the extPriceDtl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExtPriceDtl() {
        return extPriceDtl;
    }

    /**
     * Sets the value of the extPriceDtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExtPriceDtl(BigDecimal value) {
        this.extPriceDtl = value;
    }

    /**
     * Gets the value of the fromQuoteLineFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFromQuoteLineFlag() {
        return fromQuoteLineFlag;
    }

    /**
     * Sets the value of the fromQuoteLineFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFromQuoteLineFlag(Boolean value) {
        this.fromQuoteLineFlag = value;
    }

    /**
     * Gets the value of the getDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGetDtls() {
        return getDtls;
    }

    /**
     * Sets the value of the getDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGetDtls(Boolean value) {
        this.getDtls = value;
    }

    /**
     * Gets the value of the hasBeenConfigured property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasBeenConfigured() {
        return hasBeenConfigured;
    }

    /**
     * Sets the value of the hasBeenConfigured property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasBeenConfigured(Boolean value) {
        this.hasBeenConfigured = value;
    }

    /**
     * Gets the value of the hasComplement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasComplement() {
        return hasComplement;
    }

    /**
     * Sets the value of the hasComplement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasComplement(Boolean value) {
        this.hasComplement = value;
    }

    /**
     * Gets the value of the hasDowngrade property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasDowngrade() {
        return hasDowngrade;
    }

    /**
     * Sets the value of the hasDowngrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasDowngrade(Boolean value) {
        this.hasDowngrade = value;
    }

    /**
     * Gets the value of the hasSubstitute property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasSubstitute() {
        return hasSubstitute;
    }

    /**
     * Sets the value of the hasSubstitute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasSubstitute(Boolean value) {
        this.hasSubstitute = value;
    }

    /**
     * Gets the value of the hasUpgrade property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasUpgrade() {
        return hasUpgrade;
    }

    /**
     * Sets the value of the hasUpgrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasUpgrade(Boolean value) {
        this.hasUpgrade = value;
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
     * Gets the value of the inDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDiscount() {
        return inDiscount;
    }

    /**
     * Sets the value of the inDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDiscount(BigDecimal value) {
        this.inDiscount = value;
    }

    /**
     * Gets the value of the inExtPriceDtl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInExtPriceDtl() {
        return inExtPriceDtl;
    }

    /**
     * Sets the value of the inExtPriceDtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInExtPriceDtl(BigDecimal value) {
        this.inExtPriceDtl = value;
    }

    /**
     * Gets the value of the inListPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInListPrice() {
        return inListPrice;
    }

    /**
     * Sets the value of the inListPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInListPrice(BigDecimal value) {
        this.inListPrice = value;
    }

    /**
     * Gets the value of the inMiscCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInMiscCharges() {
        return inMiscCharges;
    }

    /**
     * Sets the value of the inMiscCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInMiscCharges(BigDecimal value) {
        this.inMiscCharges = value;
    }

    /**
     * Gets the value of the inOrdBasedPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInOrdBasedPrice() {
        return inOrdBasedPrice;
    }

    /**
     * Sets the value of the inOrdBasedPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInOrdBasedPrice(BigDecimal value) {
        this.inOrdBasedPrice = value;
    }

    /**
     * Gets the value of the inPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInPrice() {
        return inPrice;
    }

    /**
     * Sets the value of the inPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInPrice(Boolean value) {
        this.inPrice = value;
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
     * Gets the value of the invoiceComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceComment() {
        return invoiceComment;
    }

    /**
     * Sets the value of the invoiceComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceComment(String value) {
        this.invoiceComment = value;
    }

    /**
     * Gets the value of the invtyUOM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvtyUOM() {
        return invtyUOM;
    }

    /**
     * Sets the value of the invtyUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvtyUOM(String value) {
        this.invtyUOM = value;
    }

    /**
     * Gets the value of the jobTypeMFG property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTypeMFG() {
        return jobTypeMFG;
    }

    /**
     * Sets the value of the jobTypeMFG property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTypeMFG(String value) {
        this.jobTypeMFG = value;
    }

    /**
     * Gets the value of the jobWasCreated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isJobWasCreated() {
        return jobWasCreated;
    }

    /**
     * Sets the value of the jobWasCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setJobWasCreated(Boolean value) {
        this.jobWasCreated = value;
    }

    /**
     * Gets the value of the kitAllowUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKitAllowUpdate() {
        return kitAllowUpdate;
    }

    /**
     * Sets the value of the kitAllowUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKitAllowUpdate(Boolean value) {
        this.kitAllowUpdate = value;
    }

    /**
     * Gets the value of the kitBackFlush property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKitBackFlush() {
        return kitBackFlush;
    }

    /**
     * Sets the value of the kitBackFlush property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKitBackFlush(Boolean value) {
        this.kitBackFlush = value;
    }

    /**
     * Gets the value of the kitChangeParms property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKitChangeParms() {
        return kitChangeParms;
    }

    /**
     * Sets the value of the kitChangeParms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKitChangeParms(Boolean value) {
        this.kitChangeParms = value;
    }

    /**
     * Gets the value of the kitCompOrigPart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKitCompOrigPart() {
        return kitCompOrigPart;
    }

    /**
     * Sets the value of the kitCompOrigPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKitCompOrigPart(String value) {
        this.kitCompOrigPart = value;
    }

    /**
     * Gets the value of the kitCompOrigSeq property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKitCompOrigSeq() {
        return kitCompOrigSeq;
    }

    /**
     * Sets the value of the kitCompOrigSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKitCompOrigSeq(Integer value) {
        this.kitCompOrigSeq = value;
    }

    /**
     * Gets the value of the kitDisable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKitDisable() {
        return kitDisable;
    }

    /**
     * Sets the value of the kitDisable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKitDisable(Boolean value) {
        this.kitDisable = value;
    }

    /**
     * Gets the value of the kitFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKitFlag() {
        return kitFlag;
    }

    /**
     * Sets the value of the kitFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKitFlag(String value) {
        this.kitFlag = value;
    }

    /**
     * Gets the value of the kitFlagDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKitFlagDescription() {
        return kitFlagDescription;
    }

    /**
     * Sets the value of the kitFlagDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKitFlagDescription(String value) {
        this.kitFlagDescription = value;
    }

    /**
     * Gets the value of the kitOrderQtyUOM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKitOrderQtyUOM() {
        return kitOrderQtyUOM;
    }

    /**
     * Sets the value of the kitOrderQtyUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKitOrderQtyUOM(String value) {
        this.kitOrderQtyUOM = value;
    }

    /**
     * Gets the value of the kitParentLine property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKitParentLine() {
        return kitParentLine;
    }

    /**
     * Sets the value of the kitParentLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKitParentLine(Integer value) {
        this.kitParentLine = value;
    }

    /**
     * Gets the value of the kitPricing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKitPricing() {
        return kitPricing;
    }

    /**
     * Sets the value of the kitPricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKitPricing(String value) {
        this.kitPricing = value;
    }

    /**
     * Gets the value of the kitPrintCompsInv property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKitPrintCompsInv() {
        return kitPrintCompsInv;
    }

    /**
     * Sets the value of the kitPrintCompsInv property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKitPrintCompsInv(Boolean value) {
        this.kitPrintCompsInv = value;
    }

    /**
     * Gets the value of the kitPrintCompsPS property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKitPrintCompsPS() {
        return kitPrintCompsPS;
    }

    /**
     * Sets the value of the kitPrintCompsPS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKitPrintCompsPS(Boolean value) {
        this.kitPrintCompsPS = value;
    }

    /**
     * Gets the value of the kitQtyPer property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKitQtyPer() {
        return kitQtyPer;
    }

    /**
     * Sets the value of the kitQtyPer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKitQtyPer(BigDecimal value) {
        this.kitQtyPer = value;
    }

    /**
     * Gets the value of the kitShipComplete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKitShipComplete() {
        return kitShipComplete;
    }

    /**
     * Sets the value of the kitShipComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKitShipComplete(Boolean value) {
        this.kitShipComplete = value;
    }

    /**
     * Gets the value of the kitStandard property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKitStandard() {
        return kitStandard;
    }

    /**
     * Sets the value of the kitStandard property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKitStandard(Boolean value) {
        this.kitStandard = value;
    }

    /**
     * Gets the value of the kitsLoaded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKitsLoaded() {
        return kitsLoaded;
    }

    /**
     * Sets the value of the kitsLoaded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKitsLoaded(Boolean value) {
        this.kitsLoaded = value;
    }

    /**
     * Gets the value of the labCovered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLabCovered() {
        return labCovered;
    }

    /**
     * Sets the value of the labCovered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLabCovered(Boolean value) {
        this.labCovered = value;
    }

    /**
     * Gets the value of the laborDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLaborDuration() {
        return laborDuration;
    }

    /**
     * Sets the value of the laborDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLaborDuration(Integer value) {
        this.laborDuration = value;
    }

    /**
     * Gets the value of the laborMod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaborMod() {
        return laborMod;
    }

    /**
     * Sets the value of the laborMod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaborMod(String value) {
        this.laborMod = value;
    }

    /**
     * Gets the value of the lastConfigDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastConfigDate() {
        return lastConfigDate;
    }

    /**
     * Sets the value of the lastConfigDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastConfigDate(XMLGregorianCalendar value) {
        this.lastConfigDate = value;
    }

    /**
     * Gets the value of the lastConfigTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLastConfigTime() {
        return lastConfigTime;
    }

    /**
     * Sets the value of the lastConfigTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLastConfigTime(Integer value) {
        this.lastConfigTime = value;
    }

    /**
     * Gets the value of the lastConfigUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastConfigUserID() {
        return lastConfigUserID;
    }

    /**
     * Sets the value of the lastConfigUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastConfigUserID(String value) {
        this.lastConfigUserID = value;
    }

    /**
     * Gets the value of the lessDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLessDiscount() {
        return lessDiscount;
    }

    /**
     * Sets the value of the lessDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLessDiscount(BigDecimal value) {
        this.lessDiscount = value;
    }

    /**
     * Gets the value of the lineDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineDesc() {
        return lineDesc;
    }

    /**
     * Sets the value of the lineDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineDesc(String value) {
        this.lineDesc = value;
    }

    /**
     * Gets the value of the lineStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineStatus() {
        return lineStatus;
    }

    /**
     * Sets the value of the lineStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineStatus(String value) {
        this.lineStatus = value;
    }

    /**
     * Gets the value of the lineType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineType() {
        return lineType;
    }

    /**
     * Sets the value of the lineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineType(String value) {
        this.lineType = value;
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
     * Gets the value of the listPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getListPrice() {
        return listPrice;
    }

    /**
     * Sets the value of the listPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setListPrice(BigDecimal value) {
        this.listPrice = value;
    }

    /**
     * Gets the value of the lockDisc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLockDisc() {
        return lockDisc;
    }

    /**
     * Sets the value of the lockDisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLockDisc(Boolean value) {
        this.lockDisc = value;
    }

    /**
     * Gets the value of the lockPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLockPrice() {
        return lockPrice;
    }

    /**
     * Sets the value of the lockPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLockPrice(Boolean value) {
        this.lockPrice = value;
    }

    /**
     * Gets the value of the lockQty property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLockQty() {
        return lockQty;
    }

    /**
     * Sets the value of the lockQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLockQty(Boolean value) {
        this.lockQty = value;
    }

    /**
     * Gets the value of the lotNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotNum() {
        return lotNum;
    }

    /**
     * Sets the value of the lotNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotNum(String value) {
        this.lotNum = value;
    }

    /**
     * Gets the value of the matCovered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMatCovered() {
        return matCovered;
    }

    /**
     * Sets the value of the matCovered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMatCovered(Boolean value) {
        this.matCovered = value;
    }

    /**
     * Gets the value of the materialDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaterialDuration() {
        return materialDuration;
    }

    /**
     * Sets the value of the materialDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaterialDuration(Integer value) {
        this.materialDuration = value;
    }

    /**
     * Gets the value of the materialMod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialMod() {
        return materialMod;
    }

    /**
     * Sets the value of the materialMod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialMod(String value) {
        this.materialMod = value;
    }

    /**
     * Gets the value of the miscCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMiscCharges() {
        return miscCharges;
    }

    /**
     * Sets the value of the miscCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMiscCharges(BigDecimal value) {
        this.miscCharges = value;
    }

    /**
     * Gets the value of the miscCovered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMiscCovered() {
        return miscCovered;
    }

    /**
     * Sets the value of the miscCovered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMiscCovered(Boolean value) {
        this.miscCovered = value;
    }

    /**
     * Gets the value of the miscDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMiscDuration() {
        return miscDuration;
    }

    /**
     * Sets the value of the miscDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMiscDuration(Integer value) {
        this.miscDuration = value;
    }

    /**
     * Gets the value of the mktgCampaignID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktgCampaignID() {
        return mktgCampaignID;
    }

    /**
     * Sets the value of the mktgCampaignID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMktgCampaignID(String value) {
        this.mktgCampaignID = value;
    }

    /**
     * Gets the value of the mktgCampaignIDCampDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktgCampaignIDCampDescription() {
        return mktgCampaignIDCampDescription;
    }

    /**
     * Sets the value of the mktgCampaignIDCampDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMktgCampaignIDCampDescription(String value) {
        this.mktgCampaignIDCampDescription = value;
    }

    /**
     * Gets the value of the mktgEvntEvntDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktgEvntEvntDescription() {
        return mktgEvntEvntDescription;
    }

    /**
     * Sets the value of the mktgEvntEvntDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMktgEvntEvntDescription(String value) {
        this.mktgEvntEvntDescription = value;
    }

    /**
     * Gets the value of the mktgEvntSeq property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMktgEvntSeq() {
        return mktgEvntSeq;
    }

    /**
     * Sets the value of the mktgEvntSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMktgEvntSeq(Integer value) {
        this.mktgEvntSeq = value;
    }

    /**
     * Gets the value of the multipleReleases property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultipleReleases() {
        return multipleReleases;
    }

    /**
     * Sets the value of the multipleReleases property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultipleReleases(Boolean value) {
        this.multipleReleases = value;
    }

    /**
     * Gets the value of the needByDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNeedByDate() {
        return needByDate;
    }

    /**
     * Sets the value of the needByDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNeedByDate(XMLGregorianCalendar value) {
        this.needByDate = value;
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
     * Gets the value of the number11 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumber11() {
        return number11;
    }

    /**
     * Sets the value of the number11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumber11(BigDecimal value) {
        this.number11 = value;
    }

    /**
     * Gets the value of the number12 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumber12() {
        return number12;
    }

    /**
     * Sets the value of the number12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumber12(BigDecimal value) {
        this.number12 = value;
    }

    /**
     * Gets the value of the number13 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumber13() {
        return number13;
    }

    /**
     * Sets the value of the number13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumber13(BigDecimal value) {
        this.number13 = value;
    }

    /**
     * Gets the value of the number14 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumber14() {
        return number14;
    }

    /**
     * Sets the value of the number14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumber14(BigDecimal value) {
        this.number14 = value;
    }

    /**
     * Gets the value of the number15 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumber15() {
        return number15;
    }

    /**
     * Sets the value of the number15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumber15(BigDecimal value) {
        this.number15 = value;
    }

    /**
     * Gets the value of the number16 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumber16() {
        return number16;
    }

    /**
     * Sets the value of the number16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumber16(BigDecimal value) {
        this.number16 = value;
    }

    /**
     * Gets the value of the number17 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumber17() {
        return number17;
    }

    /**
     * Sets the value of the number17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumber17(BigDecimal value) {
        this.number17 = value;
    }

    /**
     * Gets the value of the number18 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumber18() {
        return number18;
    }

    /**
     * Sets the value of the number18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumber18(BigDecimal value) {
        this.number18 = value;
    }

    /**
     * Gets the value of the number19 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumber19() {
        return number19;
    }

    /**
     * Sets the value of the number19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumber19(BigDecimal value) {
        this.number19 = value;
    }

    /**
     * Gets the value of the number20 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumber20() {
        return number20;
    }

    /**
     * Sets the value of the number20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumber20(BigDecimal value) {
        this.number20 = value;
    }

    /**
     * Gets the value of the oldOpenValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOldOpenValue() {
        return oldOpenValue;
    }

    /**
     * Sets the value of the oldOpenValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOldOpenValue(BigDecimal value) {
        this.oldOpenValue = value;
    }

    /**
     * Gets the value of the oldOurOpenQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOldOurOpenQty() {
        return oldOurOpenQty;
    }

    /**
     * Sets the value of the oldOurOpenQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOldOurOpenQty(BigDecimal value) {
        this.oldOurOpenQty = value;
    }

    /**
     * Gets the value of the oldProdCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldProdCode() {
        return oldProdCode;
    }

    /**
     * Sets the value of the oldProdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldProdCode(String value) {
        this.oldProdCode = value;
    }

    /**
     * Gets the value of the oldSellingOpenQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOldSellingOpenQty() {
        return oldSellingOpenQty;
    }

    /**
     * Sets the value of the oldSellingOpenQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOldSellingOpenQty(BigDecimal value) {
        this.oldSellingOpenQty = value;
    }

    /**
     * Gets the value of the onHandQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOnHandQuantity() {
        return onHandQuantity;
    }

    /**
     * Sets the value of the onHandQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOnHandQuantity(BigDecimal value) {
        this.onHandQuantity = value;
    }

    /**
     * Gets the value of the onsite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnsite() {
        return onsite;
    }

    /**
     * Sets the value of the onsite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnsite(Boolean value) {
        this.onsite = value;
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
     * Gets the value of the ordBasedPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrdBasedPrice() {
        return ordBasedPrice;
    }

    /**
     * Sets the value of the ordBasedPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrdBasedPrice(BigDecimal value) {
        this.ordBasedPrice = value;
    }

    /**
     * Gets the value of the orderComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderComment() {
        return orderComment;
    }

    /**
     * Sets the value of the orderComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderComment(String value) {
        this.orderComment = value;
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
     * Gets the value of the orderNumBTCustNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrderNumBTCustNum() {
        return orderNumBTCustNum;
    }

    /**
     * Sets the value of the orderNumBTCustNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrderNumBTCustNum(Integer value) {
        this.orderNumBTCustNum = value;
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
     * Gets the value of the orderQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrderQty() {
        return orderQty;
    }

    /**
     * Sets the value of the orderQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrderQty(BigDecimal value) {
        this.orderQty = value;
    }

    /**
     * Gets the value of the origWhyNoTax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigWhyNoTax() {
        return origWhyNoTax;
    }

    /**
     * Sets the value of the origWhyNoTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigWhyNoTax(String value) {
        this.origWhyNoTax = value;
    }

    /**
     * Gets the value of the overrideDiscPriceList property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverrideDiscPriceList() {
        return overrideDiscPriceList;
    }

    /**
     * Sets the value of the overrideDiscPriceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverrideDiscPriceList(Boolean value) {
        this.overrideDiscPriceList = value;
    }

    /**
     * Gets the value of the overridePriceList property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverridePriceList() {
        return overridePriceList;
    }

    /**
     * Sets the value of the overridePriceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverridePriceList(Boolean value) {
        this.overridePriceList = value;
    }

    /**
     * Gets the value of the poLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOLine() {
        return poLine;
    }

    /**
     * Sets the value of the poLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOLine(String value) {
        this.poLine = value;
    }

    /**
     * Gets the value of the poLineRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOLineRef() {
        return poLineRef;
    }

    /**
     * Sets the value of the poLineRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOLineRef(String value) {
        this.poLineRef = value;
    }

    /**
     * Gets the value of the partExists property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartExists() {
        return partExists;
    }

    /**
     * Sets the value of the partExists property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartExists(Boolean value) {
        this.partExists = value;
    }

    /**
     * Gets the value of the partNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartNum() {
        return partNum;
    }

    /**
     * Sets the value of the partNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartNum(String value) {
        this.partNum = value;
    }

    /**
     * Gets the value of the partNumIUM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartNumIUM() {
        return partNumIUM;
    }

    /**
     * Sets the value of the partNumIUM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartNumIUM(String value) {
        this.partNumIUM = value;
    }

    /**
     * Gets the value of the partNumPartDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartNumPartDescription() {
        return partNumPartDescription;
    }

    /**
     * Sets the value of the partNumPartDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartNumPartDescription(String value) {
        this.partNumPartDescription = value;
    }

    /**
     * Gets the value of the partNumPricePerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartNumPricePerCode() {
        return partNumPricePerCode;
    }

    /**
     * Sets the value of the partNumPricePerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartNumPricePerCode(String value) {
        this.partNumPricePerCode = value;
    }

    /**
     * Gets the value of the partNumSalesUM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartNumSalesUM() {
        return partNumSalesUM;
    }

    /**
     * Sets the value of the partNumSalesUM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartNumSalesUM(String value) {
        this.partNumSalesUM = value;
    }

    /**
     * Gets the value of the partNumSellingFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPartNumSellingFactor() {
        return partNumSellingFactor;
    }

    /**
     * Sets the value of the partNumSellingFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPartNumSellingFactor(BigDecimal value) {
        this.partNumSellingFactor = value;
    }

    /**
     * Gets the value of the partNumTrackDimension property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartNumTrackDimension() {
        return partNumTrackDimension;
    }

    /**
     * Sets the value of the partNumTrackDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartNumTrackDimension(Boolean value) {
        this.partNumTrackDimension = value;
    }

    /**
     * Gets the value of the partNumTrackLots property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartNumTrackLots() {
        return partNumTrackLots;
    }

    /**
     * Sets the value of the partNumTrackLots property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartNumTrackLots(Boolean value) {
        this.partNumTrackLots = value;
    }

    /**
     * Gets the value of the partNumTrackSerialNum property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartNumTrackSerialNum() {
        return partNumTrackSerialNum;
    }

    /**
     * Sets the value of the partNumTrackSerialNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartNumTrackSerialNum(Boolean value) {
        this.partNumTrackSerialNum = value;
    }

    /**
     * Gets the value of the partTrackDimension property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartTrackDimension() {
        return partTrackDimension;
    }

    /**
     * Sets the value of the partTrackDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartTrackDimension(Boolean value) {
        this.partTrackDimension = value;
    }

    /**
     * Gets the value of the partTrackLots property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartTrackLots() {
        return partTrackLots;
    }

    /**
     * Sets the value of the partTrackLots property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartTrackLots(Boolean value) {
        this.partTrackLots = value;
    }

    /**
     * Gets the value of the pickListComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickListComment() {
        return pickListComment;
    }

    /**
     * Sets the value of the pickListComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickListComment(String value) {
        this.pickListComment = value;
    }

    /**
     * Gets the value of the prevPartNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevPartNum() {
        return prevPartNum;
    }

    /**
     * Sets the value of the prevPartNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevPartNum(String value) {
        this.prevPartNum = value;
    }

    /**
     * Gets the value of the prevSellQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrevSellQty() {
        return prevSellQty;
    }

    /**
     * Sets the value of the prevSellQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrevSellQty(BigDecimal value) {
        this.prevSellQty = value;
    }

    /**
     * Gets the value of the prevXPartNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevXPartNum() {
        return prevXPartNum;
    }

    /**
     * Sets the value of the prevXPartNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevXPartNum(String value) {
        this.prevXPartNum = value;
    }

    /**
     * Gets the value of the priceGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceGroupCode() {
        return priceGroupCode;
    }

    /**
     * Sets the value of the priceGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceGroupCode(String value) {
        this.priceGroupCode = value;
    }

    /**
     * Gets the value of the priceListCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceListCode() {
        return priceListCode;
    }

    /**
     * Sets the value of the priceListCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceListCode(String value) {
        this.priceListCode = value;
    }

    /**
     * Gets the value of the priceListCodeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceListCodeDesc() {
        return priceListCodeDesc;
    }

    /**
     * Sets the value of the priceListCodeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceListCodeDesc(String value) {
        this.priceListCodeDesc = value;
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
     * Gets the value of the pricingQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPricingQty() {
        return pricingQty;
    }

    /**
     * Sets the value of the pricingQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPricingQty(BigDecimal value) {
        this.pricingQty = value;
    }

    /**
     * Gets the value of the pricingValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPricingValue() {
        return pricingValue;
    }

    /**
     * Sets the value of the pricingValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPricingValue(BigDecimal value) {
        this.pricingValue = value;
    }

    /**
     * Gets the value of the proFormaInvComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProFormaInvComment() {
        return proFormaInvComment;
    }

    /**
     * Sets the value of the proFormaInvComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProFormaInvComment(String value) {
        this.proFormaInvComment = value;
    }

    /**
     * Gets the value of the processCounterSale property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProcessCounterSale() {
        return processCounterSale;
    }

    /**
     * Sets the value of the processCounterSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProcessCounterSale(Boolean value) {
        this.processCounterSale = value;
    }

    /**
     * Gets the value of the processQuickEntry property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProcessQuickEntry() {
        return processQuickEntry;
    }

    /**
     * Sets the value of the processQuickEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProcessQuickEntry(Boolean value) {
        this.processQuickEntry = value;
    }

    /**
     * Gets the value of the prodCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdCode() {
        return prodCode;
    }

    /**
     * Sets the value of the prodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdCode(String value) {
        this.prodCode = value;
    }

    /**
     * Gets the value of the prodCodeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdCodeDescription() {
        return prodCodeDescription;
    }

    /**
     * Sets the value of the prodCodeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdCodeDescription(String value) {
        this.prodCodeDescription = value;
    }

    /**
     * Gets the value of the projectID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectID() {
        return projectID;
    }

    /**
     * Sets the value of the projectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectID(String value) {
        this.projectID = value;
    }

    /**
     * Gets the value of the projectIDDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectIDDescription() {
        return projectIDDescription;
    }

    /**
     * Sets the value of the projectIDDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectIDDescription(String value) {
        this.projectIDDescription = value;
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
     * Gets the value of the quoteQtyNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuoteQtyNum() {
        return quoteQtyNum;
    }

    /**
     * Sets the value of the quoteQtyNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuoteQtyNum(Integer value) {
        this.quoteQtyNum = value;
    }

    /**
     * Gets the value of the rmaLine property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRMALine() {
        return rmaLine;
    }

    /**
     * Sets the value of the rmaLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRMALine(Integer value) {
        this.rmaLine = value;
    }

    /**
     * Gets the value of the rmaNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRMANum() {
        return rmaNum;
    }

    /**
     * Sets the value of the rmaNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRMANum(Integer value) {
        this.rmaNum = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    /**
     * Gets the value of the relJob property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRelJob() {
        return relJob;
    }

    /**
     * Sets the value of the relJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRelJob(Boolean value) {
        this.relJob = value;
    }

    /**
     * Gets the value of the relWasRecInvoiced property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRelWasRecInvoiced() {
        return relWasRecInvoiced;
    }

    /**
     * Sets the value of the relWasRecInvoiced property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRelWasRecInvoiced(Boolean value) {
        this.relWasRecInvoiced = value;
    }

    /**
     * Gets the value of the renewalNbr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRenewalNbr() {
        return renewalNbr;
    }

    /**
     * Sets the value of the renewalNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRenewalNbr(Integer value) {
        this.renewalNbr = value;
    }

    /**
     * Gets the value of the repRate1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepRate1() {
        return repRate1;
    }

    /**
     * Sets the value of the repRate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepRate1(BigDecimal value) {
        this.repRate1 = value;
    }

    /**
     * Gets the value of the repRate2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepRate2() {
        return repRate2;
    }

    /**
     * Sets the value of the repRate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepRate2(BigDecimal value) {
        this.repRate2 = value;
    }

    /**
     * Gets the value of the repRate3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepRate3() {
        return repRate3;
    }

    /**
     * Sets the value of the repRate3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepRate3(BigDecimal value) {
        this.repRate3 = value;
    }

    /**
     * Gets the value of the repRate4 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepRate4() {
        return repRate4;
    }

    /**
     * Sets the value of the repRate4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepRate4(BigDecimal value) {
        this.repRate4 = value;
    }

    /**
     * Gets the value of the repRate5 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepRate5() {
        return repRate5;
    }

    /**
     * Sets the value of the repRate5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepRate5(BigDecimal value) {
        this.repRate5 = value;
    }

    /**
     * Gets the value of the repSplit1 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRepSplit1() {
        return repSplit1;
    }

    /**
     * Sets the value of the repSplit1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRepSplit1(Integer value) {
        this.repSplit1 = value;
    }

    /**
     * Gets the value of the repSplit2 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRepSplit2() {
        return repSplit2;
    }

    /**
     * Sets the value of the repSplit2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRepSplit2(Integer value) {
        this.repSplit2 = value;
    }

    /**
     * Gets the value of the repSplit3 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRepSplit3() {
        return repSplit3;
    }

    /**
     * Sets the value of the repSplit3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRepSplit3(Integer value) {
        this.repSplit3 = value;
    }

    /**
     * Gets the value of the repSplit4 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRepSplit4() {
        return repSplit4;
    }

    /**
     * Sets the value of the repSplit4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRepSplit4(Integer value) {
        this.repSplit4 = value;
    }

    /**
     * Gets the value of the repSplit5 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRepSplit5() {
        return repSplit5;
    }

    /**
     * Sets the value of the repSplit5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRepSplit5(Integer value) {
        this.repSplit5 = value;
    }

    /**
     * Gets the value of the requestDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestDate() {
        return requestDate;
    }

    /**
     * Sets the value of the requestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestDate(XMLGregorianCalendar value) {
        this.requestDate = value;
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
     * Gets the value of the revisionNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevisionNum() {
        return revisionNum;
    }

    /**
     * Sets the value of the revisionNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevisionNum(String value) {
        this.revisionNum = value;
    }

    /**
     * Gets the value of the rework property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRework() {
        return rework;
    }

    /**
     * Sets the value of the rework property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRework(Boolean value) {
        this.rework = value;
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
     * Gets the value of the rpt1AdvanceBillBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1AdvanceBillBal() {
        return rpt1AdvanceBillBal;
    }

    /**
     * Sets the value of the rpt1AdvanceBillBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1AdvanceBillBal(BigDecimal value) {
        this.rpt1AdvanceBillBal = value;
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
     * Gets the value of the rpt1DspDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1DspDiscount() {
        return rpt1DspDiscount;
    }

    /**
     * Sets the value of the rpt1DspDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1DspDiscount(BigDecimal value) {
        this.rpt1DspDiscount = value;
    }

    /**
     * Gets the value of the rpt1DspUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1DspUnitPrice() {
        return rpt1DspUnitPrice;
    }

    /**
     * Sets the value of the rpt1DspUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1DspUnitPrice(BigDecimal value) {
        this.rpt1DspUnitPrice = value;
    }

    /**
     * Gets the value of the rpt1ExtPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1ExtPrice() {
        return rpt1ExtPrice;
    }

    /**
     * Sets the value of the rpt1ExtPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1ExtPrice(BigDecimal value) {
        this.rpt1ExtPrice = value;
    }

    /**
     * Gets the value of the rpt1ExtPriceDtl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1ExtPriceDtl() {
        return rpt1ExtPriceDtl;
    }

    /**
     * Sets the value of the rpt1ExtPriceDtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1ExtPriceDtl(BigDecimal value) {
        this.rpt1ExtPriceDtl = value;
    }

    /**
     * Gets the value of the rpt1InDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1InDiscount() {
        return rpt1InDiscount;
    }

    /**
     * Sets the value of the rpt1InDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1InDiscount(BigDecimal value) {
        this.rpt1InDiscount = value;
    }

    /**
     * Gets the value of the rpt1InExtPriceDtl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1InExtPriceDtl() {
        return rpt1InExtPriceDtl;
    }

    /**
     * Sets the value of the rpt1InExtPriceDtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1InExtPriceDtl(BigDecimal value) {
        this.rpt1InExtPriceDtl = value;
    }

    /**
     * Gets the value of the rpt1InListPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1InListPrice() {
        return rpt1InListPrice;
    }

    /**
     * Sets the value of the rpt1InListPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1InListPrice(BigDecimal value) {
        this.rpt1InListPrice = value;
    }

    /**
     * Gets the value of the rpt1InMiscCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1InMiscCharges() {
        return rpt1InMiscCharges;
    }

    /**
     * Sets the value of the rpt1InMiscCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1InMiscCharges(BigDecimal value) {
        this.rpt1InMiscCharges = value;
    }

    /**
     * Gets the value of the rpt1InOrdBasedPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1InOrdBasedPrice() {
        return rpt1InOrdBasedPrice;
    }

    /**
     * Sets the value of the rpt1InOrdBasedPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1InOrdBasedPrice(BigDecimal value) {
        this.rpt1InOrdBasedPrice = value;
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
     * Gets the value of the rpt1LessDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1LessDiscount() {
        return rpt1LessDiscount;
    }

    /**
     * Sets the value of the rpt1LessDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1LessDiscount(BigDecimal value) {
        this.rpt1LessDiscount = value;
    }

    /**
     * Gets the value of the rpt1ListPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1ListPrice() {
        return rpt1ListPrice;
    }

    /**
     * Sets the value of the rpt1ListPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1ListPrice(BigDecimal value) {
        this.rpt1ListPrice = value;
    }

    /**
     * Gets the value of the rpt1MiscCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1MiscCharges() {
        return rpt1MiscCharges;
    }

    /**
     * Sets the value of the rpt1MiscCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1MiscCharges(BigDecimal value) {
        this.rpt1MiscCharges = value;
    }

    /**
     * Gets the value of the rpt1OrdBasedPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1OrdBasedPrice() {
        return rpt1OrdBasedPrice;
    }

    /**
     * Sets the value of the rpt1OrdBasedPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1OrdBasedPrice(BigDecimal value) {
        this.rpt1OrdBasedPrice = value;
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
     * Gets the value of the rpt1TotalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1TotalPrice() {
        return rpt1TotalPrice;
    }

    /**
     * Sets the value of the rpt1TotalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1TotalPrice(BigDecimal value) {
        this.rpt1TotalPrice = value;
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
     * Gets the value of the rpt2AdvanceBillBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2AdvanceBillBal() {
        return rpt2AdvanceBillBal;
    }

    /**
     * Sets the value of the rpt2AdvanceBillBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2AdvanceBillBal(BigDecimal value) {
        this.rpt2AdvanceBillBal = value;
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
     * Gets the value of the rpt2DspDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2DspDiscount() {
        return rpt2DspDiscount;
    }

    /**
     * Sets the value of the rpt2DspDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2DspDiscount(BigDecimal value) {
        this.rpt2DspDiscount = value;
    }

    /**
     * Gets the value of the rpt2DspUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2DspUnitPrice() {
        return rpt2DspUnitPrice;
    }

    /**
     * Sets the value of the rpt2DspUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2DspUnitPrice(BigDecimal value) {
        this.rpt2DspUnitPrice = value;
    }

    /**
     * Gets the value of the rpt2ExtPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2ExtPrice() {
        return rpt2ExtPrice;
    }

    /**
     * Sets the value of the rpt2ExtPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2ExtPrice(BigDecimal value) {
        this.rpt2ExtPrice = value;
    }

    /**
     * Gets the value of the rpt2ExtPriceDtl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2ExtPriceDtl() {
        return rpt2ExtPriceDtl;
    }

    /**
     * Sets the value of the rpt2ExtPriceDtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2ExtPriceDtl(BigDecimal value) {
        this.rpt2ExtPriceDtl = value;
    }

    /**
     * Gets the value of the rpt2InDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2InDiscount() {
        return rpt2InDiscount;
    }

    /**
     * Sets the value of the rpt2InDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2InDiscount(BigDecimal value) {
        this.rpt2InDiscount = value;
    }

    /**
     * Gets the value of the rpt2InExtPriceDtl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2InExtPriceDtl() {
        return rpt2InExtPriceDtl;
    }

    /**
     * Sets the value of the rpt2InExtPriceDtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2InExtPriceDtl(BigDecimal value) {
        this.rpt2InExtPriceDtl = value;
    }

    /**
     * Gets the value of the rpt2InListPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2InListPrice() {
        return rpt2InListPrice;
    }

    /**
     * Sets the value of the rpt2InListPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2InListPrice(BigDecimal value) {
        this.rpt2InListPrice = value;
    }

    /**
     * Gets the value of the rpt2InMiscCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2InMiscCharges() {
        return rpt2InMiscCharges;
    }

    /**
     * Sets the value of the rpt2InMiscCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2InMiscCharges(BigDecimal value) {
        this.rpt2InMiscCharges = value;
    }

    /**
     * Gets the value of the rpt2InOrdBasedPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2InOrdBasedPrice() {
        return rpt2InOrdBasedPrice;
    }

    /**
     * Sets the value of the rpt2InOrdBasedPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2InOrdBasedPrice(BigDecimal value) {
        this.rpt2InOrdBasedPrice = value;
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
     * Gets the value of the rpt2LessDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2LessDiscount() {
        return rpt2LessDiscount;
    }

    /**
     * Sets the value of the rpt2LessDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2LessDiscount(BigDecimal value) {
        this.rpt2LessDiscount = value;
    }

    /**
     * Gets the value of the rpt2ListPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2ListPrice() {
        return rpt2ListPrice;
    }

    /**
     * Sets the value of the rpt2ListPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2ListPrice(BigDecimal value) {
        this.rpt2ListPrice = value;
    }

    /**
     * Gets the value of the rpt2MiscCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2MiscCharges() {
        return rpt2MiscCharges;
    }

    /**
     * Sets the value of the rpt2MiscCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2MiscCharges(BigDecimal value) {
        this.rpt2MiscCharges = value;
    }

    /**
     * Gets the value of the rpt2OrdBasedPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2OrdBasedPrice() {
        return rpt2OrdBasedPrice;
    }

    /**
     * Sets the value of the rpt2OrdBasedPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2OrdBasedPrice(BigDecimal value) {
        this.rpt2OrdBasedPrice = value;
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
     * Gets the value of the rpt2TotalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2TotalPrice() {
        return rpt2TotalPrice;
    }

    /**
     * Sets the value of the rpt2TotalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2TotalPrice(BigDecimal value) {
        this.rpt2TotalPrice = value;
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
     * Gets the value of the rpt3AdvanceBillBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3AdvanceBillBal() {
        return rpt3AdvanceBillBal;
    }

    /**
     * Sets the value of the rpt3AdvanceBillBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3AdvanceBillBal(BigDecimal value) {
        this.rpt3AdvanceBillBal = value;
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
     * Gets the value of the rpt3DspDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3DspDiscount() {
        return rpt3DspDiscount;
    }

    /**
     * Sets the value of the rpt3DspDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3DspDiscount(BigDecimal value) {
        this.rpt3DspDiscount = value;
    }

    /**
     * Gets the value of the rpt3DspUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3DspUnitPrice() {
        return rpt3DspUnitPrice;
    }

    /**
     * Sets the value of the rpt3DspUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3DspUnitPrice(BigDecimal value) {
        this.rpt3DspUnitPrice = value;
    }

    /**
     * Gets the value of the rpt3ExtPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3ExtPrice() {
        return rpt3ExtPrice;
    }

    /**
     * Sets the value of the rpt3ExtPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3ExtPrice(BigDecimal value) {
        this.rpt3ExtPrice = value;
    }

    /**
     * Gets the value of the rpt3ExtPriceDtl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3ExtPriceDtl() {
        return rpt3ExtPriceDtl;
    }

    /**
     * Sets the value of the rpt3ExtPriceDtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3ExtPriceDtl(BigDecimal value) {
        this.rpt3ExtPriceDtl = value;
    }

    /**
     * Gets the value of the rpt3InDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3InDiscount() {
        return rpt3InDiscount;
    }

    /**
     * Sets the value of the rpt3InDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3InDiscount(BigDecimal value) {
        this.rpt3InDiscount = value;
    }

    /**
     * Gets the value of the rpt3InExtPriceDtl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3InExtPriceDtl() {
        return rpt3InExtPriceDtl;
    }

    /**
     * Sets the value of the rpt3InExtPriceDtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3InExtPriceDtl(BigDecimal value) {
        this.rpt3InExtPriceDtl = value;
    }

    /**
     * Gets the value of the rpt3InListPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3InListPrice() {
        return rpt3InListPrice;
    }

    /**
     * Sets the value of the rpt3InListPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3InListPrice(BigDecimal value) {
        this.rpt3InListPrice = value;
    }

    /**
     * Gets the value of the rpt3InMiscCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3InMiscCharges() {
        return rpt3InMiscCharges;
    }

    /**
     * Sets the value of the rpt3InMiscCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3InMiscCharges(BigDecimal value) {
        this.rpt3InMiscCharges = value;
    }

    /**
     * Gets the value of the rpt3InOrdBasedPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3InOrdBasedPrice() {
        return rpt3InOrdBasedPrice;
    }

    /**
     * Sets the value of the rpt3InOrdBasedPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3InOrdBasedPrice(BigDecimal value) {
        this.rpt3InOrdBasedPrice = value;
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
     * Gets the value of the rpt3LessDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3LessDiscount() {
        return rpt3LessDiscount;
    }

    /**
     * Sets the value of the rpt3LessDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3LessDiscount(BigDecimal value) {
        this.rpt3LessDiscount = value;
    }

    /**
     * Gets the value of the rpt3ListPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3ListPrice() {
        return rpt3ListPrice;
    }

    /**
     * Sets the value of the rpt3ListPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3ListPrice(BigDecimal value) {
        this.rpt3ListPrice = value;
    }

    /**
     * Gets the value of the rpt3MiscCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3MiscCharges() {
        return rpt3MiscCharges;
    }

    /**
     * Sets the value of the rpt3MiscCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3MiscCharges(BigDecimal value) {
        this.rpt3MiscCharges = value;
    }

    /**
     * Gets the value of the rpt3OrdBasedPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3OrdBasedPrice() {
        return rpt3OrdBasedPrice;
    }

    /**
     * Sets the value of the rpt3OrdBasedPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3OrdBasedPrice(BigDecimal value) {
        this.rpt3OrdBasedPrice = value;
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
     * Gets the value of the rpt3TotalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3TotalPrice() {
        return rpt3TotalPrice;
    }

    /**
     * Sets the value of the rpt3TotalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3TotalPrice(BigDecimal value) {
        this.rpt3TotalPrice = value;
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
     * Gets the value of the salesCatID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesCatID() {
        return salesCatID;
    }

    /**
     * Sets the value of the salesCatID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesCatID(String value) {
        this.salesCatID = value;
    }

    /**
     * Gets the value of the salesCatIDDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesCatIDDescription() {
        return salesCatIDDescription;
    }

    /**
     * Sets the value of the salesCatIDDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesCatIDDescription(String value) {
        this.salesCatIDDescription = value;
    }

    /**
     * Gets the value of the salesRepName1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesRepName1() {
        return salesRepName1;
    }

    /**
     * Sets the value of the salesRepName1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesRepName1(String value) {
        this.salesRepName1 = value;
    }

    /**
     * Gets the value of the salesRepName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesRepName2() {
        return salesRepName2;
    }

    /**
     * Sets the value of the salesRepName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesRepName2(String value) {
        this.salesRepName2 = value;
    }

    /**
     * Gets the value of the salesRepName3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesRepName3() {
        return salesRepName3;
    }

    /**
     * Sets the value of the salesRepName3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesRepName3(String value) {
        this.salesRepName3 = value;
    }

    /**
     * Gets the value of the salesRepName4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesRepName4() {
        return salesRepName4;
    }

    /**
     * Sets the value of the salesRepName4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesRepName4(String value) {
        this.salesRepName4 = value;
    }

    /**
     * Gets the value of the salesRepName5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesRepName5() {
        return salesRepName5;
    }

    /**
     * Sets the value of the salesRepName5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesRepName5(String value) {
        this.salesRepName5 = value;
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
     * Gets the value of the schedJob property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSchedJob() {
        return schedJob;
    }

    /**
     * Sets the value of the schedJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSchedJob(Boolean value) {
        this.schedJob = value;
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
     * Gets the value of the shipComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipComment() {
        return shipComment;
    }

    /**
     * Sets the value of the shipComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipComment(String value) {
        this.shipComment = value;
    }

    /**
     * Gets the value of the shipLineComplete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShipLineComplete() {
        return shipLineComplete;
    }

    /**
     * Sets the value of the shipLineComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShipLineComplete(Boolean value) {
        this.shipLineComplete = value;
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
     * Gets the value of the shortChar06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortChar06() {
        return shortChar06;
    }

    /**
     * Sets the value of the shortChar06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortChar06(String value) {
        this.shortChar06 = value;
    }

    /**
     * Gets the value of the shortChar07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortChar07() {
        return shortChar07;
    }

    /**
     * Sets the value of the shortChar07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortChar07(String value) {
        this.shortChar07 = value;
    }

    /**
     * Gets the value of the shortChar08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortChar08() {
        return shortChar08;
    }

    /**
     * Sets the value of the shortChar08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortChar08(String value) {
        this.shortChar08 = value;
    }

    /**
     * Gets the value of the shortChar09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortChar09() {
        return shortChar09;
    }

    /**
     * Sets the value of the shortChar09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortChar09(String value) {
        this.shortChar09 = value;
    }

    /**
     * Gets the value of the shortChar10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortChar10() {
        return shortChar10;
    }

    /**
     * Sets the value of the shortChar10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortChar10(String value) {
        this.shortChar10 = value;
    }

    /**
     * Gets the value of the smartString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmartString() {
        return smartString;
    }

    /**
     * Sets the value of the smartString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmartString(String value) {
        this.smartString = value;
    }

    /**
     * Gets the value of the smartStringProcessed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSmartStringProcessed() {
        return smartStringProcessed;
    }

    /**
     * Sets the value of the smartStringProcessed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmartStringProcessed(Boolean value) {
        this.smartStringProcessed = value;
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
     * Gets the value of the tmBilling property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTMBilling() {
        return tmBilling;
    }

    /**
     * Sets the value of the tmBilling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTMBilling(Boolean value) {
        this.tmBilling = value;
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
     * Gets the value of the taxCatID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCatID() {
        return taxCatID;
    }

    /**
     * Sets the value of the taxCatID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCatID(String value) {
        this.taxCatID = value;
    }

    /**
     * Gets the value of the taxCatIDDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCatIDDescription() {
        return taxCatIDDescription;
    }

    /**
     * Sets the value of the taxCatIDDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCatIDDescription(String value) {
        this.taxCatIDDescription = value;
    }

    /**
     * Gets the value of the thisOrderInvtyQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getThisOrderInvtyQty() {
        return thisOrderInvtyQty;
    }

    /**
     * Sets the value of the thisOrderInvtyQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setThisOrderInvtyQty(BigDecimal value) {
        this.thisOrderInvtyQty = value;
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPrice(BigDecimal value) {
        this.totalPrice = value;
    }

    /**
     * Gets the value of the totalReleases property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalReleases() {
        return totalReleases;
    }

    /**
     * Sets the value of the totalReleases property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalReleases(Integer value) {
        this.totalReleases = value;
    }

    /**
     * Gets the value of the totalShipped property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalShipped() {
        return totalShipped;
    }

    /**
     * Sets the value of the totalShipped property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalShipped(BigDecimal value) {
        this.totalShipped = value;
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
     * Gets the value of the voidLine property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVoidLine() {
        return voidLine;
    }

    /**
     * Sets the value of the voidLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVoidLine(Boolean value) {
        this.voidLine = value;
    }

    /**
     * Gets the value of the warehouseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarehouseCode() {
        return warehouseCode;
    }

    /**
     * Sets the value of the warehouseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarehouseCode(String value) {
        this.warehouseCode = value;
    }

    /**
     * Gets the value of the warehouseDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarehouseDesc() {
        return warehouseDesc;
    }

    /**
     * Sets the value of the warehouseDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarehouseDesc(String value) {
        this.warehouseDesc = value;
    }

    /**
     * Gets the value of the warranty property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWarranty() {
        return warranty;
    }

    /**
     * Sets the value of the warranty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWarranty(Boolean value) {
        this.warranty = value;
    }

    /**
     * Gets the value of the warrantyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantyCode() {
        return warrantyCode;
    }

    /**
     * Sets the value of the warrantyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantyCode(String value) {
        this.warrantyCode = value;
    }

    /**
     * Gets the value of the warrantyCodeWarrDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantyCodeWarrDescription() {
        return warrantyCodeWarrDescription;
    }

    /**
     * Sets the value of the warrantyCodeWarrDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantyCodeWarrDescription(String value) {
        this.warrantyCodeWarrDescription = value;
    }

    /**
     * Gets the value of the warrantyComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantyComment() {
        return warrantyComment;
    }

    /**
     * Sets the value of the warrantyComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantyComment(String value) {
        this.warrantyComment = value;
    }

    /**
     * Gets the value of the xPartNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXPartNum() {
        return xPartNum;
    }

    /**
     * Sets the value of the xPartNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXPartNum(String value) {
        this.xPartNum = value;
    }

    /**
     * Gets the value of the xRevisionNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXRevisionNum() {
        return xRevisionNum;
    }

    /**
     * Sets the value of the xRevisionNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXRevisionNum(String value) {
        this.xRevisionNum = value;
    }

}
