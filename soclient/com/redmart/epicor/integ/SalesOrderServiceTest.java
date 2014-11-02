package com.redmart.epicor.integ;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;
import javax.xml.ws.soap.AddressingFeature;

import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfSalesOrderDataSetTypeOrderDtl;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfSalesOrderDataSetTypeOrderHed;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfUpdExtSalesOrderDataSetTypeOrderDtl;
import org.datacontract.schemas._2004._07.epicor_mfg.ArrayOfUpdExtSalesOrderDataSetTypeOrderHed;
import org.datacontract.schemas._2004._07.epicor_mfg.SalesOrderDataSetTypeOHOrderMsc;
import org.datacontract.schemas._2004._07.epicor_mfg.SalesOrderDataSetTypeOrderDtl;
import org.datacontract.schemas._2004._07.epicor_mfg.SalesOrderDataSetTypeOrderHed;
import org.datacontract.schemas._2004._07.epicor_mfg.UpdExtSalesOrderDataSetTypeOrderDtl;
import org.datacontract.schemas._2004._07.epicor_mfg.UpdExtSalesOrderDataSetTypeOrderHed;
import org.tempuri.ISalesOrderService;
import org.tempuri.SalesOrderService;

import com.epicor.webservices.SalesOrderDataSetType;
import com.epicor.webservices.UpdExtSalesOrderDataSetType;

public class SalesOrderServiceTest {

	
	public SalesOrderServiceTest(){
		
		//updateSalesOrder();
		
		try{
			SalesOrderService soService = new SalesOrderService();
			ISalesOrderService proxy = soService.getWSHttpBindingISalesOrderService(new AddressingFeature(true, false)); 
			//createSOHeaderDetailsMsc(proxy);
			deleteSO(proxy);
			
			//createSalesOrder(proxy);
			//createSalesOrderWithCustomer(proxy);
			
			
//			================== Create SO ===========================================
//			SalesOrderDataSetType salesOrderData = populateSalesOrderDataUpdate();
//			
//			SalesOrderDataSetType response = proxy.submitNewOrder("RedMart", salesOrderData);
//			if(response != null){
//				System.out.println("Successfully created the shipment header !");
//			}
//			
//			ArrayOfSalesOrderDataSetTypeOrderHed holder = response.getOrderHed();
//			List<SalesOrderDataSetTypeOrderHed> heads = holder.getSalesOrderDataSetTypeOrderHeds();
//			SalesOrderDataSetTypeOrderHed hd = heads.get(0);
//			
//			System.out.println("Order is created !" + hd.getOrderNum());
//			========================================================================
//			
//			ArrayOfSalesOrderDataSetTypeOrderHed holder = response.getOrderHed();
//			List<SalesOrderDataSetTypeOrderHed> heads = holder.getSalesOrderDataSetTypeOrderHeds();
//			SalesOrderDataSetTypeOrderHed hd = heads.get(0);
//			
//			hd.setTermsCode("N15");
//			hd.setNeedByDate(getXMLDateForEpocTime());
//			
//			System.out.println("Sales order created : order number :" + hd.getOrderNum() + " :: CustomerNum : " + hd.getCustNum());
			
			SalesOrderDataSetType updateType = populateSOForUpdate(2160); // update the above created order with new ITEM
//			Holder<SalesOrderDataSetType> result = new Holder<SalesOrderDataSetType>();
//			
//			proxy.getByID("RedMart", 2149, null, result, null);
//			SalesOrderDataSetType soType = result.value;
//			ArrayOfSalesOrderDataSetTypeOrderHed holder = soType.getOrderHed();
//			List<SalesOrderDataSetTypeOrderHed> heads = holder.getSalesOrderDataSetTypeOrderHeds();
//			SalesOrderDataSetTypeOrderHed hd = heads.get(0);
//			
//			hd.setTermsCode("DP");
//			hd.setNeedByDate(null);
//			hd.setCustomerName("Harsha Hal");
			
//			Holder<String> cResponseMsg = new Holder<String>();
//			Holder<String> cDisplayMsg = new Holder<String>();
//			Holder<String> cCompliantMsg = new Holder<String>();
//			Holder<String> cResponseMsgOrdRel = new Holder<String>();
//			Holder<SalesOrderDataSetType> masterUpdateResult = new Holder<SalesOrderDataSetType>();
			
			//proxy.updateExistingOrder("RedMart", updateType); // Working for header detail updates // to add lines set line to 0
			//proxy.updateData("RedMart", updateType, true, true, null, null, null, null, null);  // Working for detail update , Qty etc, Need to set the correct Line number
			//proxy.masterUpdate("RedMart", Boolean.FALSE, null, 677, 2149, Boolean.FALSE, updateType, null, masterUpdateResult, new Holder<Boolean>(Boolean.TRUE), cResponseMsg, cDisplayMsg, cCompliantMsg, cResponseMsgOrdRel, null);
			//UpdExtSalesOrderDataSetType updateExtType = populateUpdateSo(2160);
			//proxy.update("RedMart", updateExtType, true, true, null, null, null, null, null);

			  
			//proxy.closeOrderLine("RedMart", 2149, 6, null, null, null); // Closing the line item.
			//proxy.closeOrder(loginOptions, iOrderNum, callContext, closeOrderResult, callContextOut);
			  

			
			System.out.println("Sales order updated! : order number :");
			// Update SO ====
			//proxy.update("RedMart", salesOrderData, continueProcessingOnError, rollbackParentOnChildError, callContext, updateResult, dsOut, errorsOccurred, callContextOut);
			

		}catch(Exception e){
			System.out.println("Exception occurred :" + e.toString());
		}
		
	}

	
	private void deleteSO(ISalesOrderService proxy) {
		
		try{
			SalesOrderDataSetType ds = new SalesOrderDataSetType();
			ArrayOfSalesOrderDataSetTypeOrderHed orderHeads = new ArrayOfSalesOrderDataSetTypeOrderHed();
			SalesOrderDataSetTypeOrderHed orderHed = new SalesOrderDataSetTypeOrderHed();
			
			orderHed.setOrderNum(61382);
			orderHed.setRowMod("D");
			//orderHed.setCustNum(15);
			//orderHed.setCustomerCustID("33816");
			orderHed.setCompany("RedMart");
			//orderHed.setTermsCode("N15");
			//orderHed.setNeedByDate(getXMLDateForEpocTime());
			//orderHed.setCurrencyCode("SGD");
			
			
			orderHeads.getSalesOrderDataSetTypeOrderHeds().add(orderHed);
			ds.setOrderHed(orderHeads);
			
			proxy.updateData("RedMart", ds, false, true, null, null, null, null, null);
			System.out.println("============ SO is deleted ==============" + 2596);
		}catch(Exception e){
			System.out.println("Exception : " + e.toString());
		}
		
		
	}


