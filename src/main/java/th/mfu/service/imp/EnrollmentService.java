package th.mfu.service.imp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.mfu.Model.Course;
import th.mfu.Model.Enrollment;

import th.mfu.Repository.CourseRepository;
import th.mfu.Repository.EnrollmentRepository;
import th.mfu.auth.User;
import th.mfu.auth.UserRepository;

import java.time.LocalDate;

@Service
public class EnrollmentService {

    private final EnrollmentRepository enrollmentRepository;
    private final CourseRepository courseRepository;
    private final UserRepository userRepository;

    @Autowired
    public EnrollmentService(EnrollmentRepository enrollmentRepository, CourseRepository courseRepository, UserRepository userRepository) {
        this.enrollmentRepository = enrollmentRepository;
        this.courseRepository = courseRepository;
        this.userRepository = userRepository;
    }

    public void createEnrollment(Long courseId, String username) throws Exception {
        Course course = courseRepository.findById(courseId).get();
        User user = userRepository.findByUsername(username);

        if (null != enrollmentRepository.findByCourseAndUserName(course, user)) {
            throw new Exception("You already enrolled in this course");
        }
        LocalDate date = LocalDate.now();
        Enrollment enrollment = new Enrollment(date, user, course);
        enrollmentRepository.save(enrollment);
    }
}


