package pt.iade.unimanage.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TeacherRepository {
    private static ArrayList<Teacher> teachers = new ArrayList<Teacher>();
                                Teacher t;
    public static void population() {
    Teacher s; // auxiliary variable
    s = new Teacher("Joao", 'M', LocalDate.parse("2000-05-24"));
    s.setEmail("john@gmail.com");
    teachers.add(s);
    teachers.add(new Teacher("Miguel", 'M', LocalDate.parse("1999-12-23")));
    s = new Teacher("Maria", 'F', LocalDate.parse("2001-07-02"));
    teachers.add(s);
    }
            
    public static List<Teacher> getTeachers() {
        return teachers;
    } 
    public static Teacher getTeacher(int mecNumber) {
        for (Teacher teacher: teachers)
            if (teacher.getMecNumber() == mecNumber)
                return teacher;
        return null;
    } 
    public static boolean deleteTeache(int mecNumber){
        return teachers.removeIf(
            (s) -> s.getMecNumber() == mecNumber);
    }
    public static Teacher addTeacherUnit(Teacher teacher) {
        teachers.add(teacher);
        return teacher;
    }
}