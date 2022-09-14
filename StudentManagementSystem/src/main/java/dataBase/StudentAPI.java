package dataBase;

import system.AssignmentSubmission;
import system.Assignmnet;
import system.Course;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class StudentAPI {
    private final DataBase db=DataBase.getInstance();
    public void viewEnrolledCourses(LinkedList<String> coursesId){
        //send coursesId
        for (String courseId:coursesId){
            if(db.courses.get(courseId)!=null){
                Course course=db.courses.get(courseId);
                System.out.println("ID: "+course.getId()+" course name: "+course.getName());
            }
        }
    }

    public void viewAssignments(String courseId){
        Course course=db.courses.get(courseId);
        HashMap<String, Assignmnet> assignments=db.assignments;
//        HashMap<String, Assignmnet> assignments=course.getAssignments();
        for (Map.Entry<String,Assignmnet>assignmentEntry:assignments.entrySet()){
            Assignmnet assignmnet=assignmentEntry.getValue();
            System.out.println("assignment ID:"+ assignmnet.getId()+" assignment description: "+assignmnet.getDescription());
        }
    }

    public boolean submitAssignment(AssignmentSubmission assignmentSubmission){
        String assignmentId=assignmentSubmission.getAssignmentId();
        Assignmnet assignment=db.assignments.get(assignmentId);
        if (assignment==null){
            System.out.println("there is no such assignment!!");
            return false;
        }
        else{
            assignment.addNewSubmission(assignmentSubmission);
        }

        return true;
    }
}
