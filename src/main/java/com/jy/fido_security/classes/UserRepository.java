package com.jy.fido_security.classes;

import org.springframework.data.repository.CrudRepository;
import java.util.ArrayList;

public interface UserRepository extends CrudRepository<User, Long> {
    ArrayList<User> findByUsername(String username);
    ArrayList<User> findByPassword(String password);
}
