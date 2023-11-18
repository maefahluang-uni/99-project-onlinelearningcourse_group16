package th.mfu;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import th.mfu.Model.AuthGroup;

public interface  AuthGroupRepository extends JpaRepository<AuthGroup, Long>{
    List<AuthGroup> findByUsername(String username);
    List<String> findAuthoritiesByUsername(String username);
    
   

}

