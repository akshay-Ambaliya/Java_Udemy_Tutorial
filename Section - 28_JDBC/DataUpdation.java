/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbcexcercise;

import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class DataUpdation {
        public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:D:\\Tools\\sqlite\\University");
           
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter Department Id");
        int id = scanner.nextInt();
        
        System.out.println("New Department Name : ");
        String name = scanner.next();
        
        Statement stmt = conn.createStatement();
        stmt.executeUpdate("update dept set dname= '"+name+"' where deptno = "+id);
        System.out.println("Updated : ");
    }
}
