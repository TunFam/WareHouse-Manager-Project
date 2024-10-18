
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nhanvien complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nhanvien">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chucvu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="diachi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dienthoai" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gioitinh" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="luong" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="manhanvien" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ngaysinh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tennhanvien" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nhanvien", propOrder = {
    "chucvu",
    "diachi",
    "dienthoai",
    "gioitinh",
    "luong",
    "manhanvien",
    "ngaysinh",
    "tennhanvien"
})
public class Nhanvien {

    protected String chucvu;
    protected String diachi;
    protected String dienthoai;
    protected int gioitinh;
    protected double luong;
    protected String manhanvien;
    protected String ngaysinh;
    protected String tennhanvien;

    /**
     * Gets the value of the chucvu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChucvu() {
        return chucvu;
    }

    /**
     * Sets the value of the chucvu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChucvu(String value) {
        this.chucvu = value;
    }

    /**
     * Gets the value of the diachi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiachi() {
        return diachi;
    }

    /**
     * Sets the value of the diachi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiachi(String value) {
        this.diachi = value;
    }

    /**
     * Gets the value of the dienthoai property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDienthoai() {
        return dienthoai;
    }

    /**
     * Sets the value of the dienthoai property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDienthoai(String value) {
        this.dienthoai = value;
    }

    /**
     * Gets the value of the gioitinh property.
     * 
     */
    public int getGioitinh() {
        return gioitinh;
    }

    /**
     * Sets the value of the gioitinh property.
     * 
     */
    public void setGioitinh(int value) {
        this.gioitinh = value;
    }

    /**
     * Gets the value of the luong property.
     * 
     */
    public double getLuong() {
        return luong;
    }

    /**
     * Sets the value of the luong property.
     * 
     */
    public void setLuong(double value) {
        this.luong = value;
    }

    /**
     * Gets the value of the manhanvien property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManhanvien() {
        return manhanvien;
    }

    /**
     * Sets the value of the manhanvien property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManhanvien(String value) {
        this.manhanvien = value;
    }

    /**
     * Gets the value of the ngaysinh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNgaysinh() {
        return ngaysinh;
    }

    /**
     * Sets the value of the ngaysinh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNgaysinh(String value) {
        this.ngaysinh = value;
    }

    /**
     * Gets the value of the tennhanvien property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTennhanvien() {
        return tennhanvien;
    }

    /**
     * Sets the value of the tennhanvien property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTennhanvien(String value) {
        this.tennhanvien = value;
    }

}
