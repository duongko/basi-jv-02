/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        //  int a = 3;//so nguyen
        //  char c = 'a';//dang chu
        // double d = 4.5;//so thap phan
        // float f = 4.56f;//so thap phan hon
        // boolean t = true ;//dang dung,sai
//system.out.prinf("hello");
//giai phuong trinh ax + b=0;
        // a = 7;
        //  int b = 3;
        // int x;
        //int/int=int
        //int/float=float

        //  x = -b / a;
        //System.out.print(x);
        Scanner sc = new Scanner(System.in);//nhap gia tri tu ban phim k co dinh
        // int a = 3;
        //String input;//dang bien chuoi ki tu
        //System.out.println("nhap vao :");
        //input = sc.nextline();
        //System.out.println("gia tri a vua nhap la:" + input); // sout - 
        //ax + b = 0;
        int q = 3;
        int p = 5;
        String w = "thang";
        String o = "oop";
        System.out.printf("p = %d \n q= %b \n", p, q);// %d decimail int,%s string
        // %f:float,%b:boolean,%d:int
        // System.out.println("p + w");
        int a;
        int b;
        //a=int c;
        a = sc.nextInt();//
        b = sc.nextInt();
        float x;
        x = -b / a;
        System.out.println(x);
        System.out.printf("x = %d b = %d ", -b / a, b);
        // comment aosdfasd 
    }

}
