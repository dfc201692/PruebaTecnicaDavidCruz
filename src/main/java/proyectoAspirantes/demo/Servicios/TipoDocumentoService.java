package proyectoAspirantes.demo.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyectoAspirantes.demo.Entidades.TipoDocumento;
import proyectoAspirantes.demo.Repositorios.TipoDocumentoRepository;

import java.util.List;

@Service
public class TipoDocumentoService {

    @Autowired
    private TipoDocumentoRepository tipoDocumentoRepository;

    public List<TipoDocumento> listar() {
        return tipoDocumentoRepository.findAll();
    }
}
