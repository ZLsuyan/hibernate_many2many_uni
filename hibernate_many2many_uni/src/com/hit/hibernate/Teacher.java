package com.hit.hibernate;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Teacher {
	private int id;
	private String name;
	private Set<Student> students = new HashSet<Student>();
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	@ManyToMany
	@JoinTable(name="t_s",
			joinColumns={@JoinColumn(name="teacher_id")},
			inverseJoinColumns={@JoinColumn(name="student_id")}
			)
	public Set<Student> getStudents() {
		return students;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
}
