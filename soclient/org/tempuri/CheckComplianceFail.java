
package org.tempuri;

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
 *         &lt;element name="orderNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="orderLine" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="orderRelNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "orderNum",
    "orderLine",
    "orderRelNum",
    "callContext"
})
@XmlRootElement(name = "CheckComplianceFail")
public class CheckComplianceFail {

    @XmlElement(nillable = true)
    protected String loginOptions;
    protected Integer orderNum;
    protected Integer orderLine;
    protected Integer orderRelNum;
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
     * Gets the value of the orderNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrderNum() {
        return orderNum;
    }

    /**
     * Sets the value of the orderNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrderNum(Integer value) {
        this.orderNum = value;
    }

    /**
     * Gets the value of the orderLine property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrderLine() {
        return orderLine;
    }

    /**
     * Sets the value of the orderLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrderLine(Integer value) {
        this.orderLine = value;
    }

    /**
     * Gets the value of the orderRelNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrderRelNum() {
        return orderRelNum;
    }

    /**
     * Sets the value of the orderRelNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrderRelNum(Integer value) {
        this.orderRelNum = value;
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
