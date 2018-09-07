package Jyly6th;
import java.util.Arrays;
import java.util.Scanner;
class ArrUprZad6 
{

	public static void main(String[] args) 
	{
		Human br = new Human("",-9);
		System.out.print(br.getName() + " "+br.getAge());
		
		
	
	}

}
class Human
{
	private String name;
	private int age;
	Human(String name,int age)
	{
		setName(name);
		setAge(age);
		
	}
	int getAge()
	{
		return age;	
	}
	String getName()
	{
		return name;
	}
	void setName(String name)
	{
		if(name.equals(""))
			name="default name";
		this.name=name;
	}
	void setAge(int age)
	{
			if(age<0)
				age=0;
			else if(age>=120)
				age=120;
			this.age=age;
	}
}




