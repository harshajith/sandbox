
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
 *         &lt;element name="MasterUpdateResult" type="{http://epicor.com/webservices}SalesOrderDataSetType" minOccurs="0"/>
 *         &lt;element name="lContinue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cResponseMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cDisplayMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cCompliantMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cResponseMsgOrdRel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callContextOut" type="{http://epicor.com/webservices}CallContextDataSetType" minOccurs="0"/>
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
    "masterUpdateResult",
    "lContinue",
    "cResponseMsg",
    "cDisplayMsg",
    "cCompliantMsg",
    "cResponseMsgOrdRel",
    "callContextOut"
})
@XmlRootElement(name = "MasterUpdateResponse")
public class MasterUpdateResponse {

    @XmlElement(name = "MasterUpdateResult", nillable = true)
    protected SalesOrderDataSetType masterUpdateResult;
    protected Boolean lContinue;
    @XmlElement(nillable = true)
    protected String cResponseMsg;
    @XmlElement(nillable = true)
    protected String cDisplayMsg;
    @XmlElement(nillable = true)
    protected String cCompliantMsg;
    @XmlElement(nillable = true)
    protected String cResponseMsgOrdRel;
    @XmlElement(nillable = true)
    protected CallContextDataSetType callContextOut;

    /**
     * Gets the value of the masterUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderDataSetType }
     *     
     */
    public SalesOrderDataSetType getMasterUpdateResult() {
        return masterUpdateResult;
    }

    /**
     * Sets the value of the masterUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderDataSetType }
     *     
     */
    public void setMasterUpdateResult(SalesOrderDataSetType value) {
        this.masterUpdateResult = value;
    }

    /**
     * Gets the value of the lContinue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLContinue() {
        return lContinue;
    }

    /**
     * Sets the value of the lContinue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLContinue(Boolean value) {
        this.lContinue = value;
    }

    /**
     * Gets the value of the cResponseMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCResponseMsg() {
        return cResponseMsg;
    }

    /**
     * Sets the value of the cResponseMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCResponseMsg(String value) {
        this.cResponseMsg = value;
    }

    /**
     * Gets the value of the cDisplayMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDisplayMsg() {
        return cDisplayMsg;
    }

    /**
     * Sets the value of the cDisplayMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDisplayMsg(String value) {
        this.cDisplayMsg = value;
    }

    /**
     * Gets the value of the cCompliantMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCompliantMsg() {
        return cCompliantMsg;
    }

    /**
     * Sets the value of the cCompliantMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCompliantMsg(String value) {
        this.cCompliantMsg = value;
    }

    /**
     * Gets the value of the cResponseMsgOrdRel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCResponseMsgOrdRel() {
        return cResponseMsgOrdRel;
    }

    /**
     * Sets the value of the cResponseMsgOrdRel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCResponseMsgOrdRel(String value) {
        this.cResponseMsgOrdRel = value;
    }

    /**
     * Gets the value of the callContextOut property.
     * 
     * @return
     *     possible object is
     *     {@link CallContextDataSetType }
     *     
     */
    public CallContextDataSetType getCallContextOut() {
        return callContextOut;
    }

    /**
     * Sets the value of the callContextOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallContextDataSetType }
     *     
     */
    public void setCallContextOut(CallContextDataSetType value) {
        this.callContextOut = value;
    }

}
