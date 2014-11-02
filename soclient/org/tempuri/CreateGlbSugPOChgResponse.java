
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.epicor.webservices.CallContextDataSetType;
import com.epicor.webservices.GlbSugPOChgDataSetType;


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
 *         &lt;element name="CreateGlbSugPOChgResult" type="{http://epicor.com/webservices}GlbSugPOChgDataSetType" minOccurs="0"/>
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
    "createGlbSugPOChgResult",
    "callContextOut"
})
@XmlRootElement(name = "CreateGlbSugPOChgResponse")
public class CreateGlbSugPOChgResponse {

    @XmlElement(name = "CreateGlbSugPOChgResult", nillable = true)
    protected GlbSugPOChgDataSetType createGlbSugPOChgResult;
    @XmlElement(nillable = true)
    protected CallContextDataSetType callContextOut;

    /**
     * Gets the value of the createGlbSugPOChgResult property.
     * 
     * @return
     *     possible object is
     *     {@link GlbSugPOChgDataSetType }
     *     
     */
    public GlbSugPOChgDataSetType getCreateGlbSugPOChgResult() {
        return createGlbSugPOChgResult;
    }

    /**
     * Sets the value of the createGlbSugPOChgResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlbSugPOChgDataSetType }
     *     
     */
    public void setCreateGlbSugPOChgResult(GlbSugPOChgDataSetType value) {
        this.createGlbSugPOChgResult = value;
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
