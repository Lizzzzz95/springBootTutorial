package com.lizziecoady.Controller;

import com.lizziecoady.Entity.Student;
import com.lizziecoady.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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

//    This is our mapping to get a student by Id. This why we are specifically passing a value
//    The url will be /students/1 for example as we have define /students as our 'root'
//    @PathVariable makes it so we can actually gather the id from the url, the "id" parameter
//    passed in is what's taken from the url
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Student getStudentById(@PathVariable("id") int id){
        return studentService.getStudentById(id);
    }

//    'method' to delete student by id
//    returning void as we are deleting
//    need to use http client to do this
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void removeStudentById(@PathVariable("id") int id){
        studentService.removeStudentById(id);
    }

//    'method' to update a student
//    again we need to use a http client to perform this
//    on postman, select put, click the tab body (default is on params), click raw
//    the click text dropdown and select JSON
//    @RequestBody maps the HttpRequest body to a transfer or domain object,
//    enabling automatic deserialization of the inbound HttpRequest body onto a Java object.
//    the consumes part tells spring that the Student will accept a JSON (what we do on postman)
    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateStudent(@RequestBody Student student){
        studentService.updateStudent(student);
    }

//    'method' to add a student
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertStudent(@RequestBody Student student){
        studentService.insertStudent(student);
    }

}
