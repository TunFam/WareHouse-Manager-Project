
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sanpham complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sanpham">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doanhthu" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="gia" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="loaihang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="masp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ngaynhap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="soluong" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tensp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tinhtrang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sanpham", propOrder = {
    "anh",
    "doanhthu",
    "gia",
    "loaihang",
    "masp",
    "mota",
    "ngaynhap",
    "soluong",
    "tensp",
    "tinhtrang"
})
public class Sanpham {

    protected String anh;
    protected double doanhthu;
    protected double gia;
    protected String loaihang;
    protected String masp;
    protected String mota;
    protected String ngaynhap;
    protected int soluong;
    protected String tensp;
    protected String tinhtrang;

    /**
     * Gets the value of the anh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnh() {
        return anh;
    }

    /**
     * Sets the value of the anh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnh(String value) {
        this.anh = value;
    }

    /**
     * Gets the value of the doanhthu property.
     * 
     */
    public double getDoanhthu() {
        return doanhthu;
    }

    /**
     * Sets the value of the doanhthu property.
     * 
     */
    public void setDoanhthu(double value) {
        this.doanhthu = value;
    }

    /**
     * Gets the value of the gia property.
     * 
     */
    public double getGia() {
        return gia;
    }

    /**
     * Sets the value of the gia property.
     * 
     */
    public void setGia(double value) {
        this.gia = value;
    }

    /**
     * Gets the value of the loaihang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoaihang() {
        return loaihang;
    }

    /**
     * Sets the value of the loaihang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoaihang(String value) {
        this.loaihang = value;
    }

    /**
     * Gets the value of the masp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasp() {
        return masp;
    }

    /**
     * Sets the value of the masp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasp(String value) {
        this.masp = value;
    }

    /**
     * Gets the value of the mota property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMota() {
        return mota;
    }

    /**
     * Sets the value of the mota property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMota(String value) {
        this.mota = value;
    }

    /**
     * Gets the value of the ngaynhap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNgaynhap() {
        return ngaynhap;
    }

    /**
     * Sets the value of the ngaynhap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNgaynhap(String value) {
        this.ngaynhap = value;
    }

    /**
     * Gets the value of the soluong property.
     * 
     */
    public int getSoluong() {
        return soluong;
    }

    /**
     * Sets the value of the soluong property.
     * 
     */
    public void setSoluong(int value) {
        this.soluong = value;
    }

    /**
     * Gets the value of the tensp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTensp() {
        return tensp;
    }

    /**
     * Sets the value of the tensp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTensp(String value) {
        this.tensp = value;
    }

    /**
     * Gets the value of the tinhtrang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTinhtrang() {
        return tinhtrang;
    }

    /**
     * Sets the value of the tinhtrang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTinhtrang(String value) {
        this.tinhtrang = value;
    }

}
