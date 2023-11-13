package th.mfu.Model;

import th.mfu.auth.User;

import java.time.LocalDate;

public class Emrollment {
    private Long enrollmentId;

//slhak
    private LocalDate enrollmentDate;
    private User userName;
    private Course course;

    public Emrollment(LocalDate enrollmentDate, User userName, Course course) {
        this.enrollmentDate = enrollmentDate;
        this.userName = userName;
        this.course = course;
    }


    public void setEnrollmentId(Long enrollmentId) {
        this.enrollmentId = enrollmentId;
    }



    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public User getUserName() {
        return userName;
    }

    public void setUserName(User userName) {
        this.userName = userName;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

}
