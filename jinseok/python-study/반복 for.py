# %%
import random

num = random.randint(1, 50)

# %%
x = int(input('첫 번째 정수 입력 >> '))
y = int(input('두 번째 정수 입력 >> '))

while x != 0 and y != 0:
    sum = x + y
    print(f'두 정수의 합 {sum}')

    x = int(input('첫 번째 정수 입력 >> '))
    y = int(input('두 번째 정수 입력 >> '))

print('프로그램이 종료되었습니다.')

# %%
list2 = [[1,2], [3,4], [5,6]]

for i,j in list2:
    print(i,j)

# %%

for i in range(1, 10, 4):
    print(i)

for i in range(9):
    print(i)

# %%
num = int(input("정수 입력 : "))
result = []

for i in range(1, num + 1):
    if (num % i == 0):
        result.append(i)

print(f'{num}의 약수 : ', end='')
for i in result:
    print(i, end=' ')

# %%
for i in range(2, 10):
    for j in range(1, 10):
        print(f'{i} X {j} = {i * j}')

# %%
score_list = [90, 45, 70, 60, 55]

for i in range(1, len(score_list)+1):
    if score_list[i-1] >= 60:
        print(f'{i}번 학생은 합격입니다.')
    else:
        print(f'{i}번 학생은 불합격입니다.')

# %%
list4 = [1, 2, 3]
list5 = [3, 4, 5, 6]
list6 = []

num = len(list4) if len(list4) < len(list5) else len(list5)

for i in range(num):
    list6.append(list4[i] + list5[i])

if len(list4) > len(list5):
    list6.extend(list4[num:])
else:
    list6.extend(list5[num:])

print(list6)

# %%
list4 = [1,2,3,4,5,6,7]
list5 = [3,4,5,6]
list6 = []

for i in range(len(list4)):
    for j in range(len(list5)):
        if(i == j):
            list6. append(list4[i] + list5[j])
if i > j :
    list6.extend(list4[i-j+1:(i+1)])
else:
    list6.extend(list5[j-i+1:j+1])

print(list6)