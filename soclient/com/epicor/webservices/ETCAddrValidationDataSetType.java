
package com.epicor.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfETCAddrValidationDataSetTypeETCAddress;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfETCAddrValidationDataSetTypeETCMessage;


/**
 * <p>Java class for ETCAddrValidationDataSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ETCAddrValidationDataSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ETCAddress" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfETCAddrValidationDataSetTypeETCAddress" minOccurs="0"/>
 *         &lt;element name="ETCMessage" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfETCAddrValidationDataSetTypeETCMessage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ETCAddrValidationDataSetType", propOrder = {
    "etcAddress",
    "etcMessage"
})
public class ETCAddrValidationDataSetType {

    @XmlElement(name = "ETCAddress", nillable = true)
    protected ArrayOfETCAddrValidationDataSetTypeETCAddress etcAddress;
    @XmlElement(name = "ETCMessage", nillable = true)
    protected ArrayOfETCAddrValidationDataSetTypeETCMessage etcMessage;

    /**
     * Gets the value of the etcAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfETCAddrValidationDataSetTypeETCAddress }
     *     
     */
    public ArrayOfETCAddrValidationDataSetTypeETCAddress getETCAddress() {
        return etcAddress;
    }

    /**
     * Sets the value of the etcAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfETCAddrValidationDataSetTypeETCAddress }
     *     
     */
    public void setETCAddress(ArrayOfETCAddrValidationDataSetTypeETCAddress value) {
        this.etcAddress = value;
    }

    /**
     * Gets the value of the etcMessage property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfETCAddrValidationDataSetTypeETCMessage }
     *     
     */
    public ArrayOfETCAddrValidationDataSetTypeETCMessage getETCMessage() {
        return etcMessage;
    }

    /**
     * Sets the value of the etcMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfETCAddrValidationDataSetTypeETCMessage }
     *     
     */
    public void setETCMessage(ArrayOfETCAddrValidationDataSetTypeETCMessage value) {
        this.etcMessage = value;
    }

}
