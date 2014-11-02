
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
 *         &lt;element name="UpdateExistingOrderResult" type="{http://epicor.com/webservices}SalesOrderDataSetType" minOccurs="0"/>
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
    "updateExistingOrderResult"
})
@XmlRootElement(name = "UpdateExistingOrderResponse")
public class UpdateExistingOrderResponse {

    @XmlElement(name = "UpdateExistingOrderResult", nillable = true)
    protected SalesOrderDataSetType updateExistingOrderResult;

    /**
     * Gets the value of the updateExistingOrderResult property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderDataSetType }
     *     
     */
    public SalesOrderDataSetType getUpdateExistingOrderResult() {
        return updateExistingOrderResult;
    }

    /**
     * Sets the value of the updateExistingOrderResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderDataSetType }
     *     
     */
    public void setUpdateExistingOrderResult(SalesOrderDataSetType value) {
        this.updateExistingOrderResult = value;
    }

}
