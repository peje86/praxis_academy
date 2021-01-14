	
package project.lokerku.loker.repository;

import java.util.Optional;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import project.lokerku.loker.model.Role;
import project.lokerku.loker.model.RoleName;
 
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}