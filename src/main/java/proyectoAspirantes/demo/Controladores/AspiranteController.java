package proyectoAspirantes.demo.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import proyectoAspirantes.demo.Entidades.Aspirante;
import proyectoAspirantes.demo.Repositorios.AspiranteRepository;

@RestController
@RequestMapping("/api/aspirantes")
public class AspiranteController {

    @Autowired
    private AspiranteRepository aspiranteRepository;

    @PostMapping
    public ResponseEntity<Aspirante> registrar(@RequestBody Aspirante aspirante) {
        return ResponseEntity.ok(aspiranteRepository.save(aspirante));
    }

    // ...
}

