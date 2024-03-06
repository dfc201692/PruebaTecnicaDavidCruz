package proyectoAspirantes.demo.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyectoAspirantes.demo.Entidades.ProgramaAcademico;
import proyectoAspirantes.demo.Repositorios.ProgramaAcademicoRepository;

import java.util.List;

@Service
public class ProgramaAcademicoService {

    @Autowired
    private ProgramaAcademicoRepository programaAcademicoRepository;

    public List<ProgramaAcademico> listar() {
        return programaAcademicoRepository.findAll();
    }
}
