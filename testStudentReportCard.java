import java.util.Scanner;

public class testStudentReportCard {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Roll No. : ");
		int tempId =scan.nextInt();
		System.out.println("Enter Name : ");
		scan.nextLine();
		String tempName= scan.nextLine();
		System.out.println("Enter Course Name : ");
		String tempCourse = scan.next();
		System.out.println("Enter the number of Subjects : ");
		int tempNoOfSubjects=scan.nextInt();
		int tempMarks[]=new int[tempNoOfSubjects];
		for(int i=0;i<tempNoOfSubjects;i++)
		{
			System.out.println("Enter Marks for "+(i+1)+"th subject : ");
			tempMarks[i]=scan.nextInt();
		}
		studentReportCard ram= new studentReportCard(tempId,tempName,tempCourse,tempMarks,tempNoOfSubjects);
		ram.print();
	}
	

}
