package parte1.tareas.usuarios.Servicios.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import parte1.tareas.usuarios.Modelos.Usuario;
import parte1.tareas.usuarios.Repositorios.UsuarioRepositorio;
import parte1.tareas.usuarios.Servicios.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Override
    public Usuario guardarUsuario(Usuario usuario) {
        return this.usuarioRepositorio.save(usuario);
    }

    @Override
    public String eliminarUsuario(String codigoUsuario) {
        Usuario usrEliminar = this.usuarioRepositorio.findById(codigoUsuario).get();

        if(usrEliminar != null){
            this.usuarioRepositorio.delete(usrEliminar);
            return "Usuario eliminado";
        }
        return "Usuario no existe";
    }

    @Override
    public Usuario obtenerUsuario(String codigoUsuario) {
        Usuario usuario = this.usuarioRepositorio.findById(codigoUsuario).get();
        return usuario;
    }

    @Override
    public String actualizarUsuario(Usuario usuarioActualizado, String codigoUsuario) {
        Usuario usrActualizar = this.usuarioRepositorio.findById(codigoUsuario).get();


        if(usrActualizar != null){
            usrActualizar.setDepartamento(usuarioActualizado.getDepartamento());
            usrActualizar.setTelefono(usuarioActualizado.getTelefono());
            this.usuarioRepositorio.save(usrActualizar);
            return "Usuario actualizado";
        }

        return "Usuario no existe";
    }
    
}
