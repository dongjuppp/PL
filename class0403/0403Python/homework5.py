#5번
import random

start = (int)(input("시작값"))
end = (int)(input("끝값"))
num=(int)(input("개수"))

list2=[random.randrange(start,end) for i in range(0,num)]
list1=[list2[x] for x in range(num) if x not in [0,4,5,7]]


print(list2)
print(list1)