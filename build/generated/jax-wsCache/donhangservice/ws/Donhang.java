
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for donhang complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="donhang">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dtn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="dtsp" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="gia" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="hinhanh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ma_sp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="madon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sldh" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="soluong" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tenkhachhang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tensanpham" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tongDH" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "donhang", propOrder = {
    "dtn",
    "dtsp",
    "gia",
    "hinhanh",
    "maSp",
    "madon",
    "sldh",
    "soluong",
    "tenkhachhang",
    "tensanpham",
    "time",
    "tongDH",
    "tongtien"
})
public class Donhang {

    protected double dtn;
    protected double dtsp;
    protected double gia;
    protected String hinhanh;
    @XmlElement(name = "ma_sp")
    protected String maSp;
    protected String madon;
    protected int sldh;
    protected int soluong;
    protected String tenkhachhang;
    protected String tensanpham;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar time;
    protected int tongDH;
    protected double tongtien;

    /**
     * Gets the value of the dtn property.
     * 
     */
    public double getDtn() {
        return dtn;
    }

    /**
     * Sets the value of the dtn property.
     * 
     */
    public void setDtn(double value) {
        this.dtn = value;
    }

    /**
     * Gets the value of the dtsp property.
     * 
     */
    public double getDtsp() {
        return dtsp;
    }

    /**
     * Sets the value of the dtsp property.
     * 
     */
    public void setDtsp(double value) {
        this.dtsp = value;
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
     * Gets the value of the maSp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaSp() {
        return maSp;
    }

    /**
     * Sets the value of the maSp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaSp(String value) {
        this.maSp = value;
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
     * Gets the value of the sldh property.
     * 
     */
    public int getSldh() {
        return sldh;
    }

    /**
     * Sets the value of the sldh property.
     * 
     */
    public void setSldh(int value) {
        this.sldh = value;
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
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
    }

    /**
     * Gets the value of the tongDH property.
     * 
     */
    public int getTongDH() {
        return tongDH;
    }

    /**
     * Sets the value of the tongDH property.
     * 
     */
    public void setTongDH(int value) {
        this.tongDH = value;
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
