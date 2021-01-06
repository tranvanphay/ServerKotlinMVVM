package com.phaytran.demo.repository;

import com.phaytran.demo.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TaskRepository extends JpaRepository<Task,Integer> {
    Optional<Task> findTaskById(Integer id);
}
