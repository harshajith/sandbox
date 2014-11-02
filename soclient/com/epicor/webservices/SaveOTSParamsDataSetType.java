
package com.epicor.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfSaveOTSParamsDataSetTypeSaveOTSParams;


/**
 * <p>Java class for SaveOTSParamsDataSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SaveOTSParamsDataSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SaveOTSParams" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfSaveOTSParamsDataSetTypeSaveOTSParams" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveOTSParamsDataSetType", propOrder = {
    "saveOTSParams"
})
public class SaveOTSParamsDataSetType {

    @XmlElement(name = "SaveOTSParams", nillable = true)
    protected ArrayOfSaveOTSParamsDataSetTypeSaveOTSParams saveOTSParams;

    /**
     * Gets the value of the saveOTSParams property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSaveOTSParamsDataSetTypeSaveOTSParams }
     *     
     */
    public ArrayOfSaveOTSParamsDataSetTypeSaveOTSParams getSaveOTSParams() {
        return saveOTSParams;
    }

    /**
     * Sets the value of the saveOTSParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSaveOTSParamsDataSetTypeSaveOTSParams }
     *     
     */
    public void setSaveOTSParams(ArrayOfSaveOTSParamsDataSetTypeSaveOTSParams value) {
        this.saveOTSParams = value;
    }

}
