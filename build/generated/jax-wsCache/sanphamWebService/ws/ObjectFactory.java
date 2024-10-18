
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

    private final static QName _FindSanpham_QNAME = new QName("http://ws/", "Find_sanpham");
    private final static QName _FindSanphamResponse_QNAME = new QName("http://ws/", "Find_sanphamResponse");
    private final static QName _Loc_QNAME = new QName("http://ws/", "loc");
    private final static QName _SaveSanpham_QNAME = new QName("http://ws/", "save_sanpham");
    private final static QName _GetAllDanhmucResponse_QNAME = new QName("http://ws/", "getAll_danhmucResponse");
    private final static QName _GetAllSanphamResponse_QNAME = new QName("http://ws/", "getAll_sanphamResponse");
    private final static QName _UpdateSanpham_QNAME = new QName("http://ws/", "update_sanpham");
    private final static QName _LocResponse_QNAME = new QName("http://ws/", "locResponse");
    private final static QName _DeleteSanpham_QNAME = new QName("http://ws/", "delete_sanpham");
    private final static QName _GetAllDanhmuc_QNAME = new QName("http://ws/", "getAll_danhmuc");
    private final static QName _GetAllSanpham_QNAME = new QName("http://ws/", "getAll_sanpham");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindSanpham }
     * 
     */
    public FindSanpham createFindSanpham() {
        return new FindSanpham();
    }

    /**
     * Create an instance of {@link FindSanphamResponse }
     * 
     */
    public FindSanphamResponse createFindSanphamResponse() {
        return new FindSanphamResponse();
    }

    /**
     * Create an instance of {@link Loc }
     * 
     */
    public Loc createLoc() {
        return new Loc();
    }

    /**
     * Create an instance of {@link SaveSanpham }
     * 
     */
    public SaveSanpham createSaveSanpham() {
        return new SaveSanpham();
    }

    /**
     * Create an instance of {@link GetAllDanhmucResponse }
     * 
     */
    public GetAllDanhmucResponse createGetAllDanhmucResponse() {
        return new GetAllDanhmucResponse();
    }

    /**
     * Create an instance of {@link GetAllSanphamResponse }
     * 
     */
    public GetAllSanphamResponse createGetAllSanphamResponse() {
        return new GetAllSanphamResponse();
    }

    /**
     * Create an instance of {@link UpdateSanpham }
     * 
     */
    public UpdateSanpham createUpdateSanpham() {
        return new UpdateSanpham();
    }

    /**
     * Create an instance of {@link LocResponse }
     * 
     */
    public LocResponse createLocResponse() {
        return new LocResponse();
    }

    /**
     * Create an instance of {@link DeleteSanpham }
     * 
     */
    public DeleteSanpham createDeleteSanpham() {
        return new DeleteSanpham();
    }

    /**
     * Create an instance of {@link GetAllDanhmuc }
     * 
     */
    public GetAllDanhmuc createGetAllDanhmuc() {
        return new GetAllDanhmuc();
    }

    /**
     * Create an instance of {@link GetAllSanpham }
     * 
     */
    public GetAllSanpham createGetAllSanpham() {
        return new GetAllSanpham();
    }

    /**
     * Create an instance of {@link Danhmuc }
     * 
     */
    public Danhmuc createDanhmuc() {
        return new Danhmuc();
    }

    /**
     * Create an instance of {@link Sanpham }
     * 
     */
    public Sanpham createSanpham() {
        return new Sanpham();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindSanpham }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "Find_sanpham")
    public JAXBElement<FindSanpham> createFindSanpham(FindSanpham value) {
        return new JAXBElement<FindSanpham>(_FindSanpham_QNAME, FindSanpham.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindSanphamResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "Find_sanphamResponse")
    public JAXBElement<FindSanphamResponse> createFindSanphamResponse(FindSanphamResponse value) {
        return new JAXBElement<FindSanphamResponse>(_FindSanphamResponse_QNAME, FindSanphamResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Loc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "loc")
    public JAXBElement<Loc> createLoc(Loc value) {
        return new JAXBElement<Loc>(_Loc_QNAME, Loc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveSanpham }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "save_sanpham")
    public JAXBElement<SaveSanpham> createSaveSanpham(SaveSanpham value) {
        return new JAXBElement<SaveSanpham>(_SaveSanpham_QNAME, SaveSanpham.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDanhmucResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAll_danhmucResponse")
    public JAXBElement<GetAllDanhmucResponse> createGetAllDanhmucResponse(GetAllDanhmucResponse value) {
        return new JAXBElement<GetAllDanhmucResponse>(_GetAllDanhmucResponse_QNAME, GetAllDanhmucResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSanphamResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAll_sanphamResponse")
    public JAXBElement<GetAllSanphamResponse> createGetAllSanphamResponse(GetAllSanphamResponse value) {
        return new JAXBElement<GetAllSanphamResponse>(_GetAllSanphamResponse_QNAME, GetAllSanphamResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSanpham }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "update_sanpham")
    public JAXBElement<UpdateSanpham> createUpdateSanpham(UpdateSanpham value) {
        return new JAXBElement<UpdateSanpham>(_UpdateSanpham_QNAME, UpdateSanpham.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "locResponse")
    public JAXBElement<LocResponse> createLocResponse(LocResponse value) {
        return new JAXBElement<LocResponse>(_LocResponse_QNAME, LocResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSanpham }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "delete_sanpham")
    public JAXBElement<DeleteSanpham> createDeleteSanpham(DeleteSanpham value) {
        return new JAXBElement<DeleteSanpham>(_DeleteSanpham_QNAME, DeleteSanpham.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDanhmuc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAll_danhmuc")
    public JAXBElement<GetAllDanhmuc> createGetAllDanhmuc(GetAllDanhmuc value) {
        return new JAXBElement<GetAllDanhmuc>(_GetAllDanhmuc_QNAME, GetAllDanhmuc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSanpham }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAll_sanpham")
    public JAXBElement<GetAllSanpham> createGetAllSanpham(GetAllSanpham value) {
        return new JAXBElement<GetAllSanpham>(_GetAllSanpham_QNAME, GetAllSanpham.class, null, value);
    }

}
