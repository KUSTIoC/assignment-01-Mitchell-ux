public  class Date
{
	private int d;
	private int m;
	private int y;
	
	public Date(int d , int m , int y)
	{

		if(d<=0 || d>31)
		{
			throw new IllegalArgumentException("Days ( " + d + " ) , Range Of Days Is 1--31");
		}

		if(m<=0 || m>12)
		{
			throw new IllegalArgumentException("Month ( " + m + " ) , Range Of Month Is 1--12");
		}

		if(y<=0 )
		{
			throw new IllegalArgumentException("Year ( " + y + " ) , Year Cannot Be " + y );
		}


		if (m == 2 && d == 29 && !(y % 400 == 0 ||  
		 (y % 4 == 0 && y % 100 != 0)))
      		   throw new IllegalArgumentException("day (" + d +
      	      ") out-of-range for the specified month and year");

		
		this.d = d;
		this.m = m;
		this.y = y;
	}
	
	public void setD(int d)
	{
		this.d = d;
	}
	
	public void setM(int m)
	{
		this.m = m;
	}

	public void setY(int y)
	{
		this.y = y; 
	}

	public int getD()
	{
		return d;
	}

	public int getM()
	{
		return m;
	}

	public int getY()
	{
		return y;
	}

	public String toString()
	{
		return String.format("%d/%d/%d" , d,m,y);
	}


}