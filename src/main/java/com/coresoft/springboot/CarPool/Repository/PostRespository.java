package com.coresoft.springboot.CarPool.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.coresoft.springboot.CarPool.domain.Post;


@Repository
@Transactional
public interface PostRespository extends JpaRepository<Post, Integer>{
	
	@Query("select p from Post p where p.user_id = ?1")
	public List<Post> findAllPostByUserId(int id);
	
	@Query("select p from Post p where p.startPlace like %?1% and p.endPlace like %?2% ")
	public List<Post> searchByfromEnd(String from, String end);
	
	
	}

		
		
			
		
	


	

