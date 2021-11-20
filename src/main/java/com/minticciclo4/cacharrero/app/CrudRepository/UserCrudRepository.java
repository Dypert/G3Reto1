package com.minticciclo4.cacharrero.app.CrudRepository;

import com.minticciclo4.cacharrero.app.model.User;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author dyper
 */
public interface UserCrudRepository extends CrudRepository<User,Integer> {
    
    /**
     * 
     * @param name
     * @return 
     */
    public Optional<User> findByName(String name);
    /**
     * 
     * @param email
     * @return 
     */
    public Optional<User> findByEmail(String email);
    /**
     * 
     * @param name
     * @param email
     * @return 
     */
    public List<User> findByNameOrEmail(String name, String email);
    /**
     * 
     * @param email
     * @param password
     * @return 
     */
    public Optional<User> findByEmailAndPassword(String email, String password);
    
}
