package utn.estudiantes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import utn.estudiantes.modelo.Estudiante;

public interface IEstudianteRepositorio extends JpaRepository<Estudiante,Integer> {
}
