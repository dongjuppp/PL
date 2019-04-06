#include "Room.h"

using namespace std;
void Room::read(ifstream &in)
{
	in >> name >> money >> space >> maxPeople >> room >> bad >> bath;
	getline(in, line);
	keyword1 = line;
}

void Room::print() {
	cout << name << " " << money << "원(" << space << ") 최대인원 " << maxPeople << "명, "
		<< "방" << room << "개 침대 " << bad << "개 욕실" << bath << "개\n" << keyword1 << endl;
	
}


Room::Room()
{
	target = false;
}


Room::~Room()
{
}
