package com.gokh;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;

public class TodoBusinessImplStubTest {

	@Test
	public void testRetrieveTodosRelatedToSpring_usingAsStub() {
		TodoService todoServiceStub= new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);
		List<String> filteredTodos= todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
		assertEquals(3, filteredTodos.size());
	}
	@Test
	public void testRetrieveTodosRelatedToSpring_usingAsStub2() {
		TodoService todoServiceStub= new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);
		List<String> filteredTodos= todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy1");
		assertEquals(0, filteredTodos.size());
	}

}
