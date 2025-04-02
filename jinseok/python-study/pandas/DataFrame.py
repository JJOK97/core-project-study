# %%
import pandas as pd

# %%
data = {'서울' : [9904312, 9631482],
        '부산' : [3448737, 3393191],
        '인천' : [2890451, 2632035],
        '대구' : [2466052, 2431774]}

ind = ['2015', '2010']

pop = pd.DataFrame(data, index = ind)

# %%
pop
### Series : key값이 인덱스의 이름
### DataFrame : key값이 컬럼명

# %%
# 리스트를 이용해서 DataFrame 생성
data = [[9904312,3448737,2890451,2466052],
        [9631482,3393191,2632035,2431774]]

ind = ['2015', '2010']
col = ['서울', '부산', '인천', '대구']

pop = pd.DataFrame(data, index = ind, columns = col)

# %%
pop

# %%
### 인덱스의 이름 변경
#### DF.rename(index={'바꾸기 전' : '바꾼 후'}, Columns={'바꾸기 전' : '바꾼 후'})
pop.rename(index = {'2015' : '2016', '2010' : '2011'}, columns  = {'서울' : '서울시', '부산' : '부산시'})

# %%
# 원본에 영향을 미치지 않음
pop

# %%
### 정리
#### DF을 생성하는 방법은 2가지
#### 딕셔너리 방식은 key이 컬럼명, value값이 위에서 아래로
#### 리스트 방식은 데이터가 보이는 위치 그대로 들어간다.

# %%
# 전치
# 원본에 영향 X
pop = pop.T

# %%
# DataFrame의 컬럼 변경
# 기존 컬럼을 인덱싱 새 값 대입
pop['2015'] = [9900000, 3450000, 2890000, 2470000]

# %%
pop.iloc[0, 1] = 9600000

pop

# %%
# DatafFrame에 새로운 컬럼 추가
# 에러 pop['2015'] = [1, 2, 3]

pop['2005'] = [ 1, 2, 3, 4]

# %%
# DataFrame 컬럼 삭제
del pop['2005']

pop

# %%
### 행 or 열 삭제
## drop

# pop.drop('행 또는 열 이름')
# DF.drop('행 or 열 이름', axis = 0 or 1, inplace = True or False)

pop.drop('2005', axis = 1, inplace = False)
# inplace = True -> 변수에 바로 변경사항을 저장
# inplace = False -> 변수에 저장 x

# %%
pop.drop('서울')
# axis 생략 (default=0), inplace 생략 (default=False)

# %%
# - del은 열(컬럼)만 삭제
# - drop은 행, 열 둘 다 삭제 가능 (단, 축방향(axis)를 설정)
#       - axis와 inplace 옵션의 기본 값, 0, False


# %%
# DataFrame 속성 확인하기
pop['2015'] = [9904312, 3448737, 2890451, 2466052]

# %%
pop.shape

# %%
pop.values

# %%
pop.index

# %%
pop.columns

# %%
pop.iloc[1, 0]

# %%
data = {
        '홍길동' : [175.3, 66.2, 27.0],
        '김사또' : [180.2, 78.9, 49.0],
        '임꺽정' : [178.6, 55.1, 35.0]
        }

index= ['키', '몸무게', '나이']

df1 = pd.DataFrame(data, index=index)

df2 = df1.T

df1

# %%
df2

# %%
pop + 1000000
# 각 값에 모두 계산

# %%
pop - 100000

# %%
# 새로운 pop2 정의
pop2 = pop + 500000

pop2

# %%
pop2 - pop

# %%
pop - pop

# %%
pop2['2005'] = [153153, 153151, 44458, 96852]

pop2

# %%
# pop2 : 2005라는 컬럼 보유
# pop : 2005라는 컬럼 미보유
pop2 - pop

# 인덱스 명, 컬럼명 모두 일치한 부분끼리만 연산
# NaN(Not a Number) 정해지지 않은 값

# %%
# DataFrame의 인덱싱 슬라이싱
## read_csv
## read_csv('데이터 위치', encoding = '인코딩 방식', index_col = 인덱스로 만들 컬럼)
# 데이터 정의
data = {
    '1반': [45, 76, 47, 92, 11],
    '2반': [44, 92, 92, 81, 79],
    '3반': [73, 45, 45, 85, 47],
    '4반': [39, 69, 69, 40, 26]
}

