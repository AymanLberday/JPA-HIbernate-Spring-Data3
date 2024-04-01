package ma.ayman.JPA.repositories;

import ma.ayman.JPA.entities.User;
import ma.ayman.JPA.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User,String> {
    User findByUserName(String userName);
}

