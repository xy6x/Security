package org.example.security.Service;

import lombok.RequiredArgsConstructor;
import org.example.security.DTO.TodoDTO;
import org.example.security.Model.Todo;
import org.example.security.Model.User;
import org.example.security.Repository.AtuhRepository;
import org.example.security.Repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoService {
    private final TodoRepository todoRepository;
    private final AtuhRepository atuhRepository;
    public List<Todo>  getAllTodo(){
       return todoRepository.findAll();
    }
    public void addTodo(TodoDTO todoDTO){
        User user =atuhRepository.findUserById(todoDTO.getUser_id());
        Todo todo =new Todo(null,todoDTO.getTitle(),user);
        todoRepository.save(todo);
    }

}
