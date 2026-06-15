package application;

import entities.Account;
import exceptions.BusinessException;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
    try{
         System.out.println("Enter the account data ");
         System.out.print("Number: ");
         int number = sc.nextInt();
         System.out.print("Holder: ");
         sc.nextLine();
         String holder = sc.nextLine();
         System.out.print("Initial balance: ");
         double balance = sc.nextDouble();
         System.out.print("Withdraw Limit: ");
         double withdrawLimit = sc.nextDouble();

         Account acc = new Account(number, holder, balance, withdrawLimit);

         System.out.println();
         System.out.print("Enter the amount for withdraw: ");
         double amount = sc.nextDouble();


         acc.withdraw(amount);
         System.out.printf("New balance: " + "%.2f%n", acc.getBalance());
}
     catch(BusinessException e){
         System.out.print("Withdraw error: " + e.getMessage());
     }
     catch (InputMismatchException e) {
             System.out.println("Error: You must enter valid numbers only!");
         }

        sc.close();
    }
}
