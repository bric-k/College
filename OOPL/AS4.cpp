#include <iostream>

class Box {
private:
    double length;
    double breadth;
    double height;

public:
    // Parameterized constructor
    Box(double l=0, double b=0, double h=0) : length(l), breadth(b), height(h) {}

    // Overloaded operator '<<' for displaying Box dimensions
    friend std::ostream& operator<<(std::ostream& out, const Box& box) {
        out << "Length: " << box.length << ", Breadth: " << box.breadth << ", Height: " << box.height;
        return out;
    }

    // Overloaded operator '>>' for reading Box dimensions
    friend std::istream& operator>>(std::istream& in, Box& box) {
        std::cout << "Enter Length: ";
        in >> box.length;
        std::cout << "Enter Breadth: ";
        in >> box.breadth;
        std::cout << "Enter Height: ";
        in >> box.height;
        return in;
    }

    // Method to compute the volume of a Box
    double volume() const {
        return length * breadth * height;
    }

    // Overloaded operator '+' to add the volumes of two Box objects
    friend double operator+(const Box& a, const Box& b) {
        return a.volume() + b.volume();
    }
};

int main() {
    Box box1, box2;
    std::cout << "Enter dimensions for Box 1:\n";
    std::cin >> box1;
    std::cout << "Enter dimensions for Box 2:\n";
    std::cin >> box2;

    // Adding the volumes of two Box objects using the '+' operator
    double totalVolume = box1 + box2;

    std::cout << "\nBox 1: " << box1 << ", Volume: " << box1.volume() << std::endl;
    std::cout << "Box 2: " << box2 << ", Volume: " << box2.volume() << std::endl;
    std::cout << "Total Volume: " << totalVolume << std::endl;

    return 0;
}
