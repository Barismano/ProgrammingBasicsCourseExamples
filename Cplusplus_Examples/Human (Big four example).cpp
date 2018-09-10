// Example program
#include <iostream>
#include <cstring>

class Human
{
  private:
  char* name;  // Понеже ползваме динамична памет трябва да разпишем голямата четворка.
  int age;
  public:
  Human()
  {
	  name=nullptr;
	  age=0;
  }
  
  Human(char* name,int age) //При конструктура винаги КОПИРАМЕ подадения стринг за нашния нов обект.
  { 						// Това е важно, защото не искаме някой друг да има достъп до него.
   int len = strlen(name);
   this->name = new char[len+1];
   strcpy(this->name,name);
  // this->name=name; BAD!!!
   this->age=age;
  }
  Human(const Human& other)//Използваме функцията, която копира всичко от other в нашия обект.
  {						   //Понеже това е конструктор, няма нужда да трия нищо от обекта, понеже няма как
   CopyFrom(other);        // да е имало данни тук,защото сега го създаваме.
  }
  Human& operator=(const Human& other)
  {
      if(&other!=this)   
      {
        Free();          //За разлика от при Копи-контструктора , тука е възможно да е имало данни , преди копирането	
        CopyFrom(other); // (възможно е обекта да е съществувал).За това преди да копираме трябва да изтрием, това което е седяло тук.
      }				     // Проверката на 25 ред е с цел да не стане нещо от сорта T1=T1.
    return *this;       // Връщаме указател към обекта, в който сме копирали, за може да chain-ваме  T1=T2=T3.
  }

  ~Human()
  {
      Free(); //Тук просто трябва да изтрием обекта. Долу е разписана функцията.
      
  }
   const char* GetName() const //Връщаме указателя към името, но понеже е константен, няма да може да бъде променяно нешто име.
  {
      return name;
  }
  private:
  void CopyFrom(const Human& other)
  {
       age=other.age; //Копираме годините.
        int len = strlen(other.name); 
        name=new char[len+1];   // Копираме стринга.НЕ ПРАВИМ this->name=name; защото така само ще копипраме адреса
        strcpy(name,other.name);// и двата обекта ще сочат към един и същ стринг.И ако променим името на единия
  }								// ще променим и името на другия.	
  
  void Free() //Ако бяхме оставили автоматично създаденият деструктор, той щеше да трие числото age и пойнтера
  {			  //но нямаше да изтрие това, към което сочи пойнтера.За това трябва ние да го разпишем.
   delete[] name;
   age=0;
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
