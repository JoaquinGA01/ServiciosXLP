package mx.uv.t4is.Biblioteca;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import https.biblioteca_mx.biblioteca.RegistrarReservacionesResponse;
import https.biblioteca_mx.biblioteca.RegistrarReservacionesRequest;
import https.biblioteca_mx.biblioteca.RegistrarVisitantesRequest;
import https.biblioteca_mx.biblioteca.RegistrarVisitantesResponse;
import https.biblioteca_mx.biblioteca.BuscarReservacionesResponse;
import https.biblioteca_mx.biblioteca.BuscarReservacionesRequest;
import https.biblioteca_mx.biblioteca.BorrarReservacionesResponse;
import https.biblioteca_mx.biblioteca.BorrarReservacionesRequest;
import https.biblioteca_mx.biblioteca.ListarServicioResponse;
import https.biblioteca_mx.biblioteca.AgregarServicioResponse;
import https.biblioteca_mx.biblioteca.AgregarServicioRequest;
import https.biblioteca_mx.biblioteca.EliminarServicioResponse;
import https.biblioteca_mx.biblioteca.EliminarServicioRequest;
import java.util.List;


@Endpoint
public class BibliotecaEndPoint {
    @Autowired
    private IReservaciones Ireservaciones;
    @Autowired
    private IRegistro Iregistro;
    @Autowired
    private IServicios iservicios;


    //Seccion Reservaciones
    @PayloadRoot(namespace = "https://Biblioteca.mx/Biblioteca", localPart = "RegistrarReservacionesRequest")
    @ResponsePayload
    public RegistrarReservacionesResponse reservar(@RequestPayload RegistrarReservacionesRequest nombre){
        RegistrarReservacionesResponse respuesta = new RegistrarReservacionesResponse();
        respuesta.setRespuesta("Hola  " + nombre.getNombre());
        Reservacion s = new Reservacion();
        s.setNombre(nombre.getNombre());
            s.setConcepto(nombre.getConcepto());
            s.setFecha(nombre.getFecha());
            s.setHoraInicio(nombre.getHoraInicio());
            s.setHoraFin(nombre.getHoraFin());
            s.setTiempo(nombre.getTiempo());
        Ireservaciones.save(s);
        return respuesta;
    }

    @PayloadRoot(namespace = "https://Biblioteca.mx/Biblioteca", localPart = "BuscarReservacionesRequest")
    @ResponsePayload
    public BuscarReservacionesResponse buscarReservaciones(){
        BuscarReservacionesResponse respuesta = new BuscarReservacionesResponse();
        
        List<Reservacion> listreservaciones = (List<Reservacion>) Ireservaciones.findAll();
        BuscarReservacionesResponse.Reservacion s = new BuscarReservacionesResponse.Reservacion();
        for(Reservacion r : listreservaciones){
            s = new BuscarReservacionesResponse.Reservacion();
            s.setId(r.getId());
            s.setNombre(r.getNombre());
            s.setConcepto(r.getConcepto());
            s.setFecha(r.getFecha());
            s.setHoraInicio(r.getHoraInicio());
            s.setHoraFin(r.getHoraFin());
            s.setTiempo(r.getTiempo());
            respuesta.getReservacion().add(s);    
        }
        /*for(int i =0; i<listreservaciones.size();i++){
            s = new BuscarReservacionesResponse.Reservacion();
            s.setId(listreservaciones.get(i).getId());
            s.setNombre(listreservaciones.get(i).getNombre());
            s.setConcepto(listreservaciones.get(i).getConcepto());
            s.setFecha(listreservaciones.get(i).getFecha());
            s.setHoraInicio(listreservaciones.get(i).getHoraInicio());
            s.setHoraFin(listreservaciones.get(i).getHoraFin());
            s.setTiempo(listreservaciones.get(i).getTiempo());
            respuesta.getReservacion().add(s);
        }*/
        return respuesta;
    }

    @PayloadRoot(namespace = "https://Biblioteca.mx/Biblioteca", localPart = "BorrarReservacionesRequest")
    @ResponsePayload
    public BorrarReservacionesResponse borrarReservaciones(@RequestPayload BorrarReservacionesRequest nombre){
        BorrarReservacionesResponse respuesta = new BorrarReservacionesResponse();
        Ireservaciones.deleteById(nombre.getId());
        respuesta.setRespuesta("Elemento Eliminado");
        return respuesta;
    }
    

    //Seccion Registro Visitantes
    @PayloadRoot(namespace = "https://Biblioteca.mx/Biblioteca", localPart = "RegistrarVisitantesRequest")
    @ResponsePayload
    public RegistrarVisitantesResponse registrarVisitantes(@RequestPayload RegistrarVisitantesRequest nombre){
        RegistrarVisitantesResponse respuesta = new RegistrarVisitantesResponse();
        Registro s = new Registro();
        s.setNombre(nombre.getNombre());
        s.setFecha(nombre.getFechaDdMmAa());
        s.setParejas(nombre.getParejas());
        Iregistro.save(s);
        return respuesta;

   }


    //Secion Servicios
    @PayloadRoot(localPart = "AgregarServicioRequest", namespace = "https://Biblioteca.mx/Biblioteca")
     @ResponsePayload
     public AgregarServicioResponse agregarActividad(@RequestPayload AgregarServicioRequest agregar){
         AgregarServicioResponse respuesta = new AgregarServicioResponse();
         respuesta.setRespuesta("SERVICIO ANOTADO EXITOSAMENTE");
         Servicios servicio = new Servicios();
         servicio.setNombre(agregar.getNombre());
         servicio.setMotivo(agregar.getMotivo());
         servicio.setTiempo(agregar.getTiempo());
         servicio.setFecha(agregar.getFecha());
         iservicios.save(servicio);
         return respuesta;
        }
     


    @PayloadRoot(localPart = "ListarServicioRequest" ,namespace = "https://Biblioteca.mx/Biblioteca")
     @ResponsePayload
     public ListarServicioResponse ListarTareas(){
        ListarServicioResponse respuesta = new ListarServicioResponse();
         Iterable<Servicios> lista = iservicios.findAll();
         
         for (Servicios servicio : lista) {
            ListarServicioResponse.Servicio a = new ListarServicioResponse.Servicio();
             a.setNombre(servicio.getNombre());
             a.setId(servicio.getId());
             a.setMotivo(servicio.getMotivo());
             a.setTiempo(servicio.getTiempo());
             a.setFecha(servicio.getFecha());
             respuesta.getServicio().add(a);
         }
         return respuesta;
     }

    @PayloadRoot(localPart = "EliminarServicioRequest", namespace = "https://Biblioteca.mx/Biblioteca")
      @ResponsePayload
      public EliminarServicioResponse eliminarActividad(@RequestPayload EliminarServicioRequest eliminar){
          EliminarServicioResponse respuesta = new EliminarServicioResponse();
          iservicios.deleteById(eliminar.getId());
          respuesta.setRespuesta("ACTIVIDAD ELIMINADA EXITOSAMENTE");
          return respuesta;
      }
}