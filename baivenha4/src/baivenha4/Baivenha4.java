/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baivenha4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Baivenha4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[5][5];
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.println("do dai cau mang " + i + " là: ");
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();

                sum = sum + a[i][j];

            }

        }
        System.out.println("tong tat ca cac phan tu la: " + sum);
        int sum1 = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum1 = sum1 + a[i][j];
                System.out.println("tong cac phan tu trong mang o vi tri" + i + "là:" + sum1);

            }
            // System.out.println("tong cac phan tu trong o vi tri "+i+"la:"+ sum1);

        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("so thu tu mang" + i);
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] % 3 == 0) {
                    System.out.println("so chia het cho 3 là:" + a[i][j]);

                }

            }

        }

        for (int i = 0; i < a.length; i++) {

            for (int j = 1; j < a[i].length; j++) {
                for (int k = 1; k < a[i][j]; k++) {
                    int dem = 0;
                    if (a[i][j] % k == 0) {
                       
                        dem++;
                    }
                    if (dem == 1) {
                        System.out.println("so nguyen to là:" + a[i][j]);
                    }
                }

            }

        }

    }

}
