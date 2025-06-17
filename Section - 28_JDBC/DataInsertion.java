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
public class DataInsertion {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:D:\\Tools\\sqlite\\University");
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Department Id");
        int id = scanner.nextInt();
        
        System.out.println("Please Enter Department Name : ");
        String name = scanner.next();
        
        Statement stmt = conn.createStatement();
        stmt.executeUpdate("Insert Into dept values("+id+",'"+name+"')");
        System.out.println("Inserted : ");
    }
}
