class Song:
    def __init__(self,num,singer,name,year):
        self.num = num
        self.singer = singer
        self.name = name
        self.year = year
        self.sail=0
        self.man=0
        self.woman=0
        self.two=0
        self.three=0
        self.four=0

    def info(self,num,singer,name,year):
        self.num=num
        self.singer=singer
        self.name=name
        self.year=year

    def print(self):
        print('[ '+self.num+']'+self.singer+' '+self.name+' ('+self.year+')')

    def sailUp(self):
        self.sail+=1
    def hw4(self):
        if(self.sail>=5):
            self.print()

    def mgenderP(self):
        if(self.man>=3):
            self.print()
    def wgenderP(self):
        if(self.woman>=3):
            self.print()

    def agePT(self):
        if(self.two>=2):
            self.print()

    def agePTh(self):
        if(self.three>=2):
            self.print()
    def ageFP(self):
        if(self.four>=2):
            self.print()