package org.kata.entities;

import java.time.LocalDateTime;
import java.util.Objects;
import org.kata.entities.*;
public class Client {
    private String firstName;
    private String lastName;



    public Client(String firstName, String lastName, Account account) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public Transaction makeTransaction(String TransactionType,float amount){
        return new Transaction("",amount,TransactionType, LocalDateTime.now());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(firstName, client.firstName) && Objects.equals(lastName, client.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
