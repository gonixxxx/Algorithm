n = int(input())
for i in range(2*n-1):
  if i < n:
    print(' '*(n-i-1), end='')
    print('*'*(2*i+1))
  else: # 5, 6, 7, 8
    print(' '*(i-n+1), end='') # i-5 +1
    print('*'*(2*(n-(i-n+1))-1)) # 2 * (4, 3, 2, 1) - 1