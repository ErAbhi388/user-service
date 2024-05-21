package com.user.user_serice.controller;

import java.util.List;

import com.user.user_serice.external_services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.user_serice.entity.Contact;
import com.user.user_serice.entity.User;
import com.user.user_serice.service.impl.UserImpl;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserImpl userImpl;

	@Autowired
	ContactService contactService;
	
	@Autowired
	public RestTemplate resTemplate;
	
	@GetMapping("/{id}")
	public User getUser(@PathVariable("id") Long id) {
		
		User user = userImpl.getUserById(id);
		//List contacts = this.resTemplate.getForObject("http://contact-service/contacts/"+id, List.class);
		List<Contact> contacts=contactService.getContacts(id);
		user.setContacts((java.util.List<Contact>) contacts);
		//return userImpl.getUserById(id);
		return user;
		
	}

}
