package proyectoAspirantes.demo.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import proyectoAspirantes.demo.Entidades.Postulacion;
import proyectoAspirantes.demo.Entidades.ProgramaAcademico;

import java.util.List;

public interface PostulacionRepository extends JpaRepository<Postulacion, Long> {
    List<Postulacion> findByProgramaAcademicoId(Long id);

    List<Postulacion> findByProgramaAcademico(ProgramaAcademico programaAcademico);
}

