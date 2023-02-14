package ch07;

public class Student {
	
	// 학번과 이름을 정의
	// toString, equals메서드를 재정의
	
	private int id;
	private String name;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "** 이름: " + name + ", 학번: " + id + " **";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student targetStudent = (Student)obj;
			if(this.name == targetStudent.name && this.id != targetStudent.id) {
				System.out.println("동명이인입니다.");
				return true;
			}
		}
		return false;
	}

}
