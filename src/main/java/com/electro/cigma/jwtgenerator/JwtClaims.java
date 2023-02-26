package com.electro.cigma.jwtgenerator;

import com.electro.cigma.entity.User;
import com.electro.cigma.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class JwtClaims {

	@Autowired
	private UserRepository userRepository;

	protected List<String> userRoles(String username) {
		List<String> roles = new ArrayList<>();
		User user = userRepository.findByEmail(username);
		String[] userRoles = user.getUserRoles().split(",");
		List<String> refactorRoles = Arrays.asList(userRoles);
		for (String ur : refactorRoles)
			roles.add(ur);
		return roles;
	}

	protected String getUsersName(String username) {
		return userRepository.findByEmail(username).getFullname();
	}

	protected int getId(String username) {
		return userRepository.findByEmail(username).getId();
	}

}
