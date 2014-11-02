
package org.datacontract.schemas._2004._07.epicor_mfg;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSalesOrderDataSetTypeOrderDtlAttch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSalesOrderDataSetTypeOrderDtlAttch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SalesOrderDataSetTypeOrderDtlAttch" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}SalesOrderDataSetTypeOrderDtlAttch" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSalesOrderDataSetTypeOrderDtlAttch", propOrder = {
    "salesOrderDataSetTypeOrderDtlAttches"
})
public class ArrayOfSalesOrderDataSetTypeOrderDtlAttch {

    @XmlElement(name = "SalesOrderDataSetTypeOrderDtlAttch", nillable = true)
    protected List<SalesOrderDataSetTypeOrderDtlAttch> salesOrderDataSetTypeOrderDtlAttches;

    /**
     * Gets the value of the salesOrderDataSetTypeOrderDtlAttches property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesOrderDataSetTypeOrderDtlAttches property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesOrderDataSetTypeOrderDtlAttches().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOrderDataSetTypeOrderDtlAttch }
     * 
     * 
     */
    public List<SalesOrderDataSetTypeOrderDtlAttch> getSalesOrderDataSetTypeOrderDtlAttches() {
        if (salesOrderDataSetTypeOrderDtlAttches == null) {
            salesOrderDataSetTypeOrderDtlAttches = new ArrayList<SalesOrderDataSetTypeOrderDtlAttch>();
        }
        return this.salesOrderDataSetTypeOrderDtlAttches;
    }

}
