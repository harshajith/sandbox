
package org.datacontract.schemas._2004._07.epicor_mfg;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSalesOrderDataSetTypeOrderRepComm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSalesOrderDataSetTypeOrderRepComm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SalesOrderDataSetTypeOrderRepComm" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}SalesOrderDataSetTypeOrderRepComm" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSalesOrderDataSetTypeOrderRepComm", propOrder = {
    "salesOrderDataSetTypeOrderRepComms"
})
public class ArrayOfSalesOrderDataSetTypeOrderRepComm {

    @XmlElement(name = "SalesOrderDataSetTypeOrderRepComm", nillable = true)
    protected List<SalesOrderDataSetTypeOrderRepComm> salesOrderDataSetTypeOrderRepComms;

    /**
     * Gets the value of the salesOrderDataSetTypeOrderRepComms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesOrderDataSetTypeOrderRepComms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesOrderDataSetTypeOrderRepComms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOrderDataSetTypeOrderRepComm }
     * 
     * 
     */
    public List<SalesOrderDataSetTypeOrderRepComm> getSalesOrderDataSetTypeOrderRepComms() {
        if (salesOrderDataSetTypeOrderRepComms == null) {
            salesOrderDataSetTypeOrderRepComms = new ArrayList<SalesOrderDataSetTypeOrderRepComm>();
        }
        return this.salesOrderDataSetTypeOrderRepComms;
    }

}
