
package org.datacontract.schemas._2004._07.epicor_mfg;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSalesOrderDataSetTypeOrderHedUPS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSalesOrderDataSetTypeOrderHedUPS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SalesOrderDataSetTypeOrderHedUPS" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}SalesOrderDataSetTypeOrderHedUPS" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSalesOrderDataSetTypeOrderHedUPS", propOrder = {
    "salesOrderDataSetTypeOrderHedUPs"
})
public class ArrayOfSalesOrderDataSetTypeOrderHedUPS {

    @XmlElement(name = "SalesOrderDataSetTypeOrderHedUPS", nillable = true)
    protected List<SalesOrderDataSetTypeOrderHedUPS> salesOrderDataSetTypeOrderHedUPs;

    /**
     * Gets the value of the salesOrderDataSetTypeOrderHedUPs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesOrderDataSetTypeOrderHedUPs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesOrderDataSetTypeOrderHedUPs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOrderDataSetTypeOrderHedUPS }
     * 
     * 
     */
    public List<SalesOrderDataSetTypeOrderHedUPS> getSalesOrderDataSetTypeOrderHedUPs() {
        if (salesOrderDataSetTypeOrderHedUPs == null) {
            salesOrderDataSetTypeOrderHedUPs = new ArrayList<SalesOrderDataSetTypeOrderHedUPS>();
        }
        return this.salesOrderDataSetTypeOrderHedUPs;
    }

}
