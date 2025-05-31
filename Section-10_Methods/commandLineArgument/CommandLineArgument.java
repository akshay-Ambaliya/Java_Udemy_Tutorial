/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cma;

/**
 *
 * @author Dell
 */
public class CommandLineArgument {
    public static void main(String[] args) {
        double sum=0;
        for (String arg : args) {
            sum += Double.parseDouble(arg);
        }
        
        System.out.println("Sum : "+ sum);
    }
}
