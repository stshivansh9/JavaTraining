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
	int marks[]=new int[3];
	int totalMarks;
	float percentage;
	char grade;
	
	public studentReportCard()
	{
		rollNo=1001;
		name="jeet";
		course="java";
		marks[0]=10;
		marks[1]=10;
		marks[2]=10;
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
		for(int i = 0;i<3;i++) {
			this.marks[i]=marks[i];
		}
		
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
		for(int i=0;i<3;i++) {
			totalTemp+=marks[i];
		}
			return totalTemp;
		
	}
	public float calculatePercentage(int totalMarks) {
		int tempPercentage;
		tempPercentage=(totalMarks/300)*100;
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
