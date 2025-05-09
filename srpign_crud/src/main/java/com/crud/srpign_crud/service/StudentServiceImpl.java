package com.crud.srpign_crud.service;

import com.crud.srpign_crud.dto.StudentDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentServiceImpl implements StudentService{
    private ArrayList<StudentDto> student = new ArrayList<>();
    @Override
    public StudentDto addStudent(StudentDto studentDto) {
        student.add(studentDto);
        return studentDto;
    }

    @Override
    public ArrayList<StudentDto> getStudent() {
        return null;
    }
}
