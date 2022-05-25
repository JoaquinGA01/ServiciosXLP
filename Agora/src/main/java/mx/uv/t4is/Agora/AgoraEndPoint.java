package mx.uv.t4is.Agora;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import https.t4is_uv_mx.agora.AgregarEventoRequest;
import https.t4is_uv_mx.agora.AgregarEventoResponse;
import https.t4is_uv_mx.agora.ListarEventoResponse;
import https.t4is_uv_mx.agora.ListarVisitantesResponse;
import https.t4is_uv_mx.agora.RegistrarPeliculaRequest;
import https.t4is_uv_mx.agora.RegistrarPeliculaResponse;
import https.t4is_uv_mx.agora.RegistrarVisitantesRequest;
import https.t4is_uv_mx.agora.RegistrarVisitantesResponse;

@Endpoint
public class AgoraEndPoint {
    @Autowired
    private IPelicula ipeliculas;
    @Autowired
    private IEvento ieventos;
    @Autowired
    private IVisitante ivisitantes;

    
    @PayloadRoot(localPart = "AgregarEventoRequest", namespace = "https://t4is.uv.mx/agora")
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

     @PayloadRoot(localPart = "RegistrarPeliculaRequest", namespace = "https://t4is.uv.mx/agora")
     @ResponsePayload
     public RegistrarPeliculaResponse agregarActividad(@RequestPayload RegistrarPeliculaRequest agregar){
        RegistrarPeliculaResponse respuesta = new RegistrarPeliculaResponse();
         respuesta.setRespuesta("PLEÍCULA ANOTADA EXITOSAMENTE");
         Pelicula pelicula = new Pelicula();
         pelicula.setNombre(agregar.getNombre());
         pelicula.setFecha(agregar.getFecha());
         pelicula.setHora(agregar.getHora());
         ipeliculas.save(pelicula);
         return respuesta;
     }

     @PayloadRoot(localPart = "RegistrarVisitantesRequest", namespace = "https://t4is.uv.mx/agora")
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

     @PayloadRoot(localPart = "ListarEventoRequest" ,namespace = "https://t4is.uv.mx/agora")
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

     @PayloadRoot(localPart = "ListarVisitantesRequest" ,namespace = "https://t4is.uv.mx/agora")
     @ResponsePayload
     public ListarVisitantesResponse ListarVisitas(){
        ListarVisitantesResponse respuesta = new ListarVisitantesResponse();
         Iterable<Visitante> lista = ivisitantes.findAll();
         
         for (Visitante visitante : lista) {
            ListarVisitantesResponse.Visitante a = new ListarVisitantesResponse.Visitante();
             a.setId(visitante.getId());
             a.setNombre(visitante.getNombre());
             a.setFecha(visitante.getFecha());
             a.setAcompañantes(visitante.getAcompañantes());
             respuesta.getVisitante().add(a);
         }
         return respuesta;
     }
}
