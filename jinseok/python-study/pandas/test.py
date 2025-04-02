# %%
import pandas as pd
# %%
### 2015 ~ 2017년 광주광역시 범죄현황 데이터를 이용해 전녀 대비 지역별 범죄 증감률 구하기
# - 증감률 = ( 금년 - 작년 ) / 작년 * 100

# %%
# 데이터 로드
# 인덱스 컬럼 '관서명'
# 인코딩 'euc-kr'

df2015 = pd.read_csv('pandas/data/2015.csv', encoding = 'euc-kr', index_col = '관서명')
df2016 = pd.read_csv('pandas/data/2016.csv', encoding = 'euc-kr', index_col = '관서명')
df2017 = pd.read_csv('pandas/data/2017.csv', encoding = 'euc-kr', index_col = '관서명')


# %%
df2015

# %%
df2016

# %%
df2017

# %%
df2015.loc['광주지방경찰청계']

# 인덱스 이름이 겹침
# 수정이나 삭제 시 한번에 바뀜
# 다중 인덱스(MultiIndex)

# %%
df2015['총계'] = df2015.loc[:,"살인":"폭력"].sum(axis = 1)

df2015

# %%
df2016['총계'] = df2016.loc[:,"살인":"폭력"].sum(axis = 1)

df2016

# %%
df2017['총계'] = df2017.loc[:,"살인":"폭력"].sum(axis = 1)

df2017

# %%
# 각 년도별로 발생건수의 총계
# 구분컬럼 == '발생건수'라는 조건에서 '총계'

s15 = df2015.loc[ df2015['구분'] == '발생건수' , '총계']
s15