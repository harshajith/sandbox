
package org.datacontract.schemas._2004._07.epicor_mfg;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfETCAddrValidationDataSetTypeETCAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfETCAddrValidationDataSetTypeETCAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ETCAddrValidationDataSetTypeETCAddress" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ETCAddrValidationDataSetTypeETCAddress" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfETCAddrValidationDataSetTypeETCAddress", propOrder = {
    "etcAddrValidationDataSetTypeETCAddresses"
})
public class ArrayOfETCAddrValidationDataSetTypeETCAddress {

    @XmlElement(name = "ETCAddrValidationDataSetTypeETCAddress", nillable = true)
    protected List<ETCAddrValidationDataSetTypeETCAddress> etcAddrValidationDataSetTypeETCAddresses;

    /**
     * Gets the value of the etcAddrValidationDataSetTypeETCAddresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the etcAddrValidationDataSetTypeETCAddresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getETCAddrValidationDataSetTypeETCAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ETCAddrValidationDataSetTypeETCAddress }
     * 
     * 
     */
    public List<ETCAddrValidationDataSetTypeETCAddress> getETCAddrValidationDataSetTypeETCAddresses() {
        if (etcAddrValidationDataSetTypeETCAddresses == null) {
            etcAddrValidationDataSetTypeETCAddresses = new ArrayList<ETCAddrValidationDataSetTypeETCAddress>();
        }
        return this.etcAddrValidationDataSetTypeETCAddresses;
    }

}
