package org.kata;

import org.kata.entities.*;


import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("bank",new HashMap<Client, Account>());
        Account clientAccount = new Account(0.0,new ArrayList<Transaction>());
        Client client = new Client("username","user lastname",clientAccount);
        bank.addAccount(clientAccount,client);
        clientAccount.operation(client.makeTransaction("withdrawal",100));
        clientAccount.operation(client.makeTransaction("deposit",100));
        clientAccount.getAllTransaction();

    }
}