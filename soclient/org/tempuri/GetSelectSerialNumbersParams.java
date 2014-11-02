
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
 *         &lt;element name="ipPartNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ipWhseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ipBinNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ipQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ipTranType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ipRowID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "ipPartNum",
    "ipWhseCode",
    "ipBinNum",
    "ipQuantity",
    "ipTranType",
    "ipRowID",
    "callContext"
})
@XmlRootElement(name = "GetSelectSerialNumbersParams")
public class GetSelectSerialNumbersParams {

    @XmlElement(nillable = true)
    protected String loginOptions;
    @XmlElement(nillable = true)
    protected String ipPartNum;
    @XmlElement(nillable = true)
    protected String ipWhseCode;
    @XmlElement(nillable = true)
    protected String ipBinNum;
    protected BigDecimal ipQuantity;
    @XmlElement(nillable = true)
    protected String ipTranType;
    @XmlElement(nillable = true)
    protected String ipRowID;
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
     * Gets the value of the ipPartNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpPartNum() {
        return ipPartNum;
    }

    /**
     * Sets the value of the ipPartNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpPartNum(String value) {
        this.ipPartNum = value;
    }

    /**
     * Gets the value of the ipWhseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpWhseCode() {
        return ipWhseCode;
    }

    /**
     * Sets the value of the ipWhseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpWhseCode(String value) {
        this.ipWhseCode = value;
    }

    /**
     * Gets the value of the ipBinNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpBinNum() {
        return ipBinNum;
    }

    /**
     * Sets the value of the ipBinNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpBinNum(String value) {
        this.ipBinNum = value;
    }

    /**
     * Gets the value of the ipQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIpQuantity() {
        return ipQuantity;
    }

    /**
     * Sets the value of the ipQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIpQuantity(BigDecimal value) {
        this.ipQuantity = value;
    }

    /**
     * Gets the value of the ipTranType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpTranType() {
        return ipTranType;
    }

    /**
     * Sets the value of the ipTranType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpTranType(String value) {
        this.ipTranType = value;
    }

    /**
     * Gets the value of the ipRowID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpRowID() {
        return ipRowID;
    }

    /**
     * Sets the value of the ipRowID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpRowID(String value) {
        this.ipRowID = value;
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
