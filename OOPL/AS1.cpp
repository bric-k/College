#include <iostream>
using namespace std;
class Passenger {
public:
string name; // passenger name
int age; // passenger age
string flight_number; // flight number
string departure_time; // departure time
string source; // source
void get_info(){
// Prompt user for passenger information
cout << "Enter passenger name: ";
cin >> name;
cout << "Enter passenger age: ";
cin >> age;
cout << "Enter flight number: ";
cin >> flight_number;
cout << "Enter departure time: ";
cin >> departure_time;
cout << "Enter source: " ;
cin >> source;
}
void show_info(){
// Display passenger information
cout << "Passenger Information:" << endl;
cout << "Name: " << name << endl;
cout << "Age: " << age << endl;
cout << "Flight Number: " << flight_number << endl;
cout << "Departure Time: " << departure_time << endl;
cout << "Source: " << source << endl;
}
};
int main() {
Passenger passenger1;
Passenger passenger2;
passenger1.get_info();
passenger2.get_info();
passenger1.show_info();
passenger2.show_info();
return 0;
}