import sys

input=sys.stdin.readline
n = int(input())
queue_list = [None for _ in range(n)]
head = 0
tail = 0

for _ in range(n):
    cmd = list(input().split())

    if cmd[0] == 'push':
        x = int(cmd[1])
        queue_list[tail] =x
        tail += 1
    elif cmd[0] == 'pop':
        if tail-head > 0:
            head += 1
            pop_x = queue_list[head-1]
            print(pop_x)
        else:
            head = 0
            tail = 0
            print(-1)
    elif cmd[0] == 'size':
        print(tail - head)
    elif cmd[0] == 'empty':
        if tail-head > 0:
            print(0)
        else:
            print(1)
    elif cmd[0] == 'front':
        if tail-head > 0:
            print(queue_list[head])
        else:
            print(-1)
    elif cmd[0] == 'back':
         if tail-head > 0:
            print(queue_list[tail-1])
         else:
            print(-1)