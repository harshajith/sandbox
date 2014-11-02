
package org.datacontract.schemas._2004._07.epicor_mfg;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SalesOrderDataSetTypeOrderRel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrderDataSetTypeOrderRel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AllowTaxCodeUpd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ApplyChrg" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AvailableQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BitFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BuyOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BuyToOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="COD" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CODAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CODCheck" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CODFreight" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
 *         &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ComplianceMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditLimitMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditLimitSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CumeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CumeQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustAllowOTS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CustomerAllowShipTo3" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CustomerCustID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="DatePickTicketPrinted" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DeclaredAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DeclaredIns" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DeliveryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DemandReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DemandSchedRejected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DocOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DocSelfAssessTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocTotalTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocWithholdTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DockingStation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DropShip" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DropShipName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DropShipOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DspInvMeth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DspRevMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EnableMake" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EntityUseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntryProcess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExistPOSugg" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExtCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirmRelease" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GetDfltTaxIds" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GroundType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hazmat" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HdrOTS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ICPOLine" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ICPONum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ICPORelNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LinkToPONum" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Linked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MFCustID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MFCustNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Make" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MakeOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MarkForAddrList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarkForNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NeedByDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="NotCompliant" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
 *         &lt;element name="OTMFAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OTMFAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OTMFAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OTMFCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OTMFContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OTMFCountryDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OTMFCountryNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OTMFFaxNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OTMFName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OTMFPhoneNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OTMFState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OTMFZIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="OnHandQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OpenOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OpenRelease" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrderLine" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OrderLineLineDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OrderNumCardMemberName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderNumCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderRelNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OurJobQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OurJobShippedQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OurReqQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OurStockQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OurStockShippedQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OverrideCarrier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OverrideService" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="POLine" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PONum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PORelNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
 *         &lt;element name="PhaseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhaseWasRecInvoiced" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PickError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Plant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PlantName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrevNeedByDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PrevPartNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrevReqDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PrevSellQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PrevShipToNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrevXPartNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PurPoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PurPointAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PurPointAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PurPointAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PurPointCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PurPointCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PurPointName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PurPointPrimPCon" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PurPointState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PurPointZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RefNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReleaseStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReqDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ResDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RevisionNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RowIdent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RowMod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rpt1SelfAssessTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1TotalTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt1WithholdTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2SelfAssessTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2TotalTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt2WithholdTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3SelfAssessTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3TotalTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rpt3WithholdTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SNEnable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SalesOrderLinked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SalesUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SatDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SatPickup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ScheduleNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SelectForPicking" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SelfAssessTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SellingFactor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SellingFactorDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SellingJobQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SellingJobShippedQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SellingReqQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SellingStockQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SellingStockShippedQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ServAOD" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ServAlert" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ServAuthNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ServHomeDel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ServInstruct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServPOD" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ServPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServRef1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServRef2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServRef3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServRef4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServRef5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServRelease" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ServSatDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ServSatPickup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ServSignature" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShipRouting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToAddressList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToContactEMailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToContactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToCustNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ShipToNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToSelected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShipViaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipViaCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipViaCodeWebDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipbyTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
 *         &lt;element name="ShpConNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StagingBinNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StagingWarehouseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubShipTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SysRevID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SysRowID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TPShipToBTName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TPShipToCustID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TPShipToName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxConnectCalc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TaxExempt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxRegionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxRegionCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ThisRelInvtyQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalJobStockShipped" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TransportID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdateMarkForRecords" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UseOTMF" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UseOTS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="VendorNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="VendorNumAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VendorNumAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VendorNumAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VendorNumCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VendorNumCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VendorNumCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VendorNumDefaultFOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VendorNumName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VendorNumState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VendorNumTermsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VendorNumVendorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VendorNumZIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VerbalConf" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="VoidOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="VoidRelease" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WarehouseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WarehouseCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WasRecInvoiced" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WithholdTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesOrderDataSetTypeOrderRel", propOrder = {
    "allowTaxCodeUpd",
    "applyChrg",
    "availableQuantity",
    "bitFlag",
    "buyOverride",
    "buyToOrder",
    "cod",
    "codAmount",
    "codCheck",
    "codFreight",
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
    "company",
    "complianceMsg",
    "creditLimitMessage",
    "creditLimitSource",
    "cumeDate",
    "cumeQty",
    "currencyCode",
    "custAllowOTS",
    "customerAllowShipTo3",
    "customerCustID",
    "customerName",
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
    "datePickTicketPrinted",
    "declaredAmt",
    "declaredIns",
    "deliveryType",
    "demandReference",
    "demandSchedRejected",
    "docOnly",
    "docSelfAssessTax",
    "docTotalTax",
    "docWithholdTax",
    "dockingStation",
    "dropShip",
    "dropShipName",
    "dropShipOverride",
    "dspInvMeth",
    "dspRevMethod",
    "enableMake",
    "entityUseCode",
    "entryProcess",
    "existPOSugg",
    "extCompany",
    "firmRelease",
    "getDfltTaxIds",
    "groundType",
    "hazmat",
    "hdrOTS",
    "icpoLine",
    "icpoNum",
    "icpoRelNum",
    "ium",
    "lineType",
    "linkToPONum",
    "linked",
    "location",
    "mfCustID",
    "mfCustNum",
    "make",
    "makeOverride",
    "markForAddrList",
    "markForNum",
    "needByDate",
    "notCompliant",
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
    "otmfAddress1",
    "otmfAddress2",
    "otmfAddress3",
    "otmfCity",
    "otmfContact",
    "otmfCountryDescription",
    "otmfCountryNum",
    "otmfFaxNum",
    "otmfName",
    "otmfPhoneNum",
    "otmfState",
    "otmfzip",
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
    "onHandQuantity",
    "openOrder",
    "openRelease",
    "orderLine",
    "orderLineLineDesc",
    "orderNum",
    "orderNumCardMemberName",
    "orderNumCurrencyCode",
    "orderRelNum",
    "ourJobQty",
    "ourJobShippedQty",
    "ourReqQty",
    "ourStockQty",
    "ourStockShippedQty",
    "overrideCarrier",
    "overrideService",
    "poLine",
    "poNum",
    "poRelNum",
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
    "phaseID",
    "phaseWasRecInvoiced",
    "pickError",
    "plant",
    "plantName",
    "prevNeedByDate",
    "prevPartNum",
    "prevReqDate",
    "prevSellQty",
    "prevShipToNum",
    "prevXPartNum",
    "projectID",
    "purPoint",
    "purPointAddress1",
    "purPointAddress2",
    "purPointAddress3",
    "purPointCity",
    "purPointCountry",
    "purPointName",
    "purPointPrimPCon",
    "purPointState",
    "purPointZip",
    "ran",
    "refNotes",
    "reference",
    "relStatus",
    "releaseStatus",
    "reqDate",
    "resDelivery",
    "revisionNum",
    "rowIdent",
    "rowMod",
    "rpt1SelfAssessTax",
    "rpt1TotalTax",
    "rpt1WithholdTax",
    "rpt2SelfAssessTax",
    "rpt2TotalTax",
    "rpt2WithholdTax",
    "rpt3SelfAssessTax",
    "rpt3TotalTax",
    "rpt3WithholdTax",
    "snEnable",
    "salesOrderLinked",
    "salesUM",
    "satDelivery",
    "satPickup",
    "scheduleNumber",
    "selectForPicking",
    "selfAssessTax",
    "sellingFactor",
    "sellingFactorDirection",
    "sellingJobQty",
    "sellingJobShippedQty",
    "sellingReqQty",
    "sellingStockQty",
    "sellingStockShippedQty",
    "servAOD",
    "servAlert",
    "servAuthNum",
    "servDeliveryDate",
    "servHomeDel",
    "servInstruct",
    "servPOD",
    "servPhone",
    "servRef1",
    "servRef2",
    "servRef3",
    "servRef4",
    "servRef5",
    "servRelease",
    "servSatDelivery",
    "servSatPickup",
    "servSignature",
    "shipRouting",
    "shipToAddressList",
    "shipToContactEMailAddress",
    "shipToContactName",
    "shipToCustNum",
    "shipToNum",
    "shipToSelected",
    "shipViaCode",
    "shipViaCodeDescription",
    "shipViaCodeWebDesc",
    "shipbyTime",
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
    "shpConNum",
    "stagingBinNum",
    "stagingWarehouseCode",
    "subShipTo",
    "sysRevID",
    "sysRowID",
    "tpShipToBTName",
    "tpShipToCustID",
    "tpShipToName",
    "taxConnectCalc",
    "taxExempt",
    "taxRegionCode",
    "taxRegionCodeDescription",
    "thisRelInvtyQty",
    "totalJobStockShipped",
    "totalTax",
    "transportID",
    "updateMarkForRecords",
    "useOTMF",
    "useOTS",
    "vendorNum",
    "vendorNumAddress1",
    "vendorNumAddress2",
    "vendorNumAddress3",
    "vendorNumCity",
    "vendorNumCountry",
    "vendorNumCurrencyCode",
    "vendorNumDefaultFOB",
    "vendorNumName",
    "vendorNumState",
    "vendorNumTermsCode",
    "vendorNumVendorID",
    "vendorNumZIP",
    "verbalConf",
    "voidOrder",
    "voidRelease",
    "warehouseCode",
    "warehouseCodeDescription",
    "wasRecInvoiced",
    "withholdTax"
})
public class SalesOrderDataSetTypeOrderRel {

