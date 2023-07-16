def ret_bestseller(n):
    book_list = {}

    for _ in range(n):
        book = input()           # 책이름 key
        if book in book_list:
            book_list[book] += 1 # 빈도수 values
        else:
            book_list[book] = 1

    sort_book_list = []

    for book in book_list.keys():
        if book_list[book] == max(book_list.values()):
            sort_book_list.append(book)

    sort_book_list.sort()
    best_seller = sort_book_list[0]

    return best_seller

n = int(input()) # 팔린 책의 개수
print(ret_bestseller(n))





