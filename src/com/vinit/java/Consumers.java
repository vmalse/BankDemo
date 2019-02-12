package com.vinit.java;

import java.util.ArrayList;

public class Consumers {
    ArrayList<Double> myTransactions = new ArrayList<Double>();
    String consumerName;
    int consumerId;

    public Consumers() {

    }

    public ArrayList<Double> getMyTransactions() {
        return myTransactions;
    }

    public String getConsumerName() {
        return consumerName;
    }

    public int getConsumerId() {
        return consumerId;
    }
}
