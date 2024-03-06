package proyectoAspirantes.demo.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyectoAspirantes.demo.Entidades.Aspirante;
import proyectoAspirantes.demo.Entidades.Postulacion;
import proyectoAspirantes.demo.Entidades.ProgramaAcademico;
import proyectoAspirantes.demo.Repositorios.PostulacionRepository;

import java.util.Date;
import java.util.List;

@Service
public class PostulacionService {

    @Autowired
    private PostulacionRepository postulacionRepository;

    public void postular(Aspirante aspirante, ProgramaAcademico programaAcademico) {
        Postulacion postulacion = new Postulacion();
        postulacion.setAspirante(aspirante);
        postulacion.setProgramaAcademico(programaAcademico);
        postulacion.setFechaPostulacion(new Date());
        postulacionRepository.save(postulacion);
    }

    public List<Postulacion> listarPorPrograma(ProgramaAcademico programaAcademico) {
        return postulacionRepository.findByProgramaAcademico(programaAcademico);
    }



    /* En la interfaz PostulacionRepository:
    @Query("SELECT p FROM Postulacion p WHERE p.programaAcademico = :programaAcademico")
    List<Postulacion> findByProgramaAcademico(@Param("programaAcademico") ProgramaAcademico programaAcademico);
*/
}

