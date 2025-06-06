/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package1;

/**
 *
 * @author Dell
 */
public class Test1 {
    public int publicNumber;
    private int privateNumber;
    int defaultNumber;
    protected int protectedNumber;
    
    public Test1(){
        this.defaultNumber =0;
        this.privateNumber =0;
        this.protectedNumber = 0;
        this.publicNumber = 0;
    }
    
    public Test1(int pub,int pri,int def,int pro){
        this.defaultNumber =def;
        this.privateNumber =pri;
        this.protectedNumber = pro;
        this.publicNumber = pub;
    }
    
    public void display(){
        System.out.println("public : " + publicNumber); //Accessible
        System.out.println("private : "+privateNumber); //Accessible
        System.out.println("default : "+defaultNumber); //Accessible
        System.out.println("protected : "+protectedNumber); //Accessible
    }
   
    public static void main(String[] args) {
        Test1 test = new Test1(12,25,48,69);
        test.display();
    }
}
