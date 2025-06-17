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
public class InsertinoUsingPreparedStatement {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:D:\\Tools\\sqlite\\University");
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Department Id");
        int id = scanner.nextInt();
        
        System.out.println("Please Enter Department Name : ");
        String name = scanner.next();
        
        PreparedStatement pstmt = conn.prepareStatement("Insert into dept values(?,?)");
        pstmt.setInt(1, id);
        pstmt.setString(2,name);
        pstmt.executeUpdate();
        System.out.println("Inserted : ");
    }
}
