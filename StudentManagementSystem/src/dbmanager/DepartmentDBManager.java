package dbmanager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dbconnection.DbConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Department;

public class DepartmentDBManager {

    private final String INSERT_DEPARTMENT_QUERY = "INSERT INTO DEPARTMENT(d_ID, d_name, d_code) VALUES(?,?,?); ";
    private final String UPDATE_DEPARTMENT_QUERY = "update department set d_name = ?, d_code = ? WHERE d_ID = ?; ";
    private final String GET_DEPARTMENT_QUERY = "SELECT * FROM DEPARTMENT WHERE d_ID = ?; ";
    private final String GETALL_DEPARTMENT_QUERY = "SELECT * FROM DEPARTMENT; ";
    private final String DELETE_DEPARTMENT_QUERY = "DELETE FROM DEPARTMENT WHERE d_ID = ?; ";
    private final String GET_DEPARTMENT_QUERY_BY_NAME = "SELECT * FROM DEPARTMENT WHERE d_name = ?; ";

    public boolean addDepartment(Department department) throws SQLException {
        Connection conn = DbConnection.getConnection();
        boolean success = true;
        try {
            //set the values
            PreparedStatement ps = conn.prepareStatement(INSERT_DEPARTMENT_QUERY);

            ps.setInt(1, department.getId());
            ps.setString(2, department.getName());
            ps.setString(3, department.getCode());

            //execute the query
            ps.execute();

            //conn.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        //System.out.println("Department "+department.getName()+" has been added...");
        return success;

    }

    public boolean updateDepartment(Department department) throws SQLException {
        Connection conn = DbConnection.getConnection();
        boolean success = true;
        try {
            PreparedStatement ps = conn.prepareStatement(UPDATE_DEPARTMENT_QUERY);

            ps.setString(1, department.getName());
            ps.setString(2, department.getCode());
            ps.setInt(3, department.getId());

            ps.executeUpdate();

            //conn.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //System.out.println("Department "+department.getName()+" has been updated...");
        return success;
    }

    public Department getDepartmentById(Integer id) throws SQLException {
        Connection conn = DbConnection.getConnection();

        PreparedStatement ps = conn.prepareStatement(GET_DEPARTMENT_QUERY);
        ps.setInt(1, id);

        ResultSet rst = ps.executeQuery();

        while (rst.next()) {
            Department d = new Department();

            d.setId(rst.getInt("d_ID"));
            d.setName(rst.getString("d_name"));
            d.setCode(rst.getString("d_code"));
            return d;
        }

        //conn.close();
        return null;
    }

    public List<Department> getAllDepartments() {

        List<Department> departments = new ArrayList<>();
        try {
            Connection conn = DbConnection.getConnection();

            Statement statement = conn.createStatement();
            ResultSet rst = statement.executeQuery(GETALL_DEPARTMENT_QUERY);

            while (rst.next()) {
                Department department = new Department();
                department.setId(rst.getInt("d_ID"));
                department.setName(rst.getString("d_name"));
                department.setCode(rst.getString("d_code"));

                departments.add(department);

            }
            //conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DepartmentDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        return departments;

    }

    public boolean deleteDepartment(Integer id) throws SQLException {

        boolean success = true;
        Connection conn = DbConnection.getConnection();

        PreparedStatement ps = conn.prepareStatement(DELETE_DEPARTMENT_QUERY);

        ps.setInt(1, id);

        ps.executeUpdate();

        //conn.close();
        //System.out.println("Department has been deleted successfully...");
        return success;
    }
    
    public Department getDepartmentByName(String name) throws SQLException {
        Connection conn = DbConnection.getConnection();

        PreparedStatement ps = conn.prepareStatement(GET_DEPARTMENT_QUERY_BY_NAME);
        ps.setString(1, name);

        ResultSet rst = ps.executeQuery();

        while (rst.next()) {
            Department d = new Department();

            d.setId(rst.getInt("d_ID"));
            d.setName(rst.getString("d_name"));
            d.setCode(rst.getString("d_code"));
            return d;
        }
        return null;
    }

}
