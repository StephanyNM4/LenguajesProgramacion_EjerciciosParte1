package parte1.tareas.usuarios.Modelos;

import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Id
    @Column(name = "codigousuario")
    private String codigoUsuario;

    private String nombre;

    private String apellido;

    private String departamento;

    private String correo;

    private String telefono;

    @Column(name = "fechainscripcion")
    private Date fechaInscripcion;

    @OneToOne(cascade =  CascadeType.ALL)
    @JoinColumn(name = "idperfil", referencedColumnName = "idperfil")
    private Perfil perfil;


}
