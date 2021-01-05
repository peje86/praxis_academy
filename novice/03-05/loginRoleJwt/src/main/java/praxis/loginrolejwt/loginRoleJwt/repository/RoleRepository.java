	
package praxis.loginrolejwt.loginRoleJwt.repository;
 
import java.util.Optional;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import praxis.loginrolejwt.loginRoleJwt.model.Role;
import praxis.loginrolejwt.loginRoleJwt.model.RoleName;
 
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}