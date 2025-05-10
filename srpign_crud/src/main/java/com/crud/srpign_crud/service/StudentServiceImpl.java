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
        return student;
    }

    @Override
    public StudentDto getStudentById(String id) {
        return student.stream()
                .filter(s -> s.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public StudentDto updateStudent(String id, StudentDto studentDto) {
        return student.stream()
                .filter(s->s.getId().equals(id))
                .findFirst()
                .map(d->{
                    d.setFristName(studentDto.getFristName());
                    d.setLastName(studentDto.getLastName());
                    d.setEmail(studentDto.getEmail());
                    return d;
                }).orElseThrow(() -> new RuntimeException("Resource not found"));

    }

    @Override
    public StudentDto deleteStudentById(String id) {
        StudentDto deleteStudent = student.stream()
                .filter(s->s.getId().equals(id))
                .findFirst()
                .orElseThrow(()-> new RuntimeException("Id Not Found"));
        return deleteStudent;
    }

}
