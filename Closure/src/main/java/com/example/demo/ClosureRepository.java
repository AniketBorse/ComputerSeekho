package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Closure;

@Repository
public interface ClosureRepository extends JpaRepository<Closure, Integer> 
{
	
}