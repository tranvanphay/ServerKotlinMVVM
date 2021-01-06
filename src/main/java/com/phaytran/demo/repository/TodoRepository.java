package com.phaytran.demo.repository;

import com.phaytran.demo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TodoRepository extends JpaRepository<Todo,Integer> {
    Optional<Todo> findTodoById(Integer id);
}
