print("hello world")

num = 3

# print
print(num)

# type : 변수의 타입
print(type(num))

# 자료 번환
float(num)
# 실수형으로 반환만 시켜줌

num = float(num)
print(num)

num = 3.0
print(num)

'''
### 변수명 규칙
 - 영문자, 숫자, 언더바 사용 가능
 - 숫자로 시작 불가능
 - 키워드 사용 불가능 (if, and, True)

### 권장사항
 - 변수명의 첫글자는 항상 소문자
 - 두가지의 문자를 섞을 경우 두 단어를 구분
   - number_list
   - NumberList
   - nuberList
'''

number = 10
Number = 20
print("number: ", number)
print("Number: ", Number)

import keyword
print(keyword.kwlist)


a = 10
b = 15
c = '멋쟁이 옥진석'
print(a)
print(b)
print(c)

# 파이썬 변수 선언 특징
d, e = 20, 30

str1 = str2 = '파이썬 수업 듣는 중'
print(str1)
print(str2)

# print 내부는 , 로 구분 가능
print(c, str1)
print(c + ' '+ str1)

str4 = '''이렇게
여러줄을
입력
가능하다.'''

print(str4)

'''
# 슬라이싱 iterator
 - 변수명[x:y]
 - x부터 y까지
'''

day = "2020년 3월 3일의 날씨는 맑음입니다."

print('날짜 :', day[0:11])
print('날씨 :', day[-6:-4])

### 문자열 포멧팅
'''
 - 문자열 안의 특정한 값을 바꿔야 하는 경우
 - 
'''

s1 = '오늘은 3월 25일 입니다.'

s1 = '오늘은 3월 26일 입니다.'

# % 기호를 사용하는 방법
day = 22

# 정수형 변수를 넣을 자리에 %d, 마지막에 % 들어갈 변수 명
s2 = '오늘은 3월 %d일 입니다.'%day
print(s2)

day += 1
print('오늘은 3월 %d일 입니다.'%day)

# format 함수를 사용할 포멧팅

month = 8
day = '이십오'

s = '오늘은 {}월 {}일 입니다.'.format(month, day)

# f String을 활용한 포멧팅
# 현재 가장 많이 쓰이는 방법.

month = 4
day = 5

s = f'오늘은 {month}월 {day}일 입니다.'
print(s)