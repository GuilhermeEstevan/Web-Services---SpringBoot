package com.cursojava.projetowebservices.repositories;

import com.cursojava.projetowebservices.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
