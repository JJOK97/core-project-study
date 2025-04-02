# %%
dict1 = {'name' : '옥진석', 'age' : 20, 'phone' : '010-4014-2405'}

print(dict1)

# key값 출력
for i in dict1:
    print(i)

# value 출력
print(dict1['name'])
print(dict1.get('name'))

# value 출력
for i in dict1:
    print(dict1.get(i))

# %%
# 수정
dict1['age'] = 21

# %%
# 추가
dict1['birth'] = '12/24'

print(dict1)

# %%
# 삭제
del dict1['birth']

print(dict1)

# %%
# 전체 삭제
dict1.clear()

print(dict1)

# %%
team = {
            'team1' : '옥진석',
            'team2' : '김다현',
            'team3' : '권오빈',
            'team4' : '차영주'
        }

print(team)

team['team1'] = '옥진석'
team['team2'] = '김호성'
team['team3'] = '이수현'
team['team4'] = '이주연'
team['team5'] = '최은혜'

print(team)

# %%
score_dict = {'이름':['신재영','신재영','임승환','이도연','주미리'],
        'Python':[95,100,85,90,80],
        'Java':[85,80,100,95,85],
        'html/css':[75,70,90,80,90]}

name = input('이름을 입력하세요 : ')

while True:
    count = 0
    for i in range(len(score_dict.get('이름'))):
        if(score_dict.get('이름')[i] == name):
            count += 1

    if count != 1:
        print('이름이 없거나 중복되었습니다.')
        name = input('이름을 입력하세요:')
        continue

    check = False

    for i in range(len(score_dict.get('이름'))):
        if(score_dict.get('이름')[i] == name):
            print(f"Python: {score_dict['Python'][i]}")
            print(f"Java: {score_dict['Java'][i]}")
            print(f"html/css: {score_dict['html/css'][i]}")
            check = True

    if check:
        print('완료')
        break