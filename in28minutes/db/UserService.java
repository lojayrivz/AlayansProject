package com.in28minutes.db;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public List<UserDB> getAllUsers(){
		List<UserDB> users = new ArrayList<>();
		userRepository.findAll()
		.forEach(users::add);
		return users;
		
	}
	
	public void addUser(UserDB user) {
		userRepository.save(user);
	}
	
	public Optional<UserDB> getUser(String id) {
		return userRepository.findById(id);
	}
	
	public void updateUser(String id, UserDB user) {
		userRepository.save(user);
	}
	
	public void deleteUser(String id) {
		userRepository.deleteById(id);
	}
}
