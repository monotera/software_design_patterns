
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
 *         &lt;element name="AllPlayersWithCardsResult" type="{https://footballpool.dataaccess.eu}ArrayOftTeamPlayerCardInfo"/>
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
    "allPlayersWithCardsResult"
})
@XmlRootElement(name = "AllPlayersWithCardsResponse")
public class AllPlayersWithCardsResponse {

    @XmlElement(name = "AllPlayersWithCardsResult", required = true)
    protected ArrayOftTeamPlayerCardInfo allPlayersWithCardsResult;

    /**
     * Gets the value of the allPlayersWithCardsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftTeamPlayerCardInfo }
     *     
     */
    public ArrayOftTeamPlayerCardInfo getAllPlayersWithCardsResult() {
        return allPlayersWithCardsResult;
    }

    /**
     * Sets the value of the allPlayersWithCardsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftTeamPlayerCardInfo }
     *     
     */
    public void setAllPlayersWithCardsResult(ArrayOftTeamPlayerCardInfo value) {
        this.allPlayersWithCardsResult = value;
    }

}
