
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for khachhangmodel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="khachhangmodel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="convertDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="diachiKH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dienthoai" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="makhachhang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ngaysinh" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ngaythem" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="sumKH" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tenkhachhang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tuoi" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "khachhangmodel", propOrder = {
    "convertDate",
    "diachiKH",
    "dienthoai",
    "makhachhang",
    "ngaysinh",
    "ngaythem",
    "sumKH",
    "tenkhachhang",
    "tuoi"
})
public class Khachhangmodel {

    protected String convertDate;
    protected String diachiKH;
    protected String dienthoai;
    protected String makhachhang;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ngaysinh;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ngaythem;
    protected int sumKH;
    protected String tenkhachhang;
    protected int tuoi;

    /**
     * Gets the value of the convertDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConvertDate() {
        return convertDate;
    }

    /**
     * Sets the value of the convertDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConvertDate(String value) {
        this.convertDate = value;
    }

    /**
     * Gets the value of the diachiKH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiachiKH() {
        return diachiKH;
    }

    /**
     * Sets the value of the diachiKH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiachiKH(String value) {
        this.diachiKH = value;
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
     * Gets the value of the makhachhang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMakhachhang() {
        return makhachhang;
    }

    /**
     * Sets the value of the makhachhang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMakhachhang(String value) {
        this.makhachhang = value;
    }

    /**
     * Gets the value of the ngaysinh property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNgaysinh() {
        return ngaysinh;
    }

    /**
     * Sets the value of the ngaysinh property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNgaysinh(XMLGregorianCalendar value) {
        this.ngaysinh = value;
    }

    /**
     * Gets the value of the ngaythem property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNgaythem() {
        return ngaythem;
    }

    /**
     * Sets the value of the ngaythem property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNgaythem(XMLGregorianCalendar value) {
        this.ngaythem = value;
    }

    /**
     * Gets the value of the sumKH property.
     * 
     */
    public int getSumKH() {
        return sumKH;
    }

    /**
     * Sets the value of the sumKH property.
     * 
     */
    public void setSumKH(int value) {
        this.sumKH = value;
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
     * Gets the value of the tuoi property.
     * 
     */
    public int getTuoi() {
        return tuoi;
    }

    /**
     * Sets the value of the tuoi property.
     * 
     */
    public void setTuoi(int value) {
        this.tuoi = value;
    }

}
