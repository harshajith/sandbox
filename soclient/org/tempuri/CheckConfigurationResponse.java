
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
 *         &lt;element name="canGetDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="needsConfiguration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="configureRevision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reasonMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "canGetDetails",
    "needsConfiguration",
    "configureRevision",
    "reasonMessage",
    "callContextOut"
})
@XmlRootElement(name = "CheckConfigurationResponse")
public class CheckConfigurationResponse {

    protected Boolean canGetDetails;
    protected Boolean needsConfiguration;
    @XmlElement(nillable = true)
    protected String configureRevision;
    @XmlElement(nillable = true)
    protected String reasonMessage;
    @XmlElement(nillable = true)
    protected CallContextDataSetType callContextOut;

    /**
     * Gets the value of the canGetDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanGetDetails() {
        return canGetDetails;
    }

    /**
     * Sets the value of the canGetDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanGetDetails(Boolean value) {
        this.canGetDetails = value;
    }

    /**
     * Gets the value of the needsConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNeedsConfiguration() {
        return needsConfiguration;
    }

    /**
     * Sets the value of the needsConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNeedsConfiguration(Boolean value) {
        this.needsConfiguration = value;
    }

    /**
     * Gets the value of the configureRevision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigureRevision() {
        return configureRevision;
    }

    /**
     * Sets the value of the configureRevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigureRevision(String value) {
        this.configureRevision = value;
    }

    /**
     * Gets the value of the reasonMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonMessage() {
        return reasonMessage;
    }

    /**
     * Sets the value of the reasonMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonMessage(String value) {
        this.reasonMessage = value;
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
