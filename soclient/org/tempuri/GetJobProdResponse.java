
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.epicor.webservices.CallContextDataSetType;
import com.epicor.webservices.OrdRelJobProdDataSetType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetJobProdResult" type="{http://epicor.com/webservices}OrdRelJobProdDataSetType" minOccurs="0"/>
 *         &lt;element name="morePages" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="callContextOut" type="{http://epicor.com/webservices}CallContextDataSetType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getJobProdResult",
    "morePages",
    "callContextOut"
})
@XmlRootElement(name = "GetJobProdResponse")
public class GetJobProdResponse {

    @XmlElement(name = "GetJobProdResult", nillable = true)
    protected OrdRelJobProdDataSetType getJobProdResult;
    protected Boolean morePages;
    @XmlElement(nillable = true)
    protected CallContextDataSetType callContextOut;

    /**
     * Gets the value of the getJobProdResult property.
     * 
     * @return
     *     possible object is
     *     {@link OrdRelJobProdDataSetType }
     *     
     */
    public OrdRelJobProdDataSetType getGetJobProdResult() {
        return getJobProdResult;
    }

    /**
     * Sets the value of the getJobProdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrdRelJobProdDataSetType }
     *     
     */
    public void setGetJobProdResult(OrdRelJobProdDataSetType value) {
        this.getJobProdResult = value;
    }

    /**
     * Gets the value of the morePages property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMorePages() {
        return morePages;
    }

    /**
     * Sets the value of the morePages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMorePages(Boolean value) {
        this.morePages = value;
    }

    /**
     * Gets the value of the callContextOut property.
     * 
     * @return
     *     possible object is
     *     {@link CallContextDataSetType }
     *     
     */
    public CallContextDataSetType getCallContextOut() {
        return callContextOut;
    }

    /**
     * Sets the value of the callContextOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallContextDataSetType }
     *     
     */
    public void setCallContextOut(CallContextDataSetType value) {
        this.callContextOut = value;
    }

}
