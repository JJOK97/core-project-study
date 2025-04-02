# %%
num1 = int(input('첫번째 정수 입력 >> '))
num2 = int(input('두번째 정수 입력 >> '))


def number_sub(num1, num2):
    return num1 + num2

# 빼기 기능을 하는 함수 호출
result = number_sub(num1, num2)

print(result)

# %%
'''
# 내장함수
    - sum(1, 2) -> 에러
    - 집합들만..
'''

# %%

s = input("문자열 입력 >> ")

def s_replace(s):
    str1 = ''
    for i in range(len(s)):
        if s[i] != 'ㅋ':
          str1 += s[i]
    return str1

result = s_replace(s)
print(result)
