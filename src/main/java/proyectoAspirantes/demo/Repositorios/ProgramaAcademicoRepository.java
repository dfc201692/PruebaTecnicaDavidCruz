package proyectoAspirantes.demo.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import proyectoAspirantes.demo.Entidades.ProgramaAcademico;

public interface ProgramaAcademicoRepository extends JpaRepository<ProgramaAcademico, Long> {
}
