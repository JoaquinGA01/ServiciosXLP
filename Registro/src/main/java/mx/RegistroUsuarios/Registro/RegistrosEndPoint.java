package mx.RegistroUsuarios.Registro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import https.registrovisitantes_mx.registro.RegistrarVisitantesRequest;
import https.registrovisitantes_mx.registro.RegistrarVisitantesResponse;

@Endpoint
public class RegistrosEndPoint {
    @Autowired
    private IRegistro IRegistros;

    @PayloadRoot(namespace = "https://registrovisitantes.mx/Registro", localPart = "RegistrarVisitantesRequest")
    @ResponsePayload
    public RegistrarVisitantesResponse saludar(@RequestPayload RegistrarVisitantesRequest nombre){
        RegistrarVisitantesResponse respuesta = new RegistrarVisitantesResponse();
        respuesta.setRespuestaId("Hola" + nombre.getNombre());
        Registro s = new Registro();//BuscarSaludosResponse.Saludos s = new BuscarSaludosResponse.Saludos();
        //s.setId(generarCodigo());
        s.setNombre(nombre.getNombre());
        IRegistros.save(s); //saludos.add(s);
        return respuesta;
    }
}
