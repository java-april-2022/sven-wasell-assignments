package com.svenwasell.bookclub.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.svenwasell.bookclub.models.LoginUser;
import com.svenwasell.bookclub.models.User;
import com.svenwasell.bookclub.repositories.UserRepository;
    

    
@Service
public class UserServices {
    
	@Autowired
	private UserRepository repo;
    @Autowired
    private UserRepository userRepo;
    
    // TO-DO: Write register and login methods!
    public User register(User newUser, BindingResult result) {
    	
    	Optional<User> potentialUser = userRepo.findByEmail(newUser.getEmail());
		if(potentialUser.isPresent()) {
			result.rejectValue("email", "Account", "Email already in use");
		}

    	if(!newUser.getPassword().equals(newUser.getConfirm())) {
    	    result.rejectValue("confirm", "Matches", "The Confirm Password must match Password!");
    	}
    	
		if(result.hasErrors()) {
			return null;
		}
		
		String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
		newUser.setPassword(hashed);
		
		newUser = repo.save(newUser);
		
		return newUser;
    }
    
    public User login(LoginUser newLoginObject, BindingResult result) {
    	
    	Optional<User> potentialUser = userRepo.findByEmail(newLoginObject.getEmail());
    		if(!potentialUser.isPresent()) {
    			result.rejectValue("email", "MissingAccount", "Account not found");
    			return null;
    		}
        
        User user = potentialUser.get();
        
		if(!BCrypt.checkpw(newLoginObject.getPassword(), user.getPassword())) {
            result.rejectValue("password", "Matches", "Invalid Password!");
        }
		
		if(result.hasErrors()) {
			return null;
		}
		return user;

    }

	public User findByEmail(String email) {
		
		Optional<User> result = repo.findByEmail(email);
		if(result.isPresent()) {
			return result.get();
		}
		
		return null;
	}
	
	public User findById(Long id) {
		
		Optional<User> result = repo.findById(id);
		if(result.isPresent()) {
			return result.get();
		}
		
		return null;
	}
}
