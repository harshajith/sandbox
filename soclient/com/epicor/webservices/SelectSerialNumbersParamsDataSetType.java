
package com.epicor.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfSelectSerialNumbersParamsDataSetTypeSelectSerialNumbersParams;


/**
 * <p>Java class for SelectSerialNumbersParamsDataSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectSerialNumbersParamsDataSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SelectSerialNumbersParams" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfSelectSerialNumbersParamsDataSetTypeSelectSerialNumbersParams" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectSerialNumbersParamsDataSetType", propOrder = {
    "selectSerialNumbersParams"
})
public class SelectSerialNumbersParamsDataSetType {

    @XmlElement(name = "SelectSerialNumbersParams", nillable = true)
    protected ArrayOfSelectSerialNumbersParamsDataSetTypeSelectSerialNumbersParams selectSerialNumbersParams;

    /**
     * Gets the value of the selectSerialNumbersParams property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSelectSerialNumbersParamsDataSetTypeSelectSerialNumbersParams }
     *     
     */
    public ArrayOfSelectSerialNumbersParamsDataSetTypeSelectSerialNumbersParams getSelectSerialNumbersParams() {
        return selectSerialNumbersParams;
    }

    /**
     * Sets the value of the selectSerialNumbersParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSelectSerialNumbersParamsDataSetTypeSelectSerialNumbersParams }
     *     
     */
    public void setSelectSerialNumbersParams(ArrayOfSelectSerialNumbersParamsDataSetTypeSelectSerialNumbersParams value) {
        this.selectSerialNumbersParams = value;
    }

}
