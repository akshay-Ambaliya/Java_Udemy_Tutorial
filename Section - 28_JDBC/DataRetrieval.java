/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbcexcercise;
import java.sql.*;
/**
 *
 * @author Dell
 */
public class DataRetrieval {
    public static void main(String[] args) throws Exception{
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:D:\\Tools\\sqlite\\University");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select roll,name,city,dname from student,dept where student.deptno = dept.deptno");
        while(rs.next()){
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t\t"+rs.getString(4));
        }
    }
}
