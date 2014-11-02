
package org.datacontract.schemas._2004._07.epicor_mfg;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUpdExtSalesOrderDataSetTypeOrderRepComm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUpdExtSalesOrderDataSetTypeOrderRepComm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UpdExtSalesOrderDataSetTypeOrderRepComm" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}UpdExtSalesOrderDataSetTypeOrderRepComm" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUpdExtSalesOrderDataSetTypeOrderRepComm", propOrder = {
    "updExtSalesOrderDataSetTypeOrderRepComms"
})
public class ArrayOfUpdExtSalesOrderDataSetTypeOrderRepComm {

    @XmlElement(name = "UpdExtSalesOrderDataSetTypeOrderRepComm", nillable = true)
    protected List<UpdExtSalesOrderDataSetTypeOrderRepComm> updExtSalesOrderDataSetTypeOrderRepComms;

    /**
     * Gets the value of the updExtSalesOrderDataSetTypeOrderRepComms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updExtSalesOrderDataSetTypeOrderRepComms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdExtSalesOrderDataSetTypeOrderRepComms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdExtSalesOrderDataSetTypeOrderRepComm }
     * 
     * 
     */
    public List<UpdExtSalesOrderDataSetTypeOrderRepComm> getUpdExtSalesOrderDataSetTypeOrderRepComms() {
        if (updExtSalesOrderDataSetTypeOrderRepComms == null) {
            updExtSalesOrderDataSetTypeOrderRepComms = new ArrayList<UpdExtSalesOrderDataSetTypeOrderRepComm>();
        }
        return this.updExtSalesOrderDataSetTypeOrderRepComms;
    }

}
