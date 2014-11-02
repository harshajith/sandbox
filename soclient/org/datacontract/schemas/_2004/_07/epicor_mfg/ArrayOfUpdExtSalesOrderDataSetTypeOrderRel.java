
package org.datacontract.schemas._2004._07.epicor_mfg;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUpdExtSalesOrderDataSetTypeOrderRel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUpdExtSalesOrderDataSetTypeOrderRel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UpdExtSalesOrderDataSetTypeOrderRel" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}UpdExtSalesOrderDataSetTypeOrderRel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUpdExtSalesOrderDataSetTypeOrderRel", propOrder = {
    "updExtSalesOrderDataSetTypeOrderRels"
})
public class ArrayOfUpdExtSalesOrderDataSetTypeOrderRel {

    @XmlElement(name = "UpdExtSalesOrderDataSetTypeOrderRel", nillable = true)
    protected List<UpdExtSalesOrderDataSetTypeOrderRel> updExtSalesOrderDataSetTypeOrderRels;

    /**
     * Gets the value of the updExtSalesOrderDataSetTypeOrderRels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updExtSalesOrderDataSetTypeOrderRels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdExtSalesOrderDataSetTypeOrderRels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdExtSalesOrderDataSetTypeOrderRel }
     * 
     * 
     */
    public List<UpdExtSalesOrderDataSetTypeOrderRel> getUpdExtSalesOrderDataSetTypeOrderRels() {
        if (updExtSalesOrderDataSetTypeOrderRels == null) {
            updExtSalesOrderDataSetTypeOrderRels = new ArrayList<UpdExtSalesOrderDataSetTypeOrderRel>();
        }
        return this.updExtSalesOrderDataSetTypeOrderRels;
    }

}
