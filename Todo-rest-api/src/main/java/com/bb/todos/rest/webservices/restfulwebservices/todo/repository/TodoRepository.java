package com.bb.todos.rest.webservices.restfulwebservices.todo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bb.todos.rest.webservices.restfulwebservices.todo.Todo;

public interface TodoRepository extends JpaRepository<Todo,Integer>{

List<Todo> findByUsername(String username);	
	
}
