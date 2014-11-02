
package org.datacontract.schemas._2004._07.epicor_mfg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ETCAddrValidationDataSetTypeETCAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ETCAddrValidationDataSetTypeETCAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddrSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddrSourceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressTypeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CarrierRoute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CarrierRouteDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="County" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DBRowIdent" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="FipsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvoiceLine" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InvoiceNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Line1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Line2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Line3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OTSCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostNet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResultCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResultSeq" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RowIdent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RowMod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdateAddr" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UpdateAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ValidCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidLine3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidLine4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ETCAddrValidationDataSetTypeETCAddress", propOrder = {
    "addrSource",
    "addrSourceID",
    "addressCode",
    "addressType",
    "addressTypeDesc",
    "carrierRoute",
    "carrierRouteDesc",
    "city",
    "company",
    "country",
    "countryNum",
    "county",
    "dbRowIdent",
    "fipsCode",
    "invoiceLine",
    "invoiceNum",
    "line1",
    "line2",
    "line3",
    "otsCountry",
    "postNet",
    "postalCode",
    "region",
    "requestID",
    "resultCode",
    "resultSeq",
    "rowIdent",
    "rowMod",
    "transactionID",
    "updateAddr",
    "updateAllowed",
    "validCity",
    "validCountry",
    "validLine1",
    "validLine2",
    "validLine3",
    "validLine4",
    "validPostalCode",
    "validRegion"
})
public class ETCAddrValidationDataSetTypeETCAddress {

    @XmlElement(name = "AddrSource", nillable = true)
    protected String addrSource;
    @XmlElement(name = "AddrSourceID", nillable = true)
    protected String addrSourceID;
    @XmlElement(name = "AddressCode", nillable = true)
    protected String addressCode;
    @XmlElement(name = "AddressType", nillable = true)
    protected String addressType;
    @XmlElement(name = "AddressTypeDesc", nillable = true)
    protected String addressTypeDesc;
    @XmlElement(name = "CarrierRoute", nillable = true)
    protected String carrierRoute;
    @XmlElement(name = "CarrierRouteDesc", nillable = true)
    protected String carrierRouteDesc;
    @XmlElement(name = "City", nillable = true)
    protected String city;
    @XmlElement(name = "Company", nillable = true)
    protected String company;
    @XmlElement(name = "Country", nillable = true)
    protected String country;
    @XmlElement(name = "CountryNum", nillable = true)
    protected Integer countryNum;
    @XmlElement(name = "County", nillable = true)
    protected String county;
    @XmlElement(name = "DBRowIdent", nillable = true)
    protected byte[] dbRowIdent;
    @XmlElement(name = "FipsCode", nillable = true)
    protected String fipsCode;
    @XmlElement(name = "InvoiceLine", nillable = true)
    protected Integer invoiceLine;
    @XmlElement(name = "InvoiceNum", nillable = true)
    protected Integer invoiceNum;
    @XmlElement(name = "Line1", nillable = true)
    protected String line1;
    @XmlElement(name = "Line2", nillable = true)
    protected String line2;
    @XmlElement(name = "Line3", nillable = true)
    protected String line3;
    @XmlElement(name = "OTSCountry", nillable = true)
    protected String otsCountry;
    @XmlElement(name = "PostNet", nillable = true)
    protected String postNet;
    @XmlElement(name = "PostalCode", nillable = true)
    protected String postalCode;
    @XmlElement(name = "Region", nillable = true)
    protected String region;
    @XmlElement(name = "RequestID", nillable = true)
    protected String requestID;
    @XmlElement(name = "ResultCode", nillable = true)
    protected String resultCode;
    @XmlElement(name = "ResultSeq", nillable = true)
    protected Integer resultSeq;
    @XmlElement(name = "RowIdent", nillable = true)
    protected String rowIdent;
    @XmlElement(name = "RowMod", nillable = true)
    protected String rowMod;
    @XmlElement(name = "TransactionID", nillable = true)
    protected String transactionID;
    @XmlElement(name = "UpdateAddr", nillable = true)
    protected Boolean updateAddr;
    @XmlElement(name = "UpdateAllowed", nillable = true)
    protected Boolean updateAllowed;
    @XmlElement(name = "ValidCity", nillable = true)
    protected String validCity;
    @XmlElement(name = "ValidCountry", nillable = true)
    protected String validCountry;
    @XmlElement(name = "ValidLine1", nillable = true)
    protected String validLine1;
    @XmlElement(name = "ValidLine2", nillable = true)
    protected String validLine2;
    @XmlElement(name = "ValidLine3", nillable = true)
    protected String validLine3;
    @XmlElement(name = "ValidLine4", nillable = true)
    protected String validLine4;
    @XmlElement(name = "ValidPostalCode", nillable = true)
    protected String validPostalCode;
    @XmlElement(name = "ValidRegion", nillable = true)
    protected String validRegion;

