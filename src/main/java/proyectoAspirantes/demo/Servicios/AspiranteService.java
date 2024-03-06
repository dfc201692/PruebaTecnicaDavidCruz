package proyectoAspirantes.demo.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyectoAspirantes.demo.Entidades.Aspirante;
import proyectoAspirantes.demo.Repositorios.AspiranteRepository;

import java.util.Date;

@Service
public class AspiranteService {

    @Autowired
    private AspiranteRepository aspiranteRepository;

    public void registrar(Aspirante aspirante) {
        aspirante.setFechaRegistro(new Date());
        aspiranteRepository.save(aspirante);
    }
}
