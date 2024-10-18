package com.DemoSpringboot.Demo.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DemoSpringboot.Demo.Service.UserServices;
import com.DemoSpringboot.Demo.model.User;
import com.DemoSpringboot.Demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserServices {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public Optional<User> getUserById(Long id) {
		return userRepository.findById(id);
	}

	@Override
	public User createUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}
}
