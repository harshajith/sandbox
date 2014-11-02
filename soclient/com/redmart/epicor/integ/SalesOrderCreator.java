package com.redmart.epicor.integ;

import java.math.BigDecimal;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;
import javax.xml.ws.soap.AddressingFeature;

import org.datacontract.schemas._2004._07.epicor_mfg.SalesOrderDataSetTypeOHOrderMsc;
import org.datacontract.schemas._2004._07.epicor_mfg.SalesOrderDataSetTypeOrderDtl;
import org.datacontract.schemas._2004._07.epicor_mfg.SalesOrderDataSetTypeOrderHed;
import org.tempuri.ISalesOrderService;
import org.tempuri.SalesOrderService;

import com.epicor.webservices.SalesOrderDataSetType;

public class SalesOrderCreator {
	
	static {
	    //for localhost testing only
	    javax.net.ssl.HttpsURLConnection.setDefaultHostnameVerifier(
	    new javax.net.ssl.HostnameVerifier(){
 
	        public boolean verify(String hostname,
	                javax.net.ssl.SSLSession sslSession) {
	            if (hostname.equals("rmiiserp.redmartad.com")) {
	                return true;
	            }
	            return false;
	        }
	    });
	}
	
	public static void main(String[] args){
		SalesOrderService soService = new SalesOrderService();
		ISalesOrderService salesOrderService = soService.getWSHttpBindingISalesOrderService(new AddressingFeature(true, false)); 
		createSalesOrder(salesOrderService);
	}
	
