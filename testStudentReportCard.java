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
			System.out.println("Enter Marks for "+(i+1)+"th subject : ");
			tempMarks[i]=scan.nextInt();
		}
		studentReportCard ram= new studentReportCard(tempId,tempName,tempCourse,tempMarks);
		ram.print();
	}

}
