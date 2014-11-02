
package org.datacontract.schemas._2004._07.epicor_mfg;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSalesOrderDataSetTypeOrderHist complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSalesOrderDataSetTypeOrderHist">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SalesOrderDataSetTypeOrderHist" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}SalesOrderDataSetTypeOrderHist" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSalesOrderDataSetTypeOrderHist", propOrder = {
    "salesOrderDataSetTypeOrderHists"
})
public class ArrayOfSalesOrderDataSetTypeOrderHist {

    @XmlElement(name = "SalesOrderDataSetTypeOrderHist", nillable = true)
    protected List<SalesOrderDataSetTypeOrderHist> salesOrderDataSetTypeOrderHists;

    /**
     * Gets the value of the salesOrderDataSetTypeOrderHists property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesOrderDataSetTypeOrderHists property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesOrderDataSetTypeOrderHists().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOrderDataSetTypeOrderHist }
     * 
     * 
     */
    public List<SalesOrderDataSetTypeOrderHist> getSalesOrderDataSetTypeOrderHists() {
        if (salesOrderDataSetTypeOrderHists == null) {
            salesOrderDataSetTypeOrderHists = new ArrayList<SalesOrderDataSetTypeOrderHist>();
        }
        return this.salesOrderDataSetTypeOrderHists;
    }

}
