#3번
import random

start = (int)(input("시작값"))
end = (int)(input("끝값"))
num=(int)(input("개수"))

list1=[random.randrange(start,end) for i in range(0,num)]
list2=[list1[x] for x in range(num) if list1[x]%3!=0 and list1[x]%5!=0]


print(list1)
print(list2)