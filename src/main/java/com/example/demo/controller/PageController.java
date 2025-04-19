package com.example.demo.controller;

import com.example.demo.model.ToDo;
import com.example.demo.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PageController {

    @Autowired
    private ToDoService toDoService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("todos", toDoService.getAllToDos());
        model.addAttribute("todo", new ToDo());
        return "index";
    }

    @PostMapping("/add")
    public String addToDo(@ModelAttribute("todo") ToDo todo) {
        toDoService.addToDo(todo);
        return "redirect:/";
    }

    @PostMapping("/update")
    public String updateToDo(@ModelAttribute("todo") ToDo todo) {
        toDoService.updateToDo(todo);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteToDo(@PathVariable Long id) {
        toDoService.deleteToDo(id);
        return "redirect:/";
    }
}
