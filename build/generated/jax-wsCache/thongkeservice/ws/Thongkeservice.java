
package ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "thongkeservice", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Thongkeservice {


    /**
     * 
     * @return
     *     returns java.util.List<ws.Sanpham>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getListBySanPham", targetNamespace = "http://ws/", className = "ws.GetListBySanPham")
    @ResponseWrapper(localName = "getListBySanPhamResponse", targetNamespace = "http://ws/", className = "ws.GetListBySanPhamResponse")
    @Action(input = "http://ws/thongkeservice/getListBySanPhamRequest", output = "http://ws/thongkeservice/getListBySanPhamResponse")
    public List<Sanpham> getListBySanPham();

    /**
     * 
     * @return
     *     returns java.util.List<ws.Donhang>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getListByDonHang", targetNamespace = "http://ws/", className = "ws.GetListByDonHang")
    @ResponseWrapper(localName = "getListByDonHangResponse", targetNamespace = "http://ws/", className = "ws.GetListByDonHangResponse")
    @Action(input = "http://ws/thongkeservice/getListByDonHangRequest", output = "http://ws/thongkeservice/getListByDonHangResponse")
    public List<Donhang> getListByDonHang();

    /**
     * 
     * @return
     *     returns java.util.List<ws.Donhang>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getListBySLDonHang", targetNamespace = "http://ws/", className = "ws.GetListBySLDonHang")
    @ResponseWrapper(localName = "getListBySLDonHangResponse", targetNamespace = "http://ws/", className = "ws.GetListBySLDonHangResponse")
    @Action(input = "http://ws/thongkeservice/getListBySLDonHangRequest", output = "http://ws/thongkeservice/getListBySLDonHangResponse")
    public List<Donhang> getListBySLDonHang();

    /**
     * 
     * @return
     *     returns java.util.List<ws.Donhang>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getListByDTDonHang", targetNamespace = "http://ws/", className = "ws.GetListByDTDonHang")
    @ResponseWrapper(localName = "getListByDTDonHangResponse", targetNamespace = "http://ws/", className = "ws.GetListByDTDonHangResponse")
    @Action(input = "http://ws/thongkeservice/getListByDTDonHangRequest", output = "http://ws/thongkeservice/getListByDTDonHangResponse")
    public List<Donhang> getListByDTDonHang();

    /**
     * 
     * @return
     *     returns java.util.List<ws.Khachhangmodel>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getListByKhachHang", targetNamespace = "http://ws/", className = "ws.GetListByKhachHang")
    @ResponseWrapper(localName = "getListByKhachHangResponse", targetNamespace = "http://ws/", className = "ws.GetListByKhachHangResponse")
    @Action(input = "http://ws/thongkeservice/getListByKhachHangRequest", output = "http://ws/thongkeservice/getListByKhachHangResponse")
    public List<Khachhangmodel> getListByKhachHang();

    /**
     * 
     * @return
     *     returns java.util.List<ws.Khachhangmodel>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sumListByKhachHang", targetNamespace = "http://ws/", className = "ws.SumListByKhachHang")
    @ResponseWrapper(localName = "sumListByKhachHangResponse", targetNamespace = "http://ws/", className = "ws.SumListByKhachHangResponse")
    @Action(input = "http://ws/thongkeservice/sumListByKhachHangRequest", output = "http://ws/thongkeservice/sumListByKhachHangResponse")
    public List<Khachhangmodel> sumListByKhachHang();

    /**
     * 
     * @return
     *     returns java.util.List<ws.Khachhangmodel>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sumListByKhachHang1", targetNamespace = "http://ws/", className = "ws.SumListByKhachHang1")
    @ResponseWrapper(localName = "sumListByKhachHang1Response", targetNamespace = "http://ws/", className = "ws.SumListByKhachHang1Response")
    @Action(input = "http://ws/thongkeservice/sumListByKhachHang1Request", output = "http://ws/thongkeservice/sumListByKhachHang1Response")
    public List<Khachhangmodel> sumListByKhachHang1();

    /**
     * 
     * @return
     *     returns java.util.List<ws.Sanpham>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getListByDTSanPham", targetNamespace = "http://ws/", className = "ws.GetListByDTSanPham")
    @ResponseWrapper(localName = "getListByDTSanPhamResponse", targetNamespace = "http://ws/", className = "ws.GetListByDTSanPhamResponse")
    @Action(input = "http://ws/thongkeservice/getListByDTSanPhamRequest", output = "http://ws/thongkeservice/getListByDTSanPhamResponse")
    public List<Sanpham> getListByDTSanPham();

}
