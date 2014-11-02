
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.epicor.webservices.CallContextDataSetType;
import com.epicor.webservices.OrderHedListDataSetType;


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
 *         &lt;element name="GetListCustomResult" type="{http://epicor.com/webservices}OrderHedListDataSetType" minOccurs="0"/>
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
    "getListCustomResult",
    "morePages",
    "callContextOut"
})
@XmlRootElement(name = "GetListCustomResponse")
public class GetListCustomResponse {

    @XmlElement(name = "GetListCustomResult", nillable = true)
    protected OrderHedListDataSetType getListCustomResult;
    protected Boolean morePages;
    @XmlElement(nillable = true)
    protected CallContextDataSetType callContextOut;

    /**
     * Gets the value of the getListCustomResult property.
     * 
     * @return
     *     possible object is
     *     {@link OrderHedListDataSetType }
     *     
     */
    public OrderHedListDataSetType getGetListCustomResult() {
        return getListCustomResult;
    }

    /**
     * Sets the value of the getListCustomResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderHedListDataSetType }
     *     
     */
    public void setGetListCustomResult(OrderHedListDataSetType value) {
        this.getListCustomResult = value;
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
