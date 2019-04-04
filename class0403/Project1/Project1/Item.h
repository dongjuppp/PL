#pragma once

#ifndef ITEM_H
#define ITEM_H
#include <string>
#include <fstream>

using namespace std;

class Item
{
	int id;
	string name;
	string type;
	int price;
	int order_num;
	static int serialNo;
	int sales;

public:
	Item();
	~Item();

	void printResult();
	void read(ifstream &scan);
	void print();
	int getPrice() { return price; }
	void setSales(int num) { sales = num; }
	int getSales() { return sales; }
};


#endif
