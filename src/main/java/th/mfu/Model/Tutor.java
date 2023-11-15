package th.mfu.Model;



public class Tutor {

    private Long tutorId;
    private String tutorName;

    public Long getTutorId() {
        return tutorId;
    }

    public void setTutorId(Long tutorId) {
        this.tutorId = tutorId;
    }

    public String getTutorName() {
        return tutorName;
    }

    public void setTutorName(String tutorName) {
        this.tutorName = tutorName;
    }

    public String getTutorSurname() {
        return tutorSurname;
    }

    public void setTutorSurname(String tutorSurname) {
        this.tutorSurname = tutorSurname;
    }

    public String getTutorDetail() {
        return tutorDetail;
    }

    public void setTutorDetail(String tutorDetail) {
        this.tutorDetail = tutorDetail;
    }

    private String tutorSurname;


    private String tutorDetail;

    public Tutor(String tutorName, String tutorSurname) {
        this.tutorName = tutorName;
        this.tutorSurname = tutorSurname;
    }

    public Tutor(String tutorDetail) {
        this.tutorDetail = tutorDetail;
    }

    public Object getTutorDescription() {
        return null;
    }

    public void setTutorDescription(Object tutorDescription) {
    }

}
