package th.mfu.dto;



import org.springframework.format.annotation.DateTimeFormat;
import th.mfu.Model.Course;
import th.mfu.Model.User;

import java.util.Date;


public class EnrollmentDto {
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;
    private User user;
    private Course course;
    public EnrollmentDto(Date date, User user, Course course) {
        this.date = date;
        this.user = user;
        this.course = course;
    }
}
