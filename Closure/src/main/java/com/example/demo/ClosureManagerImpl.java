package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.entities.Closure;

@Service
public class ClosureManagerImpl implements ClosureManager {
	
	@Autowired
	ClosureRepository repository;

	
	@Override
	public void addClosure(Closure p) {
		// TODO Auto-generated method stub
		repository.save(p);
	}

	@Override
	public List<Closure> getClosure() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(null);
	}

//	@Override
//	public void update(Closure closure, int id) {
//		// TODO Auto-generated method stub
//		
//	}
	
}
