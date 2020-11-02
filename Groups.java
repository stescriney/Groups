import java.util.Scanner;

public class Groups{
	public static void main (String args[]){

		int groupSize = 7;
		int students;
		int totalGroups;
		int incompleteGroups;

		Scanner in = new Scanner(System.in);

		System.out.println("How many Students are in the class?");
		students = in.nextInt();

		totalGroups = (students / groupSize);
		System.out.println("The number of complete groups is..");
		System.out.println(totalGroups);

		incompleteGroups = (students % groupSize);
		System.out.println("The remaining number of students in the incomplete group is..");
		System.out.println("incompleteGroups");

	}
}