	/**
	 * Ferry Trace , with master updates
	 * @param proxy
	 */
	private void createSOHeaderDetailsMsc(ISalesOrderService salesOrderService) {
		
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
		detail.setShortChar01("LIKE REDMART");
		detail.setShortChar02("ER");
		detail.setShortChar03("RE");
		detail.setNumber09(new BigDecimal(10));
		detail.setNumber10(new BigDecimal(11));
		detail.setNumber01(new BigDecimal(5));
		
		Holder<String> partNum = new Holder<String>();
		partNum.value="10003";
		Holder<String> uomCode = new Holder<String>();
		uomCode.value="EA";
		salesOrderService.changePartNumMaster("RedMart", partNum, null, null, uomCode, null, null, null, null, null, null, false, false, ds, null, dsOut, null, null, null, null, null, null, null, null, null, null, null, null);
		
		
		ds = dsOut.value;
		salesOrderService.changeSellingQtyMaster("RedMart", ds, new BigDecimal(5), null, null, null, null, null, null, "10003", null, null, null, null, null, null, dsOut, null, null, null, null, null);
		
		
		ds = dsOut.value;
		detail = ds.getOrderDtl().getSalesOrderDataSetTypeOrderDtls().get(0);
		detail.setDocUnitPrice(new BigDecimal(3));
		detail.setDspUnitPrice(new BigDecimal(3));
		detail.setDocDspUnitPrice(new BigDecimal(3));
		detail.setSalesUM("EA");
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
		
		
		// =========== Create Line 2 ===============================
		
		ds = dsOut.value;
		salesOrderService.getNewOrderDtl("RedMart", ds, head.getOrderNum(), null, dsOut, null);
		
		
		ds = dsOut.value;
		detail = ds.getOrderDtl().getSalesOrderDataSetTypeOrderDtls().get(1);
		detail.setOrderLine(2);
		detail.setCheckBox01(true);
		detail.setShortChar01("LIKE REDMART");
		detail.setShortChar02("ER");
		detail.setShortChar03("RE");
		detail.setNumber01(new BigDecimal(5));
		
		//Holder<String> partNum = new Holder<String>();
		partNum.value="10004";
		//Holder<String> uomCode = new Holder<String>();
		uomCode.value="EA";
		salesOrderService.changePartNumMaster("RedMart", partNum, null, null, uomCode, null, null, null, null, null, null, false, false, ds, null, dsOut, null, null, null, null, null, null, null, null, null, null, null, null);
		
		
		ds = dsOut.value;
		salesOrderService.changeSellingQtyMaster("RedMart", ds, new BigDecimal(5), null, null, null, null, null, null, "10004", null, null, null, null, null, null, dsOut, null, null, null, null, null);
		
		
		ds = dsOut.value;
		detail = ds.getOrderDtl().getSalesOrderDataSetTypeOrderDtls().get(1);
		detail.setDocUnitPrice(new BigDecimal(4));
		detail.setDspUnitPrice(new BigDecimal(4));
		detail.setDocDspUnitPrice(new BigDecimal(4));
		//detail.setOrderLine(2);
		salesOrderService.changeUnitPrice("RedMart", ds, null, dsOut, null);
		
		
		ds = dsOut.value;
		detail = ds.getOrderDtl().getSalesOrderDataSetTypeOrderDtls().get(1);
		detail.setDiscountPercent(new BigDecimal(1));
		detail.setDocDiscount(new BigDecimal(1));
		detail.setDiscount(new BigDecimal(1));
		detail.setDocDspDiscount(new BigDecimal(1));
		salesOrderService.changeDiscountAmount("RedMart", ds, null, dsOut, null);
		
		ds = dsOut.value;
		detail = ds.getOrderDtl().getSalesOrderDataSetTypeOrderDtls().get(1);
		detail.setLineDesc("Line Description");
		salesOrderService.masterUpdate("RedMart", null, null, head.getCustNum(), head.getOrderNum(), true, ds, null, dsOut, null, null, null, null, null, null);
	
		System.out.println("Line 1 is created !");
		
		
		
		// ================== Adding MISC charges =======================
		
		ds = dsOut.value;
		
		salesOrderService.getNewOHOrderMsc("RedMart", ds, head.getOrderNum(), 1, null, dsOut, null);
		ds = dsOut.value;
		
		SalesOrderDataSetTypeOHOrderMsc deliveryCharge = ds.getOHOrderMsc().getSalesOrderDataSetTypeOHOrderMscs().get(0);
		deliveryCharge.setMiscCode("DC");
		deliveryCharge.setDescription("GSDFSDS");
		salesOrderService.changeMiscCode("RedMart", ds, null, null, dsOut, null);
		ds = dsOut.value;
		
		deliveryCharge = ds.getOHOrderMsc().getSalesOrderDataSetTypeOHOrderMscs().get(0);
		deliveryCharge.setMiscAmt(new BigDecimal(7));
		deliveryCharge.setDocDspMiscAmt(new BigDecimal(7));
		deliveryCharge.setDocMiscAmt(new BigDecimal(7));
		salesOrderService.changeMiscAmount("RedMart", ds, null, null, dsOut, null);
		ds = dsOut.value;
		
		
		salesOrderService.masterUpdate("RedMart", null, null, head.getCustNum(), head.getOrderNum(), true, ds, null, dsOut, null, null, null, null, null, null);
		System.out.println("Added msc charge 1");
		
		//=============== Add msc 2=============================
		ds = dsOut.value;
		
		salesOrderService.getNewOHOrderMsc("RedMart", ds, head.getOrderNum(), 2, null, dsOut, null);
		ds = dsOut.value;
		
		SalesOrderDataSetTypeOHOrderMsc deliveryIncentive = ds.getOHOrderMsc().getSalesOrderDataSetTypeOHOrderMscs().get(1);
		deliveryIncentive.setMiscCode("DI");
		salesOrderService.changeMiscCode("RedMart", ds, null, null, dsOut, null);
		ds = dsOut.value;
		
		deliveryIncentive = ds.getOHOrderMsc().getSalesOrderDataSetTypeOHOrderMscs().get(1);
		deliveryIncentive.setMiscAmt(new BigDecimal(-0.50));
		deliveryIncentive.setDocDspMiscAmt(new BigDecimal(-0.50));
		deliveryIncentive.setDocMiscAmt(new BigDecimal(-0.50));
		salesOrderService.changeMiscAmount("RedMart", ds, null, null, dsOut, null);
		ds = dsOut.value;
		
		
		salesOrderService.masterUpdate("RedMart", null, null, head.getCustNum(), head.getOrderNum(), true, ds, null, dsOut, null, null, null, null, null, null);
		System.out.println("Added msc charges 2");
		
	}

