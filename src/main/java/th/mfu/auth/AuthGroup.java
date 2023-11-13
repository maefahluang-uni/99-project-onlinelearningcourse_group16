package th.mfu.auth;



public class AuthGroup {

    private long id;
    private String username;
    private String authgroup;

    public AuthGroup(String username, String authgroup) {
        this.username = username;
        this.authgroup = authgroup;
    }
}
