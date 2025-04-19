package com.example.demo.service;

import com.example.demo.model.ToDo;
import com.example.demo.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {

    @Autowired
    private ToDoRepository toDoRepository;

    public List<ToDo> getAllToDos() {
        return toDoRepository.findAll();
    }

    public void addToDo(ToDo todo) {
        toDoRepository.save(todo);
    }

    public void updateToDo(ToDo todo) {
        toDoRepository.save(todo);
    }

    public void deleteToDo(Long id) {
        toDoRepository.deleteById(id);
    }
}
