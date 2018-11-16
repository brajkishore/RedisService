package com.yroots.redisservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yroots.redisservice.dao.RedisRepository;
import com.yroots.redisservice.models.User;

@RestController
public class MainController {

	
	@Autowired
	private RedisRepository repository;
	
	@PostMapping("/cache")
	public ResponseEntity<?> save(@RequestBody User user){				
		boolean status=repository.save(user);		
		return ResponseEntity.ok(status);
	}
	
	@GetMapping("/cache/{key}")
	public ResponseEntity<?> get(@PathVariable(name="key",required=true) String key){
		Object obj=repository.get(key);
		return ResponseEntity.ok(obj);
	}	
}
