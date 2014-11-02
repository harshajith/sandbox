
package com.epicor.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfGlbSugPOChgDataSetTypeGlbSugPOChg;


/**
 * <p>Java class for GlbSugPOChgDataSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlbSugPOChgDataSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GlbSugPOChg" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfGlbSugPOChgDataSetTypeGlbSugPOChg" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlbSugPOChgDataSetType", propOrder = {
    "glbSugPOChg"
})
public class GlbSugPOChgDataSetType {

    @XmlElement(name = "GlbSugPOChg", nillable = true)
    protected ArrayOfGlbSugPOChgDataSetTypeGlbSugPOChg glbSugPOChg;

    /**
     * Gets the value of the glbSugPOChg property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGlbSugPOChgDataSetTypeGlbSugPOChg }
     *     
     */
    public ArrayOfGlbSugPOChgDataSetTypeGlbSugPOChg getGlbSugPOChg() {
        return glbSugPOChg;
    }

    /**
     * Sets the value of the glbSugPOChg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGlbSugPOChgDataSetTypeGlbSugPOChg }
     *     
     */
    public void setGlbSugPOChg(ArrayOfGlbSugPOChgDataSetTypeGlbSugPOChg value) {
        this.glbSugPOChg = value;
    }

}
