package com.lizziecoady.Entity;

public class Student {

//    every student will have an id, name and course
    private int id;
    private String name;
    private String course;

//    use ctrl + enter to create constructor automatically (select all variables defined above)

    public Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

//    also need a 'default constructor' with nothing in
    public Student(){}

//    use ctrl + enter again to make a getter and setter

//    Private variables can only be accessed within the same class (an outside class have no access to it).
//    However, it is possible to access them if we provide public getter and setter methods.
//
//    The get method returns the variable value, and the set method sets the value.
//
//    Syntax for both is that they start with either get or set,
//    followed by the name of the variable, with the first letter in upper case:

//    The get method returns the value of the variable name.
//
//    The set method takes a parameter (newName) and assigns it to the name variable.
//    The this keyword is used to refer to the current object.

//    read more: https://www.w3schools.com/java/java_encapsulation.asp

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