	/**
	 * Main method which creates the sales order.
	 * @param proxy
	 */
	private static void createSalesOrder(ISalesOrderService salesOrderService) {
		
		//=========== Create Header ===========================
		SalesOrderDataSetType ds = new SalesOrderDataSetType();
		Holder<SalesOrderDataSetType> dsOut = new Holder<SalesOrderDataSetType>();
		salesOrderService.getNewOrderHed("RedMart", ds, null, dsOut, null);
		
		
		ds = dsOut.value;
		populateHeaderWithCustomer(ds);
		salesOrderService.changeSoldToID("RedMart", ds, null, dsOut, null);
		
		
		ds = dsOut.value;
		changeShipTo(ds); 
		salesOrderService.changeShipToID("RedMart", ds, null, dsOut, null);
		
		
		ds = dsOut.value;
		salesOrderService.updateData("RedMart", ds, false, true, null, null, dsOut, null, null);
		
		
		ds = dsOut.value;
		SalesOrderDataSetTypeOrderHed head = ds.getOrderHed().getSalesOrderDataSetTypeOrderHeds().get(0);
		System.out.println("OrderNum : " + head.getOrderNum());
		System.out.println("Header is created, check the customer record for tax-inclusive pricing");
		
		
		// =========== Create Line 1 ===============================
		
		//ds = dsOut.value;
		salesOrderService.getNewOrderDtl("RedMart", ds, head.getOrderNum(), null, dsOut, null);
		
		
		ds = dsOut.value;
		SalesOrderDataSetTypeOrderDtl detail = ds.getOrderDtl().getSalesOrderDataSetTypeOrderDtls().get(0);
		detail.setOrderLine(1);
		detail.setCheckBox01(true);
		//detail.setShortChar01(null);
		detail.setShortChar02("ER");
		detail.setShortChar03("RE");
		detail.setNumber01(new BigDecimal(5));
		
		Holder<String> partNum = new Holder<String>();
		partNum.value="11095";
		Holder<String> uomCode = new Holder<String>();
		uomCode.value="CS";
		salesOrderService.changePartNumMaster("RedMart", partNum, null, null, uomCode, null, null, null, null, null, null, false, false, ds, null, dsOut, null, null, null, null, null, null, null, null, null, null, null, null);
		
		
		ds = dsOut.value;
		salesOrderService.changeSellingQtyMaster("RedMart", ds, new BigDecimal(5), null, null, null, null, null, null, "11095", null, null, null, null, null, null, dsOut, null, null, null, null, null);
		
		
		ds = dsOut.value;
		detail = ds.getOrderDtl().getSalesOrderDataSetTypeOrderDtls().get(0);
		detail.setDocUnitPrice(new BigDecimal(3));
		detail.setDspUnitPrice(new BigDecimal(3));
		detail.setDocDspUnitPrice(new BigDecimal(3));
		//detail.setSalesUM("IP");
		//detail.setOrderLine(1);
		salesOrderService.changeUnitPrice("RedMart", ds, null, dsOut, null);
		
		
		ds = dsOut.value;
		detail = ds.getOrderDtl().getSalesOrderDataSetTypeOrderDtls().get(0);
		//detail.setDiscountPercent(new BigDecimal(1));
		detail.setDocDiscount(new BigDecimal(1));
		detail.setDiscount(new BigDecimal(1));
		detail.setDocDspDiscount(new BigDecimal(1));
		salesOrderService.changeDiscountAmount("RedMart", ds, null, dsOut, null);
		
		ds = dsOut.value;
		detail = ds.getOrderDtl().getSalesOrderDataSetTypeOrderDtls().get(0);
		detail.setLineDesc("COCK COCK");
		
		salesOrderService.masterUpdate("RedMart", null, null, head.getCustNum(), head.getOrderNum(), true, ds, null, dsOut, null, null, null, null, null, null);
		
		//proxy.updateData("RedMart", ds, false, true, null, null, dsOut, null, null);
		System.out.println("Line added, checkout the prices");
		
		
		Holder<SalesOrderDataSetType> orderResult = new Holder<SalesOrderDataSetType>();
		salesOrderService.getByID("RedMart", head.getOrderNum(), null, orderResult, null);
		
		SalesOrderDataSetType order = orderResult.value;
		SalesOrderDataSetTypeOrderDtl dtl = order.getOrderDtl().getSalesOrderDataSetTypeOrderDtls().get(0);
		dtl.setDocDiscount(new BigDecimal(3));
		dtl.setDocDspDiscount(new BigDecimal(3));
		
		
		salesOrderService.updateData("RedMart", order, false, true, null, null, orderResult, null, null);
		System.out.println("Discount added !");
		
//		// =========== Create Line 2 ===============================
//		
//		ds = dsOut.value;
//		salesOrderService.getNewOrderDtl("RedMart", ds, head.getOrderNum(), null, dsOut, null);
//		
//		
//		ds = dsOut.value;
//		detail = ds.getOrderDtl().getSalesOrderDataSetTypeOrderDtls().get(1);
//		detail.setOrderLine(2);
//		detail.setCheckBox01(true);
//		detail.setShortChar01("LIKE REDMART");
//		detail.setShortChar02("ER");
//		detail.setShortChar03("RE");
//		detail.setNumber01(new BigDecimal(5));
//		
//		//Holder<String> partNum = new Holder<String>();
//		partNum.value="10830";
//		//Holder<String> uomCode = new Holder<String>();
//		uomCode.value="EA";
//		salesOrderService.changePartNumMaster("RedMart", partNum, null, null, uomCode, null, null, null, null, null, null, false, false, ds, null, dsOut, null, null, null, null, null, null, null, null, null, null, null, null);
//		
//		
//		ds = dsOut.value;
//		salesOrderService.changeSellingQtyMaster("RedMart", ds, new BigDecimal(5), null, null, null, null, null, null, "10830", null, null, null, null, null, null, dsOut, null, null, null, null, null);
//		
//		
//		ds = dsOut.value;
//		detail = ds.getOrderDtl().getSalesOrderDataSetTypeOrderDtls().get(1);
//		detail.setDocUnitPrice(new BigDecimal(4));
//		detail.setDspUnitPrice(new BigDecimal(4));
//		detail.setDocDspUnitPrice(new BigDecimal(4));
//		//detail.setOrderLine(2);
//		salesOrderService.changeUnitPrice("RedMart", ds, null, dsOut, null);
//		
//		
//		ds = dsOut.value;
//		detail = ds.getOrderDtl().getSalesOrderDataSetTypeOrderDtls().get(1);
//		detail.setDiscountPercent(new BigDecimal(1));
//		detail.setDocDiscount(new BigDecimal(1));
//		detail.setDiscount(new BigDecimal(1));
//		detail.setDocDspDiscount(new BigDecimal(1));
//		salesOrderService.changeDiscountAmount("RedMart", ds, null, dsOut, null);
//		
//		ds = dsOut.value;
//		detail = ds.getOrderDtl().getSalesOrderDataSetTypeOrderDtls().get(1);
//		detail.setLineDesc("Line Description");
//		salesOrderService.masterUpdate("RedMart", null, null, head.getCustNum(), head.getOrderNum(), true, ds, null, dsOut, null, null, null, null, null, null);
//	
//		System.out.println("Line 1 is created !");
//		
//		
//		
//		// ================== Adding MISC charges =======================
//		
//		ds = dsOut.value;
//		
//		salesOrderService.getNewOHOrderMsc("RedMart", ds, head.getOrderNum(), 1, null, dsOut, null);
//		ds = dsOut.value;
//		
//		SalesOrderDataSetTypeOHOrderMsc deliveryCharge = ds.getOHOrderMsc().getSalesOrderDataSetTypeOHOrderMscs().get(0);
//		deliveryCharge.setMiscCode("DC");
//		salesOrderService.changeMiscCode("RedMart", ds, null, null, dsOut, null);
//		ds = dsOut.value;
//		
//		deliveryCharge = ds.getOHOrderMsc().getSalesOrderDataSetTypeOHOrderMscs().get(0);
//		deliveryCharge.setMiscAmt(new BigDecimal(7));
//		deliveryCharge.setDocDspMiscAmt(new BigDecimal(7));
//		deliveryCharge.setDocMiscAmt(new BigDecimal(7));
//		salesOrderService.changeMiscAmount("RedMart", ds, null, null, dsOut, null);
//		ds = dsOut.value;
//		
//		deliveryCharge = ds.getOHOrderMsc().getSalesOrderDataSetTypeOHOrderMscs().get(0);
//		deliveryCharge.setDescription("GSDFSDS");
//		salesOrderService.masterUpdate("RedMart", null, null, head.getCustNum(), head.getOrderNum(), true, ds, null, dsOut, null, null, null, null, null, null);
//		System.out.println("Added msc charge 1");
//		
//		//=============== Add msc 2=============================
//		ds = dsOut.value;
//		
//		salesOrderService.getNewOHOrderMsc("RedMart", ds, head.getOrderNum(), 2, null, dsOut, null);
//		ds = dsOut.value;
//		
//		SalesOrderDataSetTypeOHOrderMsc deliveryIncentive = ds.getOHOrderMsc().getSalesOrderDataSetTypeOHOrderMscs().get(1);
//		deliveryIncentive.setMiscCode("DI");
//		salesOrderService.changeMiscCode("RedMart", ds, null, null, dsOut, null);
//		ds = dsOut.value;
//		
//		deliveryIncentive = ds.getOHOrderMsc().getSalesOrderDataSetTypeOHOrderMscs().get(1);
//		deliveryIncentive.setMiscAmt(new BigDecimal(-0.50));
//		deliveryIncentive.setDocDspMiscAmt(new BigDecimal(-0.50));
//		deliveryIncentive.setDocMiscAmt(new BigDecimal(-0.50));
//		salesOrderService.changeMiscAmount("RedMart", ds, null, null, dsOut, null);
//		ds = dsOut.value;
//		
//		
//		salesOrderService.masterUpdate("RedMart", null, null, head.getCustNum(), head.getOrderNum(), true, ds, null, dsOut, null, null, null, null, null, null);
//		System.out.println("Added msc charges 2");
		
	}
	
