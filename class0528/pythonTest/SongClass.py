count = 5

def bake(nums):
    global count
    for x in nums:
        yield str(x)*3
        count -= 1
        if count == 0:
            raise StopIteration

def serve(nums):
    for x in nums:
        print(x)

def manage():
    order = (int(input('=>')) for x in range(10)) #order의 제너레이터를 만듦
    try:
        serve(bake(order))
    except Exception as e:
        print('Sorry! ', e)
    print("Today's service is over")

manage()
