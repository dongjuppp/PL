#pragma once
#ifndef ROOMMGR_H
#define ROOMMGR_H
#include <iostream>
#include <fstream>
#include <string>
#include "Room.h"

using namespace std;
class RoomMgr
{
	Room *rArr;
	int *blist;
	int manyRoom;
public:
	void readAll();
	void findMoney(int money);
	void findMaxPeople(int max);
	void findSpace(int space);
	void findOndol();
	void printTarget(int toknum);
	void findBad();
	void findKeyword(string str);
	void initBilst();
	
	RoomMgr();
	~RoomMgr();
};
#endif

