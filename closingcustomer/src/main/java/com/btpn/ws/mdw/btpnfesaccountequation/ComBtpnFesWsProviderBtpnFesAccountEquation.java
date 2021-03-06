
package com.btpn.ws.mdw.btpnfesaccountequation;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "com.btpn.fes.ws.provider.BtpnFesAccountEquation", targetNamespace = "http://APPMDWDEV03.dev.corp.btpn.co.id/com.btpn.fes.ws.provider:BtpnFesAccountEquation", wsdlLocation = "http://appmdwdev03.dev.corp.btpn.co.id:5555/ws/com.btpn.fes.ws.provider:BtpnFesAccountEquation?WSDL")
public class ComBtpnFesWsProviderBtpnFesAccountEquation
    extends Service
{

    private final static URL COMBTPNFESWSPROVIDERBTPNFESACCOUNTEQUATION_WSDL_LOCATION;
    private final static WebServiceException COMBTPNFESWSPROVIDERBTPNFESACCOUNTEQUATION_EXCEPTION;
    private final static QName COMBTPNFESWSPROVIDERBTPNFESACCOUNTEQUATION_QNAME = new QName("http://APPMDWDEV03.dev.corp.btpn.co.id/com.btpn.fes.ws.provider:BtpnFesAccountEquation", "com.btpn.fes.ws.provider.BtpnFesAccountEquation");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://appmdwdev03.dev.corp.btpn.co.id:5555/ws/com.btpn.fes.ws.provider:BtpnFesAccountEquation?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        COMBTPNFESWSPROVIDERBTPNFESACCOUNTEQUATION_WSDL_LOCATION = url;
        COMBTPNFESWSPROVIDERBTPNFESACCOUNTEQUATION_EXCEPTION = e;
    }

    public ComBtpnFesWsProviderBtpnFesAccountEquation() {
        super(__getWsdlLocation(), COMBTPNFESWSPROVIDERBTPNFESACCOUNTEQUATION_QNAME);
    }

    public ComBtpnFesWsProviderBtpnFesAccountEquation(WebServiceFeature... features) {
        super(__getWsdlLocation(), COMBTPNFESWSPROVIDERBTPNFESACCOUNTEQUATION_QNAME, features);
    }

    public ComBtpnFesWsProviderBtpnFesAccountEquation(URL wsdlLocation) {
        super(wsdlLocation, COMBTPNFESWSPROVIDERBTPNFESACCOUNTEQUATION_QNAME);
    }

    public ComBtpnFesWsProviderBtpnFesAccountEquation(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, COMBTPNFESWSPROVIDERBTPNFESACCOUNTEQUATION_QNAME, features);
    }

    public ComBtpnFesWsProviderBtpnFesAccountEquation(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ComBtpnFesWsProviderBtpnFesAccountEquation(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BtpnFesAccountEquationPortType
     */
    @WebEndpoint(name = "com_btpn_fes_ws_provider_BtpnFesAccountEquation_Port")
    public BtpnFesAccountEquationPortType getComBtpnFesWsProviderBtpnFesAccountEquationPort() {
        return super.getPort(new QName("http://APPMDWDEV03.dev.corp.btpn.co.id/com.btpn.fes.ws.provider:BtpnFesAccountEquation", "com_btpn_fes_ws_provider_BtpnFesAccountEquation_Port"), BtpnFesAccountEquationPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BtpnFesAccountEquationPortType
     */
    @WebEndpoint(name = "com_btpn_fes_ws_provider_BtpnFesAccountEquation_Port")
    public BtpnFesAccountEquationPortType getComBtpnFesWsProviderBtpnFesAccountEquationPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://APPMDWDEV03.dev.corp.btpn.co.id/com.btpn.fes.ws.provider:BtpnFesAccountEquation", "com_btpn_fes_ws_provider_BtpnFesAccountEquation_Port"), BtpnFesAccountEquationPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (COMBTPNFESWSPROVIDERBTPNFESACCOUNTEQUATION_EXCEPTION!= null) {
            throw COMBTPNFESWSPROVIDERBTPNFESACCOUNTEQUATION_EXCEPTION;
        }
        return COMBTPNFESWSPROVIDERBTPNFESACCOUNTEQUATION_WSDL_LOCATION;
    }

}
