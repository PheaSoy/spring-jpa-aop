package org.soyphea.springaop.doomain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	

	public Student() {
		
	}
	public Student(Long id, double score, String name, String grade) {
		super();
		this.id = id;
		this.score = score;
		this.name = name;
		this.grade = grade;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", score=" + score + ", name=" + name + ", grade=" + grade + "]";
	}
	
	@Id
	Long id;
	double score;
	String name;
	String grade;
	
}
