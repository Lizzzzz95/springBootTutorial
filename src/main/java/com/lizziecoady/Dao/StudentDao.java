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
                put(3, new Student(1, "Dan", "English"));
            }

        };
    }

//     A Collection represents a single unit of objects, i.e., a group.
    public Collection<Student> getAllStudents(){
//        this gets the collection from the HashMap and gives it to us
        return this.students.values();
    }


}
