package th.mfu.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import th.mfu.Model.Course;
import th.mfu.Model.Tutor;
import th.mfu.service.imp.CourseService;
import th.mfu.service.imp.ToturService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class APIController {

    private ToturService tutorService;
    private CourseService courseService;

    @Autowired
    public APIController(ToturService tutorService, CourseService courseService) {
        super();
        this.tutorService = tutorService;
        this.courseService = courseService;
    }

    @GetMapping("/tutors")
    public List<Tutor> getAllTutors() { 
        return this.tutorService.getAll(); 
    }

    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return this.courseService.getAll();
    }
}