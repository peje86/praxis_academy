package contoh.jwt.contohJwt.repository;

import contoh.jwt.contohJwt.model.Role;
import contoh.jwt.contohJwt.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}