//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.19 a las 08:52:13 PM CDT 
//


package https.biblioteca_mx.biblioteca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Concepto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="HoraInicio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="HoraFin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Tiempo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nombre",
    "concepto",
    "fecha",
    "horaInicio",
    "horaFin",
    "tiempo"
})
@XmlRootElement(name = "RegistrarReservacionesRequest")
public class RegistrarReservacionesRequest {

    @XmlElement(name = "Nombre", required = true)
    protected String nombre;
    @XmlElement(name = "Concepto", required = true)
    protected String concepto;
    @XmlElement(name = "Fecha", required = true)
    protected String fecha;
    @XmlElement(name = "HoraInicio", required = true)
    protected String horaInicio;
    @XmlElement(name = "HoraFin", required = true)
    protected String horaFin;
    @XmlElement(name = "Tiempo", required = true)
    protected String tiempo;

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad concepto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConcepto() {
        return concepto;
    }

    /**
     * Define el valor de la propiedad concepto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConcepto(String value) {
        this.concepto = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad horaInicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraInicio() {
        return horaInicio;
    }

    /**
     * Define el valor de la propiedad horaInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraInicio(String value) {
        this.horaInicio = value;
    }

    /**
     * Obtiene el valor de la propiedad horaFin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraFin() {
        return horaFin;
    }

    /**
     * Define el valor de la propiedad horaFin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraFin(String value) {
        this.horaFin = value;
    }

    /**
     * Obtiene el valor de la propiedad tiempo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiempo() {
        return tiempo;
    }

    /**
     * Define el valor de la propiedad tiempo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiempo(String value) {
        this.tiempo = value;
    }

}
