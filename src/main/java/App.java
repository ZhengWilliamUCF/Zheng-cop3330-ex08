/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 William Zheng
 */

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        String Num1 = myApp.readPeople();
        String Num2 = myApp.readPizzaAmount();
        String Num3 = myApp.readSlicesPerPizza();
        int int1 = Integer.parseInt(Num1);
        int int2 = Integer.parseInt(Num2);
        int int3 = Integer.parseInt(Num3);
        int totalSlices = myApp.totalSlices(int2, int3);
        int leftoverSlices = myApp.leftoverSlices(totalSlices, int1);
        int slicesPerPerson = myApp.slicePerPerson(totalSlices, leftoverSlices, int1);
        String outputString = myApp.generateOutputString(int1, int2, totalSlices, slicesPerPerson, leftoverSlices);
        myApp.printOutput(outputString);
    }

    public void printOutput(String outputString) {
        System.out.println(outputString);
    }

    public String readPeople(){
        System.out.print("How many people? ");
        return in.nextLine();
    }

    public String readPizzaAmount(){
        System.out.print("How many pizzas do you have? ");
        return in.nextLine();
    }

    public String readSlicesPerPizza(){
        System.out.print("How many slices per pizza? ");
        return in.nextLine();
    }

    public int totalSlices(int int2, int int3){
        return int2 * int3;
    }

    public int slicePerPerson(int totalSlices, int leftoverSlices, int int1){
        return ((totalSlices - leftoverSlices)/ int1);
    }

    public int leftoverSlices(int totalSlices, int int1){
        return totalSlices % int1;
    }

    public String generateOutputString(int int1, int int2, int totalSlices, int slicesPerPerson, int leftoverSlices){
        return String.format("%d people with %d pizzas (%d slices)\nEach person gets %d pieces of pizza.\nThere are %d leftover pieces.", int1, int2, totalSlices, slicesPerPerson, leftoverSlices);
    }
}