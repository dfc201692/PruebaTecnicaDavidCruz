package proyectoAspirantes.demo.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import proyectoAspirantes.demo.Entidades.TipoDocumento;
import proyectoAspirantes.demo.Repositorios.TipoDocumentoRepository;

import java.util.List;

@RestController
@RequestMapping("/api/tipos-documentos")
public class TipoDocumentoController {

    @Autowired
    private TipoDocumentoRepository tipoDocumentoRepository;

    @GetMapping
    public List<TipoDocumento> listar() {
        return tipoDocumentoRepository.findAll();
    }
}

