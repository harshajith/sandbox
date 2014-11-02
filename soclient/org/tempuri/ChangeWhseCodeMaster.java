
package org.tempuri;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.epicor.webservices.CallContextDataSetType;
import com.epicor.webservices.SalesOrderDataSetType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loginOptions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ds" type="{http://epicor.com/webservices}SalesOrderDataSetType" minOccurs="0"/>
 *         &lt;element name="negInvTest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="chgDtlWhse" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="suppressUserPrompts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="pcPartNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcWhseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcBinNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcLotNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcDimCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pdDimConvFactor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="pdSellingQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="callContext" type="{http://epicor.com/webservices}CallContextDataSetType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "loginOptions",
    "ds",
    "negInvTest",
    "chgDtlWhse",
    "suppressUserPrompts",
    "pcPartNum",
    "pcWhseCode",
    "pcBinNum",
    "pcLotNum",
    "pcDimCode",
    "pdDimConvFactor",
    "pdSellingQuantity",
    "callContext"
})
@XmlRootElement(name = "ChangeWhseCodeMaster")
public class ChangeWhseCodeMaster {

    @XmlElement(nillable = true)
    protected String loginOptions;
    @XmlElement(nillable = true)
    protected SalesOrderDataSetType ds;
    protected Boolean negInvTest;
    protected Boolean chgDtlWhse;
    protected Boolean suppressUserPrompts;
    @XmlElement(nillable = true)
    protected String pcPartNum;
    @XmlElement(nillable = true)
    protected String pcWhseCode;
    @XmlElement(nillable = true)
    protected String pcBinNum;
    @XmlElement(nillable = true)
    protected String pcLotNum;
    @XmlElement(nillable = true)
    protected String pcDimCode;
    protected BigDecimal pdDimConvFactor;
    protected BigDecimal pdSellingQuantity;
    @XmlElement(nillable = true)
    protected CallContextDataSetType callContext;

    /**
     * Gets the value of the loginOptions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginOptions() {
        return loginOptions;
    }

    /**
     * Sets the value of the loginOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginOptions(String value) {
        this.loginOptions = value;
    }

    /**
     * Gets the value of the ds property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderDataSetType }
     *     
     */
    public SalesOrderDataSetType getDs() {
        return ds;
    }

    /**
     * Sets the value of the ds property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderDataSetType }
     *     
     */
    public void setDs(SalesOrderDataSetType value) {
        this.ds = value;
    }

    /**
     * Gets the value of the negInvTest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNegInvTest() {
        return negInvTest;
    }

    /**
     * Sets the value of the negInvTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNegInvTest(Boolean value) {
        this.negInvTest = value;
    }

    /**
     * Gets the value of the chgDtlWhse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChgDtlWhse() {
        return chgDtlWhse;
    }

    /**
     * Sets the value of the chgDtlWhse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChgDtlWhse(Boolean value) {
        this.chgDtlWhse = value;
    }

    /**
     * Gets the value of the suppressUserPrompts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuppressUserPrompts() {
        return suppressUserPrompts;
    }

    /**
     * Sets the value of the suppressUserPrompts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuppressUserPrompts(Boolean value) {
        this.suppressUserPrompts = value;
    }

    /**
     * Gets the value of the pcPartNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcPartNum() {
        return pcPartNum;
    }

    /**
     * Sets the value of the pcPartNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcPartNum(String value) {
        this.pcPartNum = value;
    }

    /**
     * Gets the value of the pcWhseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcWhseCode() {
        return pcWhseCode;
    }

    /**
     * Sets the value of the pcWhseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcWhseCode(String value) {
        this.pcWhseCode = value;
    }

    /**
     * Gets the value of the pcBinNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcBinNum() {
        return pcBinNum;
    }

    /**
     * Sets the value of the pcBinNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcBinNum(String value) {
        this.pcBinNum = value;
    }

    /**
     * Gets the value of the pcLotNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcLotNum() {
        return pcLotNum;
    }

    /**
     * Sets the value of the pcLotNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcLotNum(String value) {
        this.pcLotNum = value;
    }

    /**
     * Gets the value of the pcDimCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcDimCode() {
        return pcDimCode;
    }

    /**
     * Sets the value of the pcDimCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcDimCode(String value) {
        this.pcDimCode = value;
    }

    /**
     * Gets the value of the pdDimConvFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPdDimConvFactor() {
        return pdDimConvFactor;
    }

    /**
     * Sets the value of the pdDimConvFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPdDimConvFactor(BigDecimal value) {
        this.pdDimConvFactor = value;
    }

    /**
     * Gets the value of the pdSellingQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPdSellingQuantity() {
        return pdSellingQuantity;
    }

    /**
     * Sets the value of the pdSellingQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPdSellingQuantity(BigDecimal value) {
        this.pdSellingQuantity = value;
    }

    /**
     * Gets the value of the callContext property.
     * 
     * @return
     *     possible object is
     *     {@link CallContextDataSetType }
     *     
     */
    public CallContextDataSetType getCallContext() {
        return callContext;
    }

    /**
     * Sets the value of the callContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallContextDataSetType }
     *     
     */
    public void setCallContext(CallContextDataSetType value) {
        this.callContext = value;
    }

}
