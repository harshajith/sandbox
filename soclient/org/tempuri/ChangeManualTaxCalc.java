
package org.tempuri;

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
 *         &lt;element name="ipOrderNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ipLineNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ipRelNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ipTaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ipRateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ds" type="{http://epicor.com/webservices}SalesOrderDataSetType" minOccurs="0"/>
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
    "ipOrderNum",
    "ipLineNum",
    "ipRelNum",
    "ipTaxCode",
    "ipRateCode",
    "ds",
    "callContext"
})
@XmlRootElement(name = "ChangeManualTaxCalc")
public class ChangeManualTaxCalc {

    @XmlElement(nillable = true)
    protected String loginOptions;
    protected Integer ipOrderNum;
    protected Integer ipLineNum;
    protected Integer ipRelNum;
    @XmlElement(nillable = true)
    protected String ipTaxCode;
    @XmlElement(nillable = true)
    protected String ipRateCode;
    @XmlElement(nillable = true)
    protected SalesOrderDataSetType ds;
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
     * Gets the value of the ipOrderNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIpOrderNum() {
        return ipOrderNum;
    }

    /**
     * Sets the value of the ipOrderNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIpOrderNum(Integer value) {
        this.ipOrderNum = value;
    }

    /**
     * Gets the value of the ipLineNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIpLineNum() {
        return ipLineNum;
    }

    /**
     * Sets the value of the ipLineNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIpLineNum(Integer value) {
        this.ipLineNum = value;
    }

    /**
     * Gets the value of the ipRelNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIpRelNum() {
        return ipRelNum;
    }

    /**
     * Sets the value of the ipRelNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIpRelNum(Integer value) {
        this.ipRelNum = value;
    }

    /**
     * Gets the value of the ipTaxCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpTaxCode() {
        return ipTaxCode;
    }

    /**
     * Sets the value of the ipTaxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpTaxCode(String value) {
        this.ipTaxCode = value;
    }

    /**
     * Gets the value of the ipRateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpRateCode() {
        return ipRateCode;
    }

    /**
     * Sets the value of the ipRateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpRateCode(String value) {
        this.ipRateCode = value;
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
