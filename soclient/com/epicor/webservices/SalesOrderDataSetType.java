
package com.epicor.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfSalesOrderDataSetTypeHedTaxSum;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfSalesOrderDataSetTypeOHOrderMsc;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfSalesOrderDataSetTypeOrderDtl;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfSalesOrderDataSetTypeOrderDtlAttch;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfSalesOrderDataSetTypeOrderHed;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfSalesOrderDataSetTypeOrderHedAttch;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfSalesOrderDataSetTypeOrderHedUPS;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfSalesOrderDataSetTypeOrderHist;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfSalesOrderDataSetTypeOrderMsc;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfSalesOrderDataSetTypeOrderRel;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfSalesOrderDataSetTypeOrderRelTax;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfSalesOrderDataSetTypeOrderRepComm;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfSalesOrderDataSetTypePartSubs;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfSalesOrderDataSetTypeSNFormat;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfSalesOrderDataSetTypeSelectedSerialNumbers;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfSalesOrderDataSetTypeTaxConnectStatus;


/**
 * <p>Java class for SalesOrderDataSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrderDataSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HedTaxSum" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfSalesOrderDataSetTypeHedTaxSum" minOccurs="0"/>
 *         &lt;element name="OHOrderMsc" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfSalesOrderDataSetTypeOHOrderMsc" minOccurs="0"/>
 *         &lt;element name="OrderDtl" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfSalesOrderDataSetTypeOrderDtl" minOccurs="0"/>
 *         &lt;element name="OrderDtlAttch" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfSalesOrderDataSetTypeOrderDtlAttch" minOccurs="0"/>
 *         &lt;element name="OrderHed" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfSalesOrderDataSetTypeOrderHed" minOccurs="0"/>
 *         &lt;element name="OrderHedAttch" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfSalesOrderDataSetTypeOrderHedAttch" minOccurs="0"/>
 *         &lt;element name="OrderHedUPS" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfSalesOrderDataSetTypeOrderHedUPS" minOccurs="0"/>
 *         &lt;element name="OrderHist" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfSalesOrderDataSetTypeOrderHist" minOccurs="0"/>
 *         &lt;element name="OrderMsc" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfSalesOrderDataSetTypeOrderMsc" minOccurs="0"/>
 *         &lt;element name="OrderRel" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfSalesOrderDataSetTypeOrderRel" minOccurs="0"/>
 *         &lt;element name="OrderRelTax" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfSalesOrderDataSetTypeOrderRelTax" minOccurs="0"/>
 *         &lt;element name="OrderRepComm" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfSalesOrderDataSetTypeOrderRepComm" minOccurs="0"/>
 *         &lt;element name="PartSubs" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfSalesOrderDataSetTypePartSubs" minOccurs="0"/>
 *         &lt;element name="SNFormat" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfSalesOrderDataSetTypeSNFormat" minOccurs="0"/>
 *         &lt;element name="SelectedSerialNumbers" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfSalesOrderDataSetTypeSelectedSerialNumbers" minOccurs="0"/>
 *         &lt;element name="TaxConnectStatus" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}ArrayOfSalesOrderDataSetTypeTaxConnectStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesOrderDataSetType", propOrder = {
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
public class SalesOrderDataSetType {

    @XmlElement(name = "HedTaxSum", nillable = true)
    protected ArrayOfSalesOrderDataSetTypeHedTaxSum hedTaxSum;
    @XmlElement(name = "OHOrderMsc", nillable = true)
    protected ArrayOfSalesOrderDataSetTypeOHOrderMsc ohOrderMsc;
    @XmlElement(name = "OrderDtl", nillable = true)
    protected ArrayOfSalesOrderDataSetTypeOrderDtl orderDtl;
    @XmlElement(name = "OrderDtlAttch", nillable = true)
    protected ArrayOfSalesOrderDataSetTypeOrderDtlAttch orderDtlAttch;
    @XmlElement(name = "OrderHed", nillable = true)
    protected ArrayOfSalesOrderDataSetTypeOrderHed orderHed;
    @XmlElement(name = "OrderHedAttch", nillable = true)
    protected ArrayOfSalesOrderDataSetTypeOrderHedAttch orderHedAttch;
    @XmlElement(name = "OrderHedUPS", nillable = true)
    protected ArrayOfSalesOrderDataSetTypeOrderHedUPS orderHedUPS;
    @XmlElement(name = "OrderHist", nillable = true)
    protected ArrayOfSalesOrderDataSetTypeOrderHist orderHist;
    @XmlElement(name = "OrderMsc", nillable = true)
    protected ArrayOfSalesOrderDataSetTypeOrderMsc orderMsc;
    @XmlElement(name = "OrderRel", nillable = true)
    protected ArrayOfSalesOrderDataSetTypeOrderRel orderRel;
    @XmlElement(name = "OrderRelTax", nillable = true)
    protected ArrayOfSalesOrderDataSetTypeOrderRelTax orderRelTax;
    @XmlElement(name = "OrderRepComm", nillable = true)
    protected ArrayOfSalesOrderDataSetTypeOrderRepComm orderRepComm;
    @XmlElement(name = "PartSubs", nillable = true)
    protected ArrayOfSalesOrderDataSetTypePartSubs partSubs;
    @XmlElement(name = "SNFormat", nillable = true)
    protected ArrayOfSalesOrderDataSetTypeSNFormat snFormat;
    @XmlElement(name = "SelectedSerialNumbers", nillable = true)
    protected ArrayOfSalesOrderDataSetTypeSelectedSerialNumbers selectedSerialNumbers;
    @XmlElement(name = "TaxConnectStatus", nillable = true)
    protected ArrayOfSalesOrderDataSetTypeTaxConnectStatus taxConnectStatus;

    /**
     * Gets the value of the hedTaxSum property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSalesOrderDataSetTypeHedTaxSum }
     *     
     */
    public ArrayOfSalesOrderDataSetTypeHedTaxSum getHedTaxSum() {
        return hedTaxSum;
    }

    /**
     * Sets the value of the hedTaxSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSalesOrderDataSetTypeHedTaxSum }
     *     
     */
    public void setHedTaxSum(ArrayOfSalesOrderDataSetTypeHedTaxSum value) {
        this.hedTaxSum = value;
    }

    /**
     * Gets the value of the ohOrderMsc property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSalesOrderDataSetTypeOHOrderMsc }
     *     
     */
    public ArrayOfSalesOrderDataSetTypeOHOrderMsc getOHOrderMsc() {
        return ohOrderMsc;
    }

    /**
     * Sets the value of the ohOrderMsc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSalesOrderDataSetTypeOHOrderMsc }
     *     
     */
    public void setOHOrderMsc(ArrayOfSalesOrderDataSetTypeOHOrderMsc value) {
        this.ohOrderMsc = value;
    }

    /**
     * Gets the value of the orderDtl property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSalesOrderDataSetTypeOrderDtl }
     *     
     */
    public ArrayOfSalesOrderDataSetTypeOrderDtl getOrderDtl() {
        return orderDtl;
    }

    /**
     * Sets the value of the orderDtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSalesOrderDataSetTypeOrderDtl }
     *     
     */
    public void setOrderDtl(ArrayOfSalesOrderDataSetTypeOrderDtl value) {
        this.orderDtl = value;
    }

    /**
     * Gets the value of the orderDtlAttch property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSalesOrderDataSetTypeOrderDtlAttch }
     *     
     */
    public ArrayOfSalesOrderDataSetTypeOrderDtlAttch getOrderDtlAttch() {
        return orderDtlAttch;
    }

    /**
     * Sets the value of the orderDtlAttch property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSalesOrderDataSetTypeOrderDtlAttch }
     *     
     */
    public void setOrderDtlAttch(ArrayOfSalesOrderDataSetTypeOrderDtlAttch value) {
        this.orderDtlAttch = value;
    }

    /**
     * Gets the value of the orderHed property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSalesOrderDataSetTypeOrderHed }
     *     
     */
    public ArrayOfSalesOrderDataSetTypeOrderHed getOrderHed() {
        return orderHed;
    }

    /**
     * Sets the value of the orderHed property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSalesOrderDataSetTypeOrderHed }
     *     
     */
    public void setOrderHed(ArrayOfSalesOrderDataSetTypeOrderHed value) {
        this.orderHed = value;
    }

    /**
     * Gets the value of the orderHedAttch property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSalesOrderDataSetTypeOrderHedAttch }
     *     
     */
    public ArrayOfSalesOrderDataSetTypeOrderHedAttch getOrderHedAttch() {
        return orderHedAttch;
    }

    /**
     * Sets the value of the orderHedAttch property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSalesOrderDataSetTypeOrderHedAttch }
     *     
     */
    public void setOrderHedAttch(ArrayOfSalesOrderDataSetTypeOrderHedAttch value) {
        this.orderHedAttch = value;
    }

    /**
     * Gets the value of the orderHedUPS property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSalesOrderDataSetTypeOrderHedUPS }
     *     
     */
    public ArrayOfSalesOrderDataSetTypeOrderHedUPS getOrderHedUPS() {
        return orderHedUPS;
    }

    /**
     * Sets the value of the orderHedUPS property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSalesOrderDataSetTypeOrderHedUPS }
     *     
     */
    public void setOrderHedUPS(ArrayOfSalesOrderDataSetTypeOrderHedUPS value) {
        this.orderHedUPS = value;
    }

    /**
     * Gets the value of the orderHist property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSalesOrderDataSetTypeOrderHist }
     *     
     */
    public ArrayOfSalesOrderDataSetTypeOrderHist getOrderHist() {
        return orderHist;
    }

    /**
     * Sets the value of the orderHist property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSalesOrderDataSetTypeOrderHist }
     *     
     */
    public void setOrderHist(ArrayOfSalesOrderDataSetTypeOrderHist value) {
        this.orderHist = value;
    }

    /**
     * Gets the value of the orderMsc property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSalesOrderDataSetTypeOrderMsc }
     *     
     */
    public ArrayOfSalesOrderDataSetTypeOrderMsc getOrderMsc() {
        return orderMsc;
    }

    /**
     * Sets the value of the orderMsc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSalesOrderDataSetTypeOrderMsc }
     *     
     */
    public void setOrderMsc(ArrayOfSalesOrderDataSetTypeOrderMsc value) {
        this.orderMsc = value;
    }

    /**
     * Gets the value of the orderRel property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSalesOrderDataSetTypeOrderRel }
     *     
     */
    public ArrayOfSalesOrderDataSetTypeOrderRel getOrderRel() {
        return orderRel;
    }

    /**
     * Sets the value of the orderRel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSalesOrderDataSetTypeOrderRel }
     *     
     */
    public void setOrderRel(ArrayOfSalesOrderDataSetTypeOrderRel value) {
        this.orderRel = value;
    }

    /**
     * Gets the value of the orderRelTax property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSalesOrderDataSetTypeOrderRelTax }
     *     
     */
    public ArrayOfSalesOrderDataSetTypeOrderRelTax getOrderRelTax() {
        return orderRelTax;
    }

    /**
     * Sets the value of the orderRelTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSalesOrderDataSetTypeOrderRelTax }
     *     
     */
    public void setOrderRelTax(ArrayOfSalesOrderDataSetTypeOrderRelTax value) {
        this.orderRelTax = value;
    }

    /**
     * Gets the value of the orderRepComm property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSalesOrderDataSetTypeOrderRepComm }
     *     
     */
    public ArrayOfSalesOrderDataSetTypeOrderRepComm getOrderRepComm() {
        return orderRepComm;
    }

    /**
     * Sets the value of the orderRepComm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSalesOrderDataSetTypeOrderRepComm }
     *     
     */
    public void setOrderRepComm(ArrayOfSalesOrderDataSetTypeOrderRepComm value) {
        this.orderRepComm = value;
    }

    /**
     * Gets the value of the partSubs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSalesOrderDataSetTypePartSubs }
     *     
     */
    public ArrayOfSalesOrderDataSetTypePartSubs getPartSubs() {
        return partSubs;
    }

    /**
     * Sets the value of the partSubs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSalesOrderDataSetTypePartSubs }
     *     
     */
    public void setPartSubs(ArrayOfSalesOrderDataSetTypePartSubs value) {
        this.partSubs = value;
    }

    /**
     * Gets the value of the snFormat property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSalesOrderDataSetTypeSNFormat }
     *     
     */
    public ArrayOfSalesOrderDataSetTypeSNFormat getSNFormat() {
        return snFormat;
    }

    /**
     * Sets the value of the snFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSalesOrderDataSetTypeSNFormat }
     *     
     */
    public void setSNFormat(ArrayOfSalesOrderDataSetTypeSNFormat value) {
        this.snFormat = value;
    }

    /**
     * Gets the value of the selectedSerialNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSalesOrderDataSetTypeSelectedSerialNumbers }
     *     
     */
    public ArrayOfSalesOrderDataSetTypeSelectedSerialNumbers getSelectedSerialNumbers() {
        return selectedSerialNumbers;
    }

    /**
     * Sets the value of the selectedSerialNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSalesOrderDataSetTypeSelectedSerialNumbers }
     *     
     */
    public void setSelectedSerialNumbers(ArrayOfSalesOrderDataSetTypeSelectedSerialNumbers value) {
        this.selectedSerialNumbers = value;
    }

    /**
     * Gets the value of the taxConnectStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSalesOrderDataSetTypeTaxConnectStatus }
     *     
     */
    public ArrayOfSalesOrderDataSetTypeTaxConnectStatus getTaxConnectStatus() {
        return taxConnectStatus;
    }

    /**
     * Sets the value of the taxConnectStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSalesOrderDataSetTypeTaxConnectStatus }
     *     
     */
    public void setTaxConnectStatus(ArrayOfSalesOrderDataSetTypeTaxConnectStatus value) {
        this.taxConnectStatus = value;
    }

}
