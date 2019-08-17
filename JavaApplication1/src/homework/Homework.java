/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;
import java.util.Scanner;
import static sun.net.www.http.HttpClient.New;
/**
 *
 * @author Admin
 */
public class Homework {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        //bài 1:tinh tong,hieu ,tich , luy thua ,thuong
       
        Scanner sc = new Scanner(System.in);
        double a ;
        a = sc.nextDouble();
        double b;
        b = sc.nextDouble();
       double tong = a + b;
       double hieu = a - b;
        double tich = a * b;
        double thuong = a / b;
        double luythua = Math.pow(a,b);
       System.out.println("gia tri tong la:" + tong);
        System.out.println("gia tri hieu la: " + hieu);
        System.out.println("gia tri tich la:" + tich);
      System.out.println("gia tri thuong la:" + thuong);
        System.out.println("gia tri luy thua" + luythua);
        ///bài tạp 2: giải phương trinh bac hai
       // Scanner sc = new Scanner(System.in);
         double A;
        A = sc.nextDouble();
        System.out.println(" gia tri A la:" +A);
        double B;
        B = sc.nextDouble();
        System.out.println("gia ti B la:" +B);
        double c = sc.nextDouble();
        System.out.println("gia tri c la:" +c);
        if(A==0){
          if(B==0 && c!=0){
        System.out.println("Phuong trinh  vo nghiem");}
        else if (B==0 && c==0)
                System.out.println("phuong trinh  co vo so nghiem");
            }
        else {
         double delta=B*B-4*A*c ; 
         double x1;
         double x2;
         if (delta>0){
              x1=(double)((-B)+Math.sqrt(delta)/(2*A));
              x2=(double)((-B)-Math.sqrt(delta)/(2*A));
             System.out.println("phuong trinh co 2 nghiem la:" + "x1="+x1+ "va x2="+x2); 
         }else if(delta==0){
             x1= (-B/(2*A));
             System.out.println("phuong trinh co nghiem kep:"+ "x1=x2="+x1);
         }else{
             System.out.println("phuong trinh vo nghiem");
         }
        }
    }
        
        
        
}
