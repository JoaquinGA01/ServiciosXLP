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
import java.util.List;


@Endpoint
public class BibliotecaEndPoint {
    @Autowired
    private IReservaciones Ireservaciones;


    @PayloadRoot(namespace = "https://biblioteca.mx/Biblioteca", localPart = "RegistrarReservacionesRequest")
    @ResponsePayload
    public RegistrarReservacionesResponse saludar(@RequestPayload RegistrarReservacionesRequest nombre){
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

    @PayloadRoot(namespace = "https://biblioteca.mx/Biblioteca", localPart = "BuscarReservacionesRequest")
    @ResponsePayload
    public BuscarReservacionesResponse buscarReservaciones(){
        BuscarReservacionesResponse respuesta = new BuscarReservacionesResponse();
        
        List<Reservacion> listreservaciones = (List<Reservacion>) Ireservaciones.findAll();
        BuscarReservacionesResponse.Reservacion s = new BuscarReservacionesResponse.Reservacion();
        for(int i =0; i<listreservaciones.size();i++){
            s = new BuscarReservacionesResponse.Reservacion();
            s.setId(listreservaciones.get(i).getId());
            s.setNombre(listreservaciones.get(i).getNombre());
            s.setConcepto(listreservaciones.get(i).getConcepto());
            s.setFecha(listreservaciones.get(i).getFecha());
            s.setHoraInicio(listreservaciones.get(i).getHoraInicio());
            s.setHoraFin(listreservaciones.get(i).getHoraFin());
            s.setTiempo(listreservaciones.get(i).getTiempo());
            respuesta.getReservacion().add(s);
        }
        return respuesta;
    }
    

}