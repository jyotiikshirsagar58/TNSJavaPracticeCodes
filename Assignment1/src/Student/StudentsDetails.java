package Student;

import java.util.Scanner;

public class StudentsDetails {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		int Rollno = sc.nextInt();
		String  grade = sc.next();
		double percentage =sc.nextDouble();
		
		 System.out.println(name);
	     System.out.println(Rollno);
	     System.out.println(grade);
	     System.out.println(percentage + "%");
	     
	     sc.close();
	}

}
