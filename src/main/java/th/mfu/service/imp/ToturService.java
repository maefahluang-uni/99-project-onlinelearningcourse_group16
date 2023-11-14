package th.mfu.service.imp;

import java.time.LocalDate;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import th.mfu.AuthGroupRepository;
import th.mfu.Model.Tutor;
import th.mfu.auth.AuthGroup;
import th.mfu.auth.User;
import th.mfu.auth.UserRepository;
import th.mfu.dto.UserDto;

public class ToturService {
    private final UserRepository userRepository;
    private final AuthGroupRepository authGroupRepository;

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
        AuthGroup group = new AuthGroup();

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

    public void patch(User user) {
        User current = userRepository.findByUsername(user.getUsername());

        current.setDetail(user.getDetail());

        userRepository.save(current);
    }
}
