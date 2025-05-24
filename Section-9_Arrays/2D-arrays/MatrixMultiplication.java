/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package twoDArray;

/**
 *
 * @author Dell
 */
public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] mat1 = {{15,26,48},
                {48,57,63},
                {12,23,54}};
        
        int[][] mat2 = {{11,25,32},
                        {62,58,7},
                        {22,54,13}};
        
        int[][] mul = new int[mat1.length][mat2[0].length];
        
        System.out.println("Multiplication matrix : \n");
        int sum;
        for(int i=0;i<mat1.length;i++){
            
            for(int j=0;j<mat1[0].length;j++){
                sum=0;
                for(int k=0;k<mat2[0].length;k++){
                    System.out.println(mat1[i][k]+ " * "+mat2[k][j]+" = "+(mat1[i][k]*mat2[k][j]));
                    sum+=(mat1[i][k]*mat2[k][j]);
                }
                mul[i][j]=sum;
            }
            System.out.println("\n");
        }
        
        for(int[] arr:mul){
            for(int ele:arr){
                System.out.print(" " + ele );
            }
            System.out.println("");
        }
        
    }
}
