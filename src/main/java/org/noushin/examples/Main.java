package org.noushin.examples;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Print the numbers 0 through 4.
        for (int i=0;i<5;i++){
            System.out.println(i);
        }

        //Print numbers in a loop and after each number print three *
        for (int i=1;i<=2;i++){
            System.out.println(i);
            for (int j=1;j<=3;j++){
                System.out.println("*");

            }
        }


    }
}