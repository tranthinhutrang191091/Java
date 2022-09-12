package object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListStudent {
	private ArrayList<Student> listStudent;

	public ListStudent() {
		this.listStudent= new ArrayList<Student>();
	}

	public ListStudent(ArrayList<Student> listStudent) {
		this.listStudent = listStudent;
	}
	public void addStudent(Student student) {
		this.listStudent.add(student);
	}
	public void loadListStudent() {
		for(Student student : listStudent) {
			System.out.println(student);
		}
	}
	public boolean checkListStudentNull() {
		return this.listStudent.isEmpty();
	}
	public int countStudent() {
		return this.listStudent.size();
	}
	public void removeAllStudent() {
		this.listStudent.removeAll(listStudent);
	}
	public boolean checkStudent(Student student) {
		return this.listStudent.contains(student);
	}
	public boolean removeStudent(Student student) {
		return this.listStudent.remove(student);
	}
	public void searchStudent(String name) {
		int cout=0;
		for(Student student: this.listStudent) {
			if(student.getFullName().indexOf(name)>=0) {
				System.out.println(student);
				cout++;
			}
		}
		if(cout==0) {
			System.out.println("Haven't student name: "+ name);
		}	
	}
	public void sortStudentScoreAverage() {
		Collections.sort(this.listStudent, new Comparator<Student>() {

			@Override
			public int compare(Student student1, Student student2) {
				if(student1.getScoreAverage()<student2.getScoreAverage()) {
					return 1;
				}else if(student1.getScoreAverage()>student2.getScoreAverage()) {
					return -1;
				}else {
				return 0;
				}
				
			}
		});
	}
}
