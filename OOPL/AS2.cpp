//Develop an object oriented program in C++ to create a database of employee information system containing the following information:
//Employee name, employee number, qualification, address, contact number, salary details, etc. Construct the database with suitable inline
//member functions for initialising and destroying the data via constructor, default constructor, copy constructor, destructor. Use dynamic
//memory allocation concept while destroying the object of a class. Use static data member concept wherever required
//and display employee info.

#include <iostream>
#include <cstring>

class Employee {
private:
    char* name;
    int employeeNumber;
    char* qualification;
    char* address;
    char* contactNumber;
    double salary;

    static int employeeCount;

public:
    // Constructors
    Employee() {
        name = nullptr;
        employeeNumber = 0;
        qualification = nullptr;
        address = nullptr;
        contactNumber = nullptr;
        salary = 0.0;
        employeeCount++;
    }

    Employee(const char* empName, int empNumber, const char* empQualification, const char* empAddress, const char* empContact, double empSalary) {
        name = new char[strlen(empName) + 1];
        strcpy(name, empName);
        employeeNumber = empNumber;
        qualification = new char[strlen(empQualification) + 1];
        strcpy(qualification, empQualification);
        address = new char[strlen(empAddress) + 1];
        strcpy(address, empAddress);
        contactNumber = new char[strlen(empContact) + 1];
        strcpy(contactNumber, empContact);
        salary = empSalary;
        employeeCount++;
    }

    // Copy Constructor
    Employee(const Employee& other) {
        name = new char[strlen(other.name) + 1];
        strcpy(name, other.name);
        employeeNumber = other.employeeNumber;
        qualification = new char[strlen(other.qualification) + 1];
        strcpy(qualification, other.qualification);
        address = new char[strlen(other.address) + 1];
        strcpy(address, other.address);
        contactNumber = new char[strlen(other.contactNumber) + 1];
        strcpy(contactNumber, other.contactNumber);
        salary = other.salary;
        employeeCount++;
    }

    // Destructor
    ~Employee() {
        if (name != nullptr) delete[] name;
        if (qualification != nullptr) delete[] qualification;
        if (address != nullptr) delete[] address;
        if (contactNumber != nullptr) delete[] contactNumber;
        employeeCount--;
    }

    // Display employee info
    void displayInfo() {
        std::cout << "Employee Number: " << employeeNumber << std::endl;
        std::cout << "Name: " << name << std::endl;
        std::cout << "Qualification: " << qualification << std::endl;
        std::cout << "Address: " << address << std::endl;
        std::cout << "Contact Number: " << contactNumber << std::endl;
        std::cout << "Salary: ₹" << salary << std::endl;
    }

    //function to get the employee count
    static int getEmployeeCount() {
        return employeeCount;
    }
};

// Initialize static member
int Employee::employeeCount = 0;

int main() {
    Employee emp1("Siddharth Bhagwat", 1001, "Bachelor's in Engineering", "21 Vine St, Hell", "192-168-21", 60000.0);
    Employee emp2("Boaty McBoatface", 1002, "Master's in Boat", "456 Boat St, BoatTown", "555-987-6543", 75000.0);

    std::cout << "Employee Count: " << Employee::getEmployeeCount() << std::endl;

    emp1.displayInfo();
    std::cout << std::endl;
    emp2.displayInfo();

    return 0;
}




