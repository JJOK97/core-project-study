# %%
### 어떤 영화가 좋은 평점을 받았는지 분석
import numpy as np

# gemframtxt
# np.genfromtxt('파일경로', delimiter = '구분자', dtype = 데이터 타입)

movie = np.genfromtxt('ratings.dat', delimiter="::", dtype=np.int64)
np.set_printoptions(suppress=True, precision=2)


print(movie)

#%%
### 7. 10번 영화의 평점의 평균 구하기

movies = movie[movie[:, 1] == 10]
print(movies[:, 2].mean())

#%%
### 8. 각 영화가 받은 평점의 평균 구하기
movie_ids = np.unique(movie[:, 1])
print(movie_ids)

movie_rate = []

movie_mean = movie[movie[:, 1] == 1]
print(movie_mean)
movie_mean = movie_mean[:, 2]
print(movie_mean)
movie_mean = movie_mean.mean()

for movie_id in movie_ids:
    movie_mean = movie[movie[:, 1] == movie_id][:, 2].mean()
    movie_rate.append([movie_id, movie_mean])

print(movie_rate)
movie_ratings = np.array(movie_rate)
print(movie_ratings)