	private void populateHeaderData(SalesOrderDataSetType ds) {
		if(ds != null){
			SalesOrderDataSetTypeOrderHed orderHed = ds.getOrderHed().getSalesOrderDataSetTypeOrderHeds().get(0);
			orderHed.setOrderNum(0);
			//orderHed.setCustNum(15);
			//orderHed.setCustomerCustID("33408");
			orderHed.setCompany("RedMart");
			//orderHed.setTermsCode("N15");
			orderHed.setNeedByDate(getXMLDateForEpocTime());
			orderHed.setCurrencyCode("SGD");
			//orderHed.setBTCustNum(15);
			//orderHed.setShipToCustNum(15);
			
			//orderHed.setInPrice(true); // Without this tax-inclusive red box would not be shown up.
			
		}
		
	}


	private static void changeUnitPrice(SalesOrderDataSetTypeOrderDtl detail) {
		detail.setDocUnitPrice(new BigDecimal(10));
		detail.setDocDiscount(new BigDecimal(1));
		//detail.set
		
	}


	private static void populateLineNew(SalesOrderDataSetTypeOrderDtl detail) {
		detail.setCompany("RedMart");
		detail.setPartNum("11225");
		detail.setLineDesc("Coca-Cola Zero");
		//detail.setDocDspUnitPrice(getNetValue("8.50"));
		//detail.setDocInUnitPrice(new BigDecimal(10));
		detail.setDocUnitPrice(new BigDecimal(10));
		//detail.setDocDiscount(new BigDecimal(0));
		detail.setOrderLine(1);
		detail.setSalesUM("EA");
		detail.setIUM("EA");
		detail.setSellingQuantity(new BigDecimal(1));
		detail.setNeedByDate(getXMLDateForEpocTime());
		//detail.setDemandQuantity(new BigDecimal(1));
		//detail.setInPrice(true);
		
	}
	
	
	/**
	 * Without
	 * @param getNewOrderHedResult
	 */
	private static void populateHeaderWithCustomer(SalesOrderDataSetType getNewOrderHedResult) {
		if(getNewOrderHedResult != null){
			SalesOrderDataSetTypeOrderHed orderHed = getNewOrderHedResult.getOrderHed().getSalesOrderDataSetTypeOrderHeds().get(0);
			orderHed.setOrderNum(0);
			//orderHed.setCustNum(15);
			orderHed.setCustomerCustID("319051653");
			orderHed.setCompany("RedMart");
			orderHed.setTermsCode("N15");
			orderHed.setNeedByDate(getXMLDateForEpocTime());
			orderHed.setCurrencyCode("SGD");
			//orderHed.setBTCustNum(15);
			//orderHed.setShipToCustNum(15);
			
			//orderHed.setInPrice(true); // Without this tax-inclusive red box would not be shown up.
			
		}
	}
	
	
	private static void changeShipTo(SalesOrderDataSetType ds) {
		if(ds != null){
			SalesOrderDataSetTypeOrderHed orderHed = ds.getOrderHed().getSalesOrderDataSetTypeOrderHeds().get(0);
			orderHed.setShipToNum("89335");
			//orderHed.setBTCustNum(15);
			//orderHed.setShipToCustNum(15);
			//orderHed.setInPrice(true);
			
		}
		
	}
	
	
	public static XMLGregorianCalendar getXMLDateForEpocTime(){
		
		GregorianCalendar calendar = new GregorianCalendar();
		//calendar.setTimeInMillis(epocTimeInMillis);
		
		XMLGregorianCalendar xmlCalendar = null;
		try {
			xmlCalendar = DatatypeFactory.newInstance()
			        .newXMLGregorianCalendar(
			        		calendar);
		} catch (DatatypeConfigurationException e) {
			//logger.error("Converting date to XMLDateForEpocTime failed !" + e.getMessage());
		}
		return xmlCalendar;
		
	}
	
	

}
