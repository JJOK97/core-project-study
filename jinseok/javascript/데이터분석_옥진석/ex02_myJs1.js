const danInput = document.getElementById('dan');
const forBtn = document.getElementById('forBtn');
const whileBtn = document.getElementById('whileBtn');
const forResult = document.getElementById('forResult');
const whileResult = document.getElementById('whileResult');

function forGugudan() {
    const dan = parseInt(danInput.value);

    let result = `<div>for문을 이용한 구구단</div> <br>`;
    for (let i = 1; i <= 9; i++) {
        result += `${dan} x ${i} = ${dan * i}<br>`;
    }
    forResult.innerHTML = result;
    whileResult.innerHTML = '';
}

function whileGugudan() {
    const dan = parseInt(danInput.value);

    let i = 1;
    let result = `<div>while문을 이용한 구구단</div> <br>`;
    while (i <= 9) {
        result += `${dan} x ${i} = ${dan * i}<br>`;
        i++;
    }
    whileResult.innerHTML = result;
    forResult.innerHTML = '';
}

forBtn.addEventListener('click', forGugudan);
whileBtn.addEventListener('click', whileGugudan);
