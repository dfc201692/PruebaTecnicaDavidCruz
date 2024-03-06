package proyectoAspirantes.demo.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import proyectoAspirantes.demo.Entidades.ProgramaAcademico;
import proyectoAspirantes.demo.Repositorios.ProgramaAcademicoRepository;

import java.util.List;

@RestController
@RequestMapping("/api/programas-academicos")
public class ProgramaAcademicoController {

    @Autowired
    private ProgramaAcademicoRepository programaAcademicoRepository;

    @GetMapping
    public List<ProgramaAcademico> listar() {
        return programaAcademicoRepository.findAll();
    }
}

