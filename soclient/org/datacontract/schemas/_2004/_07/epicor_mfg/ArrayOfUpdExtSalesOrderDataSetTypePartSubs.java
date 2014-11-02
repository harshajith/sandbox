
package org.datacontract.schemas._2004._07.epicor_mfg;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUpdExtSalesOrderDataSetTypePartSubs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUpdExtSalesOrderDataSetTypePartSubs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UpdExtSalesOrderDataSetTypePartSubs" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}UpdExtSalesOrderDataSetTypePartSubs" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUpdExtSalesOrderDataSetTypePartSubs", propOrder = {
    "updExtSalesOrderDataSetTypePartSubs"
})
public class ArrayOfUpdExtSalesOrderDataSetTypePartSubs {

    @XmlElement(name = "UpdExtSalesOrderDataSetTypePartSubs", nillable = true)
    protected List<UpdExtSalesOrderDataSetTypePartSubs> updExtSalesOrderDataSetTypePartSubs;

    /**
     * Gets the value of the updExtSalesOrderDataSetTypePartSubs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updExtSalesOrderDataSetTypePartSubs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdExtSalesOrderDataSetTypePartSubs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdExtSalesOrderDataSetTypePartSubs }
     * 
     * 
     */
    public List<UpdExtSalesOrderDataSetTypePartSubs> getUpdExtSalesOrderDataSetTypePartSubs() {
        if (updExtSalesOrderDataSetTypePartSubs == null) {
            updExtSalesOrderDataSetTypePartSubs = new ArrayList<UpdExtSalesOrderDataSetTypePartSubs>();
        }
        return this.updExtSalesOrderDataSetTypePartSubs;
    }

}
