package com.cognimicroservice.userservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.cognimicroservice.userservice.modal.Account;
@Service
public class UserService {
	@Autowired
	  private RestTemplate restTemplate;
	  public List<Account> showEmployees(@PathVariable("id") String id) {
	    System.out.println(id);
	    //List<Account> accounts = new RestTemplate().exchange(
	    //"http://localhost:9000/accounts/{empId}", HttpMethod.GET, null, new
	    //ParameterizedTypeReference<List<Account>>(){}, id).getBody();
	    
	    List<Account> accounts = restTemplate.exchange(
	    "http://ACCOUNT-SERVICE/accounts/{empId}",
	    HttpMethod.GET,
	    null,
	    new ParameterizedTypeReference<List<Account>>(){}, id).getBody();
	    return accounts;          
	  }
}
