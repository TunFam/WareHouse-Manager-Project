
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FindResponse_QNAME = new QName("http://ws/", "FindResponse");
    private final static QName _DeleteNv_QNAME = new QName("http://ws/", "delete_nv");
    private final static QName _GetDataResponse_QNAME = new QName("http://ws/", "get_dataResponse");
    private final static QName _Find_QNAME = new QName("http://ws/", "Find");
    private final static QName _GetData_QNAME = new QName("http://ws/", "get_data");
    private final static QName _InsertNv_QNAME = new QName("http://ws/", "insert_nv");
    private final static QName _UpdateNv_QNAME = new QName("http://ws/", "update_nv");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindResponse }
     * 
     */
    public FindResponse createFindResponse() {
        return new FindResponse();
    }

    /**
     * Create an instance of {@link DeleteNv }
     * 
     */
    public DeleteNv createDeleteNv() {
        return new DeleteNv();
    }

    /**
     * Create an instance of {@link GetDataResponse }
     * 
     */
    public GetDataResponse createGetDataResponse() {
        return new GetDataResponse();
    }

    /**
     * Create an instance of {@link Find }
     * 
     */
    public Find createFind() {
        return new Find();
    }

    /**
     * Create an instance of {@link GetData }
     * 
     */
    public GetData createGetData() {
        return new GetData();
    }

    /**
     * Create an instance of {@link InsertNv }
     * 
     */
    public InsertNv createInsertNv() {
        return new InsertNv();
    }

    /**
     * Create an instance of {@link UpdateNv }
     * 
     */
    public UpdateNv createUpdateNv() {
        return new UpdateNv();
    }

    /**
     * Create an instance of {@link Nhanvien }
     * 
     */
    public Nhanvien createNhanvien() {
        return new Nhanvien();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "FindResponse")
    public JAXBElement<FindResponse> createFindResponse(FindResponse value) {
        return new JAXBElement<FindResponse>(_FindResponse_QNAME, FindResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteNv }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "delete_nv")
    public JAXBElement<DeleteNv> createDeleteNv(DeleteNv value) {
        return new JAXBElement<DeleteNv>(_DeleteNv_QNAME, DeleteNv.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "get_dataResponse")
    public JAXBElement<GetDataResponse> createGetDataResponse(GetDataResponse value) {
        return new JAXBElement<GetDataResponse>(_GetDataResponse_QNAME, GetDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Find }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "Find")
    public JAXBElement<Find> createFind(Find value) {
        return new JAXBElement<Find>(_Find_QNAME, Find.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "get_data")
    public JAXBElement<GetData> createGetData(GetData value) {
        return new JAXBElement<GetData>(_GetData_QNAME, GetData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertNv }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "insert_nv")
    public JAXBElement<InsertNv> createInsertNv(InsertNv value) {
        return new JAXBElement<InsertNv>(_InsertNv_QNAME, InsertNv.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateNv }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "update_nv")
    public JAXBElement<UpdateNv> createUpdateNv(UpdateNv value) {
        return new JAXBElement<UpdateNv>(_UpdateNv_QNAME, UpdateNv.class, null, value);
    }

}
