
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
 *         &lt;element name="lKeepUnitPrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ipSellingQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
    "lKeepUnitPrice",
    "ipSellingQuantity",
    "callContext"
})
@XmlRootElement(name = "ChangeSellingQuantity")
public class ChangeSellingQuantity {

    @XmlElement(nillable = true)
    protected String loginOptions;
    @XmlElement(nillable = true)
    protected SalesOrderDataSetType ds;
    protected Boolean lKeepUnitPrice;
    protected BigDecimal ipSellingQuantity;
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
     * Gets the value of the lKeepUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLKeepUnitPrice() {
        return lKeepUnitPrice;
    }

    /**
     * Sets the value of the lKeepUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLKeepUnitPrice(Boolean value) {
        this.lKeepUnitPrice = value;
    }

    /**
     * Gets the value of the ipSellingQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIpSellingQuantity() {
        return ipSellingQuantity;
    }

    /**
     * Sets the value of the ipSellingQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIpSellingQuantity(BigDecimal value) {
        this.ipSellingQuantity = value;
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
