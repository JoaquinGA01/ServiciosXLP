package mx.uv.RegistroVisitantes;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class RegistroControlador {

    @Autowired
    private IVisitantes ivistantes;
    private ArrayList<Visitante> saludos = new ArrayList<Visitante>();

    @GetMapping("/buscarVisitante")
    public String buscarSaludo(@RequestParam(name="Tipo", defaultValue = "Sin nombre!!") String tipo) {
        Iterable<Visitante> lista2 = ivistantes.findAll();
        String lista = "";

        for(Visitante v : lista2){
            if(v.getTipo().equals(tipo)){
                lista += v.getId() + "\t" + v.getNombre() + "\t" + v.getFechaHora() + "\t" + v.getTeam() + "\n";
            }
        }
        return lista;
    }

    @PostMapping("/registrarVisitante")
    public String saludarM(@RequestParam(name="nombre", defaultValue = "Sin nombre!!") String nombre,@RequestParam(name="team") String team,@RequestParam(name="tipo") String tipo) {
        if(nombre!=null){
            Visitante s = new Visitante(nombre, team, tipo);
            ivistantes.save(s);
            saludos.add(s);
            return "Hola "+nombre + " - Nombre Registrado";
        }else{
            return "No se registro ningun Nombre";
        }
        
    }

    @PostMapping("/eliminarVisitante")
    public String elimarSaludo(@RequestParam(name="nombre", defaultValue = "Sin nombre!!") String nombre) {
        if(nombre!=null){
            ivistantes.deleteById(nombre);
            return "Nommbre = "+nombre + " - No existe";
        }else{
            return "No se elimino ningun Nombre";
        }
        
    }

    @PutMapping("/modificarVisitante")
    public String modificarSaludo(@RequestParam(name="id", defaultValue = "Sin nombre!!") String id, @RequestParam(name="nombre",defaultValue = "Sin nombre!!") String nombre, @RequestParam(name="team", defaultValue = "0") String team) {
        if(id!=null){
            if(nombre!=null){  
                if(team!=null){
                    Optional<Visitante> v = ivistantes.findById(id);
                    Visitante s = v.get();
                    s.setNombre(nombre);
                    s.setTeam(team);
                    ivistantes.save(s);
                    return "Todo Cambiado";
                }else{
                        Optional<Visitante> v = ivistantes.findById(id);
                        Visitante s = v.get();
                        s.setNombre(nombre);
                        ivistantes.save(s);
                        return "Nombre Cambiado";
                }
            }else{
                if(team!=null){
                    Optional<Visitante> v = ivistantes.findById(id);
                    Visitante s = v.get();
                    s.setTeam(team);
                    ivistantes.save(s);
                    return "Team Cambiado";
                }else{
                    return "Nada cambiado";
                }
            }
        }else{
            return "No se modifico ningun registro";
        }
        
    }
    
}
