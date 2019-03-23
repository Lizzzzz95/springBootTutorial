package com.lizziecoady.Dao;

import com.lizziecoady.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.*;

// DAO stands for Data Access Object
// This tells spring that this is a database repository
@Repository
public class StudentDao {

//    using fake data for now, will integrate with database later

    private static Map<Integer, Student> students;
//    Map uses key, value pairs. Integer will be student id and Student will be the Student object

    static {

        students = new HashMap<Integer, Student>() {

            {
                put(1, new Student(1, "Said", "Computer Science"));
                put(2, new Student(2, "Anna", "Maths"));
                put(3, new Student(3, "Dan", "English"));
            }

        };
    }

//     A Collection represents a single unit of objects, i.e., a group.
    public Collection<Student> getAllStudents(){
//        this gets the collection from the HashMap and gives it to us
        return this.students.values();
    }

//    creating method to return single student
    public Student getStudentById(int id){
//        .get is a built in Array method, passes index as a parameter
        return this.students.get(id);
    }

//    if we actually want to remove students by id, we need to use a http client (use postman)
    public void removeStudentById(int id) {
        this.students.remove(id);
    }

    public void updateStudent(Student student){
        Student studentExample = students.get(student.getId());
        studentExample.setCourse(student.getCourse());
        studentExample.setName(student.getName());
//        this puts it back into the database
        students.put(student.getId(), student);
    }

    public void insertStudent(Student student) {
        this.students.put(student.getId(), student);
    }
}
