#include "Room.h"

using namespace std;
void Room::read(ifstream &in)
{
	in >> name >> money >> space >> maxPeople >> room >> bad >> bath;
	getline(in, line);
	keyword1 = line;
}

void Room::print() {
	cout << name << " " << money << "��(" << space << ") �ִ��ο� " << maxPeople << "��, "
		<< "��" << room << "�� ħ�� " << bad << "�� ���" << bath << "��\n" << keyword1 << endl;
	
}


Room::Room()
{
	target = false;
}


Room::~Room()
{
}
