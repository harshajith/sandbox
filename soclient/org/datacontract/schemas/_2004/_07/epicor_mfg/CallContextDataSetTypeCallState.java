
package org.datacontract.schemas._2004._07.epicor_mfg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CallContextDataSetTypeCallState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CallContextDataSetTypeCallState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArgumentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChunkSeq" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ValueChunk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallContextDataSetTypeCallState", propOrder = {
    "argumentName",
    "chunkSeq",
    "valueChunk"
})
public class CallContextDataSetTypeCallState {

    @XmlElement(name = "ArgumentName", nillable = true)
    protected String argumentName;
    @XmlElement(name = "ChunkSeq", nillable = true)
    protected Integer chunkSeq;
    @XmlElement(name = "ValueChunk", nillable = true)
    protected String valueChunk;

    /**
     * Gets the value of the argumentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArgumentName() {
        return argumentName;
    }

    /**
     * Sets the value of the argumentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArgumentName(String value) {
        this.argumentName = value;
    }

    /**
     * Gets the value of the chunkSeq property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChunkSeq() {
        return chunkSeq;
    }

    /**
     * Sets the value of the chunkSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChunkSeq(Integer value) {
        this.chunkSeq = value;
    }

    /**
     * Gets the value of the valueChunk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueChunk() {
        return valueChunk;
    }

    /**
     * Sets the value of the valueChunk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueChunk(String value) {
        this.valueChunk = value;
    }

}
