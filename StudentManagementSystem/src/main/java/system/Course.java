package system;

import dataBase.CourseAPI;
import system.Assignmnet;

import java.util.HashMap;
import java.util.LinkedList;

public class Course {
    private String id;
    private String name;
    private LinkedList<String> students=new LinkedList<>();
    private LinkedList<String> teachers=new LinkedList<>();
    private final CourseAPI courseAPI=new CourseAPI();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<String> getStudents() {
        return students;
    }

    public void setStudents(LinkedList<String> students) {
        this.students = students;
    }

    public LinkedList<String> getTeachers() {
        return teachers;
    }

    public void setTeachers(LinkedList<String> teachers) {
        this.teachers = teachers;
    }
    public void addTeacher(String teacherId){
        teachers.add(teacherId);
    }
    public void addStudent(String studentId){
        students.add(studentId);
    }
    public void addAssignment(Assignmnet assignment){
        courseAPI.addAssignment(assignment);
    }

}
