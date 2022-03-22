
package europeSoap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for authorAffiliationDetailsList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="authorAffiliationDetailsList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authorAffiliation" type="{http://webservice.cdb.ebi.ac.uk/}authorAffiliation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authorAffiliationDetailsList", propOrder = {
    "authorAffiliation"
})
public class AuthorAffiliationDetailsList {

    @XmlElement(nillable = true)
    protected List<AuthorAffiliation> authorAffiliation;

    /**
     * Gets the value of the authorAffiliation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorAffiliation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorAffiliation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthorAffiliation }
     * 
     * 
     */
    public List<AuthorAffiliation> getAuthorAffiliation() {
        if (authorAffiliation == null) {
            authorAffiliation = new ArrayList<AuthorAffiliation>();
        }
        return this.authorAffiliation;
    }

}
