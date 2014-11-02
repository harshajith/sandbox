
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.epicor.webservices.BOUpdErrorDataSetType;
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
 *         &lt;element name="UpdateDataResult" type="{http://epicor.com/webservices}BOUpdErrorDataSetType" minOccurs="0"/>
 *         &lt;element name="dsOut" type="{http://epicor.com/webservices}SalesOrderDataSetType" minOccurs="0"/>
 *         &lt;element name="errorsOccurred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "updateDataResult",
    "dsOut",
    "errorsOccurred",
    "callContextOut"
})
@XmlRootElement(name = "UpdateDataResponse")
public class UpdateDataResponse {

    @XmlElement(name = "UpdateDataResult", nillable = true)
    protected BOUpdErrorDataSetType updateDataResult;
    @XmlElement(nillable = true)
    protected SalesOrderDataSetType dsOut;
    protected Boolean errorsOccurred;
    @XmlElement(nillable = true)
    protected CallContextDataSetType callContextOut;

    /**
     * Gets the value of the updateDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link BOUpdErrorDataSetType }
     *     
     */
    public BOUpdErrorDataSetType getUpdateDataResult() {
        return updateDataResult;
    }

    /**
     * Sets the value of the updateDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BOUpdErrorDataSetType }
     *     
     */
    public void setUpdateDataResult(BOUpdErrorDataSetType value) {
        this.updateDataResult = value;
    }

    /**
     * Gets the value of the dsOut property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderDataSetType }
     *     
     */
    public SalesOrderDataSetType getDsOut() {
        return dsOut;
    }

    /**
     * Sets the value of the dsOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderDataSetType }
     *     
     */
    public void setDsOut(SalesOrderDataSetType value) {
        this.dsOut = value;
    }

    /**
     * Gets the value of the errorsOccurred property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isErrorsOccurred() {
        return errorsOccurred;
    }

    /**
     * Sets the value of the errorsOccurred property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setErrorsOccurred(Boolean value) {
        this.errorsOccurred = value;
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
