package th.mfu.auth;

public class EzLearningUserDetailsService {

    public class EzLearningUserDetailsService implements UserDetailsService {

        private final UserRepository userRepository;
        private final AuthGroupRepository authGroupRepository;

        public EzLearningUserDetailsService(UserRepository userRepository, AuthGroupRepository authGroupRepository) {
            super();
            this.userRepository = userRepository;
            this.authGroupRepository = authGroupRepository;

            @Override
            public UserDetails loadUserByUsername (String username) throws UsernameNotFoundException {
                User user = this.userRepository.findByUsername(username);
                if (user == null) {
                    throw new UsernameNotFoundException("UserName not found:" + username);
                }
                List<AuthGroup> authGroups = this.authGroupRepository.findByUsername(username);
                return new UserPrincipal(user, authGroups);
            }
        }
    }
}
//xcvxcvxcv
//dfgdfgd