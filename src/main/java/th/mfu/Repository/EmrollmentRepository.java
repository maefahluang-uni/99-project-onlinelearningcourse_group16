package th.mfu.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import th.mfu.Model.Course;
import th.mfu.Model.Emrollment;
import th.mfu.auth.User;

import java.util.List;

public interface EmrollmentRepository extends JpaRepository<Emrollment, Long> {

    List<Emrollment> findAllByCourse(Course course);

    List<Emrollment> findAllByUserName(User user);

    Emrollment findByCourseAndUserName(Course course, User user);
}