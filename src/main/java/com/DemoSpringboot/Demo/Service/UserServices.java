package com.DemoSpringboot.Demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.DemoSpringboot.Demo.model.User;

public interface UserServices {
	List<User> getAllUsers();

	Optional<User> getUserById(Long id);

	User createUser(User user);

	void deleteUser(Long id);
}
