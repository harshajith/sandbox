
package org.datacontract.schemas._2004._07.epicor_mfg;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOrderCustTrkDataSetTypeOrderCustTrk complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOrderCustTrkDataSetTypeOrderCustTrk">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderCustTrkDataSetTypeOrderCustTrk" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}OrderCustTrkDataSetTypeOrderCustTrk" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOrderCustTrkDataSetTypeOrderCustTrk", propOrder = {
    "orderCustTrkDataSetTypeOrderCustTrks"
})
public class ArrayOfOrderCustTrkDataSetTypeOrderCustTrk {

    @XmlElement(name = "OrderCustTrkDataSetTypeOrderCustTrk", nillable = true)
    protected List<OrderCustTrkDataSetTypeOrderCustTrk> orderCustTrkDataSetTypeOrderCustTrks;

    /**
     * Gets the value of the orderCustTrkDataSetTypeOrderCustTrks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderCustTrkDataSetTypeOrderCustTrks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderCustTrkDataSetTypeOrderCustTrks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderCustTrkDataSetTypeOrderCustTrk }
     * 
     * 
     */
    public List<OrderCustTrkDataSetTypeOrderCustTrk> getOrderCustTrkDataSetTypeOrderCustTrks() {
        if (orderCustTrkDataSetTypeOrderCustTrks == null) {
            orderCustTrkDataSetTypeOrderCustTrks = new ArrayList<OrderCustTrkDataSetTypeOrderCustTrk>();
        }
        return this.orderCustTrkDataSetTypeOrderCustTrks;
    }

}
