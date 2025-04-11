# %%
def divisor(n):
    for i in range(1, n + 1):
        if n % i == 0:
            print(i, end=' ')

divisor(10)
print()
divisor(32)
print()
divisor(100)

# %%
#### 독스트링
# 함수에 대한 설명, shift + tap

print('띄어쓰기', '없이', '써보자')
# 생략된 함수 sep, end, file, flush / 띄어쓰기, 개행, 결과를 파일이나 다른 스트림으로 변환, 진행 상태 등에서 한번에 표시할건지 실시간으로 표시할건지..