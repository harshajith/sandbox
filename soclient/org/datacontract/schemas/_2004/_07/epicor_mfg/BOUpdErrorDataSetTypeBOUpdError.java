
package org.datacontract.schemas._2004._07.epicor_mfg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BOUpdErrorDataSetTypeBOUpdError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BOUpdErrorDataSetTypeBOUpdError">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DBRowIdent" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *         &lt;element name="ErrorLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorRowIdent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RowIdent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RowMod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SysRowID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TableName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BOUpdErrorDataSetTypeBOUpdError", propOrder = {
    "dbRowIdent",
    "errorLevel",
    "errorRowIdent",
    "errorText",
    "errorType",
    "rowIdent",
    "rowMod",
    "sysRowID",
    "tableName"
})
public class BOUpdErrorDataSetTypeBOUpdError {

    @XmlElement(name = "DBRowIdent")
    @XmlSchemaType(name = "unsignedByte")
    protected Short dbRowIdent;
    @XmlElement(name = "ErrorLevel", nillable = true)
    protected String errorLevel;
    @XmlElement(name = "ErrorRowIdent", nillable = true)
    protected String errorRowIdent;
    @XmlElement(name = "ErrorText", nillable = true)
    protected String errorText;
    @XmlElement(name = "ErrorType", nillable = true)
    protected String errorType;
    @XmlElement(name = "RowIdent", nillable = true)
    protected String rowIdent;
    @XmlElement(name = "RowMod", nillable = true)
    protected String rowMod;
    @XmlElement(name = "SysRowID", nillable = true)
    protected String sysRowID;
    @XmlElement(name = "TableName", nillable = true)
    protected String tableName;

    /**
     * Gets the value of the dbRowIdent property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDBRowIdent() {
        return dbRowIdent;
    }

    /**
     * Sets the value of the dbRowIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDBRowIdent(Short value) {
        this.dbRowIdent = value;
    }

    /**
     * Gets the value of the errorLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorLevel() {
        return errorLevel;
    }

    /**
     * Sets the value of the errorLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorLevel(String value) {
        this.errorLevel = value;
    }

    /**
     * Gets the value of the errorRowIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorRowIdent() {
        return errorRowIdent;
    }

    /**
     * Sets the value of the errorRowIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorRowIdent(String value) {
        this.errorRowIdent = value;
    }

    /**
     * Gets the value of the errorText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorText() {
        return errorText;
    }

    /**
     * Sets the value of the errorText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorText(String value) {
        this.errorText = value;
    }

    /**
     * Gets the value of the errorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorType() {
        return errorType;
    }

    /**
     * Sets the value of the errorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorType(String value) {
        this.errorType = value;
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
     * Gets the value of the tableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * Sets the value of the tableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableName(String value) {
        this.tableName = value;
    }

}
