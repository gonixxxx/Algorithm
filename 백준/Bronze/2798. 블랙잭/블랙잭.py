n, m = map(int, input().split())
c = list(map(int, input().split()))
temp = []

for i in range(n-1):
    for j in range(i+1, n-1):
        for k in range(j+1, n):
            x = m - (c[i]+c[j]+c[k])
            if x >= 0:
                temp.append(x)

print(m-min(temp))