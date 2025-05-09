package com.crud.srpign_crud.service;

import com.crud.srpign_crud.dto.StudentDto;

import java.util.ArrayList;

public interface StudentService {
    StudentDto addStudent(StudentDto studentDto);
    ArrayList<StudentDto>getStudent();
}
