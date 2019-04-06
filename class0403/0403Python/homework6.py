#6번

list1=[13, 42, 55, 8, 3, 77, 16, 23, 29, 43, 52, 70]
list2 = [list1[x] for x in range(len(list1)) if '3' in str(list1[x])]
print(list2)