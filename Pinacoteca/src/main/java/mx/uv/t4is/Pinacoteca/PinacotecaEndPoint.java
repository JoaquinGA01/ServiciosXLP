package mx.uv.t4is.Pinacoteca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import https.t4is_uv_mx.pinacoteca.AgregarEventoRequest;
import https.t4is_uv_mx.pinacoteca.AgregarEventoResponse;
import https.t4is_uv_mx.pinacoteca.ListarEventoResponse;
import https.t4is_uv_mx.pinacoteca.RegistrarArtistaRequest;
import https.t4is_uv_mx.pinacoteca.RegistrarArtistaResponse;
import https.t4is_uv_mx.pinacoteca.RegistrarVisitantesRequest;
import https.t4is_uv_mx.pinacoteca.RegistrarVisitantesResponse;

@Endpoint
public class PinacotecaEndPoint {

    @Autowired
    private IArtista iartistas;
    @Autowired
    private IEvento ieventos;
    @Autowired
    private IVisitante ivisitantes;

    
    @PayloadRoot(localPart = "AgregarEventoRequest", namespace = "https://t4is.uv.mx/pinacoteca")
     @ResponsePayload
     public AgregarEventoResponse agregarActividad(@RequestPayload AgregarEventoRequest agregar){
        AgregarEventoResponse respuesta = new AgregarEventoResponse();
         respuesta.setRespuesta("EVENTO ANOTADO EXITOSAMENTE");
         Evento evento = new Evento();
         evento.setNombre(agregar.getNombre());
         evento.setDescripcion(agregar.getDescripcion());
         evento.setFecha(agregar.getFecha());
         evento.setHora(agregar.getHora());
         evento.setCosto(agregar.getCosto());
         ieventos.save(evento);
         return respuesta;
     }

     @PayloadRoot(localPart = "RegistrarArtistaRequest", namespace = "https://t4is.uv.mx/pinacoteca")
     @ResponsePayload
     public RegistrarArtistaResponse agregarActividad(@RequestPayload RegistrarArtistaRequest agregar){
        RegistrarArtistaResponse respuesta = new RegistrarArtistaResponse();
         respuesta.setRespuesta("ARTISTA ANOTADO EXITOSAMENTE");
         Artista artista = new Artista();
         artista.setNombre(agregar.getNombre());
         artista.setApellidos(agregar.getApellidos());
         iartistas.save(artista);
         return respuesta;
     }

     @PayloadRoot(localPart = "RegistrarVisitantesRequest", namespace = "https://t4is.uv.mx/pinacoteca")
     @ResponsePayload
     public RegistrarVisitantesResponse agregarActividad(@RequestPayload RegistrarVisitantesRequest agregar){
        RegistrarVisitantesResponse respuesta = new RegistrarVisitantesResponse();
         respuesta.setRespuesta("VISITANTE ANOTADO EXITOSAMENTE");
         Visitante visitante = new Visitante();
         visitante.setNombre(agregar.getNombre());
         visitante.setFecha(agregar.getFecha());
         visitante.setAcompañantes(agregar.getAcompañantes());
         ivisitantes.save(visitante);
         return respuesta;
     }

     @PayloadRoot(localPart = "ListarEventoRequest" ,namespace = "https://t4is.uv.mx/pinacoteca")
     @ResponsePayload
     public ListarEventoResponse ListarTareas(){
        ListarEventoResponse respuesta = new ListarEventoResponse();
         Iterable<Evento> lista = ieventos.findAll();
         
         for (Evento evento : lista) {
            ListarEventoResponse.Evento a = new ListarEventoResponse.Evento();
             a.setNombre(evento.getNombre());
             a.setId(evento.getId());
             a.setDescripcion(evento.getDescripcion());
             a.setHora(evento.getHora());
             a.setCosto(evento.getCosto());
             a.setFecha(evento.getFecha());
             respuesta.getEvento().add(a);
         }
         return respuesta;
     }
    
}
