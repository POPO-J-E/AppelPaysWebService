
/**
 * PaysServiceExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package fr.polytech.pays.ws;

public class PaysServiceExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1509614614248L;
    
    private fr.polytech.pays.ws.PaysServiceStub.PaysServiceException faultMessage;

    
        public PaysServiceExceptionException() {
            super("PaysServiceExceptionException");
        }

        public PaysServiceExceptionException(java.lang.String s) {
           super(s);
        }

        public PaysServiceExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public PaysServiceExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(fr.polytech.pays.ws.PaysServiceStub.PaysServiceException msg){
       faultMessage = msg;
    }
    
    public fr.polytech.pays.ws.PaysServiceStub.PaysServiceException getFaultMessage(){
       return faultMessage;
    }
}
    