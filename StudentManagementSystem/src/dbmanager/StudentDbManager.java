package dbmanager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dbconnection.DbConnection;
import models.Department;
import models.Student;

public class StudentDbManager {

	private final String INSERT_STUDENT_QUERY = "INSERT INTO STUDENT(s_ID, s_rollNumber, s_name, s_fatherName, s_age, s_email, d_ID) VALUES(?, ?, ?, ?, ?, ?, ?); "; 
	private final String UPDATE_STUDENT_QUERY = "UPDATE STUDENT SET s_rollNumber = ?, s_name = ?, s_fatherName = ?, s_age = ?, s_email = ?, d_ID = ? WHERE s_ID = ?; ";
	private final String GET_STUDENT_QUERY = "SELECT s.s_ID, s.s_rollNumber, s.s_name, s.s_fatherName, s.s_age, s.s_email, d.d_name FROM STUDENT s INNER JOIN DEPARTMENT d ON s.d_ID = d.d_ID WHERE s.s_ID = ?; ";
	private final String GETALL_STUDENT_QUERY = "SELECT s.s_ID, s.s_rollNumber, s.s_name, s.s_fatherName, s.s_age, s.s_email, d.d_name FROM STUDENT s INNER JOIN DEPARTMENT d ON s.d_ID = d.d_ID; ";
	private final String DELETE_STUDENT_QUERY = "DELETE FROM STUDENT WHERE s_ID = ?; ";
        private final String GET_STUDENT_QUERY_BY_ROLLNUMBER = "SELECT * FROM STUDENT WHERE s_rollNumber = ?; ";
	
	public boolean addStudent(Student student) throws SQLException {
		Connection conn = DbConnection.getConnection();
		boolean success = true;
		
		PreparedStatement ps = conn.prepareStatement(INSERT_STUDENT_QUERY);
		
		ps.setInt(1, student.getId());
		ps.setString(2, student.getRollNumber());
		ps.setString(3, student.getName());
		ps.setString(4, student.getFatherName());
		ps.setInt(5, student.getAge());
		ps.setString(6, student.getEmail());
		ps.setInt(7, student.getDepartment().getId());
		
		ps.execute();
		//conn.close();
		
		//System.out.println("Student " + student.getName() + " has been added successfully...");
		
                return success;
	}
	
	public boolean updateStudent(Student student) throws SQLException {
		Connection conn = DbConnection.getConnection();
		boolean success = true;
		PreparedStatement ps = conn.prepareStatement(UPDATE_STUDENT_QUERY);
		
		
		ps.setString(1, student.getRollNumber());
		ps.setString(2, student.getName());
		ps.setString(3, student.getFatherName());
		ps.setInt(4, student.getAge());
		ps.setString(5, student.getEmail());
		ps.setInt(6, student.getDepartment().getId());
		ps.setInt(7, student.getId());
		
		ps.executeUpdate();
		//conn.close();
		
		//System.out.println("Student " + student.getName() + " has been Updated successfully...");
                
                return success;
	}
	
	public Student getStudentById(Integer id) throws SQLException {
		Connection con = DbConnection.getConnection();
		
		PreparedStatement ps = con.prepareStatement(GET_STUDENT_QUERY);
		
		
		ps.setInt(1, id);
		
		ResultSet rst = ps.executeQuery();
		
		while(rst.next()) {
                    Student student = new Student();
                    student.setId(rst.getInt("s.s_ID"));
                    student.setRollNumber(rst.getString("s.s_rollNumber"));
                    student.setName(rst.getString("s.s_name"));
                    student.setFatherName(rst.getString("s.s_fatherName"));
                    student.setAge(rst.getInt("s.s_age"));
                    student.setEmail(rst.getString("s.s_email"));
                    
                    Department department = new Department();
                    department.setName(rst.getString("d.d_name"));
                    student.setDepartment(department);
                    
                    return student;
		}
		//con.close();
		
               return null;
		
	}
	
	
	public List<Student> getAllStudents() throws SQLException {
        Connection con = DbConnection.getConnection();
        List<Student> students = new ArrayList<>();
        try {
            Statement statement = con.createStatement();
            ResultSet rst = statement.executeQuery(GETALL_STUDENT_QUERY);
            // do not call a query in a loop
            while (rst.next()) {
                Student s = new Student();
                
                s.setId(rst.getInt("s.s_ID"));
                s.setRollNumber(rst.getString("s.s_rollNumber"));
                s.setName(rst.getString("s.s_name"));
                s.setFatherName(rst.getString("s.s_fatherName"));
                s.setAge(rst.getInt("s.s_age"));
                s.setEmail(rst.getString("s.s_email"));
                
                // mapping department data
                Department d = new Department();
                d.setName(rst.getString("d.d_name"));
                // set department to student
                s.setDepartment(d);
                
                students.add(s);
            }

            //con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return students;
    }
	
	public boolean deleteStudent(Integer id) throws SQLException {
		Connection conn = DbConnection.getConnection();
		boolean success = true;
		PreparedStatement ps = conn.prepareStatement(DELETE_STUDENT_QUERY);
		
		ps.setInt(1, id);
		
		
		ps.executeUpdate();
		//conn.close();
		
		//System.out.println("Student has been deleted successfully...");

                return success;
	}
	
	public Student getStudentByRollNumber(String rollNumber) throws SQLException {
		Connection con = DbConnection.getConnection();
		
		PreparedStatement ps = con.prepareStatement(GET_STUDENT_QUERY_BY_ROLLNUMBER);
		
		
		ps.setString(1, rollNumber);
		
		ResultSet rst = ps.executeQuery();
		
		while(rst.next()) {
                    Student student = new Student();
                    student.setId(rst.getInt("s_ID"));
                    student.setRollNumber(rst.getString("s_rollNumber"));
                    student.setName(rst.getString("s_name"));
                    student.setFatherName(rst.getString("s_fatherName"));
                    student.setAge(rst.getInt("s_age"));
                    student.setEmail(rst.getString("s_email"));
                    
                    Department department = new Department();
                    department.setId(rst.getInt("d_ID"));
                    student.setDepartment(department);
                    
                    return student;
		}
		//con.close();
		
               return null;
		
	}
}
