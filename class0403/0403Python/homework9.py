#9번
list1=[13, 42, 55, 8, 3, 77, 16, 23, 29, 43, 52, 70]
list1.sort()
list2=[list1[x] for x in range(len(list1)) if list1[x]%2==0]
print(list1)
print(list2[3])