#include <iostream>
#include <fstream>
#include <string>

using namespace std;

class Student {
public:
    int prn;
    string name;
    float maths;
    float physics;
    float chemistry;
    float totalPercentage;
    char grade;

    // Member functions
    void calculatePercentageAndGrade() {
        totalPercentage = (maths + physics + chemistry) / 3.0;
        if (totalPercentage >= 90) {
            grade = 'A';
        } else if (totalPercentage >= 80) {
            grade = 'B';
        } else if (totalPercentage >= 70) {
            grade = 'C';
        } else if (totalPercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }
};

void addStudentRecord() {
    ofstream outfile("students.txt", ios::app);
    if (!outfile.is_open()) {
        cerr << "Error opening file for writing!" << endl;
        return;
    }

    Student student;
    cout << "Enter PRN: ";
    cin >> student.prn;

    ifstream infile("students.txt");
    Student tempStudent;
    bool prnExists = false;

    while (infile >> tempStudent.prn >> tempStudent.name >> tempStudent.maths >> tempStudent.physics
        >> tempStudent.chemistry >> tempStudent.totalPercentage >> tempStudent.grade) {
        if (tempStudent.prn == student.prn) {
            prnExists = true;
            break;
        }
    }

    infile.close();

    if (prnExists) {
        cout << "PRN already exists. Please use the modify option to update the record." << endl;
        return;
    }

    cout << "Enter Student Name: ";
    cin.ignore();
    getline(cin, student.name);

    cout << "Enter marks for Maths: ";
    cin >> student.maths;

    cout << "Enter marks for Physics: ";
    cin >> student.physics;

    cout << "Enter marks for Chemistry: ";
    cin >> student.chemistry;

    // Validate input
    if (student.maths < 0 || student.physics < 0 || student.chemistry < 0) {
        cerr << "Error: Marks cannot be negative!" << endl;
        return;
    }

    // Calculate total percentage and grade
    student.calculatePercentageAndGrade();

    // Write to file
    outfile << student.prn << " " << student.name << " " << student.maths << " " << student.physics
        << " " << student.chemistry << " " << student.totalPercentage << " " << student.grade << endl;

    outfile.close();
    cout << "Record added successfully!" << endl;
}

void searchStudentRecord() {
    ifstream infile("students.txt");
    if (!infile.is_open()) {
        cerr << "Error opening file for reading!" << endl;
        return;
    }

    int searchPRN;
    cout << "Enter PRN to search: ";
    cin >> searchPRN;

    Student student;
    bool found = false;

    while (infile >> student.prn >> student.name >> student.maths >> student.physics >>
        student.chemistry >> student.totalPercentage >> student.grade) {
        if (student.prn == searchPRN) {
            found = true;
            break;
        }
    }

    infile.close();

    if (found) {
        cout << "Record found:" << endl;
        cout << "PRN: " << student.prn << endl;
        cout << "Name: " << student.name << endl;
        cout << "Maths: " << student.maths << endl;
        cout << "Physics: " << student.physics << endl;
        cout << "Chemistry: " << student.chemistry << endl;
        cout << "Total Percentage: " << student.totalPercentage << "%" << endl;
        cout << "Grade: " << student.grade << endl;
    } else {
        cout << "Record not found." << endl;
    }
}

void modifyStudentRecord() {
    ifstream infile("students.txt");
    ofstream outfile("temp.txt");

    if (!infile.is_open() || !outfile.is_open()) {
        cerr << "Error opening file for reading or writing!" << endl;
        return;
    }

    int modifyPRN;
    cout << "Enter PRN to modify: ";
    cin >> modifyPRN;

    Student student;
    bool found = false;

    while (infile >> student.prn >> student.name >> student.maths >> student.physics >>
        student.chemistry >> student.totalPercentage >> student.grade) {
        if (student.prn == modifyPRN) {
            found = true;

            cout << "Enter new marks for Maths: ";
            cin >> student.maths;

            cout << "Enter new marks for Physics: ";
            cin >> student.physics;

            cout << "Enter new marks for Chemistry: ";
            cin >> student.chemistry;

            // Validate input
            if (student.maths < 0 || student.physics < 0 || student.chemistry < 0) {
                cerr << "Error: Marks cannot be negative!" << endl;
                infile.close();
                outfile.close();
                return;
            }

            // Calculate total percentage and grade
            student.calculatePercentageAndGrade();

            // Write modified record to file
            outfile << student.prn << " " << student.name << " " << student.maths << " " << student.physics
                << " " << student.chemistry << " " << student.totalPercentage << " " << student.grade << endl;
        } else {
            // Copy the rest of the records
            outfile << student.prn << " " << student.name << " " << student.maths << " "
                << student.physics << " " << student.chemistry << " " << student.totalPercentage << " "
                << student.grade << endl;
        }
    }

    infile.close();
    outfile.close();

    if (!found) {
        cout << "Record not found." << endl;
        return;
    }

    // Remove the original file and rename the temporary file
    remove("students.txt");
    rename("temp.txt", "students.txt");

    cout << "Record modified successfully!" << endl;
}

int main() {
    int choice;
    do {
        cout << "\n***** Student Record System *****" << endl;
        cout << "1. Add Student Record" << endl;
        cout << "2. Search Student Record" << endl;
        cout << "3. Modify Student Record" << endl;
        cout << "4. Quit" << endl;
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
            case 1:
                addStudentRecord();
                break;
            case 2:
                searchStudentRecord();
                break;
            case 3:
                modifyStudentRecord();
                break;
            case 4:
                cout << "Exiting program. Goodbye!" << endl;
                break;
            default:
                cout << "Invalid choice. Please enter a valid option." << endl;
        }
    } while (choice != 4);

    return 0;
}
