
package soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="AllTeamCoachNamesResult" type="{https://footballpool.dataaccess.eu}ArrayOftTeamCoachName"/>
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
    "allTeamCoachNamesResult"
})
@XmlRootElement(name = "AllTeamCoachNamesResponse")
public class AllTeamCoachNamesResponse {

    @XmlElement(name = "AllTeamCoachNamesResult", required = true)
    protected ArrayOftTeamCoachName allTeamCoachNamesResult;

    /**
     * Gets the value of the allTeamCoachNamesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftTeamCoachName }
     *     
     */
    public ArrayOftTeamCoachName getAllTeamCoachNamesResult() {
        return allTeamCoachNamesResult;
    }

    /**
     * Sets the value of the allTeamCoachNamesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftTeamCoachName }
     *     
     */
    public void setAllTeamCoachNamesResult(ArrayOftTeamCoachName value) {
        this.allTeamCoachNamesResult = value;
    }

}
