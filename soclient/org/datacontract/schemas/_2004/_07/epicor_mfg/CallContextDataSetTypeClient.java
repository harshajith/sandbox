
package org.datacontract.schemas._2004._07.epicor_mfg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CallContextDataSetTypeClient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CallContextDataSetTypeClient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssemblyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CGCCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentPlant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProcessId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallContextDataSetTypeClient", propOrder = {
    "assemblyName",
    "cgcCode",
    "clientType",
    "currentCompany",
    "currentPlant",
    "currentUserId",
    "customizationId",
    "processId"
})
public class CallContextDataSetTypeClient {

    @XmlElement(name = "AssemblyName", nillable = true)
    protected String assemblyName;
    @XmlElement(name = "CGCCode", nillable = true)
    protected String cgcCode;
    @XmlElement(name = "ClientType", nillable = true)
    protected String clientType;
    @XmlElement(name = "CurrentCompany", nillable = true)
    protected String currentCompany;
    @XmlElement(name = "CurrentPlant", nillable = true)
    protected String currentPlant;
    @XmlElement(name = "CurrentUserId", nillable = true)
    protected String currentUserId;
    @XmlElement(name = "CustomizationId", nillable = true)
    protected String customizationId;
    @XmlElement(name = "ProcessId", nillable = true)
    protected String processId;

    /**
     * Gets the value of the assemblyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssemblyName() {
        return assemblyName;
    }

    /**
     * Sets the value of the assemblyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssemblyName(String value) {
        this.assemblyName = value;
    }

    /**
     * Gets the value of the cgcCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCGCCode() {
        return cgcCode;
    }

    /**
     * Sets the value of the cgcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCGCCode(String value) {
        this.cgcCode = value;
    }

    /**
     * Gets the value of the clientType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientType() {
        return clientType;
    }

    /**
     * Sets the value of the clientType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientType(String value) {
        this.clientType = value;
    }

    /**
     * Gets the value of the currentCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentCompany() {
        return currentCompany;
    }

    /**
     * Sets the value of the currentCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentCompany(String value) {
        this.currentCompany = value;
    }

    /**
     * Gets the value of the currentPlant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentPlant() {
        return currentPlant;
    }

    /**
     * Sets the value of the currentPlant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentPlant(String value) {
        this.currentPlant = value;
    }

    /**
     * Gets the value of the currentUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentUserId() {
        return currentUserId;
    }

    /**
     * Sets the value of the currentUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentUserId(String value) {
        this.currentUserId = value;
    }

    /**
     * Gets the value of the customizationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomizationId() {
        return customizationId;
    }

    /**
     * Sets the value of the customizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomizationId(String value) {
        this.customizationId = value;
    }

    /**
     * Gets the value of the processId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessId() {
        return processId;
    }

    /**
     * Sets the value of the processId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessId(String value) {
        this.processId = value;
    }

}
