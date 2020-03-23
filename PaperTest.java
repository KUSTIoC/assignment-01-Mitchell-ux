import java.util.Scanner;

//Sir All The 3 Objects Of paper Class are In This Class I Had TAken The data In Run Time 
//Objects Are p1 , p2 , p3

public class PaperTest
{

	public static void main(String[] args)
	{

//*************************************************************************************************************************
						//Object 1

		Scanner input = new Scanner (System.in);

		System.out.print("\n\nEnter Paper Title : ");
		String name = input.next();
		System.out.print("\n\nEnter Paper ID : ");
		int id = input.nextInt();
		System.out.print("\n\nEnter Course Code : ");
		int code = input.nextInt();
		System.out.print("\n\nInvigilator Name : ");
		String name1 = input.next();
		System.out.print("\n\nEnter Semester : ");
		String semester = input.next();
		System.out.print("\n\nEnter Type Of Examination : ");
		String examType = input.next();
		System.out.print("\n\nEnter Name Of Course Incharge : ");
		String name2 = input.next();
		System.out.print("\n\nEnter Place Of Examination : ");
		String location = input.next();
		System.out.print("\n\nEnter Total Students : ");
		int students = input.nextInt();

		Date date = new Date(17 , 3 , 2020);
		Time time = new Time(9 , 0 , 0);
		Paper p1 = new Paper(id , code , students);
 
		p1.setPaperTitle(name);
		p1.setPaperId(id);
		p1.setCourseCode(code);
 		p1.setInvigilator(name1);
		p1.setSemester(semester);
		p1.setTime(time);
		p1.setDate(date);
		p1.setExamType(examType);
		p1.setIncharge(name2);
		p1.setLocation(location);
		p1.setStudents(students);
		p1.setIsCollected(false);
		p1.setResult(false);

		System.out.print(p1);
		System.out.println("\n\n");

//***********************************************************************************************************************
						//Object2
				
		System.out.print("\n\nEnter Paper Title : ");
		name = input.next();
		System.out.print("\n\nEnter Paper ID : ");
		id = input.nextInt();
		System.out.print("\n\nEnter Course Code : ");
		code = input.nextInt();
		System.out.print("\n\nInvigilator Name : ");
		name1 = input.next();
		System.out.print("\n\nEnter Semester : ");
		semester = input.next();
		System.out.print("\n\nEnter Type Of Examination : ");
		examType = input.next();
		System.out.print("\n\nEnter Name Of Course Incharge : ");
		name2 = input.next();
		System.out.print("\n\nEnter Place Of Examination : ");
		location = input.next();
		System.out.print("\n\nEnter Total Students : ");
		students = input.nextInt();

		Date date1 = new Date(18 , 3 , 2020);
		Time time1 = new Time(12 , 00 , 00);
		Paper p2 = new Paper(id , code , students);
 
		p2.setPaperTitle(name);
		p2.setPaperId(id);
		p2.setCourseCode(code);
 		p2.setInvigilator(name1);
		p2.setSemester(semester);
		p2.setTime(time1);
		p2.setDate(date1);
		p2.setExamType(examType);
		p2.setIncharge(name2);
		p2.setLocation(location);
		p2.setStudents(students);
		p2.setIsCollected(true);
		p2.setResult(true);
		System.out.print(p2);
		
		System.out.println("\n\n");
//*************************************************************************************************************************
							//Object 3		
		System.out.print("\n\nEnter Paper Title : ");
		name = input.next();
		System.out.print("\n\nEnter Paper ID : ");
		id = input.nextInt();
		System.out.print("\n\nEnter Course Code : ");
		code = input.nextInt();
		System.out.print("\n\nInvigilator Name : ");
		name1 = input.next();
		System.out.print("\n\nEnter Semester : ");
		semester = input.next();
		System.out.print("\n\nEnter Type Of Examination : ");
		examType = input.next();
		System.out.print("\n\nEnter Name Of Course Incharge : ");
		name2 = input.next();
		System.out.print("\n\nEnter Place Of Examination : ");
		location = input.next();
		System.out.print("\n\nEnter Total Students : ");
		students = input.nextInt();

		Date date2 = new Date(19 , 3 , 2020);
		Time time2 = new Time(11 , 35 , 56);
		Paper p3 = new Paper(id , code , students);
 
		p3.setPaperTitle(name);
		p3.setPaperId(id);
		p3.setCourseCode(code);
 		p3.setInvigilator(name1);
		p3.setSemester(semester);
		p3.setTime(time2);
		p3.setDate(date2);
		p3.setExamType(examType);
		p3.setIncharge(name2);
		p3.setLocation(location);
		p3.setStudents(students);
		p3.setIsCollected(true);
		p3.setResult(true);
		System.out.print(p3);

	}

}