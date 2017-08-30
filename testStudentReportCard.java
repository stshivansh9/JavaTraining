import java.util.Scanner;

public class testStudentReportCard {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int tempId =scan.nextInt();
		scan.nextLine();
		String tempName= scan.nextLine();
		String tempCourse = scan.next();
		int tempMarks[]=new int[3];
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter Marks for "+i+"th subject : ");
			tempMarks[i]=scan.nextInt();
		}
		studentReportCard ram= new studentReportCard(tempId,tempName,tempCourse,tempMarks);
		System.out.println(ram.name);
		System.out.println(ram.rollNo);
		System.out.println(ram.course);
		System.out.println(ram.totalMarks);
	}

}
