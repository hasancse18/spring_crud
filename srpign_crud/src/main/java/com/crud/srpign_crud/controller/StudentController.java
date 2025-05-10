package com.crud.srpign_crud.controller;

import com.crud.srpign_crud.dto.StudentDto;
import com.crud.srpign_crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/get")
    ResponseEntity<ArrayList<StudentDto>> getStudent(){
        ArrayList<StudentDto> response = studentService.getStudent();
        return  ResponseEntity.ok(response);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<StudentDto> getStudentById(@PathVariable("id") String id) {
        StudentDto student = studentService.getStudentById(id);
        return ResponseEntity.ok(student);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<StudentDto>updateStudentById(@PathVariable("id") String id, StudentDto studentDto){
        StudentDto response = studentService.updateStudent(id, studentDto);
        return ResponseEntity.ok(response);
    }



}
