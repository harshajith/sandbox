
package org.datacontract.schemas._2004._07.epicor_mfg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SelectSerialNumbersParamsDataSetTypeSelectSerialNumbersParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectSerialNumbersParamsDataSetTypeSelectSerialNumbersParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DBRowIdent" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="RowIdent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RowMod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="allowVoided" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableCreate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableRetrieve" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableSelect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="partNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="plant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sourceRowID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="whereClause" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xrefCustNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="xrefPartNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xrefPartType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectSerialNumbersParamsDataSetTypeSelectSerialNumbersParams", propOrder = {
    "dbRowIdent",
    "rowIdent",
    "rowMod",
    "allowVoided",
    "enableCreate",
    "enableRetrieve",
    "enableSelect",
    "partNum",
    "plant",
    "quantity",
    "sourceRowID",
    "transType",
    "whereClause",
    "xrefCustNum",
    "xrefPartNum",
    "xrefPartType"
})
public class SelectSerialNumbersParamsDataSetTypeSelectSerialNumbersParams {

    @XmlElement(name = "DBRowIdent", nillable = true)
    protected byte[] dbRowIdent;
    @XmlElement(name = "RowIdent", nillable = true)
    protected String rowIdent;
    @XmlElement(name = "RowMod", nillable = true)
    protected String rowMod;
    @XmlElement(nillable = true)
    protected Boolean allowVoided;
    @XmlElement(nillable = true)
    protected Boolean enableCreate;
    @XmlElement(nillable = true)
    protected Boolean enableRetrieve;
    @XmlElement(nillable = true)
    protected Boolean enableSelect;
    @XmlElement(nillable = true)
    protected String partNum;
    @XmlElement(nillable = true)
    protected String plant;
    @XmlElement(nillable = true)
    protected Integer quantity;
    @XmlElement(nillable = true)
    protected String sourceRowID;
    @XmlElement(nillable = true)
    protected String transType;
    @XmlElement(nillable = true)
    protected String whereClause;
    @XmlElement(nillable = true)
    protected Integer xrefCustNum;
    @XmlElement(nillable = true)
    protected String xrefPartNum;
    @XmlElement(nillable = true)
    protected String xrefPartType;

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
     * Gets the value of the allowVoided property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowVoided() {
        return allowVoided;
    }

    /**
     * Sets the value of the allowVoided property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowVoided(Boolean value) {
        this.allowVoided = value;
    }

    /**
     * Gets the value of the enableCreate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableCreate() {
        return enableCreate;
    }

    /**
     * Sets the value of the enableCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableCreate(Boolean value) {
        this.enableCreate = value;
    }

    /**
     * Gets the value of the enableRetrieve property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableRetrieve() {
        return enableRetrieve;
    }

    /**
     * Sets the value of the enableRetrieve property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableRetrieve(Boolean value) {
        this.enableRetrieve = value;
    }

    /**
     * Gets the value of the enableSelect property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableSelect() {
        return enableSelect;
    }

    /**
     * Sets the value of the enableSelect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableSelect(Boolean value) {
        this.enableSelect = value;
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
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantity(Integer value) {
        this.quantity = value;
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
     * Gets the value of the whereClause property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhereClause() {
        return whereClause;
    }

    /**
     * Sets the value of the whereClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhereClause(String value) {
        this.whereClause = value;
    }

    /**
     * Gets the value of the xrefCustNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getXrefCustNum() {
        return xrefCustNum;
    }

    /**
     * Sets the value of the xrefCustNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setXrefCustNum(Integer value) {
        this.xrefCustNum = value;
    }

    /**
     * Gets the value of the xrefPartNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXrefPartNum() {
        return xrefPartNum;
    }

    /**
     * Sets the value of the xrefPartNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXrefPartNum(String value) {
        this.xrefPartNum = value;
    }

    /**
     * Gets the value of the xrefPartType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXrefPartType() {
        return xrefPartType;
    }

    /**
     * Sets the value of the xrefPartType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXrefPartType(String value) {
        this.xrefPartType = value;
    }

}
