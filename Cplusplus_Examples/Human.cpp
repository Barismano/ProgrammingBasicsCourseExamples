// Example program
#include <iostream>
#include <cstring>

class Human
{здравей
  private:
  char* name;  
  int age;
  public:
  Human(char* name,int age)
  {
   int len = strlen(name);
   this->name = new char[len+1];
   strcpy(this->name,name);
  // this->name=name; BAD!!!
   this->age=age;
  }
  Human(const Human& other)
  {
   CopyFrom(other);
  }
  Human& operator=(const Human& other)
  {
      if(&other!=this)
      {
        Free();    
        CopyFrom(other);
      }
    return *this;     
  }
  private:
  void CopyFrom(const Human& other)
  {
       age=other.age;
        int len = strlen(other.name);
        name=new char[len+1];
        strcpy(name,other.name);
  }
  void Free()
  {
   delete[] name;
   age=0;
  }
  public:
  const char* GetName()
  {
      return name;
  }
  ~Human()
  {
      Free();
      
  }
 
};


int main()
{ 
  
   Human h1("1234a",12);
  Human h2("asdadasd",45);
  
  h1=h1;
 
  std::cout<<h2.GetName()<<std::endl;
    std::cout<<h1.GetName()<<std::endl;
   
}
