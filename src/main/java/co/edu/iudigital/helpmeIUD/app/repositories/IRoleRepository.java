package co.edu.iudigital.helpmeIUD.app.repositories;


import co.edu.iudigital.helpmeIUD.app.models.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleRepository
        extends CrudRepository<Role, Long> {
}
