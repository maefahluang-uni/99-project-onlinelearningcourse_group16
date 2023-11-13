package th.mfu.auth;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import th.mfu.AuthGroupRepository;

public class LearningUserDetailsService implements UserDetailsService {

        private final UserRepository userRepository;
        private final AuthGroupRepository authGroupRepository;

        public LearningUserDetailsService(UserRepository userRepository, AuthGroupRepository authGroupRepository) {
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
            //
        }

        @Override
        public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'loadUserByUsername'");
        }
    }


