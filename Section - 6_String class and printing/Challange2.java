/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stringclass;

/**
 *
 * @author Dell
 */
public class Challange2 {
    
    // 1. Find if a number is Binary or not
    // 2. Find if a number is HexaDecimal or not
    // 3. Find if the data in Date format (dd/mm/yyyy)
    
    public static void main(String[] args) {
        Challange2.isBinary(10100010);
        Challange2.isHexaDecimal("1526489");
        Challange2.isDateFormatted("25/01/2004");
    }
    
    
    public static void isBinary(int num){
        String result = num+"";
        if(result.matches("[01]+")){
            System.out.println(result + " Is Binary number");
        }
        else{
            System.out.println(result + " Is not a Binary number");
        }
    }
    
    public static void isHexaDecimal(String num){
        if(num.matches("[^0-9A-Ea-e]+$")){
            System.out.println(num + "Is HexaDecimal number");
        }
        else{
            System.out.println(num + "Is not a HexaDecimal number");
        }
    }
    
    public static void isDateFormatted(String date){
        if(date.matches("^[0-3][0-9]/[0-1][0-9]/[0-9]{4}$")){
            System.out.println(date + " Is well Formatted");
        }
        else{
            System.out.println(date + " Is not well Formatted");
        }
    }
}
