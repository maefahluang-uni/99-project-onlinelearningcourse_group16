package th.mfu.auth;
import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
@Entity
@Table(name = "AUTH_USER_GROUP")
public class AuthGroup {
    @Id
    @Column(name = "AUTH_USER_GROUP_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "USERNAME")
    private String username;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAuthgroup() {
        return authgroup;
    }

    public void setAuthgroup(String authgroup) {
        this.authgroup = authgroup;
    }

    @Column(name = "AUTH_GROUP")
    private String authgroup;

    public AuthGroup(String username, String authgroup) {
        this.username = username;
        this.authgroup = authgroup;
    }
}