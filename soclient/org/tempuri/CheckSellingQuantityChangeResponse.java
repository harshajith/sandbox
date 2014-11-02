
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
 *         &lt;element name="cSellingQuantityChangedMsgText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "cSellingQuantityChangedMsgText",
    "callContextOut"
})
@XmlRootElement(name = "CheckSellingQuantityChangeResponse")
public class CheckSellingQuantityChangeResponse {

    @XmlElement(nillable = true)
    protected String cSellingQuantityChangedMsgText;
    @XmlElement(nillable = true)
    protected CallContextDataSetType callContextOut;

    /**
     * Gets the value of the cSellingQuantityChangedMsgText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSellingQuantityChangedMsgText() {
        return cSellingQuantityChangedMsgText;
    }

    /**
     * Sets the value of the cSellingQuantityChangedMsgText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSellingQuantityChangedMsgText(String value) {
        this.cSellingQuantityChangedMsgText = value;
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
