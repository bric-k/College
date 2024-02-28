#include <iostream>
using std::string; //so that std::string doesnt have to be written all the time

class AbstractEmp
{
virtual void Promotion()=0;
};

//blueprint for object
class Employee: {
private:
    string Company;
    int Age;
protected:
    string Name;

public: //security of attributes in class

    void setName(string name) {  //setter
        Name = name;
    }
    string getName(){            //getter
        return Name;
    }
    void setCompany(string company) {
        Company = company;
    }
    string getCompany(){
        return Company;
    }
    void setAge(int age) {
        if (age>=18)
        Age = age;
    }
    int getAge(){
        return Age;
    }
    void Introduce() //method: used to perform an action on the attributes
    {
        std::cout << "Name - " << Name << std::endl;
        std::cout << "Company - " << Company << std::endl;
        std::cout << "Age - " << Age << std::endl;
    }

    void Promotion() {
        if(Age>33)
            std::cout << Name << " promoted!" << std::endl;
        else
            std::cout << Name << " lol" << std::endl;    
    }

    //creating constructor
    Employee(string name, string company, int age)
    {
        Name = name;
        Company = company;
        Age = age;
    }
};

class developer:public Employee 
{
public:
    string IDEUsed;
    developer(string name, string company, int age, string IDEUsed)
        : Employee(name, company, age)
    {
        
    }
};

int main ()
{
    Employee emp1 = Employee("Bruce", "Wayne Ent", 32); //to access and create an object (first employee)
    Employee emp2 = Employee("Clark", "Daily Planet", 34);
    developer d=developer("Moo", "Cow Inc", 56, "VSC");
    
//------------------------------------------------------------------------//
//unnecessary as constructor has now been made
    /*emp1.Name = "Peter"; //gives name
    emp1.Company = "Stark"; //gives compmnay
    emp1.Age = 21; //gives age*/
//------------------------------------------------------------------------//

    emp1.Promotion();
    emp2.Promotion();    
    d.Promotion();
}






int main() {
    // Creating an object of the Car class
    Car myCar;

    // Setting attributes
    myCar.color = "Red";
    myCar.model = "Sedan";
    myCar.speed = 0;

    // Using methods
    myCar.start();
    myCar.accelerate();
    myCar.accelerate();
    myCar.stop();


class Car {
private:
    string color;
    string model;
    int speed;

public:
    void start() {
        // Code to start the car
    }

    void accelerate() {
        // Code to accelerate the car
    }
};

