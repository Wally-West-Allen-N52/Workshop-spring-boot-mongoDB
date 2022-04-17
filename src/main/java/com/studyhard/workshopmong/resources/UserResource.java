package com.studyhard.workshopmong.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.studyhard.workshopmong.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@RequestMapping(method =  RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		User marcos = new User("1", "Marcos", "marcos@gmail.com");
		User gari = new User("2", "Garibald", "garigari@gmail.com");
		List<User> list = new ArrayList<User>();
		list.addAll(Arrays.asList(marcos, gari));
		return ResponseEntity.ok().body(list);
	}

}
