package com.csit321g2.tejano.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csit321g2.tejano.Entity.StudentEntity;
import com.csit321g2.tejano.Repository.StudentRepository;

 

@Service
public class StudentService {

	@Autowired
	StudentRepository srepo;


	public StudentEntity insertStudent(StudentEntity student) {
		return srepo.save(student);
	}

	public List<StudentEntity> getAllStudents(){
		return srepo.findAll();
	}	

    @SuppressWarnings("finally")
	public StudentEntity updateStudent(int sid, StudentEntity newStudentDetails){
    	StudentEntity student = new StudentEntity();
    		try {
    			student = srepo.findById(sid).get();
    			student.setFname(newStudentDetails.getFname());
    			student.setLname(newStudentDetails.getLname());
    			student.setGender(newStudentDetails.getGender());
    		}catch(NoSuchElementException ex) {
    			throw new NoSuchElementException("Student "+sid+ " does not exist");
    		}finally {
    			return srepo.save(student);
    		}
    }

    public String deleteStudent(int sid) {
    	String msg = "";

    	if(srepo.findById(sid).get()!=null) {
    		srepo.deleteById(sid);
    		msg = "Student " + sid + " is successfully deleted!";
    	}else {msg = "Student " + sid + " does not exist!";}

    	return msg;
    }
}