    @XmlElement(name = "AllowTaxCodeUpd", nillable = true)
    protected Boolean allowTaxCodeUpd;
    @XmlElement(name = "ApplyChrg", nillable = true)
    protected Boolean applyChrg;
    @XmlElement(name = "AvailableQuantity", nillable = true)
    protected BigDecimal availableQuantity;
    @XmlElement(name = "BitFlag", nillable = true)
    protected Integer bitFlag;
    @XmlElement(name = "BuyOverride", nillable = true)
    protected Boolean buyOverride;
    @XmlElement(name = "BuyToOrder", nillable = true)
    protected Boolean buyToOrder;
    @XmlElement(name = "COD", nillable = true)
    protected Boolean cod;
    @XmlElement(name = "CODAmount", nillable = true)
    protected BigDecimal codAmount;
    @XmlElement(name = "CODCheck", nillable = true)
    protected Boolean codCheck;
    @XmlElement(name = "CODFreight", nillable = true)
    protected Boolean codFreight;
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
    @XmlElement(name = "Company", nillable = true)
    protected String company;
    @XmlElement(name = "ComplianceMsg", nillable = true)
    protected String complianceMsg;
    @XmlElement(name = "CreditLimitMessage", nillable = true)
    protected String creditLimitMessage;
    @XmlElement(name = "CreditLimitSource", nillable = true)
    protected String creditLimitSource;
    @XmlElement(name = "CumeDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cumeDate;
    @XmlElement(name = "CumeQty", nillable = true)
    protected BigDecimal cumeQty;
    @XmlElement(name = "CurrencyCode", nillable = true)
    protected String currencyCode;
    @XmlElement(name = "CustAllowOTS", nillable = true)
    protected Boolean custAllowOTS;
    @XmlElement(name = "CustomerAllowShipTo3", nillable = true)
    protected Boolean customerAllowShipTo3;
    @XmlElement(name = "CustomerCustID", nillable = true)
    protected String customerCustID;
    @XmlElement(name = "CustomerName", nillable = true)
    protected String customerName;
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
    @XmlElement(name = "DatePickTicketPrinted", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datePickTicketPrinted;
    @XmlElement(name = "DeclaredAmt", nillable = true)
    protected BigDecimal declaredAmt;
    @XmlElement(name = "DeclaredIns", nillable = true)
    protected Boolean declaredIns;
    @XmlElement(name = "DeliveryType", nillable = true)
    protected String deliveryType;
    @XmlElement(name = "DemandReference", nillable = true)
    protected String demandReference;
    @XmlElement(name = "DemandSchedRejected", nillable = true)
    protected Boolean demandSchedRejected;
    @XmlElement(name = "DocOnly", nillable = true)
    protected Boolean docOnly;
    @XmlElement(name = "DocSelfAssessTax", nillable = true)
    protected BigDecimal docSelfAssessTax;
    @XmlElement(name = "DocTotalTax", nillable = true)
    protected BigDecimal docTotalTax;
    @XmlElement(name = "DocWithholdTax", nillable = true)
    protected BigDecimal docWithholdTax;
    @XmlElement(name = "DockingStation", nillable = true)
    protected String dockingStation;
    @XmlElement(name = "DropShip", nillable = true)
    protected Boolean dropShip;
    @XmlElement(name = "DropShipName", nillable = true)
    protected String dropShipName;
    @XmlElement(name = "DropShipOverride", nillable = true)
    protected Boolean dropShipOverride;
    @XmlElement(name = "DspInvMeth", nillable = true)
    protected String dspInvMeth;
    @XmlElement(name = "DspRevMethod", nillable = true)
    protected String dspRevMethod;
    @XmlElement(name = "EnableMake", nillable = true)
    protected Boolean enableMake;
    @XmlElement(name = "EntityUseCode", nillable = true)
    protected String entityUseCode;
    @XmlElement(name = "EntryProcess", nillable = true)
    protected String entryProcess;
    @XmlElement(name = "ExistPOSugg", nillable = true)
    protected Boolean existPOSugg;
    @XmlElement(name = "ExtCompany", nillable = true)
    protected String extCompany;
    @XmlElement(name = "FirmRelease", nillable = true)
    protected Boolean firmRelease;
    @XmlElement(name = "GetDfltTaxIds", nillable = true)
    protected Boolean getDfltTaxIds;
    @XmlElement(name = "GroundType", nillable = true)
    protected String groundType;
    @XmlElement(name = "Hazmat", nillable = true)
    protected Boolean hazmat;
    @XmlElement(name = "HdrOTS", nillable = true)
    protected Boolean hdrOTS;
    @XmlElement(name = "ICPOLine", nillable = true)
    protected Integer icpoLine;
    @XmlElement(name = "ICPONum", nillable = true)
    protected Integer icpoNum;
    @XmlElement(name = "ICPORelNum", nillable = true)
    protected Integer icpoRelNum;
    @XmlElement(name = "IUM", nillable = true)
    protected String ium;
    @XmlElement(name = "LineType", nillable = true)
    protected String lineType;
    @XmlElement(name = "LinkToPONum", nillable = true)
    protected Boolean linkToPONum;
    @XmlElement(name = "Linked", nillable = true)
    protected Boolean linked;
    @XmlElement(name = "Location", nillable = true)
    protected String location;
    @XmlElement(name = "MFCustID", nillable = true)
    protected String mfCustID;
    @XmlElement(name = "MFCustNum", nillable = true)
    protected Integer mfCustNum;
    @XmlElement(name = "Make", nillable = true)
    protected Boolean make;
    @XmlElement(name = "MakeOverride", nillable = true)
    protected Boolean makeOverride;
    @XmlElement(name = "MarkForAddrList", nillable = true)
    protected String markForAddrList;
    @XmlElement(name = "MarkForNum", nillable = true)
    protected String markForNum;
    @XmlElement(name = "NeedByDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar needByDate;
    @XmlElement(name = "NotCompliant", nillable = true)
    protected Boolean notCompliant;
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
    @XmlElement(name = "OTMFAddress1", nillable = true)
    protected String otmfAddress1;
    @XmlElement(name = "OTMFAddress2", nillable = true)
    protected String otmfAddress2;
    @XmlElement(name = "OTMFAddress3", nillable = true)
    protected String otmfAddress3;
    @XmlElement(name = "OTMFCity", nillable = true)
    protected String otmfCity;
    @XmlElement(name = "OTMFContact", nillable = true)
    protected String otmfContact;
    @XmlElement(name = "OTMFCountryDescription", nillable = true)
    protected String otmfCountryDescription;
    @XmlElement(name = "OTMFCountryNum", nillable = true)
    protected Integer otmfCountryNum;
    @XmlElement(name = "OTMFFaxNum", nillable = true)
    protected String otmfFaxNum;
    @XmlElement(name = "OTMFName", nillable = true)
    protected String otmfName;
    @XmlElement(name = "OTMFPhoneNum", nillable = true)
    protected String otmfPhoneNum;
    @XmlElement(name = "OTMFState", nillable = true)
    protected String otmfState;
    @XmlElement(name = "OTMFZIP", nillable = true)
    protected String otmfzip;
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
    @XmlElement(name = "OnHandQuantity", nillable = true)
    protected BigDecimal onHandQuantity;
    @XmlElement(name = "OpenOrder", nillable = true)
    protected Boolean openOrder;
    @XmlElement(name = "OpenRelease", nillable = true)
    protected Boolean openRelease;
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
    @XmlElement(name = "OrderRelNum", nillable = true)
    protected Integer orderRelNum;
    @XmlElement(name = "OurJobQty", nillable = true)
    protected BigDecimal ourJobQty;
    @XmlElement(name = "OurJobShippedQty", nillable = true)
    protected BigDecimal ourJobShippedQty;
    @XmlElement(name = "OurReqQty", nillable = true)
    protected BigDecimal ourReqQty;
    @XmlElement(name = "OurStockQty", nillable = true)
    protected BigDecimal ourStockQty;
    @XmlElement(name = "OurStockShippedQty", nillable = true)
    protected BigDecimal ourStockShippedQty;
    @XmlElement(name = "OverrideCarrier", nillable = true)
    protected Boolean overrideCarrier;
    @XmlElement(name = "OverrideService", nillable = true)
    protected Boolean overrideService;
    @XmlElement(name = "POLine", nillable = true)
    protected Integer poLine;
    @XmlElement(name = "PONum", nillable = true)
    protected Integer poNum;
    @XmlElement(name = "PORelNum", nillable = true)
    protected Integer poRelNum;
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
    @XmlElement(name = "PhaseID", nillable = true)
    protected String phaseID;
    @XmlElement(name = "PhaseWasRecInvoiced", nillable = true)
    protected Boolean phaseWasRecInvoiced;
    @XmlElement(name = "PickError", nillable = true)
    protected String pickError;
    @XmlElement(name = "Plant", nillable = true)
    protected String plant;
    @XmlElement(name = "PlantName", nillable = true)
    protected String plantName;
    @XmlElement(name = "PrevNeedByDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar prevNeedByDate;
    @XmlElement(name = "PrevPartNum", nillable = true)
    protected String prevPartNum;
    @XmlElement(name = "PrevReqDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar prevReqDate;
    @XmlElement(name = "PrevSellQty", nillable = true)
    protected BigDecimal prevSellQty;
    @XmlElement(name = "PrevShipToNum", nillable = true)
    protected String prevShipToNum;
    @XmlElement(name = "PrevXPartNum", nillable = true)
    protected String prevXPartNum;
    @XmlElement(name = "ProjectID", nillable = true)
    protected String projectID;
    @XmlElement(name = "PurPoint", nillable = true)
    protected String purPoint;
    @XmlElement(name = "PurPointAddress1", nillable = true)
    protected String purPointAddress1;
    @XmlElement(name = "PurPointAddress2", nillable = true)
    protected String purPointAddress2;
    @XmlElement(name = "PurPointAddress3", nillable = true)
    protected String purPointAddress3;
    @XmlElement(name = "PurPointCity", nillable = true)
    protected String purPointCity;
    @XmlElement(name = "PurPointCountry", nillable = true)
    protected String purPointCountry;
    @XmlElement(name = "PurPointName", nillable = true)
    protected String purPointName;
    @XmlElement(name = "PurPointPrimPCon", nillable = true)
    protected Integer purPointPrimPCon;
    @XmlElement(name = "PurPointState", nillable = true)
    protected String purPointState;
    @XmlElement(name = "PurPointZip", nillable = true)
    protected String purPointZip;
    @XmlElement(name = "RAN", nillable = true)
    protected String ran;
    @XmlElement(name = "RefNotes", nillable = true)
    protected String refNotes;
    @XmlElement(name = "Reference", nillable = true)
    protected String reference;
    @XmlElement(name = "RelStatus", nillable = true)
    protected String relStatus;
    @XmlElement(name = "ReleaseStatus", nillable = true)
    protected String releaseStatus;
    @XmlElement(name = "ReqDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reqDate;
    @XmlElement(name = "ResDelivery", nillable = true)
    protected Boolean resDelivery;
    @XmlElement(name = "RevisionNum", nillable = true)
    protected String revisionNum;
    @XmlElement(name = "RowIdent", nillable = true)
    protected String rowIdent;
    @XmlElement(name = "RowMod", nillable = true)
    protected String rowMod;
    @XmlElement(name = "Rpt1SelfAssessTax", nillable = true)
    protected BigDecimal rpt1SelfAssessTax;
    @XmlElement(name = "Rpt1TotalTax", nillable = true)
    protected BigDecimal rpt1TotalTax;
    @XmlElement(name = "Rpt1WithholdTax", nillable = true)
    protected BigDecimal rpt1WithholdTax;
    @XmlElement(name = "Rpt2SelfAssessTax", nillable = true)
    protected BigDecimal rpt2SelfAssessTax;
    @XmlElement(name = "Rpt2TotalTax", nillable = true)
    protected BigDecimal rpt2TotalTax;
    @XmlElement(name = "Rpt2WithholdTax", nillable = true)
    protected BigDecimal rpt2WithholdTax;
    @XmlElement(name = "Rpt3SelfAssessTax", nillable = true)
    protected BigDecimal rpt3SelfAssessTax;
    @XmlElement(name = "Rpt3TotalTax", nillable = true)
    protected BigDecimal rpt3TotalTax;
    @XmlElement(name = "Rpt3WithholdTax", nillable = true)
    protected BigDecimal rpt3WithholdTax;
    @XmlElement(name = "SNEnable", nillable = true)
    protected Boolean snEnable;
    @XmlElement(name = "SalesOrderLinked", nillable = true)
    protected Boolean salesOrderLinked;
    @XmlElement(name = "SalesUM", nillable = true)
    protected String salesUM;
    @XmlElement(name = "SatDelivery", nillable = true)
    protected Boolean satDelivery;
    @XmlElement(name = "SatPickup", nillable = true)
    protected Boolean satPickup;
    @XmlElement(name = "ScheduleNumber", nillable = true)
    protected String scheduleNumber;
    @XmlElement(name = "SelectForPicking", nillable = true)
    protected Boolean selectForPicking;
    @XmlElement(name = "SelfAssessTax", nillable = true)
    protected BigDecimal selfAssessTax;
    @XmlElement(name = "SellingFactor", nillable = true)
    protected BigDecimal sellingFactor;
    @XmlElement(name = "SellingFactorDirection", nillable = true)
    protected String sellingFactorDirection;
    @XmlElement(name = "SellingJobQty", nillable = true)
    protected BigDecimal sellingJobQty;
    @XmlElement(name = "SellingJobShippedQty", nillable = true)
    protected BigDecimal sellingJobShippedQty;
    @XmlElement(name = "SellingReqQty", nillable = true)
    protected BigDecimal sellingReqQty;
    @XmlElement(name = "SellingStockQty", nillable = true)
    protected BigDecimal sellingStockQty;
    @XmlElement(name = "SellingStockShippedQty", nillable = true)
    protected BigDecimal sellingStockShippedQty;
    @XmlElement(name = "ServAOD", nillable = true)
    protected Boolean servAOD;
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
    @XmlElement(name = "ServPOD", nillable = true)
    protected Boolean servPOD;
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
    @XmlElement(name = "ServSatDelivery", nillable = true)
    protected Boolean servSatDelivery;
    @XmlElement(name = "ServSatPickup", nillable = true)
    protected Boolean servSatPickup;
    @XmlElement(name = "ServSignature", nillable = true)
    protected Boolean servSignature;
    @XmlElement(name = "ShipRouting", nillable = true)
    protected String shipRouting;
    @XmlElement(name = "ShipToAddressList", nillable = true)
    protected String shipToAddressList;
    @XmlElement(name = "ShipToContactEMailAddress", nillable = true)
    protected String shipToContactEMailAddress;
    @XmlElement(name = "ShipToContactName", nillable = true)
    protected String shipToContactName;
    @XmlElement(name = "ShipToCustNum", nillable = true)
    protected Integer shipToCustNum;
    @XmlElement(name = "ShipToNum", nillable = true)
    protected String shipToNum;
    @XmlElement(name = "ShipToSelected", nillable = true)
    protected Boolean shipToSelected;
    @XmlElement(name = "ShipViaCode", nillable = true)
    protected String shipViaCode;
    @XmlElement(name = "ShipViaCodeDescription", nillable = true)
    protected String shipViaCodeDescription;
    @XmlElement(name = "ShipViaCodeWebDesc", nillable = true)
    protected String shipViaCodeWebDesc;
    @XmlElement(name = "ShipbyTime", nillable = true)
    protected Integer shipbyTime;
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
    @XmlElement(name = "ShpConNum", nillable = true)
    protected Integer shpConNum;
    @XmlElement(name = "StagingBinNum", nillable = true)
    protected String stagingBinNum;
    @XmlElement(name = "StagingWarehouseCode", nillable = true)
    protected String stagingWarehouseCode;
    @XmlElement(name = "SubShipTo", nillable = true)
    protected String subShipTo;
    @XmlElement(name = "SysRevID", nillable = true)
    protected Integer sysRevID;
    @XmlElement(name = "SysRowID", nillable = true)
    protected String sysRowID;
    @XmlElement(name = "TPShipToBTName", nillable = true)
    protected String tpShipToBTName;
    @XmlElement(name = "TPShipToCustID", nillable = true)
    protected String tpShipToCustID;
    @XmlElement(name = "TPShipToName", nillable = true)
    protected String tpShipToName;
    @XmlElement(name = "TaxConnectCalc", nillable = true)
    protected Boolean taxConnectCalc;
    @XmlElement(name = "TaxExempt", nillable = true)
    protected String taxExempt;
    @XmlElement(name = "TaxRegionCode", nillable = true)
    protected String taxRegionCode;
    @XmlElement(name = "TaxRegionCodeDescription", nillable = true)
    protected String taxRegionCodeDescription;
    @XmlElement(name = "ThisRelInvtyQty", nillable = true)
    protected BigDecimal thisRelInvtyQty;
    @XmlElement(name = "TotalJobStockShipped", nillable = true)
    protected BigDecimal totalJobStockShipped;
    @XmlElement(name = "TotalTax", nillable = true)
    protected BigDecimal totalTax;
    @XmlElement(name = "TransportID", nillable = true)
    protected String transportID;
    @XmlElement(name = "UpdateMarkForRecords", nillable = true)
    protected Boolean updateMarkForRecords;
    @XmlElement(name = "UseOTMF", nillable = true)
    protected Boolean useOTMF;
    @XmlElement(name = "UseOTS", nillable = true)
    protected Boolean useOTS;
    @XmlElement(name = "VendorNum", nillable = true)
    protected Integer vendorNum;
    @XmlElement(name = "VendorNumAddress1", nillable = true)
    protected String vendorNumAddress1;
    @XmlElement(name = "VendorNumAddress2", nillable = true)
    protected String vendorNumAddress2;
    @XmlElement(name = "VendorNumAddress3", nillable = true)
    protected String vendorNumAddress3;
    @XmlElement(name = "VendorNumCity", nillable = true)
    protected String vendorNumCity;
    @XmlElement(name = "VendorNumCountry", nillable = true)
    protected String vendorNumCountry;
    @XmlElement(name = "VendorNumCurrencyCode", nillable = true)
    protected String vendorNumCurrencyCode;
    @XmlElement(name = "VendorNumDefaultFOB", nillable = true)
    protected String vendorNumDefaultFOB;
    @XmlElement(name = "VendorNumName", nillable = true)
    protected String vendorNumName;
    @XmlElement(name = "VendorNumState", nillable = true)
    protected String vendorNumState;
    @XmlElement(name = "VendorNumTermsCode", nillable = true)
    protected String vendorNumTermsCode;
    @XmlElement(name = "VendorNumVendorID", nillable = true)
    protected String vendorNumVendorID;
    @XmlElement(name = "VendorNumZIP", nillable = true)
    protected String vendorNumZIP;
    @XmlElement(name = "VerbalConf", nillable = true)
    protected Boolean verbalConf;
    @XmlElement(name = "VoidOrder", nillable = true)
    protected Boolean voidOrder;
    @XmlElement(name = "VoidRelease", nillable = true)
    protected Boolean voidRelease;
    @XmlElement(name = "WarehouseCode", nillable = true)
    protected String warehouseCode;
    @XmlElement(name = "WarehouseCodeDescription", nillable = true)
    protected String warehouseCodeDescription;
    @XmlElement(name = "WasRecInvoiced", nillable = true)
    protected Boolean wasRecInvoiced;
    @XmlElement(name = "WithholdTax", nillable = true)
    protected BigDecimal withholdTax;

    /**
     * Gets the value of the allowTaxCodeUpd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowTaxCodeUpd() {
        return allowTaxCodeUpd;
    }

    /**
     * Sets the value of the allowTaxCodeUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowTaxCodeUpd(Boolean value) {
        this.allowTaxCodeUpd = value;
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
     * Gets the value of the buyOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBuyOverride() {
        return buyOverride;
    }

    /**
     * Sets the value of the buyOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBuyOverride(Boolean value) {
        this.buyOverride = value;
    }

    /**
     * Gets the value of the buyToOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBuyToOrder() {
        return buyToOrder;
    }

    /**
     * Sets the value of the buyToOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBuyToOrder(Boolean value) {
        this.buyToOrder = value;
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
     * Gets the value of the complianceMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplianceMsg() {
        return complianceMsg;
    }

    /**
     * Sets the value of the complianceMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplianceMsg(String value) {
        this.complianceMsg = value;
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
     * Gets the value of the datePickTicketPrinted property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatePickTicketPrinted() {
        return datePickTicketPrinted;
    }

    /**
     * Sets the value of the datePickTicketPrinted property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatePickTicketPrinted(XMLGregorianCalendar value) {
        this.datePickTicketPrinted = value;
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
     * Gets the value of the demandReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDemandReference() {
        return demandReference;
    }

    /**
     * Sets the value of the demandReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDemandReference(String value) {
        this.demandReference = value;
    }

    /**
     * Gets the value of the demandSchedRejected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDemandSchedRejected() {
        return demandSchedRejected;
    }

    /**
     * Sets the value of the demandSchedRejected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDemandSchedRejected(Boolean value) {
        this.demandSchedRejected = value;
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
     * Gets the value of the docSelfAssessTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocSelfAssessTax() {
        return docSelfAssessTax;
    }

    /**
     * Sets the value of the docSelfAssessTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocSelfAssessTax(BigDecimal value) {
        this.docSelfAssessTax = value;
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
     * Gets the value of the docWithholdTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocWithholdTax() {
        return docWithholdTax;
    }

    /**
     * Sets the value of the docWithholdTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocWithholdTax(BigDecimal value) {
        this.docWithholdTax = value;
    }

    /**
     * Gets the value of the dockingStation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDockingStation() {
        return dockingStation;
    }

    /**
     * Sets the value of the dockingStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDockingStation(String value) {
        this.dockingStation = value;
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
     * Gets the value of the dropShipName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDropShipName() {
        return dropShipName;
    }

    /**
     * Sets the value of the dropShipName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDropShipName(String value) {
        this.dropShipName = value;
    }

    /**
     * Gets the value of the dropShipOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDropShipOverride() {
        return dropShipOverride;
    }

    /**
     * Sets the value of the dropShipOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDropShipOverride(Boolean value) {
        this.dropShipOverride = value;
    }

    /**
     * Gets the value of the dspInvMeth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDspInvMeth() {
        return dspInvMeth;
    }

    /**
     * Sets the value of the dspInvMeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDspInvMeth(String value) {
        this.dspInvMeth = value;
    }

    /**
     * Gets the value of the dspRevMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDspRevMethod() {
        return dspRevMethod;
    }

    /**
     * Sets the value of the dspRevMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDspRevMethod(String value) {
        this.dspRevMethod = value;
    }

    /**
     * Gets the value of the enableMake property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableMake() {
        return enableMake;
    }

    /**
     * Sets the value of the enableMake property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableMake(Boolean value) {
        this.enableMake = value;
    }

    /**
     * Gets the value of the entityUseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityUseCode() {
        return entityUseCode;
    }

    /**
     * Sets the value of the entityUseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityUseCode(String value) {
        this.entityUseCode = value;
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
     * Gets the value of the existPOSugg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExistPOSugg() {
        return existPOSugg;
    }

    /**
     * Sets the value of the existPOSugg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExistPOSugg(Boolean value) {
        this.existPOSugg = value;
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
     * Gets the value of the firmRelease property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFirmRelease() {
        return firmRelease;
    }

    /**
     * Sets the value of the firmRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFirmRelease(Boolean value) {
        this.firmRelease = value;
    }

    /**
     * Gets the value of the getDfltTaxIds property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGetDfltTaxIds() {
        return getDfltTaxIds;
    }

    /**
     * Sets the value of the getDfltTaxIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGetDfltTaxIds(Boolean value) {
        this.getDfltTaxIds = value;
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
     * Gets the value of the hdrOTS property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHdrOTS() {
        return hdrOTS;
    }

    /**
     * Sets the value of the hdrOTS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHdrOTS(Boolean value) {
        this.hdrOTS = value;
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
     * Gets the value of the icpoRelNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getICPORelNum() {
        return icpoRelNum;
    }

    /**
     * Sets the value of the icpoRelNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setICPORelNum(Integer value) {
        this.icpoRelNum = value;
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
     * Gets the value of the linkToPONum property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLinkToPONum() {
        return linkToPONum;
    }

    /**
     * Sets the value of the linkToPONum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLinkToPONum(Boolean value) {
        this.linkToPONum = value;
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
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the mfCustID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMFCustID() {
        return mfCustID;
    }

    /**
     * Sets the value of the mfCustID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMFCustID(String value) {
        this.mfCustID = value;
    }

    /**
     * Gets the value of the mfCustNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMFCustNum() {
        return mfCustNum;
    }

    /**
     * Sets the value of the mfCustNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMFCustNum(Integer value) {
        this.mfCustNum = value;
    }

    /**
     * Gets the value of the make property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMake() {
        return make;
    }

    /**
     * Sets the value of the make property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMake(Boolean value) {
        this.make = value;
    }

    /**
     * Gets the value of the makeOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMakeOverride() {
        return makeOverride;
    }

    /**
     * Sets the value of the makeOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMakeOverride(Boolean value) {
        this.makeOverride = value;
    }

    /**
     * Gets the value of the markForAddrList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkForAddrList() {
        return markForAddrList;
    }

    /**
     * Sets the value of the markForAddrList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkForAddrList(String value) {
        this.markForAddrList = value;
    }

    /**
     * Gets the value of the markForNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkForNum() {
        return markForNum;
    }

    /**
     * Sets the value of the markForNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkForNum(String value) {
        this.markForNum = value;
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
     * Gets the value of the notCompliant property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotCompliant() {
        return notCompliant;
    }

    /**
     * Sets the value of the notCompliant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotCompliant(Boolean value) {
        this.notCompliant = value;
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
     * Gets the value of the otmfAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTMFAddress1() {
        return otmfAddress1;
    }

    /**
     * Sets the value of the otmfAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTMFAddress1(String value) {
        this.otmfAddress1 = value;
    }

    /**
     * Gets the value of the otmfAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTMFAddress2() {
        return otmfAddress2;
    }

    /**
     * Sets the value of the otmfAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTMFAddress2(String value) {
        this.otmfAddress2 = value;
    }

    /**
     * Gets the value of the otmfAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTMFAddress3() {
        return otmfAddress3;
    }

    /**
     * Sets the value of the otmfAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTMFAddress3(String value) {
        this.otmfAddress3 = value;
    }

    /**
     * Gets the value of the otmfCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTMFCity() {
        return otmfCity;
    }

    /**
     * Sets the value of the otmfCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTMFCity(String value) {
        this.otmfCity = value;
    }

    /**
     * Gets the value of the otmfContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTMFContact() {
        return otmfContact;
    }

    /**
     * Sets the value of the otmfContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTMFContact(String value) {
        this.otmfContact = value;
    }

    /**
     * Gets the value of the otmfCountryDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTMFCountryDescription() {
        return otmfCountryDescription;
    }

    /**
     * Sets the value of the otmfCountryDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTMFCountryDescription(String value) {
        this.otmfCountryDescription = value;
    }

    /**
     * Gets the value of the otmfCountryNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOTMFCountryNum() {
        return otmfCountryNum;
    }

    /**
     * Sets the value of the otmfCountryNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOTMFCountryNum(Integer value) {
        this.otmfCountryNum = value;
    }

    /**
     * Gets the value of the otmfFaxNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTMFFaxNum() {
        return otmfFaxNum;
    }

    /**
     * Sets the value of the otmfFaxNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTMFFaxNum(String value) {
        this.otmfFaxNum = value;
    }

    /**
     * Gets the value of the otmfName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTMFName() {
        return otmfName;
    }

    /**
     * Sets the value of the otmfName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTMFName(String value) {
        this.otmfName = value;
    }

    /**
     * Gets the value of the otmfPhoneNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTMFPhoneNum() {
        return otmfPhoneNum;
    }

    /**
     * Sets the value of the otmfPhoneNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTMFPhoneNum(String value) {
        this.otmfPhoneNum = value;
    }

    /**
     * Gets the value of the otmfState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTMFState() {
        return otmfState;
    }

    /**
     * Sets the value of the otmfState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTMFState(String value) {
        this.otmfState = value;
    }

    /**
     * Gets the value of the otmfzip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTMFZIP() {
        return otmfzip;
    }

    /**
     * Sets the value of the otmfzip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTMFZIP(String value) {
        this.otmfzip = value;
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
     * Gets the value of the openRelease property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpenRelease() {
        return openRelease;
    }

    /**
     * Sets the value of the openRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpenRelease(Boolean value) {
        this.openRelease = value;
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
     * Gets the value of the ourJobQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOurJobQty() {
        return ourJobQty;
    }

    /**
     * Sets the value of the ourJobQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOurJobQty(BigDecimal value) {
        this.ourJobQty = value;
    }

    /**
     * Gets the value of the ourJobShippedQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOurJobShippedQty() {
        return ourJobShippedQty;
    }

    /**
     * Sets the value of the ourJobShippedQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOurJobShippedQty(BigDecimal value) {
        this.ourJobShippedQty = value;
    }

    /**
     * Gets the value of the ourReqQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOurReqQty() {
        return ourReqQty;
    }

    /**
     * Sets the value of the ourReqQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOurReqQty(BigDecimal value) {
        this.ourReqQty = value;
    }

    /**
     * Gets the value of the ourStockQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOurStockQty() {
        return ourStockQty;
    }

    /**
     * Sets the value of the ourStockQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOurStockQty(BigDecimal value) {
        this.ourStockQty = value;
    }

    /**
     * Gets the value of the ourStockShippedQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOurStockShippedQty() {
        return ourStockShippedQty;
    }

    /**
     * Sets the value of the ourStockShippedQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOurStockShippedQty(BigDecimal value) {
        this.ourStockShippedQty = value;
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
     * Gets the value of the poLine property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPOLine() {
        return poLine;
    }

    /**
     * Sets the value of the poLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPOLine(Integer value) {
        this.poLine = value;
    }

    /**
     * Gets the value of the poNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPONum() {
        return poNum;
    }

    /**
     * Sets the value of the poNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPONum(Integer value) {
        this.poNum = value;
    }

    /**
     * Gets the value of the poRelNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPORelNum() {
        return poRelNum;
    }

    /**
     * Sets the value of the poRelNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPORelNum(Integer value) {
        this.poRelNum = value;
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
     * Gets the value of the phaseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhaseID() {
        return phaseID;
    }

    /**
     * Sets the value of the phaseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhaseID(String value) {
        this.phaseID = value;
    }

    /**
     * Gets the value of the phaseWasRecInvoiced property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPhaseWasRecInvoiced() {
        return phaseWasRecInvoiced;
    }

    /**
     * Sets the value of the phaseWasRecInvoiced property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPhaseWasRecInvoiced(Boolean value) {
        this.phaseWasRecInvoiced = value;
    }

    /**
     * Gets the value of the pickError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickError() {
        return pickError;
    }

    /**
     * Sets the value of the pickError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickError(String value) {
        this.pickError = value;
    }

    /**
     * Gets the value of the plant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlant() {
        return plant;
    }

    /**
     * Sets the value of the plant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlant(String value) {
        this.plant = value;
    }

    /**
     * Gets the value of the plantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlantName() {
        return plantName;
    }

    /**
     * Sets the value of the plantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlantName(String value) {
        this.plantName = value;
    }

    /**
     * Gets the value of the prevNeedByDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrevNeedByDate() {
        return prevNeedByDate;
    }

    /**
     * Sets the value of the prevNeedByDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrevNeedByDate(XMLGregorianCalendar value) {
        this.prevNeedByDate = value;
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
     * Gets the value of the prevReqDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrevReqDate() {
        return prevReqDate;
    }

    /**
     * Sets the value of the prevReqDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrevReqDate(XMLGregorianCalendar value) {
        this.prevReqDate = value;
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
     * Gets the value of the prevShipToNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevShipToNum() {
        return prevShipToNum;
    }

    /**
     * Sets the value of the prevShipToNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevShipToNum(String value) {
        this.prevShipToNum = value;
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
     * Gets the value of the purPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurPoint() {
        return purPoint;
    }

    /**
     * Sets the value of the purPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurPoint(String value) {
        this.purPoint = value;
    }

    /**
     * Gets the value of the purPointAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurPointAddress1() {
        return purPointAddress1;
    }

    /**
     * Sets the value of the purPointAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurPointAddress1(String value) {
        this.purPointAddress1 = value;
    }

    /**
     * Gets the value of the purPointAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurPointAddress2() {
        return purPointAddress2;
    }

    /**
     * Sets the value of the purPointAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurPointAddress2(String value) {
        this.purPointAddress2 = value;
    }

    /**
     * Gets the value of the purPointAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurPointAddress3() {
        return purPointAddress3;
    }

    /**
     * Sets the value of the purPointAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurPointAddress3(String value) {
        this.purPointAddress3 = value;
    }

    /**
     * Gets the value of the purPointCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurPointCity() {
        return purPointCity;
    }

    /**
     * Sets the value of the purPointCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurPointCity(String value) {
        this.purPointCity = value;
    }

    /**
     * Gets the value of the purPointCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurPointCountry() {
        return purPointCountry;
    }

    /**
     * Sets the value of the purPointCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurPointCountry(String value) {
        this.purPointCountry = value;
    }

    /**
     * Gets the value of the purPointName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurPointName() {
        return purPointName;
    }

    /**
     * Sets the value of the purPointName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurPointName(String value) {
        this.purPointName = value;
    }

    /**
     * Gets the value of the purPointPrimPCon property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPurPointPrimPCon() {
        return purPointPrimPCon;
    }

    /**
     * Sets the value of the purPointPrimPCon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPurPointPrimPCon(Integer value) {
        this.purPointPrimPCon = value;
    }

    /**
     * Gets the value of the purPointState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurPointState() {
        return purPointState;
    }

    /**
     * Sets the value of the purPointState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurPointState(String value) {
        this.purPointState = value;
    }

    /**
     * Gets the value of the purPointZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurPointZip() {
        return purPointZip;
    }

    /**
     * Sets the value of the purPointZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurPointZip(String value) {
        this.purPointZip = value;
    }

    /**
     * Gets the value of the ran property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRAN() {
        return ran;
    }

    /**
     * Sets the value of the ran property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRAN(String value) {
        this.ran = value;
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
     * Gets the value of the relStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelStatus() {
        return relStatus;
    }

    /**
     * Sets the value of the relStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelStatus(String value) {
        this.relStatus = value;
    }

    /**
     * Gets the value of the releaseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseStatus() {
        return releaseStatus;
    }

    /**
     * Sets the value of the releaseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseStatus(String value) {
        this.releaseStatus = value;
    }

    /**
     * Gets the value of the reqDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReqDate() {
        return reqDate;
    }

    /**
     * Sets the value of the reqDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReqDate(XMLGregorianCalendar value) {
        this.reqDate = value;
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
     * Gets the value of the rpt1SelfAssessTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1SelfAssessTax() {
        return rpt1SelfAssessTax;
    }

    /**
     * Sets the value of the rpt1SelfAssessTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1SelfAssessTax(BigDecimal value) {
        this.rpt1SelfAssessTax = value;
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
     * Gets the value of the rpt1WithholdTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt1WithholdTax() {
        return rpt1WithholdTax;
    }

    /**
     * Sets the value of the rpt1WithholdTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt1WithholdTax(BigDecimal value) {
        this.rpt1WithholdTax = value;
    }

    /**
     * Gets the value of the rpt2SelfAssessTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2SelfAssessTax() {
        return rpt2SelfAssessTax;
    }

    /**
     * Sets the value of the rpt2SelfAssessTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2SelfAssessTax(BigDecimal value) {
        this.rpt2SelfAssessTax = value;
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
     * Gets the value of the rpt2WithholdTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt2WithholdTax() {
        return rpt2WithholdTax;
    }

    /**
     * Sets the value of the rpt2WithholdTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt2WithholdTax(BigDecimal value) {
        this.rpt2WithholdTax = value;
    }

    /**
     * Gets the value of the rpt3SelfAssessTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3SelfAssessTax() {
        return rpt3SelfAssessTax;
    }

    /**
     * Sets the value of the rpt3SelfAssessTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3SelfAssessTax(BigDecimal value) {
        this.rpt3SelfAssessTax = value;
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
     * Gets the value of the rpt3WithholdTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpt3WithholdTax() {
        return rpt3WithholdTax;
    }

    /**
     * Sets the value of the rpt3WithholdTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpt3WithholdTax(BigDecimal value) {
        this.rpt3WithholdTax = value;
    }

    /**
     * Gets the value of the snEnable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSNEnable() {
        return snEnable;
    }

    /**
     * Sets the value of the snEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSNEnable(Boolean value) {
        this.snEnable = value;
    }

    /**
     * Gets the value of the salesOrderLinked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSalesOrderLinked() {
        return salesOrderLinked;
    }

    /**
     * Sets the value of the salesOrderLinked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSalesOrderLinked(Boolean value) {
        this.salesOrderLinked = value;
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
     * Gets the value of the scheduleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleNumber() {
        return scheduleNumber;
    }

    /**
     * Sets the value of the scheduleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleNumber(String value) {
        this.scheduleNumber = value;
    }

    /**
     * Gets the value of the selectForPicking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSelectForPicking() {
        return selectForPicking;
    }

    /**
     * Sets the value of the selectForPicking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSelectForPicking(Boolean value) {
        this.selectForPicking = value;
    }

    /**
     * Gets the value of the selfAssessTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSelfAssessTax() {
        return selfAssessTax;
    }

    /**
     * Sets the value of the selfAssessTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSelfAssessTax(BigDecimal value) {
        this.selfAssessTax = value;
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
     * Gets the value of the sellingJobQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSellingJobQty() {
        return sellingJobQty;
    }

    /**
     * Sets the value of the sellingJobQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSellingJobQty(BigDecimal value) {
        this.sellingJobQty = value;
    }

    /**
     * Gets the value of the sellingJobShippedQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSellingJobShippedQty() {
        return sellingJobShippedQty;
    }

    /**
     * Sets the value of the sellingJobShippedQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSellingJobShippedQty(BigDecimal value) {
        this.sellingJobShippedQty = value;
    }

    /**
     * Gets the value of the sellingReqQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSellingReqQty() {
        return sellingReqQty;
    }

    /**
     * Sets the value of the sellingReqQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSellingReqQty(BigDecimal value) {
        this.sellingReqQty = value;
    }

    /**
     * Gets the value of the sellingStockQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSellingStockQty() {
        return sellingStockQty;
    }

    /**
     * Sets the value of the sellingStockQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSellingStockQty(BigDecimal value) {
        this.sellingStockQty = value;
    }

    /**
     * Gets the value of the sellingStockShippedQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSellingStockShippedQty() {
        return sellingStockShippedQty;
    }

    /**
     * Sets the value of the sellingStockShippedQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSellingStockShippedQty(BigDecimal value) {
        this.sellingStockShippedQty = value;
    }

    /**
     * Gets the value of the servAOD property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServAOD() {
        return servAOD;
    }

    /**
     * Sets the value of the servAOD property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServAOD(Boolean value) {
        this.servAOD = value;
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
     * Gets the value of the servPOD property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServPOD() {
        return servPOD;
    }

    /**
     * Sets the value of the servPOD property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServPOD(Boolean value) {
        this.servPOD = value;
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
     * Gets the value of the servSatDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServSatDelivery() {
        return servSatDelivery;
    }

    /**
     * Sets the value of the servSatDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServSatDelivery(Boolean value) {
        this.servSatDelivery = value;
    }

    /**
     * Gets the value of the servSatPickup property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServSatPickup() {
        return servSatPickup;
    }

    /**
     * Sets the value of the servSatPickup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServSatPickup(Boolean value) {
        this.servSatPickup = value;
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
     * Gets the value of the shipRouting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipRouting() {
        return shipRouting;
    }

    /**
     * Sets the value of the shipRouting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipRouting(String value) {
        this.shipRouting = value;
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
     * Gets the value of the shipToSelected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShipToSelected() {
        return shipToSelected;
    }

    /**
     * Sets the value of the shipToSelected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShipToSelected(Boolean value) {
        this.shipToSelected = value;
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
     * Gets the value of the shipbyTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShipbyTime() {
        return shipbyTime;
    }

    /**
     * Sets the value of the shipbyTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShipbyTime(Integer value) {
        this.shipbyTime = value;
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
     * Gets the value of the stagingBinNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStagingBinNum() {
        return stagingBinNum;
    }

    /**
     * Sets the value of the stagingBinNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStagingBinNum(String value) {
        this.stagingBinNum = value;
    }

    /**
     * Gets the value of the stagingWarehouseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStagingWarehouseCode() {
        return stagingWarehouseCode;
    }

    /**
     * Sets the value of the stagingWarehouseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStagingWarehouseCode(String value) {
        this.stagingWarehouseCode = value;
    }

    /**
     * Gets the value of the subShipTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubShipTo() {
        return subShipTo;
    }

    /**
     * Sets the value of the subShipTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubShipTo(String value) {
        this.subShipTo = value;
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
     * Gets the value of the tpShipToBTName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTPShipToBTName() {
        return tpShipToBTName;
    }

    /**
     * Sets the value of the tpShipToBTName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTPShipToBTName(String value) {
        this.tpShipToBTName = value;
    }

    /**
     * Gets the value of the tpShipToCustID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTPShipToCustID() {
        return tpShipToCustID;
    }

    /**
     * Sets the value of the tpShipToCustID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTPShipToCustID(String value) {
        this.tpShipToCustID = value;
    }

    /**
     * Gets the value of the tpShipToName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTPShipToName() {
        return tpShipToName;
    }

    /**
     * Sets the value of the tpShipToName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTPShipToName(String value) {
        this.tpShipToName = value;
    }

    /**
     * Gets the value of the taxConnectCalc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxConnectCalc() {
        return taxConnectCalc;
    }

    /**
     * Sets the value of the taxConnectCalc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxConnectCalc(Boolean value) {
        this.taxConnectCalc = value;
    }

    /**
     * Gets the value of the taxExempt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxExempt() {
        return taxExempt;
    }

    /**
     * Sets the value of the taxExempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxExempt(String value) {
        this.taxExempt = value;
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
     * Gets the value of the thisRelInvtyQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getThisRelInvtyQty() {
        return thisRelInvtyQty;
    }

    /**
     * Sets the value of the thisRelInvtyQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setThisRelInvtyQty(BigDecimal value) {
        this.thisRelInvtyQty = value;
    }

    /**
     * Gets the value of the totalJobStockShipped property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalJobStockShipped() {
        return totalJobStockShipped;
    }

    /**
     * Sets the value of the totalJobStockShipped property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalJobStockShipped(BigDecimal value) {
        this.totalJobStockShipped = value;
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
     * Gets the value of the transportID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportID() {
        return transportID;
    }

    /**
     * Sets the value of the transportID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportID(String value) {
        this.transportID = value;
    }

    /**
     * Gets the value of the updateMarkForRecords property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpdateMarkForRecords() {
        return updateMarkForRecords;
    }

    /**
     * Sets the value of the updateMarkForRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateMarkForRecords(Boolean value) {
        this.updateMarkForRecords = value;
    }

    /**
     * Gets the value of the useOTMF property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseOTMF() {
        return useOTMF;
    }

    /**
     * Sets the value of the useOTMF property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseOTMF(Boolean value) {
        this.useOTMF = value;
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
     * Gets the value of the vendorNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVendorNum() {
        return vendorNum;
    }

    /**
     * Sets the value of the vendorNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVendorNum(Integer value) {
        this.vendorNum = value;
    }

    /**
     * Gets the value of the vendorNumAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorNumAddress1() {
        return vendorNumAddress1;
    }

    /**
     * Sets the value of the vendorNumAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorNumAddress1(String value) {
        this.vendorNumAddress1 = value;
    }

    /**
     * Gets the value of the vendorNumAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorNumAddress2() {
        return vendorNumAddress2;
    }

    /**
     * Sets the value of the vendorNumAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorNumAddress2(String value) {
        this.vendorNumAddress2 = value;
    }

    /**
     * Gets the value of the vendorNumAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorNumAddress3() {
        return vendorNumAddress3;
    }

    /**
     * Sets the value of the vendorNumAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorNumAddress3(String value) {
        this.vendorNumAddress3 = value;
    }

    /**
     * Gets the value of the vendorNumCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorNumCity() {
        return vendorNumCity;
    }

    /**
     * Sets the value of the vendorNumCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorNumCity(String value) {
        this.vendorNumCity = value;
    }

    /**
     * Gets the value of the vendorNumCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorNumCountry() {
        return vendorNumCountry;
    }

    /**
     * Sets the value of the vendorNumCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorNumCountry(String value) {
        this.vendorNumCountry = value;
    }

    /**
     * Gets the value of the vendorNumCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorNumCurrencyCode() {
        return vendorNumCurrencyCode;
    }

    /**
     * Sets the value of the vendorNumCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorNumCurrencyCode(String value) {
        this.vendorNumCurrencyCode = value;
    }

    /**
     * Gets the value of the vendorNumDefaultFOB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorNumDefaultFOB() {
        return vendorNumDefaultFOB;
    }

    /**
     * Sets the value of the vendorNumDefaultFOB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorNumDefaultFOB(String value) {
        this.vendorNumDefaultFOB = value;
    }

    /**
     * Gets the value of the vendorNumName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorNumName() {
        return vendorNumName;
    }

    /**
     * Sets the value of the vendorNumName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorNumName(String value) {
        this.vendorNumName = value;
    }

    /**
     * Gets the value of the vendorNumState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorNumState() {
        return vendorNumState;
    }

    /**
     * Sets the value of the vendorNumState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorNumState(String value) {
        this.vendorNumState = value;
    }

    /**
     * Gets the value of the vendorNumTermsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorNumTermsCode() {
        return vendorNumTermsCode;
    }

    /**
     * Sets the value of the vendorNumTermsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorNumTermsCode(String value) {
        this.vendorNumTermsCode = value;
    }

    /**
     * Gets the value of the vendorNumVendorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorNumVendorID() {
        return vendorNumVendorID;
    }

    /**
     * Sets the value of the vendorNumVendorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorNumVendorID(String value) {
        this.vendorNumVendorID = value;
    }

    /**
     * Gets the value of the vendorNumZIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorNumZIP() {
        return vendorNumZIP;
    }

    /**
     * Sets the value of the vendorNumZIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorNumZIP(String value) {
        this.vendorNumZIP = value;
    }

    /**
     * Gets the value of the verbalConf property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVerbalConf() {
        return verbalConf;
    }

    /**
     * Sets the value of the verbalConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVerbalConf(Boolean value) {
        this.verbalConf = value;
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
     * Gets the value of the voidRelease property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVoidRelease() {
        return voidRelease;
    }

    /**
     * Sets the value of the voidRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVoidRelease(Boolean value) {
        this.voidRelease = value;
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
     * Gets the value of the warehouseCodeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarehouseCodeDescription() {
        return warehouseCodeDescription;
    }

    /**
     * Sets the value of the warehouseCodeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarehouseCodeDescription(String value) {
        this.warehouseCodeDescription = value;
    }

    /**
     * Gets the value of the wasRecInvoiced property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWasRecInvoiced() {
        return wasRecInvoiced;
    }

    /**
     * Sets the value of the wasRecInvoiced property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWasRecInvoiced(Boolean value) {
        this.wasRecInvoiced = value;
    }

    /**
     * Gets the value of the withholdTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWithholdTax() {
        return withholdTax;
    }

    /**
     * Sets the value of the withholdTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWithholdTax(BigDecimal value) {
        this.withholdTax = value;
    }

}
