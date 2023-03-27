
package proxy;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour compte complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>{@code
 * <complexType name="compte">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="mantant" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "compte", propOrder = {
    "code",
    "mantant"
})
public class Compte {

    protected int code;
    protected double mantant;

    /**
     * Obtient la valeur de la propriété code.
     * 
     */
    public int getCode() {
        return code;
    }

    /**
     * Définit la valeur de la propriété code.
     * 
     */
    public void setCode(int value) {
        this.code = value;
    }

    /**
     * Obtient la valeur de la propriété mantant.
     * 
     */
    public double getMantant() {
        return mantant;
    }

    /**
     * Définit la valeur de la propriété mantant.
     * 
     */
    public void setMantant(double value) {
        this.mantant = value;
    }

}
