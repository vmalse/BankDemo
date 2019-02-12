package com.vinit.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank();
        boolean myquit = true;

        Scanner scanner = new Scanner(System.in);
        int option;
        String tempBranchName;
        int tempBranchId;
        String tempConsumerName;
        int tempConsumerId;
        double temTransactionAmt;
        while(myquit){
            displayMenu();
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option){
                case 1:
                {
                    //bank.addBranch("Branch1" , 1234);
                    System.out.print("Enter Branch name");
                    tempBranchName = scanner.nextLine();
                    System.out.print("Enter Branch Id");
                    tempBranchId = scanner.nextInt();
                    bank.addBranch(tempBranchName, tempBranchId);
                    break;
                }
                case 2:
                {
                    bank.displayBranches();


                    break;
                }
                case 3:
                {
                    //bank.addConsumer("Consumer1", 1234, 1.0 );
                    System.out.println("Enter Branch Id to add Consumer");
                    tempBranchId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("enter Consumer Name");
                    tempConsumerName = scanner.nextLine();
                    System.out.println("Enter consumer Id");
                    tempConsumerId = scanner.nextInt();
                    System.out.println("Enter Transaction amonut");
                    temTransactionAmt = scanner.nextDouble();
                    bank.addConsumer(tempConsumerName, tempBranchId, tempConsumerId, temTransactionAmt);
                    break;
                }
                case 4:
                {
                    //bank.displayConsumerInBranch(1234, true); //true = show transactions
                    System.out.println("Enter Branch id");
                    int branchId = scanner.nextInt();
                    bank.displayConsumerInBranch(branchId, true);
                    break;
                }
                case 5:
                {
                    bank.addTransaction(1234,1234 ,2.0 );
                    break;
                }
                case 6:
                {
                    myquit = false;
                    break;
                }

            }
        }
    }
    static void displayMenu(){
        System.out.println("1. Add Branch");
        System.out.println("2. Display Bank Branches");
        System.out.println("3. Add Consumer to Branch");
        System.out.println("4. Display Consumer in a Branch");
        System.out.println("5. Add Transaction for a customere");
        System.out.println("6. Quit");
    }
}
