package parte1.tareas.usuarios.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;
import parte1.tareas.usuarios.Modelos.Usuario;
import parte1.tareas.usuarios.Servicios.Impl.UsuarioServiceImpl;


@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioServiceImpl usuarioServiceImpl;

    @PostMapping("/guardar")
    public Usuario guardarUsuario(@RequestBody Usuario usuario){
        if(usuario.getPerfil() != null){
            usuario.setPerfil(usuario.getPerfil());
        }
        return this.usuarioServiceImpl.guardarUsuario(usuario);
    }

    @DeleteMapping("/delete/{codigoUsuario}")
    public String eliminarUsuario(@PathVariable(name = "codigoUsuario") String codigoUsuario) {
        return this.usuarioServiceImpl.eliminarUsuario(codigoUsuario);
    }

    @GetMapping("/obtener/{codigoUsuario}")
    public Usuario obtenerUsuario(@PathVariable(name = "codigoUsuario") String codigoUsuario) {
        return this.usuarioServiceImpl.obtenerUsuario(codigoUsuario);
    }

    @PutMapping("/actualizar")
    public String actualizarUsuario(@RequestBody Usuario usuarioActualizado, @RequestParam(name = "codigoUsuario") String codigoUsuario) {
        return this.usuarioServiceImpl.actualizarUsuario(usuarioActualizado, codigoUsuario);
    }
}
