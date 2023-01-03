package ua.edu.ucu.apps.lab73.appUser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ua.edu.ucu.apps.lab73.appUser.AppUser;

import java.util.Optional;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Integer> {
    Optional<AppUser> findUserByEmail(String email);
//    @Query("SELECT u FROM app_user u WHERE u.email = ?1")
}
