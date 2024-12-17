package com.example.studentdetails.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.studentdetails.demo.model.Student;

@Service 
public class StudentService {

         List<Student> students=new ArrayList<>(Arrays.asList(
                    new Student(1,"sharath","Ai"),
                    new Student(2,"Saif","biotech")));
        
        
            
            
            public List<Student> getStudents() {
                return students;
            }
        
        
        
        
            public  Student getStdByRno(int rno) {
                int index=0;
                for(int i=0;i<students.size();i++)
                {
                    if(students.get(i).getRno()==rno)
                    {
                        
                        index=i;
                    }

                }
                return students.get(index);

    }




            public String addStudent(Student stu) {
                // TODO Auto-generated method stub
                //throw new UnsupportedOperationException("Unimplemented method 'addStudent'");
                students.add(stu);
                return "Sucess";
            }




            public void updatestud(Student stu) {
                int index=0;
                for(int i=0;i<students.size();i++)
                {
                    if(students.get(i).getRno()==stu.getRno())
                    {
                         index=i;
                    }
                }
                students.set(index,stu);
            }




            public void deletestudent(Student stu) {
                int index=0;
                for(int i=0;i<students.size();i++)
                {
                    if(students.get(i).getRno()==stu.getRno())
                    {
                        index=i;
                    }
                }
                students.remove(index);
            }
    
}
