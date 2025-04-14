const likeCount = document.getElementById('likeCount');
const addBtn = document.getElementById('addBtn');
const minusBtn = document.getElementById('minusBtn');
const clearBtn = document.getElementById('clearBtn');

let count = 0;

addBtn.addEventListener('click', function () {
    count++;
    likeCount.textContent = count;
});

minusBtn.addEventListener('click', function () {
    if (count > 0) {
        count--;
        likeCount.textContent = count;
    }
});

clearBtn.addEventListener('click', function () {
    count = 0;
    likeCount.textContent = count;
});
