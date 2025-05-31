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
    
    private int roll;
    private String name;
    private String course;
    private int[] marks;
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

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }
    
    @Override
    public String toString(){
        grades();
        return String.format("Roll Number : %d\nName : %s\nCourse : %s\nAverage : %5.2f\nGrades : %c",roll,name,course,average(),grades);
    }
}

public class TestStudent2{
    
    
    
    public static void main(String[] args) {
        Student std = new Student();
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.println("Enter Roll Number : ");
        std.setRoll(scanner.nextInt());
        
        System.out.println("Enter Name : ");
        std.setName(scanner.next());
        
        System.out.println("Enter Course");
        std.setCourse(scanner.next());
        
        System.out.println("Enter Marks : ");
        std.setMarks(new int[]{scanner.nextInt(),scanner.nextInt(),scanner.nextInt()});
        
        System.out.println("\n");
        System.out.println(std.toString());
    }
            
}
