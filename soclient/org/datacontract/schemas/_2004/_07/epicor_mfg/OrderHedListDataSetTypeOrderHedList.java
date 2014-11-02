
package org.datacontract.schemas._2004._07.epicor_mfg;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OrderHedListDataSetTypeOrderHedList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderHedListDataSetTypeOrderHedList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BTCustNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BTCustNumCustID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BTCustNumName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CustOnCreditHold" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CustomerBTName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerCustID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DBRowIdent" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="DemandContract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepositBal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DocDepositBal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NeedByDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="OpenOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="OrderHeld" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrderNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PONum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RowIdent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RowMod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SysRowID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VoidOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderHedListDataSetTypeOrderHedList", propOrder = {
    "btCustNum",
    "btCustNumCustID",
    "btCustNumName",
    "company",
    "currencyCode",
    "custNum",
    "custOnCreditHold",
    "customerBTName",
    "customerCustID",
    "customerName",
    "dbRowIdent",
    "demandContract",
    "depositBal",
    "docDepositBal",
    "needByDate",
    "openOrder",
    "orderDate",
    "orderHeld",
    "orderNum",
    "poNum",
    "rowIdent",
    "rowMod",
    "sysRowID",
    "voidOrder"
})
public class OrderHedListDataSetTypeOrderHedList {

    @XmlElement(name = "BTCustNum", nillable = true)
    protected Integer btCustNum;
    @XmlElement(name = "BTCustNumCustID", nillable = true)
    protected String btCustNumCustID;
    @XmlElement(name = "BTCustNumName", nillable = true)
    protected String btCustNumName;
    @XmlElement(name = "Company", nillable = true)
    protected String company;
    @XmlElement(name = "CurrencyCode", nillable = true)
    protected String currencyCode;
    @XmlElement(name = "CustNum", nillable = true)
    protected Integer custNum;
    @XmlElement(name = "CustOnCreditHold", nillable = true)
    protected Boolean custOnCreditHold;
    @XmlElement(name = "CustomerBTName", nillable = true)
    protected String customerBTName;
    @XmlElement(name = "CustomerCustID", nillable = true)
    protected String customerCustID;
    @XmlElement(name = "CustomerName", nillable = true)
    protected String customerName;
    @XmlElement(name = "DBRowIdent", nillable = true)
    protected byte[] dbRowIdent;
    @XmlElement(name = "DemandContract", nillable = true)
    protected String demandContract;
    @XmlElement(name = "DepositBal", nillable = true)
    protected BigDecimal depositBal;
    @XmlElement(name = "DocDepositBal", nillable = true)
    protected BigDecimal docDepositBal;
    @XmlElement(name = "NeedByDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar needByDate;
    @XmlElement(name = "OpenOrder", nillable = true)
    protected Boolean openOrder;
    @XmlElement(name = "OrderDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderDate;
    @XmlElement(name = "OrderHeld", nillable = true)
    protected Boolean orderHeld;
    @XmlElement(name = "OrderNum", nillable = true)
    protected Integer orderNum;
    @XmlElement(name = "PONum", nillable = true)
    protected String poNum;
    @XmlElement(name = "RowIdent", nillable = true)
    protected String rowIdent;
    @XmlElement(name = "RowMod", nillable = true)
    protected String rowMod;
    @XmlElement(name = "SysRowID", nillable = true)
    protected String sysRowID;
    @XmlElement(name = "VoidOrder", nillable = true)
    protected Boolean voidOrder;

    /**
     * Gets the value of the btCustNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBTCustNum() {
        return btCustNum;
    }

    /**
     * Sets the value of the btCustNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBTCustNum(Integer value) {
        this.btCustNum = value;
    }

    /**
     * Gets the value of the btCustNumCustID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBTCustNumCustID() {
        return btCustNumCustID;
    }

    /**
     * Sets the value of the btCustNumCustID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBTCustNumCustID(String value) {
        this.btCustNumCustID = value;
    }

    /**
     * Gets the value of the btCustNumName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBTCustNumName() {
        return btCustNumName;
    }

    /**
     * Sets the value of the btCustNumName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBTCustNumName(String value) {
        this.btCustNumName = value;
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
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the custNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustNum() {
        return custNum;
    }

    /**
     * Sets the value of the custNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustNum(Integer value) {
        this.custNum = value;
    }

    /**
     * Gets the value of the custOnCreditHold property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustOnCreditHold() {
        return custOnCreditHold;
    }

    /**
     * Sets the value of the custOnCreditHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustOnCreditHold(Boolean value) {
        this.custOnCreditHold = value;
    }

    /**
     * Gets the value of the customerBTName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerBTName() {
        return customerBTName;
    }

    /**
     * Sets the value of the customerBTName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerBTName(String value) {
        this.customerBTName = value;
    }

    /**
     * Gets the value of the customerCustID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCustID() {
        return customerCustID;
    }

    /**
     * Sets the value of the customerCustID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCustID(String value) {
        this.customerCustID = value;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
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
     * Gets the value of the demandContract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDemandContract() {
        return demandContract;
    }

    /**
     * Sets the value of the demandContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDemandContract(String value) {
        this.demandContract = value;
    }

    /**
     * Gets the value of the depositBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDepositBal() {
        return depositBal;
    }

    /**
     * Sets the value of the depositBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDepositBal(BigDecimal value) {
        this.depositBal = value;
    }

    /**
     * Gets the value of the docDepositBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocDepositBal() {
        return docDepositBal;
    }

    /**
     * Sets the value of the docDepositBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocDepositBal(BigDecimal value) {
        this.docDepositBal = value;
    }

    /**
     * Gets the value of the needByDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNeedByDate() {
        return needByDate;
    }

    /**
     * Sets the value of the needByDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNeedByDate(XMLGregorianCalendar value) {
        this.needByDate = value;
    }

    /**
     * Gets the value of the openOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpenOrder() {
        return openOrder;
    }

    /**
     * Sets the value of the openOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpenOrder(Boolean value) {
        this.openOrder = value;
    }

    /**
     * Gets the value of the orderDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the value of the orderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderDate(XMLGregorianCalendar value) {
        this.orderDate = value;
    }

    /**
     * Gets the value of the orderHeld property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderHeld() {
        return orderHeld;
    }

    /**
     * Sets the value of the orderHeld property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderHeld(Boolean value) {
        this.orderHeld = value;
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
     * Gets the value of the poNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPONum() {
        return poNum;
    }

    /**
     * Sets the value of the poNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPONum(String value) {
        this.poNum = value;
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
     * Gets the value of the voidOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVoidOrder() {
        return voidOrder;
    }

    /**
     * Sets the value of the voidOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVoidOrder(Boolean value) {
        this.voidOrder = value;
    }

}
