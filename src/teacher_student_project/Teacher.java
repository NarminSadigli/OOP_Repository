package teacher_student_project;

public class Teacher {
    private static long lastAssignedId = 100;
    private long id;
    private String name;
    private String surname;
    private String birthDate;
    private String email;

    public Teacher(String name, String surname, String birthDate, String email){
        this.id = ++lastAssignedId;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.email = email;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setId(long id){
        this.id = id;
    }
    public long getId(){
        return id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getSurname() {
        return surname;
    }
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    public String getBirthDate() {
        return birthDate;
    }
}
