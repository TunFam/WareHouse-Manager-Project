
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

    private final static QName _KtTrungResponse_QNAME = new QName("http://ws/", "kt_trungResponse");
    private final static QName _CheckSoluongResponse_QNAME = new QName("http://ws/", "check_soluongResponse");
    private final static QName _GetAllDonhangdetailResponse_QNAME = new QName("http://ws/", "getAllDonhangdetailResponse");
    private final static QName _InsertDonhang_QNAME = new QName("http://ws/", "insert_donhang");
    private final static QName _InsertDonhangResponse_QNAME = new QName("http://ws/", "insert_donhangResponse");
    private final static QName _GetAllDonhang_QNAME = new QName("http://ws/", "getAllDonhang");
    private final static QName _CheckSoluong_QNAME = new QName("http://ws/", "check_soluong");
    private final static QName _Delete_QNAME = new QName("http://ws/", "delete");
    private final static QName _GetAllDonhangdetail_QNAME = new QName("http://ws/", "getAllDonhangdetail");
    private final static QName _GetAllDonhangResponse_QNAME = new QName("http://ws/", "getAllDonhangResponse");
    private final static QName _InsertDonhangdetail_QNAME = new QName("http://ws/", "insert_donhangdetail");
    private final static QName _KtTrung_QNAME = new QName("http://ws/", "kt_trung");
    private final static QName _UpdateSoluong_QNAME = new QName("http://ws/", "update_soluong");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link KtTrungResponse }
     * 
     */
    public KtTrungResponse createKtTrungResponse() {
        return new KtTrungResponse();
    }

    /**
     * Create an instance of {@link CheckSoluongResponse }
     * 
     */
    public CheckSoluongResponse createCheckSoluongResponse() {
        return new CheckSoluongResponse();
    }

    /**
     * Create an instance of {@link GetAllDonhangdetailResponse }
     * 
     */
    public GetAllDonhangdetailResponse createGetAllDonhangdetailResponse() {
        return new GetAllDonhangdetailResponse();
    }

    /**
     * Create an instance of {@link InsertDonhang }
     * 
     */
    public InsertDonhang createInsertDonhang() {
        return new InsertDonhang();
    }

    /**
     * Create an instance of {@link InsertDonhangResponse }
     * 
     */
    public InsertDonhangResponse createInsertDonhangResponse() {
        return new InsertDonhangResponse();
    }

    /**
     * Create an instance of {@link GetAllDonhang }
     * 
     */
    public GetAllDonhang createGetAllDonhang() {
        return new GetAllDonhang();
    }

    /**
     * Create an instance of {@link CheckSoluong }
     * 
     */
    public CheckSoluong createCheckSoluong() {
        return new CheckSoluong();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link GetAllDonhangdetail }
     * 
     */
    public GetAllDonhangdetail createGetAllDonhangdetail() {
        return new GetAllDonhangdetail();
    }

    /**
     * Create an instance of {@link GetAllDonhangResponse }
     * 
     */
    public GetAllDonhangResponse createGetAllDonhangResponse() {
        return new GetAllDonhangResponse();
    }

    /**
     * Create an instance of {@link InsertDonhangdetail }
     * 
     */
    public InsertDonhangdetail createInsertDonhangdetail() {
        return new InsertDonhangdetail();
    }

    /**
     * Create an instance of {@link KtTrung }
     * 
     */
    public KtTrung createKtTrung() {
        return new KtTrung();
    }

    /**
     * Create an instance of {@link UpdateSoluong }
     * 
     */
    public UpdateSoluong createUpdateSoluong() {
        return new UpdateSoluong();
    }

    /**
     * Create an instance of {@link Donhang }
     * 
     */
    public Donhang createDonhang() {
        return new Donhang();
    }

    /**
     * Create an instance of {@link Sanpham }
     * 
     */
    public Sanpham createSanpham() {
        return new Sanpham();
    }

    /**
     * Create an instance of {@link DonhangDetail }
     * 
     */
    public DonhangDetail createDonhangDetail() {
        return new DonhangDetail();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KtTrungResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "kt_trungResponse")
    public JAXBElement<KtTrungResponse> createKtTrungResponse(KtTrungResponse value) {
        return new JAXBElement<KtTrungResponse>(_KtTrungResponse_QNAME, KtTrungResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckSoluongResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "check_soluongResponse")
    public JAXBElement<CheckSoluongResponse> createCheckSoluongResponse(CheckSoluongResponse value) {
        return new JAXBElement<CheckSoluongResponse>(_CheckSoluongResponse_QNAME, CheckSoluongResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDonhangdetailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAllDonhangdetailResponse")
    public JAXBElement<GetAllDonhangdetailResponse> createGetAllDonhangdetailResponse(GetAllDonhangdetailResponse value) {
        return new JAXBElement<GetAllDonhangdetailResponse>(_GetAllDonhangdetailResponse_QNAME, GetAllDonhangdetailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertDonhang }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "insert_donhang")
    public JAXBElement<InsertDonhang> createInsertDonhang(InsertDonhang value) {
        return new JAXBElement<InsertDonhang>(_InsertDonhang_QNAME, InsertDonhang.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertDonhangResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "insert_donhangResponse")
    public JAXBElement<InsertDonhangResponse> createInsertDonhangResponse(InsertDonhangResponse value) {
        return new JAXBElement<InsertDonhangResponse>(_InsertDonhangResponse_QNAME, InsertDonhangResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDonhang }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAllDonhang")
    public JAXBElement<GetAllDonhang> createGetAllDonhang(GetAllDonhang value) {
        return new JAXBElement<GetAllDonhang>(_GetAllDonhang_QNAME, GetAllDonhang.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckSoluong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "check_soluong")
    public JAXBElement<CheckSoluong> createCheckSoluong(CheckSoluong value) {
        return new JAXBElement<CheckSoluong>(_CheckSoluong_QNAME, CheckSoluong.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDonhangdetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAllDonhangdetail")
    public JAXBElement<GetAllDonhangdetail> createGetAllDonhangdetail(GetAllDonhangdetail value) {
        return new JAXBElement<GetAllDonhangdetail>(_GetAllDonhangdetail_QNAME, GetAllDonhangdetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDonhangResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAllDonhangResponse")
    public JAXBElement<GetAllDonhangResponse> createGetAllDonhangResponse(GetAllDonhangResponse value) {
        return new JAXBElement<GetAllDonhangResponse>(_GetAllDonhangResponse_QNAME, GetAllDonhangResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertDonhangdetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "insert_donhangdetail")
    public JAXBElement<InsertDonhangdetail> createInsertDonhangdetail(InsertDonhangdetail value) {
        return new JAXBElement<InsertDonhangdetail>(_InsertDonhangdetail_QNAME, InsertDonhangdetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KtTrung }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "kt_trung")
    public JAXBElement<KtTrung> createKtTrung(KtTrung value) {
        return new JAXBElement<KtTrung>(_KtTrung_QNAME, KtTrung.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSoluong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "update_soluong")
    public JAXBElement<UpdateSoluong> createUpdateSoluong(UpdateSoluong value) {
        return new JAXBElement<UpdateSoluong>(_UpdateSoluong_QNAME, UpdateSoluong.class, null, value);
    }

}
