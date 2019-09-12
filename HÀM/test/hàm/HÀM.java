/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hàm;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class HÀM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ketQua = tong(3, 6);
        System.out.println(ketQua);
        //
        tinhTong(4, 5);
        //    int[] h = {1, 2, 3, 4, 3};
        int a;
        int b;
        a = sc.nextInt();
        boolean aLaSoNguyenTo = songuyento(a);
        if(aLaSoNguyenTo){
            System.out.println("ádasd");
        } else {
            System.out.println("2456456");
        }
        b = sc.nextInt();
        int phanDu = timphandu5(b);
        System.out.println(b+" chia cho 5 du "+phanDu);
        int[] h ={1,3,4,};
    }
    //input la mot so
    //process tim phan du
    //output mot so
    static int timphandu5(int b)
    {
        int t=b%5;
        return t;
    }
    

    static int tong(int a, int b) {
        int sum = a + b;
        return sum;//dừng hàm
    }

    static void tinhTong(int a, int b) {
        System.out.println(a + b);
    }

    static boolean songuyento(int a) {
        int dem = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                dem++;
            }
        }
        if (dem == 2) {
            return true;
        } else {
            return false;
        }

    }

}
