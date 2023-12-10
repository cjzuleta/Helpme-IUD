package co.edu.iudigital.helpmeIUD.app.repositories;


import co.edu.iudigital.helpmeIUD.app.models.Caso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // ambigüo
public interface ICasoRepository
        extends JpaRepository<Caso, Long> {
}
