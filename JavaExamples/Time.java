package Jyly6th;
import java.util.Arrays;
import java.util.Scanner;
class ArrUprZad6 
{

	public static void main(String[] args) 
	{
		
	Time[] arr = new Time[5];
	arr[0]=new Time(15,3,10);
	arr[1]=new Time(12,0,0);
	arr[2]=new Time(9,3,10);
	arr[3]=new Time(20,80,0);
	arr[4]=new Time(17,3,10);
	SelectionSort(arr);
	for(int i = 0; i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	
	}
	 public static void SelectionSort(Time[] arr)
	    {
	        for (int i = 0; i <arr.length ; i++)
	        {
	            Time min = arr[i];
	            int index = i;

	            for (int j = i+1; j <arr.length ; j++)
	            {
	                if(arr[j].CompareTo(min)<0)
	                {
	                    min = arr[j];
	                    index = j;
	                }
	            }
	            Swap(i,index,arr);
	        }
	    }
		public static void Swap(int i,int j,Time[] arr)
	    {
	        Time temp = arr[i];
	        arr[i]=arr[j];
	        arr[j]=temp;
	    }
}
class Time
{
	private int Hours;
	private int Mins;
	private int Secs;
	
	Time(int Hours,int Mins,int Secs)
	{
		SetHours(Hours);
		SetMins(Mins);
		SetSecs(Secs);
	}
	Time(int Secs)
	{
		SetHours(Secs/3600);
		int reminder = Secs%3600;
		SetMins(reminder/60);
		SetSecs(reminder%60);
	}
	Time() 
	{
		SetHours(0);
		SetSecs(0);
		SetMins(0);
	}
	public void SetHours(int Hours)
	{
		if(Hours>23)
			Hours=23;
		else if(Hours<0)
			Hours=0;
		this.Hours=Hours;
	}
	public int GetHours()
	{
		return Hours;
	}
	public void SetMins(int Mins)
	{
	if(Mins>59)
		Mins=59;
	else if(Mins<0)
		Mins=0;
	this.Mins=Mins;
	}
	public int GetMins()
	{
		return Mins;
	}
	public void SetSecs(int Secs)
	{
		if(Secs>59)
			Secs=59;
		else if(Secs<0)
			Secs=0;
		this.Secs=Secs;
	}
	public int GetSecs()
	{
		return Secs;	
	}
	public boolean IsDinnerTime()
	{
		if(Hours==20&&Mins>=30)
			return true;
		else if(Hours==21)
			return true;
		else if(Hours==22&&Mins==0)
			return true;
		else
			return false;
	}
	public boolean isPartyTime()
	{
		if(Hours>=23||Hours<6)
			return true;
		return false;
		
	}
	private int ConvertTimeToSecs()
	{
		return Secs+Mins*60+Hours*3600;
	}
	public static Time GetDiff(Time t1, Time t2)
	{
		int secs1 = t1.ConvertTimeToSecs();
		int secs2= t2.ConvertTimeToSecs();
		int diff = Math.abs(secs1-secs2);
		Time result = new Time(diff);
		return result;
	}
	public int CompareTo(Time other)
	{
		if(Hours>other.Hours)
			return 1;
		else if(Hours<other.Hours)
			return -1;
		else
		{
			if(Mins>other.Mins)
				return 1;
			else if(Mins<other.Mins)
				return -1;
			else
			{
				if(Secs>other.Secs)
					return 1;
				else if(Secs<other.Secs)
					return -1;
				else
					return 0;
			}
		}

	}
	public Time getToMidnight()
	{
		int midnightSecs = 24*3600;
		int mySecs = ConvertTimeToSecs();
		int diff = midnightSecs-mySecs;
		return new Time(diff);
	}
	@Override
	public String toString()
	{
		return Hours+" : "+Mins+" : "+ Secs;
	}
	
}


