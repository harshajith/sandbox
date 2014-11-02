
package org.datacontract.schemas._2004._07.epicor_mfg;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UpdExtSalesOrderDataSetTypePartSubs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdExtSalesOrderDataSetTypePartSubs">
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
 *         &lt;element name="CheckBox01" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CheckBox02" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CheckBox03" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CheckBox04" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CheckBox05" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DBRowIdent" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="Date01" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Date02" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Date03" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Date04" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Date05" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DefaultSub" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
 *         &lt;element name="PartNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartNumIUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartNumPartDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartNumPricePerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartNumSalesUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartNumSellingFactor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PartNumTrackDimension" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PartNumTrackLots" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PartNumTrackSerialNum" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="QtyPer" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RecType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RowIdent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RowMod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Selected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SubPart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubPartIUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubPartPartDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubPartPricePerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubPartSalesUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubPartSellingFactor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SubPartTrackDimension" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SubPartTrackLots" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SubPartTrackSerialNum" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SugOrderQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SuggestedQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SysRevID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SysRowID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdExtSalesOrderDataSetTypePartSubs", propOrder = {
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
    "checkBox01",
    "checkBox02",
    "checkBox03",
    "checkBox04",
    "checkBox05",
    "comment",
    "company",
    "dbRowIdent",
    "date01",
    "date02",
    "date03",
    "date04",
    "date05",
    "defaultSub",
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
    "partNum",
    "partNumIUM",
    "partNumPartDescription",
    "partNumPricePerCode",
    "partNumSalesUM",
    "partNumSellingFactor",
    "partNumTrackDimension",
    "partNumTrackLots",
    "partNumTrackSerialNum",
    "price",
    "qtyPer",
    "recType",
    "rowIdent",
    "rowMod",
    "salesUM",
    "selected",
    "subPart",
    "subPartIUM",
    "subPartPartDescription",
    "subPartPricePerCode",
    "subPartSalesUM",
    "subPartSellingFactor",
    "subPartTrackDimension",
    "subPartTrackLots",
    "subPartTrackSerialNum",
    "subType",
    "sugOrderQty",
    "suggestedQty",
    "sysRevID",
    "sysRowID"
})
public class UpdExtSalesOrderDataSetTypePartSubs {

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
    @XmlElement(name = "Comment", nillable = true)
    protected String comment;
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
    @XmlElement(name = "DefaultSub", nillable = true)
    protected Boolean defaultSub;
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
    @XmlElement(name = "Price", nillable = true)
    protected BigDecimal price;
    @XmlElement(name = "QtyPer", nillable = true)
    protected BigDecimal qtyPer;
    @XmlElement(name = "RecType", nillable = true)
    protected String recType;
    @XmlElement(name = "RowIdent", nillable = true)
    protected String rowIdent;
    @XmlElement(name = "RowMod", nillable = true)
    protected String rowMod;
    @XmlElement(name = "SalesUM", nillable = true)
    protected String salesUM;
    @XmlElement(name = "Selected", nillable = true)
    protected Boolean selected;
    @XmlElement(name = "SubPart", nillable = true)
    protected String subPart;
    @XmlElement(name = "SubPartIUM", nillable = true)
    protected String subPartIUM;
    @XmlElement(name = "SubPartPartDescription", nillable = true)
    protected String subPartPartDescription;
    @XmlElement(name = "SubPartPricePerCode", nillable = true)
    protected String subPartPricePerCode;
    @XmlElement(name = "SubPartSalesUM", nillable = true)
    protected String subPartSalesUM;
    @XmlElement(name = "SubPartSellingFactor", nillable = true)
    protected BigDecimal subPartSellingFactor;
    @XmlElement(name = "SubPartTrackDimension", nillable = true)
    protected Boolean subPartTrackDimension;
    @XmlElement(name = "SubPartTrackLots", nillable = true)
    protected Boolean subPartTrackLots;
    @XmlElement(name = "SubPartTrackSerialNum", nillable = true)
    protected Boolean subPartTrackSerialNum;
    @XmlElement(name = "SubType", nillable = true)
    protected String subType;
    @XmlElement(name = "SugOrderQty", nillable = true)
    protected BigDecimal sugOrderQty;
    @XmlElement(name = "SuggestedQty", nillable = true)
    protected BigDecimal suggestedQty;
    @XmlElement(name = "SysRevID", nillable = true)
    protected Integer sysRevID;
    @XmlElement(name = "SysRowID", nillable = true)
    protected String sysRowID;

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
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
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
     * Gets the value of the defaultSub property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultSub() {
        return defaultSub;
    }

