while True:
    n = int(input())
    if n == 0: break
    if n == 1: 
        print(1)
        continue
    m = 2*n
    arr = [True] * (m+1)
    for i in range(2, int(m**0.5)+1):
        if arr[i] == True:
            for j in range(i+i, m+1, i):
                arr[j] = False
    print(arr[n+1:m+1].count(True))