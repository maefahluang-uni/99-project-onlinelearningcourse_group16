package th.mfu;

public interface  AuthGroupRepository extends JpaRepository<AuthGroup, Long>{
    List<AuthGroup> findByUsername(String username);

}
