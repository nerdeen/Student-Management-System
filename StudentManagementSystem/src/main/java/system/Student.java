package system;

import dataBase.StudentAPI;
import system.AssignmentSubmission;
import system.Assignmnet;
import system.Course;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
public class Student {
    private String id;
    private String name;
    private String email;
    private String mobileNumber;
    private int age;
    private String address;
    private String gender;
    private LinkedList<String> coursesId=new LinkedList<>();
    private final StudentAPI studentAPI=new StudentAPI();
    private static int count=0;
//    private LinkedList<Assignment>assignments=new LinkedList<Assignment>();
    public Student(){
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void viewEnrolledCourses(){
        studentAPI.viewEnrolledCourses(coursesId);
    }

    public void viewAssignments(String courseId){
       studentAPI.viewAssignments(courseId);
    }

    public boolean submitAssignment(AssignmentSubmission assignmentSubmission){
        return studentAPI.submitAssignment(assignmentSubmission);
    }
    // added from me
    public void addCourse(String courseId){
        coursesId.add(courseId);
    }


}
