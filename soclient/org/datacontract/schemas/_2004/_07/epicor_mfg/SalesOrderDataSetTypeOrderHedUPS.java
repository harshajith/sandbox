
package org.datacontract.schemas._2004._07.epicor_mfg;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SalesOrderDataSetTypeOrderHedUPS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrderDataSetTypeOrderHedUPS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BitFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
 *         &lt;element name="Character11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Character12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Character13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Character14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Character15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Character16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Character17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Character18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Character19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Character20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="DeliveryNotify" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EnableQuantumView" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EntryProcess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FailureNotify" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
 *         &lt;element name="OrderNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RowIdent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RowMod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipmentNotify" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
 *         &lt;element name="ShortChar11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortChar12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortChar13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortChar14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortChar15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortChar16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortChar17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortChar18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortChar19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortChar20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SysRevID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SysRowID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UPSQVSeq" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesOrderDataSetTypeOrderHedUPS", propOrder = {
    "bitFlag",
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
    "character11",
    "character12",
    "character13",
    "character14",
    "character15",
    "character16",
    "character17",
    "character18",
    "character19",
    "character20",
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
    "company",
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
    "deliveryNotify",
    "emailAddress",
    "enableQuantumView",
    "entryProcess",
    "failureNotify",
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
    "orderNum",
    "rowIdent",
    "rowMod",
    "shipmentNotify",
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
    "shortChar11",
    "shortChar12",
    "shortChar13",
    "shortChar14",
    "shortChar15",
    "shortChar16",
    "shortChar17",
    "shortChar18",
    "shortChar19",
    "shortChar20",
    "sysRevID",
    "sysRowID",
    "upsqvSeq"
})
public class SalesOrderDataSetTypeOrderHedUPS {

    @XmlElement(name = "BitFlag", nillable = true)
    protected Integer bitFlag;
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
    @XmlElement(name = "Character11", nillable = true)
    protected String character11;
    @XmlElement(name = "Character12", nillable = true)
    protected String character12;
    @XmlElement(name = "Character13", nillable = true)
    protected String character13;
    @XmlElement(name = "Character14", nillable = true)
    protected String character14;
    @XmlElement(name = "Character15", nillable = true)
    protected String character15;
    @XmlElement(name = "Character16", nillable = true)
    protected String character16;
    @XmlElement(name = "Character17", nillable = true)
    protected String character17;
    @XmlElement(name = "Character18", nillable = true)
    protected String character18;
    @XmlElement(name = "Character19", nillable = true)
    protected String character19;
    @XmlElement(name = "Character20", nillable = true)
    protected String character20;
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
    @XmlElement(name = "Company", nillable = true)
    protected String company;
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
    @XmlElement(name = "DeliveryNotify", nillable = true)
    protected Boolean deliveryNotify;
    @XmlElement(name = "EmailAddress", nillable = true)
    protected String emailAddress;
    @XmlElement(name = "EnableQuantumView", nillable = true)
    protected Boolean enableQuantumView;
    @XmlElement(name = "EntryProcess", nillable = true)
    protected String entryProcess;
    @XmlElement(name = "FailureNotify", nillable = true)
    protected Boolean failureNotify;
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
    @XmlElement(name = "OrderNum", nillable = true)
    protected Integer orderNum;
    @XmlElement(name = "RowIdent", nillable = true)
    protected String rowIdent;
    @XmlElement(name = "RowMod", nillable = true)
    protected String rowMod;
    @XmlElement(name = "ShipmentNotify", nillable = true)
    protected Boolean shipmentNotify;
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
    @XmlElement(name = "ShortChar11", nillable = true)
    protected String shortChar11;
    @XmlElement(name = "ShortChar12", nillable = true)
    protected String shortChar12;
    @XmlElement(name = "ShortChar13", nillable = true)
    protected String shortChar13;
    @XmlElement(name = "ShortChar14", nillable = true)
    protected String shortChar14;
    @XmlElement(name = "ShortChar15", nillable = true)
    protected String shortChar15;
    @XmlElement(name = "ShortChar16", nillable = true)
    protected String shortChar16;
    @XmlElement(name = "ShortChar17", nillable = true)
    protected String shortChar17;
    @XmlElement(name = "ShortChar18", nillable = true)
    protected String shortChar18;
    @XmlElement(name = "ShortChar19", nillable = true)
    protected String shortChar19;
    @XmlElement(name = "ShortChar20", nillable = true)
    protected String shortChar20;
    @XmlElement(name = "SysRevID", nillable = true)
    protected Integer sysRevID;
    @XmlElement(name = "SysRowID", nillable = true)
    protected String sysRowID;
    @XmlElement(name = "UPSQVSeq", nillable = true)
    protected Integer upsqvSeq;

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
     * Gets the value of the character11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacter11() {
        return character11;
    }

