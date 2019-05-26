class Song:
    name = ''
    num = 0
    singer = ''
    year = ''

    def print(self):
        print('[' + self.num + '] ' + self.singer + ' ' + self.name + ' (' + self.year + ')')

    def setSong(self,name,num,singer,year):
        self.name=name
        self.singer=singer
        self.year=year
        self.num=num
