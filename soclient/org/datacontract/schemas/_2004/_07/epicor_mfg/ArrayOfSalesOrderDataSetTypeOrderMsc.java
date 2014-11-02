
package org.datacontract.schemas._2004._07.epicor_mfg;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSalesOrderDataSetTypeOrderMsc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSalesOrderDataSetTypeOrderMsc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SalesOrderDataSetTypeOrderMsc" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}SalesOrderDataSetTypeOrderMsc" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSalesOrderDataSetTypeOrderMsc", propOrder = {
    "salesOrderDataSetTypeOrderMscs"
})
public class ArrayOfSalesOrderDataSetTypeOrderMsc {

    @XmlElement(name = "SalesOrderDataSetTypeOrderMsc", nillable = true)
    protected List<SalesOrderDataSetTypeOrderMsc> salesOrderDataSetTypeOrderMscs;

    /**
     * Gets the value of the salesOrderDataSetTypeOrderMscs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesOrderDataSetTypeOrderMscs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesOrderDataSetTypeOrderMscs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOrderDataSetTypeOrderMsc }
     * 
     * 
     */
    public List<SalesOrderDataSetTypeOrderMsc> getSalesOrderDataSetTypeOrderMscs() {
        if (salesOrderDataSetTypeOrderMscs == null) {
            salesOrderDataSetTypeOrderMscs = new ArrayList<SalesOrderDataSetTypeOrderMsc>();
        }
        return this.salesOrderDataSetTypeOrderMscs;
    }

}
