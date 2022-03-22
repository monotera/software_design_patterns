
package europeSoap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fullTextImageList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fullTextImageList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fullTextImage" type="{http://webservice.cdb.ebi.ac.uk/}fullTextImage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fullTextImageList", propOrder = {
    "fullTextImage"
})
public class FullTextImageList {

    @XmlElement(nillable = true)
    protected List<FullTextImage> fullTextImage;

    /**
     * Gets the value of the fullTextImage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fullTextImage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFullTextImage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FullTextImage }
     * 
     * 
     */
    public List<FullTextImage> getFullTextImage() {
        if (fullTextImage == null) {
            fullTextImage = new ArrayList<FullTextImage>();
        }
        return this.fullTextImage;
    }

}
