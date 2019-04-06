#include "RoomMgr.h"


void RoomMgr::readAll()
{
	ifstream in("Room.txt");
	in >> manyRoom;
	rArr = new Room[manyRoom];
	blist = new int[manyRoom];
	initBilst();
	for (int i = 0; i < manyRoom; i++) {
		rArr[i].read(in);
		rArr[i].print();
	}
}
void RoomMgr::initBilst()
{
	for (int i = 0; i < manyRoom; i++)
		blist[i] = 0;
}
void RoomMgr::findBad()
{
	for (int i = 0; i < manyRoom; i++)
	{
		if (rArr[i].getBad() >= 1)
		{ 
			blist[i]++;
		}
		else
		{
			rArr[i].setTarget(false);
			
		}
	}
}
void RoomMgr::findKeyword(string str)
{
	for (int i = 0; i < manyRoom; i++) {
		
		if (rArr[i].getKeyword().find(str)!=string::npos) {
			blist[i]++;
		}
		
	}
}
void RoomMgr::printTarget(int toknum)
{
	int count = 0;
	for (int i = 0; i < manyRoom; i++)
	{
		if (blist[i] == toknum) {
			count++;
			rArr[i].print();
		}
	}
	if (count == 0) {
		cout << "조건에 만족하는 방이 없습니다." << endl;
	}
}
void RoomMgr::findMoney(int money) //돈
{
	for (int i = 0; i < manyRoom; i++) {
		if (rArr[i].getMoney() <= money)
		{
			blist[i]++;
		}
		
	}
}
void RoomMgr::findMaxPeople(int max) //명
{
	for (int i = 0; i < manyRoom; i++) {
		if (rArr[i].getMaxPeople() >= max)
			blist[i]++;
		
	}
}
void RoomMgr::findSpace(int space) //평
{
	for (int i = 0; i < manyRoom; i++) {
		if (rArr[i].getSpace() >= space) blist[i]++;
		
	}
}
void RoomMgr::findOndol() {
	for (int i = 0; i < manyRoom; i++) {
		if (rArr[i].getRoom() > rArr[i].getBad()) blist[i]++;
		
	}
}


RoomMgr::RoomMgr()
{
}


RoomMgr::~RoomMgr()
{
}
