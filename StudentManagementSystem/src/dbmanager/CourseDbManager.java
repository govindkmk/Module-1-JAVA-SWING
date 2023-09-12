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

public class CourseDbManager {

    private final String INSERT_COURSE_QUERY = "INSERT INTO COURSE(c_ID, c_name, c_code) VALUES(?,?,?); ";
    private final String UPDATE_COURSE_QUERY = "UPDATE COURSE SET c_name = ?, c_code = ? WHERE c_ID = ?; ";
    private final String GET_COURSE_QUERY = "SELECT * FROM COURSE WHERE c_ID = ?; ";
    private final String GETALL_COURSES_QUERY = "SELECT * FROM COURSE; ";
    private final String DELETE_COURSE_QUERY = "DELETE FROM COURSE WHERE c_ID = ?; ";
    private final String GET_COURSE_BY_NAME = "SELECT * FROM COURSE WHERE c_name = ?; ";

    public boolean addCourse(Course course) throws SQLException {
        Connection conn = DbConnection.getConnection();
        boolean success = true;
        // Set Values
        PreparedStatement ps = conn.prepareStatement(INSERT_COURSE_QUERY);
        ps.setInt(1, course.getCourseId());
        ps.setString(2, course.getCourseName());
        ps.setString(3, course.getCourseCode());

        // Execute Query
        ps.execute();
        //conn.close();
        //System.out.println("Course "+course.getCourseName()+" has been added Successfully...");
        return success;
    }

    public boolean updateCourse(Course course) throws SQLException {
        Connection conn = DbConnection.getConnection();
        boolean success = true;
        // Set Values
        PreparedStatement ps = conn.prepareStatement(UPDATE_COURSE_QUERY);

        ps.setString(1, course.getCourseName());
        ps.setString(2, course.getCourseCode());
        ps.setInt(3, course.getCourseId());

        // Execute Query
        ps.execute();
        //conn.close();
        //System.out.println("Course "+course.getCourseName()+" has been Updated Successfully...");
        return success;
    }

    public Course getCourseById(Integer id) throws SQLException {
        Connection conn = DbConnection.getConnection();

        PreparedStatement ps = conn.prepareStatement(GET_COURSE_QUERY);
        ps.setInt(1, id);

        ResultSet rst = ps.executeQuery();

        while (rst.next()) {
            Course course = new Course();
            course.setCourseId(rst.getInt("c_ID"));
            course.setCourseName(rst.getString("c_name"));
            course.setCourseCode(rst.getString("c_code"));
            return course;
        }

        //conn.close();
        return null;
    }

    public List<Course> getAllCourses() throws SQLException {
        Connection conn = DbConnection.getConnection();
        List<Course> courses = new ArrayList<>();

        Statement statement = conn.createStatement();
        ResultSet rst = statement.executeQuery(GETALL_COURSES_QUERY);

        while (rst.next()) {
            Course course = new Course();
            course.setCourseId(rst.getInt("c_ID"));
            course.setCourseName(rst.getString("c_name"));
            course.setCourseCode(rst.getNString("c_code"));
            courses.add(course);

        }
        //conn.close();
        return courses;

    }

    public boolean deleteCourse(Integer id) throws SQLException {
        Connection conn = DbConnection.getConnection();
        boolean success = true;
        // Set Values
        PreparedStatement ps = conn.prepareStatement(DELETE_COURSE_QUERY);
        ps.setInt(1, id);

        // Execute Query
        ps.executeUpdate();
        //conn.close();
        //System.out.println("Course has been Deleted Successfully...");
        return success;
    }

    public Course getCourseByName(String name) throws SQLException {
        Connection conn = DbConnection.getConnection();

        PreparedStatement ps = conn.prepareStatement(GET_COURSE_BY_NAME);
        ps.setString(1, name);

        ResultSet rst = ps.executeQuery();

        while (rst.next()) {
            Course course = new Course();
            course.setCourseId(rst.getInt("c_ID"));
            course.setCourseName(rst.getString("c_name"));
            course.setCourseCode(rst.getString("c_code"));
            return course;
        }

        //conn.close();
        return null;
    }
}
