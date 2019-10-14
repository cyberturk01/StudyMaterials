package com.gokh;

import java.util.ArrayList;
import java.util.List;

public class TodoBusinessImpl {
	private TodoService todoService;
	public TodoBusinessImpl(TodoService todoService) {
		this.todoService=todoService;
	}
	public List<String> retrieveTodosRelatedToSpring(String user){
		List<String> filteredTodos= new ArrayList<String>();
		
		List<String> todos=todoService.retrieveTodos(user);
		for (String todo : todos) {
			if(todos.contains("Spring")) {
				filteredTodos.add(todo);
				System.out.println(1);
			}			
		}
		return filteredTodos;
	}
}
