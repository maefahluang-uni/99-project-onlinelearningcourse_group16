package th.mfu.auth;

import java.time.LocalDate;

public class User {
    private long id;
    private String username;

//sakdla
    private String password;
    private String name;

    private String surname;
    private LocalDate date;

    private String detail;


    public User(String username, String password, String name, String surname, LocalDate date) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.date = date;
    }
    public User(String detail) {
        this.detail = detail;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

}
