
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
 *         &lt;element name="GoalsScoredResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "goalsScoredResult"
})
@XmlRootElement(name = "GoalsScoredResponse")
public class GoalsScoredResponse {

    @XmlElement(name = "GoalsScoredResult")
    protected int goalsScoredResult;

    /**
     * Gets the value of the goalsScoredResult property.
     * 
     */
    public int getGoalsScoredResult() {
        return goalsScoredResult;
    }

    /**
     * Sets the value of the goalsScoredResult property.
     * 
     */
    public void setGoalsScoredResult(int value) {
        this.goalsScoredResult = value;
    }

}
