
package org.datacontract.schemas._2004._07.epicor_mfg;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SalesOrderDataSetTypeSNFormat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrderDataSetTypeSNFormat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DBRowIdent" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="HasSerialNumbers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LeadingZeroes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NumberOfDigits" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PartIUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartPartDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartPricePerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartSalesUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartSellingFactor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PartTrackDimension" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PartTrackLots" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PartTrackSerialNum" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Plant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RowIdent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RowMod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SNBaseDataType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SNFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SNLastUsedSeq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SNMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SNMaskPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SNMaskSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SNPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SerialMaskDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SerialMaskExample" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SerialMaskMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SerialMaskMaskType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "SalesOrderDataSetTypeSNFormat", propOrder = {
    "company",
    "dbRowIdent",
    "hasSerialNumbers",
    "leadingZeroes",
    "numberOfDigits",
    "partIUM",
    "partNum",
    "partPartDescription",
    "partPricePerCode",
    "partSalesUM",
    "partSellingFactor",
    "partTrackDimension",
    "partTrackLots",
    "partTrackSerialNum",
    "plant",
    "rowIdent",
    "rowMod",
    "snBaseDataType",
    "snFormat",
    "snLastUsedSeq",
    "snMask",
    "snMaskPrefix",
    "snMaskSuffix",
    "snPrefix",
    "serialMaskDescription",
    "serialMaskExample",
    "serialMaskMask",
    "serialMaskMaskType",
    "sysRowID"
})
public class SalesOrderDataSetTypeSNFormat {

    @XmlElement(name = "Company", nillable = true)
    protected String company;
    @XmlElement(name = "DBRowIdent", nillable = true)
    protected byte[] dbRowIdent;
    @XmlElement(name = "HasSerialNumbers", nillable = true)
    protected Boolean hasSerialNumbers;
    @XmlElement(name = "LeadingZeroes", nillable = true)
    protected Boolean leadingZeroes;
    @XmlElement(name = "NumberOfDigits", nillable = true)
    protected Integer numberOfDigits;
    @XmlElement(name = "PartIUM", nillable = true)
    protected String partIUM;
    @XmlElement(name = "PartNum", nillable = true)
    protected String partNum;
    @XmlElement(name = "PartPartDescription", nillable = true)
    protected String partPartDescription;
    @XmlElement(name = "PartPricePerCode", nillable = true)
    protected String partPricePerCode;
    @XmlElement(name = "PartSalesUM", nillable = true)
    protected String partSalesUM;
    @XmlElement(name = "PartSellingFactor", nillable = true)
    protected BigDecimal partSellingFactor;
    @XmlElement(name = "PartTrackDimension", nillable = true)
    protected Boolean partTrackDimension;
    @XmlElement(name = "PartTrackLots", nillable = true)
    protected Boolean partTrackLots;
    @XmlElement(name = "PartTrackSerialNum", nillable = true)
    protected Boolean partTrackSerialNum;
    @XmlElement(name = "Plant", nillable = true)
    protected String plant;
    @XmlElement(name = "RowIdent", nillable = true)
    protected String rowIdent;
    @XmlElement(name = "RowMod", nillable = true)
    protected String rowMod;
    @XmlElement(name = "SNBaseDataType", nillable = true)
    protected String snBaseDataType;
    @XmlElement(name = "SNFormat", nillable = true)
    protected String snFormat;
    @XmlElement(name = "SNLastUsedSeq", nillable = true)
    protected String snLastUsedSeq;
    @XmlElement(name = "SNMask", nillable = true)
    protected String snMask;
    @XmlElement(name = "SNMaskPrefix", nillable = true)
    protected String snMaskPrefix;
    @XmlElement(name = "SNMaskSuffix", nillable = true)
    protected String snMaskSuffix;
    @XmlElement(name = "SNPrefix", nillable = true)
    protected String snPrefix;
    @XmlElement(name = "SerialMaskDescription", nillable = true)
    protected String serialMaskDescription;
    @XmlElement(name = "SerialMaskExample", nillable = true)
    protected String serialMaskExample;
    @XmlElement(name = "SerialMaskMask", nillable = true)
    protected String serialMaskMask;
    @XmlElement(name = "SerialMaskMaskType", nillable = true)
    protected Integer serialMaskMaskType;
    @XmlElement(name = "SysRowID", nillable = true)
    protected String sysRowID;

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
     * Gets the value of the hasSerialNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasSerialNumbers() {
        return hasSerialNumbers;
    }

