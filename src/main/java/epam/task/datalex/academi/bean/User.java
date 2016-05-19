package epam.task.datalex.academi.bean;


public class User {
    private String name;
    private String pswd;

    public User() {
    }

    public User(String pswd, String name) {
        this.pswd = pswd;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }
}
