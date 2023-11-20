package th.mfu.dto;

import th.mfu.Model.Tutor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CourseDto {
    private String courseName;
    private String courseDescription;
    private String difficulty;
    private String detail;
    private String url;
    private String imgUrl;
    private Tutor tutor;
}
