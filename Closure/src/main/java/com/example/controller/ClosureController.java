package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ClosureManager;
import com.example.entities.Closure;


@RestController
public class ClosureController {

	@Autowired
	ClosureManager manager;
	
	@GetMapping(value = "api/closure")
	public List<Closure> showLocation(){
		return manager.getClosure();
	}
	
	@PostMapping(value = "api/closure")
	public void addloc(@RequestBody Closure clo) {
		manager.addClosure(clo);
	}
	
	@DeleteMapping(value = "api/closure/{id}")
	public void removeloc(@PathVariable int id) {
		manager.delete(id);
	}
}
