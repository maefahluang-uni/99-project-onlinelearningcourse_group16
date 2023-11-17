package th.mfu.service.imp;

import java.time.LocalDate;
import java.util.List;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import th.mfu.AuthGroupRepository;
import th.mfu.Model.AuthGroup;
import th.mfu.Model.Tutor;
import th.mfu.Model.User;
import th.mfu.auth.UserRepository;
import th.mfu.dto.TutorDto;
import th.mfu.dto.UserDto;

public class ToturService {
    private  UserRepository userRepository;
    private  AuthGroupRepository authGroupRepository;

    public ToturService(UserRepository userRepository, AuthGroupRepository authGroupRepository) {
        this.userRepository = userRepository;
        this.authGroupRepository = authGroupRepository;
    }

    public void createUser(UserDto userDto) throws IllegalStateException {

        if (null != userRepository.findByUsername(userDto.getUsername())) {
            throw new IllegalStateException("There is already a userName with name " + userDto.getUsername());
        } else if (null != userRepository.findByEmail(userDto.getEmail())) {
            throw new IllegalStateException("There is already a userName with the email " + userDto.getEmail());
        }
        
        String username = userDto.getUsername();
        String password = new BCryptPasswordEncoder(11).encode(userDto.getPassword());
        String name = userDto.getName();
        String surname = userDto.getSurname();
        String email = userDto.getEmail();

        LocalDate date = LocalDate.now();
        User user = new User(username, password, name, surname, email, date);
        AuthGroup group = new AuthGroup(email, email);

        group.setUsername(userDto.getUsername());
        group.setAuthgroup("USER");

        userRepository.save(user);
        authGroupRepository.save(group);
    }

    public void update(Tutor tutor) {
        User current = userRepository.findByUsername(tutor.getUsername());

        current.setName(tutor.getName());
        current.setSurname(tutor.getUsername());
        current.setEmail(tutor.getEmail());
        current.setImgUrl(tutor.getImgUrl());

        userRepository.save(current);
    }

    public void patch(Tutor current2) {
        User current = userRepository.findByUsername(current2.getUsername());

        current.setEmail(current2.getEmail());

        userRepository.save(current);
    }

    public void delete(Tutor tutorActual) {
    }

    public List<Tutor> getAll() {
        return getAll();
    }

    public void create(TutorDto tutor) {
        
    }
}
