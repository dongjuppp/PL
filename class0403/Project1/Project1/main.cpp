#include <iostream>
#include "Item.h"
#include <fstream>

ifstream scan("week5-input.txt");
using namespace std;
Item* itemList = NULL;
int nitems;

int* readOrder(int orderNum);
int computeTotal(int orderNum, int *arr);
void printOrder(int orderNum, int *arr);

int main() {
	scan >> nitems; 
	itemList = new Item[nitems];
	for (int i = 0; i < nitems; i++) {
		itemList[i].read(scan);
		
	}
	for (int i = 0; i < nitems; i++) {
		itemList[i].print();
	}
	int *order = NULL;
	int n;
	while (true) {
		cout << ">>" << endl;
		cin >> n;
		if (n == 0) break;
		order = readOrder(n);
		printOrder(n, order);
	}
	for (int i = 0; i < nitems; i++) {
		itemList[i].printResult();
	}
}

int* readOrder(int orderNum) {

	int *arr = new int(orderNum);
	for (int i = 0; i < orderNum; i++) {
		cin >> arr[i];
	}
	return arr;
}
int computeTotal(int orderNum, int *arr) {
	int sum = 0;
	for (int i = 0; i < orderNum; i++) {
		sum += itemList[arr[i] - 1].getPrice();
		itemList[arr[i] - 1].setSales(itemList[arr[i] - 1].getSales()+1);
	}
	return sum;
}
void printOrder(int orderNum, int *arr) {
	int result = computeTotal(orderNum, arr);
	for (int i = 0; i < orderNum; i++) {
		itemList[arr[i] - 1].print();
	}
	cout << "гу╟Х: " << result << endl;
}