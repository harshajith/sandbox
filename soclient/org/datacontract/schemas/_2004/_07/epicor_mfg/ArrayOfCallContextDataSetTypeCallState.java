
package org.datacontract.schemas._2004._07.epicor_mfg;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCallContextDataSetTypeCallState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCallContextDataSetTypeCallState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CallContextDataSetTypeCallState" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}CallContextDataSetTypeCallState" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCallContextDataSetTypeCallState", propOrder = {
    "callContextDataSetTypeCallStates"
})
public class ArrayOfCallContextDataSetTypeCallState {

    @XmlElement(name = "CallContextDataSetTypeCallState", nillable = true)
    protected List<CallContextDataSetTypeCallState> callContextDataSetTypeCallStates;

    /**
     * Gets the value of the callContextDataSetTypeCallStates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callContextDataSetTypeCallStates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallContextDataSetTypeCallStates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CallContextDataSetTypeCallState }
     * 
     * 
     */
    public List<CallContextDataSetTypeCallState> getCallContextDataSetTypeCallStates() {
        if (callContextDataSetTypeCallStates == null) {
            callContextDataSetTypeCallStates = new ArrayList<CallContextDataSetTypeCallState>();
        }
        return this.callContextDataSetTypeCallStates;
    }

}
