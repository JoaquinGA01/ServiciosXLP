//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.06.02 a las 07:54:37 PM CDT 
//


package https.biblioteca_mx.biblioteca;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.biblioteca_mx.biblioteca package. 
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

    private final static QName _BuscarRegistrosRequest_QNAME = new QName("https://Biblioteca.mx/Biblioteca", "BuscarRegistrosRequest");
    private final static QName _ListarServicioRequest_QNAME = new QName("https://Biblioteca.mx/Biblioteca", "ListarServicioRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.biblioteca_mx.biblioteca
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
     * Create an instance of {@link BuscarReservacionesResponse }
     * 
     */
    public BuscarReservacionesResponse createBuscarReservacionesResponse() {
        return new BuscarReservacionesResponse();
    }

    /**
     * Create an instance of {@link ListarServicioResponse }
     * 
     */
    public ListarServicioResponse createListarServicioResponse() {
        return new ListarServicioResponse();
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
     * Create an instance of {@link BuscarRegistrosResponse.Registro }
     * 
     */
    public BuscarRegistrosResponse.Registro createBuscarRegistrosResponseRegistro() {
        return new BuscarRegistrosResponse.Registro();
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
     * Create an instance of {@link RegistrarReservacionesRequest }
     * 
     */
    public RegistrarReservacionesRequest createRegistrarReservacionesRequest() {
        return new RegistrarReservacionesRequest();
    }

    /**
     * Create an instance of {@link RegistrarReservacionesResponse }
     * 
     */
    public RegistrarReservacionesResponse createRegistrarReservacionesResponse() {
        return new RegistrarReservacionesResponse();
    }

    /**
     * Create an instance of {@link BuscarReservacionesRequest }
     * 
     */
    public BuscarReservacionesRequest createBuscarReservacionesRequest() {
        return new BuscarReservacionesRequest();
    }

    /**
     * Create an instance of {@link BuscarReservacionesResponse.Reservacion }
     * 
     */
    public BuscarReservacionesResponse.Reservacion createBuscarReservacionesResponseReservacion() {
        return new BuscarReservacionesResponse.Reservacion();
    }

    /**
     * Create an instance of {@link BorrarReservacionesRequest }
     * 
     */
    public BorrarReservacionesRequest createBorrarReservacionesRequest() {
        return new BorrarReservacionesRequest();
    }

    /**
     * Create an instance of {@link BorrarReservacionesResponse }
     * 
     */
    public BorrarReservacionesResponse createBorrarReservacionesResponse() {
        return new BorrarReservacionesResponse();
    }

    /**
     * Create an instance of {@link AgregarServicioRequest }
     * 
     */
    public AgregarServicioRequest createAgregarServicioRequest() {
        return new AgregarServicioRequest();
    }

    /**
     * Create an instance of {@link AgregarServicioResponse }
     * 
     */
    public AgregarServicioResponse createAgregarServicioResponse() {
        return new AgregarServicioResponse();
    }

    /**
     * Create an instance of {@link ListarServicioResponse.Servicio }
     * 
     */
    public ListarServicioResponse.Servicio createListarServicioResponseServicio() {
        return new ListarServicioResponse.Servicio();
    }

    /**
     * Create an instance of {@link EliminarServicioRequest }
     * 
     */
    public EliminarServicioRequest createEliminarServicioRequest() {
        return new EliminarServicioRequest();
    }

    /**
     * Create an instance of {@link EliminarServicioResponse }
     * 
     */
    public EliminarServicioResponse createEliminarServicioResponse() {
        return new EliminarServicioResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "https://Biblioteca.mx/Biblioteca", name = "BuscarRegistrosRequest")
    public JAXBElement<Object> createBuscarRegistrosRequest(Object value) {
        return new JAXBElement<Object>(_BuscarRegistrosRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "https://Biblioteca.mx/Biblioteca", name = "ListarServicioRequest")
    public JAXBElement<Object> createListarServicioRequest(Object value) {
        return new JAXBElement<Object>(_ListarServicioRequest_QNAME, Object.class, null, value);
    }

}
