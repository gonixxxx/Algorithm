n, m = map(int, input().split())
l = [True] * (m+1)
l[1] = False

for i in range(2, int(m**(1/2))+1):
    if l[i] == True:
        for j in range(i+i, m+1, i):
            l[j] = False
            
for i in range(n, m+1):
    if l[i] == True: 
        print(i)