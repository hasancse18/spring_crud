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
    public ResponseEntity<StudentDto>updateStudentById(@PathVariable("id") String id, @RequestBody StudentDto studentDto){
        StudentDto response = studentService.updateStudent(id, studentDto);
        System.out.println(studentDto);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<StudentDto>deleteStudentById(@PathVariable("id") String id){
        StudentDto response = studentService.deleteStudentById(id);
        return ResponseEntity.status(200).body(response);

    }



}
