/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loops;

/**
 *
 * @author Dell
 */
public class Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i =1;
        
        while(i<100){
            i=i*2;
            System.out.println(i);
        }
        
        i=1;
        do{
            i=i*2;
            System.out.println(i);
        }while(i<100);
        
      
        for(i=0;i<=10;i++){
            System.out.println(i);
        }
    }
    
}
