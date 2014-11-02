
package org.datacontract.schemas._2004._07.epicor_mfg;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSalesOrderDataSetTypeSNFormat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSalesOrderDataSetTypeSNFormat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SalesOrderDataSetTypeSNFormat" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}SalesOrderDataSetTypeSNFormat" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSalesOrderDataSetTypeSNFormat", propOrder = {
    "salesOrderDataSetTypeSNFormats"
})
public class ArrayOfSalesOrderDataSetTypeSNFormat {

    @XmlElement(name = "SalesOrderDataSetTypeSNFormat", nillable = true)
    protected List<SalesOrderDataSetTypeSNFormat> salesOrderDataSetTypeSNFormats;

    /**
     * Gets the value of the salesOrderDataSetTypeSNFormats property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesOrderDataSetTypeSNFormats property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesOrderDataSetTypeSNFormats().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOrderDataSetTypeSNFormat }
     * 
     * 
     */
    public List<SalesOrderDataSetTypeSNFormat> getSalesOrderDataSetTypeSNFormats() {
        if (salesOrderDataSetTypeSNFormats == null) {
            salesOrderDataSetTypeSNFormats = new ArrayList<SalesOrderDataSetTypeSNFormat>();
        }
        return this.salesOrderDataSetTypeSNFormats;
    }

}
