package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.entity.Student;

public interface StudentDAO {

    Student findById(Integer id);

    void update(Student theStudent);

}
