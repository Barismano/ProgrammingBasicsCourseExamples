#include <iostream>

class Time
{
	private:
	int hours;
	int mins;
	int secs;
	public:
	Time()
	{
		hours=0;
		mins=0;
		secs=0;
	}
	Time(int hours,int mins,int secs)
	{
		setHours(hours);
		setMins(mins);
		setSecs(secs);
	}
	private:
	void setHours(int hours)
	{
		if(hours>23)
			hours=23;
		else if(hours<0)
			hours=0;
		this->hours=hours;	
	}
	void setMins(int mins)
	{
		if(mins>59)
			mins=59;
		else if(mins<0)
			mins=0;
		this->mins=mins;
	}
		void setSecs(int secs)
	{
		if(secs>59)
			secs=59;
		else if(secs<0)
			secs=0;
		this->secs=secs;
	}
	public:
	int getHours() const
	{
		
		return hours;
	}
	int getMins() const
	{
		return mins;
	}
	int getSecs() const
	{
		return secs;
	}
	bool isEarlier(const Time& other)
	{
		if(hours<other.getHours())
			return true;
		else if(hours>other.getHours())
			return false;
		else
		{
			if(mins<other.getMins())
				return true;	
			else if(mins>other.getMins())
				return false;
			else 
			{
				if(secs<other.getSecs())
					return true;
				else
					return false;
			}
		}	
	}
};
class Appointment
{
  Time startTime;
  Time endTime;
  int a;
  Appointment(Time t1,Time t2)
  {
  	if(t1.isEarlier(t2))
  	{
	startTime=t1;	  
	endTime=t2;
	}	
	else
	{
		startTime=t2;
		endTime=t1;
	}
  }
};
void A(int a)
{
	a++;
}
void AA(int& a)
{
	a++;
}
int main()
{
	int num = 8;
	int num1 = 8;
	A(num);
	AA(num1);
	std::cout<<num<<" "<<num1<<std::endl;

	Time t1(12,53,12);
	Time t2(12,53,12);
	std::cout<< t2.isEarlier(t1);
}
