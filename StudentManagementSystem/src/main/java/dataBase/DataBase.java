package dataBase;

//import jdk.nashorn.internal.ir.Assignment;
import system.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

class DataBase {
    public HashMap<String, Teacher> teachers;
    HashMap<String, Student> students;
    HashMap<String, Course> courses;
    HashMap<String, Assignmnet>assignments;

    Set<CourseAttendance> courseAttendances;

    LinkedList<AssignmentSubmission> assignmentSubmissions;

    private static DataBase db = null;
    private DataBase()
    {
        teachers=new HashMap<String, Teacher>();
        students=new HashMap<String, Student>();
        courses=new HashMap<String, Course>();
        assignments= new HashMap<String, Assignmnet>();
        courseAttendances=new HashSet<>();
        assignmentSubmissions=new LinkedList<>();
    }
    public static DataBase getInstance()
    {
        if (db == null)
            db = new DataBase();

        return db;
    }
}
