
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.epicor.webservices.CallContextDataSetType;
import com.epicor.webservices.ETCAddrValidationDataSetType;


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
 *         &lt;element name="ETCValidateAddressResult" type="{http://epicor.com/webservices}ETCAddrValidationDataSetType" minOccurs="0"/>
 *         &lt;element name="statusFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="errorFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="errorMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exceptionFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "etcValidateAddressResult",
    "statusFlag",
    "errorFlag",
    "errorMsg",
    "exceptionFlag",
    "callContextOut"
})
@XmlRootElement(name = "ETCValidateAddressResponse")
public class ETCValidateAddressResponse {

    @XmlElement(name = "ETCValidateAddressResult", nillable = true)
    protected ETCAddrValidationDataSetType etcValidateAddressResult;
    protected Boolean statusFlag;
    protected Boolean errorFlag;
    @XmlElement(nillable = true)
    protected String errorMsg;
    protected Boolean exceptionFlag;
    @XmlElement(nillable = true)
    protected CallContextDataSetType callContextOut;

    /**
     * Gets the value of the etcValidateAddressResult property.
     * 
     * @return
     *     possible object is
     *     {@link ETCAddrValidationDataSetType }
     *     
     */
    public ETCAddrValidationDataSetType getETCValidateAddressResult() {
        return etcValidateAddressResult;
    }

    /**
     * Sets the value of the etcValidateAddressResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ETCAddrValidationDataSetType }
     *     
     */
    public void setETCValidateAddressResult(ETCAddrValidationDataSetType value) {
        this.etcValidateAddressResult = value;
    }

    /**
     * Gets the value of the statusFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatusFlag() {
        return statusFlag;
    }

    /**
     * Sets the value of the statusFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatusFlag(Boolean value) {
        this.statusFlag = value;
    }

    /**
     * Gets the value of the errorFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isErrorFlag() {
        return errorFlag;
    }

    /**
     * Sets the value of the errorFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setErrorFlag(Boolean value) {
        this.errorFlag = value;
    }

    /**
     * Gets the value of the errorMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     * Sets the value of the errorMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMsg(String value) {
        this.errorMsg = value;
    }

    /**
     * Gets the value of the exceptionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExceptionFlag() {
        return exceptionFlag;
    }

    /**
     * Sets the value of the exceptionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExceptionFlag(Boolean value) {
        this.exceptionFlag = value;
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
