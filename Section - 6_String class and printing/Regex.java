package stringclass;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
public class Regex {
    public static void main(String[] args) {
        // Regex Used for cheking the string pattern 
        // Use matches() method
        
        //symbols : 
        // . -> any character
        // [abc] -> Exactly given Lettter
        // [abc][vz] -> Either First or Second Set
        // [^abc] -> Except abc
        // [a-z1-7] -> Define Range
        // A|B -> A or B
        // xz -> Exactly xz
        // \d -> digits
        // \D -> not digits
        // \s -> Space
        // \S -> Not Space
        // \w -> Alphabets or digits
        // \W -> Neither alphabets nor digits
        
                //Qualifiers : 
        // * : 0 or more times
        // + : one or more 
        // ? : 0 or 1 times 
        // {x} : x-times
        // {x,y} :x to y times
        
        
        String ch ="q";
        System.out.println(ch.matches("[quick]"));
        System.out.println(ch.matches("[q]"));
        System.out.println(ch.matches("[a-z0-9]"));
        System.out.println(ch.matches("[a-z][0-9]"));
        

    }
            
}
