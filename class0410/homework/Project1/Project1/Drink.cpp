#include "Drink.h"
#include <fstream>



using namespace std;

void Drink::read(ifstream &in) {
	in >> code >> name >> size >> money;
	money *= 1000;
}
void Drink::print() {
	cout << code << ' ' << name << ' ' << size << ' ' <<
		money << "원" << endl;
}
bool isdigit(string kwd) {
	const char* cstr = kwd.c_str();
	for (int i = 0; i < strlen(cstr); i++)
		if (cstr[i] < '0' || cstr[i] > '9')
			return false;
	return true;
}
bool Drink::matches(string kwd) {
	if (code == kwd) return true;
	if (name.find(kwd) != -1) return true;
	if (size == kwd) return true;
	if (isdigit(kwd) && money <= stoi(kwd))
		return true;
	return false;
}

bool Drink::order(string ord) {
	if (code == ord) {
		stack++;
		return true;
	}
	else return false;
	
}
void Drink::print2() {
	cout << code<< " " << name << " " << size
		<< " 의 매출액:" << money * stack << endl;
}
bool Drink::isOrdered() {
	if (stack == 0)
		return false;
	else
		return true;
}

Drink::Drink()
{
	stack = 0;
}


Drink::~Drink()
{
}
