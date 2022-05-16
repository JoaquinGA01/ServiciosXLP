//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.16 a las 11:13:04 AM CDT 
//


package https.registrovisitantes_mx.registro;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.registrovisitantes_mx.registro package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BuscarRegistrosRequest_QNAME = new QName("https://registrovisitantes.mx/Registro", "BuscarRegistrosRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.registrovisitantes_mx.registro
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarRegistrosResponse }
     * 
     */
    public BuscarRegistrosResponse createBuscarRegistrosResponse() {
        return new BuscarRegistrosResponse();
    }

    /**
     * Create an instance of {@link RegistrarVisitantesRequest }
     * 
     */
    public RegistrarVisitantesRequest createRegistrarVisitantesRequest() {
        return new RegistrarVisitantesRequest();
    }

    /**
     * Create an instance of {@link RegistrarVisitantesResponse }
     * 
     */
    public RegistrarVisitantesResponse createRegistrarVisitantesResponse() {
        return new RegistrarVisitantesResponse();
    }

    /**
     * Create an instance of {@link BuscarRegistrosResponse.Tarea }
     * 
     */
    public BuscarRegistrosResponse.Tarea createBuscarRegistrosResponseTarea() {
        return new BuscarRegistrosResponse.Tarea();
    }

    /**
     * Create an instance of {@link ModificarRegistroRequest }
     * 
     */
    public ModificarRegistroRequest createModificarRegistroRequest() {
        return new ModificarRegistroRequest();
    }

    /**
     * Create an instance of {@link ModificarRegistroResponse }
     * 
     */
    public ModificarRegistroResponse createModificarRegistroResponse() {
        return new ModificarRegistroResponse();
    }

    /**
     * Create an instance of {@link BorrarRegistroRequest }
     * 
     */
    public BorrarRegistroRequest createBorrarRegistroRequest() {
        return new BorrarRegistroRequest();
    }

    /**
     * Create an instance of {@link BorrarRegistroResponse }
     * 
     */
    public BorrarRegistroResponse createBorrarRegistroResponse() {
        return new BorrarRegistroResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "https://registrovisitantes.mx/Registro", name = "BuscarRegistrosRequest")
    public JAXBElement<Object> createBuscarRegistrosRequest(Object value) {
        return new JAXBElement<Object>(_BuscarRegistrosRequest_QNAME, Object.class, null, value);
    }

}
