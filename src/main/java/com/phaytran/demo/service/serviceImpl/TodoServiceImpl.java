package com.phaytran.demo.service.serviceImpl;


import com.phaytran.demo.model.Task;
import com.phaytran.demo.model.Todo;
import com.phaytran.demo.model.request.CreateTodoReq;
import com.phaytran.demo.model.response.IsSuccessRes;
import com.phaytran.demo.repository.TodoRepository;
import com.phaytran.demo.service.TodoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {
    @Autowired
    TodoRepository todoRepository;

    @Override
    public IsSuccessRes createTodo(CreateTodoReq createTodoReq) {
        ModelMapper mapper = new ModelMapper();
        Todo todo = this.todoRepository.save(mapper.map(createTodoReq, Todo.class));
        return response(todo);
    }

    @Override
    public IsSuccessRes updateTodo(Todo updateTodoReq) {
        ModelMapper mapper = new ModelMapper();
        Todo todo = this.todoRepository.save(mapper.map(updateTodoReq,Todo.class));
        return response(todo);
    }

    @Override
    public IsSuccessRes deleteTodo(Integer id) {
        this.todoRepository.deleteById(id);
        return new IsSuccessRes(true);
    }

    @Override
    public List<Todo> getAllTodo() {
        return todoRepository.findAll();
    }


    private IsSuccessRes response(Todo result){
        if(result.getId()!=null){
            return new IsSuccessRes(true);
        }else {
            return new IsSuccessRes(false);
        }
    }
}
