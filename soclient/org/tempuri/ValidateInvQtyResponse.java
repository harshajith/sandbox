
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
 *         &lt;element name="ValidateInvQtyResult" type="{http://epicor.com/webservices}SalesOrderDataSetType" minOccurs="0"/>
 *         &lt;element name="opNegInvMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opNegQtyAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "validateInvQtyResult",
    "opNegInvMessage",
    "opNegQtyAction",
    "callContextOut"
})
@XmlRootElement(name = "ValidateInvQtyResponse")
public class ValidateInvQtyResponse {

    @XmlElement(name = "ValidateInvQtyResult", nillable = true)
    protected SalesOrderDataSetType validateInvQtyResult;
    @XmlElement(nillable = true)
    protected String opNegInvMessage;
    @XmlElement(nillable = true)
    protected String opNegQtyAction;
    @XmlElement(nillable = true)
    protected CallContextDataSetType callContextOut;

    /**
     * Gets the value of the validateInvQtyResult property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderDataSetType }
     *     
     */
    public SalesOrderDataSetType getValidateInvQtyResult() {
        return validateInvQtyResult;
    }

    /**
     * Sets the value of the validateInvQtyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderDataSetType }
     *     
     */
    public void setValidateInvQtyResult(SalesOrderDataSetType value) {
        this.validateInvQtyResult = value;
    }

    /**
     * Gets the value of the opNegInvMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpNegInvMessage() {
        return opNegInvMessage;
    }

    /**
     * Sets the value of the opNegInvMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpNegInvMessage(String value) {
        this.opNegInvMessage = value;
    }

    /**
     * Gets the value of the opNegQtyAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpNegQtyAction() {
        return opNegQtyAction;
    }

    /**
     * Sets the value of the opNegQtyAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpNegQtyAction(String value) {
        this.opNegQtyAction = value;
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
