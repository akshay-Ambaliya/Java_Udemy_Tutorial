/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package twoDArray;

/**
 *
 * @author Dell
 */
public class MatricesAddition {
    public static void main(String[] args) {
        int[][] mat1 = {{15,26,48},
                        {48,57,63},
                        {12,23,54}};
        
        int[][] mat2 = {{11,25,32},
                        {62,58,7},
                        {22,54,13}};
        
        int[][] sum = new int[mat1.length][mat1[0].length];
        
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[0].length;j++){
                sum[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        
        
        for(int[] arr:sum){
            for(int ele:arr){
                System.out.print(" " + ele );
            }
            System.out.println("");
        }
        
        
    }
}
