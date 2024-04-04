package parte1.tareas.usuarios.Servicios;

import parte1.tareas.usuarios.Modelos.Usuario;

public interface UsuarioService {
    
    public Usuario guardarUsuario(Usuario usuario);

    public String eliminarUsuario(String codigoUsuario);

    public Usuario obtenerUsuario(String codigoUsuario);

    public String actualizarUsuario(Usuario usuarioActualizado, String codigoUsuario);
}
