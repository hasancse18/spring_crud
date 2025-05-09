package com.crud.srpign_crud.controller;

import com.crud.srpign_crud.dto.StudentDto;
import com.crud.srpign_crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/crud")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("/add")
    ResponseEntity<?> addStudent(@RequestBody StudentDto student){
        StudentDto response = studentService.addStudent(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

}
