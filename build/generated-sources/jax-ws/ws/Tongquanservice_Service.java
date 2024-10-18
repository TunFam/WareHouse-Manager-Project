
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
@WebServiceClient(name = "tongquanservice", targetNamespace = "http://ws/", wsdlLocation = "http://localhost:8080/test4/tongquanservice?WSDL")
public class Tongquanservice_Service
    extends Service
{

    private final static URL TONGQUANSERVICE_WSDL_LOCATION;
    private final static WebServiceException TONGQUANSERVICE_EXCEPTION;
    private final static QName TONGQUANSERVICE_QNAME = new QName("http://ws/", "tongquanservice");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/test4/tongquanservice?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TONGQUANSERVICE_WSDL_LOCATION = url;
        TONGQUANSERVICE_EXCEPTION = e;
    }

    public Tongquanservice_Service() {
        super(__getWsdlLocation(), TONGQUANSERVICE_QNAME);
    }

    public Tongquanservice_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), TONGQUANSERVICE_QNAME, features);
    }

    public Tongquanservice_Service(URL wsdlLocation) {
        super(wsdlLocation, TONGQUANSERVICE_QNAME);
    }

    public Tongquanservice_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TONGQUANSERVICE_QNAME, features);
    }

    public Tongquanservice_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Tongquanservice_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Tongquanservice
     */
    @WebEndpoint(name = "tongquanservicePort")
    public Tongquanservice getTongquanservicePort() {
        return super.getPort(new QName("http://ws/", "tongquanservicePort"), Tongquanservice.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Tongquanservice
     */
    @WebEndpoint(name = "tongquanservicePort")
    public Tongquanservice getTongquanservicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "tongquanservicePort"), Tongquanservice.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TONGQUANSERVICE_EXCEPTION!= null) {
            throw TONGQUANSERVICE_EXCEPTION;
        }
        return TONGQUANSERVICE_WSDL_LOCATION;
    }

}