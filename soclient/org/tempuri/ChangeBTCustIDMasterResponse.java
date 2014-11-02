
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
 *         &lt;element name="ChangeBTCustIDMasterResult" type="{http://epicor.com/webservices}SalesOrderDataSetType" minOccurs="0"/>
 *         &lt;element name="cCreditLimitMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lCustomerAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "changeBTCustIDMasterResult",
    "cCreditLimitMessage",
    "lCustomerAllowed",
    "callContextOut"
})
@XmlRootElement(name = "ChangeBTCustIDMasterResponse")
public class ChangeBTCustIDMasterResponse {

    @XmlElement(name = "ChangeBTCustIDMasterResult", nillable = true)
    protected SalesOrderDataSetType changeBTCustIDMasterResult;
    @XmlElement(nillable = true)
    protected String cCreditLimitMessage;
    protected Boolean lCustomerAllowed;
    @XmlElement(nillable = true)
    protected CallContextDataSetType callContextOut;

    /**
     * Gets the value of the changeBTCustIDMasterResult property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderDataSetType }
     *     
     */
    public SalesOrderDataSetType getChangeBTCustIDMasterResult() {
        return changeBTCustIDMasterResult;
    }

    /**
     * Sets the value of the changeBTCustIDMasterResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderDataSetType }
     *     
     */
    public void setChangeBTCustIDMasterResult(SalesOrderDataSetType value) {
        this.changeBTCustIDMasterResult = value;
    }

    /**
     * Gets the value of the cCreditLimitMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCreditLimitMessage() {
        return cCreditLimitMessage;
    }

    /**
     * Sets the value of the cCreditLimitMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCreditLimitMessage(String value) {
        this.cCreditLimitMessage = value;
    }

    /**
     * Gets the value of the lCustomerAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLCustomerAllowed() {
        return lCustomerAllowed;
    }

    /**
     * Sets the value of the lCustomerAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLCustomerAllowed(Boolean value) {
        this.lCustomerAllowed = value;
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
