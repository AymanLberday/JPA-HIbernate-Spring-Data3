package ma.ayman.JPA.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ma.ayman.JPA.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
    @Query("SELECT r FROM Role r WHERE r.roleName = :roleName")
    Role FindByRoleName(String roleName);
}
