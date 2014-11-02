
package org.datacontract.schemas._2004._07.epicor_mfg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SOEntryUIParamsDataSetTypeSOEntryUIParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SOEntryUIParamsDataSetTypeSOEntryUIParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CCAllowSales" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CCEnableAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CCEnableCSC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CalcQtysPreference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DBRowIdent" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="EnableICPOSugTool" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Localization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrjAllowWBSPhase" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RowIdent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RowMod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SOReadyToCalcDflt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SuppressSOMakeDirWrn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UseTerritorySecurity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SOEntryUIParamsDataSetTypeSOEntryUIParams", propOrder = {
    "ccAllowSales",
    "ccEnableAddress",
    "ccEnableCSC",
    "calcQtysPreference",
    "dbRowIdent",
    "enableICPOSugTool",
    "localization",
    "prjAllowWBSPhase",
    "rowIdent",
    "rowMod",
    "soReadyToCalcDflt",
    "suppressSOMakeDirWrn",
    "useTerritorySecurity"
})
public class SOEntryUIParamsDataSetTypeSOEntryUIParams {

    @XmlElement(name = "CCAllowSales", nillable = true)
    protected Boolean ccAllowSales;
    @XmlElement(name = "CCEnableAddress", nillable = true)
    protected Boolean ccEnableAddress;
    @XmlElement(name = "CCEnableCSC", nillable = true)
    protected Boolean ccEnableCSC;
    @XmlElement(name = "CalcQtysPreference", nillable = true)
    protected Boolean calcQtysPreference;
    @XmlElement(name = "DBRowIdent", nillable = true)
    protected byte[] dbRowIdent;
    @XmlElement(name = "EnableICPOSugTool", nillable = true)
    protected Boolean enableICPOSugTool;
    @XmlElement(name = "Localization", nillable = true)
    protected String localization;
    @XmlElement(name = "PrjAllowWBSPhase", nillable = true)
    protected Boolean prjAllowWBSPhase;
    @XmlElement(name = "RowIdent", nillable = true)
    protected String rowIdent;
    @XmlElement(name = "RowMod", nillable = true)
    protected String rowMod;
    @XmlElement(name = "SOReadyToCalcDflt", nillable = true)
    protected Boolean soReadyToCalcDflt;
    @XmlElement(name = "SuppressSOMakeDirWrn", nillable = true)
    protected Boolean suppressSOMakeDirWrn;
    @XmlElement(name = "UseTerritorySecurity", nillable = true)
    protected Boolean useTerritorySecurity;

    /**
     * Gets the value of the ccAllowSales property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCCAllowSales() {
        return ccAllowSales;
    }

    /**
     * Sets the value of the ccAllowSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCCAllowSales(Boolean value) {
        this.ccAllowSales = value;
    }

    /**
     * Gets the value of the ccEnableAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCCEnableAddress() {
        return ccEnableAddress;
    }

    /**
     * Sets the value of the ccEnableAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCCEnableAddress(Boolean value) {
        this.ccEnableAddress = value;
    }

    /**
     * Gets the value of the ccEnableCSC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCCEnableCSC() {
        return ccEnableCSC;
    }

    /**
     * Sets the value of the ccEnableCSC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCCEnableCSC(Boolean value) {
        this.ccEnableCSC = value;
    }

    /**
     * Gets the value of the calcQtysPreference property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCalcQtysPreference() {
        return calcQtysPreference;
    }

    /**
     * Sets the value of the calcQtysPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCalcQtysPreference(Boolean value) {
        this.calcQtysPreference = value;
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
     * Gets the value of the enableICPOSugTool property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableICPOSugTool() {
        return enableICPOSugTool;
    }

    /**
     * Sets the value of the enableICPOSugTool property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableICPOSugTool(Boolean value) {
        this.enableICPOSugTool = value;
    }

    /**
     * Gets the value of the localization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalization() {
        return localization;
    }

    /**
     * Sets the value of the localization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalization(String value) {
        this.localization = value;
    }

    /**
     * Gets the value of the prjAllowWBSPhase property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrjAllowWBSPhase() {
        return prjAllowWBSPhase;
    }

    /**
     * Sets the value of the prjAllowWBSPhase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrjAllowWBSPhase(Boolean value) {
        this.prjAllowWBSPhase = value;
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
     * Gets the value of the soReadyToCalcDflt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSOReadyToCalcDflt() {
        return soReadyToCalcDflt;
    }

    /**
     * Sets the value of the soReadyToCalcDflt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSOReadyToCalcDflt(Boolean value) {
        this.soReadyToCalcDflt = value;
    }

    /**
     * Gets the value of the suppressSOMakeDirWrn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuppressSOMakeDirWrn() {
        return suppressSOMakeDirWrn;
    }

    /**
     * Sets the value of the suppressSOMakeDirWrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuppressSOMakeDirWrn(Boolean value) {
        this.suppressSOMakeDirWrn = value;
    }

    /**
     * Gets the value of the useTerritorySecurity property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseTerritorySecurity() {
        return useTerritorySecurity;
    }

    /**
     * Sets the value of the useTerritorySecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseTerritorySecurity(Boolean value) {
        this.useTerritorySecurity = value;
    }

}