	/**
	 * Ferry Trace , without master updates
	 * @param proxy
	 */
	private void createSalesOrderWithCustomer(ISalesOrderService proxy) {
		SalesOrderDataSetType ds = new SalesOrderDataSetType();
		Holder<SalesOrderDataSetType> dsOut = new Holder<SalesOrderDataSetType>();
		proxy.getNewOrderHed("RedMart", ds, null, dsOut, null);
		ds = dsOut.value;
		populateHeaderWithCustomer(ds);
		proxy.changeSoldToID("RedMart", ds, null, dsOut, null);
		ds = dsOut.value;
		changeShipTo(ds); 
		proxy.changeShipToID("RedMart", ds, null, dsOut, null);
		ds = dsOut.value;
		
		populateHeaderData(ds);
		proxy.updateData("RedMart", ds, false, true, null, null, dsOut, null, null);
		ds = dsOut.value;
		SalesOrderDataSetTypeOrderHed head = ds.getOrderHed().getSalesOrderDataSetTypeOrderHeds().get(0);
		System.out.println("OrderNum : " + head.getOrderNum());
		System.out.println("Header is created, check the customer record for tax-inclusive pricing");
		
		// Add lines
		
		//ds = dsOut.value;
		proxy.getNewOrderDtl("RedMart", ds, head.getOrderNum(), null, dsOut, null);
		ds = dsOut.value;
		
		SalesOrderDataSetTypeOrderDtl detail = ds.getOrderDtl().getSalesOrderDataSetTypeOrderDtls().get(0);
		detail.setPartNum("10003");
		
		proxy.changePartNum("RedMart", ds, true, null, null, dsOut, null);
		ds = dsOut.value;
		
		proxy.changeSellingQuantity("RedMart", ds, true, new BigDecimal(1), null, dsOut, null, null);
		ds = dsOut.value;
		
		SalesOrderDataSetTypeOrderDtl detail1 = ds.getOrderDtl().getSalesOrderDataSetTypeOrderDtls().get(0);
		detail1.setDocUnitPrice(new BigDecimal(20));
		proxy.changeUnitPrice("RedMart", ds, null, dsOut, null);
		ds = dsOut.value;
		
		
		proxy.updateData("RedMart", ds, false, true, null, null, dsOut, null, null);
		System.out.println("Line added, checkout the prices");
		
		
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


	private void changeUnitPrice(SalesOrderDataSetTypeOrderDtl detail) {
		detail.setDocUnitPrice(new BigDecimal(10));
		detail.setDocDiscount(new BigDecimal(1));
		//detail.set
		
	}


	private void populateLineNew(SalesOrderDataSetTypeOrderDtl detail) {
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
	private void populateHeaderWithCustomer(SalesOrderDataSetType getNewOrderHedResult) {
		if(getNewOrderHedResult != null){
			SalesOrderDataSetTypeOrderHed orderHed = getNewOrderHedResult.getOrderHed().getSalesOrderDataSetTypeOrderHeds().get(0);
			orderHed.setOrderNum(0);
			//orderHed.setCustNum(15);
			orderHed.setCustomerCustID("33816");
			orderHed.setCompany("RedMart");
			orderHed.setTermsCode("N15");
			orderHed.setNeedByDate(getXMLDateForEpocTime());
			orderHed.setCurrencyCode("SGD");
			//orderHed.setBTCustNum(15);
			//orderHed.setShipToCustNum(15);
			
			//orderHed.setInPrice(true); // Without this tax-inclusive red box would not be shown up.
			
		}
	}
	
	
	private void changeShipTo(SalesOrderDataSetType ds) {
		if(ds != null){
			SalesOrderDataSetTypeOrderHed orderHed = ds.getOrderHed().getSalesOrderDataSetTypeOrderHeds().get(0);
			orderHed.setShipToNum("68060");
			//orderHed.setBTCustNum(15);
			//orderHed.setShipToCustNum(15);
			//orderHed.setInPrice(true);
			
		}
		
	}


	/**
	 * Method 1- create header and lines seperately, no ChangeSoldTo method invocation.
	 * @param proxy
	 */
	private void createSalesOrder(ISalesOrderService proxy) {
	
		SalesOrderDataSetType ds = new SalesOrderDataSetType();
		Holder<SalesOrderDataSetType> getNewOrderHedResult = new Holder<SalesOrderDataSetType>();
		proxy.getNewOrderHed("RedMart", ds, null, getNewOrderHedResult, null);
		populateHeader(getNewOrderHedResult.value);
		
		Holder<SalesOrderDataSetType> dsOut = new Holder<SalesOrderDataSetType>();
		proxy.updateData("RedMart", getNewOrderHedResult.value, false, true, null, null, dsOut, null, null);
		
		SalesOrderDataSetType ds1 =dsOut.value;
		SalesOrderDataSetTypeOrderHed head = ds1.getOrderHed().getSalesOrderDataSetTypeOrderHeds().get(0);
		System.out.println("OrderNum : " + head.getOrderNum());
		
		proxy.getNewOrderDtl("RedMart", ds1, head.getOrderNum(), null, dsOut, null);
		ds1 =dsOut.value;
		
		SalesOrderDataSetTypeOrderDtl detail = ds1.getOrderDtl().getSalesOrderDataSetTypeOrderDtls().get(0);
		populateLine(detail);
		
		//proxy.updateData("RedMart", ds1, false, true, null, null, dsOut, null, null);
		
		Holder<String> partNum = new Holder<String>();
		partNum.value="11225";
		
		Holder<String> uom = new Holder<String>();
		uom.value="EA";
		
		
		//proxy.changePartNumMaster("RedMart", partNum, null, null, uom, null, "A", null, null, null, null, null, null, ds1, null, dsOut, null, null, null, null, null, null, null, null, null, null, null, null);
		//proxy.changePartNum("RedMart", ds1, true, null, null, dsOut, null);
		//ds1 =dsOut.value;
		
		
		proxy.changeSellingQuantity("RedMart", ds1, false, new BigDecimal(5), null, dsOut, null, null);
		ds1 =dsOut.value;

		proxy.changeUnitPrice("RedMart", ds1, null, dsOut, null);
		ds1 =dsOut.value;
		
		proxy.updateData("RedMart", ds1, false, true, null, null, dsOut, null, null);
		ds1 =dsOut.value;
		
		System.out.println("Line added !");
		
	}






	
	

	/**
	 * Without
	 * @param getNewOrderHedResult
	 */
	private void populateHeader(SalesOrderDataSetType getNewOrderHedResult) {
		if(getNewOrderHedResult != null){
			SalesOrderDataSetTypeOrderHed orderHed = getNewOrderHedResult.getOrderHed().getSalesOrderDataSetTypeOrderHeds().get(0);
			orderHed.setOrderNum(0);
			orderHed.setCustNum(83);
			//orderHed.setCustomerCustID("33408");
			orderHed.setCompany("RedMart");
			orderHed.setTermsCode("N15");
			orderHed.setNeedByDate(getXMLDateForEpocTime());
			orderHed.setCurrencyCode("SGD");
			orderHed.setBTCustNum(83);
			orderHed.setShipToCustNum(83);
			orderHed.setInPrice(true); // Without this tax-inclusive red box would not be shown up.
			
		}
	}

	private void populateLine(SalesOrderDataSetTypeOrderDtl detail) {
		detail.setCompany("RedMart");
		detail.setPartNum("11225");
		detail.setLineDesc("Coca-Cola Zero");
		//detail.setDocUnitPrice(getNetValue("8.50"));
		detail.setDocUnitPrice(new BigDecimal(10));
		detail.setDocDiscount(new BigDecimal(0));
		detail.setOrderLine(1);
		detail.setSalesUM("EA");
		detail.setIUM("EA");
		detail.setSellingQuantity(new BigDecimal(1));
		detail.setNeedByDate(getXMLDateForEpocTime());
		//detail.setDemandQuantity(new BigDecimal(1));
		detail.setInPrice(true);
		
	}
	
	
	
	public static BigDecimal getNetValue(String price) {
		//logger.info("Gross Price : " + price);
		if(price != null){
			Double stdUnitPrice = Double.valueOf(price);
			stdUnitPrice = (stdUnitPrice/1.07);
			BigDecimal netPrice = new BigDecimal(stdUnitPrice);
			netPrice = netPrice.setScale(2, RoundingMode.HALF_EVEN); // Rounded to two decimal placess after calculating the net prices.
			//logger.info("Net Price : " + netPrice);
			return netPrice;
		}
		return null;
		
	}
	


	private SalesOrderDataSetType populateSOForUpdate(int orderNum) {
		
		//response.setTermsCode("N30");
		SalesOrderDataSetType soUpdType = new SalesOrderDataSetType();
		ArrayOfSalesOrderDataSetTypeOrderHed orderHeds = new ArrayOfSalesOrderDataSetTypeOrderHed();
		SalesOrderDataSetTypeOrderHed orderHed = new SalesOrderDataSetTypeOrderHed();
		
		orderHed.setOrderNum(orderNum);
		orderHed.setCompany("RedMart");
		orderHed.setCustNum(677);
		orderHed.setCustomerCustID("40760");
		//orderHed.setOrderNum(orderNum);
		//orderHed.setCustNum(6778);
		//orderHed.setCurrencyCode("SGD");
		//orderHed.setTermsCode("N15");
		//orderHed.setCustomerCustID("40760");
		//orderHed.
		
		orderHed.setTermsCode("N15");
		orderHed.setNeedByDate(getXMLDateForEpocTime());
		
		
		ArrayOfSalesOrderDataSetTypeOrderDtl details = new ArrayOfSalesOrderDataSetTypeOrderDtl();
		SalesOrderDataSetTypeOrderDtl detail1 = new SalesOrderDataSetTypeOrderDtl();
		detail1.setCompany("RedMart");
		detail1.setPartNum("9530");
		//detail1.setRowMod("U");
		//detail1.setLineDesc("Coca-Cola Zero");
		//detail1.setLockQty(Boolean.FALSE);
		detail1.setOrderNum(orderNum);
		detail1.setSalesUM("IP");
		detail1.setOrderLine(4);
		detail1.setSellingQuantity(new BigDecimal(22));
		detail1.setNeedByDate(getXMLDateForEpocTime());
		detail1.setDemandQuantity(new BigDecimal(22));
		
		details.getSalesOrderDataSetTypeOrderDtls().add(detail1);
		orderHeds.getSalesOrderDataSetTypeOrderHeds().add(orderHed);
		
		// Set into the request
		soUpdType.setOrderHed(orderHeds);
		soUpdType.setOrderDtl(details);
		return soUpdType;
	}





	private void updateSalesOrder() {
		
		System.out.println("Updating sales order ");
		
		SalesOrderService soService = new SalesOrderService();
		ISalesOrderService proxy = soService.getWSHttpBindingISalesOrderService(new AddressingFeature(true, false));
		
		
		//SalesOrderDataSetType salesOrderData = populateSalesOrderData();
		//UpdExtSalesOrderDataSetType soType = populateUpdateSo();
		
		SalesOrderDataSetType salesOrderData = populateSalesOrderDataForMasterUpdate();

		proxy.masterUpdate("RedMart", Boolean.FALSE, "OrderDtl", 10, 2116, Boolean.FALSE, salesOrderData, null, null, null, null, null, null, null, null);
		//proxy.update("RedMart", soType, false, false, null, null, null, null, null);
		System.out.println("Sales order updated in E9");
		
		
	}



	private UpdExtSalesOrderDataSetType populateUpdateSo(int orderNum) {
		
		UpdExtSalesOrderDataSetType salesOrderData = new UpdExtSalesOrderDataSetType();
		//salesOrderData.setOrderDtl(value)
		
		//============Set Header =============================
		ArrayOfUpdExtSalesOrderDataSetTypeOrderHed orderHedHolder = new ArrayOfUpdExtSalesOrderDataSetTypeOrderHed();
		UpdExtSalesOrderDataSetTypeOrderHed orderHed = new UpdExtSalesOrderDataSetTypeOrderHed();
		//orderHed.setOrderAmt(BigDecimal.TEN);
		orderHed.setCustNum(677);
		orderHed.setCompany("RedMart");
		orderHed.setCurrencyCode("SGD");
		orderHed.setTermsCode("N15");
		orderHed.setOrderNum(orderNum);
		orderHed.setCustomerCustID("40760");
		
		//orderHed.setNeedByDate();
		

		//orderHedHolder.getSalesOrderDataSetTypeOrderHeds().add(orderHed);
		
		//===============Set Details =========================
		ArrayOfUpdExtSalesOrderDataSetTypeOrderDtl details = new ArrayOfUpdExtSalesOrderDataSetTypeOrderDtl();
		UpdExtSalesOrderDataSetTypeOrderDtl detail1 = new UpdExtSalesOrderDataSetTypeOrderDtl();
		detail1.setCompany("RedMart");
		//detail1.setLineDesc("Coca-Cola Zero");
		//detail1.setLockQty(Boolean.FALSE);
		detail1.setOrderNum(orderNum);
		detail1.setSalesUM("IP");
		detail1.setOrderLine(1);
		detail1.setPartNum("5427");
		detail1.setSellingQuantity(new BigDecimal(17));
		detail1.setNeedByDate(getXMLDateForEpocTime());
		detail1.setDemandQuantity(new BigDecimal(17));
		
		
		
		SalesOrderDataSetTypeOrderDtl detail2 = new SalesOrderDataSetTypeOrderDtl();
		detail2.setCompany("RedMart");
		detail2.setPartNum("5563");
		//detail1.setLineDesc("Coca-Cola Zero");
		//detail1.setLockQty(Boolean.FALSE);
		detail2.setOrderNum(0);
		detail2.setSalesUM("EA");
		detail2.setOrderLine(0);
		detail2.setSellingQuantity(BigDecimal.TEN);
		detail2.setNeedByDate(getXMLDateForEpocTime());
		detail2.setDemandQuantity(BigDecimal.TEN);
		
		
		details.getUpdExtSalesOrderDataSetTypeOrderDtls().add(detail1);
		//details.getSalesOrderDataSetTypeOrderDtls().add(detail2);
		
		salesOrderData.setOrderHed(orderHedHolder);
		salesOrderData.setOrderDtl(details);
		//salesOrderData.set
		return salesOrderData;
	}





	private SalesOrderDataSetType populateSalesOrderData() {
		SalesOrderDataSetType salesOrderData = new SalesOrderDataSetType();
		//salesOrderData.setOrderDtl(value)
		
		//============Set Header =============================
		ArrayOfSalesOrderDataSetTypeOrderHed orderHedHolder = new ArrayOfSalesOrderDataSetTypeOrderHed();
		SalesOrderDataSetTypeOrderHed orderHed = new SalesOrderDataSetTypeOrderHed();
		orderHed.setOrderAmt(BigDecimal.TEN);
		//orderHed.setCustNum(0);
		orderHed.setCompany("RedMart");
		orderHed.setCurrencyCode("SGD");
		orderHed.setTermsCode("N15");
		orderHed.setCustomerCustID("40760");
		orderHed.setOrderNum(0);
		//orderHed.setNeedByDate();
		

		orderHedHolder.getSalesOrderDataSetTypeOrderHeds().add(orderHed);
		
		//===============Set Details =========================
		ArrayOfSalesOrderDataSetTypeOrderDtl details = new ArrayOfSalesOrderDataSetTypeOrderDtl();
		SalesOrderDataSetTypeOrderDtl detail1 = new SalesOrderDataSetTypeOrderDtl();
		detail1.setCompany("RedMart");
		detail1.setPartNum("5427");
		//detail1.setLineDesc("Coca-Cola Zero");
		//detail1.setLockQty(Boolean.FALSE);
		detail1.setOrderNum(0);
		detail1.setSalesUM("IP");
		detail1.setOrderLine(1);
		detail1.setSellingQuantity(new BigDecimal(15));
		detail1.setNeedByDate(getXMLDateForEpocTime());
		detail1.setDemandQuantity(new BigDecimal(15));
		
		
		
//		SalesOrderDataSetTypeOrderDtl detail2 = new SalesOrderDataSetTypeOrderDtl();
//		detail2.setCompany("RedMart");
//		detail2.setPartNum("5563");
//		//detail1.setLineDesc("Coca-Cola Zero");
//		//detail1.setLockQty(Boolean.FALSE);
//		detail2.setOrderNum(0);
//		detail2.setSalesUM("EA");
//		detail2.setOrderLine(0);
//		detail2.setSellingQuantity(BigDecimal.TEN);
//		detail2.setNeedByDate(getXMLDateForEpocTime());
//		detail2.setDemandQuantity(BigDecimal.TEN);
		
		//detail1.setCustNumCustID("40760");
		//detail1.setOrderNum(2052);
		//detail1.setWarehouseCode("JT");
		//detail1.setPartNumIUM("EA");
		//detail1.setre
		
		details.getSalesOrderDataSetTypeOrderDtls().add(detail1);
		//details.getSalesOrderDataSetTypeOrderDtls().add(detail2);
		
		salesOrderData.setOrderHed(orderHedHolder);
		salesOrderData.setOrderDtl(details);
		//salesOrderData.set
		return salesOrderData;
	}

	
	
	private SalesOrderDataSetType populateSalesOrderDataForMasterUpdate() {
		SalesOrderDataSetType salesOrderData = new SalesOrderDataSetType();
		//salesOrderData.setOrderDtl(value)
		
		//============Set Header =============================
		ArrayOfSalesOrderDataSetTypeOrderHed orderHeds = new ArrayOfSalesOrderDataSetTypeOrderHed();
		SalesOrderDataSetTypeOrderHed orderHed = new SalesOrderDataSetTypeOrderHed();
		orderHed.setOrderAmt(BigDecimal.TEN);
		orderHed.setCustNum(677);
		orderHed.setCompany("RedMart");
		orderHed.setCurrencyCode("SGD");
		orderHed.setTermsCode("N15");
		orderHed.setCustomerCustID("40760");
		orderHed.setOrderNum(2116);
		//orderHed.setNeedByDate();
		

		orderHeds.getSalesOrderDataSetTypeOrderHeds().add(orderHed);
		
		//===============Set Details =========================
		ArrayOfSalesOrderDataSetTypeOrderDtl details = new ArrayOfSalesOrderDataSetTypeOrderDtl();
		SalesOrderDataSetTypeOrderDtl detail1 = new SalesOrderDataSetTypeOrderDtl();
		detail1.setCompany("RedMart");
		detail1.setPartNum("5427");
		detail1.setCustNum(677);
		//detail1.setLineDesc("Coca-Cola Zero");
		//detail1.setLockQty(Boolean.FALSE);
		detail1.setOrderNum(2116);
		detail1.setSalesUM("IP");
		//detail1.setOrderLine(1);
		detail1.setSellingQuantity(new BigDecimal(15));
		detail1.setNeedByDate(getXMLDateForEpocTime());
		detail1.setDemandQuantity(new BigDecimal(15));
		

		details.getSalesOrderDataSetTypeOrderDtls().add(detail1);
		//details.getSalesOrderDataSetTypeOrderDtls().add(detail2);
		
		salesOrderData.setOrderHed(orderHeds);
		salesOrderData.setOrderDtl(details);
		//salesOrderData.set
		return salesOrderData;
	}
	
	
	private SalesOrderDataSetType populateSalesOrderDataUpdate() {
		SalesOrderDataSetType salesOrderData = new SalesOrderDataSetType();
		//salesOrderData.setOrderDtl(value)
		
		//============Set Header =============================
		ArrayOfSalesOrderDataSetTypeOrderHed orderHedHolder = new ArrayOfSalesOrderDataSetTypeOrderHed();
		SalesOrderDataSetTypeOrderHed orderHed = new SalesOrderDataSetTypeOrderHed();
		//orderHed.setOrderAmt(BigDecimal.TEN);
		//orderHed.setCustNum(41424);
		orderHed.setCompany("RedMart");
		orderHed.setCurrencyCode("SGD");
		orderHed.setTermsCode("N30");
		orderHed.setCustomerCustID("40760");
		orderHed.setOrderNum(0);
		orderHed.setNeedByDate(getXMLDateForEpocTime());
		orderHed.setShipToNum("73975");
		

		orderHedHolder.getSalesOrderDataSetTypeOrderHeds().add(orderHed);
		
		//===============Set Details =========================
		ArrayOfSalesOrderDataSetTypeOrderDtl details = new ArrayOfSalesOrderDataSetTypeOrderDtl();
		SalesOrderDataSetTypeOrderDtl detail1 = new SalesOrderDataSetTypeOrderDtl();
		detail1.setCompany("RedMart");
		detail1.setPartNum("5427");
		//detail1.setLineDesc("Coca-Cola Zero");
		//detail1.setLockQty(Boolean.FALSE);
		detail1.setOrderNum(0);
		detail1.setSalesUM("IP");
		detail1.setOrderLine(1);
		detail1.setSellingQuantity(BigDecimal.TEN);
		detail1.setNeedByDate(getXMLDateForEpocTime());
		detail1.setDemandQuantity(BigDecimal.TEN);
		
		
		
		SalesOrderDataSetTypeOrderDtl detail2 = new SalesOrderDataSetTypeOrderDtl();
		detail2.setCompany("RedMart");
		detail2.setPartNum("5563");
		//detail1.setLineDesc("Coca-Cola Zero");
		//detail1.setLockQty(Boolean.FALSE);
		detail2.setOrderNum(0);
		detail2.setSalesUM("EA");
		detail2.setOrderLine(2);
		detail2.setSellingQuantity(BigDecimal.TEN);
		detail2.setNeedByDate(getXMLDateForEpocTime());
		detail2.setDemandQuantity(BigDecimal.TEN);
		
		
		SalesOrderDataSetTypeOrderDtl detail3 = new SalesOrderDataSetTypeOrderDtl();
		detail3.setCompany("RedMart");
		detail3.setPartNum("7791");
		//detail1.setLineDesc("Coca-Cola Zero");
		//detail1.setLockQty(Boolean.FALSE);
		detail3.setOrderNum(0);
		detail3.setSalesUM("CS");
		detail3.setOrderLine(3);
		detail3.setSellingQuantity(BigDecimal.TEN);
		detail3.setNeedByDate(getXMLDateForEpocTime());
		detail3.setDemandQuantity(BigDecimal.TEN);
		
		
		details.getSalesOrderDataSetTypeOrderDtls().add(detail1);
		details.getSalesOrderDataSetTypeOrderDtls().add(detail2);
		details.getSalesOrderDataSetTypeOrderDtls().add(detail3);
		
		salesOrderData.setOrderHed(orderHedHolder);
		salesOrderData.setOrderDtl(details);
		//salesOrderData.set
		return salesOrderData;
	}

	
	
	public static void main(String[] args){
		new SalesOrderServiceTest();
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
	
	
	
	
	private void populateTheLine(SalesOrderDataSetTypeOrderDtl line) {
		
		line.setCompany("RedMart");
		line.setPartNum("9530");
		line.setLineDesc("Coca-Cola Zero");
		line.setLockQty(Boolean.FALSE);
		line.setBasePartNum("9530");
		line.setOrderQty(BigDecimal.TEN);
		line.setSellingQuantity(BigDecimal.TEN);
		line.setSalesUM("IP");
	}

	private void populateSalesOrderItemNew(SalesOrderDataSetType resultOrderType) {
		// TODO Auto-generated method stub
		ArrayOfSalesOrderDataSetTypeOrderDtl details = new ArrayOfSalesOrderDataSetTypeOrderDtl();
		SalesOrderDataSetTypeOrderDtl detail1 = new SalesOrderDataSetTypeOrderDtl();
		detail1.setCompany("RedMart");
		detail1.setPartNum("5427");
		detail1.setLineDesc("Coca-Cola Zero");
		detail1.setLockQty(Boolean.FALSE);
		//detail1.setCustNumCustID("38732");
		//detail1.setOrderNum(2052);
		//detail1.setWarehouseCode("JT");
		//detail1.setPartNumIUM("EA");
		//detail1.setre
		
		details.getSalesOrderDataSetTypeOrderDtls().add(detail1);
		resultOrderType.setOrderDtl(details);
		//return salesOrderData;
		
	}
	
	
	

	private SalesOrderDataSetType populateSalesOrderItem() {
		
		SalesOrderDataSetType salesOrderData = new SalesOrderDataSetType();
		ArrayOfSalesOrderDataSetTypeOrderDtl details = new ArrayOfSalesOrderDataSetTypeOrderDtl();
		SalesOrderDataSetTypeOrderDtl detail1 = new SalesOrderDataSetTypeOrderDtl();
		detail1.setCompany("RedMart");
		detail1.setPartNum("5427");
		detail1.setLineDesc("Coca-Cola Zero");
		detail1.setLockQty(Boolean.FALSE);
		//detail1.setCustNumCustID("38732");
		//detail1.setOrderNum(2052);
		//detail1.setWarehouseCode("JT");
		//detail1.setPartNumIUM("EA");
		//detail1.setre
		
		details.getSalesOrderDataSetTypeOrderDtls().add(detail1);
		salesOrderData.setOrderDtl(details);
		return salesOrderData;
	}
	
	
	
	
//	ArrayOfSalesOrderDataSetTypeOrderHed holder = response.getOrderHed();
//	List<SalesOrderDataSetTypeOrderHed> heads = holder.getSalesOrderDataSetTypeOrderHeds();
//	SalesOrderDataSetTypeOrderHed hd = heads.get(0);
//	
//	System.out.println("Order number of the new order : " + hd.getOrderNum());
//	
//	SalesOrderDataSetType ds = new SalesOrderDataSetType(); //populateSalesOrderItem(); 
//	
//	Holder<SalesOrderDataSetType> result = new Holder<SalesOrderDataSetType>();
//	CallContextDataSetType contextType= new CallContextDataSetType();
//	proxy.getNewOrderDtl("RedMart", ds, hd.getOrderNum(), contextType, result, null);
//	
//	SalesOrderDataSetType resultOrderType = result.value;
//	ArrayOfSalesOrderDataSetTypeOrderDtl returnedDetails =  resultOrderType.getOrderDtl();
//	SalesOrderDataSetTypeOrderDtl line = returnedDetails.getSalesOrderDataSetTypeOrderDtls().get(0); // retuned line
//	
//	populateTheLine(line);
//	//populateSalesOrderItemNew(resultOrderType);
//	
//	SalesOrderDataSetType resultOrderType4 = populateSalesOrderItem();
//	
//	Holder<String> partNum = new Holder<String>("5427");
//	Holder<Boolean> bHolder = new Holder<Boolean>(Boolean.FALSE);
//	
//	Holder<SalesOrderDataSetType> changePartNumMasterResult = new Holder<SalesOrderDataSetType>();
//	//proxy.changePartNumMaster("RedMart", null, bHolder, bHolder, new Holder<String>("IP"), "6", null, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, resultOrderType, contextType, changePartNumMasterResult, null, null, null, null, null, null,null, null, null, null, null, null);
//	
//	System.out.println("Obtained a new line");
//	
//	SalesOrderDataSetType finalSo = changePartNumMasterResult.value;
//	
//	proxy.masterUpdate("RedMart", Boolean.TRUE, "OrderDtl", hd.getCustNum(), hd.getOrderNum(), Boolean.TRUE, resultOrderType, null, null, null, null, null, null, null, null);
//	System.out.println("response received for item update, check the order" + hd.getOrderNum());
	
	//proxy.update(loginOptions, ds, continueProcessingOnError, rollbackParentOnChildError, callContext, updateResult, dsOut, errorsOccurred, callContextOut);

}
