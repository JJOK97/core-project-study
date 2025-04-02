# %%
'''
# Numpy
    - 고성능 수학계산을 위한 라이브러리 ( 수학적 계산 )

# 배열 ( array )
    - 동일한 자료형의 원소들이 연속적인 형태로 구성된 자료 구조

# List와 차이
    ## List
        - 숫자형이나 문자형 여러 가지 자료형을 한번에 다룰 수 있다.
        - 배열의 원소 구조가 달라도 괜찮다.
        - 크기 변경이 가능하다.

    ## Numpy 배열
        - 한 가지 동일한 자료형이여야 한다.
        - 배열의 원소 구조가 모두 동일해야 한다.
            np.array([[1],[2,3],[4,5,6]]) (x)
            np.array([[1,2,3],[2,3,4],[4,5,6]]) (x)

        - 크기 변경이 불가능하다.

    # 벡터 산술 연산
        - 벡터 : 크기와 방향을 가지고 있는 값
        - sum(), sprt(), mean()
        - 선형대수, 난수(random수) 생성, 푸리에 변환
'''

# %%
import numpy as np

list1 = [1,2,3,4]

arr = np.array(list1, dtype=np.float32)

print(arr)

# %%
# 브로드캐스팅
li2 = [1,2,3,4]
result1 = li2 + [1] # 연장

arr = np.array(li2)
result2 = arr + [1] # [1]이 arr의 길이만큼 늘어남 (브로드 캐스팅)
result3 = arr + 1 # [1]이 arr의 길이만큼 늘어남 (브로드 캐스팅)
result4 = arr + [1, 1, 1, 1] # [1]이 arr의 길이만큼 늘어남 (브로드 캐스팅)

# %%
arr1 = np.array([10, 20, 30])
arr2 = np.array([4, 5, 6])
arr3 = np.array([7, 8, 9])

print(arr1 + arr2)
print(arr1 - arr2)
print(arr1 * arr2)
print(arr1 / arr2) # 업캐스팅으로 실수형으로 자동변환
print(arr1 // arr2)
print(arr1 % arr2)

# %%
arr_str = np.array(['a' ,'b', 'c', 'de'])

print(arr_str) # dtype='<U3' 가장 큰 유니코드의 값

# %%
arr_str2 = np.array(['a', 'b', 3, 4]) # 문자열로 업캐스팅

# %%
arr4 = np.array([[1,2],[3,4]])

# 차원 확인
# ndim : 배열의 차원을 확인해주는 함수
print(arr4.ndim)

# 배열의 형태
# shape : 배열의 형태(행, 열)
print(arr4.shape)

# 배열의 가장 작은 단위 요소 개수
# size
print(arr.size)

# dtype : 배열 내 데이터들의 타입 ( 자료형 )
print(arr.dtype)

# %%
arr5 = np.array([[[1, 2, 3], [4, 5, 6]], [[7,8,9], [10, 11, 12]]])

print(arr5.ndim)
print(arr5.shape)
print(arr5.size)
print(arr5.dtype)

# %%
arr_0 = np.zeros((1,2), dtype=np.int32)
print(arr_0)

# %%
arr_1 = np.ones((2, 4, 3), dtype=np.int32)
print(arr_1)

# %%
# 특정 값으로 배열 생성
# full
# np.full((형태), 값)

arr_f = np.full((2, 4, 3), 1)
print(arr_f)

# %%
# np.arange() : range() 시퀀스로 배열 생성, 사용법은 (range) 함수와 유사
# np.arange(시작할 값, 끝값, 증감량)

arr_a = np.arange(1, 13, 1)
print(arr_a)

# reshape : 배열의 형태(shape) 변경
arr_a = arr_a.reshape(3,4)
print(arr_a)

# %%
# 데이터 접근 방법
# array는 리스트와 마찬가지로 인덱싱, 슬라이싱 지원
arr1 = np.array([[1, 2, 3], [4, 5, 6]])
print(arr1[0])

print(arr1[0][1])
print(arr1[1][1])

print('변경 전 \n', arr1)

arr1[0] = [11]
print('변경 후 \n', arr1)

# %%
list1 = [[1, 2, 3], [4, 5, 6]]

list1[0] = 11
print(list1)

# %%
arr2 = np.arange(9).reshape(3,3)
print(arr2)

# %%
# 행 열 동시에 가져오기
arr4 = np.arange(50).reshape(5,10)
# print(arr4[:2, :6])
# print(arr4[:len(arr4)+1:2, 0])
print(arr4[::2, 0])

# %%
arr5 = np.arange(18).reshape(3, 6)

for i  in range(1, len(arr5)):
    for j in range(1, len(arr5[i]), 2):
        print(arr5[i][j], end=' ')
    print()

print()

for i  in range(1, len(arr5)):
    print(arr5[i][1::2])

print()

print(arr5[1:, 1::2], '\n')

print()

print(arr5[ 1: , range(1, 6, 2)])

print()

print(arr5[ 1: , [1, 3, 5]])

# %%
# 전치

# 3행 6열
print(arr5.T)
# Transposition

# %%
# numpy 내부의 random 함수
# random.randint(시작값, 끝값())
arr6 = np.random.randint(50, 100, size = 8)
print(arr6)

# %%
arr7 = np.random.uniform(50, 100, size = 20).reshape(5, 4)
print(arr7)

# %%
# boolean 인덱싱
#   - 특정 조건에 맞는 값들을 찾아내고 싶을 때
#   - 사용법 : 인덱스 번호 대신, '조건식'을 입력
a = 5
print(a < 3)

# %%
arr6 >= 70

# %%
# 다중 조건
# 65이상이고, 90 이하
# numpy에서는 and, or 사용 불가능!
# numpy에서는 &, |를 사용, numpy 배열의 내부코드가 비트연산을 기반으로 만들어짐
(arr6 >= 65) & (arr6 <= 90)

# %%
(arr6 >= 65) | (arr6 <= 90)

# %%
(arr6 >= 65) ^ (arr6 <= 90)

# %%
~ arr6 <= 90

# %%
arr6[arr6 % 2 == 0]

# %%
# 2차원 배열
arr6 = np.array([[6,9,6,8,7],
                [2,3,5,4,1]])

# 짝수일 경우에만 값을 뽑아내도록..
arr6[:, 0::2] = 0
print(arr6)

# %%
# sum, mean