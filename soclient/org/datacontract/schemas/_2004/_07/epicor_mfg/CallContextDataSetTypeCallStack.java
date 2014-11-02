
package org.datacontract.schemas._2004._07.epicor_mfg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CallContextDataSetTypeCallStack complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CallContextDataSetTypeCallStack">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Milestone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallContextDataSetTypeCallStack", propOrder = {
    "milestone",
    "state"
})
public class CallContextDataSetTypeCallStack {

    @XmlElement(name = "Milestone", nillable = true)
    protected String milestone;
    @XmlElement(name = "State", nillable = true)
    protected String state;

    /**
     * Gets the value of the milestone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMilestone() {
        return milestone;
    }

    /**
     * Sets the value of the milestone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMilestone(String value) {
        this.milestone = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

}
