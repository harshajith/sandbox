
package org.datacontract.schemas._2004._07.epicor_mfg;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSalesOrderDataSetTypePartSubs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSalesOrderDataSetTypePartSubs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SalesOrderDataSetTypePartSubs" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}SalesOrderDataSetTypePartSubs" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSalesOrderDataSetTypePartSubs", propOrder = {
    "salesOrderDataSetTypePartSubs"
})
public class ArrayOfSalesOrderDataSetTypePartSubs {

    @XmlElement(name = "SalesOrderDataSetTypePartSubs", nillable = true)
    protected List<SalesOrderDataSetTypePartSubs> salesOrderDataSetTypePartSubs;

    /**
     * Gets the value of the salesOrderDataSetTypePartSubs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesOrderDataSetTypePartSubs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesOrderDataSetTypePartSubs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOrderDataSetTypePartSubs }
     * 
     * 
     */
    public List<SalesOrderDataSetTypePartSubs> getSalesOrderDataSetTypePartSubs() {
        if (salesOrderDataSetTypePartSubs == null) {
            salesOrderDataSetTypePartSubs = new ArrayList<SalesOrderDataSetTypePartSubs>();
        }
        return this.salesOrderDataSetTypePartSubs;
    }

}