    /**
     * Gets the value of the addrSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrSource() {
        return addrSource;
    }

    /**
     * Sets the value of the addrSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrSource(String value) {
        this.addrSource = value;
    }

    /**
     * Gets the value of the addrSourceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrSourceID() {
        return addrSourceID;
    }

    /**
     * Sets the value of the addrSourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrSourceID(String value) {
        this.addrSourceID = value;
    }

    /**
     * Gets the value of the addressCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressCode() {
        return addressCode;
    }

    /**
     * Sets the value of the addressCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressCode(String value) {
        this.addressCode = value;
    }

    /**
     * Gets the value of the addressType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressType() {
        return addressType;
    }

    /**
     * Sets the value of the addressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressType(String value) {
        this.addressType = value;
    }

    /**
     * Gets the value of the addressTypeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressTypeDesc() {
        return addressTypeDesc;
    }

    /**
     * Sets the value of the addressTypeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressTypeDesc(String value) {
        this.addressTypeDesc = value;
    }

    /**
     * Gets the value of the carrierRoute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierRoute() {
        return carrierRoute;
    }

    /**
     * Sets the value of the carrierRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierRoute(String value) {
        this.carrierRoute = value;
    }

    /**
     * Gets the value of the carrierRouteDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierRouteDesc() {
        return carrierRouteDesc;
    }

    /**
     * Sets the value of the carrierRouteDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierRouteDesc(String value) {
        this.carrierRouteDesc = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
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
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the countryNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCountryNum() {
        return countryNum;
    }

    /**
     * Sets the value of the countryNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCountryNum(Integer value) {
        this.countryNum = value;
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounty(String value) {
        this.county = value;
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
     * Gets the value of the fipsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFipsCode() {
        return fipsCode;
    }

    /**
     * Sets the value of the fipsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFipsCode(String value) {
        this.fipsCode = value;
    }

    /**
     * Gets the value of the invoiceLine property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInvoiceLine() {
        return invoiceLine;
    }

    /**
     * Sets the value of the invoiceLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInvoiceLine(Integer value) {
        this.invoiceLine = value;
    }

    /**
     * Gets the value of the invoiceNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInvoiceNum() {
        return invoiceNum;
    }

    /**
     * Sets the value of the invoiceNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInvoiceNum(Integer value) {
        this.invoiceNum = value;
    }

    /**
     * Gets the value of the line1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine1() {
        return line1;
    }

    /**
     * Sets the value of the line1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine1(String value) {
        this.line1 = value;
    }

    /**
     * Gets the value of the line2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine2() {
        return line2;
    }

    /**
     * Sets the value of the line2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine2(String value) {
        this.line2 = value;
    }

    /**
     * Gets the value of the line3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine3() {
        return line3;
    }

    /**
     * Sets the value of the line3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine3(String value) {
        this.line3 = value;
    }

    /**
     * Gets the value of the otsCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTSCountry() {
        return otsCountry;
    }

    /**
     * Sets the value of the otsCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTSCountry(String value) {
        this.otsCountry = value;
    }

    /**
     * Gets the value of the postNet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostNet() {
        return postNet;
    }

    /**
     * Sets the value of the postNet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostNet(String value) {
        this.postNet = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the requestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestID() {
        return requestID;
    }

    /**
     * Sets the value of the requestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestID(String value) {
        this.requestID = value;
    }

    /**
     * Gets the value of the resultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultCode(String value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the resultSeq property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResultSeq() {
        return resultSeq;
    }

    /**
     * Sets the value of the resultSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResultSeq(Integer value) {
        this.resultSeq = value;
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
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the updateAddr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpdateAddr() {
        return updateAddr;
    }

    /**
     * Sets the value of the updateAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateAddr(Boolean value) {
        this.updateAddr = value;
    }

    /**
     * Gets the value of the updateAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpdateAllowed() {
        return updateAllowed;
    }

    /**
     * Sets the value of the updateAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateAllowed(Boolean value) {
        this.updateAllowed = value;
    }

    /**
     * Gets the value of the validCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidCity() {
        return validCity;
    }

    /**
     * Sets the value of the validCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidCity(String value) {
        this.validCity = value;
    }

    /**
     * Gets the value of the validCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidCountry() {
        return validCountry;
    }

    /**
     * Sets the value of the validCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidCountry(String value) {
        this.validCountry = value;
    }

    /**
     * Gets the value of the validLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidLine1() {
        return validLine1;
    }

    /**
     * Sets the value of the validLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidLine1(String value) {
        this.validLine1 = value;
    }

    /**
     * Gets the value of the validLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidLine2() {
        return validLine2;
    }

    /**
     * Sets the value of the validLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidLine2(String value) {
        this.validLine2 = value;
    }

    /**
     * Gets the value of the validLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidLine3() {
        return validLine3;
    }

    /**
     * Sets the value of the validLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidLine3(String value) {
        this.validLine3 = value;
    }

    /**
     * Gets the value of the validLine4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidLine4() {
        return validLine4;
    }

    /**
     * Sets the value of the validLine4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidLine4(String value) {
        this.validLine4 = value;
    }

    /**
     * Gets the value of the validPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidPostalCode() {
        return validPostalCode;
    }

    /**
     * Sets the value of the validPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidPostalCode(String value) {
        this.validPostalCode = value;
    }

    /**
     * Gets the value of the validRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidRegion() {
        return validRegion;
    }

    /**
     * Sets the value of the validRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidRegion(String value) {
        this.validRegion = value;
    }

}
