/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InnerClasses;

/**
 *
 * @author Dell
 */
public class LocalInnerClass {
    
    public int x;
    public int y;
    
    public void show(){
        class LocalClass{
            public void displayDemo(){
                System.out.println("Hello from Local Class");
            }
        }
        
        LocalClass lc = new LocalClass();
        lc.displayDemo();
    }
    
//    LocalClass lc = new LocalClass();    --> Inaccessible
    
    public static void main(String[] args) {
        LocalInnerClass lic = new LocalInnerClass();
        lic.show();
    }
}
