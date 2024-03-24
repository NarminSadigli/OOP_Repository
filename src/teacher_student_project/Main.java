package teacher_student_project;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (true){
            printMenu();
            int option = scanner.nextInt();
            switch(option){
                case 1: addTeacher(); break;
                case 2: addStudent(); break;
                case 3: addTeacherStudent(); break;
                case 4: printTeachers(); break;
                case 5: printStudents(); break;
                case 6: teachersTeachOneStudent(); break;
                case 7: studentsTaughtByTeacher(); break;
                case 8:
                    System.exit(0);
                default:
                    System.err.println("invalid option");
            }
        }
    }
    public static void addTeacher(){
        Scanner scanner = new Scanner(System.in);
        Teacher teacher = createTeacher(scanner);
        DataBase.addTeacher(teacher);
    }
    public static void addStudent(){
        Scanner scanner = new Scanner(System.in);
        Student student = createStudent(scanner);
        DataBase.addStudent(student);
    }

    public static void printMenu(){
        String menu = ("1. Create a new teacher" +
                       "\n2. Create a new student" +
                       "\n3. Create a new Teacher-Student connection" +
                       "\n4. Show the list of the teachers" +
                       "\n5. Show the list of the students" +
                       "\n6. Show the list of the teachers for one student" +
                       "\n7. Show the list of the students of one teacher" +
                       "\n8. Quit the program");
        System.out.println(menu);
    }

    public static Teacher createTeacher(Scanner scanner){

        System.err.print("Enter the name of the teacher: ");
        String teacherName = scanner.next();
        System.err.print("Enter the surname of the teacher: ");
        String teacherSurname = scanner.next();
        System.err.print("Enter the birthdate of the teacher: ");
        String teacherBirthDate = scanner.next();
        System.err.print("Enter the email of the teacher: ");
        String teacherEmail = scanner.next();
        Teacher teacher = new Teacher(teacherName, teacherSurname, teacherBirthDate, teacherEmail);
        long teacherId = teacher.getId();
        System.err.println("Teacher's ID: " + teacherId);
        return teacher;
    }

    public static Student createStudent(Scanner scanner){
        System.err.print("Enter the name of the student: ");
        String studentName = scanner.next();
        System.err.print("Enter the surname of the student: ");
        String studentSurname = scanner.next();
        System.err.print("Enter the birthdate of the student: ");
        String studentBirthDate = scanner.next();
        System.err.print("Enter the email of the student: ");
        String studentEmail = scanner.next();
        Student student = new Student(studentName, studentSurname, studentBirthDate, studentEmail);
        long studentId = student.getId();
        System.err.println("Student's ID: " + studentId);
        return student;
    }

    public static void printTeachers(){
        DataBase.printTeacher();
    }
    public static void printStudents(){
        DataBase.printStudent();
    }

    public static void addTeacherStudent() {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the ID of the teacher: ");
        long teacherId = scanner.nextLong();

        System.out.print("Enter the ID of the student: ");
        long studentId = scanner.nextLong();

        Teacher teacher = DataBase.getTeacherById(teacherId);
        Student student = DataBase.getStudentById(studentId);

        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Student ID: " + studentId);

        if (teacher != null && student != null) {
            System.out.print("Enter the class number: ");
            String classNumber = scanner.next();
            System.out.print("Enter the subject: ");
            String subject = scanner.next();
            TeacherStudent teacherStudent = new TeacherStudent(teacher, student, classNumber, subject);

            System.out.println("Teacher-student relationship created successfully.");
            DataBase.addTeacherStudents(teacherStudent);
        } else{
            System.err.println("Invalid teacher or student ID.");
        }
    }
    public static void teachersTeachOneStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the ID of the student: ");
        long studentId = scanner.nextLong();
        Student student = DataBase.getStudentById(studentId);
        if (student != null){
            DataBase.teachersTeachOneStudent(studentId);
        }
    }
    public static void studentsTaughtByTeacher(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the ID of the teacher: ");
        long teacherId = scanner.nextLong();
        Student student = DataBase.getStudentById(teacherId);
        if (student != null){
            DataBase.studentsTaughtByTeacher(teacherId);
        }
    }

}


