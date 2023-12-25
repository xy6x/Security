package org.example.security.Repository;

import org.example.security.Model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo,Integer> {
    Todo findTodoById(Integer id);
}
