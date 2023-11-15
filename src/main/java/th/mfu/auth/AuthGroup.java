package th.mfu.auth;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class AuthGroup {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String username;
    private String authgroup;

   
    public AuthGroup(String username, String authgroup) {
        this.username = username;
        this.authgroup = authgroup;
    }


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
}