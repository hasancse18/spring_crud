package com.crud.srpign_crud.service;

import com.crud.srpign_crud.dto.StudentDto;

import java.util.ArrayList;

public interface StudentService {
    StudentDto addStudent(StudentDto studentDto);
    ArrayList<StudentDto>getStudent();
    StudentDto getStudentById(String id);
    StudentDto updateStudent(String id, StudentDto studentDto);
    StudentDto deleteStudentById(String id);
}
