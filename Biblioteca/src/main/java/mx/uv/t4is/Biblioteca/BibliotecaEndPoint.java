package mx.uv.t4is.Biblioteca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import https.biblioteca_mx.biblioteca.RegistrarVisitantesRequest;
import https.biblioteca_mx.biblioteca.RegistrarVisitantesResponse;

@Endpoint
public class BibliotecaEndPoint {
    @Autowired
    private IRegistro IRegistros;


    @PayloadRoot(namespace = "https://biblioteca.mx/Biblioteca", localPart = "")
    @ResponsePayload
    public RegistrarVisitantesResponse saludar(@RequestPayload RegistrarVisitantesRequest nombre){
        RegistrarVisitantesResponse respuesta = new RegistrarVisitantesResponse();
        respuesta.setRespuestaId("Hola  " + nombre.getNombre());
        Registro s = new Registro();
        s.setNombre(nombre.getNombre());
        IRegistros.save(s);
        return respuesta;
    }

}