
package org.datacontract.schemas._2004._07.epicor_mfg;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UpdExtSalesOrderDataSetTypeOrderHed complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdExtSalesOrderDataSetTypeOrderHed">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ARLOCID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AVSAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AVSZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AckEmailSent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AddlHdlgFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AllocPriorityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApplyChrg" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ApplyOrderBasedDisc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AutoOrderBasedDisc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AutoPrintReady" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AvailBTCustList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BTAddressList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BTConNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BTContactEMailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BTContactFaxNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BTContactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BTContactPhoneNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BTCustID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BTCustNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BTCustNumBTName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BTCustNumCustID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BTCustNumName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BaseCurrSymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BaseCurrencyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillToCustomerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BitFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CCAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CCApprovalNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CCCSCID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CCCSCIDToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CCDocAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CCDocFreight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CCDocTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CCDocTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CCFreight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CCResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CCRounding" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CCStreetAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CCTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CCTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CCTranID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CCTranType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CCZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COD" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CODAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CODCheck" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CODFreight" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CSCResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CanChangeTaxLiab" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CancelAfterDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CardID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardMemberName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardStore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardmemberReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CertOfOrigin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
 *         &lt;element name="ChrgAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CommercialInvoice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CounterSale" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CreateInvoice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CreatePackingSlip" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CreditCardOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CreditOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CreditOverrideDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreditOverrideLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CreditOverrideTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditOverrideUserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCodeCurrDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCodeCurrName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCodeCurrSymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCodeCurrencyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCodeDocumentDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencySwitch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CustAllowOTS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CustNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CustOnCreditHold" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CustTradePartnerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerAllowShipTo3" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CustomerBTName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerCustID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerPrintAck" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CustomerRequiresPO" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
 *         &lt;element name="DeclaredAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DeclaredIns" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DeliveryConf" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DeliveryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DemandContract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DemandContractNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DemandHeadSeq" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DemandProcessDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DemandProcessTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DemandRejected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DepositBal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DiscountPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DispatchReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DispatchReasonCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DoNotShipAfterDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DoNotShipBeforeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DocCCRounding" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocDepositBal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocInTotalCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocInTotalDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocInTotalMisc" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DocOrderAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocRounding" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocTotalAdvBill" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocTotalCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocTotalComm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocTotalDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocTotalMisc" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocTotalNet" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocTotalOrder" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocTotalSATax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocTotalTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocTotalWHTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DropShip" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EDIAck" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EDIOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EDIReady" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ERSOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ERSOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EnableJobWizard" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EnableSoldToID" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EntryMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntryPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntryProcess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExchangeRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ExpirationMonth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ExpirationYear" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ExtCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FFAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FFAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FFAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FFCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FFCompName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FFContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FFCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FFCountryNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FFID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FFPhoneNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FFState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FFZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FOBDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroundType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HDCaseNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HasMiscCharges" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasOrderLines" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Hazmat" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HoldSetByDemand" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ICPONum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InPrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InTotalCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="InTotalDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="InTotalMisc" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="IndividualPackIDs" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IntrntlShip" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InvCurrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvCurrCurrDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvcOrderCmp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InvoiceComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LOCHold" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastBatchNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastScheduleNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastTCtrlNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LegalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LetterOfInstr" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LinkMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Linked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LockQty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LockRate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NeedByDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="NonStdPkg" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NotifyEMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NotifyFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
 *         &lt;element name="OTSAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OTSAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OTSAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OTSCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OTSCntryDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OTSContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OTSCountryNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OTSCustSaved" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OTSFaxNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OTSName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OTSPhoneNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OTSResaleID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OTSSaveAs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OTSSaveCustID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OTSSaved" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OTSShipToNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OTSState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OTSTaxRegionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OTSZIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OpenOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrderAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OrderComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="OrderHeld" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrderNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OrderStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OurBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OurBankBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OurBankDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutboundSalesDocCtr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OutboundShipDocsCtr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OverrideCarrier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OverrideService" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PONum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PSCurrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PSCurrCurrDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentCustNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PayAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayBTAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayBTAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayBTAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayBTCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayBTCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayBTCountryNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PayBTPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayBTState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayBTZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PickListComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrcConNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ProFormaInvComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProcessCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RateGrpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RateGrpDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReadyToCalc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RefNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferencePNRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="ResDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReservePriDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReservePriorityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rounding" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RowIdent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RowMod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rpt1CCAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1CCFreight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1CCRounding" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1CCTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1CCTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1DepositBal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1InTotalCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1InTotalDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1InTotalMisc" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1OrderAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1Rounding" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1TotalAdvBill" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1TotalCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1TotalComm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1TotalDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1TotalMisc" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1TotalNet" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1TotalSATax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1TotalTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1TotalWHTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2CCAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2CCFreight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2CCRounding" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2CCTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2CCTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2DepositBal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2InTotalCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2InTotalDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2InTotalMisc" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2OrderAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2Rounding" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2TotalAdvBill" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2TotalCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2TotalComm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2TotalDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2TotalMisc" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2TotalNet" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2TotalSATax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2TotalTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2TotalWHTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3CCAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3CCFreight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3CCRounding" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3CCTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3CCTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3DepositBal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3InTotalCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3InTotalDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3InTotalMisc" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3OrderAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3Rounding" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3TotalAdvBill" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3TotalCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3TotalComm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3TotalDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3TotalMisc" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3TotalNet" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3TotalSATax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3TotalTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3TotalWHTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SRCommAmt1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SRCommAmt2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SRCommAmt3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SRCommAmt4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SRCommAmt5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SRCommableAmt1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SRCommableAmt2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SRCommableAmt3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SRCommableAmt4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SRCommableAmt5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SalesRepCode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesRepCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesRepCode3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesRepCode4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesRepCode5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesRepList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesRepName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesRepName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesRepName3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesRepName4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesRepName5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SatDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SatPickup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ServAlert" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ServAuthNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ServHomeDel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ServInstruct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServRef1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServRef2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServRef3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServRef4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServRef5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServRelease" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ServSignature" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShipComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipExprtDeclartn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShipOrderComplete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShipToAddressList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToContactEMailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToContactFaxNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToContactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToContactPhoneNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToCustId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToCustNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ShipToNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipViaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipViaCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipViaCodeWebDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="ShowApplyOrderDiscountsControl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShpConNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SndAlrtShp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SoldToAddressList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SoldToContactEMailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SoldToContactFaxNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SoldToContactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SoldToContactPhoneNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SysRevID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SysRowID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxPoint" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TaxRateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TaxRegionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxRegionCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TermsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TermsCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalAdvBill" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalComm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalCommLines" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalInvoiced" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalLines" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalMisc" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalNet" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalOrder" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalRelDates" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalReleases" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalSATax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalShipped" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalWHTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TranDocTypeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UPSQVMemo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UPSQVShipFromName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UPSQuantumView" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UpdateDtlAndRelRecords" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UseOTS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserChar2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserChar3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserChar4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserDate1" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="UserDate2" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="UserDate3" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="UserDate4" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="UserDecimal1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="UserDecimal2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="UserInteger1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UserInteger2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="VoidOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WebEntryPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WebOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="XRefContractDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="XRefContractNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dspBTCustID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdExtSalesOrderDataSetTypeOrderHed", propOrder = {
    "arlocid",
    "avsAddr",
    "avsZip",
    "ackEmailSent",
    "addlHdlgFlag",
    "allocPriorityCode",
    "applyChrg",
    "applyOrderBasedDisc",
    "autoOrderBasedDisc",
    "autoPrintReady",
    "availBTCustList",
    "btAddressList",
    "btConNum",
    "btContactEMailAddress",
    "btContactFaxNum",
    "btContactName",
    "btContactPhoneNum",
    "btCustID",
    "btCustNum",
    "btCustNumBTName",
    "btCustNumCustID",
    "btCustNumName",
    "baseCurrSymbol",
    "baseCurrencyID",
    "billToCustomerName",
    "bitFlag",
    "ccAmount",
    "ccApprovalNum",
    "cccscid",
    "cccscidToken",
    "ccDocAmount",
    "ccDocFreight",
    "ccDocTax",
    "ccDocTotal",
    "ccFreight",
    "ccResponse",
    "ccRounding",
    "ccStreetAddr",
    "ccTax",
    "ccTotal",
    "ccTranID",
    "ccTranType",
    "ccZip",
    "cod",
    "codAmount",
    "codCheck",
    "codFreight",
    "cscResult",
    "canChangeTaxLiab",
    "cancelAfterDate",
    "cardID",
    "cardMemberName",
    "cardNumber",
    "cardStore",
    "cardType",
    "cardTypeDescription",
    "cardmemberReference",
    "certOfOrigin",
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
    "chrgAmount",
    "commercialInvoice",
    "company",
    "counterSale",
    "createInvoice",
    "createPackingSlip",
    "creditCardOrder",
    "creditOverride",
    "creditOverrideDate",
    "creditOverrideLimit",
    "creditOverrideTime",
    "creditOverrideUserID",
    "currencyCode",
    "currencyCodeCurrDesc",
    "currencyCodeCurrName",
    "currencyCodeCurrSymbol",
    "currencyCodeCurrencyID",
    "currencyCodeDocumentDesc",
    "currencySwitch",
    "custAllowOTS",
    "custNum",
    "custOnCreditHold",
    "custTradePartnerName",
    "customerAllowShipTo3",
    "customerBTName",
    "customerCustID",
    "customerName",
    "customerPrintAck",
    "customerRequiresPO",
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
    "declaredAmt",
    "declaredIns",
    "deliveryConf",
    "deliveryType",
    "demandContract",
    "demandContractNum",
    "demandHeadSeq",
    "demandProcessDate",
    "demandProcessTime",
    "demandRejected",
    "depositBal",
    "discountPercent",
    "dispatchReason",
    "dispatchReasonCodeDescription",
    "doNotShipAfterDate",
    "doNotShipBeforeDate",
    "docCCRounding",
    "docDepositBal",
    "docInTotalCharges",
    "docInTotalDiscount",
    "docInTotalMisc",
    "docOnly",
    "docOrderAmt",
    "docRounding",
    "docTotalAdvBill",
    "docTotalCharges",
    "docTotalComm",
    "docTotalDiscount",
    "docTotalMisc",
    "docTotalNet",
    "docTotalOrder",
    "docTotalSATax",
    "docTotalTax",
    "docTotalWHTax",
    "dropShip",
    "ediAck",
    "ediOrder",
    "ediReady",
    "ersOrder",
    "ersOverride",
    "enableJobWizard",
    "enableSoldToID",
    "entryMethod",
    "entryPerson",
    "entryProcess",
    "exchangeRate",
    "expirationMonth",
    "expirationYear",
    "extCompany",
    "ffAddress1",
    "ffAddress2",
    "ffAddress3",
    "ffCity",
    "ffCompName",
    "ffContact",
    "ffCountry",
    "ffCountryNum",
    "ffid",
    "ffPhoneNum",
    "ffState",
    "ffZip",
    "fob",
    "fobDescription",
    "groundType",
    "hdCaseNum",
    "hasMiscCharges",
    "hasOrderLines",
    "hazmat",
    "holdSetByDemand",
    "icpoNum",
    "inPrice",
    "inTotalCharges",
    "inTotalDiscount",
    "inTotalMisc",
    "individualPackIDs",
    "intrntlShip",
    "invCurrCode",
    "invCurrCurrDesc",
    "invcOrderCmp",
    "invoiceComment",
    "locHold",
    "lastBatchNum",
    "lastScheduleNumber",
    "lastTCtrlNum",
    "legalNumber",
    "letterOfInstr",
    "linkMsg",
    "linked",
    "lockQty",
    "lockRate",
    "needByDate",
    "nonStdPkg",
    "notifyEMail",
    "notifyFlag",
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
    "otsAddress1",
    "otsAddress2",
    "otsAddress3",
    "otsCity",
    "otsCntryDescription",
    "otsContact",
    "otsCountryNum",
    "otsCustSaved",
    "otsFaxNum",
    "otsName",
    "otsPhoneNum",
    "otsResaleID",
    "otsSaveAs",
    "otsSaveCustID",
    "otsSaved",
    "otsShipToNum",
    "otsState",
    "otsTaxRegionCode",
    "otszip",
    "openOrder",
    "orderAmt",
    "orderComment",
    "orderDate",
    "orderHeld",
    "orderNum",
    "orderStatus",
    "ourBank",
    "ourBankBankName",
    "ourBankDescription",
    "outboundSalesDocCtr",
    "outboundShipDocsCtr",
    "overrideCarrier",
    "overrideService",
    "poNum",
    "psCurrCode",
    "psCurrCurrDesc",
    "parentCustNum",
    "payAccount",
    "payBTAddress1",
    "payBTAddress2",
    "payBTAddress3",
    "payBTCity",
    "payBTCountry",
    "payBTCountryNum",
    "payBTPhone",
    "payBTState",
    "payBTZip",
    "payFlag",
    "pickListComment",
    "prcConNum",
    "proFormaInvComment",
    "processCard",
    "rateGrpCode",
    "rateGrpDescription",
    "readyToCalc",
    "refNotes",
    "referencePNRef",
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
    "resDelivery",
    "reservePriDescription",
    "reservePriorityCode",
    "rounding",
    "rowIdent",
    "rowMod",
    "rpt1CCAmount",
    "rpt1CCFreight",
    "rpt1CCRounding",
    "rpt1CCTax",
    "rpt1CCTotal",
    "rpt1DepositBal",
    "rpt1InTotalCharges",
    "rpt1InTotalDiscount",
    "rpt1InTotalMisc",
    "rpt1OrderAmt",
    "rpt1Rounding",
    "rpt1TotalAdvBill",
    "rpt1TotalCharges",
    "rpt1TotalComm",
    "rpt1TotalDiscount",
    "rpt1TotalMisc",
    "rpt1TotalNet",
    "rpt1TotalSATax",
    "rpt1TotalTax",
    "rpt1TotalWHTax",
    "rpt2CCAmount",
    "rpt2CCFreight",
    "rpt2CCRounding",
    "rpt2CCTax",
    "rpt2CCTotal",
    "rpt2DepositBal",
    "rpt2InTotalCharges",
    "rpt2InTotalDiscount",
    "rpt2InTotalMisc",
    "rpt2OrderAmt",
    "rpt2Rounding",
    "rpt2TotalAdvBill",
    "rpt2TotalCharges",
    "rpt2TotalComm",
    "rpt2TotalDiscount",
    "rpt2TotalMisc",
    "rpt2TotalNet",
    "rpt2TotalSATax",
    "rpt2TotalTax",
    "rpt2TotalWHTax",
    "rpt3CCAmount",
    "rpt3CCFreight",
    "rpt3CCRounding",
    "rpt3CCTax",
    "rpt3CCTotal",
    "rpt3DepositBal",
    "rpt3InTotalCharges",
    "rpt3InTotalDiscount",
    "rpt3InTotalMisc",
    "rpt3OrderAmt",
    "rpt3Rounding",
    "rpt3TotalAdvBill",
    "rpt3TotalCharges",
    "rpt3TotalComm",
    "rpt3TotalDiscount",
    "rpt3TotalMisc",
    "rpt3TotalNet",
    "rpt3TotalSATax",
    "rpt3TotalTax",
    "rpt3TotalWHTax",
    "srCommAmt1",
    "srCommAmt2",
    "srCommAmt3",
    "srCommAmt4",
    "srCommAmt5",
    "srCommableAmt1",
    "srCommableAmt2",
    "srCommableAmt3",
    "srCommableAmt4",
    "srCommableAmt5",
    "salesRepCode1",
    "salesRepCode2",
    "salesRepCode3",
    "salesRepCode4",
    "salesRepCode5",
    "salesRepList",
    "salesRepName1",
    "salesRepName2",
    "salesRepName3",
    "salesRepName4",
    "salesRepName5",
    "satDelivery",
    "satPickup",
    "servAlert",
    "servAuthNum",
    "servDeliveryDate",
    "servHomeDel",
    "servInstruct",
    "servPhone",
    "servRef1",
    "servRef2",
    "servRef3",
    "servRef4",
    "servRef5",
    "servRelease",
    "servSignature",
    "shipComment",
    "shipExprtDeclartn",
    "shipOrderComplete",
    "shipToAddressList",
    "shipToContactEMailAddress",
    "shipToContactFaxNum",
    "shipToContactName",
    "shipToContactPhoneNum",
    "shipToCustId",
    "shipToCustNum",
    "shipToNum",
    "shipViaCode",
    "shipViaCodeDescription",
    "shipViaCodeWebDesc",
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
    "showApplyOrderDiscountsControl",
    "shpConNum",
    "sndAlrtShp",
    "soldToAddressList",
    "soldToContactEMailAddress",
    "soldToContactFaxNum",
    "soldToContactName",
    "soldToContactPhoneNum",
    "sysRevID",
    "sysRowID",
    "taxPoint",
    "taxRateDate",
    "taxRegionCode",
    "taxRegionCodeDescription",
    "termsCode",
    "termsCodeDescription",
    "totalAdvBill",
    "totalCharges",
    "totalComm",
    "totalCommLines",
    "totalDiscount",
    "totalInvoiced",
    "totalLines",
    "totalMisc",
    "totalNet",
    "totalOrder",
    "totalRelDates",
    "totalReleases",
    "totalSATax",
    "totalShipped",
    "totalTax",
    "totalWHTax",
    "tranDocTypeID",
    "upsqvMemo",
    "upsqvShipFromName",
    "upsQuantumView",
    "updateDtlAndRelRecords",
    "useOTS",
    "userChar1",
    "userChar2",
    "userChar3",
    "userChar4",
    "userDate1",
    "userDate2",
    "userDate3",
    "userDate4",
    "userDecimal1",
    "userDecimal2",
    "userInteger1",
    "userInteger2",
    "voidOrder",
    "webEntryPerson",
    "webOrder",
    "xRefContractDate",
    "xRefContractNum",
    "dspBTCustID"
})
public class UpdExtSalesOrderDataSetTypeOrderHed {

