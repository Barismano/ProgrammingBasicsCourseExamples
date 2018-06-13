#include <iostream>
#include <string>
#include <cstring>
class User 
{
	public:
		char* name;
		int age;
		User(const char* n, int age)
		{
			int len = strlen(n);
			name = new char[len+1];
			strcpy(name,n);
			this->age=age;
		}
	    User(const User& other) // Copy constuctor (правим го, когато ползваме динамична памет)
	    {
	    	CopyFrom(other);
		}
		~User()
		{
			Free();
		}
		private:
			
		void Free()  //destructor (правим го, когато ползваме динамична памет)
		{
			age=0;
			delete[] name;
		}
		void CopyFrom(const User& other) // Винаги я разписваме!!!!
		{
			int len = strlen(other.name);
			name = new char[len+1];
			strcpy(name,other.name);
			age=other.age;
		}
		
};
int main()
{

	 User* u1 = new User("asdsa",44);
	 delete u1;
}