package th.mfu.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import th.mfu.Model.Tutor;

public interface TutorRepository extends JpaRepository<Tutor, Long> {
}