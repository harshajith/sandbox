
package org.datacontract.schemas._2004._07.epicor_mfg;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUpdExtSalesOrderDataSetTypeOrderDtl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUpdExtSalesOrderDataSetTypeOrderDtl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UpdExtSalesOrderDataSetTypeOrderDtl" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}UpdExtSalesOrderDataSetTypeOrderDtl" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUpdExtSalesOrderDataSetTypeOrderDtl", propOrder = {
    "updExtSalesOrderDataSetTypeOrderDtls"
})
public class ArrayOfUpdExtSalesOrderDataSetTypeOrderDtl {

    @XmlElement(name = "UpdExtSalesOrderDataSetTypeOrderDtl", nillable = true)
    protected List<UpdExtSalesOrderDataSetTypeOrderDtl> updExtSalesOrderDataSetTypeOrderDtls;

    /**
     * Gets the value of the updExtSalesOrderDataSetTypeOrderDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updExtSalesOrderDataSetTypeOrderDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdExtSalesOrderDataSetTypeOrderDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdExtSalesOrderDataSetTypeOrderDtl }
     * 
     * 
     */
    public List<UpdExtSalesOrderDataSetTypeOrderDtl> getUpdExtSalesOrderDataSetTypeOrderDtls() {
        if (updExtSalesOrderDataSetTypeOrderDtls == null) {
            updExtSalesOrderDataSetTypeOrderDtls = new ArrayList<UpdExtSalesOrderDataSetTypeOrderDtl>();
        }
        return this.updExtSalesOrderDataSetTypeOrderDtls;
    }

}
