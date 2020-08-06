package com.Spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Spring.entity.UserTable;

@Repository
public interface UserRepository extends JpaRepository<UserTable, Integer> {
	
	@Query("select u from UserTable u  where u.username=:username")
	UserTable getUserByUserName(@Param ("username") String username);
}
