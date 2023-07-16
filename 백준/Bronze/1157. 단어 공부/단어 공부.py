s = list(input().upper())
dic = {}

for i in s:
  if i in dic:
    dic[i]+=1
  else:
    dic[i]=1

res = [k for k, v in dic.items() if max(dic.values())==v]
if len(res) > 1: print('?')
else: print(*res)