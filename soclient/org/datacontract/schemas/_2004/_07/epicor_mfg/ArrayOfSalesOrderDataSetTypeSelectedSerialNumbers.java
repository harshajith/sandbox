
package org.datacontract.schemas._2004._07.epicor_mfg;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSalesOrderDataSetTypeSelectedSerialNumbers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSalesOrderDataSetTypeSelectedSerialNumbers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SalesOrderDataSetTypeSelectedSerialNumbers" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}SalesOrderDataSetTypeSelectedSerialNumbers" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSalesOrderDataSetTypeSelectedSerialNumbers", propOrder = {
    "salesOrderDataSetTypeSelectedSerialNumbers"
})
public class ArrayOfSalesOrderDataSetTypeSelectedSerialNumbers {

    @XmlElement(name = "SalesOrderDataSetTypeSelectedSerialNumbers", nillable = true)
    protected List<SalesOrderDataSetTypeSelectedSerialNumbers> salesOrderDataSetTypeSelectedSerialNumbers;

    /**
     * Gets the value of the salesOrderDataSetTypeSelectedSerialNumbers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesOrderDataSetTypeSelectedSerialNumbers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesOrderDataSetTypeSelectedSerialNumbers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOrderDataSetTypeSelectedSerialNumbers }
     * 
     * 
     */
    public List<SalesOrderDataSetTypeSelectedSerialNumbers> getSalesOrderDataSetTypeSelectedSerialNumbers() {
        if (salesOrderDataSetTypeSelectedSerialNumbers == null) {
            salesOrderDataSetTypeSelectedSerialNumbers = new ArrayList<SalesOrderDataSetTypeSelectedSerialNumbers>();
        }
        return this.salesOrderDataSetTypeSelectedSerialNumbers;
    }

}
