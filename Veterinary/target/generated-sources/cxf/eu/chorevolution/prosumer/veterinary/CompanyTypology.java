
package eu.chorevolution.prosumer.veterinary;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per companyTypology.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="companyTypology"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="individual company"/&gt;
 *     &lt;enumeration value="partnership"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "companyTypology")
@XmlEnum
public enum CompanyTypology {

    @XmlEnumValue("individual company")
    INDIVIDUAL_COMPANY("individual company"),
    @XmlEnumValue("partnership")
    PARTNERSHIP("partnership");
    private final String value;

    CompanyTypology(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompanyTypology fromValue(String v) {
        for (CompanyTypology c: CompanyTypology.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
