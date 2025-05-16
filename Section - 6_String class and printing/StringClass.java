/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringclass;

/**
 *
 * @author Dell
 */
public class StringClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //Method 1
        String str1="Java program";
        System.out.println(str1);
        
        
        //Method 2
        String str2= new String("JAVA");
        System.out.println(str2);
        
        
        //Method 3
        char c[] = {'a','k','s','h','a','y'};
        String str3 = new String(c);
        System.out.println(str3);
        
        
        //Method 4
        byte b[]={65,67,68,66};
        String str4 = new String(b);
        System.out.println(str4);
        
         String s1="Java";
         String s2="Java";
         //Reference to the same object
         System.out.println(s1==s2);
         
         s2 = new String("Java");
         //Reference to the new object 
         System.out.println(s1==s2);
         
         //Commonly Used String Method
         
         String temp ="akshlasjshdflkjahsdfkl";
         // 1.length
         System.out.println("length : "+str1.length());
         
         // 2. toLowerCase
         System.out.println("toLowerCase : " + s1.toLowerCase());
         
         // 3. toLowerCase
         System.out.println("toUpperCase  : " + s1.toUpperCase());
         
         // 4. trim
         str1="  akshay";
         System.out.println("trim : " + str1.trim());
         
         System.out.println("\n\nActual String : "+temp);
         // 5. substring(int begin)
         System.out.println("substring : " + temp.substring(3));
         
         // 6. substring(int begin , int end)
         System.out.println("substring : " + temp.substring(5 , 8));
         
         // 7. replace(char old,char new)
         System.out.println("replace : " + temp.replace('h','H'));
         
         // 8. startsWith(String s)
         System.out.println("startsWith : "+temp.startsWith("aks"));
         
         // 9. endsWith(String s)
         System.out.println("endsWith : "+temp.endsWith("fkl"));
         
         // 10. charAt(int index)
         System.out.println("charAt: "+temp.charAt(5));
         
         // 11. indexOf(String s)
         System.out.println("indexOf 1 : "+temp.indexOf("aks"));
         System.out.println("indexOf 2 : "+temp.indexOf("a" , 8));
         System.out.println("indexOf 3 : "+temp.indexOf("?"));
         
         // 12. lastIndexOf(String s)
         System.out.println("lastIndexOf 1 : "+temp.lastIndexOf("sh"));
         System.out.println("lastIndexOf 2 : "+temp.lastIndexOf("a" , 8));
         System.out.println("lastIndexOf 3 : "+temp.lastIndexOf("?"));
         
         // 13. equals(String s)
         String temp2="akshlasjshdflkjahsdfkl"; 
         System.out.println("equals 1: " + temp.equals(temp2));
         System.out.println("equals 2: " + temp.equals("akshlasjshdflkjahsdfkl".toUpperCase()));
         System.out.println("equalsIgnoreCase: " + temp.equals("akshlasjshdflkjahsdfkl".toUpperCase()));
         
         // 14. compareTo(String s)
         System.out.println("\"akshay\".compareTo(\"aryan\") : "+"akshay".compareTo("aryan"));
    }    
}
