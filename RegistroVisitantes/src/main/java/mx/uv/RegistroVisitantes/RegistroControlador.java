package mx.uv.RegistroVisitantes;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistroControlador {
    private ArrayList<Visitante> saludos = new ArrayList<Visitante>();

    @GetMapping("/buscarVisitante")
    public ArrayList<Visitante> buscarSaludo() {
        return saludos;
    }

    @GetMapping("/registrarVisitante")
    public String saludarM(@RequestParam(name="nombre", defaultValue = "Sin nombre!!") String nombre,@RequestParam(name="team", defaultValue = "Sin nombre!!") int team) {
        if(nombre!=null){
            Visitante s = new Visitante(nombre, team);
            saludos.add(s);
            return "Hola "+nombre + " - Nombre Registrado";
        }else{
            return "No se registro ningun Nombre";
        }
        
    }

    @GetMapping("/eliminarVisitante")
    public String elimarSaludo(@RequestParam(name="nombre", defaultValue = "Sin nombre!!") String nombre) {
        if(nombre!=null){
            for(int i=0;i<saludos.size();i++){
                if(nombre.equals(saludos.get(i).getId())){
                    saludos.remove(i);
                    return "Nommbre = "+nombre + " - ha sido eliminado";
                }
            }
            return "Nommbre = "+nombre + " - No existe";
        }else{
            return "No se elimino ningun Nombre";
        }
        
    }

    @GetMapping("/modificarVisitante")
    public String modificarSaludo(@RequestParam(name="nombre", defaultValue = "Sin nombre!!") String nombre, @RequestParam(name="nombre2") String nombre2,@RequestParam(name="team", defaultValue = "Sin nombre!!") int team) {
        if(nombre!=null){
            for(int i=0;i<saludos.size();i++){
                if(nombre.equals(saludos.get(i).getId())){
                    saludos.get(i).setId(nombre2);
                    saludos.get(i).setTeam(team);
                    return "Nommbre = "+nombre + " - ha sido modificado a - " + nombre2 ;
                }
            }
            return "Nommbre = "+nombre + " - No existe";
        }else{
            return "No se modifico ningun Nombre";
        }
        
    }
    
}
