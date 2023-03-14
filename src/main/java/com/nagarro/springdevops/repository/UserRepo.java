package com.nagarro.springdevops.repository;

import com.nagarro.springdevops.entity.AddUser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<AddUser, Long>{

}