    /**
     * Sets the value of the defaultSub property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultSub(Boolean value) {
        this.defaultSub = value;
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
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    /**
     * Gets the value of the qtyPer property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQtyPer() {
        return qtyPer;
    }

    /**
     * Sets the value of the qtyPer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQtyPer(BigDecimal value) {
        this.qtyPer = value;
    }

    /**
     * Gets the value of the recType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecType() {
        return recType;
    }

    /**
     * Sets the value of the recType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecType(String value) {
        this.recType = value;
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
     * Gets the value of the selected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSelected() {
        return selected;
    }

    /**
     * Sets the value of the selected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSelected(Boolean value) {
        this.selected = value;
    }

    /**
     * Gets the value of the subPart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubPart() {
        return subPart;
    }

    /**
     * Sets the value of the subPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubPart(String value) {
        this.subPart = value;
    }

    /**
     * Gets the value of the subPartIUM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubPartIUM() {
        return subPartIUM;
    }

    /**
     * Sets the value of the subPartIUM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubPartIUM(String value) {
        this.subPartIUM = value;
    }

    /**
     * Gets the value of the subPartPartDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubPartPartDescription() {
        return subPartPartDescription;
    }

    /**
     * Sets the value of the subPartPartDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubPartPartDescription(String value) {
        this.subPartPartDescription = value;
    }

    /**
     * Gets the value of the subPartPricePerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubPartPricePerCode() {
        return subPartPricePerCode;
    }

    /**
     * Sets the value of the subPartPricePerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubPartPricePerCode(String value) {
        this.subPartPricePerCode = value;
    }

    /**
     * Gets the value of the subPartSalesUM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubPartSalesUM() {
        return subPartSalesUM;
    }

    /**
     * Sets the value of the subPartSalesUM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubPartSalesUM(String value) {
        this.subPartSalesUM = value;
    }

    /**
     * Gets the value of the subPartSellingFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubPartSellingFactor() {
        return subPartSellingFactor;
    }

    /**
     * Sets the value of the subPartSellingFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubPartSellingFactor(BigDecimal value) {
        this.subPartSellingFactor = value;
    }

    /**
     * Gets the value of the subPartTrackDimension property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubPartTrackDimension() {
        return subPartTrackDimension;
    }

    /**
     * Sets the value of the subPartTrackDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubPartTrackDimension(Boolean value) {
        this.subPartTrackDimension = value;
    }

    /**
     * Gets the value of the subPartTrackLots property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubPartTrackLots() {
        return subPartTrackLots;
    }

    /**
     * Sets the value of the subPartTrackLots property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubPartTrackLots(Boolean value) {
        this.subPartTrackLots = value;
    }

    /**
     * Gets the value of the subPartTrackSerialNum property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubPartTrackSerialNum() {
        return subPartTrackSerialNum;
    }

    /**
     * Sets the value of the subPartTrackSerialNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubPartTrackSerialNum(Boolean value) {
        this.subPartTrackSerialNum = value;
    }

    /**
     * Gets the value of the subType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubType() {
        return subType;
    }

    /**
     * Sets the value of the subType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubType(String value) {
        this.subType = value;
    }

    /**
     * Gets the value of the sugOrderQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSugOrderQty() {
        return sugOrderQty;
    }

    /**
     * Sets the value of the sugOrderQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSugOrderQty(BigDecimal value) {
        this.sugOrderQty = value;
    }

    /**
     * Gets the value of the suggestedQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSuggestedQty() {
        return suggestedQty;
    }

    /**
     * Sets the value of the suggestedQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSuggestedQty(BigDecimal value) {
        this.suggestedQty = value;
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

}
