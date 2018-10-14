
public class App {

	public static void main(String[] args) {
		
		Student[] students = new Student[3];
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student(i+20, i+90);
		}
		
		System.out.println("Average age: " + Student.getAvgAge());
		System.out.println("Avergae grade: " + Student.getAvgGrade());

	}

}
