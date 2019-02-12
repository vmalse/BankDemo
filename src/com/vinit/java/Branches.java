package com.vinit.java;

import java.util.ArrayList;

public class Branches {
    ArrayList<Consumers> bankConsumers = new ArrayList<Consumers>();
    String branchNAme;
    int branchId;
    static int consumerCount  = 0;

    public Branches() {
    }

//    public void addBranch(String setBranchName, int setBranchId){
//        this.branchNAme = setBranchName;
//        this.branchId = setBranchId;
//    }
    public void addConsumer(String consumerName,int consumerId, double transactionAmt){
        System.out.println("Add consumer in Branches calss called with cusumer name " + consumerName +
        " Consumer Id " + consumerId + " and transaction amt = " + transactionAmt);


        Consumers myConsumer = new Consumers();
        myConsumer.consumerId = consumerId;
        myConsumer.consumerName = consumerName;

        bankConsumers.add(myConsumer);

        consumerCount++;



    }

    public void displayConsumers(){
        String consumerName;
        int consumerId;
        System.out.println("display consumer called");
        for (int i= 0; i<this.bankConsumers.size(); i++){
            consumerName = bankConsumers.get(i).consumerName;
            consumerId = bankConsumers.get(i).consumerId;
            System.out.println("Consumer ID =" + consumerId + " and Consumer name = " + consumerName);
        }
    }

}
