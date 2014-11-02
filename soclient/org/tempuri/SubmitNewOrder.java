
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
 *         &lt;element name="loginOptions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesOrderData" type="{http://epicor.com/webservices}SalesOrderDataSetType" minOccurs="0"/>
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
    "loginOptions",
    "salesOrderData"
})
@XmlRootElement(name = "SubmitNewOrder")
public class SubmitNewOrder {

    @XmlElement(nillable = true)
    protected String loginOptions;
    @XmlElement(name = "SalesOrderData", nillable = true)
    protected SalesOrderDataSetType salesOrderData;

    /**
     * Gets the value of the loginOptions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginOptions() {
        return loginOptions;
    }

    /**
     * Sets the value of the loginOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginOptions(String value) {
        this.loginOptions = value;
    }

    /**
     * Gets the value of the salesOrderData property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderDataSetType }
     *     
     */
    public SalesOrderDataSetType getSalesOrderData() {
        return salesOrderData;
    }

    /**
     * Sets the value of the salesOrderData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderDataSetType }
     *     
     */
    public void setSalesOrderData(SalesOrderDataSetType value) {
        this.salesOrderData = value;
    }

}
