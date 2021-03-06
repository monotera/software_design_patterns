
package soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="bYellow" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="iGameNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "bYellow",
    "iGameNumber"
})
@XmlRootElement(name = "Cards")
public class Cards {

    protected boolean bYellow;
    protected int iGameNumber;

    /**
     * Gets the value of the bYellow property.
     * 
     */
    public boolean isBYellow() {
        return bYellow;
    }

    /**
     * Sets the value of the bYellow property.
     * 
     */
    public void setBYellow(boolean value) {
        this.bYellow = value;
    }

    /**
     * Gets the value of the iGameNumber property.
     * 
     */
    public int getIGameNumber() {
        return iGameNumber;
    }

    /**
     * Sets the value of the iGameNumber property.
     * 
     */
    public void setIGameNumber(int value) {
        this.iGameNumber = value;
    }

}
