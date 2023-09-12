/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbmanager;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import models.Course;
import models.Student;
import models.StudentCourse;

/**
 *
 * @author Govind Kumar
 */
public class NewClass {

    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);
        StudentCourseDbManager studentCourseDbManager = new StudentCourseDbManager();

        System.out.println("Enter Student Id : ");
        int sID = sc.nextInt();
        System.out.println("Enter Course Id :");
        int cID = sc.nextInt();
        
        System.out.println("Enter Marks :");
        int obtainedMarks = sc.nextInt();
        
        Student student = new Student();
        student.setId(sID);
        Course course = new Course();
        course.setCourseId(cID);
        
        StudentCourse studentCourse = new StudentCourse();
        studentCourse.setStudent(student);
        studentCourse.setCourse(course);
        studentCourse.setObtained_marks(obtainedMarks);
        
        studentCourseDbManager.assignStudentCourse(studentCourse);
        
        System.out.println("Added Successfully...");
        
        List<StudentCourse> studentCourses = studentCourseDbManager.getStudentCourses();

        
        
        for (StudentCourse stdcrs : studentCourses) {

            System.out.println("\n***********************************");

            System.out.println("		" + stdcrs.getStudent().getRollNumber() + "		");
            System.out.println("Course Name \t \t Marks");

            System.out.println(stdcrs.getCourse().getCourseName()+ "\t\t" + stdcrs.getObtained_marks());

        }
    }

}
