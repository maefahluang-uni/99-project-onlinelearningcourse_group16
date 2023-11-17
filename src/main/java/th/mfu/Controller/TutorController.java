package th.mfu.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import th.mfu.Model.Course;
import th.mfu.Model.Tutor;
import th.mfu.Repository.CourseRepository;
import th.mfu.Repository.TutorRepository;
import th.mfu.dto.TutorDto;
import th.mfu.service.imp.ToturService;

import java.util.List;

@Controller
@RequestMapping("/tutors")
public class TutorController {
    private ToturService tutorService;
    private TutorRepository tutorRepository;
    private CourseRepository courseRepository;

    @Autowired
    public TutorController(ToturService tutorService, TutorRepository tutorRepository,
                           CourseRepository courseRepository) {
        this.tutorService = tutorService;
        this.tutorRepository = tutorRepository;
        this.courseRepository = courseRepository;
    }

    @GetMapping("/add")
    @PreAuthorize("hasRole('ROLE_USER')")
    public String addProfesor(Model model) {
        model.addAttribute("tutor", new TutorDto());
        return "tutors/tutor-add";
    }

    @PostMapping("/save")
    @PreAuthorize("hasRole('ROLE_USER')")
    public String saveTutor(TutorDto tutor) {
        tutorService.create(tutor);

        return "redirect:/tutors";
    }

    @GetMapping("/edit/{tutorId}")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String getTutorForUpdate(@PathVariable Long tutorId,
                                    Model model) {
        try {
            Tutor tutorActual = tutorRepository.findById(tutorId).get();
            model.addAttribute("tutor", tutorActual);
            return "tutors/tutor-edit";
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("error", e);
            return "error";
        }
    }

    @PostMapping("/update/{tutorId}")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String updateTutor(@PathVariable Long tutorId,
                              Tutor tutor, RedirectAttributes attributes, Model model) {

        try {
            Tutor currentTutor = tutorRepository.findById(tutorId).get();
            currentTutor.setTutorName(tutor.getTutorName());
            currentTutor.setTutorSurname(tutor.getTutorSurname());
            currentTutor.setTutorDescription(tutor.getTutorDescription());

            tutorService.update(tutor);
            attributes.addAttribute("tutorId", tutorId);

            return "redirect:/tutors/{tutorId}";
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("error", e);
            return "error";
        }


    }

    @PostMapping("/patch/{tutorId}")
    public String patchTutor(@PathVariable Long tutorId, Tutor tutor, RedirectAttributes attributes, Model model) {

        try {
            Tutor current = tutorRepository.findById(tutorId).get();
            current.setTutorDetail(tutor.getTutorDetail());
            tutorService.patch(current);

            attributes.addAttribute("tutorId", tutorId);
            return "redirect:/tutors/{tutorId}";
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("error", e);
            return "error";
        }
    }

    @GetMapping("/delete/{tutorId}")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String deleteTutor(@PathVariable Long tutorId, Model model) {
        try {
            Tutor tutorActual = tutorRepository.findById(tutorId).get();
            tutorService.delete(tutorActual);

            return "redirect:/tutors";
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("error", e);
            return "error";
        }
    }

    @GetMapping("/{tutorId}")
    @PreAuthorize("hasRole('ROLE_USER')")
    public String getTutorDetail(@PathVariable Long tutorId, Model model) {
        try {
           Tutor tutor = tutorRepository.findById(tutorId).get();
            model.addAttribute("tutor", tutor);
            List<Course> courses = courseRepository.findAllByTutor(tutor);
            model.addAttribute("courses", courses);
            return "tutors/tutor-detail";
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("error", e);
            return "error";
        }

    }
}
