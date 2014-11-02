
package org.datacontract.schemas._2004._07.epicor_mfg;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSalesOrderDataSetTypeHedTaxSum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSalesOrderDataSetTypeHedTaxSum">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SalesOrderDataSetTypeHedTaxSum" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}SalesOrderDataSetTypeHedTaxSum" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSalesOrderDataSetTypeHedTaxSum", propOrder = {
    "salesOrderDataSetTypeHedTaxSa"
})
public class ArrayOfSalesOrderDataSetTypeHedTaxSum {

    @XmlElement(name = "SalesOrderDataSetTypeHedTaxSum", nillable = true)
    protected List<SalesOrderDataSetTypeHedTaxSum> salesOrderDataSetTypeHedTaxSa;

    /**
     * Gets the value of the salesOrderDataSetTypeHedTaxSa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesOrderDataSetTypeHedTaxSa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesOrderDataSetTypeHedTaxSa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOrderDataSetTypeHedTaxSum }
     * 
     * 
     */
    public List<SalesOrderDataSetTypeHedTaxSum> getSalesOrderDataSetTypeHedTaxSa() {
        if (salesOrderDataSetTypeHedTaxSa == null) {
            salesOrderDataSetTypeHedTaxSa = new ArrayList<SalesOrderDataSetTypeHedTaxSum>();
        }
        return this.salesOrderDataSetTypeHedTaxSa;
    }

}
