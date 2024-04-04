package parte1.tareas.usuarios.Controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class prueba {
    
    @GetMapping("/prueba")
    public String pruebaApi(){
        return "Funciona";
    }
}
