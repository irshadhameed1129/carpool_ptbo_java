package com.coresoft.springboot.CarPool.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coresoft.springboot.CarPool.Repository.ViewUserPostRepository;
import com.coresoft.springboot.CarPool.domain.ViewUserPost;


@Service
public class ViewUserPostService {
	
	@Autowired
	private ViewUserPostRepository viewUserPostRepository;
	
	
	public List<ViewUserPost> searchByfromEnd(String from, String end) {
		return viewUserPostRepository.searchByfromEnd(from,end);
	}
	
	
	
	

}
