package com.tpe.controller;

import com.tpe.domain.Student;
import com.tpe.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students") //http://localhost:8080/
public class StudentController {

    @Autowired
    private StudentService studentService;

    //!!!butun ogrencileri getirelim
    @GetMapping // http://localhost:8080/students + get

    //response entity statuscode u gonderiyor hem entity i gonderiyor
    public ResponseEntity<List<Student>> getAll() {

        List<Student> students = studentService.getAll();

        return ResponseEntity.ok(students); //List<Student> + HTTP.Status code = 200

    } //Students + StatusCode
}
