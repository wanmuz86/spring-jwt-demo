package my.mimos.apijwt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.mimos.apijwt.entity.User;
import my.mimos.apijwt.repository.UserRepository;

@Service
public class UserDetailServiceImpl implements UserDetailService {

	@Autowired
	public UserRepository userRepo;
	@Override
	
	public void createUser(User user) {
		
		userRepo.save(user);
	}

	@Override
	public User loginUser(String username, String password) {
	
		// I will do the password verification on Controller instead 
		
		return userRepo.findOneByUsername(username);
	}

}
