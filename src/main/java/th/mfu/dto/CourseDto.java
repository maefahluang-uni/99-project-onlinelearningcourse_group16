package th.mfu.dto;

import th.mfu.Model.Tutor;

public class CourseDto {
    private String courseName;
    private String courseDescription;
    private String difficulty;
    private String detail;
    private String url;
    private String imgUrl;
    private Tutor tutor;
    public CourseDto(String courseName, String courseDescription, String difficulty, String detail, String url, String imgUrl, Tutor tutor) {
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.difficulty = difficulty;
        this.detail = detail;
        this.url = url;
        this.imgUrl = imgUrl;
        this.tutor = tutor;
    }
    public String getCourseName() {
        return null;
    }
    public String getCourseDescription() {
        return null;
    }
    public String getDetail() {
        return null;
    }
    public String getDifficulty() {
        return null;
    }
    public Tutor getTutor() {
        return null;
    }
    public void setTutor(Tutor current) {
    }
}
