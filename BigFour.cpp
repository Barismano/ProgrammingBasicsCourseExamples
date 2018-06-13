#include <iostream>
#include <string>
#include <cstring>
class User 
{
	
	//Ãîëÿìàòà ÷åòâîðêà
	// Default constructor, Copy Contructor, Operator=, Destructor.
	public:
		char* name;
		int age;
		User() //Default constructor
		{
			name=NULL;
			age=0;
		}
		User(const char* n, int age)
		{
			int len = strlen(n);
			name = new char[len+1];
			strcpy(name,n);
			this->age=age;
		}
	    User(const User& other) // Copy constuctor (ïðàâèì ãî, êîãàòî ïîëçâàìå äèíàìè÷íà ïàìåò)
	    {
	    	CopyFrom(other);
		}
		~User()  //Äåñòðóêòîð
		{
			Free();
		}
		private:
			
		void Free()  //destructor (ïðàâèì ãî, êîãàòî ïîëçâàìå äèíàìè÷íà ïàìåò)
		{
			age=0;
			delete[] name;
		}
		void CopyFrom(const User& other) // Âèíàãè ÿ ðàçïèñâàìå!!!!
		{
			int len = strlen(other.name);
			name = new char[len+1];
			strcpy(name,other.name);
			age=other.age;
		}
		public:
		User& operator=(const User& other)
		{
			if(this!=&other) //ïðîâåðÿâàìå äàëè íå ñà åäèí è ñúùè îáåêò
			{
					Free(); //èçòðèâàìå ìîÿòà ïàìåò
				CopyFrom(other);// êîïèðàì îò êîëåãàòà
			}
			return this*;
		}
		
};
int main()
{

	 User u1("sadsad",7); // èçâèêâà ñå user êîíòðóêòîðà
	 
	 User u2; //èçâèêâà ñå äåôîëòèíèÿ êîíñòðóêòîð
	 u1=u1;
	
}
