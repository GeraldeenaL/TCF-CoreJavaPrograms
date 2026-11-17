package Day5_Egs;
import java.util.*;

public class StudentDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String stdName;
		int m1,m2,m3,m4,m5,tot;
		float avg;
		String resStat;
		System.out.println("Enter Student Name:  ");
		stdName=sc.nextLine();
		System.out.println("Enter Student Marks:  ");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		m4=sc.nextInt();
		m5=sc.nextInt();
		tot=m1+m2+m3+m4+m5;
		avg=tot/5;
		if((m1>=50)&&(m2>=50)&&(m3>=50)&&(m4>=50)&&(m5>=50))
		{
			resStat="Pass";
		}
		else
		{
			resStat="Fail";
		}
        String grade;
        if(avg>=90) {
        	grade="A Grade";
        }
        else if(avg>=80)
        {
        	grade="B Grade";
        }
        else if(avg>=70)
        {
        	grade="C Grade";
        }
        else if(avg>=60)
        {
        	grade="D Grade";
        }
        else if(avg>=50)
        {
        	grade="E Grade";
        }
        else
        {
        	grade="F Grade";
        }
        System.out.println("*****Student Marklist Details*****");
        System.out.println("----------------------------------");
        System.out.println("Student Name:  "+stdName);
        System.out.println("Mark 1:     "+m1);
        System.out.println("Mark 2:     "+m2);
        System.out.println("Mark 3:     "+m3);
        System.out.println("Mark 4:     "+m4);
        System.out.println("Mark 5:     "+m5);
        System.out.println("Total Marks:  "+tot);
        System.out.println("Avergae Mark:  "+avg);
        System.out.println("Grade:         "+grade);
        System.out.println("Result:        "+resStat);
        System.out.println("----------------------------------");
        }
	}