# 인덱스 정의
index = ['수학', '영어', '국어', '사회', '과학']

# DataFrame 생성
score_data= pd.DataFrame(data, index=index)

# 인덱스 전체이름
score_data.index.name = '과목'

score_data

# %%
# read_csv
# read_csv('데이터 위치', encoding = '인코딩방식', index_col = 인덱스로 만들 컬럼)
score_data = pd.read_csv('pandas/score.csv', encoding = 'utf-8', index_col = 0)

# encoding : 컴퓨터가 문자를 인식 할 수 있게 해주는 처리 과정
# euc-kr : 한글 전용 인코딩 방식
# index_col : 데이터에서 인덱스로 만들어줄 컬럼 설정

score_data

# %%
score_data[['1반']]

# %%
### DF 행 인덱싱
### DF에서 행 인덱싱을 위해서는, 슬라이싱 문법(범위) 적용

# 슬라이싱은 행에 접근
score_data['수학' : '국어']

# 수학 한 과목만 가져오고 싶다
score_data['수학' : '수학']

# 행 번호로도 가능
score_data[0:1]

# %%
# loc : 이름으로 접근
# DF.loc : [행의 범위(명칭), 열의 범위(명칭)]

# 각 반의 과학 점수
score_data.loc['과학']

# %%
score_data.loc['과학', '4반']

# %%
score_data.loc[ : , '4반']

# %%
score_data.loc[ : , '1반' : '4반' : 3]

# %%
score_data.loc[: , ['4반', '1반']]

# %%
# iloc는 인덱스 번호로 접근
score_data.iloc[:, [3, 0]]

# %%
# 각 반의 과학
score_data.iloc[4,:]

# %%
score_data.iloc[[0, 3], [0, 1]]

# %%
score_data

# %%
score_data.iloc[[2, 3], [1, 3]]

# %%
score_data.loc[['국어','사회'], ['2반','4반']]

# %%
score = score_data.T

score

# %%
score[score['영어'] >= 75].loc[:,'영어']

# %%
score[score['영어'] >= 75]['영어']

# %%
### sum(), mean()함수
score_data

# %%
# 합계를 구해주는 함수
# sum()
# DF.sum()
# 행, 열을 axis로 정함 0 or 1

score_data.sum()

# %%
score_data.sum(axis = 1)


# %%
# %%
### sum(), mean()함수
score_data

# %%
# 합계를 구해주는 함수
# sum()
# DF.sum()
# 행, 열을 axis로 정함 0 or 1

score_data.sum()

# %%
score_data.sum(axis = 1)

# %%
score_data['총합'] = score_data.loc[ : , '1반' : '4반'].sum(axis = 1)
score_data

# %%
# 평균을 구해주는 함수
# mean()
# 사용법은 sum()과 동일

score_data['평균'] = score_data.loc[ : , '1반' : '4반'].mean(axis = 1)
score_data

# %%
df_sleep = pd.DataFrame([['집중', '집중', '집중', '집중'],
                         ['집중', '집중', '졸림', '졸림'],
                         ['집중', '졸림', '숙면', '숙면']],
                        index = ['학생1','학생2', '학생3'],
                        columns = ['5교시', '6교시', '7교시', '8교시'])

df_sleep
# %%
df_sleep['7교시'].value_counts()
# %%
df_sleep['5교시'].value_counts()

# %%
df_sleep[['5교시', '6교시']].value_counts()
# %%
df_sleep.loc['학생1'].value_counts()
# %%
# read_csv
# read_csv('데이터 위치', encoding = '인코딩방식', index_col = 인덱스로 만들 컬럼)
score_data = pd.read_csv('score.csv', encoding = 'utf-8', index_col = 0)

# encoding : 컴퓨터가 문자를 인식 할 수 있게 해주는 처리 과정
# euc-kr : 한글 전용 인코딩 방식
# index_col : 데이터에서 인덱스로 만들어줄 컬럼 설정

score_data

# %%

score_data.loc['총합'] = score_data.loc[:'과학' ,  : ].sum(axis = 0)
score_data
# %%
