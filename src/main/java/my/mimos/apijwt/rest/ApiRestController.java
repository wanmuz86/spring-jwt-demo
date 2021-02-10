package my.mimos.apijwt.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.mimos.apijwt.entity.User;
import my.mimos.apijwt.rest.request.LoginForm;
import my.mimos.apijwt.service.UserDetailService;
import sun.security.provider.certpath.OCSPResponse.ResponseStatus;

@RestController
@RequestMapping("api/auth")
public class ApiRestController {

	@Autowired
	private UserDetailService userDetailService;
	
	
	@PostMapping("/register")
	public ResponseEntity<String> register(@RequestBody User user) {
		user.setId(0);
		userDetailService.createUser(user);
		return ResponseEntity.ok("User successfully registered");
	}
	
	// TO DO -- for login later
	
	@PostMapping("/login")
	public ResponseEntity<String> loginUser(@RequestBody LoginForm loginForm) {
		User user =  userDetailService.loginUser(loginForm.getUsername(), 
				loginForm.getPassword());
		if (loginForm.getPassword().equals(user.getPassword())) {
			return ResponseEntity.ok("login succesful ");
		}
		else {
		return ResponseEntity.ok("not found");
		}
	}
}