    /**
     * Sets the value of the character11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacter11(String value) {
        this.character11 = value;
    }

    /**
     * Gets the value of the character12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacter12() {
        return character12;
    }

    /**
     * Sets the value of the character12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacter12(String value) {
        this.character12 = value;
    }

    /**
     * Gets the value of the character13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacter13() {
        return character13;
    }

    /**
     * Sets the value of the character13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacter13(String value) {
        this.character13 = value;
    }

    /**
     * Gets the value of the character14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacter14() {
        return character14;
    }

    /**
     * Sets the value of the character14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacter14(String value) {
        this.character14 = value;
    }

    /**
     * Gets the value of the character15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacter15() {
        return character15;
    }

    /**
     * Sets the value of the character15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacter15(String value) {
        this.character15 = value;
    }

    /**
     * Gets the value of the character16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacter16() {
        return character16;
    }

    /**
     * Sets the value of the character16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacter16(String value) {
        this.character16 = value;
    }

    /**
     * Gets the value of the character17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacter17() {
        return character17;
    }

    /**
     * Sets the value of the character17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacter17(String value) {
        this.character17 = value;
    }

    /**
     * Gets the value of the character18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacter18() {
        return character18;
    }

    /**
     * Sets the value of the character18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacter18(String value) {
        this.character18 = value;
    }

    /**
     * Gets the value of the character19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacter19() {
        return character19;
    }

    /**
     * Sets the value of the character19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacter19(String value) {
        this.character19 = value;
    }

    /**
     * Gets the value of the character20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacter20() {
        return character20;
    }

    /**
     * Sets the value of the character20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacter20(String value) {
        this.character20 = value;
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
     * Gets the value of the deliveryNotify property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeliveryNotify() {
        return deliveryNotify;
    }

    /**
     * Sets the value of the deliveryNotify property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeliveryNotify(Boolean value) {
        this.deliveryNotify = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the enableQuantumView property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableQuantumView() {
        return enableQuantumView;
    }

    /**
     * Sets the value of the enableQuantumView property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableQuantumView(Boolean value) {
        this.enableQuantumView = value;
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
     * Gets the value of the failureNotify property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFailureNotify() {
        return failureNotify;
    }

    /**
     * Sets the value of the failureNotify property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFailureNotify(Boolean value) {
        this.failureNotify = value;
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
     * Gets the value of the shipmentNotify property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShipmentNotify() {
        return shipmentNotify;
    }

    /**
     * Sets the value of the shipmentNotify property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShipmentNotify(Boolean value) {
        this.shipmentNotify = value;
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
     * Gets the value of the shortChar11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortChar11() {
        return shortChar11;
    }

    /**
     * Sets the value of the shortChar11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortChar11(String value) {
        this.shortChar11 = value;
    }

    /**
     * Gets the value of the shortChar12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortChar12() {
        return shortChar12;
    }

    /**
     * Sets the value of the shortChar12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortChar12(String value) {
        this.shortChar12 = value;
    }

    /**
     * Gets the value of the shortChar13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortChar13() {
        return shortChar13;
    }

    /**
     * Sets the value of the shortChar13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortChar13(String value) {
        this.shortChar13 = value;
    }

    /**
     * Gets the value of the shortChar14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortChar14() {
        return shortChar14;
    }

    /**
     * Sets the value of the shortChar14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortChar14(String value) {
        this.shortChar14 = value;
    }

    /**
     * Gets the value of the shortChar15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortChar15() {
        return shortChar15;
    }

    /**
     * Sets the value of the shortChar15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortChar15(String value) {
        this.shortChar15 = value;
    }

    /**
     * Gets the value of the shortChar16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortChar16() {
        return shortChar16;
    }

    /**
     * Sets the value of the shortChar16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortChar16(String value) {
        this.shortChar16 = value;
    }

    /**
     * Gets the value of the shortChar17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortChar17() {
        return shortChar17;
    }

    /**
     * Sets the value of the shortChar17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortChar17(String value) {
        this.shortChar17 = value;
    }

    /**
     * Gets the value of the shortChar18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortChar18() {
        return shortChar18;
    }

    /**
     * Sets the value of the shortChar18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortChar18(String value) {
        this.shortChar18 = value;
    }

    /**
     * Gets the value of the shortChar19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortChar19() {
        return shortChar19;
    }

    /**
     * Sets the value of the shortChar19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortChar19(String value) {
        this.shortChar19 = value;
    }

    /**
     * Gets the value of the shortChar20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortChar20() {
        return shortChar20;
    }

    /**
     * Sets the value of the shortChar20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortChar20(String value) {
        this.shortChar20 = value;
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
     * Gets the value of the upsqvSeq property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUPSQVSeq() {
        return upsqvSeq;
    }

    /**
     * Sets the value of the upsqvSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUPSQVSeq(Integer value) {
        this.upsqvSeq = value;
    }

}
