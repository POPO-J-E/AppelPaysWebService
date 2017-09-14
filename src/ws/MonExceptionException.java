
/**
 * MonExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package ws;

public class MonExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1505377557506L;
    
    private ws.PaysServiceStub.MonExceptionE faultMessage;

    
        public MonExceptionException() {
            super("MonExceptionException");
        }

        public MonExceptionException(java.lang.String s) {
           super(s);
        }

        public MonExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public MonExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(ws.PaysServiceStub.MonExceptionE msg){
       faultMessage = msg;
    }
    
    public ws.PaysServiceStub.MonExceptionE getFaultMessage(){
       return faultMessage;
    }
}
    