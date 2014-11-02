
package com.epicor.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfSOEntryUIParamsDataSetTypeSOEntryUIParams;


/**
 * <p>Java class for SOEntryUIParamsDataSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SOEntryUIParamsDataSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SOEntryUIParams" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfSOEntryUIParamsDataSetTypeSOEntryUIParams" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SOEntryUIParamsDataSetType", propOrder = {
    "soEntryUIParams"
})
public class SOEntryUIParamsDataSetType {

    @XmlElement(name = "SOEntryUIParams", nillable = true)
    protected ArrayOfSOEntryUIParamsDataSetTypeSOEntryUIParams soEntryUIParams;

    /**
     * Gets the value of the soEntryUIParams property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSOEntryUIParamsDataSetTypeSOEntryUIParams }
     *     
     */
    public ArrayOfSOEntryUIParamsDataSetTypeSOEntryUIParams getSOEntryUIParams() {
        return soEntryUIParams;
    }

    /**
     * Sets the value of the soEntryUIParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSOEntryUIParamsDataSetTypeSOEntryUIParams }
     *     
     */
    public void setSOEntryUIParams(ArrayOfSOEntryUIParamsDataSetTypeSOEntryUIParams value) {
        this.soEntryUIParams = value;
    }

}
