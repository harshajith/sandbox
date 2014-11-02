
package org.datacontract.schemas._2004._07.epicor_mfg;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSalesOrderDataSetTypeOHOrderMsc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSalesOrderDataSetTypeOHOrderMsc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SalesOrderDataSetTypeOHOrderMsc" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}SalesOrderDataSetTypeOHOrderMsc" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSalesOrderDataSetTypeOHOrderMsc", propOrder = {
    "salesOrderDataSetTypeOHOrderMscs"
})
public class ArrayOfSalesOrderDataSetTypeOHOrderMsc {

    @XmlElement(name = "SalesOrderDataSetTypeOHOrderMsc", nillable = true)
    protected List<SalesOrderDataSetTypeOHOrderMsc> salesOrderDataSetTypeOHOrderMscs;

    /**
     * Gets the value of the salesOrderDataSetTypeOHOrderMscs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesOrderDataSetTypeOHOrderMscs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesOrderDataSetTypeOHOrderMscs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOrderDataSetTypeOHOrderMsc }
     * 
     * 
     */
    public List<SalesOrderDataSetTypeOHOrderMsc> getSalesOrderDataSetTypeOHOrderMscs() {
        if (salesOrderDataSetTypeOHOrderMscs == null) {
            salesOrderDataSetTypeOHOrderMscs = new ArrayList<SalesOrderDataSetTypeOHOrderMsc>();
        }
        return this.salesOrderDataSetTypeOHOrderMscs;
    }

}
