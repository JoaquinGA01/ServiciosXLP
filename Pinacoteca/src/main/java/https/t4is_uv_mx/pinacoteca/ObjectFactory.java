//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.24 a las 11:19:18 AM CDT 
//


package https.t4is_uv_mx.pinacoteca;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.t4is_uv_mx.pinacoteca package. 
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

    private final static QName _ListarEventoRequest_QNAME = new QName("https://t4is.uv.mx/pinacoteca", "ListarEventoRequest");
    private final static QName _ListarVisitantesRequest_QNAME = new QName("https://t4is.uv.mx/pinacoteca", "ListarVisitantesRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.t4is_uv_mx.pinacoteca
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarEventoResponse }
     * 
     */
    public ListarEventoResponse createListarEventoResponse() {
        return new ListarEventoResponse();
    }

    /**
     * Create an instance of {@link ListarVisitantesResponse }
     * 
     */
    public ListarVisitantesResponse createListarVisitantesResponse() {
        return new ListarVisitantesResponse();
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
     * Create an instance of {@link RegistrarArtistaRequest }
     * 
     */
    public RegistrarArtistaRequest createRegistrarArtistaRequest() {
        return new RegistrarArtistaRequest();
    }

    /**
     * Create an instance of {@link RegistrarArtistaResponse }
     * 
     */
    public RegistrarArtistaResponse createRegistrarArtistaResponse() {
        return new RegistrarArtistaResponse();
    }

    /**
     * Create an instance of {@link AgregarEventoRequest }
     * 
     */
    public AgregarEventoRequest createAgregarEventoRequest() {
        return new AgregarEventoRequest();
    }

    /**
     * Create an instance of {@link AgregarEventoResponse }
     * 
     */
    public AgregarEventoResponse createAgregarEventoResponse() {
        return new AgregarEventoResponse();
    }

    /**
     * Create an instance of {@link ListarEventoResponse.Evento }
     * 
     */
    public ListarEventoResponse.Evento createListarEventoResponseEvento() {
        return new ListarEventoResponse.Evento();
    }

    /**
     * Create an instance of {@link ListarVisitantesResponse.Visitante }
     * 
     */
    public ListarVisitantesResponse.Visitante createListarVisitantesResponseVisitante() {
        return new ListarVisitantesResponse.Visitante();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "https://t4is.uv.mx/pinacoteca", name = "ListarEventoRequest")
    public JAXBElement<Object> createListarEventoRequest(Object value) {
        return new JAXBElement<Object>(_ListarEventoRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "https://t4is.uv.mx/pinacoteca", name = "ListarVisitantesRequest")
    public JAXBElement<Object> createListarVisitantesRequest(Object value) {
        return new JAXBElement<Object>(_ListarVisitantesRequest_QNAME, Object.class, null, value);
    }

}
