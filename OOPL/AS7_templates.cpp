#include <iostream>
using namespace std;

template <typename T>
void bubble_sort(T arr[], int size) {
    for(int i = 0; i < size-1; i++) {
        for(int j = 0; j < size-i-1; j++) {
            if(arr[j] > arr[j+1]) {
                swap(arr[j], arr[j+1]);
            }
        }
    }
}

int main() {
    //integers
    int int_arr[] = {2, 4, 10, 11, 9, 7, 33, 5};
    int int_size = sizeof(int_arr) / sizeof(int);
    bubble_sort(int_arr, int_size);
    cout << "Sorted integer array: ";
    for(int i = 0; i < int_size; i++) {
        cout << int_arr[i] << " ";
    }
    cout << endl;

    //floats
    float float_arr[] = {2.64, 1.43, 3.1456, 0.122, 5};
    int float_size = sizeof(float_arr) / sizeof(float);
    bubble_sort(float_arr, float_size);
    cout << "Sorted float array: ";
    for(int i = 0; i < float_size; i++) {
        cout << float_arr[i] << " ";
    }
    cout << endl;

    //characters
    char char_arr[] = {'e', 's', 'q', 't', 'u'};
    int char_size = sizeof(char_arr) / sizeof(char);
    bubble_sort(char_arr, char_size);
    cout << "Sorted character array: ";
    for(int i = 0; i < char_size; i++) {
        cout << char_arr[i] << " ";
    }
    cout << endl;

    return 0;
}
