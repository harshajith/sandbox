
package com.epicor.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfOrdRelJobProdDataSetTypeJobProd;


/**
 * <p>Java class for OrdRelJobProdDataSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrdRelJobProdDataSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="JobProd" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfOrdRelJobProdDataSetTypeJobProd" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrdRelJobProdDataSetType", propOrder = {
    "jobProd"
})
public class OrdRelJobProdDataSetType {

    @XmlElement(name = "JobProd", nillable = true)
    protected ArrayOfOrdRelJobProdDataSetTypeJobProd jobProd;

    /**
     * Gets the value of the jobProd property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrdRelJobProdDataSetTypeJobProd }
     *     
     */
    public ArrayOfOrdRelJobProdDataSetTypeJobProd getJobProd() {
        return jobProd;
    }

    /**
     * Sets the value of the jobProd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrdRelJobProdDataSetTypeJobProd }
     *     
     */
    public void setJobProd(ArrayOfOrdRelJobProdDataSetTypeJobProd value) {
        this.jobProd = value;
    }

}
