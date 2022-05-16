//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.16 a las 11:13:04 AM CDT 
//


package https.registrovisitantes_mx.registro;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="Tarea" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Fecha-dd-mm-aa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Parejas" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "tarea"
})
@XmlRootElement(name = "BuscarRegistrosResponse")
public class BuscarRegistrosResponse {

    @XmlElement(name = "Tarea", required = true)
    protected List<BuscarRegistrosResponse.Tarea> tarea;

    /**
     * Gets the value of the tarea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tarea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTarea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BuscarRegistrosResponse.Tarea }
     * 
     * 
     */
    public List<BuscarRegistrosResponse.Tarea> getTarea() {
        if (tarea == null) {
            tarea = new ArrayList<BuscarRegistrosResponse.Tarea>();
        }
        return this.tarea;
    }


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
     *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Fecha-dd-mm-aa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Parejas" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "id",
        "nombre",
        "fechaDdMmAa",
        "parejas"
    })
    public static class Tarea {

        protected int id;
        @XmlElement(required = true)
        protected String nombre;
        @XmlElement(name = "Fecha-dd-mm-aa", required = true)
        protected String fechaDdMmAa;
        @XmlElement(name = "Parejas", required = true)
        protected String parejas;

        /**
         * Obtiene el valor de la propiedad id.
         * 
         */
        public int getId() {
            return id;
        }

        /**
         * Define el valor de la propiedad id.
         * 
         */
        public void setId(int value) {
            this.id = value;
        }

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
         * Obtiene el valor de la propiedad fechaDdMmAa.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFechaDdMmAa() {
            return fechaDdMmAa;
        }

        /**
         * Define el valor de la propiedad fechaDdMmAa.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFechaDdMmAa(String value) {
            this.fechaDdMmAa = value;
        }

        /**
         * Obtiene el valor de la propiedad parejas.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParejas() {
            return parejas;
        }

        /**
         * Define el valor de la propiedad parejas.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParejas(String value) {
            this.parejas = value;
        }

    }

}
