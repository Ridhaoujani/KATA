package org.kata.entities;

import java.util.HashMap;
import java.util.Map;
import org.kata.entities.*;
public class Bank {
    private String bankName;
    private Map<Client, Account> accounts ;


    public Bank(String bankName, HashMap<Client,Account> accounts) {
        this.bankName = bankName;
        this.accounts=accounts;
    }


    public String getBankName() {
        return bankName;
    }

    public Map<Client, Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Map<Client, Account> accounts) {
        this.accounts = accounts;
    }
    public void addAccount(Account acc,Client client){
        accounts.put(client,acc);
    }
}
