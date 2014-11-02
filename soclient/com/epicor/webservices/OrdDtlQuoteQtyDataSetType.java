
package com.epicor.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfOrdDtlQuoteQtyDataSetTypeQuoteQty;


/**
 * <p>Java class for OrdDtlQuoteQtyDataSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrdDtlQuoteQtyDataSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QuoteQty" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfOrdDtlQuoteQtyDataSetTypeQuoteQty" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrdDtlQuoteQtyDataSetType", propOrder = {
    "quoteQty"
})
public class OrdDtlQuoteQtyDataSetType {

    @XmlElement(name = "QuoteQty", nillable = true)
    protected ArrayOfOrdDtlQuoteQtyDataSetTypeQuoteQty quoteQty;

    /**
     * Gets the value of the quoteQty property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrdDtlQuoteQtyDataSetTypeQuoteQty }
     *     
     */
    public ArrayOfOrdDtlQuoteQtyDataSetTypeQuoteQty getQuoteQty() {
        return quoteQty;
    }

    /**
     * Sets the value of the quoteQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrdDtlQuoteQtyDataSetTypeQuoteQty }
     *     
     */
    public void setQuoteQty(ArrayOfOrdDtlQuoteQtyDataSetTypeQuoteQty value) {
        this.quoteQty = value;
    }

}
