package org.noushin.examples;


import org.noushin.examples.myapp.Car;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int myNum=6;
        double myDoubleNum=5.25;
        char myLetter='N';
        boolean myBool=true;

        Car myCar=new Car();
        myCar.drive();
        myCar.stop();

    }
}