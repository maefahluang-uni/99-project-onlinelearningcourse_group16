package th.mfu.auth;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
<<<<<<<< HEAD:src/main/java/th/mfu/auth/LearningUserDetailsService.java
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import th.mfu.AuthGroupRepository;

public class LearningUserDetailsService implements UserDetailsService {
========

public class LearningUser implements UserDetailsService {
>>>>>>>> 5e90eabfcaada4b4169f94f73c5ef6cfe5b75ff4:src/main/java/th/mfu/auth/LearningUser.java

        private final UserRepository userRepository;
        private final AuthGroupRepository authGroupRepository;

<<<<<<<< HEAD:src/main/java/th/mfu/auth/LearningUserDetailsService.java
        public LearningUserDetailsService(UserRepository userRepository, AuthGroupRepository authGroupRepository) {
========
        public LearningUser(UserRepository userRepository, AuthGroupRepository authGroupRepository) {
>>>>>>>> 5e90eabfcaada4b4169f94f73c5ef6cfe5b75ff4:src/main/java/th/mfu/auth/LearningUser.java
            super();
            this.userRepository = userRepository;
            this.authGroupRepository = authGroupRepository;


            public UserDetails loadUserByUsername (String username) throws UsernameNotFoundException {
                User user = this.userRepository.findByUsername(username);
                if (user == null) {
                    throw new UsernameNotFoundException("UserName not found:" + username);
                }
                List<AuthGroup> authGroups = this.authGroupRepository.findByUsername(username);
                return new UserPrincipal(user, authGroups);
            }
           
        }

        @Override
        public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'loadUserByUsername'");
        }
    }


