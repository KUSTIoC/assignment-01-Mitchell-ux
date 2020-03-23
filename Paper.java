public class Paper
{
	private String paperTitle;
	private int paperId;
	private int courseCode;
	private String invigilator;
	private String semester;
	private Date date;
	private Time time;
	private String examType;
	private String incharge;
	private String location;
	private int students;
	private boolean isCollected;
	private String result;// This Variable Is Used For The Result Using boolean To Print Paper Is Collected Or Not
	
	public Paper( int  paperId , int courseCode , int students)
	{
		this.paperId = paperId;
		this.courseCode = courseCode;
		this.students = students;
	
	}

	public void setPaperTitle(String paperTitle)
	{
		this.paperTitle = paperTitle;
	}

	public void setPaperId(int paperId)
	{
		this.paperId =  paperId;
	}

	public void setCourseCode(int courseCode)
	{
		this.courseCode = courseCode;
	}

	public void setInvigilator(String invigilator)
	{
		this.invigilator = invigilator;
	}

	public void setSemester(String semester)
	{
		this.semester = semester;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}

	public void setTime(Time time)
	{
		this.time = time;
	}

	public void setExamType(String examType)
	{
		this.examType =  examType;
	}

	public void setLocation(String location)
	{
		this.location =  location;
	}

	public void setIncharge(String incharge)
	{
		this.incharge =  incharge;
	}

	public void setStudents(int students)
	{
		this.students = students;
	}
	
	public void setIsCollected(boolean isCollected)
	{
		this.isCollected = isCollected;
	}

	public String getPaperTitle()
	{
		return paperTitle; 
	}

	public int getPaperId()
	{
		return paperId; 
	}

	public int getCourseCode()
	{
		return courseCode; 
	}

	public String getInvigilator()
	{
		return invigilator; 
	}

	public String getSemester()
	{
		return semester; 
	}

	public Date getDate()
	{
		return date; 
	}

	public Time getTime()
	{
		return time; 
	}

	public String getExamType()
	{
		return examType; 
	}

	public String getLocation()
	{
		return location; 
	}

	public String getIncharge()
	{
		return incharge; 
	}

	public int getStudents()
	{
		return students; 
	}

	public boolean getIsCollected()
	{
		
		return isCollected;
	}
	
	public void setResult(boolean isCollected)
	{
		if(isCollected == true)
		{
			result = "Collected";
		}
		else 
		{
			result = "Not Collected";
		}
	}

	public String getResult()
	{
		return result;
	}
	
	
	public String toString()
	{
		return String.format("%nPaper Name : %s %nPaperID : %d %nCourse Code : %d %nInvigilator Name : %s %n Semester : %s %nDate : %s %nTime : %s %nExam Type : %s %nLocation Of Exam : %s %nCourse Incharge : %s %nTotal Students : %d %nIs Paper Collected : %s" , getPaperTitle() , getPaperId() , getCourseCode() , getInvigilator() , getSemester() , getDate() , getTime() , getExamType() , getLocation() , getIncharge() , getStudents() , getResult());
	}

	

}