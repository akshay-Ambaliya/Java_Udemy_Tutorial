/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generics;

/**
 *
 * @author Dell
 */
public class GenericsWithArray<T> {

    public T[] arr = (T[])new Object[10];
    public int length=0;
    
    public void append(T element){
        arr[length++] = element;
    }
    
    public void display(){
        for(int i=0;i<length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        GenericsWithArray<String> genericArray = new GenericsWithArray<>();
        genericArray.append("Akshay");
        genericArray.append("Manoj");
        genericArray.append("Hitesh");
        genericArray.display();
        
        GenericExample<Integer,String> tkArray = new GenericExample<>();
        GenericExample tkArray2 = new GenericExample(); // This will pass Object as parameter
    }
}


class GenericExample<T,K extends String>{
    public T[] arr = (T[])new Object[10];
    public int length=0;
    
    public void append(T element){
        arr[length++] = element;
    }
    
    public void display(){
        for(int i=0;i<length;i++){
            System.out.println(arr[i]);
        }
    }
    
    public K[] kArr = (K[])new Object[10];
    public int kLength=0;
    
    public void kAppend(K element){
        kArr[kLength++] = element;
    }
    
    public void kDisplay(){
        for(int i=0;i<kLength;i++){
            System.out.println(kArr[i]);
        }
    }
}