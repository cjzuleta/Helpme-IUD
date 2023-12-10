package co.edu.iudigital.helpmeIUD.app.repositories;


import co.edu.iudigital.helpmeIUD.app.models.Delito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDelitoRepository
        extends JpaRepository<Delito, Long> {
}
