package proyectoAspirantes.demo.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import proyectoAspirantes.demo.Entidades.TipoDocumento;

public interface TipoDocumentoRepository extends JpaRepository<TipoDocumento, Long> {
}

