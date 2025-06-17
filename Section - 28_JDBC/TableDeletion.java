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
public class TableDeletion{
    
    public static void main(String[] args)  throws Exception  {
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:D:\\Tools\\sqlite\\University");
        
        String table = "drop table temp";
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(table);
        System.out.println("Table Dropped : ");
    }

}
