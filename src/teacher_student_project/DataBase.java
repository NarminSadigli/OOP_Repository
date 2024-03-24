package teacher_student_project;

public class DataBase {
    private static Teacher[] teachers = new Teacher[20];
    private static int lastIndex1 = 0;

    public static void addTeacher(Teacher teacher) {
        teachers[lastIndex1++] = teacher;
    }

    public static void printTeacher() {
        for (Teacher teacher : teachers) {
            if (teacher != null) {
                System.err.println(teacher.getName() + " " + teacher.getSurname());
            }
        }
    }

    public static void addStudent(Student student) {
        students[lastIndex2++] = student;
    }

    public static void printStudent() {
        for (Student student : students) {
            if (student != null) {
                System.err.println(student.getName() + " " + student.getSurname());
            }
        }
    }

    public static Teacher[] getTeachers() {
        return teachers;
    }

    public static void setTeachers(Teacher[] teachers) {
        DataBase.teachers = teachers;
    }

    public static Student[] getStudents() {
        return students;
    }

    public static void setStudents(Student[] students) {
        DataBase.students = students;
    }

    public static TeacherStudent[] getTeacherStudents() {
        return teacherStudents;
    }

    public static void setTeacherStudents(TeacherStudent[] teacherStudents) {
        DataBase.teacherStudents = teacherStudents;
    }

    private static Student[] students = new Student[20];
    private static int lastIndex2 = 0;

    private static TeacherStudent[] teacherStudents = new TeacherStudent[20];
    private static int lastIndex3 = 0;

    public static void addTeacherStudents(TeacherStudent teacherStudent) {
        teacherStudents[lastIndex3++] = teacherStudent;
    }


    public static Teacher getTeacherById(long teacherId) {
        for (Teacher teacher : teachers) {
            if (teacher.getId() == teacherId) {
                return teacher;
            }
        }
        return null;
    }

    public static Student getStudentById(long studentId) {
        for (Student student : students) {
            if (student.getId() == studentId) {
                return student;
            }
        }
        return null;
    }


    public static void teachersTeachOneStudent(long studentId) {
        for (TeacherStudent i : teacherStudents) {
            for (Student student : students) {
                if (i != null) {
                    if (student != null) {
                        if (student.getId() == studentId) {
                            System.out.println(i.getTeacher().getName() + " " + i.getTeacher().getSurname());
                        }
                    }
                }
            }
        }
    }
    public static void studentsTaughtByTeacher(long teacherId) {
        for (TeacherStudent i : teacherStudents) {
            for (Teacher teacher : teachers) {
                if (i != null) {
                    if (teacher != null) {
                        if (teacher.getId() == teacherId) {
                            System.out.println(i.getStudent().getName() + " " + i.getStudent().getSurname());
                        }
                    }
                }
            }
        }
    }

}

