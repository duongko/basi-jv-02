/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

import static com.oracle.jrockit.jfr.Transition.To;

/**
 *
 * @author Admin
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] hoten = {"To Quang Trung", "Quang Minh Tuan", "Nguyen Huu Phuc", "Tran An", "Tran Huong Giang "
        };
        int[] diem = {4, 6, 3, 5, 2};
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int[] Diem = {4, 6, 3, 5, 2};
                if (j>0) {
                    int t;

                    t = Diem[j];
                    Diem[j] = Diem[j - 1];
                    Diem[j - 1] = t;
                    String h;

                    h = hoten[j];
                    hoten[j] = hoten[j - 1];
                    hoten[j - 1] = h;
                }

            }

        }
        for (int i = 0; i < 5; i++) {
            System.out.print(hoten[i]+" - "+diem[i]+"; ");
        }
        System.out.println("");

    }

}
