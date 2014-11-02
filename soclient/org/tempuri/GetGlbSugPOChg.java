
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
 *         &lt;element name="iOrderNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="iOrderLine" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="iOrderRelNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="absolutePage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "iOrderNum",
    "iOrderLine",
    "iOrderRelNum",
    "pageSize",
    "absolutePage",
    "callContext"
})
@XmlRootElement(name = "GetGlbSugPOChg")
public class GetGlbSugPOChg {

    @XmlElement(nillable = true)
    protected String loginOptions;
    protected Integer iOrderNum;
    protected Integer iOrderLine;
    protected Integer iOrderRelNum;
    protected Integer pageSize;
    protected Integer absolutePage;
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
     * Gets the value of the iOrderNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIOrderNum() {
        return iOrderNum;
    }

    /**
     * Sets the value of the iOrderNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIOrderNum(Integer value) {
        this.iOrderNum = value;
    }

    /**
     * Gets the value of the iOrderLine property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIOrderLine() {
        return iOrderLine;
    }

    /**
     * Sets the value of the iOrderLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIOrderLine(Integer value) {
        this.iOrderLine = value;
    }

    /**
     * Gets the value of the iOrderRelNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIOrderRelNum() {
        return iOrderRelNum;
    }

    /**
     * Sets the value of the iOrderRelNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIOrderRelNum(Integer value) {
        this.iOrderRelNum = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageSize(Integer value) {
        this.pageSize = value;
    }

    /**
     * Gets the value of the absolutePage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAbsolutePage() {
        return absolutePage;
    }

    /**
     * Sets the value of the absolutePage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAbsolutePage(Integer value) {
        this.absolutePage = value;
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
