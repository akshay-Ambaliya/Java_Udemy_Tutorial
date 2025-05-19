/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conditionalstatement;

/**
 *
 * @author Dell
 */
public class SwitchCaseChallange {
    
    // 1. Display name of a day based on number
    // 2. Display name of a month based on number
    // 3. Display type of website
    
    public static void main(String[] args) {
        SwitchCaseChallange.displayNameOfDay(2);
        SwitchCaseChallange.displayNameOfDay(5);
        SwitchCaseChallange.displayTypeOdWebsite("www.google.net");
    }
        
        
    public static void displayNameOfMonth(int num){
        
        switch(num){
            case 1:
                System.out.println("January");
            break;
            case 2:
                System.out.println("February");
            break;
            case 3:
                System.out.println("March");
            break;
            case 4:
                System.out.println("April");
            break;
            case 5:
                System.out.println("May");
            break;
            case 6:
                System.out.println("June");
            break;
            case 7:
                System.out.println("July");
            break;
            case 8:
                System.out.println("August");
            break;
            case 9:
                System.out.println("September");
            break;
            case 10:
                System.out.println("October");
            break;
            case 11:
                System.out.println("November");
            break;
            case 12:
                System.out.println("December");
            break;
        }
    }
    
    public static void displayNameOfDay(int num){
        
        switch(num){
            case 1:
                System.out.println("Sunday");
            break;
            case 2:
                System.out.println("Monday");
            break;
            case 3:
                System.out.println("Tuesday");
            break;
            case 4:
                System.out.println("Wednesday");
            break;
            case 5:
                System.out.println("Thursday");
            break;
            case 6:
                System.out.println("Friday");
            break;
            case 7:
                System.out.println("Saturday");
            break;
            default : 
                System.out.println("Invalid Month");
            break;
        }
    }
    
    public static void displayTypeOdWebsite(String s){
        String ext = s.substring(s.lastIndexOf(".")+1);
        
        switch(ext){
            case "com" : 
                System.out.println("Commercial");
            break;
            case "in" : 
                System.out.println("Indian");
            break;
            case "org" : 
                System.out.println("Organization");
            break;
            case "net" : 
                System.out.println("Netword Based");
            break;
            default : 
                System.out.println("Invalid Extension");
            break;
        }
    }
}
