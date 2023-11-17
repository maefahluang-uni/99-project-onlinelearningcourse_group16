package th.mfu.service.imp;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;

import th.mfu.Model.Course;
import th.mfu.Model.Enrollment;
import th.mfu.Model.User;
import th.mfu.Repository.CourseRepository;
import th.mfu.Repository.EmrollmentRepository;
import th.mfu.auth.UserRepository;

public class EnrollmentService {
     private EmrollmentRepository enrollmentRepository;
    private CourseRepository courseRepository;
    private UserRepository userRepository;

    @Autowired
    public EnrollmentService(EmrollmentRepository enrollmentRepository, CourseRepository courseRepository, UserRepository userRepository) {
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
    

