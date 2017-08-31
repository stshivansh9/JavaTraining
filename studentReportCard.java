/**
 * 
 * @author BluRobes
 *	@since
 * @version 1.0
 */
public class studentReportCard {
	int rollNo;
	String name;
	String course;
	int totalMarks;
	float percentage;
	char grade;
	int noOfSubjects;
	int[] marks=new int[100];
	
	public studentReportCard()
	{
		rollNo=0;
		name="Enter Name Here";
		course="Enter Course Here";
		this.noOfSubjects=3;
		marks[0]=0;
		marks[1]=0;
		marks[2]=0;
		totalMarks=calculateTotalMarks(marks);
		percentage=calculatePercentage(totalMarks);
		grade=calculateGrade(percentage);
		
	}
	
	public studentReportCard(int rollNo,String name,String course) {
		this();
		this.rollNo=rollNo;
		this.name=name;
		this.course=course;
		
	}
	
	public studentReportCard(int rollNo,String name,String course,int[] marks) {
		this(rollNo,name,course);
		this.rollNo=rollNo;
		this.name=name;
		this.course=course;
		this.marks[0]=marks[0];
		this.marks[1]=marks[1];
		this.marks[2]=marks[2];
		totalMarks=calculateTotalMarks(marks);
		percentage=calculatePercentage(totalMarks);
		grade=calculateGrade(percentage);
	}
	
	public studentReportCard(int rollNo,String name,String course,int[] marks,int noOfSubjects) {
		this(rollNo,name,course,marks);
		this.rollNo=rollNo;		
		this.name=name;
		this.course=course;
		this.noOfSubjects=noOfSubjects;
		for(int i=0;i<noOfSubjects;i++) {
			this.marks[i]=marks[i];
		}

		totalMarks=calculateTotalMarks(marks);
		percentage=calculatePercentage(totalMarks);
		grade=calculateGrade(percentage);
		
	}
	
	public void print() {
		System.out.println("Roll No. "+ rollNo);
		System.out.println("Name "+name);
		System.out.println("Course : "+course);
		for(int i=0;i<3;i++) {
			System.out.println("Marks in subject "+i+" are : "+marks[i]);		
		}
		System.out.println("Total Marks : "+totalMarks);
		System.out.println("Percentage : "+percentage);
		System.out.println("Grade : "+grade);
		
	}
	public int calculateTotalMarks(int[] marks) {
		int totalTemp=0;
		for(int i=0;i<noOfSubjects;i++) {
			totalTemp+=marks[i];
		}
			return totalTemp;
		
	}
	public float calculatePercentage(int totalMarks) {
		int tempPercentage;
		tempPercentage=totalMarks/noOfSubjects;
		return tempPercentage;
	}
	public char calculateGrade(float percentage)
	{	char tempGrade='E';
		if(percentage>80) {
			tempGrade='A';
			
		}
		else if(percentage>60) {
			tempGrade='B';
		}
		else if(percentage>40) {
			tempGrade='C';
	
		}
		else if(percentage>20) {
			tempGrade='D';
		}
		else {}
			
		
		return tempGrade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	

}
