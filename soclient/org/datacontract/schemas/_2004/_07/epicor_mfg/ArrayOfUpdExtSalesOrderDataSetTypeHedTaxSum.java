
package org.datacontract.schemas._2004._07.epicor_mfg;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUpdExtSalesOrderDataSetTypeHedTaxSum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUpdExtSalesOrderDataSetTypeHedTaxSum">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UpdExtSalesOrderDataSetTypeHedTaxSum" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}UpdExtSalesOrderDataSetTypeHedTaxSum" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUpdExtSalesOrderDataSetTypeHedTaxSum", propOrder = {
    "updExtSalesOrderDataSetTypeHedTaxSa"
})
public class ArrayOfUpdExtSalesOrderDataSetTypeHedTaxSum {

    @XmlElement(name = "UpdExtSalesOrderDataSetTypeHedTaxSum", nillable = true)
    protected List<UpdExtSalesOrderDataSetTypeHedTaxSum> updExtSalesOrderDataSetTypeHedTaxSa;

    /**
     * Gets the value of the updExtSalesOrderDataSetTypeHedTaxSa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updExtSalesOrderDataSetTypeHedTaxSa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdExtSalesOrderDataSetTypeHedTaxSa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdExtSalesOrderDataSetTypeHedTaxSum }
     * 
     * 
     */
    public List<UpdExtSalesOrderDataSetTypeHedTaxSum> getUpdExtSalesOrderDataSetTypeHedTaxSa() {
        if (updExtSalesOrderDataSetTypeHedTaxSa == null) {
            updExtSalesOrderDataSetTypeHedTaxSa = new ArrayList<UpdExtSalesOrderDataSetTypeHedTaxSum>();
        }
        return this.updExtSalesOrderDataSetTypeHedTaxSa;
    }

}
