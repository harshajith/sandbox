
package com.epicor.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.epicor.webservices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SelectSerialNumbersParamsDataSetType_QNAME = new QName("http://epicor.com/webservices", "SelectSerialNumbersParamsDataSetType");
    private final static QName _OrderCustTrkDataSetType_QNAME = new QName("http://epicor.com/webservices", "OrderCustTrkDataSetType");
    private final static QName _UpdExtSalesOrderDataSetType_QNAME = new QName("http://epicor.com/webservices", "UpdExtSalesOrderDataSetType");
    private final static QName _BOUpdErrorDataSetType_QNAME = new QName("http://epicor.com/webservices", "BOUpdErrorDataSetType");
    private final static QName _GlbSugPOChgDataSetType_QNAME = new QName("http://epicor.com/webservices", "GlbSugPOChgDataSetType");
    private final static QName _ETCAddrValidationDataSetType_QNAME = new QName("http://epicor.com/webservices", "ETCAddrValidationDataSetType");
    private final static QName _OrderHedListDataSetType_QNAME = new QName("http://epicor.com/webservices", "OrderHedListDataSetType");
    private final static QName _CallContextDataSetType_QNAME = new QName("http://epicor.com/webservices", "CallContextDataSetType");
    private final static QName _SOEntryUIParamsDataSetType_QNAME = new QName("http://epicor.com/webservices", "SOEntryUIParamsDataSetType");
    private final static QName _SalesOrderDataSetType_QNAME = new QName("http://epicor.com/webservices", "SalesOrderDataSetType");
    private final static QName _SaveOTSParamsDataSetType_QNAME = new QName("http://epicor.com/webservices", "SaveOTSParamsDataSetType");
    private final static QName _OrdRelJobProdDataSetType_QNAME = new QName("http://epicor.com/webservices", "OrdRelJobProdDataSetType");
    private final static QName _OrdDtlQuoteQtyDataSetType_QNAME = new QName("http://epicor.com/webservices", "OrdDtlQuoteQtyDataSetType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.epicor.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SalesOrderDataSetType }
     * 
     */
    public SalesOrderDataSetType createSalesOrderDataSetType() {
        return new SalesOrderDataSetType();
    }

    /**
     * Create an instance of {@link CallContextDataSetType }
     * 
     */
    public CallContextDataSetType createCallContextDataSetType() {
        return new CallContextDataSetType();
    }

    /**
     * Create an instance of {@link GlbSugPOChgDataSetType }
     * 
     */
    public GlbSugPOChgDataSetType createGlbSugPOChgDataSetType() {
        return new GlbSugPOChgDataSetType();
    }

    /**
     * Create an instance of {@link OrderHedListDataSetType }
     * 
     */
    public OrderHedListDataSetType createOrderHedListDataSetType() {
        return new OrderHedListDataSetType();
    }

    /**
     * Create an instance of {@link SaveOTSParamsDataSetType }
     * 
     */
    public SaveOTSParamsDataSetType createSaveOTSParamsDataSetType() {
        return new SaveOTSParamsDataSetType();
    }

    /**
     * Create an instance of {@link SOEntryUIParamsDataSetType }
     * 
     */
    public SOEntryUIParamsDataSetType createSOEntryUIParamsDataSetType() {
        return new SOEntryUIParamsDataSetType();
    }

    /**
     * Create an instance of {@link ETCAddrValidationDataSetType }
     * 
     */
    public ETCAddrValidationDataSetType createETCAddrValidationDataSetType() {
        return new ETCAddrValidationDataSetType();
    }

    /**
     * Create an instance of {@link UpdExtSalesOrderDataSetType }
     * 
     */
    public UpdExtSalesOrderDataSetType createUpdExtSalesOrderDataSetType() {
        return new UpdExtSalesOrderDataSetType();
    }

    /**
     * Create an instance of {@link OrdRelJobProdDataSetType }
     * 
     */
    public OrdRelJobProdDataSetType createOrdRelJobProdDataSetType() {
        return new OrdRelJobProdDataSetType();
    }

    /**
     * Create an instance of {@link SelectSerialNumbersParamsDataSetType }
     * 
     */
    public SelectSerialNumbersParamsDataSetType createSelectSerialNumbersParamsDataSetType() {
        return new SelectSerialNumbersParamsDataSetType();
    }

    /**
     * Create an instance of {@link BOUpdErrorDataSetType }
     * 
     */
    public BOUpdErrorDataSetType createBOUpdErrorDataSetType() {
        return new BOUpdErrorDataSetType();
    }

    /**
     * Create an instance of {@link OrderCustTrkDataSetType }
     * 
     */
    public OrderCustTrkDataSetType createOrderCustTrkDataSetType() {
        return new OrderCustTrkDataSetType();
    }

    /**
     * Create an instance of {@link OrdDtlQuoteQtyDataSetType }
     * 
     */
    public OrdDtlQuoteQtyDataSetType createOrdDtlQuoteQtyDataSetType() {
        return new OrdDtlQuoteQtyDataSetType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectSerialNumbersParamsDataSetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://epicor.com/webservices", name = "SelectSerialNumbersParamsDataSetType")
    public JAXBElement<SelectSerialNumbersParamsDataSetType> createSelectSerialNumbersParamsDataSetType(SelectSerialNumbersParamsDataSetType value) {
        return new JAXBElement<SelectSerialNumbersParamsDataSetType>(_SelectSerialNumbersParamsDataSetType_QNAME, SelectSerialNumbersParamsDataSetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderCustTrkDataSetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://epicor.com/webservices", name = "OrderCustTrkDataSetType")
    public JAXBElement<OrderCustTrkDataSetType> createOrderCustTrkDataSetType(OrderCustTrkDataSetType value) {
        return new JAXBElement<OrderCustTrkDataSetType>(_OrderCustTrkDataSetType_QNAME, OrderCustTrkDataSetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdExtSalesOrderDataSetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://epicor.com/webservices", name = "UpdExtSalesOrderDataSetType")
    public JAXBElement<UpdExtSalesOrderDataSetType> createUpdExtSalesOrderDataSetType(UpdExtSalesOrderDataSetType value) {
        return new JAXBElement<UpdExtSalesOrderDataSetType>(_UpdExtSalesOrderDataSetType_QNAME, UpdExtSalesOrderDataSetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BOUpdErrorDataSetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://epicor.com/webservices", name = "BOUpdErrorDataSetType")
    public JAXBElement<BOUpdErrorDataSetType> createBOUpdErrorDataSetType(BOUpdErrorDataSetType value) {
        return new JAXBElement<BOUpdErrorDataSetType>(_BOUpdErrorDataSetType_QNAME, BOUpdErrorDataSetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlbSugPOChgDataSetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://epicor.com/webservices", name = "GlbSugPOChgDataSetType")
    public JAXBElement<GlbSugPOChgDataSetType> createGlbSugPOChgDataSetType(GlbSugPOChgDataSetType value) {
        return new JAXBElement<GlbSugPOChgDataSetType>(_GlbSugPOChgDataSetType_QNAME, GlbSugPOChgDataSetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ETCAddrValidationDataSetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://epicor.com/webservices", name = "ETCAddrValidationDataSetType")
    public JAXBElement<ETCAddrValidationDataSetType> createETCAddrValidationDataSetType(ETCAddrValidationDataSetType value) {
        return new JAXBElement<ETCAddrValidationDataSetType>(_ETCAddrValidationDataSetType_QNAME, ETCAddrValidationDataSetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderHedListDataSetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://epicor.com/webservices", name = "OrderHedListDataSetType")
    public JAXBElement<OrderHedListDataSetType> createOrderHedListDataSetType(OrderHedListDataSetType value) {
        return new JAXBElement<OrderHedListDataSetType>(_OrderHedListDataSetType_QNAME, OrderHedListDataSetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallContextDataSetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://epicor.com/webservices", name = "CallContextDataSetType")
    public JAXBElement<CallContextDataSetType> createCallContextDataSetType(CallContextDataSetType value) {
        return new JAXBElement<CallContextDataSetType>(_CallContextDataSetType_QNAME, CallContextDataSetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SOEntryUIParamsDataSetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://epicor.com/webservices", name = "SOEntryUIParamsDataSetType")
    public JAXBElement<SOEntryUIParamsDataSetType> createSOEntryUIParamsDataSetType(SOEntryUIParamsDataSetType value) {
        return new JAXBElement<SOEntryUIParamsDataSetType>(_SOEntryUIParamsDataSetType_QNAME, SOEntryUIParamsDataSetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalesOrderDataSetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://epicor.com/webservices", name = "SalesOrderDataSetType")
    public JAXBElement<SalesOrderDataSetType> createSalesOrderDataSetType(SalesOrderDataSetType value) {
        return new JAXBElement<SalesOrderDataSetType>(_SalesOrderDataSetType_QNAME, SalesOrderDataSetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveOTSParamsDataSetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://epicor.com/webservices", name = "SaveOTSParamsDataSetType")
    public JAXBElement<SaveOTSParamsDataSetType> createSaveOTSParamsDataSetType(SaveOTSParamsDataSetType value) {
        return new JAXBElement<SaveOTSParamsDataSetType>(_SaveOTSParamsDataSetType_QNAME, SaveOTSParamsDataSetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrdRelJobProdDataSetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://epicor.com/webservices", name = "OrdRelJobProdDataSetType")
    public JAXBElement<OrdRelJobProdDataSetType> createOrdRelJobProdDataSetType(OrdRelJobProdDataSetType value) {
        return new JAXBElement<OrdRelJobProdDataSetType>(_OrdRelJobProdDataSetType_QNAME, OrdRelJobProdDataSetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrdDtlQuoteQtyDataSetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://epicor.com/webservices", name = "OrdDtlQuoteQtyDataSetType")
    public JAXBElement<OrdDtlQuoteQtyDataSetType> createOrdDtlQuoteQtyDataSetType(OrdDtlQuoteQtyDataSetType value) {
        return new JAXBElement<OrdDtlQuoteQtyDataSetType>(_OrdDtlQuoteQtyDataSetType_QNAME, OrdDtlQuoteQtyDataSetType.class, null, value);
    }

}
