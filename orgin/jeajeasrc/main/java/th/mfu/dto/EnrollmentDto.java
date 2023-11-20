package th.mfu.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import th.mfu.Model.Course;
import th.mfu.auth.User;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EnrollmentDto {
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;
    private User user;
    private Course course;
}
