import java.util.Scanner;

public class CourseTest
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
//***********************************************************************************************************************
//						Object1
		
		System.out.print("\n\nEnter Course Name : ");
		String name = input.next();
		System.out.print("\n\nEnter Course Code : ");
		int code = input.nextInt();
		System.out.print("\n\nEnter Program Name : ");
		String proName = input.next();
		System.out.print("\n\nEnter Semester : ");
		String semester =  input.next();
		System.out.print("\n\nEnter Year : ");
		int year = input.nextInt();

		Course c1 = new Course(name , code);          //constructor
		
		c1.setYear(year);
		c1.setCourseCode(code);
		c1.setProName(proName);
		c1.setSemester(semester);
		System.out.println(c1);
		System.out.print("\n\n");
//***********************************************************************************************************************
//						Object2
				
		System.out.print("\n\nEnter Course Name : ");
		name = input.next();
		System.out.print("\n\nEnter Course Code : ");
		code = input.nextInt();
		System.out.print("\n\nEnter Program Name : ");
		proName = input.next();
		System.out.print("\n\nEnter Semester : ");
		semester =  input.next();
		System.out.print("\n\nEnter Year : ");
		year = input.nextInt();

		Course c2 = new Course(name , code);

		c2.setYear(year);
		c2.setCourseCode(code);
		c2.setProName(proName);
		c2.setSemester(semester);

		System.out.println(c2);
		System.out.print("\n\n");
//***********************************************************************************************************************
//						Object3
		
		System.out.print("\n\nEnter Course Name : ");
		name = input.next();
		System.out.print("\n\nEnter Course Code : ");
		code = input.nextInt();
		System.out.print("\n\nEnter Program Name : ");
		 proName = input.next();
		System.out.print("\n\nEnter Semester : ");
		semester =  input.next();
		System.out.print("\n\nEnter Year : ");
		year = input.nextInt();

		Course c3 = new Course(name , code);

		c3.setYear(year);		
		c3.setCourseCode(code);
		c3.setProName(proName);
		c3.setSemester(semester);
		
		System.out.println(c3);
		System.out.print("\n\n");
	}

}