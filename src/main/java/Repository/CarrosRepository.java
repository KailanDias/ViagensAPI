package Repository;

import Model.Carros;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarrosRepository extends JpaRepository<Carros, Integer> {
}
