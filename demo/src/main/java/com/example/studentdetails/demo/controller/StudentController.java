package com.example.studentdetails.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentdetails.demo.model.Student;
import com.example.studentdetails.demo.service.StudentService;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("students")
    public List<Student> getStudents()
    {
        return studentService.getStudents();
    }

    @GetMapping("student/{rno}")//mapping to rollno (you can enter any rollno)
    public Student getrno (@PathVariable("rno")int rollno)
    {
        return  studentService.getStdByRno(rollno);
    }

    @PostMapping("student")
    public String h(@RequestBody Student stu)
    {
         studentService.addStudent(stu);
         return "Sucess";
    }
  
   @PutMapping("student")
   public String k(@RequestBody Student stu)
   {
      studentService.updatestud(stu);
      return "sucess";
   }

   @DeleteMapping("student")
   public String s(@RequestBody Student stu)
   {
    studentService.deletestudent(stu);
    return "sucess";
   }

}