    /**
     * Sets the value of the hasSerialNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasSerialNumbers(Boolean value) {
        this.hasSerialNumbers = value;
    }

    /**
     * Gets the value of the leadingZeroes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLeadingZeroes() {
        return leadingZeroes;
    }

    /**
     * Sets the value of the leadingZeroes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLeadingZeroes(Boolean value) {
        this.leadingZeroes = value;
    }

    /**
     * Gets the value of the numberOfDigits property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfDigits() {
        return numberOfDigits;
    }

    /**
     * Sets the value of the numberOfDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfDigits(Integer value) {
        this.numberOfDigits = value;
    }

    /**
     * Gets the value of the partIUM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartIUM() {
        return partIUM;
    }

    /**
     * Sets the value of the partIUM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartIUM(String value) {
        this.partIUM = value;
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
     * Gets the value of the partPartDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartPartDescription() {
        return partPartDescription;
    }

    /**
     * Sets the value of the partPartDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartPartDescription(String value) {
        this.partPartDescription = value;
    }

    /**
     * Gets the value of the partPricePerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartPricePerCode() {
        return partPricePerCode;
    }

    /**
     * Sets the value of the partPricePerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartPricePerCode(String value) {
        this.partPricePerCode = value;
    }

    /**
     * Gets the value of the partSalesUM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartSalesUM() {
        return partSalesUM;
    }

    /**
     * Sets the value of the partSalesUM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartSalesUM(String value) {
        this.partSalesUM = value;
    }

    /**
     * Gets the value of the partSellingFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPartSellingFactor() {
        return partSellingFactor;
    }

    /**
     * Sets the value of the partSellingFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPartSellingFactor(BigDecimal value) {
        this.partSellingFactor = value;
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
     * Gets the value of the partTrackSerialNum property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartTrackSerialNum() {
        return partTrackSerialNum;
    }

    /**
     * Sets the value of the partTrackSerialNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartTrackSerialNum(Boolean value) {
        this.partTrackSerialNum = value;
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
     * Gets the value of the snBaseDataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNBaseDataType() {
        return snBaseDataType;
    }

    /**
     * Sets the value of the snBaseDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNBaseDataType(String value) {
        this.snBaseDataType = value;
    }

    /**
     * Gets the value of the snFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNFormat() {
        return snFormat;
    }

    /**
     * Sets the value of the snFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNFormat(String value) {
        this.snFormat = value;
    }

    /**
     * Gets the value of the snLastUsedSeq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNLastUsedSeq() {
        return snLastUsedSeq;
    }

    /**
     * Sets the value of the snLastUsedSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNLastUsedSeq(String value) {
        this.snLastUsedSeq = value;
    }

    /**
     * Gets the value of the snMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNMask() {
        return snMask;
    }

    /**
     * Sets the value of the snMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNMask(String value) {
        this.snMask = value;
    }

    /**
     * Gets the value of the snMaskPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNMaskPrefix() {
        return snMaskPrefix;
    }

    /**
     * Sets the value of the snMaskPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNMaskPrefix(String value) {
        this.snMaskPrefix = value;
    }

    /**
     * Gets the value of the snMaskSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNMaskSuffix() {
        return snMaskSuffix;
    }

    /**
     * Sets the value of the snMaskSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNMaskSuffix(String value) {
        this.snMaskSuffix = value;
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
     * Gets the value of the serialMaskDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialMaskDescription() {
        return serialMaskDescription;
    }

    /**
     * Sets the value of the serialMaskDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialMaskDescription(String value) {
        this.serialMaskDescription = value;
    }

    /**
     * Gets the value of the serialMaskExample property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialMaskExample() {
        return serialMaskExample;
    }

    /**
     * Sets the value of the serialMaskExample property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialMaskExample(String value) {
        this.serialMaskExample = value;
    }

    /**
     * Gets the value of the serialMaskMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialMaskMask() {
        return serialMaskMask;
    }

    /**
     * Sets the value of the serialMaskMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialMaskMask(String value) {
        this.serialMaskMask = value;
    }

    /**
     * Gets the value of the serialMaskMaskType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSerialMaskMaskType() {
        return serialMaskMaskType;
    }

    /**
     * Sets the value of the serialMaskMaskType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSerialMaskMaskType(Integer value) {
        this.serialMaskMaskType = value;
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
