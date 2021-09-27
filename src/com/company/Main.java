package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        //vat calculator
        final double VAT = 1.2;

        System.out.println("Enter an amount ");
        double amount = input.nextDouble();
        double finalTotal = amount*VAT;
        System.out.println("Your price +VAT is £"+finalTotal);

        //for loop practiced

        for(int i=0; i<10; i=i+2){
            System.out.println(i);
        }
        for(int i=10; i>0; i--){
            System.out.println(i);
        }
        for(int i=0;i != 11;i++){
            System.out.println("Loop Value = "+i);
        }
        // nested for loop practiced
        for(int i = 0;i<10;i++){
            for(int j=0; j<10;j++){
                System.out.print(j);
            }
            System.out.println("");
        }



    }
}
