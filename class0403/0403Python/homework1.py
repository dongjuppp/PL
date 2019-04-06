#1번
import random

start = (int)(input("시작값"))
end = (int)(input("끝값"))
num=(int)(input("개수"))

list1=[random.randrange(start,end) for i in range(0,num)]


print(list1)