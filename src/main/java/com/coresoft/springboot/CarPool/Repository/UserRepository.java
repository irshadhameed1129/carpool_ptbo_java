package com.coresoft.springboot.CarPool.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.coresoft.springboot.CarPool.domain.User;


@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Integer>{
	@Query("select p from User p where p.email = ?1 and p.pass=?2")
	public User findByEmailPass(String email, String pass);
	
	
	@Query("select p from User p where p.email = ?1")
	public User findByEmail(String email);
	
	@Query("select p from User p where p.id = ?1")
	public User findById(int id);
	
	@Modifying
	@Query("update  User p  set  p.mobile = ?1, p.pass= ?2  where p.id=?3")
	public int update(String mobile, String pass, int id);
	
	
		
	}

		
		
			
		
	


	

