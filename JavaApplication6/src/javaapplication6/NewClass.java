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
public class NewClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("số phần tử trong mang là:");
        int dodai = sc.nextInt();
        int[] a = new int[dodai];
        System.out.println("nhap mang a la: ");

        for (int i = 0; i < dodai; i++) {
            a[i] = sc.nextInt();

        }
        System.out.println("mang a là:");
        System.out.print("[");
        for (int i = 0; i < dodai; i++) {
            System.out.print(a[i] + ",");

        }
        System.out.print("]");
        System.out.println("");
        int max = a[0];
        int min = a[0];
        int b = -1;
        for (int i = 0; i < dodai; i++) {
            if (max < a[i]) {
                max = a[i];

            }

            if (min > a[i]) {
                min = a[i];

            }

        }
        System.out.println("phan tu lon nhat: " + max);
        System.out.println("gia tri nho nhat: " + min + " thanh " + b);

        System.out.println("chuyen phan tu le thanh -1 là:");
        System.out.print("[");
        for (int i = 0; i < dodai; i++) {
            if (a[i] % 2 == 1) {
                a[i] = -1;
                System.out.print(a[i] + ",");

            } else {
                System.out.print(a[i] + ",");
            }
        }
        System.out.print("]");
        System.out.println("");
        System.out.println("nhap gia tri x: ");
        int x;
        x = sc.nextInt();
        for (int i = 0; i < dodai; i++) {
            if (a[i] < x) {
                System.out.println("gia tri nho hon x la: " + a[i]);

            }
        }
          int y = a[0];
        for (int i = 0; i < dodai; i++) {
            if ((y < a[i]) && (a[i] < x)) {
                y = a[i];
            }
        }
        
        System.out.println("gia tri gan nhat la: " + y);
    
            }

        }
        

