import sys

input=sys.stdin.readline
n = int(input())
stack_list = [None for _ in range(n)]
cnt = -1

for _ in range(n):
    cmd = list(input().split())

    if cmd[0] == 'push':
        x = int(cmd[1])
        cnt += 1
        stack_list[cnt] = x
    elif cmd[0] == 'pop':
        if cnt >= 0:
            pop_x = stack_list[cnt]
            cnt -= 1
            print(pop_x)
        else:
            print(-1)
    elif cmd[0] == 'size':
        print(cnt+1)
    elif cmd[0] == 'empty':
        if cnt >= 0:
            print(0)
        else:
            print(1)
    elif cmd[0] == 'top':
        if cnt >= 0:
            print(stack_list[cnt])
        else:
            print(-1)