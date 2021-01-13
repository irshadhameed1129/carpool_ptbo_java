package com.coresoft.springboot.CarPool.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.coresoft.springboot.CarPool.domain.Post;
import com.coresoft.springboot.CarPool.domain.ViewUserPost;
import com.coresoft.springboot.CarPool.handler.JsonPostHandler;
import com.coresoft.springboot.CarPool.services.PostService;
import com.coresoft.springboot.CarPool.services.ViewUserPostService;

@RestController
public class PostController {
	
	@Autowired
	private PostService postService;
	@Autowired
	private ViewUserPostService viewUserPostService;
	
//	@CrossOrigin(origins= "http://localhost:3000")
//	@GetMapping( "/userlist")
//	public List<User> fetchProductList () {
//		List<User> products= new ArrayList<User>();
//		//fetch data from database;
//		products = userProfileServices.fetchUserList();
//		return products;
//	}
//	

	@CrossOrigin(origins= "http://localhost:3000")
	@GetMapping( "/getAllPost")
	@ResponseBody
	public List<Post> getAllPost () {
		
		List<Post> posts= new ArrayList<Post>();
//		//fetch data from database;
		posts = postService.fetchAllPost();
		return posts;
	
	}
	
//	
//	we can also use @DeleteMapping instead of @GetMapping
	@CrossOrigin(origins= "http://localhost:3000")
//	fetch Post from data base by user id
	@GetMapping( "/getPost/{id}")
	public List<Post> getPostByUSerID (@PathVariable int id) {
		System.out.println(id);
		List<Post> posts= new ArrayList<Post>();
		posts =  postService.getPostByUSerID(id);
		System.out.println(posts);
		return posts;
	}

	
	@CrossOrigin(origins= "http://localhost:3000")
	@PostMapping( "/newPost")
	@ResponseBody
	public Post saveUser (@RequestBody Post postFromReact) {
		try {
			Post post = null;
//			if(userProfileServices.findByEmail(user.getEmail()) == null) {
			
			 if (postFromReact != null ) {
				 System.out.println("Saved User" +post);
				 post = postService.saveNewUser(postFromReact);
				 return post;
			 }
			 else return post;
//			}
//			else return null;
		} catch (Exception e) {
			// TODO: handle exception
		}
		
			return null;
	}
	
	
	@CrossOrigin(origins= "http://localhost:3000")
	@PostMapping( "/searchPost")
	@ResponseBody
	public  List<ViewUserPost> searchPost (@RequestBody JsonPostHandler handler) {
		System.out.println(handler);
		try {
			 List<ViewUserPost> posts= new ArrayList<ViewUserPost>();
			 if (handler != null ) {
				
				 posts = viewUserPostService.searchByfromEnd(handler.getStartPlace(), handler.getEndPlace());
				 System.out.println(posts);
				 return posts;
			 }
			 else return null;
		} catch (Exception e) {
			// TODO: handle exception
		}
		
			return null;
	}
	
	
	
}
