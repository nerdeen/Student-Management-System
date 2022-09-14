package system;

import dataBase.AssignmentAPI;

import java.util.Date;
import java.util.LinkedList;

public class Assignmnet {
    private String id;
    private String description;
    private String courseId;
    private Date dueDate;
    private final AssignmentAPI assignmentAPI=new AssignmentAPI();

    public Assignmnet(String id,String description,String courseId,Date dueDate){
        this.id=id;
        this.description=description;
        //we have to check if that is right
        this.courseId=courseId;
        this.dueDate=dueDate;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
    public void addNewSubmission(AssignmentSubmission assignmentSubmission){
        assignmentAPI.addNewSubmission(assignmentSubmission);
    }
}
