package com.cognimicroservice.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognimicroservice.userservice.modal.Account;
import com.cognimicroservice.userservice.services.UserService;

@RestController
public class UserController {
	@Autowired
	  private UserService userService;
	  
	  @GetMapping(value="/user/{id}")
	  public List<Account> showEmployees(@PathVariable("id") String id) {     
	    List<Account> accounts = userService.showEmployees(id);
	    // displaying accounts
	    for(Account acct : accounts) {
	      System.out.println(acct.getEmpId());
	      System.out.println(acct.getAccountId());
	      System.out.println(acct.getBranch());
	    }
	    return accounts;          
	  }
}
