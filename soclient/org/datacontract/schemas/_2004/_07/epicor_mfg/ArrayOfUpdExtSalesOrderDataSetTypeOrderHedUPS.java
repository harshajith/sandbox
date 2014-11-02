
package org.datacontract.schemas._2004._07.epicor_mfg;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUpdExtSalesOrderDataSetTypeOrderHedUPS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUpdExtSalesOrderDataSetTypeOrderHedUPS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UpdExtSalesOrderDataSetTypeOrderHedUPS" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}UpdExtSalesOrderDataSetTypeOrderHedUPS" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUpdExtSalesOrderDataSetTypeOrderHedUPS", propOrder = {
    "updExtSalesOrderDataSetTypeOrderHedUPs"
})
public class ArrayOfUpdExtSalesOrderDataSetTypeOrderHedUPS {

    @XmlElement(name = "UpdExtSalesOrderDataSetTypeOrderHedUPS", nillable = true)
    protected List<UpdExtSalesOrderDataSetTypeOrderHedUPS> updExtSalesOrderDataSetTypeOrderHedUPs;

    /**
     * Gets the value of the updExtSalesOrderDataSetTypeOrderHedUPs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updExtSalesOrderDataSetTypeOrderHedUPs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdExtSalesOrderDataSetTypeOrderHedUPs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdExtSalesOrderDataSetTypeOrderHedUPS }
     * 
     * 
     */
    public List<UpdExtSalesOrderDataSetTypeOrderHedUPS> getUpdExtSalesOrderDataSetTypeOrderHedUPs() {
        if (updExtSalesOrderDataSetTypeOrderHedUPs == null) {
            updExtSalesOrderDataSetTypeOrderHedUPs = new ArrayList<UpdExtSalesOrderDataSetTypeOrderHedUPS>();
        }
        return this.updExtSalesOrderDataSetTypeOrderHedUPs;
    }

}
