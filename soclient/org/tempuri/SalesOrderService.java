
package org.tempuri;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFactory;
import javax.xml.ws.Binding;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.handler.Handler;

import com.redmart.epicor.integ.SecurityHandler;
import com.sun.xml.internal.ws.api.message.Header;
import com.sun.xml.internal.ws.api.message.Headers;
import com.sun.xml.internal.ws.developer.WSBindingProvider;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.2.4-b01 Generated
 * source version: 2.2
 * 
 */
@WebServiceClient(name = "SalesOrderService", targetNamespace = "http://tempuri.org/", wsdlLocation = "https://redmarterp/EpicorWCFServices/SalesOrderService.svc?wsdl")
public class SalesOrderService extends Service {

	private final static URL SALESORDERSERVICE_WSDL_LOCATION;
	private final static WebServiceException SALESORDERSERVICE_EXCEPTION;
	private final static QName SALESORDERSERVICE_QNAME = new QName("http://tempuri.org/", "SalesOrderService");

	static {
		URL baseUrl;
		URL url = null;
		baseUrl = org.tempuri.SalesOrderService.class.getResource(".");
		try {
			url = new URL(baseUrl, "https://redmarterp/EpicorWCFServices/SalesOrderService.svc?wsdl");
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		SALESORDERSERVICE_WSDL_LOCATION = url; // org.tempuri.SalesOrderService.class.getClassLoader().getResource("https://redmarterp/EpicorWCFServices/SalesOrderService.svc?wsdl");
		WebServiceException e = null;
		if (SALESORDERSERVICE_WSDL_LOCATION == null) {
			e = new WebServiceException(
					"Cannot find 'META-INF/wsdl/SalesOrderService.wsdl' wsdl. Place the resource correctly in the classpath.");
		}
		SALESORDERSERVICE_EXCEPTION = e;
	}

	public SalesOrderService() {
		super(__getWsdlLocation(), SALESORDERSERVICE_QNAME);
	}

	public SalesOrderService(WebServiceFeature... features) {
		super(__getWsdlLocation(), SALESORDERSERVICE_QNAME, features);
	}

	public SalesOrderService(URL wsdlLocation) {
		super(wsdlLocation, SALESORDERSERVICE_QNAME);
	}

	public SalesOrderService(URL wsdlLocation, WebServiceFeature... features) {
		super(wsdlLocation, SALESORDERSERVICE_QNAME, features);
	}

	public SalesOrderService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public SalesOrderService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
		super(wsdlLocation, serviceName, features);
	}

	/**
	 * 
	 * @return returns ISalesOrderService
	 */
	@WebEndpoint(name = "WSHttpBinding_ISalesOrderService")
	public ISalesOrderService getWSHttpBindingISalesOrderService() {

		String SECURITY_NS = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";
		String PASSWORD_TYPE = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText";
		String AUTH_PREFIX = "wss";
		
		
		ISalesOrderService port = super.getPort(new QName("http://tempuri.org/", "WSHttpBinding_ISalesOrderService"),
				ISalesOrderService.class);
		
		try {
			SOAPFactory soapFactory = SOAPFactory.newInstance();
			SOAPElement security = soapFactory.createElement("Security", AUTH_PREFIX, SECURITY_NS);
			SOAPElement uToken = soapFactory.createElement("UsernameToken", AUTH_PREFIX, SECURITY_NS);
			SOAPElement username = soapFactory.createElement("Username", AUTH_PREFIX, SECURITY_NS);
			username.addTextNode("manager");

			SOAPElement pass = soapFactory.createElement("Password", AUTH_PREFIX, SECURITY_NS);
			pass.addAttribute(new QName("Type"), PASSWORD_TYPE);
			pass.addTextNode("manager");

			uToken.addChildElement(username);
			uToken.addChildElement(pass);
			security.addChildElement(uToken);

			Header header = Headers.create(security);
			((WSBindingProvider) port).setOutboundHeaders(header);

			// now, call webservice

		} catch (SOAPException ex) {
			ex.printStackTrace();
		}

		return port;

	}

	/**
	 * 
	 * @param features
	 *            A list of {@link javax.xml.ws.WebServiceFeature} to configure
	 *            on the proxy. Supported features not in the
	 *            <code>features</code> parameter will have their default
	 *            values.
	 * @return returns ISalesOrderService
	 */
	@WebEndpoint(name = "WSHttpBinding_ISalesOrderService")
	public ISalesOrderService getWSHttpBindingISalesOrderService(WebServiceFeature... features) {
		
		ISalesOrderService port = super.getPort(new QName("http://tempuri.org/", "WSHttpBinding_ISalesOrderService"),
				ISalesOrderService.class, features);
		
		//((BindingProvider)port).getRequestContext().put(BindingProvider.USERNAME_PROPERTY,"manager");	//Request timeout in 20 seconds
        //((BindingProvider) port).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "manager"); // Connection timeout in 20 seconds
		
		final Binding binding = ((BindingProvider) port).getBinding();
		List<Handler> handlerList = binding.getHandlerChain();
		if (handlerList == null)
		    handlerList = new ArrayList<Handler>();

		handlerList.add(new SecurityHandler());
		binding.setHandlerChain(handlerList);
		
//		String SECURITY_NS = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";
//		String PASSWORD_TYPE = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText";
//		String AUTH_PREFIX = "wsse";
//		
//
//		
//		try {
//			SOAPFactory soapFactory = SOAPFactory.newInstance();
//			SOAPElement security = soapFactory.createElement("Security", AUTH_PREFIX, SECURITY_NS);
//			SOAPElement uToken = soapFactory.createElement("UsernameToken", AUTH_PREFIX, SECURITY_NS);
//			SOAPElement username = soapFactory.createElement("Username", AUTH_PREFIX, SECURITY_NS);
//			username.addTextNode("manager");
//
//			SOAPElement pass = soapFactory.createElement("Password", AUTH_PREFIX, SECURITY_NS);
//			pass.addAttribute(new QName("Type"), PASSWORD_TYPE);
//			pass.addTextNode("manager");
//
//			uToken.addChildElement(username);
//			uToken.addChildElement(pass);
//			security.addChildElement(uToken);
//
//			Header header = Headers.create(security);
//			((WSBindingProvider) port).setOutboundHeaders(header);
//
//			// now, call webservice
//
//		} catch (SOAPException ex) {
//			ex.printStackTrace();
//		}

		return port;
	}

	private static URL __getWsdlLocation() {
		if (SALESORDERSERVICE_EXCEPTION != null) {
			throw SALESORDERSERVICE_EXCEPTION;
		}
		return SALESORDERSERVICE_WSDL_LOCATION;
	}

}
