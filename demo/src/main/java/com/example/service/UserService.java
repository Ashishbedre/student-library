package com.example.service;
//User Service
@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
	
	public User getUserByName(String name) {
		return userRepository.findByName(name);
	}
	
	public User getUserByEmail(String email) {
		return userRepository.findByEmail(email);
	}
	
	public User saveUser(User user) {
		return userRepository.save(user);
	}
	
	public void deleteUser(User user) {
		userRepository.delete(user);
	}
	
}
