
package com.btpn.ws.diasoft.corews;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@SuppressWarnings("serial")
@WebFault(name = "DSCALLFAULT", targetNamespace = "http://support.diasoft.ru")
public class DSCALLFAULT_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private DSCALLFAULT faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public DSCALLFAULT_Exception(String message, DSCALLFAULT faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public DSCALLFAULT_Exception(String message, DSCALLFAULT faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.btpn.ws.diasoft.corews.DSCALLFAULT
     */
    public DSCALLFAULT getFaultInfo() {
        return faultInfo;
    }

}
