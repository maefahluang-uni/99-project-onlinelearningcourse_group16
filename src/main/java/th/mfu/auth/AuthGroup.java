package th.mfu.auth;



public class AuthGroup {

    private long id;
    private String username;
    private String authgroup;

   
    public AuthGroup() {
        this.username = username;
        this.authgroup = authgroup;
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
