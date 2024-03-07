package proyectoAspirantes.demo.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import proyectoAspirantes.demo.Entidades.Aspirante;
import proyectoAspirantes.demo.Repositorios.AspiranteRepository;
import proyectoAspirantes.demo.Servicios.AspiranteService;

import java.util.List;
@CrossOrigin(origins = "http://127.0.0.1:5501")
@RestController
@RequestMapping("/api/aspirantes")
public class AspiranteController {

    @Autowired
    private AspiranteRepository aspiranteRepository;

    @Autowired
    private AspiranteService aspiranteService;

    @PostMapping
    public ResponseEntity<Aspirante> registrar(@RequestBody Aspirante aspirante) {
        return ResponseEntity.ok(aspiranteRepository.save(aspirante));
    }


    @GetMapping
    public ResponseEntity<List<Aspirante>> obtenerTodos() {
        List<Aspirante> aspirantes = aspiranteService.obtenerTodos();
        return ResponseEntity.ok(aspirantes);
    }
}

