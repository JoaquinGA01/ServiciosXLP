package mx.uv.RegistroVisitantes;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class RegistroC {
    @GetMapping("/")
    public String bienvenido(Model modelo){
		//modelo.addAttribute("Thnombre","");
		return "index.html";        
    }
}