package th.mfu.auth;

import org.springframework.data.jpa.repository.JpaRepository;

import th.mfu.Model.AuthGroup;

import java.util.List;


public interface AuthGroupRepository extends JpaRepository<AuthGroup, Long> {
    List<AuthGroup> findByUsername(String username);

}
