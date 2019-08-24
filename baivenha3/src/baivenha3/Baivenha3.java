/*
 * 1To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baivenha3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Baivenha3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code appl0ication logic here
        int dodai = 10;
        int[] a = new int[dodai];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < dodai; i++) {
            System.out.println("nhap vao so");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < dodai; i++) {
            System.out.print(a[i] + ",");
            sum = sum + a[i];

        }
        System.out.println("");
        System.out.println("sum = " + sum);
        for (int i = 0; i < 10; i++) {

            if (i % 2 == 0) {
                System.out.println("cac phan tu o vi tri chan " + a[i]);
            } else if (i % 2 == 1) {
                System.out.println("cac phan tu o vi tri le: " + a[i]);
            }

        }

        for (int i = 0; i < 10; i++) {
            if (a[i] % 2 == 0) {

            }
            System.out.println("so chia het cho 2 :" + a[i] + ",");
        }

        for (int i = 0; i < 10; i++) {
            if (a[i] % 5 == 1) {
                System.out.println("so chia 5 du 1: "+a[i]);

            }

        }

        int sum1 = 0;
        for (int i = 0; i < 10; i++) {
            if (a[i] % 2 == 0) {
                sum1 = sum1 + a[i];

            }

        }
        System.out.println("tong so chan: sum = :" + sum1);
        {

        }
    }
}
