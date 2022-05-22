package Repository;

import model.AuthenticationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AuthenticationRepository extends JpaRepository<AuthenticationToken,Integer> {
}
