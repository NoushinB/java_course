package org.noushin.examples;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age=scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please enter your name: ");
        String name=scanner.nextLine();

        System.out.println("Your age is: "+age);
        System.out.println("Your name is: "+name);
        scanner.close();

    }
}