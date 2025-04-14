const marginBtn = document.getElementById('marginBtn');
const borderRadiusBtn = document.getElementById('borderRadiusBtn');
const boxes = [
    document.getElementById('box1'),
    document.getElementById('box2'),
    document.getElementById('box3'),
    document.getElementById('box4'),
];

marginBtn.addEventListener('click', function () {
    boxes.forEach((box, index) => {
        box.style.marginLeft = index * 100 + 'px';
    });
});

borderRadiusBtn.addEventListener('click', function () {
    boxes.forEach((box) => {
        box.style.borderBottomLeftRadius = '40%';
        box.style.borderTopRightRadius = '40%';
    });
});