    @XmlElement(name = "ARLOCID", nillable = true)
    protected String arlocid;
    @XmlElement(name = "AVSAddr", nillable = true)
    protected String avsAddr;
    @XmlElement(name = "AVSZip", nillable = true)
    protected String avsZip;
    @XmlElement(name = "AckEmailSent", nillable = true)
    protected Boolean ackEmailSent;
    @XmlElement(name = "AddlHdlgFlag", nillable = true)
    protected Boolean addlHdlgFlag;
    @XmlElement(name = "AllocPriorityCode", nillable = true)
    protected String allocPriorityCode;
    @XmlElement(name = "ApplyChrg", nillable = true)
    protected Boolean applyChrg;
    @XmlElement(name = "ApplyOrderBasedDisc", nillable = true)
    protected Boolean applyOrderBasedDisc;
    @XmlElement(name = "AutoOrderBasedDisc", nillable = true)
    protected Boolean autoOrderBasedDisc;
    @XmlElement(name = "AutoPrintReady", nillable = true)
    protected Boolean autoPrintReady;
    @XmlElement(name = "AvailBTCustList", nillable = true)
    protected String availBTCustList;
    @XmlElement(name = "BTAddressList", nillable = true)
    protected String btAddressList;
    @XmlElement(name = "BTConNum", nillable = true)
    protected Integer btConNum;
    @XmlElement(name = "BTContactEMailAddress", nillable = true)
    protected String btContactEMailAddress;
    @XmlElement(name = "BTContactFaxNum", nillable = true)
    protected String btContactFaxNum;
    @XmlElement(name = "BTContactName", nillable = true)
    protected String btContactName;
    @XmlElement(name = "BTContactPhoneNum", nillable = true)
    protected String btContactPhoneNum;
    @XmlElement(name = "BTCustID", nillable = true)
    protected String btCustID;
    @XmlElement(name = "BTCustNum", nillable = true)
    protected Integer btCustNum;
    @XmlElement(name = "BTCustNumBTName", nillable = true)
    protected String btCustNumBTName;
    @XmlElement(name = "BTCustNumCustID", nillable = true)
    protected String btCustNumCustID;
    @XmlElement(name = "BTCustNumName", nillable = true)
    protected String btCustNumName;
    @XmlElement(name = "BaseCurrSymbol", nillable = true)
    protected String baseCurrSymbol;
    @XmlElement(name = "BaseCurrencyID", nillable = true)
    protected String baseCurrencyID;
    @XmlElement(name = "BillToCustomerName", nillable = true)
    protected String billToCustomerName;
    @XmlElement(name = "BitFlag", nillable = true)
    protected Integer bitFlag;
    @XmlElement(name = "CCAmount", nillable = true)
    protected BigDecimal ccAmount;
    @XmlElement(name = "CCApprovalNum", nillable = true)
    protected String ccApprovalNum;
    @XmlElement(name = "CCCSCID", nillable = true)
    protected String cccscid;
    @XmlElement(name = "CCCSCIDToken", nillable = true)
    protected String cccscidToken;
    @XmlElement(name = "CCDocAmount", nillable = true)
    protected BigDecimal ccDocAmount;
    @XmlElement(name = "CCDocFreight", nillable = true)
    protected BigDecimal ccDocFreight;
    @XmlElement(name = "CCDocTax", nillable = true)
    protected BigDecimal ccDocTax;
    @XmlElement(name = "CCDocTotal", nillable = true)
    protected BigDecimal ccDocTotal;
    @XmlElement(name = "CCFreight", nillable = true)
    protected BigDecimal ccFreight;
    @XmlElement(name = "CCResponse", nillable = true)
    protected String ccResponse;
    @XmlElement(name = "CCRounding", nillable = true)
    protected BigDecimal ccRounding;
    @XmlElement(name = "CCStreetAddr", nillable = true)
    protected String ccStreetAddr;
    @XmlElement(name = "CCTax", nillable = true)
    protected BigDecimal ccTax;
    @XmlElement(name = "CCTotal", nillable = true)
    protected BigDecimal ccTotal;
    @XmlElement(name = "CCTranID", nillable = true)
    protected String ccTranID;
    @XmlElement(name = "CCTranType", nillable = true)
    protected String ccTranType;
    @XmlElement(name = "CCZip", nillable = true)
    protected String ccZip;
    @XmlElement(name = "COD", nillable = true)
    protected Boolean cod;
    @XmlElement(name = "CODAmount", nillable = true)
    protected BigDecimal codAmount;
    @XmlElement(name = "CODCheck", nillable = true)
    protected Boolean codCheck;
    @XmlElement(name = "CODFreight", nillable = true)
    protected Boolean codFreight;
    @XmlElement(name = "CSCResult", nillable = true)
    protected String cscResult;
    @XmlElement(name = "CanChangeTaxLiab", nillable = true)
    protected Boolean canChangeTaxLiab;
    @XmlElement(name = "CancelAfterDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cancelAfterDate;
    @XmlElement(name = "CardID", nillable = true)
    protected String cardID;
    @XmlElement(name = "CardMemberName", nillable = true)
    protected String cardMemberName;
    @XmlElement(name = "CardNumber", nillable = true)
    protected String cardNumber;
    @XmlElement(name = "CardStore", nillable = true)
    protected String cardStore;
    @XmlElement(name = "CardType", nillable = true)
    protected String cardType;
    @XmlElement(name = "CardTypeDescription", nillable = true)
    protected String cardTypeDescription;
    @XmlElement(name = "CardmemberReference", nillable = true)
    protected String cardmemberReference;
    @XmlElement(name = "CertOfOrigin", nillable = true)
    protected Boolean certOfOrigin;
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
    @XmlElement(name = "ChrgAmount", nillable = true)
    protected BigDecimal chrgAmount;
    @XmlElement(name = "CommercialInvoice", nillable = true)
    protected Boolean commercialInvoice;
    @XmlElement(name = "Company", nillable = true)
    protected String company;
    @XmlElement(name = "CounterSale", nillable = true)
    protected Boolean counterSale;
    @XmlElement(name = "CreateInvoice", nillable = true)
    protected Boolean createInvoice;
    @XmlElement(name = "CreatePackingSlip", nillable = true)
    protected Boolean createPackingSlip;
    @XmlElement(name = "CreditCardOrder", nillable = true)
    protected Boolean creditCardOrder;
    @XmlElement(name = "CreditOverride", nillable = true)
    protected Boolean creditOverride;
    @XmlElement(name = "CreditOverrideDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creditOverrideDate;
    @XmlElement(name = "CreditOverrideLimit", nillable = true)
    protected BigDecimal creditOverrideLimit;
    @XmlElement(name = "CreditOverrideTime", nillable = true)
    protected String creditOverrideTime;
    @XmlElement(name = "CreditOverrideUserID", nillable = true)
    protected String creditOverrideUserID;
    @XmlElement(name = "CurrencyCode", nillable = true)
    protected String currencyCode;
    @XmlElement(name = "CurrencyCodeCurrDesc", nillable = true)
    protected String currencyCodeCurrDesc;
    @XmlElement(name = "CurrencyCodeCurrName", nillable = true)
    protected String currencyCodeCurrName;
    @XmlElement(name = "CurrencyCodeCurrSymbol", nillable = true)
    protected String currencyCodeCurrSymbol;
    @XmlElement(name = "CurrencyCodeCurrencyID", nillable = true)
    protected String currencyCodeCurrencyID;
    @XmlElement(name = "CurrencyCodeDocumentDesc", nillable = true)
    protected String currencyCodeDocumentDesc;
    @XmlElement(name = "CurrencySwitch", nillable = true)
    protected Boolean currencySwitch;
    @XmlElement(name = "CustAllowOTS", nillable = true)
    protected Boolean custAllowOTS;
    @XmlElement(name = "CustNum", nillable = true)
    protected Integer custNum;
    @XmlElement(name = "CustOnCreditHold", nillable = true)
    protected Boolean custOnCreditHold;
    @XmlElement(name = "CustTradePartnerName", nillable = true)
    protected String custTradePartnerName;
    @XmlElement(name = "CustomerAllowShipTo3", nillable = true)
    protected Boolean customerAllowShipTo3;
    @XmlElement(name = "CustomerBTName", nillable = true)
    protected String customerBTName;
    @XmlElement(name = "CustomerCustID", nillable = true)
    protected String customerCustID;
    @XmlElement(name = "CustomerName", nillable = true)
    protected String customerName;
    @XmlElement(name = "CustomerPrintAck", nillable = true)
    protected Boolean customerPrintAck;
    @XmlElement(name = "CustomerRequiresPO", nillable = true)
    protected Boolean customerRequiresPO;
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
    @XmlElement(name = "DeclaredAmt", nillable = true)
    protected BigDecimal declaredAmt;
    @XmlElement(name = "DeclaredIns", nillable = true)
    protected Boolean declaredIns;
    @XmlElement(name = "DeliveryConf", nillable = true)
    protected Integer deliveryConf;
    @XmlElement(name = "DeliveryType", nillable = true)
    protected String deliveryType;
    @XmlElement(name = "DemandContract", nillable = true)
    protected String demandContract;
    @XmlElement(name = "DemandContractNum", nillable = true)
    protected Integer demandContractNum;
    @XmlElement(name = "DemandHeadSeq", nillable = true)
    protected Integer demandHeadSeq;
    @XmlElement(name = "DemandProcessDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar demandProcessDate;
    @XmlElement(name = "DemandProcessTime", nillable = true)
    protected Integer demandProcessTime;
    @XmlElement(name = "DemandRejected", nillable = true)
    protected Boolean demandRejected;
    @XmlElement(name = "DepositBal", nillable = true)
    protected BigDecimal depositBal;
    @XmlElement(name = "DiscountPercent", nillable = true)
    protected BigDecimal discountPercent;
    @XmlElement(name = "DispatchReason", nillable = true)
    protected String dispatchReason;
    @XmlElement(name = "DispatchReasonCodeDescription", nillable = true)
    protected String dispatchReasonCodeDescription;
    @XmlElement(name = "DoNotShipAfterDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar doNotShipAfterDate;
    @XmlElement(name = "DoNotShipBeforeDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar doNotShipBeforeDate;
    @XmlElement(name = "DocCCRounding", nillable = true)
    protected BigDecimal docCCRounding;
    @XmlElement(name = "DocDepositBal", nillable = true)
    protected BigDecimal docDepositBal;
    @XmlElement(name = "DocInTotalCharges", nillable = true)
    protected BigDecimal docInTotalCharges;
    @XmlElement(name = "DocInTotalDiscount", nillable = true)
    protected BigDecimal docInTotalDiscount;
    @XmlElement(name = "DocInTotalMisc", nillable = true)
    protected BigDecimal docInTotalMisc;
    @XmlElement(name = "DocOnly", nillable = true)
    protected Boolean docOnly;
    @XmlElement(name = "DocOrderAmt", nillable = true)
    protected BigDecimal docOrderAmt;
    @XmlElement(name = "DocRounding", nillable = true)
    protected BigDecimal docRounding;
    @XmlElement(name = "DocTotalAdvBill", nillable = true)
    protected BigDecimal docTotalAdvBill;
    @XmlElement(name = "DocTotalCharges", nillable = true)
    protected BigDecimal docTotalCharges;
    @XmlElement(name = "DocTotalComm", nillable = true)
    protected BigDecimal docTotalComm;
    @XmlElement(name = "DocTotalDiscount", nillable = true)
    protected BigDecimal docTotalDiscount;
    @XmlElement(name = "DocTotalMisc", nillable = true)
    protected BigDecimal docTotalMisc;
    @XmlElement(name = "DocTotalNet", nillable = true)
    protected BigDecimal docTotalNet;
    @XmlElement(name = "DocTotalOrder", nillable = true)
    protected BigDecimal docTotalOrder;
    @XmlElement(name = "DocTotalSATax", nillable = true)
    protected BigDecimal docTotalSATax;
    @XmlElement(name = "DocTotalTax", nillable = true)
    protected BigDecimal docTotalTax;
    @XmlElement(name = "DocTotalWHTax", nillable = true)
    protected BigDecimal docTotalWHTax;
    @XmlElement(name = "DropShip", nillable = true)
    protected Boolean dropShip;
    @XmlElement(name = "EDIAck", nillable = true)
    protected Boolean ediAck;
    @XmlElement(name = "EDIOrder", nillable = true)
    protected Boolean ediOrder;
    @XmlElement(name = "EDIReady", nillable = true)
    protected Boolean ediReady;
    @XmlElement(name = "ERSOrder", nillable = true)
    protected Boolean ersOrder;
    @XmlElement(name = "ERSOverride", nillable = true)
    protected Boolean ersOverride;
    @XmlElement(name = "EnableJobWizard", nillable = true)
    protected Boolean enableJobWizard;
    @XmlElement(name = "EnableSoldToID", nillable = true)
    protected Boolean enableSoldToID;
    @XmlElement(name = "EntryMethod", nillable = true)
    protected String entryMethod;
    @XmlElement(name = "EntryPerson", nillable = true)
    protected String entryPerson;
    @XmlElement(name = "EntryProcess", nillable = true)
    protected String entryProcess;
    @XmlElement(name = "ExchangeRate", nillable = true)
    protected BigDecimal exchangeRate;
    @XmlElement(name = "ExpirationMonth", nillable = true)
    protected Integer expirationMonth;
    @XmlElement(name = "ExpirationYear", nillable = true)
    protected Integer expirationYear;
    @XmlElement(name = "ExtCompany", nillable = true)
    protected String extCompany;
    @XmlElement(name = "FFAddress1", nillable = true)
    protected String ffAddress1;
    @XmlElement(name = "FFAddress2", nillable = true)
    protected String ffAddress2;
    @XmlElement(name = "FFAddress3", nillable = true)
    protected String ffAddress3;
    @XmlElement(name = "FFCity", nillable = true)
    protected String ffCity;
    @XmlElement(name = "FFCompName", nillable = true)
    protected String ffCompName;
    @XmlElement(name = "FFContact", nillable = true)
    protected String ffContact;
    @XmlElement(name = "FFCountry", nillable = true)
    protected String ffCountry;
    @XmlElement(name = "FFCountryNum", nillable = true)
    protected Integer ffCountryNum;
    @XmlElement(name = "FFID", nillable = true)
    protected String ffid;
    @XmlElement(name = "FFPhoneNum", nillable = true)
    protected String ffPhoneNum;
    @XmlElement(name = "FFState", nillable = true)
    protected String ffState;
    @XmlElement(name = "FFZip", nillable = true)
    protected String ffZip;
    @XmlElement(name = "FOB", nillable = true)
    protected String fob;
    @XmlElement(name = "FOBDescription", nillable = true)
    protected String fobDescription;
    @XmlElement(name = "GroundType", nillable = true)
    protected String groundType;
    @XmlElement(name = "HDCaseNum", nillable = true)
    protected Integer hdCaseNum;
    @XmlElement(name = "HasMiscCharges", nillable = true)
    protected Boolean hasMiscCharges;
    @XmlElement(name = "HasOrderLines", nillable = true)
    protected Boolean hasOrderLines;
    @XmlElement(name = "Hazmat", nillable = true)
    protected Boolean hazmat;
    @XmlElement(name = "HoldSetByDemand", nillable = true)
    protected Boolean holdSetByDemand;
    @XmlElement(name = "ICPONum", nillable = true)
    protected Integer icpoNum;
    @XmlElement(name = "InPrice", nillable = true)
    protected Boolean inPrice;
    @XmlElement(name = "InTotalCharges", nillable = true)
    protected BigDecimal inTotalCharges;
    @XmlElement(name = "InTotalDiscount", nillable = true)
    protected BigDecimal inTotalDiscount;
    @XmlElement(name = "InTotalMisc", nillable = true)
    protected BigDecimal inTotalMisc;
    @XmlElement(name = "IndividualPackIDs", nillable = true)
    protected Boolean individualPackIDs;
    @XmlElement(name = "IntrntlShip", nillable = true)
    protected Boolean intrntlShip;
    @XmlElement(name = "InvCurrCode", nillable = true)
    protected String invCurrCode;
    @XmlElement(name = "InvCurrCurrDesc", nillable = true)
    protected String invCurrCurrDesc;
    @XmlElement(name = "InvcOrderCmp", nillable = true)
    protected Boolean invcOrderCmp;
    @XmlElement(name = "InvoiceComment", nillable = true)
    protected String invoiceComment;
    @XmlElement(name = "LOCHold", nillable = true)
    protected Boolean locHold;
    @XmlElement(name = "LastBatchNum", nillable = true)
    protected String lastBatchNum;
    @XmlElement(name = "LastScheduleNumber", nillable = true)
    protected String lastScheduleNumber;
    @XmlElement(name = "LastTCtrlNum", nillable = true)
    protected String lastTCtrlNum;
    @XmlElement(name = "LegalNumber", nillable = true)
    protected String legalNumber;
    @XmlElement(name = "LetterOfInstr", nillable = true)
    protected Boolean letterOfInstr;
    @XmlElement(name = "LinkMsg", nillable = true)
    protected String linkMsg;
    @XmlElement(name = "Linked", nillable = true)
    protected Boolean linked;
    @XmlElement(name = "LockQty", nillable = true)
    protected Boolean lockQty;
    @XmlElement(name = "LockRate", nillable = true)
    protected Boolean lockRate;
    @XmlElement(name = "NeedByDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar needByDate;
    @XmlElement(name = "NonStdPkg", nillable = true)
    protected Boolean nonStdPkg;
    @XmlElement(name = "NotifyEMail", nillable = true)
    protected String notifyEMail;
    @XmlElement(name = "NotifyFlag", nillable = true)
    protected Boolean notifyFlag;
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
    @XmlElement(name = "OTSAddress1", nillable = true)
    protected String otsAddress1;
    @XmlElement(name = "OTSAddress2", nillable = true)
    protected String otsAddress2;
    @XmlElement(name = "OTSAddress3", nillable = true)
    protected String otsAddress3;
    @XmlElement(name = "OTSCity", nillable = true)
    protected String otsCity;
    @XmlElement(name = "OTSCntryDescription", nillable = true)
    protected String otsCntryDescription;
    @XmlElement(name = "OTSContact", nillable = true)
    protected String otsContact;
    @XmlElement(name = "OTSCountryNum", nillable = true)
    protected Integer otsCountryNum;
    @XmlElement(name = "OTSCustSaved", nillable = true)
    protected Boolean otsCustSaved;
    @XmlElement(name = "OTSFaxNum", nillable = true)
    protected String otsFaxNum;
    @XmlElement(name = "OTSName", nillable = true)
    protected String otsName;
    @XmlElement(name = "OTSPhoneNum", nillable = true)
    protected String otsPhoneNum;
    @XmlElement(name = "OTSResaleID", nillable = true)
    protected String otsResaleID;
    @XmlElement(name = "OTSSaveAs", nillable = true)
    protected String otsSaveAs;
    @XmlElement(name = "OTSSaveCustID", nillable = true)
    protected String otsSaveCustID;
    @XmlElement(name = "OTSSaved", nillable = true)
    protected Boolean otsSaved;
    @XmlElement(name = "OTSShipToNum", nillable = true)
    protected String otsShipToNum;
    @XmlElement(name = "OTSState", nillable = true)
    protected String otsState;
    @XmlElement(name = "OTSTaxRegionCode", nillable = true)
    protected String otsTaxRegionCode;
    @XmlElement(name = "OTSZIP", nillable = true)
    protected String otszip;
    @XmlElement(name = "OpenOrder", nillable = true)
    protected Boolean openOrder;
    @XmlElement(name = "OrderAmt", nillable = true)
    protected BigDecimal orderAmt;
    @XmlElement(name = "OrderComment", nillable = true)
    protected String orderComment;
    @XmlElement(name = "OrderDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderDate;
    @XmlElement(name = "OrderHeld", nillable = true)
    protected Boolean orderHeld;
    @XmlElement(name = "OrderNum", nillable = true)
    protected Integer orderNum;
    @XmlElement(name = "OrderStatus", nillable = true)
    protected String orderStatus;
    @XmlElement(name = "OurBank", nillable = true)
    protected String ourBank;
    @XmlElement(name = "OurBankBankName", nillable = true)
    protected String ourBankBankName;
    @XmlElement(name = "OurBankDescription", nillable = true)
    protected String ourBankDescription;
    @XmlElement(name = "OutboundSalesDocCtr", nillable = true)
    protected Integer outboundSalesDocCtr;
    @XmlElement(name = "OutboundShipDocsCtr", nillable = true)
    protected Integer outboundShipDocsCtr;
    @XmlElement(name = "OverrideCarrier", nillable = true)
    protected Boolean overrideCarrier;
    @XmlElement(name = "OverrideService", nillable = true)
    protected Boolean overrideService;
    @XmlElement(name = "PONum", nillable = true)
    protected String poNum;
    @XmlElement(name = "PSCurrCode", nillable = true)
    protected String psCurrCode;
    @XmlElement(name = "PSCurrCurrDesc", nillable = true)
    protected String psCurrCurrDesc;
    @XmlElement(name = "ParentCustNum", nillable = true)
    protected Integer parentCustNum;
    @XmlElement(name = "PayAccount", nillable = true)
    protected String payAccount;
    @XmlElement(name = "PayBTAddress1", nillable = true)
    protected String payBTAddress1;
    @XmlElement(name = "PayBTAddress2", nillable = true)
    protected String payBTAddress2;
    @XmlElement(name = "PayBTAddress3", nillable = true)
    protected String payBTAddress3;
    @XmlElement(name = "PayBTCity", nillable = true)
    protected String payBTCity;
    @XmlElement(name = "PayBTCountry", nillable = true)
    protected String payBTCountry;
    @XmlElement(name = "PayBTCountryNum", nillable = true)
    protected Integer payBTCountryNum;
    @XmlElement(name = "PayBTPhone", nillable = true)
    protected String payBTPhone;
    @XmlElement(name = "PayBTState", nillable = true)
    protected String payBTState;
    @XmlElement(name = "PayBTZip", nillable = true)
    protected String payBTZip;
    @XmlElement(name = "PayFlag", nillable = true)
    protected String payFlag;
    @XmlElement(name = "PickListComment", nillable = true)
    protected String pickListComment;
    @XmlElement(name = "PrcConNum", nillable = true)
    protected Integer prcConNum;
    @XmlElement(name = "ProFormaInvComment", nillable = true)
    protected String proFormaInvComment;
    @XmlElement(name = "ProcessCard", nillable = true)
    protected String processCard;
    @XmlElement(name = "RateGrpCode", nillable = true)
    protected String rateGrpCode;
    @XmlElement(name = "RateGrpDescription", nillable = true)
    protected String rateGrpDescription;
    @XmlElement(name = "ReadyToCalc", nillable = true)
    protected Boolean readyToCalc;
    @XmlElement(name = "RefNotes", nillable = true)
    protected String refNotes;
    @XmlElement(name = "ReferencePNRef", nillable = true)
    protected String referencePNRef;
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
    @XmlElement(name = "ResDelivery", nillable = true)
    protected Boolean resDelivery;
    @XmlElement(name = "ReservePriDescription", nillable = true)
    protected String reservePriDescription;
    @XmlElement(name = "ReservePriorityCode", nillable = true)
    protected String reservePriorityCode;
    @XmlElement(name = "Rounding", nillable = true)
    protected BigDecimal rounding;
    @XmlElement(name = "RowIdent", nillable = true)
    protected String rowIdent;
    @XmlElement(name = "RowMod", nillable = true)
    protected String rowMod;
    @XmlElement(name = "Rpt1CCAmount", nillable = true)
    protected BigDecimal rpt1CCAmount;
    @XmlElement(name = "Rpt1CCFreight", nillable = true)
    protected BigDecimal rpt1CCFreight;
    @XmlElement(name = "Rpt1CCRounding", nillable = true)
    protected BigDecimal rpt1CCRounding;
    @XmlElement(name = "Rpt1CCTax", nillable = true)
    protected BigDecimal rpt1CCTax;
    @XmlElement(name = "Rpt1CCTotal", nillable = true)
    protected BigDecimal rpt1CCTotal;
    @XmlElement(name = "Rpt1DepositBal", nillable = true)
    protected BigDecimal rpt1DepositBal;
    @XmlElement(name = "Rpt1InTotalCharges", nillable = true)
    protected BigDecimal rpt1InTotalCharges;
    @XmlElement(name = "Rpt1InTotalDiscount", nillable = true)
    protected BigDecimal rpt1InTotalDiscount;
    @XmlElement(name = "Rpt1InTotalMisc", nillable = true)
    protected BigDecimal rpt1InTotalMisc;
    @XmlElement(name = "Rpt1OrderAmt", nillable = true)
    protected BigDecimal rpt1OrderAmt;
    @XmlElement(name = "Rpt1Rounding", nillable = true)
    protected BigDecimal rpt1Rounding;
    @XmlElement(name = "Rpt1TotalAdvBill", nillable = true)
    protected BigDecimal rpt1TotalAdvBill;
    @XmlElement(name = "Rpt1TotalCharges", nillable = true)
    protected BigDecimal rpt1TotalCharges;
    @XmlElement(name = "Rpt1TotalComm", nillable = true)
    protected BigDecimal rpt1TotalComm;
    @XmlElement(name = "Rpt1TotalDiscount", nillable = true)
    protected BigDecimal rpt1TotalDiscount;
    @XmlElement(name = "Rpt1TotalMisc", nillable = true)
    protected BigDecimal rpt1TotalMisc;
    @XmlElement(name = "Rpt1TotalNet", nillable = true)
    protected BigDecimal rpt1TotalNet;
    @XmlElement(name = "Rpt1TotalSATax", nillable = true)
    protected BigDecimal rpt1TotalSATax;
    @XmlElement(name = "Rpt1TotalTax", nillable = true)
    protected BigDecimal rpt1TotalTax;
    @XmlElement(name = "Rpt1TotalWHTax", nillable = true)
    protected BigDecimal rpt1TotalWHTax;
    @XmlElement(name = "Rpt2CCAmount", nillable = true)
    protected BigDecimal rpt2CCAmount;
    @XmlElement(name = "Rpt2CCFreight", nillable = true)
    protected BigDecimal rpt2CCFreight;
    @XmlElement(name = "Rpt2CCRounding", nillable = true)
    protected BigDecimal rpt2CCRounding;
    @XmlElement(name = "Rpt2CCTax", nillable = true)
    protected BigDecimal rpt2CCTax;
    @XmlElement(name = "Rpt2CCTotal", nillable = true)
    protected BigDecimal rpt2CCTotal;
    @XmlElement(name = "Rpt2DepositBal", nillable = true)
    protected BigDecimal rpt2DepositBal;
    @XmlElement(name = "Rpt2InTotalCharges", nillable = true)
    protected BigDecimal rpt2InTotalCharges;
    @XmlElement(name = "Rpt2InTotalDiscount", nillable = true)
    protected BigDecimal rpt2InTotalDiscount;
    @XmlElement(name = "Rpt2InTotalMisc", nillable = true)
    protected BigDecimal rpt2InTotalMisc;
    @XmlElement(name = "Rpt2OrderAmt", nillable = true)
    protected BigDecimal rpt2OrderAmt;
    @XmlElement(name = "Rpt2Rounding", nillable = true)
    protected BigDecimal rpt2Rounding;
    @XmlElement(name = "Rpt2TotalAdvBill", nillable = true)
    protected BigDecimal rpt2TotalAdvBill;
    @XmlElement(name = "Rpt2TotalCharges", nillable = true)
    protected BigDecimal rpt2TotalCharges;
    @XmlElement(name = "Rpt2TotalComm", nillable = true)
    protected BigDecimal rpt2TotalComm;
    @XmlElement(name = "Rpt2TotalDiscount", nillable = true)
    protected BigDecimal rpt2TotalDiscount;
    @XmlElement(name = "Rpt2TotalMisc", nillable = true)
    protected BigDecimal rpt2TotalMisc;
    @XmlElement(name = "Rpt2TotalNet", nillable = true)
    protected BigDecimal rpt2TotalNet;
    @XmlElement(name = "Rpt2TotalSATax", nillable = true)
    protected BigDecimal rpt2TotalSATax;
    @XmlElement(name = "Rpt2TotalTax", nillable = true)
    protected BigDecimal rpt2TotalTax;
    @XmlElement(name = "Rpt2TotalWHTax", nillable = true)
    protected BigDecimal rpt2TotalWHTax;
    @XmlElement(name = "Rpt3CCAmount", nillable = true)
    protected BigDecimal rpt3CCAmount;
    @XmlElement(name = "Rpt3CCFreight", nillable = true)
    protected BigDecimal rpt3CCFreight;
    @XmlElement(name = "Rpt3CCRounding", nillable = true)
    protected BigDecimal rpt3CCRounding;
    @XmlElement(name = "Rpt3CCTax", nillable = true)
    protected BigDecimal rpt3CCTax;
    @XmlElement(name = "Rpt3CCTotal", nillable = true)
    protected BigDecimal rpt3CCTotal;
    @XmlElement(name = "Rpt3DepositBal", nillable = true)
    protected BigDecimal rpt3DepositBal;
    @XmlElement(name = "Rpt3InTotalCharges", nillable = true)
    protected BigDecimal rpt3InTotalCharges;
    @XmlElement(name = "Rpt3InTotalDiscount", nillable = true)
    protected BigDecimal rpt3InTotalDiscount;
    @XmlElement(name = "Rpt3InTotalMisc", nillable = true)
    protected BigDecimal rpt3InTotalMisc;
    @XmlElement(name = "Rpt3OrderAmt", nillable = true)
    protected BigDecimal rpt3OrderAmt;
    @XmlElement(name = "Rpt3Rounding", nillable = true)
    protected BigDecimal rpt3Rounding;
    @XmlElement(name = "Rpt3TotalAdvBill", nillable = true)
    protected BigDecimal rpt3TotalAdvBill;
    @XmlElement(name = "Rpt3TotalCharges", nillable = true)
    protected BigDecimal rpt3TotalCharges;
    @XmlElement(name = "Rpt3TotalComm", nillable = true)
    protected BigDecimal rpt3TotalComm;
    @XmlElement(name = "Rpt3TotalDiscount", nillable = true)
    protected BigDecimal rpt3TotalDiscount;
    @XmlElement(name = "Rpt3TotalMisc", nillable = true)
    protected BigDecimal rpt3TotalMisc;
    @XmlElement(name = "Rpt3TotalNet", nillable = true)
    protected BigDecimal rpt3TotalNet;
    @XmlElement(name = "Rpt3TotalSATax", nillable = true)
    protected BigDecimal rpt3TotalSATax;
    @XmlElement(name = "Rpt3TotalTax", nillable = true)
    protected BigDecimal rpt3TotalTax;
    @XmlElement(name = "Rpt3TotalWHTax", nillable = true)
    protected BigDecimal rpt3TotalWHTax;
    @XmlElement(name = "SRCommAmt1", nillable = true)
    protected BigDecimal srCommAmt1;
    @XmlElement(name = "SRCommAmt2", nillable = true)
    protected BigDecimal srCommAmt2;
    @XmlElement(name = "SRCommAmt3", nillable = true)
    protected BigDecimal srCommAmt3;
    @XmlElement(name = "SRCommAmt4", nillable = true)
    protected BigDecimal srCommAmt4;
    @XmlElement(name = "SRCommAmt5", nillable = true)
    protected BigDecimal srCommAmt5;
    @XmlElement(name = "SRCommableAmt1", nillable = true)
    protected BigDecimal srCommableAmt1;
    @XmlElement(name = "SRCommableAmt2", nillable = true)
    protected BigDecimal srCommableAmt2;
    @XmlElement(name = "SRCommableAmt3", nillable = true)
    protected BigDecimal srCommableAmt3;
    @XmlElement(name = "SRCommableAmt4", nillable = true)
    protected BigDecimal srCommableAmt4;
    @XmlElement(name = "SRCommableAmt5", nillable = true)
    protected BigDecimal srCommableAmt5;
    @XmlElement(name = "SalesRepCode1", nillable = true)
    protected String salesRepCode1;
    @XmlElement(name = "SalesRepCode2", nillable = true)
    protected String salesRepCode2;
    @XmlElement(name = "SalesRepCode3", nillable = true)
    protected String salesRepCode3;
    @XmlElement(name = "SalesRepCode4", nillable = true)
    protected String salesRepCode4;
    @XmlElement(name = "SalesRepCode5", nillable = true)
    protected String salesRepCode5;
    @XmlElement(name = "SalesRepList", nillable = true)
    protected String salesRepList;
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
    @XmlElement(name = "SatDelivery", nillable = true)
    protected Boolean satDelivery;
    @XmlElement(name = "SatPickup", nillable = true)
    protected Boolean satPickup;
    @XmlElement(name = "ServAlert", nillable = true)
    protected Boolean servAlert;
    @XmlElement(name = "ServAuthNum", nillable = true)
    protected String servAuthNum;
    @XmlElement(name = "ServDeliveryDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar servDeliveryDate;
    @XmlElement(name = "ServHomeDel", nillable = true)
    protected Boolean servHomeDel;
    @XmlElement(name = "ServInstruct", nillable = true)
    protected String servInstruct;
    @XmlElement(name = "ServPhone", nillable = true)
    protected String servPhone;
    @XmlElement(name = "ServRef1", nillable = true)
    protected String servRef1;
    @XmlElement(name = "ServRef2", nillable = true)
    protected String servRef2;
    @XmlElement(name = "ServRef3", nillable = true)
    protected String servRef3;
    @XmlElement(name = "ServRef4", nillable = true)
    protected String servRef4;
    @XmlElement(name = "ServRef5", nillable = true)
    protected String servRef5;
    @XmlElement(name = "ServRelease", nillable = true)
    protected Boolean servRelease;
    @XmlElement(name = "ServSignature", nillable = true)
    protected Boolean servSignature;
    @XmlElement(name = "ShipComment", nillable = true)
    protected String shipComment;
    @XmlElement(name = "ShipExprtDeclartn", nillable = true)
    protected Boolean shipExprtDeclartn;
    @XmlElement(name = "ShipOrderComplete", nillable = true)
    protected Boolean shipOrderComplete;
    @XmlElement(name = "ShipToAddressList", nillable = true)
    protected String shipToAddressList;
    @XmlElement(name = "ShipToContactEMailAddress", nillable = true)
    protected String shipToContactEMailAddress;
    @XmlElement(name = "ShipToContactFaxNum", nillable = true)
    protected String shipToContactFaxNum;
    @XmlElement(name = "ShipToContactName", nillable = true)
    protected String shipToContactName;
    @XmlElement(name = "ShipToContactPhoneNum", nillable = true)
    protected String shipToContactPhoneNum;
    @XmlElement(name = "ShipToCustId", nillable = true)
    protected String shipToCustId;
    @XmlElement(name = "ShipToCustNum", nillable = true)
    protected Integer shipToCustNum;
    @XmlElement(name = "ShipToNum", nillable = true)
    protected String shipToNum;
    @XmlElement(name = "ShipViaCode", nillable = true)
    protected String shipViaCode;
    @XmlElement(name = "ShipViaCodeDescription", nillable = true)
    protected String shipViaCodeDescription;
    @XmlElement(name = "ShipViaCodeWebDesc", nillable = true)
    protected String shipViaCodeWebDesc;
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
    @XmlElement(name = "ShowApplyOrderDiscountsControl", nillable = true)
    protected Boolean showApplyOrderDiscountsControl;
    @XmlElement(name = "ShpConNum", nillable = true)
    protected Integer shpConNum;
    @XmlElement(name = "SndAlrtShp", nillable = true)
    protected Boolean sndAlrtShp;
    @XmlElement(name = "SoldToAddressList", nillable = true)
    protected String soldToAddressList;
    @XmlElement(name = "SoldToContactEMailAddress", nillable = true)
    protected String soldToContactEMailAddress;
    @XmlElement(name = "SoldToContactFaxNum", nillable = true)
    protected String soldToContactFaxNum;
    @XmlElement(name = "SoldToContactName", nillable = true)
    protected String soldToContactName;
    @XmlElement(name = "SoldToContactPhoneNum", nillable = true)
    protected String soldToContactPhoneNum;
    @XmlElement(name = "SysRevID", nillable = true)
    protected Integer sysRevID;
    @XmlElement(name = "SysRowID", nillable = true)
    protected String sysRowID;
    @XmlElement(name = "TaxPoint", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar taxPoint;
    @XmlElement(name = "TaxRateDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar taxRateDate;
    @XmlElement(name = "TaxRegionCode", nillable = true)
    protected String taxRegionCode;
    @XmlElement(name = "TaxRegionCodeDescription", nillable = true)
    protected String taxRegionCodeDescription;
    @XmlElement(name = "TermsCode", nillable = true)
    protected String termsCode;
    @XmlElement(name = "TermsCodeDescription", nillable = true)
    protected String termsCodeDescription;
    @XmlElement(name = "TotalAdvBill", nillable = true)
    protected BigDecimal totalAdvBill;
    @XmlElement(name = "TotalCharges", nillable = true)
    protected BigDecimal totalCharges;
    @XmlElement(name = "TotalComm", nillable = true)
    protected BigDecimal totalComm;
    @XmlElement(name = "TotalCommLines", nillable = true)
    protected Integer totalCommLines;
    @XmlElement(name = "TotalDiscount", nillable = true)
    protected BigDecimal totalDiscount;
    @XmlElement(name = "TotalInvoiced", nillable = true)
    protected BigDecimal totalInvoiced;
    @XmlElement(name = "TotalLines", nillable = true)
    protected Integer totalLines;
    @XmlElement(name = "TotalMisc", nillable = true)
    protected BigDecimal totalMisc;
    @XmlElement(name = "TotalNet", nillable = true)
    protected BigDecimal totalNet;
    @XmlElement(name = "TotalOrder", nillable = true)
    protected BigDecimal totalOrder;
    @XmlElement(name = "TotalRelDates", nillable = true)
    protected Integer totalRelDates;
    @XmlElement(name = "TotalReleases", nillable = true)
    protected Integer totalReleases;
    @XmlElement(name = "TotalSATax", nillable = true)
    protected BigDecimal totalSATax;
    @XmlElement(name = "TotalShipped", nillable = true)
    protected BigDecimal totalShipped;
    @XmlElement(name = "TotalTax", nillable = true)
    protected BigDecimal totalTax;
    @XmlElement(name = "TotalWHTax", nillable = true)
    protected BigDecimal totalWHTax;
    @XmlElement(name = "TranDocTypeID", nillable = true)
    protected String tranDocTypeID;
    @XmlElement(name = "UPSQVMemo", nillable = true)
    protected String upsqvMemo;
    @XmlElement(name = "UPSQVShipFromName", nillable = true)
    protected String upsqvShipFromName;
    @XmlElement(name = "UPSQuantumView", nillable = true)
    protected Boolean upsQuantumView;
    @XmlElement(name = "UpdateDtlAndRelRecords", nillable = true)
    protected Boolean updateDtlAndRelRecords;
    @XmlElement(name = "UseOTS", nillable = true)
    protected Boolean useOTS;
    @XmlElement(name = "UserChar1", nillable = true)
    protected String userChar1;
    @XmlElement(name = "UserChar2", nillable = true)
    protected String userChar2;
    @XmlElement(name = "UserChar3", nillable = true)
    protected String userChar3;
    @XmlElement(name = "UserChar4", nillable = true)
    protected String userChar4;
    @XmlElement(name = "UserDate1", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar userDate1;
    @XmlElement(name = "UserDate2", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar userDate2;
    @XmlElement(name = "UserDate3", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar userDate3;
    @XmlElement(name = "UserDate4", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar userDate4;
    @XmlElement(name = "UserDecimal1", nillable = true)
    protected BigDecimal userDecimal1;
    @XmlElement(name = "UserDecimal2", nillable = true)
    protected BigDecimal userDecimal2;
    @XmlElement(name = "UserInteger1", nillable = true)
    protected Integer userInteger1;
    @XmlElement(name = "UserInteger2", nillable = true)
    protected Integer userInteger2;
    @XmlElement(name = "VoidOrder", nillable = true)
    protected Boolean voidOrder;
    @XmlElement(name = "WebEntryPerson", nillable = true)
    protected String webEntryPerson;
    @XmlElement(name = "WebOrder", nillable = true)
    protected Boolean webOrder;
    @XmlElement(name = "XRefContractDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar xRefContractDate;
    @XmlElement(name = "XRefContractNum", nillable = true)
    protected String xRefContractNum;
    @XmlElement(nillable = true)
    protected String dspBTCustID;

    /**
     * Gets the value of the arlocid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARLOCID() {
        return arlocid;
    }

    /**
     * Sets the value of the arlocid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setARLOCID(String value) {
        this.arlocid = value;
    }

    /**
     * Gets the value of the avsAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVSAddr() {
        return avsAddr;
    }

    /**
     * Sets the value of the avsAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVSAddr(String value) {
        this.avsAddr = value;
    }

    /**
     * Gets the value of the avsZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVSZip() {
        return avsZip;
    }

    /**
     * Sets the value of the avsZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVSZip(String value) {
        this.avsZip = value;
    }

    /**
     * Gets the value of the ackEmailSent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAckEmailSent() {
        return ackEmailSent;
    }

    /**
     * Sets the value of the ackEmailSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAckEmailSent(Boolean value) {
        this.ackEmailSent = value;
    }

    /**
     * Gets the value of the addlHdlgFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddlHdlgFlag() {
        return addlHdlgFlag;
    }

    /**
     * Sets the value of the addlHdlgFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddlHdlgFlag(Boolean value) {
        this.addlHdlgFlag = value;
    }

    /**
     * Gets the value of the allocPriorityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllocPriorityCode() {
        return allocPriorityCode;
    }

    /**
     * Sets the value of the allocPriorityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllocPriorityCode(String value) {
        this.allocPriorityCode = value;
    }

    /**
     * Gets the value of the applyChrg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplyChrg() {
        return applyChrg;
    }

    /**
     * Sets the value of the applyChrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplyChrg(Boolean value) {
        this.applyChrg = value;
    }

    /**
     * Gets the value of the applyOrderBasedDisc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplyOrderBasedDisc() {
        return applyOrderBasedDisc;
    }

    /**
     * Sets the value of the applyOrderBasedDisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplyOrderBasedDisc(Boolean value) {
        this.applyOrderBasedDisc = value;
    }

    /**
     * Gets the value of the autoOrderBasedDisc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoOrderBasedDisc() {
        return autoOrderBasedDisc;
    }

    /**
     * Sets the value of the autoOrderBasedDisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoOrderBasedDisc(Boolean value) {
        this.autoOrderBasedDisc = value;
    }

    /**
     * Gets the value of the autoPrintReady property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoPrintReady() {
        return autoPrintReady;
    }

    /**
     * Sets the value of the autoPrintReady property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoPrintReady(Boolean value) {
        this.autoPrintReady = value;
    }

    /**
     * Gets the value of the availBTCustList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailBTCustList() {
        return availBTCustList;
    }

    /**
     * Sets the value of the availBTCustList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailBTCustList(String value) {
        this.availBTCustList = value;
    }

    /**
     * Gets the value of the btAddressList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBTAddressList() {
        return btAddressList;
    }

    /**
     * Sets the value of the btAddressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBTAddressList(String value) {
        this.btAddressList = value;
    }

    /**
     * Gets the value of the btConNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBTConNum() {
        return btConNum;
    }

    /**
     * Sets the value of the btConNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBTConNum(Integer value) {
        this.btConNum = value;
    }

    /**
     * Gets the value of the btContactEMailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBTContactEMailAddress() {
        return btContactEMailAddress;
    }

    /**
     * Sets the value of the btContactEMailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBTContactEMailAddress(String value) {
        this.btContactEMailAddress = value;
    }

    /**
     * Gets the value of the btContactFaxNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBTContactFaxNum() {
        return btContactFaxNum;
    }

    /**
     * Sets the value of the btContactFaxNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBTContactFaxNum(String value) {
        this.btContactFaxNum = value;
    }

    /**
     * Gets the value of the btContactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBTContactName() {
        return btContactName;
    }

    /**
     * Sets the value of the btContactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBTContactName(String value) {
        this.btContactName = value;
    }

    /**
     * Gets the value of the btContactPhoneNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBTContactPhoneNum() {
        return btContactPhoneNum;
    }

    /**
     * Sets the value of the btContactPhoneNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBTContactPhoneNum(String value) {
        this.btContactPhoneNum = value;
    }

    /**
     * Gets the value of the btCustID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBTCustID() {
        return btCustID;
    }

    /**
     * Sets the value of the btCustID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBTCustID(String value) {
        this.btCustID = value;
    }

    /**
     * Gets the value of the btCustNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBTCustNum() {
        return btCustNum;
    }

    /**
     * Sets the value of the btCustNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBTCustNum(Integer value) {
        this.btCustNum = value;
    }

    /**
     * Gets the value of the btCustNumBTName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBTCustNumBTName() {
        return btCustNumBTName;
    }

    /**
     * Sets the value of the btCustNumBTName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBTCustNumBTName(String value) {
        this.btCustNumBTName = value;
    }

    /**
     * Gets the value of the btCustNumCustID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBTCustNumCustID() {
        return btCustNumCustID;
    }

    /**
     * Sets the value of the btCustNumCustID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBTCustNumCustID(String value) {
        this.btCustNumCustID = value;
    }

    /**
     * Gets the value of the btCustNumName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBTCustNumName() {
        return btCustNumName;
    }

    /**
     * Sets the value of the btCustNumName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBTCustNumName(String value) {
        this.btCustNumName = value;
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
     * Gets the value of the billToCustomerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToCustomerName() {
        return billToCustomerName;
    }

    /**
     * Sets the value of the billToCustomerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToCustomerName(String value) {
        this.billToCustomerName = value;
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
     * Gets the value of the ccAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCCAmount() {
        return ccAmount;
    }

    /**
     * Sets the value of the ccAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCCAmount(BigDecimal value) {
        this.ccAmount = value;
    }

    /**
     * Gets the value of the ccApprovalNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCApprovalNum() {
        return ccApprovalNum;
    }

    /**
     * Sets the value of the ccApprovalNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCApprovalNum(String value) {
        this.ccApprovalNum = value;
    }

    /**
     * Gets the value of the cccscid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCCSCID() {
        return cccscid;
    }

    /**
     * Sets the value of the cccscid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCCSCID(String value) {
        this.cccscid = value;
    }

    /**
     * Gets the value of the cccscidToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCCSCIDToken() {
        return cccscidToken;
    }

    /**
     * Sets the value of the cccscidToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCCSCIDToken(String value) {
        this.cccscidToken = value;
    }

    /**
     * Gets the value of the ccDocAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCCDocAmount() {
        return ccDocAmount;
    }

    /**
     * Sets the value of the ccDocAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCCDocAmount(BigDecimal value) {
        this.ccDocAmount = value;
    }

    /**
     * Gets the value of the ccDocFreight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCCDocFreight() {
        return ccDocFreight;
    }

    /**
     * Sets the value of the ccDocFreight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCCDocFreight(BigDecimal value) {
        this.ccDocFreight = value;
    }

    /**
     * Gets the value of the ccDocTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCCDocTax() {
        return ccDocTax;
    }

    /**
     * Sets the value of the ccDocTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCCDocTax(BigDecimal value) {
        this.ccDocTax = value;
    }

    /**
     * Gets the value of the ccDocTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCCDocTotal() {
        return ccDocTotal;
    }

    /**
     * Sets the value of the ccDocTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCCDocTotal(BigDecimal value) {
        this.ccDocTotal = value;
    }

    /**
     * Gets the value of the ccFreight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCCFreight() {
        return ccFreight;
    }

    /**
     * Sets the value of the ccFreight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCCFreight(BigDecimal value) {
        this.ccFreight = value;
    }

    /**
     * Gets the value of the ccResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCResponse() {
        return ccResponse;
    }

    /**
     * Sets the value of the ccResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCResponse(String value) {
        this.ccResponse = value;
    }

    /**
     * Gets the value of the ccRounding property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCCRounding() {
        return ccRounding;
    }

    /**
     * Sets the value of the ccRounding property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCCRounding(BigDecimal value) {
        this.ccRounding = value;
    }

    /**
     * Gets the value of the ccStreetAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCStreetAddr() {
        return ccStreetAddr;
    }

    /**
     * Sets the value of the ccStreetAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCStreetAddr(String value) {
        this.ccStreetAddr = value;
    }

    /**
     * Gets the value of the ccTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCCTax() {
        return ccTax;
    }

    /**
     * Sets the value of the ccTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCCTax(BigDecimal value) {
        this.ccTax = value;
    }

    /**
     * Gets the value of the ccTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCCTotal() {
        return ccTotal;
    }

    /**
     * Sets the value of the ccTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCCTotal(BigDecimal value) {
        this.ccTotal = value;
    }

    /**
     * Gets the value of the ccTranID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCTranID() {
        return ccTranID;
    }

    /**
     * Sets the value of the ccTranID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCTranID(String value) {
        this.ccTranID = value;
    }

    /**
     * Gets the value of the ccTranType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCTranType() {
        return ccTranType;
    }

    /**
     * Sets the value of the ccTranType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCTranType(String value) {
        this.ccTranType = value;
    }

    /**
     * Gets the value of the ccZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCZip() {
        return ccZip;
    }

    /**
     * Sets the value of the ccZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCZip(String value) {
        this.ccZip = value;
    }

    /**
     * Gets the value of the cod property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCOD() {
        return cod;
    }

    /**
     * Sets the value of the cod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCOD(Boolean value) {
        this.cod = value;
    }

    /**
     * Gets the value of the codAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCODAmount() {
        return codAmount;
    }

    /**
     * Sets the value of the codAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCODAmount(BigDecimal value) {
        this.codAmount = value;
    }

    /**
     * Gets the value of the codCheck property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCODCheck() {
        return codCheck;
    }

    /**
     * Sets the value of the codCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCODCheck(Boolean value) {
        this.codCheck = value;
    }

    /**
     * Gets the value of the codFreight property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCODFreight() {
        return codFreight;
    }

    /**
     * Sets the value of the codFreight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCODFreight(Boolean value) {
        this.codFreight = value;
    }

    /**
     * Gets the value of the cscResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSCResult() {
        return cscResult;
    }

    /**
     * Sets the value of the cscResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSCResult(String value) {
        this.cscResult = value;
    }

    /**
     * Gets the value of the canChangeTaxLiab property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanChangeTaxLiab() {
        return canChangeTaxLiab;
    }

    /**
     * Sets the value of the canChangeTaxLiab property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanChangeTaxLiab(Boolean value) {
        this.canChangeTaxLiab = value;
    }

    /**
     * Gets the value of the cancelAfterDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancelAfterDate() {
        return cancelAfterDate;
    }

    /**
     * Sets the value of the cancelAfterDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancelAfterDate(XMLGregorianCalendar value) {
        this.cancelAfterDate = value;
    }

    /**
     * Gets the value of the cardID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardID() {
        return cardID;
    }

    /**
     * Sets the value of the cardID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardID(String value) {
        this.cardID = value;
    }

    /**
     * Gets the value of the cardMemberName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardMemberName() {
        return cardMemberName;
    }

    /**
     * Sets the value of the cardMemberName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardMemberName(String value) {
        this.cardMemberName = value;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the cardStore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardStore() {
        return cardStore;
    }

    /**
     * Sets the value of the cardStore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardStore(String value) {
        this.cardStore = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the cardTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardTypeDescription() {
        return cardTypeDescription;
    }

    /**
     * Sets the value of the cardTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardTypeDescription(String value) {
        this.cardTypeDescription = value;
    }

    /**
     * Gets the value of the cardmemberReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardmemberReference() {
        return cardmemberReference;
    }

    /**
     * Sets the value of the cardmemberReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardmemberReference(String value) {
        this.cardmemberReference = value;
    }

    /**
     * Gets the value of the certOfOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCertOfOrigin() {
        return certOfOrigin;
    }

    /**
     * Sets the value of the certOfOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCertOfOrigin(Boolean value) {
        this.certOfOrigin = value;
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
     * Gets the value of the chrgAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChrgAmount() {
        return chrgAmount;
    }

    /**
     * Sets the value of the chrgAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChrgAmount(BigDecimal value) {
        this.chrgAmount = value;
    }

    /**
     * Gets the value of the commercialInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCommercialInvoice() {
        return commercialInvoice;
    }

    /**
     * Sets the value of the commercialInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommercialInvoice(Boolean value) {
        this.commercialInvoice = value;
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
     * Gets the value of the createInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreateInvoice() {
        return createInvoice;
    }

    /**
     * Sets the value of the createInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreateInvoice(Boolean value) {
        this.createInvoice = value;
    }

    /**
     * Gets the value of the createPackingSlip property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreatePackingSlip() {
        return createPackingSlip;
    }

    /**
     * Sets the value of the createPackingSlip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreatePackingSlip(Boolean value) {
        this.createPackingSlip = value;
    }

    /**
     * Gets the value of the creditCardOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreditCardOrder() {
        return creditCardOrder;
    }

    /**
     * Sets the value of the creditCardOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreditCardOrder(Boolean value) {
        this.creditCardOrder = value;
    }

    /**
     * Gets the value of the creditOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreditOverride() {
        return creditOverride;
    }

    /**
     * Sets the value of the creditOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreditOverride(Boolean value) {
        this.creditOverride = value;
    }

    /**
     * Gets the value of the creditOverrideDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreditOverrideDate() {
        return creditOverrideDate;
    }

    /**
     * Sets the value of the creditOverrideDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreditOverrideDate(XMLGregorianCalendar value) {
        this.creditOverrideDate = value;
    }

    /**
     * Gets the value of the creditOverrideLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditOverrideLimit() {
        return creditOverrideLimit;
    }

    /**
     * Sets the value of the creditOverrideLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditOverrideLimit(BigDecimal value) {
        this.creditOverrideLimit = value;
    }

    /**
     * Gets the value of the creditOverrideTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditOverrideTime() {
        return creditOverrideTime;
    }

    /**
     * Sets the value of the creditOverrideTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditOverrideTime(String value) {
        this.creditOverrideTime = value;
    }

    /**
     * Gets the value of the creditOverrideUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditOverrideUserID() {
        return creditOverrideUserID;
    }

    /**
     * Sets the value of the creditOverrideUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditOverrideUserID(String value) {
        this.creditOverrideUserID = value;
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
     * Gets the value of the currencyCodeCurrDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCodeCurrDesc() {
        return currencyCodeCurrDesc;
    }

    /**
     * Sets the value of the currencyCodeCurrDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCodeCurrDesc(String value) {
        this.currencyCodeCurrDesc = value;
    }

    /**
     * Gets the value of the currencyCodeCurrName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCodeCurrName() {
        return currencyCodeCurrName;
    }

    /**
     * Sets the value of the currencyCodeCurrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCodeCurrName(String value) {
        this.currencyCodeCurrName = value;
    }

    /**
     * Gets the value of the currencyCodeCurrSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCodeCurrSymbol() {
        return currencyCodeCurrSymbol;
    }

    /**
     * Sets the value of the currencyCodeCurrSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCodeCurrSymbol(String value) {
        this.currencyCodeCurrSymbol = value;
    }

    /**
     * Gets the value of the currencyCodeCurrencyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCodeCurrencyID() {
        return currencyCodeCurrencyID;
    }

    /**
     * Sets the value of the currencyCodeCurrencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCodeCurrencyID(String value) {
        this.currencyCodeCurrencyID = value;
    }

    /**
     * Gets the value of the currencyCodeDocumentDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCodeDocumentDesc() {
        return currencyCodeDocumentDesc;
    }

    /**
     * Sets the value of the currencyCodeDocumentDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCodeDocumentDesc(String value) {
        this.currencyCodeDocumentDesc = value;
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
     * Gets the value of the custAllowOTS property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustAllowOTS() {
        return custAllowOTS;
    }

    /**
     * Sets the value of the custAllowOTS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustAllowOTS(Boolean value) {
        this.custAllowOTS = value;
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
     * Gets the value of the custOnCreditHold property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustOnCreditHold() {
        return custOnCreditHold;
    }

    /**
     * Sets the value of the custOnCreditHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustOnCreditHold(Boolean value) {
        this.custOnCreditHold = value;
    }

    /**
     * Gets the value of the custTradePartnerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustTradePartnerName() {
        return custTradePartnerName;
    }

    /**
     * Sets the value of the custTradePartnerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustTradePartnerName(String value) {
        this.custTradePartnerName = value;
    }

    /**
     * Gets the value of the customerAllowShipTo3 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomerAllowShipTo3() {
        return customerAllowShipTo3;
    }

    /**
     * Sets the value of the customerAllowShipTo3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomerAllowShipTo3(Boolean value) {
        this.customerAllowShipTo3 = value;
    }

    /**
     * Gets the value of the customerBTName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerBTName() {
        return customerBTName;
    }

    /**
     * Sets the value of the customerBTName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerBTName(String value) {
        this.customerBTName = value;
    }

    /**
     * Gets the value of the customerCustID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCustID() {
        return customerCustID;
    }

    /**
     * Sets the value of the customerCustID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCustID(String value) {
        this.customerCustID = value;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the customerPrintAck property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomerPrintAck() {
        return customerPrintAck;
    }

    /**
     * Sets the value of the customerPrintAck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomerPrintAck(Boolean value) {
        this.customerPrintAck = value;
    }

    /**
     * Gets the value of the customerRequiresPO property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomerRequiresPO() {
        return customerRequiresPO;
    }

    /**
     * Sets the value of the customerRequiresPO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomerRequiresPO(Boolean value) {
        this.customerRequiresPO = value;
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
     * Gets the value of the declaredAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeclaredAmt() {
        return declaredAmt;
    }

    /**
     * Sets the value of the declaredAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeclaredAmt(BigDecimal value) {
        this.declaredAmt = value;
    }

    /**
     * Gets the value of the declaredIns property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeclaredIns() {
        return declaredIns;
    }

    /**
     * Sets the value of the declaredIns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeclaredIns(Boolean value) {
        this.declaredIns = value;
    }

    /**
     * Gets the value of the deliveryConf property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDeliveryConf() {
        return deliveryConf;
    }

    /**
     * Sets the value of the deliveryConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDeliveryConf(Integer value) {
        this.deliveryConf = value;
    }

    /**
     * Gets the value of the deliveryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryType() {
        return deliveryType;
    }

    /**
     * Sets the value of the deliveryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryType(String value) {
        this.deliveryType = value;
    }

    /**
     * Gets the value of the demandContract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDemandContract() {
        return demandContract;
    }

    /**
     * Sets the value of the demandContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDemandContract(String value) {
        this.demandContract = value;
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
     * Gets the value of the demandProcessDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDemandProcessDate() {
        return demandProcessDate;
    }

    /**
     * Sets the value of the demandProcessDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDemandProcessDate(XMLGregorianCalendar value) {
        this.demandProcessDate = value;
    }

    /**
     * Gets the value of the demandProcessTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDemandProcessTime() {
        return demandProcessTime;
    }

    /**
     * Sets the value of the demandProcessTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDemandProcessTime(Integer value) {
        this.demandProcessTime = value;
    }

    /**
     * Gets the value of the demandRejected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDemandRejected() {
        return demandRejected;
    }

    /**
     * Sets the value of the demandRejected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDemandRejected(Boolean value) {
        this.demandRejected = value;
    }

    /**
     * Gets the value of the depositBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDepositBal() {
        return depositBal;
    }

    /**
     * Sets the value of the depositBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDepositBal(BigDecimal value) {
        this.depositBal = value;
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
     * Gets the value of the dispatchReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispatchReason() {
        return dispatchReason;
    }

    /**
     * Sets the value of the dispatchReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispatchReason(String value) {
        this.dispatchReason = value;
    }

    /**
     * Gets the value of the dispatchReasonCodeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispatchReasonCodeDescription() {
        return dispatchReasonCodeDescription;
    }

    /**
     * Sets the value of the dispatchReasonCodeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispatchReasonCodeDescription(String value) {
        this.dispatchReasonCodeDescription = value;
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
     * Gets the value of the docCCRounding property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocCCRounding() {
        return docCCRounding;
    }

    /**
     * Sets the value of the docCCRounding property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocCCRounding(BigDecimal value) {
        this.docCCRounding = value;
    }

    /**
     * Gets the value of the docDepositBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocDepositBal() {
        return docDepositBal;
    }

    /**
     * Sets the value of the docDepositBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocDepositBal(BigDecimal value) {
        this.docDepositBal = value;
    }

    /**
     * Gets the value of the docInTotalCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocInTotalCharges() {
        return docInTotalCharges;
    }

    /**
     * Sets the value of the docInTotalCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocInTotalCharges(BigDecimal value) {
        this.docInTotalCharges = value;
    }

    /**
     * Gets the value of the docInTotalDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocInTotalDiscount() {
        return docInTotalDiscount;
    }

    /**
     * Sets the value of the docInTotalDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocInTotalDiscount(BigDecimal value) {
        this.docInTotalDiscount = value;
    }

    /**
     * Gets the value of the docInTotalMisc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocInTotalMisc() {
        return docInTotalMisc;
    }

    /**
     * Sets the value of the docInTotalMisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocInTotalMisc(BigDecimal value) {
        this.docInTotalMisc = value;
    }

    /**
     * Gets the value of the docOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDocOnly() {
        return docOnly;
    }

    /**
     * Sets the value of the docOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDocOnly(Boolean value) {
        this.docOnly = value;
    }

    /**
     * Gets the value of the docOrderAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocOrderAmt() {
        return docOrderAmt;
    }

    /**
     * Sets the value of the docOrderAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocOrderAmt(BigDecimal value) {
        this.docOrderAmt = value;
    }

    /**
     * Gets the value of the docRounding property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocRounding() {
        return docRounding;
    }

    /**
     * Sets the value of the docRounding property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocRounding(BigDecimal value) {
        this.docRounding = value;
    }

    /**
     * Gets the value of the docTotalAdvBill property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocTotalAdvBill() {
        return docTotalAdvBill;
    }

    /**
     * Sets the value of the docTotalAdvBill property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocTotalAdvBill(BigDecimal value) {
        this.docTotalAdvBill = value;
    }

    /**
     * Gets the value of the docTotalCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocTotalCharges() {
        return docTotalCharges;
    }

    /**
     * Sets the value of the docTotalCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocTotalCharges(BigDecimal value) {
        this.docTotalCharges = value;
    }

    /**
     * Gets the value of the docTotalComm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocTotalComm() {
        return docTotalComm;
    }

    /**
     * Sets the value of the docTotalComm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocTotalComm(BigDecimal value) {
        this.docTotalComm = value;
    }

    /**
     * Gets the value of the docTotalDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocTotalDiscount() {
        return docTotalDiscount;
    }

    /**
     * Sets the value of the docTotalDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocTotalDiscount(BigDecimal value) {
        this.docTotalDiscount = value;
    }

    /**
     * Gets the value of the docTotalMisc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocTotalMisc() {
        return docTotalMisc;
    }

    /**
     * Sets the value of the docTotalMisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocTotalMisc(BigDecimal value) {
        this.docTotalMisc = value;
    }

    /**
     * Gets the value of the docTotalNet property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocTotalNet() {
        return docTotalNet;
    }

    /**
     * Sets the value of the docTotalNet property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocTotalNet(BigDecimal value) {
        this.docTotalNet = value;
    }

    /**
     * Gets the value of the docTotalOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocTotalOrder() {
        return docTotalOrder;
    }

    /**
     * Sets the value of the docTotalOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocTotalOrder(BigDecimal value) {
        this.docTotalOrder = value;
    }

    /**
     * Gets the value of the docTotalSATax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocTotalSATax() {
        return docTotalSATax;
    }

    /**
     * Sets the value of the docTotalSATax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocTotalSATax(BigDecimal value) {
        this.docTotalSATax = value;
    }

    /**
     * Gets the value of the docTotalTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocTotalTax() {
        return docTotalTax;
    }

    /**
     * Sets the value of the docTotalTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocTotalTax(BigDecimal value) {
        this.docTotalTax = value;
    }

    /**
     * Gets the value of the docTotalWHTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocTotalWHTax() {
        return docTotalWHTax;
    }

    /**
     * Sets the value of the docTotalWHTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocTotalWHTax(BigDecimal value) {
        this.docTotalWHTax = value;
    }

    /**
     * Gets the value of the dropShip property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDropShip() {
        return dropShip;
    }

    /**
     * Sets the value of the dropShip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDropShip(Boolean value) {
        this.dropShip = value;
    }

    /**
     * Gets the value of the ediAck property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEDIAck() {
        return ediAck;
    }

    /**
     * Sets the value of the ediAck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEDIAck(Boolean value) {
        this.ediAck = value;
    }

    /**
     * Gets the value of the ediOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEDIOrder() {
        return ediOrder;
    }

    /**
     * Sets the value of the ediOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEDIOrder(Boolean value) {
        this.ediOrder = value;
    }

    /**
     * Gets the value of the ediReady property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEDIReady() {
        return ediReady;
    }

    /**
     * Sets the value of the ediReady property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEDIReady(Boolean value) {
        this.ediReady = value;
    }

    /**
     * Gets the value of the ersOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isERSOrder() {
        return ersOrder;
    }

    /**
     * Sets the value of the ersOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setERSOrder(Boolean value) {
        this.ersOrder = value;
    }

    /**
     * Gets the value of the ersOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isERSOverride() {
        return ersOverride;
    }

    /**
     * Sets the value of the ersOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setERSOverride(Boolean value) {
        this.ersOverride = value;
    }

    /**
     * Gets the value of the enableJobWizard property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableJobWizard() {
        return enableJobWizard;
    }

    /**
     * Sets the value of the enableJobWizard property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableJobWizard(Boolean value) {
        this.enableJobWizard = value;
    }

    /**
     * Gets the value of the enableSoldToID property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableSoldToID() {
        return enableSoldToID;
    }

    /**
     * Sets the value of the enableSoldToID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableSoldToID(Boolean value) {
        this.enableSoldToID = value;
    }

    /**
     * Gets the value of the entryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryMethod() {
        return entryMethod;
    }

    /**
     * Sets the value of the entryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryMethod(String value) {
        this.entryMethod = value;
    }

    /**
     * Gets the value of the entryPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryPerson() {
        return entryPerson;
    }

    /**
     * Sets the value of the entryPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryPerson(String value) {
        this.entryPerson = value;
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
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExchangeRate(BigDecimal value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the expirationMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExpirationMonth() {
        return expirationMonth;
    }

    /**
     * Sets the value of the expirationMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExpirationMonth(Integer value) {
        this.expirationMonth = value;
    }

    /**
     * Gets the value of the expirationYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExpirationYear() {
        return expirationYear;
    }

    /**
     * Sets the value of the expirationYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExpirationYear(Integer value) {
        this.expirationYear = value;
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
     * Gets the value of the ffAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFFAddress1() {
        return ffAddress1;
    }

    /**
     * Sets the value of the ffAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFFAddress1(String value) {
        this.ffAddress1 = value;
    }

    /**
     * Gets the value of the ffAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFFAddress2() {
        return ffAddress2;
    }

    /**
     * Sets the value of the ffAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFFAddress2(String value) {
        this.ffAddress2 = value;
    }

    /**
     * Gets the value of the ffAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFFAddress3() {
        return ffAddress3;
    }

    /**
     * Sets the value of the ffAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFFAddress3(String value) {
        this.ffAddress3 = value;
    }

    /**
     * Gets the value of the ffCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFFCity() {
        return ffCity;
    }

    /**
     * Sets the value of the ffCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFFCity(String value) {
        this.ffCity = value;
    }

    /**
     * Gets the value of the ffCompName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFFCompName() {
        return ffCompName;
    }

    /**
     * Sets the value of the ffCompName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFFCompName(String value) {
        this.ffCompName = value;
    }

    /**
     * Gets the value of the ffContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFFContact() {
        return ffContact;
    }

    /**
     * Sets the value of the ffContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFFContact(String value) {
        this.ffContact = value;
    }

    /**
     * Gets the value of the ffCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFFCountry() {
        return ffCountry;
    }

    /**
     * Sets the value of the ffCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFFCountry(String value) {
        this.ffCountry = value;
    }

    /**
     * Gets the value of the ffCountryNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFFCountryNum() {
        return ffCountryNum;
    }

    /**
     * Sets the value of the ffCountryNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFFCountryNum(Integer value) {
        this.ffCountryNum = value;
    }

    /**
     * Gets the value of the ffid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFFID() {
        return ffid;
    }

    /**
     * Sets the value of the ffid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFFID(String value) {
        this.ffid = value;
    }

    /**
     * Gets the value of the ffPhoneNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFFPhoneNum() {
        return ffPhoneNum;
    }

    /**
     * Sets the value of the ffPhoneNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFFPhoneNum(String value) {
        this.ffPhoneNum = value;
    }

    /**
     * Gets the value of the ffState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFFState() {
        return ffState;
    }

    /**
     * Sets the value of the ffState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFFState(String value) {
        this.ffState = value;
    }

    /**
     * Gets the value of the ffZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFFZip() {
        return ffZip;
    }

    /**
     * Sets the value of the ffZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFFZip(String value) {
        this.ffZip = value;
    }

    /**
     * Gets the value of the fob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOB() {
        return fob;
    }

    /**
     * Sets the value of the fob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOB(String value) {
        this.fob = value;
    }

    /**
     * Gets the value of the fobDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOBDescription() {
        return fobDescription;
    }

    /**
     * Sets the value of the fobDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOBDescription(String value) {
        this.fobDescription = value;
    }

    /**
     * Gets the value of the groundType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroundType() {
        return groundType;
    }

    /**
     * Sets the value of the groundType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroundType(String value) {
        this.groundType = value;
    }

    /**
     * Gets the value of the hdCaseNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHDCaseNum() {
        return hdCaseNum;
    }

    /**
     * Sets the value of the hdCaseNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHDCaseNum(Integer value) {
        this.hdCaseNum = value;
    }

    /**
     * Gets the value of the hasMiscCharges property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasMiscCharges() {
        return hasMiscCharges;
    }

    /**
     * Sets the value of the hasMiscCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasMiscCharges(Boolean value) {
        this.hasMiscCharges = value;
    }

    /**
     * Gets the value of the hasOrderLines property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasOrderLines() {
        return hasOrderLines;
    }

    /**
     * Sets the value of the hasOrderLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasOrderLines(Boolean value) {
        this.hasOrderLines = value;
    }

    /**
     * Gets the value of the hazmat property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHazmat() {
        return hazmat;
    }

    /**
     * Sets the value of the hazmat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHazmat(Boolean value) {
        this.hazmat = value;
    }

    /**
     * Gets the value of the holdSetByDemand property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHoldSetByDemand() {
        return holdSetByDemand;
    }

    /**
     * Sets the value of the holdSetByDemand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHoldSetByDemand(Boolean value) {
        this.holdSetByDemand = value;
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
     * Gets the value of the inTotalCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTotalCharges() {
        return inTotalCharges;
    }

    /**
     * Sets the value of the inTotalCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTotalCharges(BigDecimal value) {
        this.inTotalCharges = value;
    }

    /**
     * Gets the value of the inTotalDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTotalDiscount() {
        return inTotalDiscount;
    }

    /**
     * Sets the value of the inTotalDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTotalDiscount(BigDecimal value) {
        this.inTotalDiscount = value;
    }

    /**
     * Gets the value of the inTotalMisc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInTotalMisc() {
        return inTotalMisc;
    }

    /**
     * Sets the value of the inTotalMisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInTotalMisc(BigDecimal value) {
        this.inTotalMisc = value;
    }

    /**
     * Gets the value of the individualPackIDs property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndividualPackIDs() {
        return individualPackIDs;
    }

    /**
     * Sets the value of the individualPackIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndividualPackIDs(Boolean value) {
        this.individualPackIDs = value;
    }

    /**
     * Gets the value of the intrntlShip property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntrntlShip() {
        return intrntlShip;
    }

    /**
     * Sets the value of the intrntlShip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntrntlShip(Boolean value) {
        this.intrntlShip = value;
    }

    /**
     * Gets the value of the invCurrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvCurrCode() {
        return invCurrCode;
    }

    /**
     * Sets the value of the invCurrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvCurrCode(String value) {
        this.invCurrCode = value;
    }

    /**
     * Gets the value of the invCurrCurrDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvCurrCurrDesc() {
        return invCurrCurrDesc;
    }

    /**
     * Sets the value of the invCurrCurrDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvCurrCurrDesc(String value) {
        this.invCurrCurrDesc = value;
    }

    /**
     * Gets the value of the invcOrderCmp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInvcOrderCmp() {
        return invcOrderCmp;
    }

    /**
     * Sets the value of the invcOrderCmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInvcOrderCmp(Boolean value) {
        this.invcOrderCmp = value;
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
     * Gets the value of the locHold property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLOCHold() {
        return locHold;
    }

    /**
     * Sets the value of the locHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLOCHold(Boolean value) {
        this.locHold = value;
    }

    /**
     * Gets the value of the lastBatchNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastBatchNum() {
        return lastBatchNum;
    }

    /**
     * Sets the value of the lastBatchNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastBatchNum(String value) {
        this.lastBatchNum = value;
    }

    /**
     * Gets the value of the lastScheduleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastScheduleNumber() {
        return lastScheduleNumber;
    }

    /**
     * Sets the value of the lastScheduleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastScheduleNumber(String value) {
        this.lastScheduleNumber = value;
    }

    /**
     * Gets the value of the lastTCtrlNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastTCtrlNum() {
        return lastTCtrlNum;
    }

    /**
     * Sets the value of the lastTCtrlNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastTCtrlNum(String value) {
        this.lastTCtrlNum = value;
    }

    /**
     * Gets the value of the legalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalNumber() {
        return legalNumber;
    }

    /**
     * Sets the value of the legalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalNumber(String value) {
        this.legalNumber = value;
    }

    /**
     * Gets the value of the letterOfInstr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLetterOfInstr() {
        return letterOfInstr;
    }

    /**
     * Sets the value of the letterOfInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLetterOfInstr(Boolean value) {
        this.letterOfInstr = value;
    }

    /**
     * Gets the value of the linkMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkMsg() {
        return linkMsg;
    }

    /**
     * Sets the value of the linkMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkMsg(String value) {
        this.linkMsg = value;
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
     * Gets the value of the lockRate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLockRate() {
        return lockRate;
    }

    /**
     * Sets the value of the lockRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLockRate(Boolean value) {
        this.lockRate = value;
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
     * Gets the value of the nonStdPkg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonStdPkg() {
        return nonStdPkg;
    }

    /**
     * Sets the value of the nonStdPkg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonStdPkg(Boolean value) {
        this.nonStdPkg = value;
    }

    /**
     * Gets the value of the notifyEMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotifyEMail() {
        return notifyEMail;
    }

    /**
     * Sets the value of the notifyEMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotifyEMail(String value) {
        this.notifyEMail = value;
    }

    /**
     * Gets the value of the notifyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotifyFlag() {
        return notifyFlag;
    }

    /**
     * Sets the value of the notifyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotifyFlag(Boolean value) {
        this.notifyFlag = value;
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
     * Gets the value of the otsAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTSAddress1() {
        return otsAddress1;
    }

    /**
     * Sets the value of the otsAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTSAddress1(String value) {
        this.otsAddress1 = value;
    }

    /**
     * Gets the value of the otsAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTSAddress2() {
        return otsAddress2;
    }

    /**
     * Sets the value of the otsAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTSAddress2(String value) {
        this.otsAddress2 = value;
    }

    /**
     * Gets the value of the otsAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTSAddress3() {
        return otsAddress3;
    }

    /**
     * Sets the value of the otsAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTSAddress3(String value) {
        this.otsAddress3 = value;
    }

    /**
     * Gets the value of the otsCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTSCity() {
        return otsCity;
    }

    /**
     * Sets the value of the otsCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTSCity(String value) {
        this.otsCity = value;
    }

    /**
     * Gets the value of the otsCntryDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTSCntryDescription() {
        return otsCntryDescription;
    }

    /**
     * Sets the value of the otsCntryDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTSCntryDescription(String value) {
        this.otsCntryDescription = value;
    }

    /**
     * Gets the value of the otsContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTSContact() {
        return otsContact;
    }

    /**
     * Sets the value of the otsContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTSContact(String value) {
        this.otsContact = value;
    }

    /**
     * Gets the value of the otsCountryNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOTSCountryNum() {
        return otsCountryNum;
    }

    /**
     * Sets the value of the otsCountryNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOTSCountryNum(Integer value) {
        this.otsCountryNum = value;
    }

    /**
     * Gets the value of the otsCustSaved property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOTSCustSaved() {
        return otsCustSaved;
    }

    /**
     * Sets the value of the otsCustSaved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOTSCustSaved(Boolean value) {
        this.otsCustSaved = value;
    }

    /**
     * Gets the value of the otsFaxNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTSFaxNum() {
        return otsFaxNum;
    }

    /**
     * Sets the value of the otsFaxNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTSFaxNum(String value) {
        this.otsFaxNum = value;
    }

    /**
     * Gets the value of the otsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTSName() {
        return otsName;
    }

    /**
     * Sets the value of the otsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTSName(String value) {
        this.otsName = value;
    }

    /**
     * Gets the value of the otsPhoneNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTSPhoneNum() {
        return otsPhoneNum;
    }

    /**
     * Sets the value of the otsPhoneNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTSPhoneNum(String value) {
        this.otsPhoneNum = value;
    }

    /**
     * Gets the value of the otsResaleID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTSResaleID() {
        return otsResaleID;
    }

    /**
     * Sets the value of the otsResaleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTSResaleID(String value) {
        this.otsResaleID = value;
    }

    /**
     * Gets the value of the otsSaveAs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTSSaveAs() {
        return otsSaveAs;
    }

    /**
     * Sets the value of the otsSaveAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTSSaveAs(String value) {
        this.otsSaveAs = value;
    }

    /**
     * Gets the value of the otsSaveCustID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTSSaveCustID() {
        return otsSaveCustID;
    }

    /**
     * Sets the value of the otsSaveCustID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTSSaveCustID(String value) {
        this.otsSaveCustID = value;
    }

    /**
     * Gets the value of the otsSaved property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOTSSaved() {
        return otsSaved;
    }

    /**
     * Sets the value of the otsSaved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOTSSaved(Boolean value) {
        this.otsSaved = value;
    }

    /**
     * Gets the value of the otsShipToNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTSShipToNum() {
        return otsShipToNum;
    }

    /**
     * Sets the value of the otsShipToNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTSShipToNum(String value) {
        this.otsShipToNum = value;
    }

    /**
     * Gets the value of the otsState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTSState() {
        return otsState;
    }

    /**
     * Sets the value of the otsState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTSState(String value) {
        this.otsState = value;
    }

    /**
     * Gets the value of the otsTaxRegionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTSTaxRegionCode() {
        return otsTaxRegionCode;
    }

    /**
     * Sets the value of the otsTaxRegionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTSTaxRegionCode(String value) {
        this.otsTaxRegionCode = value;
    }

    /**
     * Gets the value of the otszip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTSZIP() {
        return otszip;
    }

    /**
     * Sets the value of the otszip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTSZIP(String value) {
        this.otszip = value;
    }

    /**
     * Gets the value of the openOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpenOrder() {
        return openOrder;
    }

    /**
     * Sets the value of the openOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpenOrder(Boolean value) {
        this.openOrder = value;
    }

    /**
     * Gets the value of the orderAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrderAmt() {
        return orderAmt;
    }

    /**
     * Sets the value of the orderAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrderAmt(BigDecimal value) {
        this.orderAmt = value;
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
     * Gets the value of the orderDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the value of the orderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderDate(XMLGregorianCalendar value) {
        this.orderDate = value;
    }

    /**
     * Gets the value of the orderHeld property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderHeld() {
        return orderHeld;
    }

    /**
     * Sets the value of the orderHeld property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderHeld(Boolean value) {
        this.orderHeld = value;
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
     * Gets the value of the orderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets the value of the orderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderStatus(String value) {
        this.orderStatus = value;
    }

    /**
     * Gets the value of the ourBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOurBank() {
        return ourBank;
    }

    /**
     * Sets the value of the ourBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOurBank(String value) {
        this.ourBank = value;
    }

    /**
     * Gets the value of the ourBankBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOurBankBankName() {
        return ourBankBankName;
    }

    /**
     * Sets the value of the ourBankBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOurBankBankName(String value) {
        this.ourBankBankName = value;
    }

    /**
     * Gets the value of the ourBankDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOurBankDescription() {
        return ourBankDescription;
    }

    /**
     * Sets the value of the ourBankDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOurBankDescription(String value) {
        this.ourBankDescription = value;
    }

    /**
     * Gets the value of the outboundSalesDocCtr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOutboundSalesDocCtr() {
        return outboundSalesDocCtr;
    }

    /**
     * Sets the value of the outboundSalesDocCtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOutboundSalesDocCtr(Integer value) {
        this.outboundSalesDocCtr = value;
    }

    /**
     * Gets the value of the outboundShipDocsCtr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOutboundShipDocsCtr() {
        return outboundShipDocsCtr;
    }

    /**
     * Sets the value of the outboundShipDocsCtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOutboundShipDocsCtr(Integer value) {
        this.outboundShipDocsCtr = value;
    }

    /**
     * Gets the value of the overrideCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverrideCarrier() {
        return overrideCarrier;
    }

    /**
     * Sets the value of the overrideCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverrideCarrier(Boolean value) {
        this.overrideCarrier = value;
    }

    /**
     * Gets the value of the overrideService property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverrideService() {
        return overrideService;
    }

    /**
     * Sets the value of the overrideService property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverrideService(Boolean value) {
        this.overrideService = value;
    }

    /**
     * Gets the value of the poNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPONum() {
        return poNum;
    }

    /**
     * Sets the value of the poNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPONum(String value) {
        this.poNum = value;
    }

    /**
     * Gets the value of the psCurrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSCurrCode() {
        return psCurrCode;
    }

    /**
     * Sets the value of the psCurrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSCurrCode(String value) {
        this.psCurrCode = value;
    }

    /**
     * Gets the value of the psCurrCurrDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSCurrCurrDesc() {
        return psCurrCurrDesc;
    }

    /**
     * Sets the value of the psCurrCurrDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSCurrCurrDesc(String value) {
        this.psCurrCurrDesc = value;
    }

    /**
     * Gets the value of the parentCustNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParentCustNum() {
        return parentCustNum;
    }

    /**
     * Sets the value of the parentCustNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParentCustNum(Integer value) {
        this.parentCustNum = value;
    }

    /**
     * Gets the value of the payAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayAccount() {
        return payAccount;
    }

    /**
     * Sets the value of the payAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayAccount(String value) {
        this.payAccount = value;
    }

    /**
     * Gets the value of the payBTAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayBTAddress1() {
        return payBTAddress1;
    }

    /**
     * Sets the value of the payBTAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayBTAddress1(String value) {
        this.payBTAddress1 = value;
    }

    /**
     * Gets the value of the payBTAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayBTAddress2() {
        return payBTAddress2;
    }

    /**
     * Sets the value of the payBTAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayBTAddress2(String value) {
        this.payBTAddress2 = value;
    }

    /**
     * Gets the value of the payBTAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayBTAddress3() {
        return payBTAddress3;
    }

    /**
     * Sets the value of the payBTAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayBTAddress3(String value) {
        this.payBTAddress3 = value;
    }

    /**
     * Gets the value of the payBTCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayBTCity() {
        return payBTCity;
    }

    /**
     * Sets the value of the payBTCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayBTCity(String value) {
        this.payBTCity = value;
    }

    /**
     * Gets the value of the payBTCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayBTCountry() {
        return payBTCountry;
    }

    /**
     * Sets the value of the payBTCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayBTCountry(String value) {
        this.payBTCountry = value;
    }

    /**
     * Gets the value of the payBTCountryNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPayBTCountryNum() {
        return payBTCountryNum;
    }

    /**
     * Sets the value of the payBTCountryNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPayBTCountryNum(Integer value) {
        this.payBTCountryNum = value;
    }

    /**
     * Gets the value of the payBTPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayBTPhone() {
        return payBTPhone;
    }

    /**
     * Sets the value of the payBTPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayBTPhone(String value) {
        this.payBTPhone = value;
    }

    /**
     * Gets the value of the payBTState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayBTState() {
        return payBTState;
    }

    /**
     * Sets the value of the payBTState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayBTState(String value) {
        this.payBTState = value;
    }

    /**
     * Gets the value of the payBTZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayBTZip() {
        return payBTZip;
    }

    /**
     * Sets the value of the payBTZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayBTZip(String value) {
        this.payBTZip = value;
    }

    /**
     * Gets the value of the payFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayFlag() {
        return payFlag;
    }

    /**
     * Sets the value of the payFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayFlag(String value) {
        this.payFlag = value;
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
     * Gets the value of the prcConNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrcConNum() {
        return prcConNum;
    }

    /**
     * Sets the value of the prcConNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrcConNum(Integer value) {
        this.prcConNum = value;
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
     * Gets the value of the processCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessCard() {
        return processCard;
    }

    /**
     * Sets the value of the processCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessCard(String value) {
        this.processCard = value;
    }

    /**
     * Gets the value of the rateGrpCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateGrpCode() {
        return rateGrpCode;
    }

    /**
     * Sets the value of the rateGrpCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateGrpCode(String value) {
        this.rateGrpCode = value;
    }

    /**
     * Gets the value of the rateGrpDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateGrpDescription() {
        return rateGrpDescription;
    }

    /**
     * Sets the value of the rateGrpDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateGrpDescription(String value) {
        this.rateGrpDescription = value;
    }

    /**
     * Gets the value of the readyToCalc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReadyToCalc() {
        return readyToCalc;
    }

    /**
     * Sets the value of the readyToCalc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReadyToCalc(Boolean value) {
        this.readyToCalc = value;
    }

    /**
     * Gets the value of the refNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefNotes() {
        return refNotes;
    }

    /**
     * Sets the value of the refNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefNotes(String value) {
        this.refNotes = value;
    }

    /**
     * Gets the value of the referencePNRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencePNRef() {
        return referencePNRef;
    }

    /**
     * Sets the value of the referencePNRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencePNRef(String value) {
        this.referencePNRef = value;
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
     * Gets the value of the resDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResDelivery() {
        return resDelivery;
    }

    /**
     * Sets the value of the resDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResDelivery(Boolean value) {
        this.resDelivery = value;
    }

    /**
     * Gets the value of the reservePriDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservePriDescription() {
        return reservePriDescription;
    }

    /**
     * Sets the value of the reservePriDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservePriDescription(String value) {
        this.reservePriDescription = value;
    }

    /**
     * Gets the value of the reservePriorityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservePriorityCode() {
        return reservePriorityCode;
    }

    /**
     * Sets the value of the reservePriorityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservePriorityCode(String value) {
        this.reservePriorityCode = value;
    }

    /**
     * Gets the value of the rounding property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRounding() {
        return rounding;
    }

    /**
     * Sets the value of the rounding property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRounding(BigDecimal value) {
        this.rounding = value;
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
     * Gets the value of the rpt1CCAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1CCAmount() {
        return rpt1CCAmount;
    }

    /**
     * Sets the value of the rpt1CCAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1CCAmount(BigDecimal value) {
        this.rpt1CCAmount = value;
    }

    /**
     * Gets the value of the rpt1CCFreight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1CCFreight() {
        return rpt1CCFreight;
    }

    /**
     * Sets the value of the rpt1CCFreight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1CCFreight(BigDecimal value) {
        this.rpt1CCFreight = value;
    }

    /**
     * Gets the value of the rpt1CCRounding property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1CCRounding() {
        return rpt1CCRounding;
    }

    /**
     * Sets the value of the rpt1CCRounding property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1CCRounding(BigDecimal value) {
        this.rpt1CCRounding = value;
    }

    /**
     * Gets the value of the rpt1CCTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1CCTax() {
        return rpt1CCTax;
    }

    /**
     * Sets the value of the rpt1CCTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1CCTax(BigDecimal value) {
        this.rpt1CCTax = value;
    }

    /**
     * Gets the value of the rpt1CCTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1CCTotal() {
        return rpt1CCTotal;
    }

    /**
     * Sets the value of the rpt1CCTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1CCTotal(BigDecimal value) {
        this.rpt1CCTotal = value;
    }

    /**
     * Gets the value of the rpt1DepositBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1DepositBal() {
        return rpt1DepositBal;
    }

    /**
     * Sets the value of the rpt1DepositBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1DepositBal(BigDecimal value) {
        this.rpt1DepositBal = value;
    }

    /**
     * Gets the value of the rpt1InTotalCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1InTotalCharges() {
        return rpt1InTotalCharges;
    }

    /**
     * Sets the value of the rpt1InTotalCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1InTotalCharges(BigDecimal value) {
        this.rpt1InTotalCharges = value;
    }

    /**
     * Gets the value of the rpt1InTotalDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1InTotalDiscount() {
        return rpt1InTotalDiscount;
    }

    /**
     * Sets the value of the rpt1InTotalDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1InTotalDiscount(BigDecimal value) {
        this.rpt1InTotalDiscount = value;
    }

    /**
     * Gets the value of the rpt1InTotalMisc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1InTotalMisc() {
        return rpt1InTotalMisc;
    }

    /**
     * Sets the value of the rpt1InTotalMisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1InTotalMisc(BigDecimal value) {
        this.rpt1InTotalMisc = value;
    }

    /**
     * Gets the value of the rpt1OrderAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1OrderAmt() {
        return rpt1OrderAmt;
    }

    /**
     * Sets the value of the rpt1OrderAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1OrderAmt(BigDecimal value) {
        this.rpt1OrderAmt = value;
    }

    /**
     * Gets the value of the rpt1Rounding property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1Rounding() {
        return rpt1Rounding;
    }

    /**
     * Sets the value of the rpt1Rounding property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1Rounding(BigDecimal value) {
        this.rpt1Rounding = value;
    }

    /**
     * Gets the value of the rpt1TotalAdvBill property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1TotalAdvBill() {
        return rpt1TotalAdvBill;
    }

    /**
     * Sets the value of the rpt1TotalAdvBill property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1TotalAdvBill(BigDecimal value) {
        this.rpt1TotalAdvBill = value;
    }

    /**
     * Gets the value of the rpt1TotalCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1TotalCharges() {
        return rpt1TotalCharges;
    }

    /**
     * Sets the value of the rpt1TotalCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1TotalCharges(BigDecimal value) {
        this.rpt1TotalCharges = value;
    }

    /**
     * Gets the value of the rpt1TotalComm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1TotalComm() {
        return rpt1TotalComm;
    }

    /**
     * Sets the value of the rpt1TotalComm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1TotalComm(BigDecimal value) {
        this.rpt1TotalComm = value;
    }

    /**
     * Gets the value of the rpt1TotalDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1TotalDiscount() {
        return rpt1TotalDiscount;
    }

    /**
     * Sets the value of the rpt1TotalDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1TotalDiscount(BigDecimal value) {
        this.rpt1TotalDiscount = value;
    }

    /**
     * Gets the value of the rpt1TotalMisc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1TotalMisc() {
        return rpt1TotalMisc;
    }

    /**
     * Sets the value of the rpt1TotalMisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1TotalMisc(BigDecimal value) {
        this.rpt1TotalMisc = value;
    }

    /**
     * Gets the value of the rpt1TotalNet property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1TotalNet() {
        return rpt1TotalNet;
    }

    /**
     * Sets the value of the rpt1TotalNet property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1TotalNet(BigDecimal value) {
        this.rpt1TotalNet = value;
    }

    /**
     * Gets the value of the rpt1TotalSATax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1TotalSATax() {
        return rpt1TotalSATax;
    }

    /**
     * Sets the value of the rpt1TotalSATax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1TotalSATax(BigDecimal value) {
        this.rpt1TotalSATax = value;
    }

    /**
     * Gets the value of the rpt1TotalTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1TotalTax() {
        return rpt1TotalTax;
    }

    /**
     * Sets the value of the rpt1TotalTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1TotalTax(BigDecimal value) {
        this.rpt1TotalTax = value;
    }

    /**
     * Gets the value of the rpt1TotalWHTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1TotalWHTax() {
        return rpt1TotalWHTax;
    }

    /**
     * Sets the value of the rpt1TotalWHTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1TotalWHTax(BigDecimal value) {
        this.rpt1TotalWHTax = value;
    }

    /**
     * Gets the value of the rpt2CCAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2CCAmount() {
        return rpt2CCAmount;
    }

    /**
     * Sets the value of the rpt2CCAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2CCAmount(BigDecimal value) {
        this.rpt2CCAmount = value;
    }

    /**
     * Gets the value of the rpt2CCFreight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2CCFreight() {
        return rpt2CCFreight;
    }

    /**
     * Sets the value of the rpt2CCFreight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2CCFreight(BigDecimal value) {
        this.rpt2CCFreight = value;
    }

    /**
     * Gets the value of the rpt2CCRounding property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2CCRounding() {
        return rpt2CCRounding;
    }

    /**
     * Sets the value of the rpt2CCRounding property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2CCRounding(BigDecimal value) {
        this.rpt2CCRounding = value;
    }

    /**
     * Gets the value of the rpt2CCTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2CCTax() {
        return rpt2CCTax;
    }

    /**
     * Sets the value of the rpt2CCTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2CCTax(BigDecimal value) {
        this.rpt2CCTax = value;
    }

    /**
     * Gets the value of the rpt2CCTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2CCTotal() {
        return rpt2CCTotal;
    }

    /**
     * Sets the value of the rpt2CCTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2CCTotal(BigDecimal value) {
        this.rpt2CCTotal = value;
    }

    /**
     * Gets the value of the rpt2DepositBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2DepositBal() {
        return rpt2DepositBal;
    }

    /**
     * Sets the value of the rpt2DepositBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2DepositBal(BigDecimal value) {
        this.rpt2DepositBal = value;
    }

    /**
     * Gets the value of the rpt2InTotalCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2InTotalCharges() {
        return rpt2InTotalCharges;
    }

    /**
     * Sets the value of the rpt2InTotalCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2InTotalCharges(BigDecimal value) {
        this.rpt2InTotalCharges = value;
    }

    /**
     * Gets the value of the rpt2InTotalDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2InTotalDiscount() {
        return rpt2InTotalDiscount;
    }

    /**
     * Sets the value of the rpt2InTotalDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2InTotalDiscount(BigDecimal value) {
        this.rpt2InTotalDiscount = value;
    }

    /**
     * Gets the value of the rpt2InTotalMisc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2InTotalMisc() {
        return rpt2InTotalMisc;
    }

    /**
     * Sets the value of the rpt2InTotalMisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2InTotalMisc(BigDecimal value) {
        this.rpt2InTotalMisc = value;
    }

    /**
     * Gets the value of the rpt2OrderAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2OrderAmt() {
        return rpt2OrderAmt;
    }

    /**
     * Sets the value of the rpt2OrderAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2OrderAmt(BigDecimal value) {
        this.rpt2OrderAmt = value;
    }

    /**
     * Gets the value of the rpt2Rounding property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2Rounding() {
        return rpt2Rounding;
    }

    /**
     * Sets the value of the rpt2Rounding property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2Rounding(BigDecimal value) {
        this.rpt2Rounding = value;
    }

    /**
     * Gets the value of the rpt2TotalAdvBill property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2TotalAdvBill() {
        return rpt2TotalAdvBill;
    }

    /**
     * Sets the value of the rpt2TotalAdvBill property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2TotalAdvBill(BigDecimal value) {
        this.rpt2TotalAdvBill = value;
    }

    /**
     * Gets the value of the rpt2TotalCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2TotalCharges() {
        return rpt2TotalCharges;
    }

    /**
     * Sets the value of the rpt2TotalCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2TotalCharges(BigDecimal value) {
        this.rpt2TotalCharges = value;
    }

    /**
     * Gets the value of the rpt2TotalComm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2TotalComm() {
        return rpt2TotalComm;
    }

    /**
     * Sets the value of the rpt2TotalComm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2TotalComm(BigDecimal value) {
        this.rpt2TotalComm = value;
    }

    /**
     * Gets the value of the rpt2TotalDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2TotalDiscount() {
        return rpt2TotalDiscount;
    }

    /**
     * Sets the value of the rpt2TotalDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2TotalDiscount(BigDecimal value) {
        this.rpt2TotalDiscount = value;
    }

    /**
     * Gets the value of the rpt2TotalMisc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2TotalMisc() {
        return rpt2TotalMisc;
    }

    /**
     * Sets the value of the rpt2TotalMisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2TotalMisc(BigDecimal value) {
        this.rpt2TotalMisc = value;
    }

    /**
     * Gets the value of the rpt2TotalNet property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2TotalNet() {
        return rpt2TotalNet;
    }

    /**
     * Sets the value of the rpt2TotalNet property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2TotalNet(BigDecimal value) {
        this.rpt2TotalNet = value;
    }

    /**
     * Gets the value of the rpt2TotalSATax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2TotalSATax() {
        return rpt2TotalSATax;
    }

    /**
     * Sets the value of the rpt2TotalSATax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2TotalSATax(BigDecimal value) {
        this.rpt2TotalSATax = value;
    }

    /**
     * Gets the value of the rpt2TotalTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2TotalTax() {
        return rpt2TotalTax;
    }

    /**
     * Sets the value of the rpt2TotalTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2TotalTax(BigDecimal value) {
        this.rpt2TotalTax = value;
    }

    /**
     * Gets the value of the rpt2TotalWHTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2TotalWHTax() {
        return rpt2TotalWHTax;
    }

    /**
     * Sets the value of the rpt2TotalWHTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2TotalWHTax(BigDecimal value) {
        this.rpt2TotalWHTax = value;
    }

    /**
     * Gets the value of the rpt3CCAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3CCAmount() {
        return rpt3CCAmount;
    }

    /**
     * Sets the value of the rpt3CCAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3CCAmount(BigDecimal value) {
        this.rpt3CCAmount = value;
    }

    /**
     * Gets the value of the rpt3CCFreight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3CCFreight() {
        return rpt3CCFreight;
    }

    /**
     * Sets the value of the rpt3CCFreight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3CCFreight(BigDecimal value) {
        this.rpt3CCFreight = value;
    }

    /**
     * Gets the value of the rpt3CCRounding property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3CCRounding() {
        return rpt3CCRounding;
    }

    /**
     * Sets the value of the rpt3CCRounding property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3CCRounding(BigDecimal value) {
        this.rpt3CCRounding = value;
    }

    /**
     * Gets the value of the rpt3CCTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3CCTax() {
        return rpt3CCTax;
    }

    /**
     * Sets the value of the rpt3CCTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3CCTax(BigDecimal value) {
        this.rpt3CCTax = value;
    }

    /**
     * Gets the value of the rpt3CCTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3CCTotal() {
        return rpt3CCTotal;
    }

    /**
     * Sets the value of the rpt3CCTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3CCTotal(BigDecimal value) {
        this.rpt3CCTotal = value;
    }

    /**
     * Gets the value of the rpt3DepositBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3DepositBal() {
        return rpt3DepositBal;
    }

    /**
     * Sets the value of the rpt3DepositBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3DepositBal(BigDecimal value) {
        this.rpt3DepositBal = value;
    }

    /**
     * Gets the value of the rpt3InTotalCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3InTotalCharges() {
        return rpt3InTotalCharges;
    }

    /**
     * Sets the value of the rpt3InTotalCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3InTotalCharges(BigDecimal value) {
        this.rpt3InTotalCharges = value;
    }

    /**
     * Gets the value of the rpt3InTotalDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3InTotalDiscount() {
        return rpt3InTotalDiscount;
    }

    /**
     * Sets the value of the rpt3InTotalDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3InTotalDiscount(BigDecimal value) {
        this.rpt3InTotalDiscount = value;
    }

    /**
     * Gets the value of the rpt3InTotalMisc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3InTotalMisc() {
        return rpt3InTotalMisc;
    }

    /**
     * Sets the value of the rpt3InTotalMisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3InTotalMisc(BigDecimal value) {
        this.rpt3InTotalMisc = value;
    }

    /**
     * Gets the value of the rpt3OrderAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3OrderAmt() {
        return rpt3OrderAmt;
    }

    /**
     * Sets the value of the rpt3OrderAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3OrderAmt(BigDecimal value) {
        this.rpt3OrderAmt = value;
    }

    /**
     * Gets the value of the rpt3Rounding property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3Rounding() {
        return rpt3Rounding;
    }

    /**
     * Sets the value of the rpt3Rounding property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3Rounding(BigDecimal value) {
        this.rpt3Rounding = value;
    }

    /**
     * Gets the value of the rpt3TotalAdvBill property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3TotalAdvBill() {
        return rpt3TotalAdvBill;
    }

    /**
     * Sets the value of the rpt3TotalAdvBill property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3TotalAdvBill(BigDecimal value) {
        this.rpt3TotalAdvBill = value;
    }

    /**
     * Gets the value of the rpt3TotalCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3TotalCharges() {
        return rpt3TotalCharges;
    }

    /**
     * Sets the value of the rpt3TotalCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3TotalCharges(BigDecimal value) {
        this.rpt3TotalCharges = value;
    }

    /**
     * Gets the value of the rpt3TotalComm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3TotalComm() {
        return rpt3TotalComm;
    }

    /**
     * Sets the value of the rpt3TotalComm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3TotalComm(BigDecimal value) {
        this.rpt3TotalComm = value;
    }

    /**
     * Gets the value of the rpt3TotalDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3TotalDiscount() {
        return rpt3TotalDiscount;
    }

    /**
     * Sets the value of the rpt3TotalDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3TotalDiscount(BigDecimal value) {
        this.rpt3TotalDiscount = value;
    }

    /**
     * Gets the value of the rpt3TotalMisc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3TotalMisc() {
        return rpt3TotalMisc;
    }

    /**
     * Sets the value of the rpt3TotalMisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3TotalMisc(BigDecimal value) {
        this.rpt3TotalMisc = value;
    }

    /**
     * Gets the value of the rpt3TotalNet property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3TotalNet() {
        return rpt3TotalNet;
    }

    /**
     * Sets the value of the rpt3TotalNet property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3TotalNet(BigDecimal value) {
        this.rpt3TotalNet = value;
    }

    /**
     * Gets the value of the rpt3TotalSATax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3TotalSATax() {
        return rpt3TotalSATax;
    }

    /**
     * Sets the value of the rpt3TotalSATax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3TotalSATax(BigDecimal value) {
        this.rpt3TotalSATax = value;
    }

    /**
     * Gets the value of the rpt3TotalTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3TotalTax() {
        return rpt3TotalTax;
    }

    /**
     * Sets the value of the rpt3TotalTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3TotalTax(BigDecimal value) {
        this.rpt3TotalTax = value;
    }

    /**
     * Gets the value of the rpt3TotalWHTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3TotalWHTax() {
        return rpt3TotalWHTax;
    }

    /**
     * Sets the value of the rpt3TotalWHTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3TotalWHTax(BigDecimal value) {
        this.rpt3TotalWHTax = value;
    }

    /**
     * Gets the value of the srCommAmt1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSRCommAmt1() {
        return srCommAmt1;
    }

    /**
     * Sets the value of the srCommAmt1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSRCommAmt1(BigDecimal value) {
        this.srCommAmt1 = value;
    }

    /**
     * Gets the value of the srCommAmt2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSRCommAmt2() {
        return srCommAmt2;
    }

    /**
     * Sets the value of the srCommAmt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSRCommAmt2(BigDecimal value) {
        this.srCommAmt2 = value;
    }

    /**
     * Gets the value of the srCommAmt3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSRCommAmt3() {
        return srCommAmt3;
    }

    /**
     * Sets the value of the srCommAmt3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSRCommAmt3(BigDecimal value) {
        this.srCommAmt3 = value;
    }

    /**
     * Gets the value of the srCommAmt4 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSRCommAmt4() {
        return srCommAmt4;
    }

    /**
     * Sets the value of the srCommAmt4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSRCommAmt4(BigDecimal value) {
        this.srCommAmt4 = value;
    }

    /**
     * Gets the value of the srCommAmt5 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSRCommAmt5() {
        return srCommAmt5;
    }

    /**
     * Sets the value of the srCommAmt5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSRCommAmt5(BigDecimal value) {
        this.srCommAmt5 = value;
    }

    /**
     * Gets the value of the srCommableAmt1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSRCommableAmt1() {
        return srCommableAmt1;
    }

    /**
     * Sets the value of the srCommableAmt1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSRCommableAmt1(BigDecimal value) {
        this.srCommableAmt1 = value;
    }

    /**
     * Gets the value of the srCommableAmt2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSRCommableAmt2() {
        return srCommableAmt2;
    }

    /**
     * Sets the value of the srCommableAmt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSRCommableAmt2(BigDecimal value) {
        this.srCommableAmt2 = value;
    }

    /**
     * Gets the value of the srCommableAmt3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSRCommableAmt3() {
        return srCommableAmt3;
    }

    /**
     * Sets the value of the srCommableAmt3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSRCommableAmt3(BigDecimal value) {
        this.srCommableAmt3 = value;
    }

    /**
     * Gets the value of the srCommableAmt4 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSRCommableAmt4() {
        return srCommableAmt4;
    }

    /**
     * Sets the value of the srCommableAmt4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSRCommableAmt4(BigDecimal value) {
        this.srCommableAmt4 = value;
    }

    /**
     * Gets the value of the srCommableAmt5 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSRCommableAmt5() {
        return srCommableAmt5;
    }

    /**
     * Sets the value of the srCommableAmt5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSRCommableAmt5(BigDecimal value) {
        this.srCommableAmt5 = value;
    }

    /**
     * Gets the value of the salesRepCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesRepCode1() {
        return salesRepCode1;
    }

    /**
     * Sets the value of the salesRepCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesRepCode1(String value) {
        this.salesRepCode1 = value;
    }

    /**
     * Gets the value of the salesRepCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesRepCode2() {
        return salesRepCode2;
    }

    /**
     * Sets the value of the salesRepCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesRepCode2(String value) {
        this.salesRepCode2 = value;
    }

    /**
     * Gets the value of the salesRepCode3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesRepCode3() {
        return salesRepCode3;
    }

    /**
     * Sets the value of the salesRepCode3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesRepCode3(String value) {
        this.salesRepCode3 = value;
    }

    /**
     * Gets the value of the salesRepCode4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesRepCode4() {
        return salesRepCode4;
    }

    /**
     * Sets the value of the salesRepCode4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesRepCode4(String value) {
        this.salesRepCode4 = value;
    }

    /**
     * Gets the value of the salesRepCode5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesRepCode5() {
        return salesRepCode5;
    }

    /**
     * Sets the value of the salesRepCode5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesRepCode5(String value) {
        this.salesRepCode5 = value;
    }

    /**
     * Gets the value of the salesRepList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesRepList() {
        return salesRepList;
    }

    /**
     * Sets the value of the salesRepList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesRepList(String value) {
        this.salesRepList = value;
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
     * Gets the value of the satDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSatDelivery() {
        return satDelivery;
    }

    /**
     * Sets the value of the satDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSatDelivery(Boolean value) {
        this.satDelivery = value;
    }

    /**
     * Gets the value of the satPickup property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSatPickup() {
        return satPickup;
    }

    /**
     * Sets the value of the satPickup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSatPickup(Boolean value) {
        this.satPickup = value;
    }

    /**
     * Gets the value of the servAlert property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServAlert() {
        return servAlert;
    }

    /**
     * Sets the value of the servAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServAlert(Boolean value) {
        this.servAlert = value;
    }

    /**
     * Gets the value of the servAuthNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServAuthNum() {
        return servAuthNum;
    }

    /**
     * Sets the value of the servAuthNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServAuthNum(String value) {
        this.servAuthNum = value;
    }

    /**
     * Gets the value of the servDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServDeliveryDate() {
        return servDeliveryDate;
    }

    /**
     * Sets the value of the servDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServDeliveryDate(XMLGregorianCalendar value) {
        this.servDeliveryDate = value;
    }

    /**
     * Gets the value of the servHomeDel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServHomeDel() {
        return servHomeDel;
    }

    /**
     * Sets the value of the servHomeDel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServHomeDel(Boolean value) {
        this.servHomeDel = value;
    }

    /**
     * Gets the value of the servInstruct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServInstruct() {
        return servInstruct;
    }

    /**
     * Sets the value of the servInstruct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServInstruct(String value) {
        this.servInstruct = value;
    }

    /**
     * Gets the value of the servPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServPhone() {
        return servPhone;
    }

    /**
     * Sets the value of the servPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServPhone(String value) {
        this.servPhone = value;
    }

    /**
     * Gets the value of the servRef1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServRef1() {
        return servRef1;
    }

    /**
     * Sets the value of the servRef1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServRef1(String value) {
        this.servRef1 = value;
    }

    /**
     * Gets the value of the servRef2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServRef2() {
        return servRef2;
    }

    /**
     * Sets the value of the servRef2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServRef2(String value) {
        this.servRef2 = value;
    }

    /**
     * Gets the value of the servRef3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServRef3() {
        return servRef3;
    }

    /**
     * Sets the value of the servRef3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServRef3(String value) {
        this.servRef3 = value;
    }

    /**
     * Gets the value of the servRef4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServRef4() {
        return servRef4;
    }

    /**
     * Sets the value of the servRef4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServRef4(String value) {
        this.servRef4 = value;
    }

    /**
     * Gets the value of the servRef5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServRef5() {
        return servRef5;
    }

    /**
     * Sets the value of the servRef5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServRef5(String value) {
        this.servRef5 = value;
    }

    /**
     * Gets the value of the servRelease property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServRelease() {
        return servRelease;
    }

    /**
     * Sets the value of the servRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServRelease(Boolean value) {
        this.servRelease = value;
    }

    /**
     * Gets the value of the servSignature property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServSignature() {
        return servSignature;
    }

    /**
     * Sets the value of the servSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServSignature(Boolean value) {
        this.servSignature = value;
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
     * Gets the value of the shipExprtDeclartn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShipExprtDeclartn() {
        return shipExprtDeclartn;
    }

    /**
     * Sets the value of the shipExprtDeclartn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShipExprtDeclartn(Boolean value) {
        this.shipExprtDeclartn = value;
    }

    /**
     * Gets the value of the shipOrderComplete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShipOrderComplete() {
        return shipOrderComplete;
    }

    /**
     * Sets the value of the shipOrderComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShipOrderComplete(Boolean value) {
        this.shipOrderComplete = value;
    }

    /**
     * Gets the value of the shipToAddressList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAddressList() {
        return shipToAddressList;
    }

    /**
     * Sets the value of the shipToAddressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAddressList(String value) {
        this.shipToAddressList = value;
    }

    /**
     * Gets the value of the shipToContactEMailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToContactEMailAddress() {
        return shipToContactEMailAddress;
    }

    /**
     * Sets the value of the shipToContactEMailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToContactEMailAddress(String value) {
        this.shipToContactEMailAddress = value;
    }

    /**
     * Gets the value of the shipToContactFaxNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToContactFaxNum() {
        return shipToContactFaxNum;
    }

    /**
     * Sets the value of the shipToContactFaxNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToContactFaxNum(String value) {
        this.shipToContactFaxNum = value;
    }

    /**
     * Gets the value of the shipToContactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToContactName() {
        return shipToContactName;
    }

    /**
     * Sets the value of the shipToContactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToContactName(String value) {
        this.shipToContactName = value;
    }

    /**
     * Gets the value of the shipToContactPhoneNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToContactPhoneNum() {
        return shipToContactPhoneNum;
    }

    /**
     * Sets the value of the shipToContactPhoneNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToContactPhoneNum(String value) {
        this.shipToContactPhoneNum = value;
    }

    /**
     * Gets the value of the shipToCustId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCustId() {
        return shipToCustId;
    }

    /**
     * Sets the value of the shipToCustId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCustId(String value) {
        this.shipToCustId = value;
    }

    /**
     * Gets the value of the shipToCustNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShipToCustNum() {
        return shipToCustNum;
    }

    /**
     * Sets the value of the shipToCustNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShipToCustNum(Integer value) {
        this.shipToCustNum = value;
    }

    /**
     * Gets the value of the shipToNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToNum() {
        return shipToNum;
    }

    /**
     * Sets the value of the shipToNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToNum(String value) {
        this.shipToNum = value;
    }

    /**
     * Gets the value of the shipViaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipViaCode() {
        return shipViaCode;
    }

    /**
     * Sets the value of the shipViaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipViaCode(String value) {
        this.shipViaCode = value;
    }

    /**
     * Gets the value of the shipViaCodeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipViaCodeDescription() {
        return shipViaCodeDescription;
    }

    /**
     * Sets the value of the shipViaCodeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipViaCodeDescription(String value) {
        this.shipViaCodeDescription = value;
    }

    /**
     * Gets the value of the shipViaCodeWebDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipViaCodeWebDesc() {
        return shipViaCodeWebDesc;
    }

    /**
     * Sets the value of the shipViaCodeWebDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipViaCodeWebDesc(String value) {
        this.shipViaCodeWebDesc = value;
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
     * Gets the value of the showApplyOrderDiscountsControl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowApplyOrderDiscountsControl() {
        return showApplyOrderDiscountsControl;
    }

    /**
     * Sets the value of the showApplyOrderDiscountsControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowApplyOrderDiscountsControl(Boolean value) {
        this.showApplyOrderDiscountsControl = value;
    }

    /**
     * Gets the value of the shpConNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShpConNum() {
        return shpConNum;
    }

    /**
     * Sets the value of the shpConNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShpConNum(Integer value) {
        this.shpConNum = value;
    }

    /**
     * Gets the value of the sndAlrtShp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSndAlrtShp() {
        return sndAlrtShp;
    }

    /**
     * Sets the value of the sndAlrtShp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSndAlrtShp(Boolean value) {
        this.sndAlrtShp = value;
    }

    /**
     * Gets the value of the soldToAddressList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoldToAddressList() {
        return soldToAddressList;
    }

    /**
     * Sets the value of the soldToAddressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoldToAddressList(String value) {
        this.soldToAddressList = value;
    }

    /**
     * Gets the value of the soldToContactEMailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoldToContactEMailAddress() {
        return soldToContactEMailAddress;
    }

    /**
     * Sets the value of the soldToContactEMailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoldToContactEMailAddress(String value) {
        this.soldToContactEMailAddress = value;
    }

    /**
     * Gets the value of the soldToContactFaxNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoldToContactFaxNum() {
        return soldToContactFaxNum;
    }

    /**
     * Sets the value of the soldToContactFaxNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoldToContactFaxNum(String value) {
        this.soldToContactFaxNum = value;
    }

    /**
     * Gets the value of the soldToContactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoldToContactName() {
        return soldToContactName;
    }

    /**
     * Sets the value of the soldToContactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoldToContactName(String value) {
        this.soldToContactName = value;
    }

    /**
     * Gets the value of the soldToContactPhoneNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoldToContactPhoneNum() {
        return soldToContactPhoneNum;
    }

    /**
     * Sets the value of the soldToContactPhoneNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoldToContactPhoneNum(String value) {
        this.soldToContactPhoneNum = value;
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
     * Gets the value of the taxPoint property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTaxPoint() {
        return taxPoint;
    }

    /**
     * Sets the value of the taxPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTaxPoint(XMLGregorianCalendar value) {
        this.taxPoint = value;
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
     * Gets the value of the taxRegionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRegionCode() {
        return taxRegionCode;
    }

    /**
     * Sets the value of the taxRegionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRegionCode(String value) {
        this.taxRegionCode = value;
    }

    /**
     * Gets the value of the taxRegionCodeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRegionCodeDescription() {
        return taxRegionCodeDescription;
    }

    /**
     * Sets the value of the taxRegionCodeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRegionCodeDescription(String value) {
        this.taxRegionCodeDescription = value;
    }

    /**
     * Gets the value of the termsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermsCode() {
        return termsCode;
    }

    /**
     * Sets the value of the termsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermsCode(String value) {
        this.termsCode = value;
    }

    /**
     * Gets the value of the termsCodeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermsCodeDescription() {
        return termsCodeDescription;
    }

    /**
     * Sets the value of the termsCodeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermsCodeDescription(String value) {
        this.termsCodeDescription = value;
    }

    /**
     * Gets the value of the totalAdvBill property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAdvBill() {
        return totalAdvBill;
    }

    /**
     * Sets the value of the totalAdvBill property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAdvBill(BigDecimal value) {
        this.totalAdvBill = value;
    }

    /**
     * Gets the value of the totalCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalCharges() {
        return totalCharges;
    }

    /**
     * Sets the value of the totalCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalCharges(BigDecimal value) {
        this.totalCharges = value;
    }

    /**
     * Gets the value of the totalComm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalComm() {
        return totalComm;
    }

    /**
     * Sets the value of the totalComm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalComm(BigDecimal value) {
        this.totalComm = value;
    }

    /**
     * Gets the value of the totalCommLines property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalCommLines() {
        return totalCommLines;
    }

    /**
     * Sets the value of the totalCommLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalCommLines(Integer value) {
        this.totalCommLines = value;
    }

    /**
     * Gets the value of the totalDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalDiscount() {
        return totalDiscount;
    }

    /**
     * Sets the value of the totalDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalDiscount(BigDecimal value) {
        this.totalDiscount = value;
    }

    /**
     * Gets the value of the totalInvoiced property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalInvoiced() {
        return totalInvoiced;
    }

    /**
     * Sets the value of the totalInvoiced property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalInvoiced(BigDecimal value) {
        this.totalInvoiced = value;
    }

    /**
     * Gets the value of the totalLines property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalLines() {
        return totalLines;
    }

    /**
     * Sets the value of the totalLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalLines(Integer value) {
        this.totalLines = value;
    }

    /**
     * Gets the value of the totalMisc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalMisc() {
        return totalMisc;
    }

    /**
     * Sets the value of the totalMisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalMisc(BigDecimal value) {
        this.totalMisc = value;
    }

    /**
     * Gets the value of the totalNet property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalNet() {
        return totalNet;
    }

    /**
     * Sets the value of the totalNet property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalNet(BigDecimal value) {
        this.totalNet = value;
    }

    /**
     * Gets the value of the totalOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalOrder() {
        return totalOrder;
    }

    /**
     * Sets the value of the totalOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalOrder(BigDecimal value) {
        this.totalOrder = value;
    }

    /**
     * Gets the value of the totalRelDates property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalRelDates() {
        return totalRelDates;
    }

    /**
     * Sets the value of the totalRelDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalRelDates(Integer value) {
        this.totalRelDates = value;
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
     * Gets the value of the totalSATax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalSATax() {
        return totalSATax;
    }

    /**
     * Sets the value of the totalSATax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalSATax(BigDecimal value) {
        this.totalSATax = value;
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
     * Gets the value of the totalTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalTax() {
        return totalTax;
    }

    /**
     * Sets the value of the totalTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalTax(BigDecimal value) {
        this.totalTax = value;
    }

    /**
     * Gets the value of the totalWHTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalWHTax() {
        return totalWHTax;
    }

    /**
     * Sets the value of the totalWHTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalWHTax(BigDecimal value) {
        this.totalWHTax = value;
    }

    /**
     * Gets the value of the tranDocTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranDocTypeID() {
        return tranDocTypeID;
    }

    /**
     * Sets the value of the tranDocTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranDocTypeID(String value) {
        this.tranDocTypeID = value;
    }

    /**
     * Gets the value of the upsqvMemo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPSQVMemo() {
        return upsqvMemo;
    }

    /**
     * Sets the value of the upsqvMemo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPSQVMemo(String value) {
        this.upsqvMemo = value;
    }

    /**
     * Gets the value of the upsqvShipFromName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPSQVShipFromName() {
        return upsqvShipFromName;
    }

    /**
     * Sets the value of the upsqvShipFromName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPSQVShipFromName(String value) {
        this.upsqvShipFromName = value;
    }

    /**
     * Gets the value of the upsQuantumView property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUPSQuantumView() {
        return upsQuantumView;
    }

    /**
     * Sets the value of the upsQuantumView property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUPSQuantumView(Boolean value) {
        this.upsQuantumView = value;
    }

    /**
     * Gets the value of the updateDtlAndRelRecords property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpdateDtlAndRelRecords() {
        return updateDtlAndRelRecords;
    }

    /**
     * Sets the value of the updateDtlAndRelRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateDtlAndRelRecords(Boolean value) {
        this.updateDtlAndRelRecords = value;
    }

    /**
     * Gets the value of the useOTS property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseOTS() {
        return useOTS;
    }

    /**
     * Sets the value of the useOTS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseOTS(Boolean value) {
        this.useOTS = value;
    }

    /**
     * Gets the value of the userChar1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserChar1() {
        return userChar1;
    }

    /**
     * Sets the value of the userChar1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserChar1(String value) {
        this.userChar1 = value;
    }

    /**
     * Gets the value of the userChar2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserChar2() {
        return userChar2;
    }

    /**
     * Sets the value of the userChar2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserChar2(String value) {
        this.userChar2 = value;
    }

    /**
     * Gets the value of the userChar3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserChar3() {
        return userChar3;
    }

    /**
     * Sets the value of the userChar3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserChar3(String value) {
        this.userChar3 = value;
    }

    /**
     * Gets the value of the userChar4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserChar4() {
        return userChar4;
    }

    /**
     * Sets the value of the userChar4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserChar4(String value) {
        this.userChar4 = value;
    }

    /**
     * Gets the value of the userDate1 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUserDate1() {
        return userDate1;
    }

    /**
     * Sets the value of the userDate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUserDate1(XMLGregorianCalendar value) {
        this.userDate1 = value;
    }

    /**
     * Gets the value of the userDate2 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUserDate2() {
        return userDate2;
    }

    /**
     * Sets the value of the userDate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUserDate2(XMLGregorianCalendar value) {
        this.userDate2 = value;
    }

    /**
     * Gets the value of the userDate3 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUserDate3() {
        return userDate3;
    }

    /**
     * Sets the value of the userDate3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUserDate3(XMLGregorianCalendar value) {
        this.userDate3 = value;
    }

    /**
     * Gets the value of the userDate4 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUserDate4() {
        return userDate4;
    }

    /**
     * Sets the value of the userDate4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUserDate4(XMLGregorianCalendar value) {
        this.userDate4 = value;
    }

    /**
     * Gets the value of the userDecimal1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUserDecimal1() {
        return userDecimal1;
    }

    /**
     * Sets the value of the userDecimal1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUserDecimal1(BigDecimal value) {
        this.userDecimal1 = value;
    }

    /**
     * Gets the value of the userDecimal2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUserDecimal2() {
        return userDecimal2;
    }

    /**
     * Sets the value of the userDecimal2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUserDecimal2(BigDecimal value) {
        this.userDecimal2 = value;
    }

    /**
     * Gets the value of the userInteger1 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUserInteger1() {
        return userInteger1;
    }

    /**
     * Sets the value of the userInteger1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUserInteger1(Integer value) {
        this.userInteger1 = value;
    }

    /**
     * Gets the value of the userInteger2 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUserInteger2() {
        return userInteger2;
    }

    /**
     * Sets the value of the userInteger2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUserInteger2(Integer value) {
        this.userInteger2 = value;
    }

    /**
     * Gets the value of the voidOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVoidOrder() {
        return voidOrder;
    }

    /**
     * Sets the value of the voidOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVoidOrder(Boolean value) {
        this.voidOrder = value;
    }

    /**
     * Gets the value of the webEntryPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebEntryPerson() {
        return webEntryPerson;
    }

    /**
     * Sets the value of the webEntryPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebEntryPerson(String value) {
        this.webEntryPerson = value;
    }

    /**
     * Gets the value of the webOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWebOrder() {
        return webOrder;
    }

    /**
     * Sets the value of the webOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWebOrder(Boolean value) {
        this.webOrder = value;
    }

    /**
     * Gets the value of the xRefContractDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXRefContractDate() {
        return xRefContractDate;
    }

    /**
     * Sets the value of the xRefContractDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setXRefContractDate(XMLGregorianCalendar value) {
        this.xRefContractDate = value;
    }

    /**
     * Gets the value of the xRefContractNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXRefContractNum() {
        return xRefContractNum;
    }

    /**
     * Sets the value of the xRefContractNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXRefContractNum(String value) {
        this.xRefContractNum = value;
    }

    /**
     * Gets the value of the dspBTCustID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDspBTCustID() {
        return dspBTCustID;
    }

    /**
     * Sets the value of the dspBTCustID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDspBTCustID(String value) {
        this.dspBTCustID = value;
    }

}
