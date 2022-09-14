package dataBase;

import system.Assignmnet;

public class CourseAPI {
    private final DataBase  db=DataBase.getInstance();
    public void addAssignment(Assignmnet assignment){
        db.assignments.put(assignment.getId(),assignment);
    }
}
