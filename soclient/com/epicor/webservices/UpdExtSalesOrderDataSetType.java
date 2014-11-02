
package com.epicor.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfUpdExtSalesOrderDataSetTypeHedTaxSum;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfUpdExtSalesOrderDataSetTypeOHOrderMsc;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfUpdExtSalesOrderDataSetTypeOrderDtl;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfUpdExtSalesOrderDataSetTypeOrderDtlAttch;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfUpdExtSalesOrderDataSetTypeOrderHed;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfUpdExtSalesOrderDataSetTypeOrderHedAttch;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfUpdExtSalesOrderDataSetTypeOrderHedUPS;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfUpdExtSalesOrderDataSetTypeOrderHist;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfUpdExtSalesOrderDataSetTypeOrderMsc;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfUpdExtSalesOrderDataSetTypeOrderRel;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfUpdExtSalesOrderDataSetTypeOrderRelTax;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfUpdExtSalesOrderDataSetTypeOrderRepComm;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfUpdExtSalesOrderDataSetTypePartSubs;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfUpdExtSalesOrderDataSetTypeSNFormat;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfUpdExtSalesOrderDataSetTypeSelectedSerialNumbers;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfUpdExtSalesOrderDataSetTypeTaxConnectStatus;


/**
 * <p>Java class for UpdExtSalesOrderDataSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdExtSalesOrderDataSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HedTaxSum" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfUpdExtSalesOrderDataSetTypeHedTaxSum" minOccurs="0"/>
 *         &lt;element name="OHOrderMsc" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfUpdExtSalesOrderDataSetTypeOHOrderMsc" minOccurs="0"/>
 *         &lt;element name="OrderDtl" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfUpdExtSalesOrderDataSetTypeOrderDtl" minOccurs="0"/>
 *         &lt;element name="OrderDtlAttch" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfUpdExtSalesOrderDataSetTypeOrderDtlAttch" minOccurs="0"/>
 *         &lt;element name="OrderHed" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfUpdExtSalesOrderDataSetTypeOrderHed" minOccurs="0"/>
 *         &lt;element name="OrderHedAttch" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfUpdExtSalesOrderDataSetTypeOrderHedAttch" minOccurs="0"/>
 *         &lt;element name="OrderHedUPS" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfUpdExtSalesOrderDataSetTypeOrderHedUPS" minOccurs="0"/>
 *         &lt;element name="OrderHist" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfUpdExtSalesOrderDataSetTypeOrderHist" minOccurs="0"/>
 *         &lt;element name="OrderMsc" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfUpdExtSalesOrderDataSetTypeOrderMsc" minOccurs="0"/>
 *         &lt;element name="OrderRel" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfUpdExtSalesOrderDataSetTypeOrderRel" minOccurs="0"/>
 *         &lt;element name="OrderRelTax" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfUpdExtSalesOrderDataSetTypeOrderRelTax" minOccurs="0"/>
 *         &lt;element name="OrderRepComm" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfUpdExtSalesOrderDataSetTypeOrderRepComm" minOccurs="0"/>
 *         &lt;element name="PartSubs" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfUpdExtSalesOrderDataSetTypePartSubs" minOccurs="0"/>
 *         &lt;element name="SNFormat" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfUpdExtSalesOrderDataSetTypeSNFormat" minOccurs="0"/>
 *         &lt;element name="SelectedSerialNumbers" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfUpdExtSalesOrderDataSetTypeSelectedSerialNumbers" minOccurs="0"/>
 *         &lt;element name="TaxConnectStatus" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfUpdExtSalesOrderDataSetTypeTaxConnectStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdExtSalesOrderDataSetType", propOrder = {
    "hedTaxSum",
    "ohOrderMsc",
    "orderDtl",
    "orderDtlAttch",
    "orderHed",
    "orderHedAttch",
    "orderHedUPS",
    "orderHist",
    "orderMsc",
    "orderRel",
    "orderRelTax",
    "orderRepComm",
    "partSubs",
    "snFormat",
    "selectedSerialNumbers",
    "taxConnectStatus"
})
public class UpdExtSalesOrderDataSetType {

    @XmlElement(name = "HedTaxSum", nillable = true)
    protected ArrayOfUpdExtSalesOrderDataSetTypeHedTaxSum hedTaxSum;
    @XmlElement(name = "OHOrderMsc", nillable = true)
    protected ArrayOfUpdExtSalesOrderDataSetTypeOHOrderMsc ohOrderMsc;
    @XmlElement(name = "OrderDtl", nillable = true)
    protected ArrayOfUpdExtSalesOrderDataSetTypeOrderDtl orderDtl;
    @XmlElement(name = "OrderDtlAttch", nillable = true)
    protected ArrayOfUpdExtSalesOrderDataSetTypeOrderDtlAttch orderDtlAttch;
    @XmlElement(name = "OrderHed", nillable = true)
    protected ArrayOfUpdExtSalesOrderDataSetTypeOrderHed orderHed;
    @XmlElement(name = "OrderHedAttch", nillable = true)
    protected ArrayOfUpdExtSalesOrderDataSetTypeOrderHedAttch orderHedAttch;
    @XmlElement(name = "OrderHedUPS", nillable = true)
    protected ArrayOfUpdExtSalesOrderDataSetTypeOrderHedUPS orderHedUPS;
    @XmlElement(name = "OrderHist", nillable = true)
    protected ArrayOfUpdExtSalesOrderDataSetTypeOrderHist orderHist;
    @XmlElement(name = "OrderMsc", nillable = true)
    protected ArrayOfUpdExtSalesOrderDataSetTypeOrderMsc orderMsc;
    @XmlElement(name = "OrderRel", nillable = true)
    protected ArrayOfUpdExtSalesOrderDataSetTypeOrderRel orderRel;
    @XmlElement(name = "OrderRelTax", nillable = true)
    protected ArrayOfUpdExtSalesOrderDataSetTypeOrderRelTax orderRelTax;
    @XmlElement(name = "OrderRepComm", nillable = true)
    protected ArrayOfUpdExtSalesOrderDataSetTypeOrderRepComm orderRepComm;
    @XmlElement(name = "PartSubs", nillable = true)
    protected ArrayOfUpdExtSalesOrderDataSetTypePartSubs partSubs;
    @XmlElement(name = "SNFormat", nillable = true)
    protected ArrayOfUpdExtSalesOrderDataSetTypeSNFormat snFormat;
    @XmlElement(name = "SelectedSerialNumbers", nillable = true)
    protected ArrayOfUpdExtSalesOrderDataSetTypeSelectedSerialNumbers selectedSerialNumbers;
    @XmlElement(name = "TaxConnectStatus", nillable = true)
    protected ArrayOfUpdExtSalesOrderDataSetTypeTaxConnectStatus taxConnectStatus;

    /**
     * Gets the value of the hedTaxSum property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUpdExtSalesOrderDataSetTypeHedTaxSum }
     *     
     */
    public ArrayOfUpdExtSalesOrderDataSetTypeHedTaxSum getHedTaxSum() {
        return hedTaxSum;
    }

    /**
     * Sets the value of the hedTaxSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUpdExtSalesOrderDataSetTypeHedTaxSum }
     *     
     */
    public void setHedTaxSum(ArrayOfUpdExtSalesOrderDataSetTypeHedTaxSum value) {
        this.hedTaxSum = value;
    }

    /**
     * Gets the value of the ohOrderMsc property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUpdExtSalesOrderDataSetTypeOHOrderMsc }
     *     
     */
    public ArrayOfUpdExtSalesOrderDataSetTypeOHOrderMsc getOHOrderMsc() {
        return ohOrderMsc;
    }

    /**
     * Sets the value of the ohOrderMsc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUpdExtSalesOrderDataSetTypeOHOrderMsc }
     *     
     */
    public void setOHOrderMsc(ArrayOfUpdExtSalesOrderDataSetTypeOHOrderMsc value) {
        this.ohOrderMsc = value;
    }

    /**
     * Gets the value of the orderDtl property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUpdExtSalesOrderDataSetTypeOrderDtl }
     *     
     */
    public ArrayOfUpdExtSalesOrderDataSetTypeOrderDtl getOrderDtl() {
        return orderDtl;
    }

    /**
     * Sets the value of the orderDtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUpdExtSalesOrderDataSetTypeOrderDtl }
     *     
     */
    public void setOrderDtl(ArrayOfUpdExtSalesOrderDataSetTypeOrderDtl value) {
        this.orderDtl = value;
    }

    /**
     * Gets the value of the orderDtlAttch property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUpdExtSalesOrderDataSetTypeOrderDtlAttch }
     *     
     */
    public ArrayOfUpdExtSalesOrderDataSetTypeOrderDtlAttch getOrderDtlAttch() {
        return orderDtlAttch;
    }

    /**
     * Sets the value of the orderDtlAttch property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUpdExtSalesOrderDataSetTypeOrderDtlAttch }
     *     
     */
    public void setOrderDtlAttch(ArrayOfUpdExtSalesOrderDataSetTypeOrderDtlAttch value) {
        this.orderDtlAttch = value;
    }

    /**
     * Gets the value of the orderHed property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUpdExtSalesOrderDataSetTypeOrderHed }
     *     
     */
    public ArrayOfUpdExtSalesOrderDataSetTypeOrderHed getOrderHed() {
        return orderHed;
    }

    /**
     * Sets the value of the orderHed property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUpdExtSalesOrderDataSetTypeOrderHed }
     *     
     */
    public void setOrderHed(ArrayOfUpdExtSalesOrderDataSetTypeOrderHed value) {
        this.orderHed = value;
    }

    /**
     * Gets the value of the orderHedAttch property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUpdExtSalesOrderDataSetTypeOrderHedAttch }
     *     
     */
    public ArrayOfUpdExtSalesOrderDataSetTypeOrderHedAttch getOrderHedAttch() {
        return orderHedAttch;
    }

    /**
     * Sets the value of the orderHedAttch property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUpdExtSalesOrderDataSetTypeOrderHedAttch }
     *     
     */
    public void setOrderHedAttch(ArrayOfUpdExtSalesOrderDataSetTypeOrderHedAttch value) {
        this.orderHedAttch = value;
    }

    /**
     * Gets the value of the orderHedUPS property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUpdExtSalesOrderDataSetTypeOrderHedUPS }
     *     
     */
    public ArrayOfUpdExtSalesOrderDataSetTypeOrderHedUPS getOrderHedUPS() {
        return orderHedUPS;
    }

    /**
     * Sets the value of the orderHedUPS property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUpdExtSalesOrderDataSetTypeOrderHedUPS }
     *     
     */
    public void setOrderHedUPS(ArrayOfUpdExtSalesOrderDataSetTypeOrderHedUPS value) {
        this.orderHedUPS = value;
    }

    /**
     * Gets the value of the orderHist property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUpdExtSalesOrderDataSetTypeOrderHist }
     *     
     */
    public ArrayOfUpdExtSalesOrderDataSetTypeOrderHist getOrderHist() {
        return orderHist;
    }

    /**
     * Sets the value of the orderHist property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUpdExtSalesOrderDataSetTypeOrderHist }
     *     
     */
    public void setOrderHist(ArrayOfUpdExtSalesOrderDataSetTypeOrderHist value) {
        this.orderHist = value;
    }

    /**
     * Gets the value of the orderMsc property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUpdExtSalesOrderDataSetTypeOrderMsc }
     *     
     */
    public ArrayOfUpdExtSalesOrderDataSetTypeOrderMsc getOrderMsc() {
        return orderMsc;
    }

    /**
     * Sets the value of the orderMsc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUpdExtSalesOrderDataSetTypeOrderMsc }
     *     
     */
    public void setOrderMsc(ArrayOfUpdExtSalesOrderDataSetTypeOrderMsc value) {
        this.orderMsc = value;
    }

    /**
     * Gets the value of the orderRel property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUpdExtSalesOrderDataSetTypeOrderRel }
     *     
     */
    public ArrayOfUpdExtSalesOrderDataSetTypeOrderRel getOrderRel() {
        return orderRel;
    }

    /**
     * Sets the value of the orderRel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUpdExtSalesOrderDataSetTypeOrderRel }
     *     
     */
    public void setOrderRel(ArrayOfUpdExtSalesOrderDataSetTypeOrderRel value) {
        this.orderRel = value;
    }

    /**
     * Gets the value of the orderRelTax property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUpdExtSalesOrderDataSetTypeOrderRelTax }
     *     
     */
    public ArrayOfUpdExtSalesOrderDataSetTypeOrderRelTax getOrderRelTax() {
        return orderRelTax;
    }

    /**
     * Sets the value of the orderRelTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUpdExtSalesOrderDataSetTypeOrderRelTax }
     *     
     */
    public void setOrderRelTax(ArrayOfUpdExtSalesOrderDataSetTypeOrderRelTax value) {
        this.orderRelTax = value;
    }

    /**
     * Gets the value of the orderRepComm property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUpdExtSalesOrderDataSetTypeOrderRepComm }
     *     
     */
    public ArrayOfUpdExtSalesOrderDataSetTypeOrderRepComm getOrderRepComm() {
        return orderRepComm;
    }

    /**
     * Sets the value of the orderRepComm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUpdExtSalesOrderDataSetTypeOrderRepComm }
     *     
     */
    public void setOrderRepComm(ArrayOfUpdExtSalesOrderDataSetTypeOrderRepComm value) {
        this.orderRepComm = value;
    }

    /**
     * Gets the value of the partSubs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUpdExtSalesOrderDataSetTypePartSubs }
     *     
     */
    public ArrayOfUpdExtSalesOrderDataSetTypePartSubs getPartSubs() {
        return partSubs;
    }

    /**
     * Sets the value of the partSubs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUpdExtSalesOrderDataSetTypePartSubs }
     *     
     */
    public void setPartSubs(ArrayOfUpdExtSalesOrderDataSetTypePartSubs value) {
        this.partSubs = value;
    }

    /**
     * Gets the value of the snFormat property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUpdExtSalesOrderDataSetTypeSNFormat }
     *     
     */
    public ArrayOfUpdExtSalesOrderDataSetTypeSNFormat getSNFormat() {
        return snFormat;
    }

    /**
     * Sets the value of the snFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUpdExtSalesOrderDataSetTypeSNFormat }
     *     
     */
    public void setSNFormat(ArrayOfUpdExtSalesOrderDataSetTypeSNFormat value) {
        this.snFormat = value;
    }

    /**
     * Gets the value of the selectedSerialNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUpdExtSalesOrderDataSetTypeSelectedSerialNumbers }
     *     
     */
    public ArrayOfUpdExtSalesOrderDataSetTypeSelectedSerialNumbers getSelectedSerialNumbers() {
        return selectedSerialNumbers;
    }

    /**
     * Sets the value of the selectedSerialNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUpdExtSalesOrderDataSetTypeSelectedSerialNumbers }
     *     
     */
    public void setSelectedSerialNumbers(ArrayOfUpdExtSalesOrderDataSetTypeSelectedSerialNumbers value) {
        this.selectedSerialNumbers = value;
    }

    /**
     * Gets the value of the taxConnectStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUpdExtSalesOrderDataSetTypeTaxConnectStatus }
     *     
     */
    public ArrayOfUpdExtSalesOrderDataSetTypeTaxConnectStatus getTaxConnectStatus() {
        return taxConnectStatus;
    }

    /**
     * Sets the value of the taxConnectStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUpdExtSalesOrderDataSetTypeTaxConnectStatus }
     *     
     */
    public void setTaxConnectStatus(ArrayOfUpdExtSalesOrderDataSetTypeTaxConnectStatus value) {
        this.taxConnectStatus = value;
    }

}
