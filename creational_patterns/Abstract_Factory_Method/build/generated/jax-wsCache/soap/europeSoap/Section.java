
package europeSoap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Section complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Section">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ObtainedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tags" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Tag" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SectionLinkCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CollectionURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Linklist" type="{http://www.scholix.org}Linklist" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Section", namespace = "https://www.europepmc.org/data", propOrder = {
    "obtainedBy",
    "tags",
    "sectionLinkCount",
    "collectionURL",
    "linklist"
})
public class Section {

    @XmlElement(name = "ObtainedBy", namespace = "https://www.europepmc.org/data")
    protected String obtainedBy;
    @XmlElement(name = "Tags", namespace = "https://www.europepmc.org/data")
    protected Section.Tags tags;
    @XmlElement(name = "SectionLinkCount", namespace = "https://www.europepmc.org/data")
    protected Integer sectionLinkCount;
    @XmlElement(name = "CollectionURL", namespace = "https://www.europepmc.org/data")
    protected String collectionURL;
    @XmlElement(name = "Linklist", namespace = "https://www.europepmc.org/data")
    protected Linklist linklist;

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
     * Gets the value of the tags property.
     * 
     * @return
     *     possible object is
     *     {@link Section.Tags }
     *     
     */
    public Section.Tags getTags() {
        return tags;
    }

    /**
     * Sets the value of the tags property.
     * 
     * @param value
     *     allowed object is
     *     {@link Section.Tags }
     *     
     */
    public void setTags(Section.Tags value) {
        this.tags = value;
    }

    /**
     * Gets the value of the sectionLinkCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSectionLinkCount() {
        return sectionLinkCount;
    }

    /**
     * Sets the value of the sectionLinkCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSectionLinkCount(Integer value) {
        this.sectionLinkCount = value;
    }

    /**
     * Gets the value of the collectionURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionURL() {
        return collectionURL;
    }

    /**
     * Sets the value of the collectionURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionURL(String value) {
        this.collectionURL = value;
    }

    /**
     * Gets the value of the linklist property.
     * 
     * @return
     *     possible object is
     *     {@link Linklist }
     *     
     */
    public Linklist getLinklist() {
        return linklist;
    }

    /**
     * Sets the value of the linklist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Linklist }
     *     
     */
    public void setLinklist(Linklist value) {
        this.linklist = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Tag" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tag"
    })
    public static class Tags {

        @XmlElement(name = "Tag", namespace = "https://www.europepmc.org/data")
        protected List<String> tag;

        /**
         * Gets the value of the tag property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tag property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTag().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getTag() {
            if (tag == null) {
                tag = new ArrayList<String>();
            }
            return this.tag;
        }

    }

}
