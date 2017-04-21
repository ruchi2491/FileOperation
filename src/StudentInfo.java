import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Scanner;

public class StudentInfo {
	public static int countA=0,countB=0,countC=0,countD=0,countF=0;
	public static void main(String[] args) throws FileNotFoundException {
		
		String arr[];
		int HW1,HW2,HW3,Midterm,Project,Final;
		double final_numerical_grade;
		
		Scanner in=new Scanner(new BufferedReader(new FileReader("Student.txt")));
		while(in.hasNextLine())
		{
			String line=in.nextLine();
			arr=line.split(",");
			HW1=Integer.parseInt(arr[1]);
			//System.out.println(arr[1]);
			HW2=Integer.parseInt(arr[2]);
			HW3=Integer.parseInt(arr[3]);
			Midterm=Integer.parseInt(arr[4]);
			Project=Integer.parseInt(arr[5]);
			Final=Integer.parseInt(arr[6]);
			
			double total_HW= 0.45 * (HW1+HW2+HW3)/3;
			//System.out.println(total_HW);
			
			double Project_value=0.25*Project;
			//System.out.println(Project_value);
			
			double MidTermFinal=0.30 * (Midterm+Final)/2;
			//System.out.println(MidTermFinal);
			
			final_numerical_grade = total_HW + Project_value + MidTermFinal;
			//System.out.println(final_numerical_grade);
			String final_letter_grade;
			
					
			if(final_numerical_grade>=90 && final_numerical_grade<=100)
			{
				final_letter_grade="A";
				countA++;
			}else if(final_numerical_grade>=80 && final_numerical_grade<=89)
			{
				final_letter_grade="B";
				countB++;
			}else if(final_numerical_grade>=70 && final_numerical_grade<=79)
			{
				final_letter_grade="C";
				countC++;
			}else if(final_numerical_grade>=60 && final_numerical_grade<=69)
			{
				final_letter_grade="D";
				countD++;
			}else
			{
				final_letter_grade="F";
				countF++;
			}
			
					
		}
		System.out.println("A grade Student is:"+countA+" B grade Student is:"+countB+" C grade Student is:"+countC+" D grade Student is:"+countD+" F grade Student is:"+countF);
		
	}
	
}
