from song import Song
class User:
    def __init__(self):
        self.name=''
        self.age=0
        self.gender=''
        self.songList=[Song]
        self.id=''

    def info(self,id,name,age,gender,songList):
        self.id=id
        self.name=name
        self.age=age
        self.gender=gender
        self.songList=songList

    def print(self):
        print(self.id+' '+self.name+' '+self.age+' '+self.gender)
        for s in self.songList:
            s.print()

