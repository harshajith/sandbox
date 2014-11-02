
package org.datacontract.schemas._2004._07.epicor_mfg;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CallContextDataSetTypeBpmData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CallContextDataSetTypeBpmData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ButtonValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
 *         &lt;element name="Checkbox01" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Checkbox02" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Checkbox03" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Checkbox04" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Checkbox05" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Checkbox06" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Checkbox07" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Checkbox08" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Checkbox09" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Checkbox10" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RowIdent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RowMod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallContextDataSetTypeBpmData", propOrder = {
    "buttonValue",
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
    "checkbox01",
    "checkbox02",
    "checkbox03",
    "checkbox04",
    "checkbox05",
    "checkbox06",
    "checkbox07",
    "checkbox08",
    "checkbox09",
    "checkbox10",
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
    "password",
    "rowIdent",
    "rowMod",
    "shortChar01",
    "shortChar02",
    "shortChar03",
    "shortChar04",
    "shortChar05",
    "shortChar06",
    "shortChar07",
    "shortChar08",
    "shortChar09",
    "shortChar10"
})
public class CallContextDataSetTypeBpmData {

    @XmlElement(name = "ButtonValue", nillable = true)
    protected Integer buttonValue;
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
    @XmlElement(name = "Checkbox01", nillable = true)
    protected Boolean checkbox01;
    @XmlElement(name = "Checkbox02", nillable = true)
    protected Boolean checkbox02;
    @XmlElement(name = "Checkbox03", nillable = true)
    protected Boolean checkbox03;
    @XmlElement(name = "Checkbox04", nillable = true)
    protected Boolean checkbox04;
    @XmlElement(name = "Checkbox05", nillable = true)
    protected Boolean checkbox05;
    @XmlElement(name = "Checkbox06", nillable = true)
    protected Boolean checkbox06;
    @XmlElement(name = "Checkbox07", nillable = true)
    protected Boolean checkbox07;
    @XmlElement(name = "Checkbox08", nillable = true)
    protected Boolean checkbox08;
    @XmlElement(name = "Checkbox09", nillable = true)
    protected Boolean checkbox09;
    @XmlElement(name = "Checkbox10", nillable = true)
    protected Boolean checkbox10;
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
    @XmlElement(name = "Password", nillable = true)
    protected String password;
    @XmlElement(name = "RowIdent", nillable = true)
    protected String rowIdent;
    @XmlElement(name = "RowMod", nillable = true)
    protected String rowMod;
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

    /**
     * Gets the value of the buttonValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getButtonValue() {
        return buttonValue;
    }

    /**
     * Sets the value of the buttonValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setButtonValue(Integer value) {
        this.buttonValue = value;
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
     * Gets the value of the checkbox01 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckbox01() {
        return checkbox01;
    }

    /**
     * Sets the value of the checkbox01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckbox01(Boolean value) {
        this.checkbox01 = value;
    }

    /**
     * Gets the value of the checkbox02 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckbox02() {
        return checkbox02;
    }

    /**
     * Sets the value of the checkbox02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckbox02(Boolean value) {
        this.checkbox02 = value;
    }

    /**
     * Gets the value of the checkbox03 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckbox03() {
        return checkbox03;
    }

    /**
     * Sets the value of the checkbox03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckbox03(Boolean value) {
        this.checkbox03 = value;
    }

    /**
     * Gets the value of the checkbox04 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckbox04() {
        return checkbox04;
    }

    /**
     * Sets the value of the checkbox04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckbox04(Boolean value) {
        this.checkbox04 = value;
    }

    /**
     * Gets the value of the checkbox05 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckbox05() {
        return checkbox05;
    }

    /**
     * Sets the value of the checkbox05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckbox05(Boolean value) {
        this.checkbox05 = value;
    }

    /**
     * Gets the value of the checkbox06 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckbox06() {
        return checkbox06;
    }

    /**
     * Sets the value of the checkbox06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckbox06(Boolean value) {
        this.checkbox06 = value;
    }

    /**
     * Gets the value of the checkbox07 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckbox07() {
        return checkbox07;
    }

    /**
     * Sets the value of the checkbox07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckbox07(Boolean value) {
        this.checkbox07 = value;
    }

    /**
     * Gets the value of the checkbox08 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckbox08() {
        return checkbox08;
    }

    /**
     * Sets the value of the checkbox08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckbox08(Boolean value) {
        this.checkbox08 = value;
    }

    /**
     * Gets the value of the checkbox09 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckbox09() {
        return checkbox09;
    }

    /**
     * Sets the value of the checkbox09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckbox09(Boolean value) {
        this.checkbox09 = value;
    }

    /**
     * Gets the value of the checkbox10 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckbox10() {
        return checkbox10;
    }

    /**
     * Sets the value of the checkbox10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckbox10(Boolean value) {
        this.checkbox10 = value;
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
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
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

}
