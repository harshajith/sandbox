
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
 *         &lt;element name="cPartNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cConfigPartMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cSubPartMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lSubAvail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cMsgType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "cPartNum",
    "cConfigPartMessage",
    "cSubPartMessage",
    "lSubAvail",
    "cMsgType",
    "callContextOut"
})
@XmlRootElement(name = "CheckPartRevisionChangeResponse")
public class CheckPartRevisionChangeResponse {

    @XmlElement(nillable = true)
    protected String cPartNum;
    @XmlElement(nillable = true)
    protected String cConfigPartMessage;
    @XmlElement(nillable = true)
    protected String cSubPartMessage;
    protected Boolean lSubAvail;
    @XmlElement(nillable = true)
    protected String cMsgType;
    @XmlElement(nillable = true)
    protected CallContextDataSetType callContextOut;

    /**
     * Gets the value of the cPartNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPartNum() {
        return cPartNum;
    }

    /**
     * Sets the value of the cPartNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPartNum(String value) {
        this.cPartNum = value;
    }

    /**
     * Gets the value of the cConfigPartMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCConfigPartMessage() {
        return cConfigPartMessage;
    }

    /**
     * Sets the value of the cConfigPartMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCConfigPartMessage(String value) {
        this.cConfigPartMessage = value;
    }

    /**
     * Gets the value of the cSubPartMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSubPartMessage() {
        return cSubPartMessage;
    }

    /**
     * Sets the value of the cSubPartMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSubPartMessage(String value) {
        this.cSubPartMessage = value;
    }

    /**
     * Gets the value of the lSubAvail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLSubAvail() {
        return lSubAvail;
    }

    /**
     * Sets the value of the lSubAvail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLSubAvail(Boolean value) {
        this.lSubAvail = value;
    }

    /**
     * Gets the value of the cMsgType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMsgType() {
        return cMsgType;
    }

    /**
     * Sets the value of the cMsgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMsgType(String value) {
        this.cMsgType = value;
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
