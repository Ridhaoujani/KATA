package org.kata
        .entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class Transaction {
    String transactionUUID;
    private final float amount;
    private final String transactionType;

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    LocalDateTime transactionDate ;

    public Transaction(String transactionUUID, float amount, String transactionType, LocalDateTime transactionDate) {
        this.transactionUUID = (UUID.randomUUID()).toString().replaceAll("_","");
        this.amount = amount;
        this.transactionType = transactionType;
        this.transactionDate = transactionDate;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public float getAmount() {
        return amount;
    }

    public String getTransactionType() {
        return transactionType;
    }
    public String getTransactionUUID() {
        return transactionUUID;
    }

    public void setTransactionUUID(String transactionUUID) {
        this.transactionUUID = transactionUUID;
    }
    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }
}
