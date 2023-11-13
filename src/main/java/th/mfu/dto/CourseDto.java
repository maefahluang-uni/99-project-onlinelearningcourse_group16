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
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getCourseDescription() {
        return courseDescription;
    }
    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }
    public String getDifficulty() {
        return difficulty;
    }
    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
    public String getDetail() {
        return detail;
    }
    public void setDetail(String detail) {
        this.detail = detail;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getImgUrl() {
        return imgUrl;
    }
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
    public Tutor getTutor() {
        return tutor;
    }
    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

   
    
}
