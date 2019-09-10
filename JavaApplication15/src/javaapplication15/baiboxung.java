/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class baiboxung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu mang");
        int dodai;
        dodai = sc.nextInt();
        int[] a = new int[dodai];
        System.out.println("nhap mang a");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            System.out.println("a[" + i + "]= " + a[i]);

        }
        boolean X = true;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                    X = false;

                }

            }

        }
        if(X==false){
            System.out.println("mang a chưa dc sap xep");
        }else{
            System.out.println("mang a dc sap xep");

    }
        
        System.out.println("mang a duoc sap xep");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");

        }
        System.out.println("");


    }
}
