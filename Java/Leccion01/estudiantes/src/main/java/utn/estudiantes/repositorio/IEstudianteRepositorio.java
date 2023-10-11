package utn.estudiantes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import utn.estudiantes.modelo.Estudiantes2022;

public interface IEstudianteRepositorio extends JpaRepository<Estudiantes2022,Integer> {
}
