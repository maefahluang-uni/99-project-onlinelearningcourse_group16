package th.mfu.auth;

import org.springframework.data.jpa.repository.JpaRepository;

import th.mfu.Model.User;


public interface UserRepository extends JpaRepository<User,Long> {
    public User  findByUsername(String username);
    public User findByEmail(String email);


}
