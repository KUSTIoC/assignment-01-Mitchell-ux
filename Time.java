public  class Time
{
	private int h; // 1-12
	private int m; //0-59
	private int s; //0-59

	public Time(int h , int m , int s)
	{

		if(h<=0 || h>12)
		{
			throw new IllegalArgumentException("Hours ( " + h + " ) ,  it must bbe from 1 -- 12");
		}

		if(m<0 || m>59)
		{
		throw new IllegalArgumentException("Minutes ( " + m + " ) ,  it must be from 0 -- 59");
		}

		if(m<0 || m>59)
		{
			throw new IllegalArgumentException("Seconds ( " + s + " ) ,  it must be from 0 -- 59");
		}


		this.h = h;
		this.m = m;
		this.s = s;
	}
	
	public void setH(int h)
	{
		this.h = h;
	}
	
	public void setM(int m)
	{
		this.m = m;
	}

	public void setS(int s)
	{
		this.s = s; 
	}

	public int getH()
	{
		return h;
	}

	public int getM()
	{
		return m;
	}

	public int getS()
	{
		return s;
	}
	
	public String toString()
	{
		return String.format("%d/%d/%d" , h,m,s);
	}

}