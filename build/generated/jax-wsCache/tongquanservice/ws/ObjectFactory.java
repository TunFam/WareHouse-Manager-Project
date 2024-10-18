
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

    private final static QName _SoluongDonHang_QNAME = new QName("http://ws/", "soluongDonHang");
    private final static QName _SoluongkhachhangResponse_QNAME = new QName("http://ws/", "soluongkhachhangResponse");
    private final static QName _Soluongkhachhang_QNAME = new QName("http://ws/", "soluongkhachhang");
    private final static QName _Soluongsanpham_QNAME = new QName("http://ws/", "soluongsanpham");
    private final static QName _SoluongsanphamResponse_QNAME = new QName("http://ws/", "soluongsanphamResponse");
    private final static QName _DoanhthuResponse_QNAME = new QName("http://ws/", "doanhthuResponse");
    private final static QName _SoluongDonHangResponse_QNAME = new QName("http://ws/", "soluongDonHangResponse");
    private final static QName _Doanhthu_QNAME = new QName("http://ws/", "doanhthu");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SoluongDonHang }
     * 
     */
    public SoluongDonHang createSoluongDonHang() {
        return new SoluongDonHang();
    }

    /**
     * Create an instance of {@link SoluongkhachhangResponse }
     * 
     */
    public SoluongkhachhangResponse createSoluongkhachhangResponse() {
        return new SoluongkhachhangResponse();
    }

    /**
     * Create an instance of {@link Soluongkhachhang }
     * 
     */
    public Soluongkhachhang createSoluongkhachhang() {
        return new Soluongkhachhang();
    }

    /**
     * Create an instance of {@link Soluongsanpham }
     * 
     */
    public Soluongsanpham createSoluongsanpham() {
        return new Soluongsanpham();
    }

    /**
     * Create an instance of {@link SoluongsanphamResponse }
     * 
     */
    public SoluongsanphamResponse createSoluongsanphamResponse() {
        return new SoluongsanphamResponse();
    }

    /**
     * Create an instance of {@link DoanhthuResponse }
     * 
     */
    public DoanhthuResponse createDoanhthuResponse() {
        return new DoanhthuResponse();
    }

    /**
     * Create an instance of {@link SoluongDonHangResponse }
     * 
     */
    public SoluongDonHangResponse createSoluongDonHangResponse() {
        return new SoluongDonHangResponse();
    }

    /**
     * Create an instance of {@link Doanhthu }
     * 
     */
    public Doanhthu createDoanhthu() {
        return new Doanhthu();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoluongDonHang }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "soluongDonHang")
    public JAXBElement<SoluongDonHang> createSoluongDonHang(SoluongDonHang value) {
        return new JAXBElement<SoluongDonHang>(_SoluongDonHang_QNAME, SoluongDonHang.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoluongkhachhangResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "soluongkhachhangResponse")
    public JAXBElement<SoluongkhachhangResponse> createSoluongkhachhangResponse(SoluongkhachhangResponse value) {
        return new JAXBElement<SoluongkhachhangResponse>(_SoluongkhachhangResponse_QNAME, SoluongkhachhangResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Soluongkhachhang }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "soluongkhachhang")
    public JAXBElement<Soluongkhachhang> createSoluongkhachhang(Soluongkhachhang value) {
        return new JAXBElement<Soluongkhachhang>(_Soluongkhachhang_QNAME, Soluongkhachhang.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Soluongsanpham }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "soluongsanpham")
    public JAXBElement<Soluongsanpham> createSoluongsanpham(Soluongsanpham value) {
        return new JAXBElement<Soluongsanpham>(_Soluongsanpham_QNAME, Soluongsanpham.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoluongsanphamResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "soluongsanphamResponse")
    public JAXBElement<SoluongsanphamResponse> createSoluongsanphamResponse(SoluongsanphamResponse value) {
        return new JAXBElement<SoluongsanphamResponse>(_SoluongsanphamResponse_QNAME, SoluongsanphamResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoanhthuResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "doanhthuResponse")
    public JAXBElement<DoanhthuResponse> createDoanhthuResponse(DoanhthuResponse value) {
        return new JAXBElement<DoanhthuResponse>(_DoanhthuResponse_QNAME, DoanhthuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoluongDonHangResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "soluongDonHangResponse")
    public JAXBElement<SoluongDonHangResponse> createSoluongDonHangResponse(SoluongDonHangResponse value) {
        return new JAXBElement<SoluongDonHangResponse>(_SoluongDonHangResponse_QNAME, SoluongDonHangResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Doanhthu }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "doanhthu")
    public JAXBElement<Doanhthu> createDoanhthu(Doanhthu value) {
        return new JAXBElement<Doanhthu>(_Doanhthu_QNAME, Doanhthu.class, null, value);
    }

}
