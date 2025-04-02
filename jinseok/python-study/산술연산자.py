num1 = 10
num2 = 7

print(num1/num2) # 나눗셈
print(num1//num2) # 몫
print(num1%num2) # 나머지

# 반올림
round(num1/num2, 2)

# 문자열 덧셈
str1 = '신'
str2 = '재영'

print(str1, str2)

str1 = '10'
str2 = '20'

print(str1+str2)

# 숫자와 문자열의 덧셈
num1 = 10
str1 = '10'
print(str(num1)+str1)
print(num1+int(str1))

# 실습 문제 1
num1 = input('num1을 입력하세요 : ')
num2 = input('num2을 입력하세요 : ')

print(f'더하기 결과 : {int(num1)+int(num2)}')
print(f'빼기 결과 : {int(num1)-int(num2)}')
print(f'곱하기 결과 : {int(num1)*int(num2)}')
print(f'나누기 결과 : {int(num1)/int(num2)}')

# 실습 문제 2
num1 = int(input("python 점수 입력 >> "))
num2 = int(input("머신러닝 점수 입력 >> "))
num3 = int(input("딥러닝 점수 입력 >> "))

print(f'합계 : {num1+num2+num3}')
print(f'평균 : {(num1+num2+num3)/3}')

# 실습 3
time = int(input("초 입력 >> "))
hour = time // 3600
minute = (time - (hour*3600)) // 60
second = (time - (hour*3600) - (minute*60))
print(f'{hour} : {minute} : {second}')
