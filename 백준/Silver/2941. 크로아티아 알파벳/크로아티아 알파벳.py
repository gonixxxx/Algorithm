s = input()
l = len(s)

c = ["c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="]

# 1
for i in range(l):
  w1 = s[i:i+2]
  w2 = s[i:i+3]

  if w1 in c:
    s = s.replace(w1, '-', 1)
  elif w2 in c:
    s = s.replace(w2, '-', 1)

# 2
# for i in c :
#     s = s.replace(i, '-')

print(len(s))