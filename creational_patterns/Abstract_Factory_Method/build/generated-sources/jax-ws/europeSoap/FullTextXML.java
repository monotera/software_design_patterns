
package europeSoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fullTextXML complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fullTextXML">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pmId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pmcId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isOpenAccess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fullTextXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fullTextXML", propOrder = {
    "pmId",
    "pmcId",
    "message",
    "isOpenAccess",
    "fullTextXML"
})
public class FullTextXML {

    protected String pmId;
    protected String pmcId;
    protected String message;
    protected String isOpenAccess;
    protected String fullTextXML;

    /**
     * Gets the value of the pmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmId() {
        return pmId;
    }

    /**
     * Sets the value of the pmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmId(String value) {
        this.pmId = value;
    }

    /**
     * Gets the value of the pmcId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmcId() {
        return pmcId;
    }

    /**
     * Sets the value of the pmcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmcId(String value) {
        this.pmcId = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the isOpenAccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsOpenAccess() {
        return isOpenAccess;
    }

    /**
     * Sets the value of the isOpenAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsOpenAccess(String value) {
        this.isOpenAccess = value;
    }

    /**
     * Gets the value of the fullTextXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullTextXML() {
        return fullTextXML;
    }

    /**
     * Sets the value of the fullTextXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullTextXML(String value) {
        this.fullTextXML = value;
    }

}
