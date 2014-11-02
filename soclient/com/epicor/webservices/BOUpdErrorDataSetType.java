
package com.epicor.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfBOUpdErrorDataSetTypeBOUpdError;


/**
 * <p>Java class for BOUpdErrorDataSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BOUpdErrorDataSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BOUpdError" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfBOUpdErrorDataSetTypeBOUpdError" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BOUpdErrorDataSetType", propOrder = {
    "boUpdError"
})
public class BOUpdErrorDataSetType {

    @XmlElement(name = "BOUpdError", nillable = true)
    protected ArrayOfBOUpdErrorDataSetTypeBOUpdError boUpdError;

    /**
     * Gets the value of the boUpdError property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBOUpdErrorDataSetTypeBOUpdError }
     *     
     */
    public ArrayOfBOUpdErrorDataSetTypeBOUpdError getBOUpdError() {
        return boUpdError;
    }

    /**
     * Sets the value of the boUpdError property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBOUpdErrorDataSetTypeBOUpdError }
     *     
     */
    public void setBOUpdError(ArrayOfBOUpdErrorDataSetTypeBOUpdError value) {
        this.boUpdError = value;
    }

}
