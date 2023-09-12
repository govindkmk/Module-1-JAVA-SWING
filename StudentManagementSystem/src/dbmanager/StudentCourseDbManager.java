package dbmanager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dbconnection.DbConnection;
import models.Course;
import models.Student;
import models.StudentCourse;

public class StudentCourseDbManager {

    private final String INSERT_STUDENT_COURSE_QUERY = "INSERT INTO STUDENT_COURSE_DATA(s_ID, c_ID, obtained_marks) VALUES(?,?,?); ";
    private final String UPDATE_MARKS_QUERY = "UPDATE STUDENT_COURSE_DATA SET obtained_marks = ? WHERE id = ?; ";
    private final String GET_STUDENT_COURSE_QUERY = "SELECT  scd.id, s.s_rollNumber, c.c_name, scd.obtained_marks FROM STUDENT_COURSE_DATA scd INNER JOIN student s ON scd.s_ID = s.s_ID INNER JOIN COURSE c  ON scd.c_ID = c.c_ID WHERE scd.id = ?; ";
    private final String GETALL_STUDENT_COURSE_QUERY = "SELECT  scd.id, s.s_rollNumber, c.c_name, scd.obtained_marks FROM STUDENT_COURSE_DATA scd INNER JOIN student s ON scd.s_ID = s.s_ID INNER JOIN COURSE c  ON scd.c_ID = c.c_ID; ";

    public boolean assignStudentCourse(StudentCourse studentCourse) throws SQLException {
        Connection conn = DbConnection.getConnection();
        boolean success = true;
        PreparedStatement ps = conn.prepareStatement(INSERT_STUDENT_COURSE_QUERY);

        //ps.setInt(1, studentCourse.getId());
        ps.setInt(1, studentCourse.getStudent().getId());
        ps.setInt(2, studentCourse.getCourse().getCourseId());
        ps.setInt(3, studentCourse.getObtained_marks());

        ps.execute();
        return success;
        //ps.close();

        //System.out.println("Course has been Assigned to Student Successfully...");
    }

    public boolean updateStudentMarks(StudentCourse studentCourse) throws SQLException {

        boolean success = true;

        Connection conn = DbConnection.getConnection();

        PreparedStatement ps = conn.prepareStatement(UPDATE_MARKS_QUERY);

        ps.setInt(1, studentCourse.getObtained_marks());
        ps.setInt(2, studentCourse.getId());

        ps.executeUpdate();

        //ps.close();
        //System.out.println("Student Marks has been updated successfully...");
        return success;
    }

    public StudentCourse getStudentCourseById(Integer id) throws SQLException {

        Connection conn = DbConnection.getConnection();

        PreparedStatement ps = conn.prepareStatement(GET_STUDENT_COURSE_QUERY);
        ps.setInt(1, id);
        ResultSet rst = ps.executeQuery();

        while (rst.next()) {
            StudentCourse studentCourse = new StudentCourse();
            Student student = new Student();
            Course course = new Course();

            studentCourse.setId(rst.getInt("scd.id"));
            student.setRollNumber(rst.getString("s.s_rollNumber"));
            studentCourse.setStudent(student);
            course.setCourseName(rst.getString("c.c_name"));
            studentCourse.setCourse(course);
            studentCourse.setObtained_marks(rst.getInt("scd.obtained_marks"));

            return studentCourse;

            //System.out.println(rst.getString("c.c_name")+"\t\t\t"+rst.getInt("scd.obtained_marks"));
        }

        //conn.close();
        return null;
    }

    public List<StudentCourse> getStudentCourses() throws SQLException {
        Connection conn = DbConnection.getConnection();
        List<StudentCourse> studentCourses = new ArrayList<>();

        Statement statement = conn.createStatement();
        ResultSet rst = statement.executeQuery(GETALL_STUDENT_COURSE_QUERY);

        while (rst.next()) {
            StudentCourse studentCourse = new StudentCourse();
            Student student = new Student();
            Course course = new Course();

            studentCourse.setId(rst.getInt("scd.id"));
            student.setRollNumber(rst.getString("s.s_rollNumber"));
            course.setCourseName(rst.getString("c.c_name"));
            studentCourse.setObtained_marks(rst.getInt("scd.obtained_marks"));

            studentCourse.setStudent(student);
            studentCourse.setCourse(course);

            studentCourses.add(studentCourse);

        }

        return studentCourses;

    }

}
