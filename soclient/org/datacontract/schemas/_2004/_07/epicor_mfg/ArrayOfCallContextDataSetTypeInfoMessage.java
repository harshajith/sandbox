
package org.datacontract.schemas._2004._07.epicor_mfg;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCallContextDataSetTypeInfoMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCallContextDataSetTypeInfoMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CallContextDataSetTypeInfoMessage" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}CallContextDataSetTypeInfoMessage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCallContextDataSetTypeInfoMessage", propOrder = {
    "callContextDataSetTypeInfoMessages"
})
public class ArrayOfCallContextDataSetTypeInfoMessage {

    @XmlElement(name = "CallContextDataSetTypeInfoMessage", nillable = true)
    protected List<CallContextDataSetTypeInfoMessage> callContextDataSetTypeInfoMessages;

    /**
     * Gets the value of the callContextDataSetTypeInfoMessages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callContextDataSetTypeInfoMessages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallContextDataSetTypeInfoMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CallContextDataSetTypeInfoMessage }
     * 
     * 
     */
    public List<CallContextDataSetTypeInfoMessage> getCallContextDataSetTypeInfoMessages() {
        if (callContextDataSetTypeInfoMessages == null) {
            callContextDataSetTypeInfoMessages = new ArrayList<CallContextDataSetTypeInfoMessage>();
        }
        return this.callContextDataSetTypeInfoMessages;
    }

}
