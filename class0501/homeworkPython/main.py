wordlist=[x.replace('.', '').replace(',','').replace('?','').replace('!','').replace('\'','').lower()
      for line in open('azkaban.txt','r') for x in line.split()]

wordDup={}
userWordDup={}

for i in wordlist:
    wordDup[i]=True


def word_generator():
    for i in wordlist:
        if(wordDup[i]==True):
            yield i

def init():
    wordlist=[]
    wordlist = [x.replace('.', '').replace(',', '').replace('?', '').replace('!', '').replace('\'', '').lower()
                for line in open('azkaban.txt', 'r') for x in line.split()]
    wordDup.clear()
    for i in wordlist:
        wordDup[i] = True



print('끝말잇기 게임을 시작합니다!')
print('규칙 1: 소문자만입력(모든 단어는 소문자로 변환되어 저장했음)')
print('규칙 2: 기호는 빼고 입력(모든 기호는 제거 하고 저장했음)')

comchar=''


def doit():
    num = 0
    while (True):
        str = input('>>')
        if (num != 0):
            if (str[0] != tempStr[len(tempStr) - 1]):
                print('끝글자와 다릅니다')
                break
        if str in wordDup.keys():
            if (wordDup[str] == False):
                print('이미 사용된 단어 입니다')
                break
            else:
                wordDup[str] = False
        else:
            wordDup[str] = False

        gen = word_generator()
        while (True):
            try:
                tempStr = next(gen)
            except StopIteration:
                print('이겼습니다')
                return

            if (tempStr[0] == str[len(str) - 1]):
                wordDup[tempStr] = False
                print(tempStr)
                num += 1
                break

while(True):
    doit()
    x=input('계속 하시겠습니까? y/n')
    if(x=='n'):
        break
    else:
        init()











