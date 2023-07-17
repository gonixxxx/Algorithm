n = int(input())
cnt = n

for i in range(n):
  w = input()
  for j in range(len(w)-1):
    if w[j] in w[j+1:]:
      if w[j] == w[j+1]:
        pass
      else:
        cnt -= 1
        break

print(cnt)