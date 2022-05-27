package mx.uv.RegistroVisitantes;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@Entity
public class Visitante {

    @Id
    private String id;
    private String Nombre;
    private String FechaHora;
    private String team;

    public Visitante(){

        
    }

    public Visitante(String nombre, String team) {
        String letras = generarCodigoJugador();
        this.id = nombre+letras.charAt(0);
        this.Nombre = nombre;
        this.team = team;
        this.FechaHora = obtenerFechaHora();
    }

    public String getId() {
        return id;
    }

    public void setId(String nombre) {
        String letras = generarCodigoJugador();
        this.id = nombre+letras.charAt(0);
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getFechaHora() {
        return FechaHora;
    }

    public void setFechaHora(String FechaHora) {
        this.FechaHora = FechaHora;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    
    private String generarCodigoJugador(){
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

    private String obtenerFechaHora(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        return dtf.format(LocalDateTime.now()).toString();
    }
    
}
