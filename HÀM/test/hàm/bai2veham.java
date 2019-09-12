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
public class bai2veham {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so a: ");
        
        int a;
        a= sc.nextInt();
        boolean kiemtra= phantu(a);
       if(kiemtra==true){
           System.out.println("la so chan");
       }else{
           System.out.println("khong phai so chan  ");
       }
    }
    static boolean phantu(int a){
        
               
        
            if(a%2==0){
            
            return true;
        }else{
                return false;
            }
            
        
    }

}
