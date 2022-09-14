package dataBase;

import system.AssignmentSubmission;

public class AssignmentAPI {
    private final DataBase db=DataBase.getInstance();
    public void addNewSubmission(AssignmentSubmission assignmentSubmission){
        db.assignmentSubmissions.add(assignmentSubmission);
    }
}
