
package org.datacontract.schemas._2004._07.epicor_mfg;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUpdExtSalesOrderDataSetTypeOrderHist complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUpdExtSalesOrderDataSetTypeOrderHist">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UpdExtSalesOrderDataSetTypeOrderHist" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}UpdExtSalesOrderDataSetTypeOrderHist" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUpdExtSalesOrderDataSetTypeOrderHist", propOrder = {
    "updExtSalesOrderDataSetTypeOrderHists"
})
public class ArrayOfUpdExtSalesOrderDataSetTypeOrderHist {

    @XmlElement(name = "UpdExtSalesOrderDataSetTypeOrderHist", nillable = true)
    protected List<UpdExtSalesOrderDataSetTypeOrderHist> updExtSalesOrderDataSetTypeOrderHists;

    /**
     * Gets the value of the updExtSalesOrderDataSetTypeOrderHists property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updExtSalesOrderDataSetTypeOrderHists property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdExtSalesOrderDataSetTypeOrderHists().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdExtSalesOrderDataSetTypeOrderHist }
     * 
     * 
     */
    public List<UpdExtSalesOrderDataSetTypeOrderHist> getUpdExtSalesOrderDataSetTypeOrderHists() {
        if (updExtSalesOrderDataSetTypeOrderHists == null) {
            updExtSalesOrderDataSetTypeOrderHists = new ArrayList<UpdExtSalesOrderDataSetTypeOrderHist>();
        }
        return this.updExtSalesOrderDataSetTypeOrderHists;
    }

}
