package dataBase;

import system.Course;
import system.Student;
import system.Teacher;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class AdminAPI {
    private final DataBase db=DataBase.getInstance();

    public void addTeacher( Teacher teacher){
        db.teachers.put(teacher.getId(),teacher);
    }
    public boolean removeTeacher(String id){
        if(db.teachers.get(id)!=null) {
            db.teachers.remove(id);
        }
        else {
            System.out.println(" no Teacher to remove");
            return false;
        }
        return true;
    }
    public  void viewAllTeachers(){
        for(Map.Entry<String, Teacher> teacherEntry:db.teachers.entrySet()){
            Teacher teacher=teacherEntry.getValue();
            System.out.println("system.Teacher: "+teacher.getName()+" id: "+teacher.getId()+" email: "+teacher.getEmail()+" mobile number:  "+teacher.getMobileNumber());
        }
    }

    public void viewTeacherDetails(String id){
        if(db.teachers.get(id)!=null) {
            Teacher teacher = db.teachers.get(id);
            System.out.println("system.Teacher: " + teacher.getName() + " id: " + teacher.getId() + " email: " + teacher.getEmail() + " mobile number:  " + teacher.getMobileNumber());
        }
        else{
            System.out.println("there's no such teacher");
        }
    }
    public boolean updateTeacherData( String id, String email, String mobileNumber){
        if(db.teachers.get(id)!=null){
            Teacher teacher=db.teachers.get(id);
            teacher.setEmail(email);
            teacher.setMobileNumber(mobileNumber);
        }
        else {
            System.out.println("please check the inserted ID! ");
            return false;
        }
        return true;
    }
    public void addStudent( Student student){
        db.students.put(student.getId(),student);
    }

    public boolean removeStudent(String id){
        if(db.students.get(id)!=null){
            db.students.remove(id);
        }
        else{
            System.out.println(" no Student to remove");
            return false;
        }
        return true;
    }
    public  void viewAllStudents(){
        for(Map.Entry<String, Student> studentEntry:db.students.entrySet()){
            Student student=studentEntry.getValue();
            System.out.println("system.Teacher: "+student.getName()+" id: "+student.getId()+" email: "+student.getEmail()+" mobile number:  "+student.getMobileNumber());
        }
    }

    public void viewStudentDetails(String id){
        if(db.students.get(id)!=null) {
            Student student = db.students.get(id);
            System.out.println(" id: " + student.getId() + "Name: " + student.getName() + " age: " + student.getAge() + " gender: " + student.getGender() + " email: " + student.getEmail() + " mobile number:  " + student.getMobileNumber() + " address: " + student.getAddress());
        }
        else{
            System.out.println("there is no such student!");
        }
    }
    public boolean updateStudentData( String id, String email, String mobileNumber, String address){
        if(db.students.get(id)!=null){
            Student student=db.students.get(id);
            student.setEmail(email);
            student.setMobileNumber(mobileNumber);
            student.setAddress(address);
        }
        else {
            System.out.println("please check the inserted ID! ");
            return false;
        }
        return true;
    }
    public void addCourse(Course course){
        db.courses.put(course.getId(),course);
    }

    public boolean addTeacherToCourse(String courseId, String teacherId){
        if (db.courses.get(courseId)==null){
            System.out.println("this course doesn't exist");
            return false;
        }
        if(db.teachers.get(teacherId)==null){
            System.out.println("there is no teacher with this id");
            return false;
        }
        Course course=db.courses.get(courseId);
        course.addTeacher(teacherId);
        return true;
    }
    public boolean addStudentToCourse(String courseId,String studentId){
        // check for course existence
//        HashMap<String,Student> students=db.students;
//        HashMap<String,Course> courses=db.courses;
        if(db.courses.get(courseId)!=null){
            if(db.students.get(studentId)!=null){
                Course course= db.courses.get(courseId);
                course.addStudent(studentId);
                Student student=db.students.get(studentId);
                student.addCourse(course.getId());
                course.addStudent(studentId);
            }
            else{
                System.out.println("there is no student to add");
                return false;
            }
        }
        else{
            return false;
        }
        return true;
    }
    public Teacher teacherObject(String teacherId){
        return db.teachers.get(teacherId);
    }
    public Student studentObject(String studentId){
        return db.students.get(studentId);
    }
    public void getAllClasses(){
        for (Map.Entry<String,Course> courseEntry:db.courses.entrySet()){
            Course course=courseEntry.getValue();
            System.out.println("course Name:"+course.getName());
        }
    }
}
