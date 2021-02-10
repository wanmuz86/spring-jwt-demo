package my.mimos.apijwt.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.mimos.apijwt.entity.User;
import my.mimos.apijwt.service.UserDetailService;

@RestController
@RequestMapping("api/auth")
public class ApiRestController {

	@Autowired
	private UserDetailService userDetailService;
	
	
	@PostMapping("/register")
	public String register(@RequestBody User user) {
		user.setId(0);
		userDetailService.createUser(user);
		return "User successfully registered";
	}
	
	// TO DO -- for login later
}
