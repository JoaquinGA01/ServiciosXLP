package mx.uv.t4is.Pinacoteca;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class PinacotecaC {
    @GetMapping("/")
    public String bienvenido(Model modelo){
		//modelo.addAttribute("Thnombre","");
		return "index.html";        
    }
}
