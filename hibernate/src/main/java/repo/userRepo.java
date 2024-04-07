package repo;

import org.example.hibernate.users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepo extends JpaRepository<users,Integer> {
}
