chess = list(map(int, input().split()))

num = [1, 1, 2, 2, 2, 8]

print(*[-(i-j) for i, j in zip(chess, num)])