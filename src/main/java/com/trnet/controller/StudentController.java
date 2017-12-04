package com.trnet.controller;


import com.trnet.model.Student;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "studentView")
public class StudentController {

    List<Student> studentList = new ArrayList<Student>();

    @PostConstruct
    public void init() {
        studentList.add(new Student("Sercan", "Yektaş", 3.30));
        studentList.add(new Student("Ali", "Yılmaz", 3.60));
        studentList.add(new Student("Mehmet", "Aslan", 2.20));
        studentList.add(new Student("Hasan", "Davaroğlu", 3.00));
        studentList.add(new Student("Davar", "Davaroğlu", 4.00));
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }


}
