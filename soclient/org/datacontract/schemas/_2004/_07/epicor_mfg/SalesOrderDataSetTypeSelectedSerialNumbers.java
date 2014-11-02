
package org.datacontract.schemas._2004._07.epicor_mfg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SalesOrderDataSetTypeSelectedSerialNumbers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrderDataSetTypeSelectedSerialNumbers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DBRowIdent" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="Deselected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="KBLbrAction" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="KBLbrActionDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KitWhseList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PassedInspection" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PreDeselected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PreventDeselect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RawSerialNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReasonCodeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReasonCodeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RowIdent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RowMod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SNBaseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SNPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Scrapped" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ScrappedReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceRowID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Voided" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="XRefPartNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XRefPartType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesOrderDataSetTypeSelectedSerialNumbers", propOrder = {
    "company",
    "dbRowIdent",
    "deselected",
    "kbLbrAction",
    "kbLbrActionDesc",
    "kitWhseList",
    "partNum",
    "passedInspection",
    "preDeselected",
    "preventDeselect",
    "rawSerialNum",
    "reasonCodeDesc",
    "reasonCodeType",
    "reference",
    "rowIdent",
    "rowMod",
    "snBaseNumber",
    "snPrefix",
    "scrapped",
    "scrappedReasonCode",
    "serialNumber",
    "sourceRowID",
    "transType",
    "voided",
    "xRefPartNum",
    "xRefPartType"
})
public class SalesOrderDataSetTypeSelectedSerialNumbers {

    @XmlElement(name = "Company", nillable = true)
    protected String company;
    @XmlElement(name = "DBRowIdent", nillable = true)
    protected byte[] dbRowIdent;
    @XmlElement(name = "Deselected", nillable = true)
    protected Boolean deselected;
    @XmlElement(name = "KBLbrAction", nillable = true)
    protected Integer kbLbrAction;
    @XmlElement(name = "KBLbrActionDesc", nillable = true)
    protected String kbLbrActionDesc;
    @XmlElement(name = "KitWhseList", nillable = true)
    protected String kitWhseList;
    @XmlElement(name = "PartNum", nillable = true)
    protected String partNum;
    @XmlElement(name = "PassedInspection", nillable = true)
    protected Boolean passedInspection;
    @XmlElement(name = "PreDeselected", nillable = true)
    protected Boolean preDeselected;
    @XmlElement(name = "PreventDeselect", nillable = true)
    protected Boolean preventDeselect;
    @XmlElement(name = "RawSerialNum", nillable = true)
    protected String rawSerialNum;
    @XmlElement(name = "ReasonCodeDesc", nillable = true)
    protected String reasonCodeDesc;
    @XmlElement(name = "ReasonCodeType", nillable = true)
    protected String reasonCodeType;
    @XmlElement(name = "Reference", nillable = true)
    protected String reference;
    @XmlElement(name = "RowIdent", nillable = true)
    protected String rowIdent;
    @XmlElement(name = "RowMod", nillable = true)
    protected String rowMod;
    @XmlElement(name = "SNBaseNumber", nillable = true)
    protected String snBaseNumber;
    @XmlElement(name = "SNPrefix", nillable = true)
    protected String snPrefix;
    @XmlElement(name = "Scrapped", nillable = true)
    protected Boolean scrapped;
    @XmlElement(name = "ScrappedReasonCode", nillable = true)
    protected String scrappedReasonCode;
    @XmlElement(name = "SerialNumber", nillable = true)
    protected String serialNumber;
    @XmlElement(name = "SourceRowID", nillable = true)
    protected String sourceRowID;
    @XmlElement(name = "TransType", nillable = true)
    protected String transType;
    @XmlElement(name = "Voided", nillable = true)
    protected Boolean voided;
    @XmlElement(name = "XRefPartNum", nillable = true)
    protected String xRefPartNum;
    @XmlElement(name = "XRefPartType", nillable = true)
    protected String xRefPartType;

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
     * Gets the value of the deselected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeselected() {
        return deselected;
    }

