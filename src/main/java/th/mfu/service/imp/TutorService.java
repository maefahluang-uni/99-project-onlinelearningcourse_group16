package th.mfu.service.imp;

import org.springframework.stereotype.Service;
import th.mfu.Model.Tutor;
import th.mfu.Repository.TutorRepository;
import th.mfu.dto.TutorDto;

import java.util.List;

@Service
public class TutorService {

    private TutorRepository tutorRepository;

    public TutorService(TutorRepository tutorRepository) {
        this.tutorRepository = tutorRepository;
    }

    public void create(TutorDto tutorDto) {
        String name = tutorDto.getName();
        String surname = tutorDto.getSurname();
        String email = tutorDto.getEmail();
        String description = tutorDto.getDescription();
        String imgUrl = tutorDto.getImgUrl();
        Tutor tutor = new Tutor(name, surname, email, description, imgUrl);

        tutorRepository.save(tutor);
    }

    public List<Tutor> getAll() {
        return tutorRepository.findAll();
    }

    public void update(Tutor tutor) {
        Tutor currentTutor = tutorRepository.findById(tutor.getTutorId()).get();

        currentTutor.setTutorName(tutor.getTutorName());
        currentTutor.setTutorSurname(tutor.getTutorSurname());
        currentTutor.setTutorEmail(tutor.getTutorEmail());
        currentTutor.setTutorDescription(tutor.getTutorDescription());
        currentTutor.setImgUrl(tutor.getImgUrl());

        tutorRepository.save(currentTutor);
    }

    public void patch(Tutor tutor) {
        Tutor current = tutorRepository.findById(tutor.getTutorId()).get();

        current.setTutorDetail(tutor.getTutorDetail());

        tutorRepository.save(current);
    }

    public void delete(Tutor tutor) {
        tutorRepository.delete(tutor);
    }

}