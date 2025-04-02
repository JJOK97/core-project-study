# %%
if True:
    print('희진씨는 팀장이다')
print('이 문장은 조건문 밖에 있는 문장이라 항상 실행된다.')

# %%
num = int(input('정수 입력 >> '))
if (num % 3 == 0) and (num % 5 == 0):
    print('3과 5의 배수입니다.')
else:
    print('3과 5의 배수가 아닙니다.')

# %%
num1 = int(input('첫 번째 정수 입력 >> '))
num2 = int(input('두 번째 정수 입력 >> '))
print('두 수가 똑같습니다.') if num1 == num2 else (print('두 번째 정수가 더 큽니다.') if num1 < num2 else print('첫 번째 정수가 더 큽니다'))


# %%
while True:
    try:
        score = int(input("점수 입력 >> "))
    except ValueError:
        print("숫자만 입력하세요.")
        continue

    if score < 0 or score > 100:
        print("0 ~ 100 사이의 숫자를 입력하세요.")
        continue

    if score >= 90:
        print('A')
    elif score >= 80:
        print('B')
    elif score >= 70:
        print('C')
    elif score >= 60:
        print('D')
    else:
        print('F')
    break

# %%
x = int(input('x > '))
y = int(input('y > '))

if abs(x) <= 4 and abs(y) <= 4:
    if x > 0 and y > 0:
        print(f'({x}, {y})는 1사분면입니다.')
    elif x < 0 and y > 0:
        print(f'({x}, {y})는 2사분면입니다.')
    elif x > 0 and y < 0:
        print(f'({x}, {y})는 4사분면입니다.')
    elif x < 0 and y < 0:
        print(f'({x}, {y})는 3사분면입니다.')
    else :
        print(f'({x}, {y})는 원점입니다.')
else:
    print(f'와랄랄라')

# %%
list3 = [1, 2, 3, ['a', 'b', 'c']]
temp = list3[3]
print(temp)
print(list3[3][1])
print(list3[3][1:])


# %%
matrix = [[1,2,3], [4,5,6], [7,8,9]]
print("첫 번째 요소의 두 번째 요소:", matrix[0][1])
print("두 번째 요소 전체:", matrix[1])
print("두 번째 요소부터 끝까지 :", matrix[1:])
print("두 번째 요소에서, 첫 번째부터 두번째 요소까지:", matrix[1][1:3])