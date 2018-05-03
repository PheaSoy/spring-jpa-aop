package org.soyphea.springaop.repository;

import java.util.List;

import org.soyphea.springaop.doomain.Student;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository extends MyBaseRepository<Student, Long>{
	
		List<Student> findByGrade(String grade);
		
		@Query("select stu from Student stu where stu.score >= ?1")
		List<Student> findPassedStudent(double score);
		@Query(value = "SELECT * FROM STUDENT", nativeQuery = true)
		List<Student> findAllStudentCustomQuery();
		boolean existsById(Long id);	
		
		
		

}
