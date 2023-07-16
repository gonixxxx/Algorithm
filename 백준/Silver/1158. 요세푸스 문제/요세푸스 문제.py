from collections import deque

n, k = map(int, input().split())

yf = deque([x+1 for x in range(n)])
res = []

k = k-1
while yf:
    yf.rotate(-k)
    res.append(str(yf.popleft()))
 
print("<", ", ".join(res), ">", sep='')