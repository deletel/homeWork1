package main;

public class User {
    public static int totalOnline;
    private String email;
    private String name;
    private String surname;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public User(String email, String name, String surname) {
        this();
        this.email = email;
        this.name = name;
        this.surname = surname;
    }

    public User() {
        totalOnline++;
    }

}
