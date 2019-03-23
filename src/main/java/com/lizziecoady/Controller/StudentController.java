package com.lizziecoady.Controller;

import com.lizziecoady.Entity.Student;
import com.lizziecoady.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

// The @RestController annotation in Spring MVC is nothing but a combination
// of the @Controller and the @ResponseBody annotation.
// the fundamental difference between a web application and a REST API is that the response
// from a web application is a generally view of HTML + CSS + JavaScript while REST API
// just return data in form of JSON or XML. This difference is also obvious in the
// @Controller and the @RestController annotation. The job of the @Controller is to
// create a Map of model object and find a view but the @RestController simply returns
// the object and object data is directly written into HTTP response as JSON or XML.
// https://www.javacodegeeks.com/2017/08/difference-restcontroller-controller-annotation-spring-mvc-rest.html

// With http requests we need a url, end point etc so RequestMapping defines the pattern
@RestController
@RequestMapping("/students")
public class StudentController {

//    need again a way to access StudentService so we invoke an instance of it
//    Autowired is a dependancy injection. This makes it so we don't have to put new StudentService();
//    after private StudentService studentService
//    It basically instanciates it for us
    @Autowired
    private StudentService studentService;

//    This will be a get method, could pass value = "/" as a parameter, but we don't need to as
//    when "/students" is gone to, this method will be triggered
    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
}
