
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="SubmitNewOrderResult" type="{http://epicor.com/webservices}SalesOrderDataSetType" minOccurs="0"/>
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
    "submitNewOrderResult"
})
@XmlRootElement(name = "SubmitNewOrderResponse")
public class SubmitNewOrderResponse {

    @XmlElement(name = "SubmitNewOrderResult", nillable = true)
    protected SalesOrderDataSetType submitNewOrderResult;

    /**
     * Gets the value of the submitNewOrderResult property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderDataSetType }
     *     
     */
    public SalesOrderDataSetType getSubmitNewOrderResult() {
        return submitNewOrderResult;
    }

    /**
     * Sets the value of the submitNewOrderResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderDataSetType }
     *     
     */
    public void setSubmitNewOrderResult(SalesOrderDataSetType value) {
        this.submitNewOrderResult = value;
    }

}
