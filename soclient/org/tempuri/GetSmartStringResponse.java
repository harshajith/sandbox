
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
 *         &lt;element name="smartString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createPart" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="promptForPartNum" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="notifyOfExistingPart" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="newPartNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createCustPart" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="promptForCustPartNum" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="newCustPartNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promptForAutoCreatePart" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "smartString",
    "createPart",
    "promptForPartNum",
    "notifyOfExistingPart",
    "newPartNum",
    "createCustPart",
    "promptForCustPartNum",
    "newCustPartNum",
    "promptForAutoCreatePart",
    "callContextOut"
})
@XmlRootElement(name = "GetSmartStringResponse")
public class GetSmartStringResponse {

    @XmlElement(nillable = true)
    protected String smartString;
    protected Boolean createPart;
    protected Boolean promptForPartNum;
    protected Boolean notifyOfExistingPart;
    @XmlElement(nillable = true)
    protected String newPartNum;
    protected Boolean createCustPart;
    protected Boolean promptForCustPartNum;
    @XmlElement(nillable = true)
    protected String newCustPartNum;
    protected Boolean promptForAutoCreatePart;
    @XmlElement(nillable = true)
    protected CallContextDataSetType callContextOut;

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
     * Gets the value of the createPart property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreatePart() {
        return createPart;
    }

    /**
     * Sets the value of the createPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreatePart(Boolean value) {
        this.createPart = value;
    }

    /**
     * Gets the value of the promptForPartNum property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPromptForPartNum() {
        return promptForPartNum;
    }

    /**
     * Sets the value of the promptForPartNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPromptForPartNum(Boolean value) {
        this.promptForPartNum = value;
    }

    /**
     * Gets the value of the notifyOfExistingPart property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotifyOfExistingPart() {
        return notifyOfExistingPart;
    }

    /**
     * Sets the value of the notifyOfExistingPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotifyOfExistingPart(Boolean value) {
        this.notifyOfExistingPart = value;
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
     * Gets the value of the createCustPart property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreateCustPart() {
        return createCustPart;
    }

    /**
     * Sets the value of the createCustPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreateCustPart(Boolean value) {
        this.createCustPart = value;
    }

    /**
     * Gets the value of the promptForCustPartNum property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPromptForCustPartNum() {
        return promptForCustPartNum;
    }

    /**
     * Sets the value of the promptForCustPartNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPromptForCustPartNum(Boolean value) {
        this.promptForCustPartNum = value;
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
     * Gets the value of the promptForAutoCreatePart property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPromptForAutoCreatePart() {
        return promptForAutoCreatePart;
    }

    /**
     * Sets the value of the promptForAutoCreatePart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPromptForAutoCreatePart(Boolean value) {
        this.promptForAutoCreatePart = value;
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
