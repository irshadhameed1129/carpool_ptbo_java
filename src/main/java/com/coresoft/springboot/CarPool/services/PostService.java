package com.coresoft.springboot.CarPool.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coresoft.springboot.CarPool.Repository.PostRespository;
import com.coresoft.springboot.CarPool.domain.Post;


@Service
public class PostService {
	
	@Autowired
	private PostRespository postRespository;
	
	
	public List<Post> fetchAllPost() {
		return postRespository.findAll();
	}
	
	public List<Post> getPostByUSerID(int id) {
		return postRespository.findAllPostByUserId( id);
	}
	
	public Post saveNewUser(Post post) {
		return postRespository.save(post);
	}
	public  List<Post>  searchPost(String from, String end) {
		return postRespository.searchByfromEnd(from, end);
	}
	
public String deleteById(int id) {
		
		String result;
	try {
		 postRespository.deleteById(id);
		 result = "Post Deleted";
	} catch (Exception e) {
		result = "Product "+id+" not deleted";
	}
		return result;
	}

}
