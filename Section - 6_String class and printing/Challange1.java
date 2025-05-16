/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stringclass;

/**
 *
 * @author Dell
 */
public class Challange1 {
    
    // Find if the email id is on gmail
    // Find username and domain name fro m email
    public static void main(String[] args) {
        String email = "akshay@yahoo.com";
        String username,domain;
        
        if(email.matches("[a-z0-9._-]+@[a-z0-9._-]+")){
            System.out.println("Valid Email : ");
            
            System.out.println("Username : "+ email.split("@")[0]);
            System.out.println("Domain : "+ email.split("@")[1]);
        }
        else{
            System.out.println("False");
        }
    }
}
