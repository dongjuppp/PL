#include "Drink.h"



Drink* list[100];
int cnt;

using namespace std;

int main() {
	int total = 0;
	ifstream fin("menu.txt");
	while (!fin.eof()) {
		list[cnt] = new Drink();
		list[cnt]->read(fin);
		cnt++;
	}
	
	for (int i = 0; i < cnt; i++)
		list[i]->print();
	string kwd;
	int match_cnt[100] = { 0 };
	int kwd_cnt = 0;
	while (1) {
		for (int i = 0; i < cnt; i++)
			match_cnt[i] = 0;
		kwd_cnt = 0;
		cout << ">> ";
		cin >> kwd;
		if (kwd == "end") break;
		while (kwd != "end") {
			for (int i = 0; i < cnt; i++)
				if (list[i]->matches(kwd))
					match_cnt[i]++;
			kwd_cnt++;
			cin >> kwd;
		}
		for (int i = 0; i < cnt; i++)
			if (match_cnt[i] == kwd_cnt)
				list[i]->print();
	}

	while (true) {
		cout << "ÁÖ¹®:";
		string ord;
		while (true) {
			cin >> ord;
			if (ord == "0") break;
			for (int i = 0; i < cnt; i++) {
				if (list[i]->order(ord)) {
					total +=(list[i]->getMoney());
					
				}
				
			}
		}
		
		for (int i = 0; i < cnt; i++) {
			if (list[i]->isOrdered()) {
				list[i]->print2();
			}
			list[i]->setStack();
		}
		cout << "ÃÑ ¸ÅÃâ:" << total << endl;
		total = 0;
	}
	
}