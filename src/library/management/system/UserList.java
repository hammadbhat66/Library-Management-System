/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system;

import java.util.jar.Attributes;

/**
 *
 * @author hamma
 */
class UserList {
    private String StudentID;
    private String Name;
    private String RollNo;
    private String Semester;
    private String Course;
    public UserList(String a,String b,String c,String d,String e,String f) {
        StudentID=a;
        Name =b;
        RollNo =c;
        Semester =d;
        Course =e;
       
    }

    public String getStudentID() {
        return StudentID;
    }

    public String getName() {
        return Name;
    }

    public String getRollNo() {
        return RollNo;
    }

    public String getSemester() {
        return Semester;
    }

    public String getCourse() {
        return Course;
    }
    
    
}
