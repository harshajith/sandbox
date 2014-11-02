
package com.epicor.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfOrderHedListDataSetTypeOrderHedList;


/**
 * <p>Java class for OrderHedListDataSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderHedListDataSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderHedList" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfOrderHedListDataSetTypeOrderHedList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderHedListDataSetType", propOrder = {
    "orderHedList"
})
public class OrderHedListDataSetType {

    @XmlElement(name = "OrderHedList", nillable = true)
    protected ArrayOfOrderHedListDataSetTypeOrderHedList orderHedList;

    /**
     * Gets the value of the orderHedList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderHedListDataSetTypeOrderHedList }
     *     
     */
    public ArrayOfOrderHedListDataSetTypeOrderHedList getOrderHedList() {
        return orderHedList;
    }

    /**
     * Sets the value of the orderHedList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderHedListDataSetTypeOrderHedList }
     *     
     */
    public void setOrderHedList(ArrayOfOrderHedListDataSetTypeOrderHedList value) {
        this.orderHedList = value;
    }

}
