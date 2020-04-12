package com.example.accountservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import javax.xml.transform.sax.SAXSource;
import java.util.List;

@RestController
public class AccountController {

    @Autowired
    AccountService accountService;

    @PostMapping
    public ResponseEntity postAcoount(@RequestBody Account account) {
        System.out.println("PostAccount");

        Account savedAccount = accountService.saveAccount(account);
        if (savedAccount == null) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        } else {
            return new ResponseEntity(HttpStatus.CREATED);
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<Account> somethingToGet(@PathVariable int id){
        System.out.println("GetAccount");
        Account retrievedAccount = accountService.getAccount(id);
        if(retrievedAccount == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<>(retrievedAccount,HttpStatus.OK);
        }
    }

    @GetMapping("")
    public ResponseEntity<List<Account>> getAll(){
        List<Account> allAccount =accountService.getAllAccount();
        return new ResponseEntity<>(allAccount,HttpStatus.OK);
    }


}
