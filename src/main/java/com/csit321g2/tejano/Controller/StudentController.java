package com.csit321g2.tejano.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.csit321g2.tejano.Entity.StudentEntity;
import com.csit321g2.tejano.Service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService sserv;

    @GetMapping("/print")
    public String printHello() {
        return "Hi, Im Thesaly Tejano!";
    }

    @PostMapping("/insertStudent")
    public StudentEntity insertStudent(@RequestBody StudentEntity student) {
      return sserv.insertStudent(student);
    }

    @GetMapping("/getAllStudent")
    public List<StudentEntity> getAllStudents(){
    	return sserv.getAllStudents();
    }

    @PutMapping("/update")
    public StudentEntity updateStudent(@RequestParam int sid, @RequestBody StudentEntity newStudentDetails){
    	return sserv.updateStudent(sid, newStudentDetails);
    }
    @DeleteMapping("/delete/{sid}")
    public String deleteStudent(@PathVariable int sid) {
    	return sserv.deleteStudent(sid);
    }
}