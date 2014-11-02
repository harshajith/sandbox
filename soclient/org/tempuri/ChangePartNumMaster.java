
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.epicor.webservices.CallContextDataSetType;
import com.epicor.webservices.SalesOrderDataSetType;


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
 *         &lt;element name="partNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lSubstitutePartExist" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="lIsPhantom" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="uomCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sysRowID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rowType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salesKitView" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="removeKitComponents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="suppressUserPrompts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="getPartXRefInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="checkPartRevisionChange" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="checkChangeKitParent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ds" type="{http://epicor.com/webservices}SalesOrderDataSetType" minOccurs="0"/>
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
    "partNum",
    "lSubstitutePartExist",
    "lIsPhantom",
    "uomCode",
    "sysRowID",
    "rowType",
    "salesKitView",
    "removeKitComponents",
    "suppressUserPrompts",
    "getPartXRefInfo",
    "checkPartRevisionChange",
    "checkChangeKitParent",
    "ds",
    "callContext"
})
@XmlRootElement(name = "ChangePartNumMaster")
public class ChangePartNumMaster {

    @XmlElement(nillable = true)
    protected String loginOptions;
    @XmlElement(nillable = true)
    protected String partNum;
    protected Boolean lSubstitutePartExist;
    protected Boolean lIsPhantom;
    @XmlElement(nillable = true)
    protected String uomCode;
    @XmlElement(nillable = true)
    protected String sysRowID;
    @XmlElement(nillable = true)
    protected String rowType;
    protected Boolean salesKitView;
    protected Boolean removeKitComponents;
    protected Boolean suppressUserPrompts;
    protected Boolean getPartXRefInfo;
    protected Boolean checkPartRevisionChange;
    protected Boolean checkChangeKitParent;
    @XmlElement(nillable = true)
    protected SalesOrderDataSetType ds;
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
     * Gets the value of the lSubstitutePartExist property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLSubstitutePartExist() {
        return lSubstitutePartExist;
    }

    /**
     * Sets the value of the lSubstitutePartExist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLSubstitutePartExist(Boolean value) {
        this.lSubstitutePartExist = value;
    }

    /**
     * Gets the value of the lIsPhantom property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLIsPhantom() {
        return lIsPhantom;
    }

    /**
     * Sets the value of the lIsPhantom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLIsPhantom(Boolean value) {
        this.lIsPhantom = value;
    }

    /**
     * Gets the value of the uomCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUomCode() {
        return uomCode;
    }

    /**
     * Sets the value of the uomCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUomCode(String value) {
        this.uomCode = value;
    }

    /**
     * Gets the value of the sysRowID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysRowID() {
        return sysRowID;
    }

    /**
     * Sets the value of the sysRowID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysRowID(String value) {
        this.sysRowID = value;
    }

    /**
     * Gets the value of the rowType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowType() {
        return rowType;
    }

    /**
     * Sets the value of the rowType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowType(String value) {
        this.rowType = value;
    }

    /**
     * Gets the value of the salesKitView property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSalesKitView() {
        return salesKitView;
    }

    /**
     * Sets the value of the salesKitView property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSalesKitView(Boolean value) {
        this.salesKitView = value;
    }

    /**
     * Gets the value of the removeKitComponents property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemoveKitComponents() {
        return removeKitComponents;
    }

    /**
     * Sets the value of the removeKitComponents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoveKitComponents(Boolean value) {
        this.removeKitComponents = value;
    }

    /**
     * Gets the value of the suppressUserPrompts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuppressUserPrompts() {
        return suppressUserPrompts;
    }

    /**
     * Sets the value of the suppressUserPrompts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuppressUserPrompts(Boolean value) {
        this.suppressUserPrompts = value;
    }

    /**
     * Gets the value of the getPartXRefInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGetPartXRefInfo() {
        return getPartXRefInfo;
    }

    /**
     * Sets the value of the getPartXRefInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGetPartXRefInfo(Boolean value) {
        this.getPartXRefInfo = value;
    }

    /**
     * Gets the value of the checkPartRevisionChange property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckPartRevisionChange() {
        return checkPartRevisionChange;
    }

    /**
     * Sets the value of the checkPartRevisionChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckPartRevisionChange(Boolean value) {
        this.checkPartRevisionChange = value;
    }

    /**
     * Gets the value of the checkChangeKitParent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckChangeKitParent() {
        return checkChangeKitParent;
    }

    /**
     * Sets the value of the checkChangeKitParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckChangeKitParent(Boolean value) {
        this.checkChangeKitParent = value;
    }

    /**
     * Gets the value of the ds property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderDataSetType }
     *     
     */
    public SalesOrderDataSetType getDs() {
        return ds;
    }

    /**
     * Sets the value of the ds property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderDataSetType }
     *     
     */
    public void setDs(SalesOrderDataSetType value) {
        this.ds = value;
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
