package system;

import dataBase.TeacherAPI;
import system.Assignmnet;
import system.Course;
import system.CourseAttendance;
import system.Student;

import java.util.*;

public class Teacher {
    private String id;
    private String name;
    private String email;
    private String mobileNumber;

    private final TeacherAPI teacherAPI=new TeacherAPI();
    private  static int count=0;
    public Teacher(){
        setId(Integer.toString(count));
        count++;
    }
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void viewStudentsAssignedClasses(){
        teacherAPI.viewStudentsAssignedClasses(id);
    }

    public void getStudentsInCourse(String courseId){
        teacherAPI.getStudentsInCourse(courseId);
    }

    public void getAllClasses(){
        teacherAPI.getAllClasses(id);
    }

    public void getStudentData(String studentId){
        teacherAPI.getStudentData(studentId);
    }

    public void addAssignment(Assignmnet assignment){
        teacherAPI.addAssignment(assignment);
    }

    public void submitStudentsAttendance(LinkedList<CourseAttendance> courseAttendance){
        teacherAPI.submitStudentsAttendance(courseAttendance);
    }

    /////////////////////////////// functions from me ////////////////////////////////////////////////////

    public boolean addStudentToCourse(String courseId,String studentId){
        return teacherAPI.addStudentToCourse(courseId,studentId,id);
    }


    public void addStudent(Course course,String studentId){
        course.addStudent(studentId);
    }

}
