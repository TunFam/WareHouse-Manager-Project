
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

    private final static QName _AddKhachhang_QNAME = new QName("http://ws/", "add_khachhang");
    private final static QName _GetAllKhachhangResponse_QNAME = new QName("http://ws/", "getAll_khachhangResponse");
    private final static QName _DeleteKhachhang_QNAME = new QName("http://ws/", "delete_khachhang");
    private final static QName _GetAllKhachhang_QNAME = new QName("http://ws/", "getAll_khachhang");
    private final static QName _FindKhachhang_QNAME = new QName("http://ws/", "Find_khachhang");
    private final static QName _Update_QNAME = new QName("http://ws/", "Update");
    private final static QName _FindKhachhangResponse_QNAME = new QName("http://ws/", "Find_khachhangResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddKhachhang }
     * 
     */
    public AddKhachhang createAddKhachhang() {
        return new AddKhachhang();
    }

    /**
     * Create an instance of {@link GetAllKhachhangResponse }
     * 
     */
    public GetAllKhachhangResponse createGetAllKhachhangResponse() {
        return new GetAllKhachhangResponse();
    }

    /**
     * Create an instance of {@link DeleteKhachhang }
     * 
     */
    public DeleteKhachhang createDeleteKhachhang() {
        return new DeleteKhachhang();
    }

    /**
     * Create an instance of {@link GetAllKhachhang }
     * 
     */
    public GetAllKhachhang createGetAllKhachhang() {
        return new GetAllKhachhang();
    }

    /**
     * Create an instance of {@link FindKhachhang }
     * 
     */
    public FindKhachhang createFindKhachhang() {
        return new FindKhachhang();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link FindKhachhangResponse }
     * 
     */
    public FindKhachhangResponse createFindKhachhangResponse() {
        return new FindKhachhangResponse();
    }

    /**
     * Create an instance of {@link Khachhangmodel }
     * 
     */
    public Khachhangmodel createKhachhangmodel() {
        return new Khachhangmodel();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddKhachhang }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "add_khachhang")
    public JAXBElement<AddKhachhang> createAddKhachhang(AddKhachhang value) {
        return new JAXBElement<AddKhachhang>(_AddKhachhang_QNAME, AddKhachhang.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllKhachhangResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAll_khachhangResponse")
    public JAXBElement<GetAllKhachhangResponse> createGetAllKhachhangResponse(GetAllKhachhangResponse value) {
        return new JAXBElement<GetAllKhachhangResponse>(_GetAllKhachhangResponse_QNAME, GetAllKhachhangResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteKhachhang }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "delete_khachhang")
    public JAXBElement<DeleteKhachhang> createDeleteKhachhang(DeleteKhachhang value) {
        return new JAXBElement<DeleteKhachhang>(_DeleteKhachhang_QNAME, DeleteKhachhang.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllKhachhang }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAll_khachhang")
    public JAXBElement<GetAllKhachhang> createGetAllKhachhang(GetAllKhachhang value) {
        return new JAXBElement<GetAllKhachhang>(_GetAllKhachhang_QNAME, GetAllKhachhang.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindKhachhang }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "Find_khachhang")
    public JAXBElement<FindKhachhang> createFindKhachhang(FindKhachhang value) {
        return new JAXBElement<FindKhachhang>(_FindKhachhang_QNAME, FindKhachhang.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "Update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindKhachhangResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "Find_khachhangResponse")
    public JAXBElement<FindKhachhangResponse> createFindKhachhangResponse(FindKhachhangResponse value) {
        return new JAXBElement<FindKhachhangResponse>(_FindKhachhangResponse_QNAME, FindKhachhangResponse.class, null, value);
    }

}
