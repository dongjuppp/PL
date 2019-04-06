#include <iostream>

#include "RoomMgr.h"

using namespace std;

int main() {
	RoomMgr mgr;
	mgr.readAll();
	
	string command,kwd;
	while (true)
	{
		int i = 0;
		int toknum = 0;
		cout << ">>";
		getline(cin,command);
		istringstream tok(command);
		while (true)
		{
			tok >> kwd;
			toknum++;
			string temp = kwd.substr(kwd.size()-2);
			if (kwd == "end") break;
			if (kwd == "�µ�")
				mgr.findOndol();
			else if (kwd == "ħ��")
				mgr.findBad();
			else if (kwd.substr(kwd.size() - 2) == "��")
				mgr.findMoney(stoi(kwd.substr(0, kwd.size() - 2)));
			else if (kwd.substr(kwd.size() - 2) == "��")
				mgr.findMaxPeople(stoi(kwd.substr(0, kwd.size() - 2)));
			else if (kwd.substr(kwd.size() - 2) == "��")
				mgr.findSpace(stoi(kwd.substr(0, kwd.size() - 2)));
			else
				mgr.findKeyword(kwd);
			
			
		}
		mgr.printTarget(toknum-1);
		mgr.initBilst();
	}
}