/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
//        int[][]matrixa;
//        int[][]matrixb;
//        int hang = sc.nextInt();
//        int cot= sc.nextInt();
//        matrixa = new int[hang][cot];
//        for (int i = 0; i < hang; i++) {
//          
//            for (int j = 0; j < cot; j++) {
//              
//               
//               matrixa[i][j] = sc.nextInt();
//                 System.out.println("hang"+i+" la: "+matrixa[i][j]);
//            }
//           
//            
        //}
        System.out.println("nhap dang ma tran 1:");
        int h1 = sc.nextInt();
        int h2 = sc.nextInt();
        System.out.println("nhap ma tran 2 :");
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] a = new int[h1][c1];
        int[][] b = new int[h2][c2];
        for (int i = 0; i < h1; i++) {
            System.out.print(""+ "");
            for (int j = 0; j < c1; j++) {
               // System.out.print("vi tri " + i + " va " + j);
               // System.out.println("nhap phan tu:");
                a[i][j] = sc.nextInt();

            }
            System.out.println("");

        }
        for (int i = 0; i < h2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.println("vi tri " + i + " va " + j);
                System.out.println("nhap phan tu:");
                b[i][j] = sc.nextInt();

            }

        }
        System.out.println("tong cua 2 ma tran");
       int[][]c = new int[h1][c1];
        for (int i = 0; i < h1; i++) {
            for (int j = 0; j < c1; j++) {
              
         c[i][j] = a[i][j] + b[i][j];
               
             System.out.print(""+c[i][j]);
            }
            System.out.println("");
            
            
        }
       //vong for 1 la den hang 
       //vong for 2 den tung phan tu trong hang
       int[][]d = new int[h1][c2];
        System.out.println("tich 2 ma tran");
       
//        for (int i = 0; i < h1;i++){
//            for (int j = 0; j < c2; j++) {
//                if(c1 == h2){
//                   d[h1][c2] = a[h1][c1] + b[h2][c2];
//                    System.out.println(d[i][j]);
//                }
//                
//                System.out.println("   ");
//            
//        }
//           

   // }
        //chuyen vi b[i][j] = a[j][i]
}
}
