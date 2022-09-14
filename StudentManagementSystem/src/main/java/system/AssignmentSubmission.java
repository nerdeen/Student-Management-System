package system;

import java.util.Date;

public class AssignmentSubmission {
    private String assignmentId;
    private String studentId;
    private String courseId;
    private Date submissionDate;
    private String assignmentContentSubmitted;
    private float assignmentMarks=0.0f;

    public AssignmentSubmission(String assignmentId,String studentId,String courseId,String assignmentContentSubmitted){
        this.assignmentId=assignmentId;
        this.studentId=studentId;
        this.courseId=courseId;
        this.assignmentContentSubmitted=assignmentContentSubmitted;
    }
    public String getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(String assignmentId) {
        this.assignmentId = assignmentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public Date getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(Date submissionDate) {
        this.submissionDate = submissionDate;
    }

    public String getAssignmentContentSubmitted() {
        return assignmentContentSubmitted;
    }

    public void setAssignmentContentSubmitted(String assignmentContentSubmitted) {
        this.assignmentContentSubmitted = assignmentContentSubmitted;
    }

    public float getAssignmentMarks() {
        return assignmentMarks;
    }

    public void setAssignmentMarks(float assignmentMarks) {
        this.assignmentMarks = assignmentMarks;
    }

}
