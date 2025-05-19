/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conditionalstatement;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class MenuDrivenCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter two number : ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        
        System.out.println("1 . ADD");
        System.out.println("2 . SUB");
        System.out.println("3 . MUL");
        System.out.println("4 . DIV");
        
        switch(scanner.nextInt()){
            case 1:
                System.out.println(num1 + num2);
            break;
            case 2:
                System.out.println(num1 - num2);
            break;
            case 3:
                System.out.println(num1 * num2);
            break;
            case 4:
                System.out.println((float)num1 / (float)num2);
            break;
            default:
                System.out.println("Invalid Choice");
            break;

        }
    }
}
