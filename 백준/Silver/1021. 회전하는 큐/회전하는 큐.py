from collections import deque

n, m = map(int, input().split())
idx_list = list(map(int, input().split()))

q = deque([i for i in range(1, n+1)])

cnt = 0
for num in idx_list:
    idx = - q.index(num)

    if abs(idx) > len(q) + idx:
        idx += len(q)
    
    cnt += abs(idx)
    q.rotate(idx)
    q.popleft()

print(cnt)