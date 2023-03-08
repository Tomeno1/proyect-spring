package proyectequipo.proyectoequipoign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class ProyectoequipoignApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoequipoignApplication.class, args);
	}
	@GetMapping
		String holamundo(){
			return "Holando mundo";
		}
}
