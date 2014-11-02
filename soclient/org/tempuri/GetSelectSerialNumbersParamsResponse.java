
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.epicor.webservices.CallContextDataSetType;
import com.epicor.webservices.SelectSerialNumbersParamsDataSetType;


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
 *         &lt;element name="GetSelectSerialNumbersParamsResult" type="{http://epicor.com/webservices}SelectSerialNumbersParamsDataSetType" minOccurs="0"/>
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
    "getSelectSerialNumbersParamsResult",
    "callContextOut"
})
@XmlRootElement(name = "GetSelectSerialNumbersParamsResponse")
public class GetSelectSerialNumbersParamsResponse {

    @XmlElement(name = "GetSelectSerialNumbersParamsResult", nillable = true)
    protected SelectSerialNumbersParamsDataSetType getSelectSerialNumbersParamsResult;
    @XmlElement(nillable = true)
    protected CallContextDataSetType callContextOut;

    /**
     * Gets the value of the getSelectSerialNumbersParamsResult property.
     * 
     * @return
     *     possible object is
     *     {@link SelectSerialNumbersParamsDataSetType }
     *     
     */
    public SelectSerialNumbersParamsDataSetType getGetSelectSerialNumbersParamsResult() {
        return getSelectSerialNumbersParamsResult;
    }

    /**
     * Sets the value of the getSelectSerialNumbersParamsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectSerialNumbersParamsDataSetType }
     *     
     */
    public void setGetSelectSerialNumbersParamsResult(SelectSerialNumbersParamsDataSetType value) {
        this.getSelectSerialNumbersParamsResult = value;
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
