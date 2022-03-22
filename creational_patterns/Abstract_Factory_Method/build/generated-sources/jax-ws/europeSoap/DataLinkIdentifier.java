
package europeSoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dataLinkIdentifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dataLinkIdentifier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="IDScheme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="IDURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataLinkIdentifier", namespace = "http://www.scholix.org", propOrder = {
    "id",
    "idScheme",
    "idurl"
})
public class DataLinkIdentifier {

    @XmlElement(name = "ID", namespace = "http://www.scholix.org")
    protected String id;
    @XmlElement(name = "IDScheme", namespace = "http://www.scholix.org")
    protected String idScheme;
    @XmlElement(name = "IDURL", namespace = "http://www.scholix.org")
    protected String idurl;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the idScheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDScheme() {
        return idScheme;
    }

    /**
     * Sets the value of the idScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDScheme(String value) {
        this.idScheme = value;
    }

    /**
     * Gets the value of the idurl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDURL() {
        return idurl;
    }

    /**
     * Sets the value of the idurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDURL(String value) {
        this.idurl = value;
    }

}
