
package eu.chorevolution.prosumer.registryoffice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per farmBusinessCodeStartupNotificationReturnType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="farmBusinessCodeStartupNotificationReturnType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="inputMessageData" type="{http://eu.chorevolution.farmbusinessstartup/registryoffice}farmBusinessCodeStartupNotification"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "farmBusinessCodeStartupNotificationReturnType", propOrder = {
    "inputMessageData"
})
public class FarmBusinessCodeStartupNotificationReturnType {

    @XmlElement(required = true)
    protected FarmBusinessCodeStartupNotification inputMessageData;

    /**
     * Recupera il valore della proprietà inputMessageData.
     * 
     * @return
     *     possible object is
     *     {@link FarmBusinessCodeStartupNotification }
     *     
     */
    public FarmBusinessCodeStartupNotification getInputMessageData() {
        return inputMessageData;
    }

    /**
     * Imposta il valore della proprietà inputMessageData.
     * 
     * @param value
     *     allowed object is
     *     {@link FarmBusinessCodeStartupNotification }
     *     
     */
    public void setInputMessageData(FarmBusinessCodeStartupNotification value) {
        this.inputMessageData = value;
    }

}
