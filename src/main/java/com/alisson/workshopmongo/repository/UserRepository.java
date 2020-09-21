package com.alisson.workshopmongo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alisson.workshopmongo.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


}
