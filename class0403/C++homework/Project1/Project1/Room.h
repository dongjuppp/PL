#pragma once
#ifndef ROOM_H
#define ROOM_H
#include <iostream>
#include <string>
#include <fstream>
#include <sstream>

using namespace std;

class Room
{
	string line;
	string name;
	int money;
	int space; //평수
	int maxPeople; //최대인원
	int room; //방수
	int bad; //침대
	int bath; //욕실
	string keyword1;
	bool target;

public:
	Room();
	~Room();

	void read(ifstream &in);
	void print();
	int getMoney() { return money; }
	void setTarget(bool bl) { target = bl; }
	int getSpace() { return space; }
	int getMaxPeople() { return maxPeople; }
	int getRoom() { return room; }
	int getBad() { return bad; }
	int getBeth() { return bath; }
	string getKeyword() { return keyword1; }
	bool getTarget() { return target; }
	
};

#endif

