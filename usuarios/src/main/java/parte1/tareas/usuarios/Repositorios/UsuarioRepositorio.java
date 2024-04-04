package parte1.tareas.usuarios.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import parte1.tareas.usuarios.Modelos.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, String>{
    
}