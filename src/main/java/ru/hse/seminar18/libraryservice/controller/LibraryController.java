package ru.hse.seminar18.libraryservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.hse.seminar18.libraryservice.feign.StudentClient;

@RestController
@RequestMapping("/library")
public class LibraryController {
    private final StudentClient studentClient;

    public LibraryController(StudentClient studentClient) {
        this.studentClient = studentClient;
    }

    @GetMapping("/readers/{id}")
    public String getReader(@PathVariable String id) {
        return "Library reader: " + studentClient.listStudents(id);
    }
}
