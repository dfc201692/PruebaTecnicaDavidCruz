package proyectoAspirantes.demo.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import proyectoAspirantes.demo.Entidades.Postulacion;
import proyectoAspirantes.demo.Repositorios.PostulacionRepository;

import java.util.List;

@RestController
@RequestMapping("/api/postulaciones")
public class PostulacionController {

    @Autowired
    private PostulacionRepository postulacionRepository;

    @PostMapping
    public ResponseEntity<Postulacion> postular(@RequestBody Postulacion postulacion) {
        return ResponseEntity.ok(postulacionRepository.save(postulacion));
    }

    @GetMapping("/programa/{id}")
    public List<Postulacion> listarPorPrograma(@PathVariable Long id) {
        return postulacionRepository.findByProgramaAcademicoId(id);
    }
}

