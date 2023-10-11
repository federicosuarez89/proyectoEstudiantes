package utn.estudiantes.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
//boilerplate - Codigo Repetitivo
@Data //Crea los getter y setter esta anotacion
@NoArgsConstructor //Esta anotacion crea el constructor vacio
@AllArgsConstructor //Se crea el constructor con todos los argumentos
@ToString //Se crea el metodo ToString
public class Estudiantes2022 {
    //Atibutos de clase
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idestudiantes2022;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
} //Fin clase Estudiante
