package mx.uv.t4is.Agora;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class BibliotecaC {

    @GetMapping("/")
    public String bienvenido(Model modelo){
		//modelo.addAttribute("Thnombre","");
		return "index.html";        
    }

}


