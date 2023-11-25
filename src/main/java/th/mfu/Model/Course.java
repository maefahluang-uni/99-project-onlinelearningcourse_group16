package th.mfu.Model;


import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.time.LocalDate;






@Entity
@Table(name = "course")
public class Course {

    @Id
    @Column(name = "courseId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;

    @Column(name = "name", nullable = false, unique = true)
    private String courseName;

    @Column(name = "description")
    private String courseDescription;

    @Column(name = "detail")
    private String courseDetail;

    @Column(name = "difficulty")
    private String courseDifficulty;

    @Column(name = "url")
    private String courseUrl;

    private String imgUrl;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tutorId", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Tutor tutor;

    public Course(String courseName, String courseDescription, String courseDetail, String courseDifficulty, String courseUrl, String imgUrl, Tutor tutor) {
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.courseDetail = courseDetail;
        this.courseDifficulty = courseDifficulty;
        this.courseUrl = courseUrl;
        this.imgUrl = imgUrl;
        this.tutor = tutor;
    }
}
