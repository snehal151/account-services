package com.example.accountservices;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.ZonedDateTime;

@Entity
public class Account {

    @Id
    int accountId;
    String accountName;
    String accountType;
    String accountStatus;

    ZonedDateTime date;

    public int getAccountId() {
        return accountId;
    }

    public String getAccountName(){
        return accountName;
    }

    public String getAccountType(){
        return accountType;
    }

    public String getAccountStatus() {
        return accountStatus;
    }


    public ZonedDateTime getDate(){
        return date;
    }
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public void setAccountName(String accountName){
        this.accountName = accountName;

    }
    public void setAccountType(String accountType){
        this.accountType = accountType;
    }
    public void setAccountStatus(String accountStatus){
        this.accountStatus = accountStatus;
    }

    public void setDate(ZonedDateTime date) {
        this.date = date;
    }
}
