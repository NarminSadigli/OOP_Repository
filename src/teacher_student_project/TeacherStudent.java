package teacher_student_project;

public class TeacherStudent {
    private static long lastAssignedId = 200;
    private long id;
    private Teacher teacher;
    private Student student;
    private String subject;
    private String classNumber;
    public TeacherStudent(Teacher teacher, Student student, String subject, String classNumber){
        this.id = ++lastAssignedId;
        this.teacher = teacher;
        this.student = student;
        this.subject = subject;
        this.classNumber = classNumber;
    }
    public void setId(long id){
        this.id = id;
    }
    public long getId(){
        return id;
    }
    public void setTeacher(Teacher teacher){
        this.teacher = teacher;
    }
    public Teacher getTeacher(){
        return teacher;
    }
    public void setStudent(Student student){
        this.student = student;
    }
    public Student getStudent(){
        return student;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public String getSubject(){
        return subject;
    }
    public void setClassNumber(String classNumber){
        this.classNumber = classNumber;
    }
    public String getClassNumber(){
        return classNumber;
    }
}
