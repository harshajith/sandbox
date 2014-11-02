
package org.datacontract.schemas._2004._07.epicor_mfg;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUpdExtSalesOrderDataSetTypeTaxConnectStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUpdExtSalesOrderDataSetTypeTaxConnectStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UpdExtSalesOrderDataSetTypeTaxConnectStatus" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}UpdExtSalesOrderDataSetTypeTaxConnectStatus" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUpdExtSalesOrderDataSetTypeTaxConnectStatus", propOrder = {
    "updExtSalesOrderDataSetTypeTaxConnectStatuses"
})
public class ArrayOfUpdExtSalesOrderDataSetTypeTaxConnectStatus {

    @XmlElement(name = "UpdExtSalesOrderDataSetTypeTaxConnectStatus", nillable = true)
    protected List<UpdExtSalesOrderDataSetTypeTaxConnectStatus> updExtSalesOrderDataSetTypeTaxConnectStatuses;

    /**
     * Gets the value of the updExtSalesOrderDataSetTypeTaxConnectStatuses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updExtSalesOrderDataSetTypeTaxConnectStatuses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdExtSalesOrderDataSetTypeTaxConnectStatuses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdExtSalesOrderDataSetTypeTaxConnectStatus }
     * 
     * 
     */
    public List<UpdExtSalesOrderDataSetTypeTaxConnectStatus> getUpdExtSalesOrderDataSetTypeTaxConnectStatuses() {
        if (updExtSalesOrderDataSetTypeTaxConnectStatuses == null) {
            updExtSalesOrderDataSetTypeTaxConnectStatuses = new ArrayList<UpdExtSalesOrderDataSetTypeTaxConnectStatus>();
        }
        return this.updExtSalesOrderDataSetTypeTaxConnectStatuses;
    }

}
