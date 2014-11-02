package com.redmart.epicor.integ;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import com.sun.xml.internal.ws.wsdl.writer.document.soap12.SOAPFault;

public final class SecurityHandler implements SOAPHandler<SOAPMessageContext> {


	/**
	 * Set WS-Security
	 */
    @Override
    public boolean handleMessage(final SOAPMessageContext msgCtx) {
    	System.out.println("Inside handleMessage");
        // Indicator telling us which direction this message is going in
        final Boolean outInd = (Boolean) msgCtx.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

        // Handler must only add security headers to outbound messages
        if (outInd.booleanValue()) {
            try {
                // Get the SOAP Envelope
                final SOAPEnvelope envelope = msgCtx.getMessage().getSOAPPart().getEnvelope();

                // Header may or may not exist yet
                SOAPHeader header = envelope.getHeader();
                if (header == null)
                    header = envelope.addHeader();

                // Add WSS Usertoken Element Tree 
                final SOAPElement security = header.addChildElement("Security", "wsse",
                        "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
                final SOAPElement userToken = security.addChildElement("UsernameToken", "wsse");
                userToken.addChildElement("Username", "wsse").addTextNode("Ecommerce");
                userToken.addChildElement("Password", "wsse").addTextNode("!Ecommerce!");

            } catch (final Exception e) {
                System.out.println("Exception occurred : " + e.toString());
                return false;
            }
        }
        return true;
    }

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		System.out.println("Soap fault occurred");
		SOAPMessage msg = context.getMessage(); 
        SOAPBody body;
		try {
			body = msg.getSOAPBody();
			javax.xml.soap.SOAPFault fault = body.getFault();
			System.out.println("Fault code : " + body.getFault().getFaultCode());
			System.out.println("Reason : " + body.getFault().getFaultReasonText(Locale.forLanguageTag("en-US")));
		} catch (SOAPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		
		
		return false;
	}

	@Override
	public void close(MessageContext context) {
		System.out.println("context is called !");
		
	}

	/**
	 * Just to avoid the exception - Headers must be understood - Security
	 */
	@Override
	public Set<QName> getHeaders() {
		final QName securityHeader = new QName(
	            "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd",
	            "Security",
	            "wsse");
	 
	        // ... "understand" the response, very complex logic goes here
	        // ... "understand" the response, very complex logic goes here
	        // ... "understand" the response, very complex logic goes here
	 
	        final HashSet headers = new HashSet();
	        headers.add(securityHeader);
	 
	        // notify the runtime that this is handled
	        return headers;
	}


    // Other required methods on interface need no guts
}
