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
		<< price << "�� " << type<<endl;
}
void Item::printResult() {
	string t = "Man";
	if (type == "f") t = "Woman";
	else if (type == "c") type = "Common";
	cout << id << ' ' << name << '\t' << setw(6)
		<< price << "�� " << type << "\t�� �հ�:" << sales * price << endl;
}




//������
Item::Item()
{
	sales = 0;
	cout << "����!" << endl;
	
}

//�Ҹ���
Item::~Item()
{
}
