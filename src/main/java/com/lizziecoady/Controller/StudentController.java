package com.lizziecoady.Controller;

import com.lizziecoady.Entity.Student;
import com.lizziecoady.Service.StudentService;

import java.util.Collection;

public class StudentController {

//    need again a way to access StudentService so we invoke an instance of it
    private StudentService studentService;

    public Collection<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
}
