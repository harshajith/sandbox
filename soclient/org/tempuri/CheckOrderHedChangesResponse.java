
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
 *         &lt;element name="CheckOrderHedChangesResult" type="{http://epicor.com/webservices}SalesOrderDataSetType" minOccurs="0"/>
 *         &lt;element name="cOrderChangedMsgText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "checkOrderHedChangesResult",
    "cOrderChangedMsgText",
    "callContextOut"
})
@XmlRootElement(name = "CheckOrderHedChangesResponse")
public class CheckOrderHedChangesResponse {

    @XmlElement(name = "CheckOrderHedChangesResult", nillable = true)
    protected SalesOrderDataSetType checkOrderHedChangesResult;
    @XmlElement(nillable = true)
    protected String cOrderChangedMsgText;
    @XmlElement(nillable = true)
    protected CallContextDataSetType callContextOut;

    /**
     * Gets the value of the checkOrderHedChangesResult property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderDataSetType }
     *     
     */
    public SalesOrderDataSetType getCheckOrderHedChangesResult() {
        return checkOrderHedChangesResult;
    }

    /**
     * Sets the value of the checkOrderHedChangesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderDataSetType }
     *     
     */
    public void setCheckOrderHedChangesResult(SalesOrderDataSetType value) {
        this.checkOrderHedChangesResult = value;
    }

    /**
     * Gets the value of the cOrderChangedMsgText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOrderChangedMsgText() {
        return cOrderChangedMsgText;
    }

    /**
     * Sets the value of the cOrderChangedMsgText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOrderChangedMsgText(String value) {
        this.cOrderChangedMsgText = value;
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
