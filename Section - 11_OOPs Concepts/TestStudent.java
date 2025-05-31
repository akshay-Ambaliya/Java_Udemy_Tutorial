/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
class Student {
    
    private int roll = 5;
    private String name = "Akshay";
    private String course = "MCA";
    private int[] marks = {50,47,86};
    private char grades;
    
    public int total(){
        return marks[0]+marks[1]+marks[2];
    }
    
    public double average(){
        return total()/3;
    }
    
    public void grades(){
        double result = average();
        
        if(result > 85){
            grades = 'A';
        }else if(result > 70){
            grades = 'B';
        }else if(result > 55){
            grades = 'C';
        }else if(result > 40){
            grades = 'D';
        }else{
            grades = 'F';
        }
    }
    
    @Override
    public String toString(){
        grades();
        return String.format("Roll Number : %d\nName : %s\nCourse : %s\nAverage : %5.2f\nGrades : %c",roll,name,course,average(),grades);
    }
}

public class TestStudent{
    
    
    
    public static void main(String[] args) {
        Student std = new Student();
        System.out.println(std.toString());
    }
            
}
