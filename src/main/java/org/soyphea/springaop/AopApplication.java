package org.soyphea.springaop;

import org.soyphea.springaop.doomain.Student;
import org.soyphea.springaop.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AopApplication implements CommandLineRunner{
	
	@Autowired
	StudentRepository studentRepository;
	
	public static void main(String args[]) {
		SpringApplication.run(AopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student stu1 = new Student(100L, 90.0, "Sopheaktra","12");
		Student stu2 = new Student(200L, 50.0, "Dara","11");
		Student stu3 = new Student(300L, 40.0, "John","10");
		Student stu4 = new Student(400L, 10.0, "Sarin","12");
		
		studentRepository.save(stu1);
		studentRepository.save(stu2);
		studentRepository.save(stu3);
		studentRepository.save(stu4);
	/*	
		studentRepository.findById(200L).ifPresent(System.out::println);
		
		studentRepository.findByGrade("10").forEach(stu->{
		 System.out.println("Student grade 10:"+stu);
		});
		
		studentRepository.findPassedStudent(50.0).forEach(stu->{
		 System.out.println("Student passed:"+stu);
		});
		*/
		studentRepository.findAllStudentCustomQuery().forEach(stu->{
		System.out.println("Stuent:"+stu);
		});
	}
	

}
