//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.16 at 02:58:49 PM CET 
//


package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeratioType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeratioType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="vitesse"/&gt;
 *     &lt;enumeration value="gain"/&gt;
 *     &lt;enumeration value="ange"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeratioType")
@XmlEnum
public enum TyperatioType {

    @XmlEnumValue("vitesse")
    VITESSE("vitesse"),
    @XmlEnumValue("gain")
    GAIN("gain"),
    @XmlEnumValue("ange")
    ANGE("ange");
    private final String value;

    TyperatioType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TyperatioType fromValue(String v) {
        for (TyperatioType c: TyperatioType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
