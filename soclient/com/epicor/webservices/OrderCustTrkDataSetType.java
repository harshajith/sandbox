
package com.epicor.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfOrderCustTrkDataSetTypeOrderCustTrk;


/**
 * <p>Java class for OrderCustTrkDataSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderCustTrkDataSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderCustTrk" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfOrderCustTrkDataSetTypeOrderCustTrk" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderCustTrkDataSetType", propOrder = {
    "orderCustTrk"
})
public class OrderCustTrkDataSetType {

    @XmlElement(name = "OrderCustTrk", nillable = true)
    protected ArrayOfOrderCustTrkDataSetTypeOrderCustTrk orderCustTrk;

    /**
     * Gets the value of the orderCustTrk property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderCustTrkDataSetTypeOrderCustTrk }
     *     
     */
    public ArrayOfOrderCustTrkDataSetTypeOrderCustTrk getOrderCustTrk() {
        return orderCustTrk;
    }

    /**
     * Sets the value of the orderCustTrk property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderCustTrkDataSetTypeOrderCustTrk }
     *     
     */
    public void setOrderCustTrk(ArrayOfOrderCustTrkDataSetTypeOrderCustTrk value) {
        this.orderCustTrk = value;
    }

}
