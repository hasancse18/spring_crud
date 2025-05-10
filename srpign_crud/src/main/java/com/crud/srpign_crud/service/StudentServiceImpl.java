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
                .map(student->{
                    student.setFristName(studentDto.getFristName());
                    student.setLastName(studentDto.getLastName());
                    student.setEmail(studentDto.getEmail());
                    return student;
                }).orElseThrow(() -> new RuntimeException("Resource not found"));

    }

}
