N, B = input().split()

def convert_to_decimal(N, B, i):
    p = len(N) - 1 - i # 제곱수

    if len(N) == i:
        return 0
    
    if N[i].isnumeric():
        res = int(N[i])
    else:
        res = (ord(N[i]) - ord('A') + 10)

    return  pow(B, p) * res + convert_to_decimal(N, B, i+1)    


print(convert_to_decimal(N, int(B), 0))