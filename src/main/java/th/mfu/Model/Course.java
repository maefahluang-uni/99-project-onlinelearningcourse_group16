package th.mfu.Model;

public class Course {

    private  Long courseId;


    private String courseName;
    private String courseDescripton;
    private String courseDetail;
    private String courseDifficulty;
    private String courseUrl;
    private String imgUrl;
    private Tutor tutor;



    public Course( String courseName, String courseDescripton, String courseDetail, String courseDifficulty, String courseUrl, String imgUrl, Tutor tutor) {
        this.courseName = courseName;
        this.courseDescripton = courseDescripton;
        this.courseDetail = courseDetail;
        this.courseDifficulty = courseDifficulty;
        this.courseUrl = courseUrl;
        this.imgUrl = imgUrl;
        this.tutor = tutor;
    }



    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescripton() {
        return courseDescripton;
    }

    public void setCourseDescripton(String courseDescripton) {
        this.courseDescripton = courseDescripton;
    }

    public String getCourseDetail() {
        return courseDetail;
    }

    public void setCourseDetail(String courseDetail) {
        this.courseDetail = courseDetail;
    }

    public String getCourseDifficulty() {
        return courseDifficulty;
    }

    public void setCourseDifficulty(String courseDifficulty) {
        this.courseDifficulty = courseDifficulty;
    }

    public String getCourseUrl() {
        return courseUrl;
    }

    public void setCourseUrl(String courseUrl) {
        this.courseUrl = courseUrl;
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
//jfkjckbsdfdfsdfsdf
