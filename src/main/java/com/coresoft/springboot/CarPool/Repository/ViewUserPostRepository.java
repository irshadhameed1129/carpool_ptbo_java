package com.coresoft.springboot.CarPool.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.coresoft.springboot.CarPool.domain.ViewUserPost;


@Repository
@Transactional
public interface ViewUserPostRepository extends JpaRepository<ViewUserPost, Integer>{

	@Query("select p from ViewUserPost p where p.startPlace like %?1% and p.endPlace like %?2% ")
	public List<ViewUserPost> searchByfromEnd(String from, String end);
	
	
		
	}

		
		
			
		
	


	

