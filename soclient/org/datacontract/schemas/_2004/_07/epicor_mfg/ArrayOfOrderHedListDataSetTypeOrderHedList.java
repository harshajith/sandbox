
package org.datacontract.schemas._2004._07.epicor_mfg;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOrderHedListDataSetTypeOrderHedList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOrderHedListDataSetTypeOrderHedList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderHedListDataSetTypeOrderHedList" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}OrderHedListDataSetTypeOrderHedList" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOrderHedListDataSetTypeOrderHedList", propOrder = {
    "orderHedListDataSetTypeOrderHedLists"
})
public class ArrayOfOrderHedListDataSetTypeOrderHedList {

    @XmlElement(name = "OrderHedListDataSetTypeOrderHedList", nillable = true)
    protected List<OrderHedListDataSetTypeOrderHedList> orderHedListDataSetTypeOrderHedLists;

    /**
     * Gets the value of the orderHedListDataSetTypeOrderHedLists property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderHedListDataSetTypeOrderHedLists property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderHedListDataSetTypeOrderHedLists().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderHedListDataSetTypeOrderHedList }
     * 
     * 
     */
    public List<OrderHedListDataSetTypeOrderHedList> getOrderHedListDataSetTypeOrderHedLists() {
        if (orderHedListDataSetTypeOrderHedLists == null) {
            orderHedListDataSetTypeOrderHedLists = new ArrayList<OrderHedListDataSetTypeOrderHedList>();
        }
        return this.orderHedListDataSetTypeOrderHedLists;
    }

}
