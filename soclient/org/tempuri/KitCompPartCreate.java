
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.epicor.webservices.CallContextDataSetType;


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
 *         &lt;element name="loginOptions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="orderLine" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="partNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="revisionNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="smartString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newPartNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newCustPartNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="responseAutoCrtPart" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="callContext" type="{http://epicor.com/webservices}CallContextDataSetType" minOccurs="0"/>
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
    "loginOptions",
    "orderNum",
    "orderLine",
    "partNum",
    "revisionNum",
    "smartString",
    "newPartNum",
    "newCustPartNum",
    "responseAutoCrtPart",
    "callContext"
})
@XmlRootElement(name = "KitCompPartCreate")
public class KitCompPartCreate {

    @XmlElement(nillable = true)
    protected String loginOptions;
    protected Integer orderNum;
    protected Integer orderLine;
    @XmlElement(nillable = true)
    protected String partNum;
    @XmlElement(nillable = true)
    protected String revisionNum;
    @XmlElement(nillable = true)
    protected String smartString;
    @XmlElement(nillable = true)
    protected String newPartNum;
    @XmlElement(nillable = true)
    protected String newCustPartNum;
    protected Boolean responseAutoCrtPart;
    @XmlElement(nillable = true)
    protected CallContextDataSetType callContext;

    /**
     * Gets the value of the loginOptions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginOptions() {
        return loginOptions;
    }

    /**
     * Sets the value of the loginOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginOptions(String value) {
        this.loginOptions = value;
    }

    /**
     * Gets the value of the orderNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrderNum() {
        return orderNum;
    }

    /**
     * Sets the value of the orderNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrderNum(Integer value) {
        this.orderNum = value;
    }

    /**
     * Gets the value of the orderLine property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrderLine() {
        return orderLine;
    }

    /**
     * Sets the value of the orderLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrderLine(Integer value) {
        this.orderLine = value;
    }

    /**
     * Gets the value of the partNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartNum() {
        return partNum;
    }

    /**
     * Sets the value of the partNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartNum(String value) {
        this.partNum = value;
    }

    /**
     * Gets the value of the revisionNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevisionNum() {
        return revisionNum;
    }

    /**
     * Sets the value of the revisionNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevisionNum(String value) {
        this.revisionNum = value;
    }

    /**
     * Gets the value of the smartString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmartString() {
        return smartString;
    }

    /**
     * Sets the value of the smartString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmartString(String value) {
        this.smartString = value;
    }

    /**
     * Gets the value of the newPartNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPartNum() {
        return newPartNum;
    }

    /**
     * Sets the value of the newPartNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPartNum(String value) {
        this.newPartNum = value;
    }

    /**
     * Gets the value of the newCustPartNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCustPartNum() {
        return newCustPartNum;
    }

    /**
     * Sets the value of the newCustPartNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCustPartNum(String value) {
        this.newCustPartNum = value;
    }

    /**
     * Gets the value of the responseAutoCrtPart property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResponseAutoCrtPart() {
        return responseAutoCrtPart;
    }

    /**
     * Sets the value of the responseAutoCrtPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResponseAutoCrtPart(Boolean value) {
        this.responseAutoCrtPart = value;
    }

    /**
     * Gets the value of the callContext property.
     * 
     * @return
     *     possible object is
     *     {@link CallContextDataSetType }
     *     
     */
    public CallContextDataSetType getCallContext() {
        return callContext;
    }

    /**
     * Sets the value of the callContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallContextDataSetType }
     *     
     */
    public void setCallContext(CallContextDataSetType value) {
        this.callContext = value;
    }

}
