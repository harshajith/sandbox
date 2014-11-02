
package org.datacontract.schemas._2004._07.epicor_mfg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SaveOTSParamsDataSetTypeSaveOTSParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SaveOTSParamsDataSetTypeSaveOTSParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DBRowIdent" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="OTSAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OTSAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OTSAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OTSCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OTSContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OTSCountryNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OTSCustSaved" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OTSFaxNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OTSName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OTSOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OTSPhoneNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OTSResaleID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OTSSaveAs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OTSSaveCustID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OTSSaved" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OTSShipToNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OTSState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OTSTaxRegionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OTSZIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RowIdent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RowMod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveOTSParamsDataSetTypeSaveOTSParams", propOrder = {
    "dbRowIdent",
    "otsAddress1",
    "otsAddress2",
    "otsAddress3",
    "otsCity",
    "otsContact",
    "otsCountryNum",
    "otsCustSaved",
    "otsFaxNum",
    "otsName",
    "otsOverride",
    "otsPhoneNum",
    "otsResaleID",
    "otsSaveAs",
    "otsSaveCustID",
    "otsSaved",
    "otsShipToNum",
    "otsState",
    "otsTaxRegionCode",
    "otszip",
    "rowIdent",
    "rowMod"
})
public class SaveOTSParamsDataSetTypeSaveOTSParams {

    @XmlElement(name = "DBRowIdent", nillable = true)
    protected byte[] dbRowIdent;
    @XmlElement(name = "OTSAddress1", nillable = true)
    protected String otsAddress1;
    @XmlElement(name = "OTSAddress2", nillable = true)
    protected String otsAddress2;
    @XmlElement(name = "OTSAddress3", nillable = true)
    protected String otsAddress3;
    @XmlElement(name = "OTSCity", nillable = true)
    protected String otsCity;
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
    @XmlElement(name = "OTSOverride", nillable = true)
    protected Boolean otsOverride;
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
    @XmlElement(name = "RowIdent", nillable = true)
    protected String rowIdent;
    @XmlElement(name = "RowMod", nillable = true)
    protected String rowMod;

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
     * Gets the value of the otsOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOTSOverride() {
        return otsOverride;
    }

    /**
     * Sets the value of the otsOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOTSOverride(Boolean value) {
        this.otsOverride = value;
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

}
