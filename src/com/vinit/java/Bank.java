package com.vinit.java;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branches> myBranches = new ArrayList<Branches>();
    static int branchCount  = 0;

    public void addBranch(String branchName, int bracnhId){

        Branches myBranch = new Branches();
        myBranch.branchId = bracnhId;
        myBranch.branchNAme = branchName;
        this.myBranches.add(myBranch);
        branchCount++;

        System.out.println("Add Branch called");

    }
    public void displayBranches(){
        String branchName;
        int bracnhId;
        System.out.println("display Branches called");
        for (int i= 0; i<this.myBranches.size(); i++){
            branchName = myBranches.get(i).branchNAme;
            bracnhId = myBranches.get(i).branchId;
            System.out.println("Bnranch ID =" + bracnhId + " and Branch name = " + branchName);
        }
    }
    public void addConsumer(String consumerName, int branchId, int consumerId, double transactionAmt){
        System.out.println("add Consumer in Bank Class called");
        int branchposition = 0;
        boolean gotit = false;
        for (int i= 0; i<this.myBranches.size(); i++) {
            if(branchId == this.myBranches.get(i).branchId){
                branchposition = i;
                gotit = true;
                break;
            }

        }
        if(gotit == true){
            System.out.println(" The Brnach ID is " + branchId + " and The Brnach is at positon " + branchposition);
            myBranches.get(branchposition).addConsumer(consumerName,consumerId,0.0);

        }

        else {
            System.out.println("No maprching Branch found");
        }



    }
    public void displayConsumerInBranch(int branchId, boolean toShowTransaction){
        System.out.println("displayConsumerInBranch called");
        int branchposition = 0;
        for (int i= 0; i<this.myBranches.size(); i++) {
            if(branchId == myBranches.get(i).branchId){
                branchposition = i;
                break;
            }
            else{
                System.out.println("No maprching Branch found");
            }
        }
        System.out.println(" The Brnach ID is " + branchId + " and The Brnach is at positon " + branchposition);
        myBranches.get(branchposition).displayConsumers();


    }

    public void addTransaction(int branchId, int consumerId ,double transaction ){
        System.out.println("addTransaction called");
    }

    public Bank() {

    }


}
