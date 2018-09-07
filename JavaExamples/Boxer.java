package Jyly6th;
import java.util.Arrays;
import java.util.Scanner;
class ArrUprZad6 
{

	public static void main(String[] args) 
	{
		
		Boxer b1 = new Boxer("asdas",34);
		Boxer b2 = new Boxer();
		
	}


}
class Boxer
{
	String name;
	int power;
	
	Boxer()
	{
		name="";
		power=0;
	}
	Boxer(String n,int p)
	{
		name=n;
		power=p;
	}
	void SayHello()
	{
		System.out.println("Hello, i am "+name);
	}
}