
package org.datacontract.schemas._2004._07.epicor_mfg;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OrdRelJobProdDataSetTypeJobProd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrdRelJobProdDataSetTypeJobProd">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AsmPartDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AsmPartNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BitFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CallLine" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CallLineLineDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CheckBox01" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CheckBox02" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CheckBox03" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CheckBox04" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CheckBox05" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DBRowIdent" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="Date01" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Date02" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Date03" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Date04" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Date05" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DemandContractNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DemandDtlSeq" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DemandHeadSeq" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DemandLinkSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DemandLinkStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DemandScheduleSeq" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JHPartDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JHPartNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JobNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JobNumPartDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MakeToJobQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MakeToStockQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MakeToType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxAllowedQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MtlPartDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MtlPartNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Number01" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Number02" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Number03" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Number04" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Number05" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OrdWIPQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OrderLine" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OrderLineLineDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OrderNumCardMemberName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderNumCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderRelNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OurStockQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PartIUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartPartDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartPricePerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartSalesUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartSellingFactor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PartTrackDimension" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PartTrackLots" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PartTrackSerialNum" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Plant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProdQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PullFromStockWarehouseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PullFromStockWarehouseDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReceivedQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RowIdent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RowMod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipBy" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ShippedQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ShortChar01" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortChar02" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortChar03" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortChar04" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortChar05" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SplitQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="StkWIPQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SysRevID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SysRowID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TFLineNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TFOrdLine" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TFOrdNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TargetAssemblySeq" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TargetJobNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TargetMtlSeq" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalSplitQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TrackSerialNumbers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Valid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WIPQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="WarehouseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WarehouseCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrdRelJobProdDataSetTypeJobProd", propOrder = {
    "asmPartDesc",
    "asmPartNum",
    "bitFlag",
    "callLine",
    "callLineLineDesc",
    "callNum",
    "checkBox01",
    "checkBox02",
    "checkBox03",
    "checkBox04",
    "checkBox05",
    "company",
    "custID",
    "custName",
    "dbRowIdent",
    "date01",
    "date02",
    "date03",
    "date04",
    "date05",
    "demandContractNum",
    "demandDtlSeq",
    "demandHeadSeq",
    "demandLinkSource",
    "demandLinkStatus",
    "demandScheduleSeq",
    "ium",
    "jhPartDesc",
    "jhPartNum",
    "jobNum",
    "jobNumPartDescription",
    "makeToJobQty",
    "makeToStockQty",
    "makeToType",
    "maxAllowedQty",
    "mtlPartDesc",
    "mtlPartNum",
    "number01",
    "number02",
    "number03",
    "number04",
    "number05",
    "ordWIPQty",
    "orderLine",
    "orderLineLineDesc",
    "orderNum",
    "orderNumCardMemberName",
    "orderNumCurrencyCode",
    "orderRelNum",
    "ourStockQty",
    "partIUM",
    "partNum",
    "partPartDescription",
    "partPricePerCode",
    "partSalesUM",
    "partSellingFactor",
    "partTrackDimension",
    "partTrackLots",
    "partTrackSerialNum",
    "plant",
    "prodQty",
    "pullFromStockWarehouseCode",
    "pullFromStockWarehouseDesc",
    "receivedQty",
    "rowIdent",
    "rowMod",
    "shipBy",
    "shippedQty",
    "shortChar01",
    "shortChar02",
    "shortChar03",
    "shortChar04",
    "shortChar05",
    "splitQty",
    "stkWIPQty",
    "sysRevID",
    "sysRowID",
    "tfLineNum",
    "tfOrdLine",
    "tfOrdNum",
    "targetAssemblySeq",
    "targetJobNum",
    "targetMtlSeq",
    "totalSplitQuantity",
    "trackSerialNumbers",
    "valid",
    "wipQty",
    "warehouseCode",
    "warehouseCodeDescription"
})
public class OrdRelJobProdDataSetTypeJobProd {

