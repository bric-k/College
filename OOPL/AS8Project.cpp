/*  Write a program to manage a shopping list. Each shopping list item is
    represented by a string stored in a container. Your design requires
    a print function that prints out the contents of the shopping list.
        · Create an empty list.
        . Append the items, "eggs," "milk," "sugar," "chocolate," and
          "flour" to the list. Print the list.
        . Remove the first element from the list. Print the list.
        . Insert the item, "coffee" at the beginning of the list. Print the list.
        . Find the item, "sugar" and replace it with "honey." Print the list.
        . Insert the item, "baking powder" before "milk" in the list. Print the
          list.
        . Sort and Search the item in the list.
*/



#include <iostream>
#include <vector>
#include <algorithm>

int main() {
    std::vector<std::string> shoppingList;

    shoppingList.push_back("eggs");
    shoppingList.push_back("milk");
    shoppingList.push_back("sugar");
    shoppingList.push_back("chocolate");
    shoppingList.push_back("flour");
    shoppingList.push_back("sparklers");
    shoppingList.push_back("rockets");
    shoppingList.push_back("bombs");

    std::cout << "Shopping List:\n";
    for(const auto& item : shoppingList) {
        std::cout << item << "\n";
    }

    shoppingList.erase(shoppingList.begin());

   
    std::cout << "\nShopping List after removing first item:\n";
    for(const auto& item : shoppingList) {
        std::cout << item << "\n";
    }

    shoppingList.insert(shoppingList.begin(), "coffee");

    std::cout << "\nShopping List after adding coffee:\n";
    for(const auto& item : shoppingList) {
        std::cout << item << "\n";
    }

    auto it = std::find(shoppingList.begin(), shoppingList.end(), "sugar");
    if(it != shoppingList.end()) {
        *it = "honey";
    }

    std::cout << "\nShopping List after replacing sugar with honey:\n";
    for(const auto& item : shoppingList) {
        std::cout << item << "\n";
    }

     it = std::find(shoppingList.begin(), shoppingList.end(), "milk");
     if(it != shoppingList.end()) {
         shoppingList.insert(it, "baking powder");
     }

     std::cout << "\nShopping List after adding baking powder before milk:\n";
     for(const auto& item : shoppingList) {
         std::cout << item << "\n";
     }

      std::sort(shoppingList.begin(),shoppingList.end());
      it = std::find(shoppingList.begin(),shoppingList.end(),"milk");
      if(it != shoppingList.end()){
          std::cout<<"\nItem found\n";
      }else{
          std::cout<<"\nItem not found\n";
      }
    
      return 0;
}
