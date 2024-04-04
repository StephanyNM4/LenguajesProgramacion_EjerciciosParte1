package parte1.tareas.usuarios.Modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import ch.qos.logback.core.subst.Token.Type;
import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "perfiles")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Perfil {
    
    @Id
    @Column(name = "idperfil")
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int idPerfil;

    private String rol;

    private String descripcion;

    @JsonIgnore
    @OneToOne(mappedBy = "perfil")
    private Usuario usuario;

}
