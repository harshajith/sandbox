
package org.tempuri;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.epicor.webservices.CallContextDataSetType;


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
 *         &lt;element name="pcPartNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcWhseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcBinNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcLotNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcDimCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pdDimConvFactor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="pdTranQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
    "pcPartNum",
    "pcWhseCode",
    "pcBinNum",
    "pcLotNum",
    "pcDimCode",
    "pdDimConvFactor",
    "pdTranQty",
    "callContext"
})
@XmlRootElement(name = "NegativeInventoryTest")
public class NegativeInventoryTest {

    @XmlElement(nillable = true)
    protected String loginOptions;
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
    protected BigDecimal pdTranQty;
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
     * Gets the value of the pdTranQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPdTranQty() {
        return pdTranQty;
    }

    /**
     * Sets the value of the pdTranQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPdTranQty(BigDecimal value) {
        this.pdTranQty = value;
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
