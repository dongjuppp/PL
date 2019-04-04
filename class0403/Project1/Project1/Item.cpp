#include "Item.h"
#include <iostream>
#include <fstream>
#include <string>
#include <iomanip>

using namespace std;

int Item::serialNo = 1;

void Item::read(ifstream& fin) {
	id = serialNo++;
	fin >> name >> price >> type;
}
void Item::print() {
	string t = "Man";
	if (type == "f") t = "Woman";
	else if (type == "c") type = "Common";
	cout << id << ' ' << name << '\t' << setw(6)
		<< price << "원 " << type<<endl;
}
void Item::printResult() {
	string t = "Man";
	if (type == "f") t = "Woman";
	else if (type == "c") type = "Common";
	cout << id << ' ' << name << '\t' << setw(6)
		<< price << "원 " << type << "\t총 합계:" << sales * price << endl;
}




//생성자
Item::Item()
{
	sales = 0;
	cout << "생성!" << endl;
	
}

//소멸자
Item::~Item()
{
}
