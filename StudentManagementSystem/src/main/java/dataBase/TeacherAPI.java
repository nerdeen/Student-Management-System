package dataBase;

import system.Assignmnet;
import system.Course;
import system.CourseAttendance;
import system.Student;

import java.util.*;

public class TeacherAPI {
    private final DataBase db=DataBase.getInstance();

    public void viewStudentsAssignedClasses(String id ){
        // send id from teacher
//        HashMap<String, Course> courses=db.courses;
//        HashMap<String, Student> students=db.students;
        for (Map.Entry<String,Course> courseEntry:db.courses.entrySet()){
            Course course=courseEntry.getValue();
            LinkedList<String> teachersIds=course.getTeachers();
            if(teachersIds.indexOf(id)>0){
                LinkedList <String> studentsIds=course.getStudents();
                System.out.println("course Name:"+course.getName());
                for(String studentId:studentsIds){
                    Student student=db.students.get(studentId);
                    System.out.println("student ID: "+student.getId()+" student name: "+student.getName());
                }
            }
        }
    }

    public void getStudentsInCourse(String courseId){
/*       HashMap<String,Course> courses=db.courses;
         HashMap<String,Student> students=db.students;
*/
        Course course=db.courses.get(courseId);
        LinkedList<String> courseStudents=course.getStudents();
        for(String studentId:courseStudents){
            Student student=db.students.get(studentId);
            System.out.println(" id: "+student.getId()+"Name: "+student.getName());

        }
    }

    public void getAllClasses(String id){
        // send id from teacher
//        HashMap<String,Course> courses=db.courses;
        for (Map.Entry<String,Course> courseEntry:db.courses.entrySet()){
            Course course=courseEntry.getValue();
            LinkedList<String>teachersIds=course.getTeachers();
            if(teachersIds.indexOf(id)>0){
                LinkedList <String> studentsIds=course.getStudents();
                System.out.println("course Name:"+course.getName());
            }
        }
    }

    public void getStudentData(String studentId){
        HashMap<String,Student> students=db.students;
        Student student=students.get(studentId);
        System.out.println(" id: "+student.getId()+"Name: "+student.getName()+ " age: "+student.getAge()+" gender: "+student.getGender()+" email: "+student.getEmail()+" mobile number:  "+student.getMobileNumber()+" address: "+student.getAddress());

    }
    public void addAssignment(Assignmnet assignment){
//        HashMap<String,Course> courses=db.courses;
        Course course=db.courses.get(assignment.getCourseId());
        course.addAssignment(assignment);
    }
    public void submitStudentsAttendance(LinkedList<CourseAttendance> courseAttendance){
//        Set<CourseAttendance> courseAttendances=db.courseAttendances;
        db.courseAttendances.addAll(courseAttendance);
    }
    public boolean addStudentToCourse(String courseId,String studentId,String id){
        // send id from teacher
//        HashMap<String,Student> students=db.students;
//        HashMap<String,Course> courses=db.courses;
        Course course= db.courses.get(courseId);
        LinkedList<String> teacherIds=course.getTeachers();
        if (teacherIds.indexOf(id)>0){
            course.addStudent(studentId);
            Student student=db.students.get(studentId);
            student.addCourse(course.getId());
            course.addStudent(studentId);
        }
        else{
            System.out.println("you are not authorized to add student this course");
            return false;
        }
        return true;
    }
}
