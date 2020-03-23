public class Course
{
	private final String courseName;
	private int courseCode;
	private String programName;
	private String semester;
	private int year;
	private static int count;

	public Course(String courseName , int courseCode)
	{
		this.courseName = courseName;
		this.courseCode = courseCode;
		count++;
	
	}


	public void setCourseCode(int code)
	{
		courseCode = code;
	}

	public void setProName(String name)
	{
		programName =  name;
	}

	public void setSemester(String semester)
	{
		this.semester = semester;
	}

	public String getCourseName()
	{
		return courseName;
	}

	public int getCourseCode()
	{
		return courseCode;
	}

	public String getProName()
	{
		return programName;
	}

	public String getSemester()
	{
		return semester;
	}


	public void setYear(int year)
	{
		this.year = year;
	}

	public int getYear()
	{
		return year;
	}

	public String toString()
	{
		return String.format("%nCourseName : %s %nCourseCode : %s %nProgram Name : %s %nSemester : %s %s %d %nObjects : %d" , getCourseName() , getCourseCode() , getProName() , getSemester(), "Fall", getYear() , getCount());
	}

	public static int getCount()
	{
		return count;

	}
	

}