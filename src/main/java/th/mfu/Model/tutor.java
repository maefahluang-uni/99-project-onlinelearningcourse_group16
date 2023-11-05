package th.mfu.Model;

public class tutor {
    private String password;
    private String name;
    private String email;

    public tutor(String password, String name, String email) {
        this.password = password;
        this.name = name;
        this.email = email;
    }

    public String getId() {
        return password;
    }

    public void setId(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
