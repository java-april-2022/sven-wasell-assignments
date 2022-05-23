package com.svenwasell.bookclub.repositories;

import java.util.Optional;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.svenwasell.bookclub.models.User;

    
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    
	List<User> findAll();
    Optional<User> findByEmail(String email);
    
}
