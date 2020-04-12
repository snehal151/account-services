package com.example.accountservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class AccountService {

    @Autowired
    CrudRepository accountRepository;

    public Account saveAccount(Account newAccount) {
        int newId = (int) accountRepository.count()+1;
        newAccount.setAccountId(newId);
        accountRepository.save(newAccount);
        return newAccount;
    }

    public Account getAccount(int id) {
       Optional<Account> byId =  accountRepository.findById(id);
       if(byId.isPresent()){
           return byId.get();
       }else{
           return null;
       }
    }

    public List<Account> getAllAccount() {
        List<Account> tempList= new ArrayList<>();
        Iterable<Account> iterable= accountRepository.findAll();
        Iterator<Account> iterator= iterable.iterator();
        while(iterator.hasNext()){
            Account next = iterator.next();
            tempList.add(next);
        }
    return tempList;
    }
}
