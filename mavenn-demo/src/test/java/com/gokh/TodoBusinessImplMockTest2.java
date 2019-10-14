package com.gokh;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class TodoBusinessImplMockTest2 {

	@Test
	public void testRetrieveTodosRelatedToSpring_usingAsMock() {
		
		TodoService todoServiceMock= mock(TodoService.class);
		List<String> todos=Arrays.asList("Learn Spring MVC","Learn Spring", "Learn to Dance");
		when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
		List<String> filteredTodos= todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
		assertEquals(0, filteredTodos.size());
	}
	@Test
	public void testRetrieveTodosRelatedToSpring_withEmptyList() {
		
		TodoService todoServiceMock= mock(TodoService.class);
		List<String> todos=Arrays.asList();
		when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
		List<String> filteredTodos= todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
		assertEquals(0, filteredTodos.size());
	}


}
