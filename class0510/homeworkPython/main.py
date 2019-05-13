
from song import Song
from user import User

text=[line for line in open('songs.txt','r')]
users=[line for line in open('user.txt','r')]

songList=[]
singerDict={}

for str1 in text:
    tmp=str1.split()
    stmp=Song(tmp[0],tmp[1],tmp[2],tmp[3])
    songList.append(stmp)
    if(tmp[1] in singerDict):
        singerDict[tmp[1]] += 1
    else:
        singerDict[tmp[1]]=1



userList=[]
for str1 in users:
    tmp=str1.split()
    sonl=[songList[int(tmp[x])-1] for x in range(4,len(tmp)-1)] #각 유저마다 노래 리스트 가지고 있음
    usr=User()
    usr.info(tmp[0],tmp[1],tmp[2],tmp[3],sonl)
    userList.append(usr)
    for s in sonl:
        s.sailUp()
        if (tmp[3] == '남'):
            s.man+=1
        else:
            s.woman+=1
        if(tmp[2][0]=='2'):
            s.two+=1
        elif(tmp[2][0]=='3'):
            s.three+=1
        else:
            s.four+=1





def hw1():
    for song in songList:
        song.print()
def hw2():
    for singer in singerDict:
        if(singerDict[singer]>=3):

           print(singer + ' '+str(singerDict[singer])+ '회 등장')
def hw3():
    for usr in userList:
        usr.print()

def hw4():
    for song in songList:
        song.hw4()

def hw5():
    print('남성 사용자가 좋아하는곡')
    for s in songList:
        s.mgenderP()
    print('여성 사용자가 좋아하는곡')
    for s in songList:
        s.wgenderP()

def hw6():
    print('20대가 좋아하는 곡')
    for song in songList:
        song.agePT()
    print('30대가 좋아하는 곡')
    for song in songList:
        song.agePTh()
    print('40대가 좋아하는 곡')
    for song in songList:
        song.ageFP()


while(True):
    x=int(input('과제1=1, 과제2=2... 과제6=6, 종료=0'))
    if(x==0):
        break
    if(x==1):
        hw1()
    elif(x==2):
        hw2()
    elif(x==3):
        hw3()
    elif(x==4):
        hw4()
    elif(x==5):
        hw5()
    else:
        hw6()