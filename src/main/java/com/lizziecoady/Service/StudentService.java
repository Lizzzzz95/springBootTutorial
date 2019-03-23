package com.lizziecoady.Service;

import com.lizziecoady.Dao.StudentDao;
import com.lizziecoady.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

// This tells spring this is the service
@Service
public class StudentService {

//    we need a way to access the Dao so we need an instance of the StudentDao
//    Look at StudentController for info on Autowired
    @Autowired
    private StudentDao studentDao;

//    copied from StudentDao
    public Collection<Student> getAllStudents(){
//        we have the method getAllStudents made in the Dao so we are invoking it here
//        this will in future be from a database
        return this.studentDao.getAllStudents();
    }

    public Student getStudentById(int id){
//        taken from StudentDao
        return this.studentDao.getStudentById(id);
    }

    public void removeStudentById(int id) {
        this.studentDao.removeStudentById(id);
    }

    public void updateStudent(Student student){
        this.studentDao.updateStudent(student);
    }

    public void insertStudent(Student student) {
        this.studentDao.insertStudent(student);
    }
}
