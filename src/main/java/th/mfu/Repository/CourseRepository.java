package th.mfu.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import th.mfu.Model.Course;
import th.mfu.Model.Tutor;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {

    Course findByCourseName(String name);
    List<Course> findAllByTutor(Tutor tutor);
}