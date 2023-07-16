n = list(input())
l = len(n)

end = l//2
if l%2==0:
  end = l//2-1

if n[:l//2] == n[-1:end:-1]:
  print(1)
else:
  print(0)