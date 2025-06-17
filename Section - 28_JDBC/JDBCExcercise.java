/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbcexcercise;

import java.sql.*;

/**
 *
 * @author Dell
 */
public class JDBCExcercise {

 public static void main(String[] args) throws Exception{
     
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:D:\\Tools\\sqlite\\University");
        
        System.out.println("Connected");
    }
    
}
