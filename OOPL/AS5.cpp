/*Write a C++ program with base class Employee and derive
classes Class1_Employee, Class2_Employee and Class3_Employee.
Salary of an employee is calculated as per his/her designation.
Declare calculate salary () as a pure virtual function in base class and
define it in respective derive classes to calculate salary of an employee*/

#include<iostream>
using namespace std;

class Employee {
public:
    string name;
    Employee(string n) : name(n) {}
    virtual void calculateSalary() = 0; // Pure virtual function
};

class Class1_Employee : public Employee {
public:
    Class1_Employee(string n) : Employee(n) {}
    void calculateSalary() {
        cout << "Employee " << name << " is a Class 1 Employee with a salary of 100000" << endl;
    }
};

class Class2_Employee : public Employee {
public:
    Class2_Employee(string n) : Employee(n) {}
    void calculateSalary() {
        cout << "Employee " << name << " is a Class 2 Employee with a salary of 75000" << endl;
    }
};

class Class3_Employee : public Employee {
public:
    Class3_Employee(string n) : Employee(n) {}
    void calculateSalary() {
        cout << "Employee " << name << " is a Class 3 Employee with a salary of 50000" << endl;
    }
};

int main() {
    int choice;
    string name;
    cout << "Enter the name of the employee: ";
    cin >> name;
    cout << "Enter the class of employee (1, 2, or 3): ";
    cin >> choice;

    if(choice == 1) {
        Class1_Employee e1(name);
        e1.calculateSalary();
    } else if(choice == 2) {
        Class2_Employee e2(name);
        e2.calculateSalary();
    } else if(choice == 3) {
        Class3_Employee e3(name);
        e3.calculateSalary();
    } else {
        cout << "Invalid choice. Please enter 1, 2, or 3." << endl;
    }

    return 0;
}
