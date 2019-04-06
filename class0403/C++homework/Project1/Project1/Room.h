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
	int space; //���
	int maxPeople; //�ִ��ο�
	int room; //���
	int bad; //ħ��
	int bath; //���
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

