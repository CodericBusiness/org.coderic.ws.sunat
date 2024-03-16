
package org.coderic.ws.sunat.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para validaCDPcriteriosResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="validaCDPcriteriosResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="cdpvalidado" type="{http://service.sunat.gob.pe}statusResponse" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validaCDPcriteriosResponse", propOrder = {
    "cdpvalidado"
})
public class ValidaCDPcriteriosResponse {

    protected StatusResponse cdpvalidado;

    /**
     * Obtiene el valor de la propiedad cdpvalidado.
     * 
     * @return
     *     possible object is
     *     {@link StatusResponse }
     *     
     */
    public StatusResponse getCdpvalidado() {
        return cdpvalidado;
    }

    /**
     * Define el valor de la propiedad cdpvalidado.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusResponse }
     *     
     */
    public void setCdpvalidado(StatusResponse value) {
        this.cdpvalidado = value;
    }

}