    @XmlElement(name = "AsmPartDesc", nillable = true)
    protected String asmPartDesc;
    @XmlElement(name = "AsmPartNum", nillable = true)
    protected String asmPartNum;
    @XmlElement(name = "BitFlag", nillable = true)
    protected Integer bitFlag;
    @XmlElement(name = "CallLine", nillable = true)
    protected Integer callLine;
    @XmlElement(name = "CallLineLineDesc", nillable = true)
    protected String callLineLineDesc;
    @XmlElement(name = "CallNum", nillable = true)
    protected Integer callNum;
    @XmlElement(name = "CheckBox01", nillable = true)
    protected Boolean checkBox01;
    @XmlElement(name = "CheckBox02", nillable = true)
    protected Boolean checkBox02;
    @XmlElement(name = "CheckBox03", nillable = true)
    protected Boolean checkBox03;
    @XmlElement(name = "CheckBox04", nillable = true)
    protected Boolean checkBox04;
    @XmlElement(name = "CheckBox05", nillable = true)
    protected Boolean checkBox05;
    @XmlElement(name = "Company", nillable = true)
    protected String company;
    @XmlElement(name = "CustID", nillable = true)
    protected String custID;
    @XmlElement(name = "CustName", nillable = true)
    protected String custName;
    @XmlElement(name = "DBRowIdent", nillable = true)
    protected byte[] dbRowIdent;
    @XmlElement(name = "Date01", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date01;
    @XmlElement(name = "Date02", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date02;
    @XmlElement(name = "Date03", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date03;
    @XmlElement(name = "Date04", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date04;
    @XmlElement(name = "Date05", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date05;
    @XmlElement(name = "DemandContractNum", nillable = true)
    protected Integer demandContractNum;
    @XmlElement(name = "DemandDtlSeq", nillable = true)
    protected Integer demandDtlSeq;
    @XmlElement(name = "DemandHeadSeq", nillable = true)
    protected Integer demandHeadSeq;
    @XmlElement(name = "DemandLinkSource", nillable = true)
    protected String demandLinkSource;
    @XmlElement(name = "DemandLinkStatus", nillable = true)
    protected String demandLinkStatus;
    @XmlElement(name = "DemandScheduleSeq", nillable = true)
    protected Integer demandScheduleSeq;
    @XmlElement(name = "IUM", nillable = true)
    protected String ium;
    @XmlElement(name = "JHPartDesc", nillable = true)
    protected String jhPartDesc;
    @XmlElement(name = "JHPartNum", nillable = true)
    protected String jhPartNum;
    @XmlElement(name = "JobNum", nillable = true)
    protected String jobNum;
    @XmlElement(name = "JobNumPartDescription", nillable = true)
    protected String jobNumPartDescription;
    @XmlElement(name = "MakeToJobQty", nillable = true)
    protected BigDecimal makeToJobQty;
    @XmlElement(name = "MakeToStockQty", nillable = true)
    protected BigDecimal makeToStockQty;
    @XmlElement(name = "MakeToType", nillable = true)
    protected String makeToType;
    @XmlElement(name = "MaxAllowedQty", nillable = true)
    protected BigDecimal maxAllowedQty;
    @XmlElement(name = "MtlPartDesc", nillable = true)
    protected String mtlPartDesc;
    @XmlElement(name = "MtlPartNum", nillable = true)
    protected String mtlPartNum;
    @XmlElement(name = "Number01", nillable = true)
    protected BigDecimal number01;
    @XmlElement(name = "Number02", nillable = true)
    protected BigDecimal number02;
    @XmlElement(name = "Number03", nillable = true)
    protected BigDecimal number03;
    @XmlElement(name = "Number04", nillable = true)
    protected BigDecimal number04;
    @XmlElement(name = "Number05", nillable = true)
    protected BigDecimal number05;
    @XmlElement(name = "OrdWIPQty", nillable = true)
    protected BigDecimal ordWIPQty;
    @XmlElement(name = "OrderLine", nillable = true)
    protected Integer orderLine;
    @XmlElement(name = "OrderLineLineDesc", nillable = true)
    protected String orderLineLineDesc;
    @XmlElement(name = "OrderNum", nillable = true)
    protected Integer orderNum;
    @XmlElement(name = "OrderNumCardMemberName", nillable = true)
    protected String orderNumCardMemberName;
    @XmlElement(name = "OrderNumCurrencyCode", nillable = true)
    protected String orderNumCurrencyCode;
    @XmlElement(name = "OrderRelNum", nillable = true)
    protected Integer orderRelNum;
    @XmlElement(name = "OurStockQty", nillable = true)
    protected BigDecimal ourStockQty;
    @XmlElement(name = "PartIUM", nillable = true)
    protected String partIUM;
    @XmlElement(name = "PartNum", nillable = true)
    protected String partNum;
    @XmlElement(name = "PartPartDescription", nillable = true)
    protected String partPartDescription;
    @XmlElement(name = "PartPricePerCode", nillable = true)
    protected String partPricePerCode;
    @XmlElement(name = "PartSalesUM", nillable = true)
    protected String partSalesUM;
    @XmlElement(name = "PartSellingFactor", nillable = true)
    protected BigDecimal partSellingFactor;
    @XmlElement(name = "PartTrackDimension", nillable = true)
    protected Boolean partTrackDimension;
    @XmlElement(name = "PartTrackLots", nillable = true)
    protected Boolean partTrackLots;
    @XmlElement(name = "PartTrackSerialNum", nillable = true)
    protected Boolean partTrackSerialNum;
    @XmlElement(name = "Plant", nillable = true)
    protected String plant;
    @XmlElement(name = "ProdQty", nillable = true)
    protected BigDecimal prodQty;
    @XmlElement(name = "PullFromStockWarehouseCode", nillable = true)
    protected String pullFromStockWarehouseCode;
    @XmlElement(name = "PullFromStockWarehouseDesc", nillable = true)
    protected String pullFromStockWarehouseDesc;
    @XmlElement(name = "ReceivedQty", nillable = true)
    protected BigDecimal receivedQty;
    @XmlElement(name = "RowIdent", nillable = true)
    protected String rowIdent;
    @XmlElement(name = "RowMod", nillable = true)
    protected String rowMod;
    @XmlElement(name = "ShipBy", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar shipBy;
    @XmlElement(name = "ShippedQty", nillable = true)
    protected BigDecimal shippedQty;
    @XmlElement(name = "ShortChar01", nillable = true)
    protected String shortChar01;
    @XmlElement(name = "ShortChar02", nillable = true)
    protected String shortChar02;
    @XmlElement(name = "ShortChar03", nillable = true)
    protected String shortChar03;
    @XmlElement(name = "ShortChar04", nillable = true)
    protected String shortChar04;
    @XmlElement(name = "ShortChar05", nillable = true)
    protected String shortChar05;
    @XmlElement(name = "SplitQty", nillable = true)
    protected BigDecimal splitQty;
    @XmlElement(name = "StkWIPQty", nillable = true)
    protected BigDecimal stkWIPQty;
    @XmlElement(name = "SysRevID", nillable = true)
    protected Integer sysRevID;
    @XmlElement(name = "SysRowID", nillable = true)
    protected String sysRowID;
    @XmlElement(name = "TFLineNum", nillable = true)
    protected String tfLineNum;
    @XmlElement(name = "TFOrdLine", nillable = true)
    protected Integer tfOrdLine;
    @XmlElement(name = "TFOrdNum", nillable = true)
    protected String tfOrdNum;
    @XmlElement(name = "TargetAssemblySeq", nillable = true)
    protected Integer targetAssemblySeq;
    @XmlElement(name = "TargetJobNum", nillable = true)
    protected String targetJobNum;
    @XmlElement(name = "TargetMtlSeq", nillable = true)
    protected Integer targetMtlSeq;
    @XmlElement(name = "TotalSplitQuantity", nillable = true)
    protected BigDecimal totalSplitQuantity;
    @XmlElement(name = "TrackSerialNumbers", nillable = true)
    protected Boolean trackSerialNumbers;
    @XmlElement(name = "Valid", nillable = true)
    protected Boolean valid;
    @XmlElement(name = "WIPQty", nillable = true)
    protected BigDecimal wipQty;
    @XmlElement(name = "WarehouseCode", nillable = true)
    protected String warehouseCode;
    @XmlElement(name = "WarehouseCodeDescription", nillable = true)
    protected String warehouseCodeDescription;

    /**
     * Gets the value of the asmPartDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsmPartDesc() {
        return asmPartDesc;
    }

    /**
     * Sets the value of the asmPartDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsmPartDesc(String value) {
        this.asmPartDesc = value;
    }

    /**
     * Gets the value of the asmPartNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsmPartNum() {
        return asmPartNum;
    }

    /**
     * Sets the value of the asmPartNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsmPartNum(String value) {
        this.asmPartNum = value;
    }

    /**
     * Gets the value of the bitFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBitFlag() {
        return bitFlag;
    }

    /**
     * Sets the value of the bitFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBitFlag(Integer value) {
        this.bitFlag = value;
    }

    /**
     * Gets the value of the callLine property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCallLine() {
        return callLine;
    }

    /**
     * Sets the value of the callLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCallLine(Integer value) {
        this.callLine = value;
    }

    /**
     * Gets the value of the callLineLineDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallLineLineDesc() {
        return callLineLineDesc;
    }

    /**
     * Sets the value of the callLineLineDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallLineLineDesc(String value) {
        this.callLineLineDesc = value;
    }

    /**
     * Gets the value of the callNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCallNum() {
        return callNum;
    }

    /**
     * Sets the value of the callNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCallNum(Integer value) {
        this.callNum = value;
    }

    /**
     * Gets the value of the checkBox01 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckBox01() {
        return checkBox01;
    }

    /**
     * Sets the value of the checkBox01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckBox01(Boolean value) {
        this.checkBox01 = value;
    }

    /**
     * Gets the value of the checkBox02 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckBox02() {
        return checkBox02;
    }

    /**
     * Sets the value of the checkBox02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckBox02(Boolean value) {
        this.checkBox02 = value;
    }

    /**
     * Gets the value of the checkBox03 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckBox03() {
        return checkBox03;
    }

    /**
     * Sets the value of the checkBox03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckBox03(Boolean value) {
        this.checkBox03 = value;
    }

    /**
     * Gets the value of the checkBox04 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckBox04() {
        return checkBox04;
    }

    /**
     * Sets the value of the checkBox04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckBox04(Boolean value) {
        this.checkBox04 = value;
    }

    /**
     * Gets the value of the checkBox05 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckBox05() {
        return checkBox05;
    }

    /**
     * Sets the value of the checkBox05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckBox05(Boolean value) {
        this.checkBox05 = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the value of the custID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustID() {
        return custID;
    }

    /**
     * Sets the value of the custID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustID(String value) {
        this.custID = value;
    }

    /**
     * Gets the value of the custName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustName() {
        return custName;
    }

    /**
     * Sets the value of the custName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustName(String value) {
        this.custName = value;
    }

    /**
     * Gets the value of the dbRowIdent property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDBRowIdent() {
        return dbRowIdent;
    }

    /**
     * Sets the value of the dbRowIdent property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDBRowIdent(byte[] value) {
        this.dbRowIdent = value;
    }

    /**
     * Gets the value of the date01 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate01() {
        return date01;
    }

    /**
     * Sets the value of the date01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate01(XMLGregorianCalendar value) {
        this.date01 = value;
    }

    /**
     * Gets the value of the date02 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate02() {
        return date02;
    }

    /**
     * Sets the value of the date02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate02(XMLGregorianCalendar value) {
        this.date02 = value;
    }

    /**
     * Gets the value of the date03 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate03() {
        return date03;
    }

    /**
     * Sets the value of the date03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate03(XMLGregorianCalendar value) {
        this.date03 = value;
    }

    /**
     * Gets the value of the date04 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate04() {
        return date04;
    }

    /**
     * Sets the value of the date04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate04(XMLGregorianCalendar value) {
        this.date04 = value;
    }

    /**
     * Gets the value of the date05 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate05() {
        return date05;
    }

    /**
     * Sets the value of the date05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate05(XMLGregorianCalendar value) {
        this.date05 = value;
    }

    /**
     * Gets the value of the demandContractNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDemandContractNum() {
        return demandContractNum;
    }

    /**
     * Sets the value of the demandContractNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDemandContractNum(Integer value) {
        this.demandContractNum = value;
    }

    /**
     * Gets the value of the demandDtlSeq property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDemandDtlSeq() {
        return demandDtlSeq;
    }

    /**
     * Sets the value of the demandDtlSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDemandDtlSeq(Integer value) {
        this.demandDtlSeq = value;
    }

    /**
     * Gets the value of the demandHeadSeq property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDemandHeadSeq() {
        return demandHeadSeq;
    }

    /**
     * Sets the value of the demandHeadSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDemandHeadSeq(Integer value) {
        this.demandHeadSeq = value;
    }

    /**
     * Gets the value of the demandLinkSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDemandLinkSource() {
        return demandLinkSource;
    }

    /**
     * Sets the value of the demandLinkSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDemandLinkSource(String value) {
        this.demandLinkSource = value;
    }

    /**
     * Gets the value of the demandLinkStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDemandLinkStatus() {
        return demandLinkStatus;
    }

    /**
     * Sets the value of the demandLinkStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDemandLinkStatus(String value) {
        this.demandLinkStatus = value;
    }

    /**
     * Gets the value of the demandScheduleSeq property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDemandScheduleSeq() {
        return demandScheduleSeq;
    }

    /**
     * Sets the value of the demandScheduleSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDemandScheduleSeq(Integer value) {
        this.demandScheduleSeq = value;
    }

    /**
     * Gets the value of the ium property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIUM() {
        return ium;
    }

    /**
     * Sets the value of the ium property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIUM(String value) {
        this.ium = value;
    }

    /**
     * Gets the value of the jhPartDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJHPartDesc() {
        return jhPartDesc;
    }

    /**
     * Sets the value of the jhPartDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJHPartDesc(String value) {
        this.jhPartDesc = value;
    }

    /**
     * Gets the value of the jhPartNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJHPartNum() {
        return jhPartNum;
    }

    /**
     * Sets the value of the jhPartNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJHPartNum(String value) {
        this.jhPartNum = value;
    }

    /**
     * Gets the value of the jobNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobNum() {
        return jobNum;
    }

    /**
     * Sets the value of the jobNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobNum(String value) {
        this.jobNum = value;
    }

    /**
     * Gets the value of the jobNumPartDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobNumPartDescription() {
        return jobNumPartDescription;
    }

    /**
     * Sets the value of the jobNumPartDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobNumPartDescription(String value) {
        this.jobNumPartDescription = value;
    }

    /**
     * Gets the value of the makeToJobQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMakeToJobQty() {
        return makeToJobQty;
    }

    /**
     * Sets the value of the makeToJobQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMakeToJobQty(BigDecimal value) {
        this.makeToJobQty = value;
    }

    /**
     * Gets the value of the makeToStockQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMakeToStockQty() {
        return makeToStockQty;
    }

    /**
     * Sets the value of the makeToStockQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMakeToStockQty(BigDecimal value) {
        this.makeToStockQty = value;
    }

    /**
     * Gets the value of the makeToType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMakeToType() {
        return makeToType;
    }

    /**
     * Sets the value of the makeToType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMakeToType(String value) {
        this.makeToType = value;
    }

    /**
     * Gets the value of the maxAllowedQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxAllowedQty() {
        return maxAllowedQty;
    }

    /**
     * Sets the value of the maxAllowedQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxAllowedQty(BigDecimal value) {
        this.maxAllowedQty = value;
    }

    /**
     * Gets the value of the mtlPartDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtlPartDesc() {
        return mtlPartDesc;
    }

    /**
     * Sets the value of the mtlPartDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtlPartDesc(String value) {
        this.mtlPartDesc = value;
    }

    /**
     * Gets the value of the mtlPartNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtlPartNum() {
        return mtlPartNum;
    }

    /**
     * Sets the value of the mtlPartNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtlPartNum(String value) {
        this.mtlPartNum = value;
    }

    /**
     * Gets the value of the number01 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumber01() {
        return number01;
    }

    /**
     * Sets the value of the number01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumber01(BigDecimal value) {
        this.number01 = value;
    }

    /**
     * Gets the value of the number02 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumber02() {
        return number02;
    }

    /**
     * Sets the value of the number02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumber02(BigDecimal value) {
        this.number02 = value;
    }

    /**
     * Gets the value of the number03 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumber03() {
        return number03;
    }

    /**
     * Sets the value of the number03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumber03(BigDecimal value) {
        this.number03 = value;
    }

    /**
     * Gets the value of the number04 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumber04() {
        return number04;
    }

    /**
     * Sets the value of the number04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumber04(BigDecimal value) {
        this.number04 = value;
    }

    /**
     * Gets the value of the number05 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumber05() {
        return number05;
    }

    /**
     * Sets the value of the number05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumber05(BigDecimal value) {
        this.number05 = value;
    }

    /**
     * Gets the value of the ordWIPQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrdWIPQty() {
        return ordWIPQty;
    }

    /**
     * Sets the value of the ordWIPQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrdWIPQty(BigDecimal value) {
        this.ordWIPQty = value;
    }

    /**
     * Gets the value of the orderLine property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrderLine() {
        return orderLine;
    }

    /**
     * Sets the value of the orderLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrderLine(Integer value) {
        this.orderLine = value;
    }

    /**
     * Gets the value of the orderLineLineDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderLineLineDesc() {
        return orderLineLineDesc;
    }

    /**
     * Sets the value of the orderLineLineDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderLineLineDesc(String value) {
        this.orderLineLineDesc = value;
    }

    /**
     * Gets the value of the orderNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrderNum() {
        return orderNum;
    }

    /**
     * Sets the value of the orderNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrderNum(Integer value) {
        this.orderNum = value;
    }

    /**
     * Gets the value of the orderNumCardMemberName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNumCardMemberName() {
        return orderNumCardMemberName;
    }

    /**
     * Sets the value of the orderNumCardMemberName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNumCardMemberName(String value) {
        this.orderNumCardMemberName = value;
    }

    /**
     * Gets the value of the orderNumCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNumCurrencyCode() {
        return orderNumCurrencyCode;
    }

    /**
     * Sets the value of the orderNumCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNumCurrencyCode(String value) {
        this.orderNumCurrencyCode = value;
    }

    /**
     * Gets the value of the orderRelNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrderRelNum() {
        return orderRelNum;
    }

    /**
     * Sets the value of the orderRelNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrderRelNum(Integer value) {
        this.orderRelNum = value;
    }

    /**
     * Gets the value of the ourStockQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOurStockQty() {
        return ourStockQty;
    }

    /**
     * Sets the value of the ourStockQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOurStockQty(BigDecimal value) {
        this.ourStockQty = value;
    }

    /**
     * Gets the value of the partIUM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartIUM() {
        return partIUM;
    }

    /**
     * Sets the value of the partIUM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartIUM(String value) {
        this.partIUM = value;
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
     * Gets the value of the partPartDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartPartDescription() {
        return partPartDescription;
    }

    /**
     * Sets the value of the partPartDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartPartDescription(String value) {
        this.partPartDescription = value;
    }

    /**
     * Gets the value of the partPricePerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartPricePerCode() {
        return partPricePerCode;
    }

    /**
     * Sets the value of the partPricePerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartPricePerCode(String value) {
        this.partPricePerCode = value;
    }

    /**
     * Gets the value of the partSalesUM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartSalesUM() {
        return partSalesUM;
    }

    /**
     * Sets the value of the partSalesUM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartSalesUM(String value) {
        this.partSalesUM = value;
    }

    /**
     * Gets the value of the partSellingFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPartSellingFactor() {
        return partSellingFactor;
    }

    /**
     * Sets the value of the partSellingFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPartSellingFactor(BigDecimal value) {
        this.partSellingFactor = value;
    }

    /**
     * Gets the value of the partTrackDimension property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartTrackDimension() {
        return partTrackDimension;
    }

    /**
     * Sets the value of the partTrackDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartTrackDimension(Boolean value) {
        this.partTrackDimension = value;
    }

    /**
     * Gets the value of the partTrackLots property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartTrackLots() {
        return partTrackLots;
    }

    /**
     * Sets the value of the partTrackLots property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartTrackLots(Boolean value) {
        this.partTrackLots = value;
    }

    /**
     * Gets the value of the partTrackSerialNum property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartTrackSerialNum() {
        return partTrackSerialNum;
    }

    /**
     * Sets the value of the partTrackSerialNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartTrackSerialNum(Boolean value) {
        this.partTrackSerialNum = value;
    }

    /**
     * Gets the value of the plant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlant() {
        return plant;
    }

    /**
     * Sets the value of the plant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlant(String value) {
        this.plant = value;
    }

    /**
     * Gets the value of the prodQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProdQty() {
        return prodQty;
    }

    /**
     * Sets the value of the prodQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProdQty(BigDecimal value) {
        this.prodQty = value;
    }

    /**
     * Gets the value of the pullFromStockWarehouseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPullFromStockWarehouseCode() {
        return pullFromStockWarehouseCode;
    }

    /**
     * Sets the value of the pullFromStockWarehouseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPullFromStockWarehouseCode(String value) {
        this.pullFromStockWarehouseCode = value;
    }

    /**
     * Gets the value of the pullFromStockWarehouseDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPullFromStockWarehouseDesc() {
        return pullFromStockWarehouseDesc;
    }

    /**
     * Sets the value of the pullFromStockWarehouseDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPullFromStockWarehouseDesc(String value) {
        this.pullFromStockWarehouseDesc = value;
    }

    /**
     * Gets the value of the receivedQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReceivedQty() {
        return receivedQty;
    }

    /**
     * Sets the value of the receivedQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReceivedQty(BigDecimal value) {
        this.receivedQty = value;
    }

    /**
     * Gets the value of the rowIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowIdent() {
        return rowIdent;
    }

    /**
     * Sets the value of the rowIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowIdent(String value) {
        this.rowIdent = value;
    }

    /**
     * Gets the value of the rowMod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowMod() {
        return rowMod;
    }

    /**
     * Sets the value of the rowMod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowMod(String value) {
        this.rowMod = value;
    }

    /**
     * Gets the value of the shipBy property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShipBy() {
        return shipBy;
    }

    /**
     * Sets the value of the shipBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShipBy(XMLGregorianCalendar value) {
        this.shipBy = value;
    }

    /**
     * Gets the value of the shippedQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getShippedQty() {
        return shippedQty;
    }

    /**
     * Sets the value of the shippedQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setShippedQty(BigDecimal value) {
        this.shippedQty = value;
    }

    /**
     * Gets the value of the shortChar01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortChar01() {
        return shortChar01;
    }

    /**
     * Sets the value of the shortChar01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortChar01(String value) {
        this.shortChar01 = value;
    }

    /**
     * Gets the value of the shortChar02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortChar02() {
        return shortChar02;
    }

    /**
     * Sets the value of the shortChar02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortChar02(String value) {
        this.shortChar02 = value;
    }

    /**
     * Gets the value of the shortChar03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortChar03() {
        return shortChar03;
    }

    /**
     * Sets the value of the shortChar03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortChar03(String value) {
        this.shortChar03 = value;
    }

    /**
     * Gets the value of the shortChar04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortChar04() {
        return shortChar04;
    }

    /**
     * Sets the value of the shortChar04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortChar04(String value) {
        this.shortChar04 = value;
    }

    /**
     * Gets the value of the shortChar05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortChar05() {
        return shortChar05;
    }

    /**
     * Sets the value of the shortChar05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortChar05(String value) {
        this.shortChar05 = value;
    }

    /**
     * Gets the value of the splitQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSplitQty() {
        return splitQty;
    }

    /**
     * Sets the value of the splitQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSplitQty(BigDecimal value) {
        this.splitQty = value;
    }

    /**
     * Gets the value of the stkWIPQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStkWIPQty() {
        return stkWIPQty;
    }

    /**
     * Sets the value of the stkWIPQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStkWIPQty(BigDecimal value) {
        this.stkWIPQty = value;
    }

    /**
     * Gets the value of the sysRevID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSysRevID() {
        return sysRevID;
    }

    /**
     * Sets the value of the sysRevID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSysRevID(Integer value) {
        this.sysRevID = value;
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
     * Gets the value of the tfLineNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTFLineNum() {
        return tfLineNum;
    }

    /**
     * Sets the value of the tfLineNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTFLineNum(String value) {
        this.tfLineNum = value;
    }

    /**
     * Gets the value of the tfOrdLine property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTFOrdLine() {
        return tfOrdLine;
    }

    /**
     * Sets the value of the tfOrdLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTFOrdLine(Integer value) {
        this.tfOrdLine = value;
    }

    /**
     * Gets the value of the tfOrdNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTFOrdNum() {
        return tfOrdNum;
    }

    /**
     * Sets the value of the tfOrdNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTFOrdNum(String value) {
        this.tfOrdNum = value;
    }

    /**
     * Gets the value of the targetAssemblySeq property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTargetAssemblySeq() {
        return targetAssemblySeq;
    }

    /**
     * Sets the value of the targetAssemblySeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTargetAssemblySeq(Integer value) {
        this.targetAssemblySeq = value;
    }

    /**
     * Gets the value of the targetJobNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetJobNum() {
        return targetJobNum;
    }

    /**
     * Sets the value of the targetJobNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetJobNum(String value) {
        this.targetJobNum = value;
    }

    /**
     * Gets the value of the targetMtlSeq property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTargetMtlSeq() {
        return targetMtlSeq;
    }

    /**
     * Sets the value of the targetMtlSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTargetMtlSeq(Integer value) {
        this.targetMtlSeq = value;
    }

    /**
     * Gets the value of the totalSplitQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalSplitQuantity() {
        return totalSplitQuantity;
    }

    /**
     * Sets the value of the totalSplitQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalSplitQuantity(BigDecimal value) {
        this.totalSplitQuantity = value;
    }

    /**
     * Gets the value of the trackSerialNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrackSerialNumbers() {
        return trackSerialNumbers;
    }

    /**
     * Sets the value of the trackSerialNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrackSerialNumbers(Boolean value) {
        this.trackSerialNumbers = value;
    }

    /**
     * Gets the value of the valid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValid() {
        return valid;
    }

    /**
     * Sets the value of the valid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValid(Boolean value) {
        this.valid = value;
    }

    /**
     * Gets the value of the wipQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWIPQty() {
        return wipQty;
    }

    /**
     * Sets the value of the wipQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWIPQty(BigDecimal value) {
        this.wipQty = value;
    }

    /**
     * Gets the value of the warehouseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarehouseCode() {
        return warehouseCode;
    }

    /**
     * Sets the value of the warehouseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarehouseCode(String value) {
        this.warehouseCode = value;
    }

    /**
     * Gets the value of the warehouseCodeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarehouseCodeDescription() {
        return warehouseCodeDescription;
    }

    /**
     * Sets the value of the warehouseCodeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarehouseCodeDescription(String value) {
        this.warehouseCodeDescription = value;
    }

}
