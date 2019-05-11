class Singer:
    def __init__(self):
        self.name=''
        self.num=0

    def up(self):
        self.num+=1

    def print(self):
        print(self.name+' '+self.num+'회 등장')