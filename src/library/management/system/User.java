/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system;

/**
 *
 * @author hamma
 */
public class User {
private String ID;
private String BookID;
private String Name;
private String Edition;
private String Publisher;
private String Price;
private String Pages;
private String StudentID;
private String SName;
private String RollNo;
private String Semester;
private String Course;
private String DateofIssue;
    public User(String string, String string0, String string1, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11) {
    ID=string;
    BookID=string0;
    Name=string1;
    Edition=string2;        
    Publisher=string3;
    Price=string4;
    Pages        =string5;
    StudentID     =string6;   
    SName        =string7;
    RollNo        =string8;
    Semester      =string9;  
    Course        =string10;
    DateofIssue=string11;
            }

    public String getID() {
        return ID;
    }

    public String getBookID() {
        return BookID;
    }

    public String getName() {
        return Name;
    }

    public String getEdition() {
        return Edition;
    }

    public String getPublisher() {
        return Publisher;
    }

    public String getPrice() {
        return Price;
    }

    public String getPages() {
        return Pages;
    }

    public String getStudentID() {
        return StudentID;
    }

    public String getSName() {
        return SName;
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

    public String getDateofIssue() {
        return DateofIssue;
    }
}
