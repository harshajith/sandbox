
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.epicor.webservices.BOUpdErrorDataSetType;
import com.epicor.webservices.CallContextDataSetType;
import com.epicor.webservices.UpdExtSalesOrderDataSetType;


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
 *         &lt;element name="UpdateResult" type="{http://epicor.com/webservices}BOUpdErrorDataSetType" minOccurs="0"/>
 *         &lt;element name="dsOut" type="{http://epicor.com/webservices}UpdExtSalesOrderDataSetType" minOccurs="0"/>
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
    "updateResult",
    "dsOut",
    "errorsOccurred",
    "callContextOut"
})
@XmlRootElement(name = "UpdateResponse")
public class UpdateResponse {

    @XmlElement(name = "UpdateResult", nillable = true)
    protected BOUpdErrorDataSetType updateResult;
    @XmlElement(nillable = true)
    protected UpdExtSalesOrderDataSetType dsOut;
    protected Boolean errorsOccurred;
    @XmlElement(nillable = true)
    protected CallContextDataSetType callContextOut;

    /**
     * Gets the value of the updateResult property.
     * 
     * @return
     *     possible object is
     *     {@link BOUpdErrorDataSetType }
     *     
     */
    public BOUpdErrorDataSetType getUpdateResult() {
        return updateResult;
    }

    /**
     * Sets the value of the updateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BOUpdErrorDataSetType }
     *     
     */
    public void setUpdateResult(BOUpdErrorDataSetType value) {
        this.updateResult = value;
    }

    /**
     * Gets the value of the dsOut property.
     * 
     * @return
     *     possible object is
     *     {@link UpdExtSalesOrderDataSetType }
     *     
     */
    public UpdExtSalesOrderDataSetType getDsOut() {
        return dsOut;
    }

    /**
     * Sets the value of the dsOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdExtSalesOrderDataSetType }
     *     
     */
    public void setDsOut(UpdExtSalesOrderDataSetType value) {
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
