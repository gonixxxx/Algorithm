import sys

input=sys.stdin.readline
n = int(input())
dequeue = [None for _ in range(n)]
head = 0
tail = 0

for _ in range(n):
    cmd = list(input().split())

    if cmd[0] == 'push_front':
        x = int(cmd[1])
        dequeue[head] = x
        head = ((head-1) + n) % n
        
    elif cmd[0] == 'push_back':
        x = int(cmd[1])
        tail = (tail+1) % n
        dequeue[tail] = x

    elif cmd[0] == 'pop_front':
        if (tail-head) % n > 0:
            p = dequeue[(head+1) % n]
            head = (head+1) % n
            print(p)
        else:
            print(-1)

    elif cmd[0] == 'pop_back': 
        if (tail-head) % n > 0:
            p = dequeue[tail]
            tail = ((tail-1) + n) % n
            print(p)
        else:
            print(-1)

    elif cmd[0] == 'size':
        print( (tail-head) % n)

    elif cmd[0] == 'empty':
        if (tail-head) % n > 0:
            print(0)
        else:
            print(1)

    elif cmd[0] == 'front':
        if (tail-head) % n > 0:
            print(dequeue[(head+1) % n])
        else:
            print(-1)

    elif cmd[0] == 'back':
         if (tail-head) % n > 0:
            print(dequeue[tail])
         else:
            print(-1)