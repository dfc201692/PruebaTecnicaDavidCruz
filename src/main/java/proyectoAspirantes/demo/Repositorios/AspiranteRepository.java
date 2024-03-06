package proyectoAspirantes.demo.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import proyectoAspirantes.demo.Entidades.Aspirante;

public interface AspiranteRepository extends JpaRepository<Aspirante, Long> {
}
