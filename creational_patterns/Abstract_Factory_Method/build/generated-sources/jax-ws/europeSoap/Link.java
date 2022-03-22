
package europeSoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Link complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Link">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ObtainedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="PublicationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="LinkProvider" type="{http://www.scholix.org}linkProvider" minOccurs="0" form="qualified"/>
 *         &lt;element name="RelationshipType" type="{http://www.scholix.org}RelationshipType" minOccurs="0" form="qualified"/>
 *         &lt;element name="Source" type="{http://www.scholix.org}dataLinkedElement" minOccurs="0" form="qualified"/>
 *         &lt;element name="Target" type="{http://www.scholix.org}dataLinkedElement" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{https://www.europepmc.org/data}Frequency" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Link", namespace = "http://www.scholix.org", propOrder = {
    "obtainedBy",
    "publicationDate",
    "linkProvider",
    "relationshipType",
    "source",
    "target",
    "frequency"
})
public class Link {

    @XmlElement(name = "ObtainedBy", namespace = "http://www.scholix.org")
    protected String obtainedBy;
    @XmlElement(name = "PublicationDate", namespace = "http://www.scholix.org")
    protected String publicationDate;
    @XmlElement(name = "LinkProvider", namespace = "http://www.scholix.org")
    protected LinkProvider linkProvider;
    @XmlElement(name = "RelationshipType", namespace = "http://www.scholix.org")
    protected RelationshipType relationshipType;
    @XmlElement(name = "Source", namespace = "http://www.scholix.org")
    protected DataLinkedElement source;
    @XmlElement(name = "Target", namespace = "http://www.scholix.org")
    protected DataLinkedElement target;
    @XmlElement(name = "Frequency", namespace = "https://www.europepmc.org/data")
    protected Integer frequency;

    /**
     * Gets the value of the obtainedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObtainedBy() {
        return obtainedBy;
    }

    /**
     * Sets the value of the obtainedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObtainedBy(String value) {
        this.obtainedBy = value;
    }

    /**
     * Gets the value of the publicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicationDate() {
        return publicationDate;
    }

    /**
     * Sets the value of the publicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicationDate(String value) {
        this.publicationDate = value;
    }

    /**
     * Gets the value of the linkProvider property.
     * 
     * @return
     *     possible object is
     *     {@link LinkProvider }
     *     
     */
    public LinkProvider getLinkProvider() {
        return linkProvider;
    }

    /**
     * Sets the value of the linkProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkProvider }
     *     
     */
    public void setLinkProvider(LinkProvider value) {
        this.linkProvider = value;
    }

    /**
     * Gets the value of the relationshipType property.
     * 
     * @return
     *     possible object is
     *     {@link RelationshipType }
     *     
     */
    public RelationshipType getRelationshipType() {
        return relationshipType;
    }

    /**
     * Sets the value of the relationshipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationshipType }
     *     
     */
    public void setRelationshipType(RelationshipType value) {
        this.relationshipType = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link DataLinkedElement }
     *     
     */
    public DataLinkedElement getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataLinkedElement }
     *     
     */
    public void setSource(DataLinkedElement value) {
        this.source = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link DataLinkedElement }
     *     
     */
    public DataLinkedElement getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataLinkedElement }
     *     
     */
    public void setTarget(DataLinkedElement value) {
        this.target = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFrequency(Integer value) {
        this.frequency = value;
    }

}
