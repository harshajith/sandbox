
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
 *         &lt;element name="pcCurComp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="piOrderNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="piOrderLine" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="piOrderRelNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pcCalledFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="plIsNewRecord" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "pcCurComp",
    "piOrderNum",
    "piOrderLine",
    "piOrderRelNum",
    "pcCalledFrom",
    "plIsNewRecord",
    "callContext"
})
@XmlRootElement(name = "eqOrderRelTax")
public class EqOrderRelTax {

    @XmlElement(nillable = true)
    protected String loginOptions;
    @XmlElement(nillable = true)
    protected String pcCurComp;
    protected Integer piOrderNum;
    protected Integer piOrderLine;
    protected Integer piOrderRelNum;
    @XmlElement(nillable = true)
    protected String pcCalledFrom;
    protected Boolean plIsNewRecord;
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
     * Gets the value of the pcCurComp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcCurComp() {
        return pcCurComp;
    }

    /**
     * Sets the value of the pcCurComp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcCurComp(String value) {
        this.pcCurComp = value;
    }

    /**
     * Gets the value of the piOrderNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPiOrderNum() {
        return piOrderNum;
    }

    /**
     * Sets the value of the piOrderNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPiOrderNum(Integer value) {
        this.piOrderNum = value;
    }

    /**
     * Gets the value of the piOrderLine property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPiOrderLine() {
        return piOrderLine;
    }

    /**
     * Sets the value of the piOrderLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPiOrderLine(Integer value) {
        this.piOrderLine = value;
    }

    /**
     * Gets the value of the piOrderRelNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPiOrderRelNum() {
        return piOrderRelNum;
    }

    /**
     * Sets the value of the piOrderRelNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPiOrderRelNum(Integer value) {
        this.piOrderRelNum = value;
    }

    /**
     * Gets the value of the pcCalledFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcCalledFrom() {
        return pcCalledFrom;
    }

    /**
     * Sets the value of the pcCalledFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcCalledFrom(String value) {
        this.pcCalledFrom = value;
    }

    /**
     * Gets the value of the plIsNewRecord property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlIsNewRecord() {
        return plIsNewRecord;
    }

    /**
     * Sets the value of the plIsNewRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlIsNewRecord(Boolean value) {
        this.plIsNewRecord = value;
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
