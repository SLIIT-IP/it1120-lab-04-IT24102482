import java.util.Scanner;
public class IT24102482Lab4Q2
{
	public static void main(String[]args)
	{
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter exam marks: ");
	double exam_marks = sc.nextDouble();
	if(exam_marks<0 || exam_marks>100)
	{
	System.out.println("Invalid input for exam marks. Terminating the program.");
	}
	
	System.out.print("Enter lab submission marks: ");
	double lab_marks = sc.nextDouble();
	if(lab_marks<0 || lab_marks>100)
	{
	System.out.println("Invalid input for lab submission marks. Terminating the program.");
	}
	
	System.out.print("Enter the percentage given for the exam: ");
	double exam_percentage = sc.nextDouble();
	
	System.out.print("Enter the percentage given for the lab submission: ");
	double lab_percentage = sc.nextDouble();
	
	if(exam_percentage + lab_percentage != 100)
	{
	System.out.println("The entered percentage must add up to 100. Terminating the program");
	}

	double final_exam_marks = (exam_marks/100) * exam_percentage;
	double final_lab_marks = (lab_marks/100) * lab_percentage;
	double final_mark = final_exam_marks + final_lab_marks;

	System.out.println("Final mark is: " + final_mark);
}
}