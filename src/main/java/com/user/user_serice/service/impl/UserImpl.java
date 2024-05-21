package com.user.user_serice.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.user_serice.entity.User;

@Service
public class UserImpl {
	
	List<User> user =  List.of(new User("Abhishek", 123L, "98776"),
			new User("Anurag", 567L, "12345"),
			new User("Shakshi", 890L, "6789"));
	
	public User getUserById(Long id) {
		return user.stream().filter(user -> user.getUserId().equals(id)).findAny()
				.orElse(null);
	}

}
