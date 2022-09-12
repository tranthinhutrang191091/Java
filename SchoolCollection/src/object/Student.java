package object;

import java.util.HashSet;
import java.util.Set;

public class Student implements Comparable<Student>{
	private int idStudent;
	private String fullName;
	private int age;
	private float score;
	public Student() {
	}
	public Student(int idStudent, String fullName, int age,float score) {
		this.idStudent = idStudent;
		this.fullName = fullName;
		this.age = age;
		this.score=score;
	}
	public int getIdStudent() {
		return idStudent;
	}
	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "|" + idStudent + "\t|" + fullName + "\t|" + age + "\t|"+ score + "\t";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());
		result = prime * result + idStudent;
		result = prime * result + Float.floatToIntBits(score);
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
		if (age != other.age)
			return false;
		if (fullName == null) {
			if (other.fullName != null)
				return false;
		} else if (!fullName.equals(other.fullName))
			return false;
		if (idStudent != other.idStudent)
			return false;
		if (Float.floatToIntBits(score) != Float.floatToIntBits(other.score))
			return false;
		return true;
	}
	public String getName() {
		String s=this.fullName.trim();
		if(s.indexOf(" ")>=0) {
			int vt = s.lastIndexOf(" ");
			return s.substring(vt+1);
		}else {
			return s;
		}
	}
	@Override
	public int compareTo(Student o) {
		String thisId= this.getFullName();
		String oId= o.getFullName();
		return thisId.compareTo(oId);
	}
	
	
	
}
