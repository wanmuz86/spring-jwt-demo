package my.mimos.apijwt.service;

import my.mimos.apijwt.entity.User;

public interface UserDetailService {

	
	public void createUser(User user);
	
	public User loginUser(String username, String password);
	
}
