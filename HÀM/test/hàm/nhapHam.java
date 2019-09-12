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
public class nhapHam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        a=sc.nextInt();
        int t = a % 5;
        System.out.println(t);
    }
}
