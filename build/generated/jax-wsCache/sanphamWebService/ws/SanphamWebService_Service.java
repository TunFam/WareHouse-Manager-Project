
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
@WebServiceClient(name = "sanphamWebService", targetNamespace = "http://ws/", wsdlLocation = "http://localhost:8080/test4/sanphamWebService?WSDL")
public class SanphamWebService_Service
    extends Service
{

    private final static URL SANPHAMWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException SANPHAMWEBSERVICE_EXCEPTION;
    private final static QName SANPHAMWEBSERVICE_QNAME = new QName("http://ws/", "sanphamWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/test4/sanphamWebService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SANPHAMWEBSERVICE_WSDL_LOCATION = url;
        SANPHAMWEBSERVICE_EXCEPTION = e;
    }

    public SanphamWebService_Service() {
        super(__getWsdlLocation(), SANPHAMWEBSERVICE_QNAME);
    }

    public SanphamWebService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SANPHAMWEBSERVICE_QNAME, features);
    }

    public SanphamWebService_Service(URL wsdlLocation) {
        super(wsdlLocation, SANPHAMWEBSERVICE_QNAME);
    }

    public SanphamWebService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SANPHAMWEBSERVICE_QNAME, features);
    }

    public SanphamWebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SanphamWebService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SanphamWebService
     */
    @WebEndpoint(name = "sanphamWebServicePort")
    public SanphamWebService getSanphamWebServicePort() {
        return super.getPort(new QName("http://ws/", "sanphamWebServicePort"), SanphamWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SanphamWebService
     */
    @WebEndpoint(name = "sanphamWebServicePort")
    public SanphamWebService getSanphamWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "sanphamWebServicePort"), SanphamWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SANPHAMWEBSERVICE_EXCEPTION!= null) {
            throw SANPHAMWEBSERVICE_EXCEPTION;
        }
        return SANPHAMWEBSERVICE_WSDL_LOCATION;
    }

}