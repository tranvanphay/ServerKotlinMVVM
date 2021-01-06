package com.phaytran.demo.controller;


import com.phaytran.demo.model.Todo;
import com.phaytran.demo.model.request.CreateTodoReq;
import com.phaytran.demo.model.response.IsSuccessRes;
import com.phaytran.demo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "todo")
public class TodoController {
    @Autowired
    private TodoService todoService;

    @RequestMapping(value = "create",method = RequestMethod.POST)
    private IsSuccessRes createTodo(@RequestBody CreateTodoReq createTodoReq){
        return this.todoService.createTodo(createTodoReq);
    }

    @RequestMapping(value = "update",method = RequestMethod.PUT)
    private IsSuccessRes updateTodo(@RequestBody Todo updateTodoReq){
        return this.todoService.updateTodo(updateTodoReq);
    }

    @RequestMapping(value = "delete",method = RequestMethod.DELETE)
    private IsSuccessRes deleteTodo(@RequestParam Integer id ){
        return this.todoService.deleteTodo(id);
    }

    @RequestMapping(value = "getAll",method = RequestMethod.GET)
    private List<Todo> getAllTodo(){
        return this.todoService.getAllTodo();
    }

}
