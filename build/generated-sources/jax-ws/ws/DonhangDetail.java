
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for donhangDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="donhangDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gia" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="hinhanh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="madon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="masanpham" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="soluong" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tenkhachhang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tensanpham" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tongtien" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "donhangDetail", propOrder = {
    "gia",
    "hinhanh",
    "madon",
    "masanpham",
    "soluong",
    "tenkhachhang",
    "tensanpham",
    "tongtien"
})
public class DonhangDetail {

    protected double gia;
    protected String hinhanh;
    protected String madon;
    protected String masanpham;
    protected int soluong;
    protected String tenkhachhang;
    protected String tensanpham;
    protected double tongtien;

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
     * Gets the value of the hinhanh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHinhanh() {
        return hinhanh;
    }

    /**
     * Sets the value of the hinhanh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHinhanh(String value) {
        this.hinhanh = value;
    }

    /**
     * Gets the value of the madon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMadon() {
        return madon;
    }

    /**
     * Sets the value of the madon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMadon(String value) {
        this.madon = value;
    }

    /**
     * Gets the value of the masanpham property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasanpham() {
        return masanpham;
    }

    /**
     * Sets the value of the masanpham property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasanpham(String value) {
        this.masanpham = value;
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
     * Gets the value of the tenkhachhang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenkhachhang() {
        return tenkhachhang;
    }

    /**
     * Sets the value of the tenkhachhang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenkhachhang(String value) {
        this.tenkhachhang = value;
    }

    /**
     * Gets the value of the tensanpham property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTensanpham() {
        return tensanpham;
    }

    /**
     * Sets the value of the tensanpham property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTensanpham(String value) {
        this.tensanpham = value;
    }

    /**
     * Gets the value of the tongtien property.
     * 
     */
    public double getTongtien() {
        return tongtien;
    }

    /**
     * Sets the value of the tongtien property.
     * 
     */
    public void setTongtien(double value) {
        this.tongtien = value;
    }

}
