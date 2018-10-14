
public class Student {
	private int grade, age;
	private static int sumAges, sumGrades, sumStudents;
	
	public Student(int age, int grade) {
		setAge(age);
		setGrade(grade);
		sumAges += age;
		sumGrades += grade;
		sumStudents++;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public static double getAvgGrade() {
		return (double)sumGrades/(double)sumStudents;
	}
	
	public static double getAvgAge() {
		return (double)sumAges/(double)sumStudents;
	}
}
