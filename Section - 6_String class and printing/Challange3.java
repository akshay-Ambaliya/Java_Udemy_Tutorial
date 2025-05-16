/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
public class Challange3 {
    
    //1. Remove Special character from a string
    //2. Remove extra spaces from string
    //3. Find number of words in a string
    
    public static void main(String[] args) {
        Challange3.removeSpecialChar("akljsh?asd$asfd@");
        Challange3.removeSpace("akshay ambaliya is learning java");
        Challange3.findNoOfWords("    The quick brown fox jumps over the lazy dog");
    }
    
    public static void removeSpecialChar(String s){
        System.out.println(s.replaceAll("[^a-zA-Z0-9]", "")); 
    }
    
    public static void removeSpace(String s){
        System.out.println(s.replaceAll("_", ""));
    }
    
    public static void findNoOfWords(String s){
        System.out.println("Number of words in a string is : " + s.trim().split("\\s+").length);
    }
}
