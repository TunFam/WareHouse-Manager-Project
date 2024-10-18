
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for danhmuc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="danhmuc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="madanhmuc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tendanhmuc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "danhmuc", propOrder = {
    "madanhmuc",
    "tendanhmuc"
})
public class Danhmuc {

    protected String madanhmuc;
    protected String tendanhmuc;

    /**
     * Gets the value of the madanhmuc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMadanhmuc() {
        return madanhmuc;
    }

    /**
     * Sets the value of the madanhmuc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMadanhmuc(String value) {
        this.madanhmuc = value;
    }

    /**
     * Gets the value of the tendanhmuc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTendanhmuc() {
        return tendanhmuc;
    }

    /**
     * Sets the value of the tendanhmuc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTendanhmuc(String value) {
        this.tendanhmuc = value;
    }

}
