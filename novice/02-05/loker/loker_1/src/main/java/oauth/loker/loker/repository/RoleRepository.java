package oauth.loker.loker.repository;

import oauth.loker.loker.model.Role;
import oauth.loker.loker.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long>{
    Optional<Role>findByName(RoleName roleName);

}

