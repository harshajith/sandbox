
package com.epicor.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfCallContextDataSetTypeBpmData;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfCallContextDataSetTypeCallStack;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfCallContextDataSetTypeCallState;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfCallContextDataSetTypeClient;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfCallContextDataSetTypeClientHandler;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfCallContextDataSetTypeInfoMessage;


/**
 * <p>Java class for CallContextDataSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CallContextDataSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BpmData" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfCallContextDataSetTypeBpmData" minOccurs="0"/>
 *         &lt;element name="CallStack" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfCallContextDataSetTypeCallStack" minOccurs="0"/>
 *         &lt;element name="CallState" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfCallContextDataSetTypeCallState" minOccurs="0"/>
 *         &lt;element name="Client" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfCallContextDataSetTypeClient" minOccurs="0"/>
 *         &lt;element name="ClientHandler" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfCallContextDataSetTypeClientHandler" minOccurs="0"/>
 *         &lt;element name="InfoMessage" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfCallContextDataSetTypeInfoMessage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallContextDataSetType", propOrder = {
    "bpmData",
    "callStack",
    "callState",
    "client",
    "clientHandler",
    "infoMessage"
})
public class CallContextDataSetType {

    @XmlElement(name = "BpmData", nillable = true)
    protected ArrayOfCallContextDataSetTypeBpmData bpmData;
    @XmlElement(name = "CallStack", nillable = true)
    protected ArrayOfCallContextDataSetTypeCallStack callStack;
    @XmlElement(name = "CallState", nillable = true)
    protected ArrayOfCallContextDataSetTypeCallState callState;
    @XmlElement(name = "Client", nillable = true)
    protected ArrayOfCallContextDataSetTypeClient client;
    @XmlElement(name = "ClientHandler", nillable = true)
    protected ArrayOfCallContextDataSetTypeClientHandler clientHandler;
    @XmlElement(name = "InfoMessage", nillable = true)
    protected ArrayOfCallContextDataSetTypeInfoMessage infoMessage;

    /**
     * Gets the value of the bpmData property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCallContextDataSetTypeBpmData }
     *     
     */
    public ArrayOfCallContextDataSetTypeBpmData getBpmData() {
        return bpmData;
    }

    /**
     * Sets the value of the bpmData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCallContextDataSetTypeBpmData }
     *     
     */
    public void setBpmData(ArrayOfCallContextDataSetTypeBpmData value) {
        this.bpmData = value;
    }

    /**
     * Gets the value of the callStack property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCallContextDataSetTypeCallStack }
     *     
     */
    public ArrayOfCallContextDataSetTypeCallStack getCallStack() {
        return callStack;
    }

    /**
     * Sets the value of the callStack property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCallContextDataSetTypeCallStack }
     *     
     */
    public void setCallStack(ArrayOfCallContextDataSetTypeCallStack value) {
        this.callStack = value;
    }

    /**
     * Gets the value of the callState property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCallContextDataSetTypeCallState }
     *     
     */
    public ArrayOfCallContextDataSetTypeCallState getCallState() {
        return callState;
    }

    /**
     * Sets the value of the callState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCallContextDataSetTypeCallState }
     *     
     */
    public void setCallState(ArrayOfCallContextDataSetTypeCallState value) {
        this.callState = value;
    }

    /**
     * Gets the value of the client property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCallContextDataSetTypeClient }
     *     
     */
    public ArrayOfCallContextDataSetTypeClient getClient() {
        return client;
    }

    /**
     * Sets the value of the client property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCallContextDataSetTypeClient }
     *     
     */
    public void setClient(ArrayOfCallContextDataSetTypeClient value) {
        this.client = value;
    }

    /**
     * Gets the value of the clientHandler property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCallContextDataSetTypeClientHandler }
     *     
     */
    public ArrayOfCallContextDataSetTypeClientHandler getClientHandler() {
        return clientHandler;
    }

    /**
     * Sets the value of the clientHandler property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCallContextDataSetTypeClientHandler }
     *     
     */
    public void setClientHandler(ArrayOfCallContextDataSetTypeClientHandler value) {
        this.clientHandler = value;
    }

    /**
     * Gets the value of the infoMessage property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCallContextDataSetTypeInfoMessage }
     *     
     */
    public ArrayOfCallContextDataSetTypeInfoMessage getInfoMessage() {
        return infoMessage;
    }

    /**
     * Sets the value of the infoMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCallContextDataSetTypeInfoMessage }
     *     
     */
    public void setInfoMessage(ArrayOfCallContextDataSetTypeInfoMessage value) {
        this.infoMessage = value;
    }

}
