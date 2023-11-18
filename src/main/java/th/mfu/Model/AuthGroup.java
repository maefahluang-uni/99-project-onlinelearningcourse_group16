package th.mfu.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;



@Entity
@Table(name = "AUTH_USER_GROUP")
public class AuthGroup {
    @Id
    @Column(name = "AUTH_USER_GROUP_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "AUTH_GROUP")
    private String authgroup;

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

    public AuthGroup(String username, String authgroup) {
        this.username = username;
        this.authgroup = authgroup;
    }
}