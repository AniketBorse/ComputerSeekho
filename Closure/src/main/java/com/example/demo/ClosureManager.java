package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.entities.Closure;

@Component
public interface ClosureManager {
	void addClosure(Closure p);
	List<Closure> getClosure();
	void delete(int id);
	//void update(Closure closure,int id);
}
