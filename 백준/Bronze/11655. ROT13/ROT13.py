input_string = input()

def Rot13(s):
    res = ''
    for i in s:
        if i.isupper():
            res += chr(( (ord(i) + 13 - ord('A')) % 26 ) + ord('A'))
        elif i.islower():
            res += chr(( (ord(i) + 13 - ord('a')) % 26 ) + ord('a'))
        else:
            res += i
    return res

print(Rot13(input_string))