    /**
     * Sets the value of the deselected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeselected(Boolean value) {
        this.deselected = value;
    }

    /**
     * Gets the value of the kbLbrAction property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKBLbrAction() {
        return kbLbrAction;
    }

    /**
     * Sets the value of the kbLbrAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKBLbrAction(Integer value) {
        this.kbLbrAction = value;
    }

    /**
     * Gets the value of the kbLbrActionDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKBLbrActionDesc() {
        return kbLbrActionDesc;
    }

    /**
     * Sets the value of the kbLbrActionDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKBLbrActionDesc(String value) {
        this.kbLbrActionDesc = value;
    }

    /**
     * Gets the value of the kitWhseList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKitWhseList() {
        return kitWhseList;
    }

    /**
     * Sets the value of the kitWhseList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKitWhseList(String value) {
        this.kitWhseList = value;
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
     * Gets the value of the passedInspection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPassedInspection() {
        return passedInspection;
    }

    /**
     * Sets the value of the passedInspection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPassedInspection(Boolean value) {
        this.passedInspection = value;
    }

    /**
     * Gets the value of the preDeselected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreDeselected() {
        return preDeselected;
    }

    /**
     * Sets the value of the preDeselected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreDeselected(Boolean value) {
        this.preDeselected = value;
    }

    /**
     * Gets the value of the preventDeselect property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreventDeselect() {
        return preventDeselect;
    }

    /**
     * Sets the value of the preventDeselect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreventDeselect(Boolean value) {
        this.preventDeselect = value;
    }

    /**
     * Gets the value of the rawSerialNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRawSerialNum() {
        return rawSerialNum;
    }

    /**
     * Sets the value of the rawSerialNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRawSerialNum(String value) {
        this.rawSerialNum = value;
    }

    /**
     * Gets the value of the reasonCodeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCodeDesc() {
        return reasonCodeDesc;
    }

    /**
     * Sets the value of the reasonCodeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCodeDesc(String value) {
        this.reasonCodeDesc = value;
    }

    /**
     * Gets the value of the reasonCodeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCodeType() {
        return reasonCodeType;
    }

    /**
     * Sets the value of the reasonCodeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCodeType(String value) {
        this.reasonCodeType = value;
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
     * Gets the value of the snBaseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNBaseNumber() {
        return snBaseNumber;
    }

    /**
     * Sets the value of the snBaseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNBaseNumber(String value) {
        this.snBaseNumber = value;
    }

    /**
     * Gets the value of the snPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNPrefix() {
        return snPrefix;
    }

    /**
     * Sets the value of the snPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNPrefix(String value) {
        this.snPrefix = value;
    }

    /**
     * Gets the value of the scrapped property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScrapped() {
        return scrapped;
    }

    /**
     * Sets the value of the scrapped property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScrapped(Boolean value) {
        this.scrapped = value;
    }

    /**
     * Gets the value of the scrappedReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScrappedReasonCode() {
        return scrappedReasonCode;
    }

    /**
     * Sets the value of the scrappedReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScrappedReasonCode(String value) {
        this.scrappedReasonCode = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the sourceRowID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceRowID() {
        return sourceRowID;
    }

    /**
     * Sets the value of the sourceRowID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceRowID(String value) {
        this.sourceRowID = value;
    }

    /**
     * Gets the value of the transType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransType() {
        return transType;
    }

    /**
     * Sets the value of the transType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransType(String value) {
        this.transType = value;
    }

    /**
     * Gets the value of the voided property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVoided() {
        return voided;
    }

    /**
     * Sets the value of the voided property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVoided(Boolean value) {
        this.voided = value;
    }

    /**
     * Gets the value of the xRefPartNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXRefPartNum() {
        return xRefPartNum;
    }

    /**
     * Sets the value of the xRefPartNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXRefPartNum(String value) {
        this.xRefPartNum = value;
    }

    /**
     * Gets the value of the xRefPartType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXRefPartType() {
        return xRefPartType;
    }

    /**
     * Sets the value of the xRefPartType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXRefPartType(String value) {
        this.xRefPartType = value;
    }

}
