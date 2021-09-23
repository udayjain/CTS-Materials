package com.cognimicroservice.accountservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognimicroservice.accountservice.modal.Account;
import com.cognimicroservice.accountservice.service.AccountService;

@RestController
public class AccountController {
	 @Autowired
	  private AccountService accountService;
	  
	  @GetMapping(value="/accounts/{empId}") 
	  public List<Account>getAccountsByEmpId(@PathVariable String empId) { 
	    System.out.println("EmpId------" + empId);
	    List<Account> empAccountList = accountService.findAccountsByEmpId(empId);
	    return empAccountList; 
	  }
}
