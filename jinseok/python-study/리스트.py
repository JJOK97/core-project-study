# %%
fruits = ['사과', '포도', ['수박', '멜론'], '오렌지']
apple = fruits[0]
melon = fruits[2][1]
orange = fruits[3]

choice_lst = []
choice_lst += [apple]
choice_lst += [melon]
choice_lst += [orange]
print(choice_lst)

# %%
fruits = ['사과', '포도', ['수박', '멜론'], '오렌지']
apple = fruits[0]
melon = fruits[2][1]
orange = fruits[3]

choice_lst = []

choice_lst.append(apple)
choice_lst.append(melon)
choice_lst.append(orange)

choice_lst.extend([apple, melon, orange])

print(choice_lst)

# %%
lst = [12,123,1321,321,32123,123,1321,321,2313,11,21,32,121,23,]
print(len(lst))
len('asdfasdfasdfasdfadf')

# %%
lst = [12,123,1321,321,32123,123,1321,321,2313,11,21,32,121,23,]
print(lst.index(12))

# %%
list5 = [0, 1, 2, 3, 4]
print('insert 전 : ', list5)

list5.insert(3, 88)
print('insert 후 : ', list5)

# %%
list6 = [0,1,2,3,4,5]
del list6[3]

# %%
list6 = [0,1,2,3,4,5]
list6.remove(3)

# %%
list7 = [1, 1, 1, 1, 1]

del list7[1:3]

# %%
list8 = [0, 5, 3, 5,6,78,8,9]
list8.sort()

list8.reverse()

# %%
list9 = ['a', 'b','c']

print('d' in list9)

# %%
list_a = [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]

print(list_a)

num = list_a.index(1)
list_a[num] = 3

print(list_a)