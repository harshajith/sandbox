
package org.datacontract.schemas._2004._07.epicor_mfg;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfETCAddrValidationDataSetTypeETCMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfETCAddrValidationDataSetTypeETCMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ETCAddrValidationDataSetTypeETCMessage" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ETCAddrValidationDataSetTypeETCMessage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfETCAddrValidationDataSetTypeETCMessage", propOrder = {
    "etcAddrValidationDataSetTypeETCMessages"
})
public class ArrayOfETCAddrValidationDataSetTypeETCMessage {

    @XmlElement(name = "ETCAddrValidationDataSetTypeETCMessage", nillable = true)
    protected List<ETCAddrValidationDataSetTypeETCMessage> etcAddrValidationDataSetTypeETCMessages;

    /**
     * Gets the value of the etcAddrValidationDataSetTypeETCMessages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the etcAddrValidationDataSetTypeETCMessages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getETCAddrValidationDataSetTypeETCMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ETCAddrValidationDataSetTypeETCMessage }
     * 
     * 
     */
    public List<ETCAddrValidationDataSetTypeETCMessage> getETCAddrValidationDataSetTypeETCMessages() {
        if (etcAddrValidationDataSetTypeETCMessages == null) {
            etcAddrValidationDataSetTypeETCMessages = new ArrayList<ETCAddrValidationDataSetTypeETCMessage>();
        }
        return this.etcAddrValidationDataSetTypeETCMessages;
    }

}
