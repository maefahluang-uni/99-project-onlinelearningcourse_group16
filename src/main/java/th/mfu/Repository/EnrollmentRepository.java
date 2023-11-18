package th.mfu.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import th.mfu.Model.Course;
import th.mfu.Model.Enrollment;
import th.mfu.auth.User;

import java.util.List;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {

    List<Enrollment> findAllByCourse(Course course);
    List<Enrollment> findAllByUserName(User user);
    Enrollment findByCourseAndUserName(Course course, User user);
}