
package europeSoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dataLinkedElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dataLinkedElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://www.scholix.org}dataLinkObjectType" minOccurs="0" form="qualified"/>
 *         &lt;element name="Identifier" type="{http://www.scholix.org}dataLinkIdentifier" minOccurs="0" form="qualified"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="Publisher" type="{https://www.europepmc.org/data}objectPublisher" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{https://www.europepmc.org/data}ImageURL" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataLinkedElement", namespace = "http://www.scholix.org", propOrder = {
    "type",
    "identifier",
    "title",
    "publisher",
    "imageURL"
})
public class DataLinkedElement {

    @XmlElement(name = "Type", namespace = "http://www.scholix.org")
    protected DataLinkObjectType type;
    @XmlElement(name = "Identifier", namespace = "http://www.scholix.org")
    protected DataLinkIdentifier identifier;
    @XmlElement(name = "Title", namespace = "http://www.scholix.org")
    protected String title;
    @XmlElement(name = "Publisher", namespace = "http://www.scholix.org")
    protected ObjectPublisher publisher;
    @XmlElement(name = "ImageURL", namespace = "https://www.europepmc.org/data")
    protected String imageURL;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link DataLinkObjectType }
     *     
     */
    public DataLinkObjectType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataLinkObjectType }
     *     
     */
    public void setType(DataLinkObjectType value) {
        this.type = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link DataLinkIdentifier }
     *     
     */
    public DataLinkIdentifier getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataLinkIdentifier }
     *     
     */
    public void setIdentifier(DataLinkIdentifier value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the publisher property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectPublisher }
     *     
     */
    public ObjectPublisher getPublisher() {
        return publisher;
    }

    /**
     * Sets the value of the publisher property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectPublisher }
     *     
     */
    public void setPublisher(ObjectPublisher value) {
        this.publisher = value;
    }

    /**
     * Gets the value of the imageURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageURL() {
        return imageURL;
    }

    /**
     * Sets the value of the imageURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageURL(String value) {
        this.imageURL = value;
    }

}
