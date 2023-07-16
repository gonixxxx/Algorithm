import math

def is_prime(N):
    for j in range(2, int(math.sqrt(N))+1):
        if i%j==0:
            return False
    return True

N = int(input())
arr = list(map(int, input().split()))
cnt = 0

for i in arr:
    if i > 1 and is_prime(i): cnt+=1
        
print(cnt)