#pragma once
#ifndef DRINK_H
#define DRINK_H

#include <string>
#include <fstream>
#include <iostream>
#include <sstream>

using namespace std;
class Drink
{
	string code;
	string name;
	string size;
	double money;
	
	int stack; //해당 음료의 판매 개수를 저장
public:
	void read(ifstream &in);
	void print();
	bool matches(string kwd);
	double getMoney() { return money; }
	bool order(string ord);
	void setStack() { stack = 0; }
	void print2();
	bool isOrdered();
	Drink();
	~Drink();
};

#endif DRINK_H