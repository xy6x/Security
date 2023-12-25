package org.example.security.Controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.security.DTO.TodoDTO;
import org.example.security.Model.User;
import org.example.security.Service.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/todo")
@RequiredArgsConstructor
public class TodoController {
private  final TodoService todoService;
    @PostMapping("/add")
    private ResponseEntity register(@RequestBody @Valid TodoDTO todoDTO){
        todoService.addTodo(todoDTO);
        return ResponseEntity.status(200).body("add Todo");
    }
}
