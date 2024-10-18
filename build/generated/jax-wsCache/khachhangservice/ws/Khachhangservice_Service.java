
package ws;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "khachhangservice", targetNamespace = "http://ws/", wsdlLocation = "http://localhost:8080/test4/khachhangservice?WSDL")
public class Khachhangservice_Service
    extends Service
{

    private final static URL KHACHHANGSERVICE_WSDL_LOCATION;
    private final static WebServiceException KHACHHANGSERVICE_EXCEPTION;
    private final static QName KHACHHANGSERVICE_QNAME = new QName("http://ws/", "khachhangservice");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/test4/khachhangservice?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        KHACHHANGSERVICE_WSDL_LOCATION = url;
        KHACHHANGSERVICE_EXCEPTION = e;
    }

    public Khachhangservice_Service() {
        super(__getWsdlLocation(), KHACHHANGSERVICE_QNAME);
    }

    public Khachhangservice_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), KHACHHANGSERVICE_QNAME, features);
    }

    public Khachhangservice_Service(URL wsdlLocation) {
        super(wsdlLocation, KHACHHANGSERVICE_QNAME);
    }

    public Khachhangservice_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, KHACHHANGSERVICE_QNAME, features);
    }

    public Khachhangservice_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Khachhangservice_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Khachhangservice
     */
    @WebEndpoint(name = "khachhangservicePort")
    public Khachhangservice getKhachhangservicePort() {
        return super.getPort(new QName("http://ws/", "khachhangservicePort"), Khachhangservice.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Khachhangservice
     */
    @WebEndpoint(name = "khachhangservicePort")
    public Khachhangservice getKhachhangservicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "khachhangservicePort"), Khachhangservice.class, features);
    }

    private static URL __getWsdlLocation() {
        if (KHACHHANGSERVICE_EXCEPTION!= null) {
            throw KHACHHANGSERVICE_EXCEPTION;
        }
        return KHACHHANGSERVICE_WSDL_LOCATION;
    }

}