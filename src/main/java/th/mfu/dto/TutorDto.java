package th.mfu.dto;

public class TutorDto {


    private String name;

    private String surname;
    private String description;
    public TutorDto(String name, String surname, String description) {
        this.name = name;
        this.surname = surname;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
