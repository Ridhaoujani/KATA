package org.kata.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.kata.entities.*;
public class Account {
    private double balance;
    private List<Transaction> transactions= new ArrayList<>();

    public Account(double balance, ArrayList<Transaction> transactions) {
        this.balance = balance;
        this.transactions=transactions;
    }

    public double getBalance() {
        return balance;
    }
    public void getAllTransaction(){
        System.out.println("Printing the transaction history :");
        for(Transaction tran:transactions){
            System.out.println(String.format("Transaction made on %s with ID [%s]",
                    tran.getTransactionDate(),
                    tran.getTransactionUUID()));
        }
    }
    public void operation(Transaction tran){
        switch (tran.getTransactionType().toLowerCase()){
            case "withdrawal":
                if(this.getBalance()-tran.getAmount()>=0.0){
                    this.balance-=tran.getAmount();
                    tran.setTransactionDate(LocalDateTime.now());
                    transactions.add(tran);
                    System.out.println(String.format("amount %s withdrawed from your account \nnew balance : %s",
                            tran.getAmount(),
                            this.getBalance()));
            }
                else {
                    System.out.println("Insufficient account balance ");
                    break;
                };
            case "deposit":
                this.balance+=tran.getAmount();

                transactions.add(tran);
                System.out.println(String.format("******** \nTransaction made with transaction id : [%s] \nAmount [%s] added to your account \nnew balance : %s \n********",
                        tran.getTransactionUUID(),
                        tran.getAmount(),
                        this.getBalance()));
            default:
                System.out.println("invalid operation, please try again");
        }

    }
    public List<Transaction> getTransactions() {
        return transactions;
    }
}
