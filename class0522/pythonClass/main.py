from Song import Song



songList=[]
songTempList=[line for line in open('songs.txt','r')]

for x in songTempList:
    tmp=x.split()
    stmp=Song()
    stmp.setSong()


