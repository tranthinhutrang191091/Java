package com.daicent;

import java.io.Serializable;

public class Student implements Comparable<Student>, Serializable{
	private String codeStudent;
	private String fullName;
	private int yearBirth;
	private float scoreAverage;

	public Student(String codeStudent, String fullName, int yearBirth, float scoreAverage) {

		this.codeStudent = codeStudent;
		this.fullName = fullName;
		this.yearBirth = yearBirth;
		this.scoreAverage = scoreAverage;
	}

	@Override
	public String toString() {
		return "Student [codeStudent=" + codeStudent + ", fullName=" + fullName + ", yearBirth=" + yearBirth
				+ ", scoreAverage=" + scoreAverage + "]";
	}

	public String getCodeStudent() {
		return codeStudent;
	}

	public void setCodeStudent(String codeStudent) {
		this.codeStudent = codeStudent;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getYearBirth() {
		return yearBirth;
	}

	public void setYearBirth(int yearBirth) {
		this.yearBirth = yearBirth;
	}

	public float getScoreAverage() {
		return scoreAverage;
	}

	public void setScoreAverage(float scoreAverage) {
		this.scoreAverage = scoreAverage;
	}

	@Override
	public int compareTo(Student o) {
		return this.codeStudent.compareTo(o.codeStudent);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codeStudent == null) ? 0 : codeStudent.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (codeStudent == null) {
			if (other.codeStudent != null)
				return false;
		} else if (!codeStudent.equals(other.codeStudent))
			return false;
		return true;
	}

}
