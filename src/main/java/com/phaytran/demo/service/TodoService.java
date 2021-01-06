package com.phaytran.demo.service;

import com.phaytran.demo.model.Task;
import com.phaytran.demo.model.Todo;
import com.phaytran.demo.model.request.CreateTodoReq;
import com.phaytran.demo.model.response.IsSuccessRes;

import java.util.List;

public interface TodoService {
    IsSuccessRes createTodo(CreateTodoReq createTodoReq);
    IsSuccessRes updateTodo(Todo updateTodoReq);
    IsSuccessRes deleteTodo(Integer id);
    List<Todo> getAllTodo();
}
