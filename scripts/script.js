var sc = document.getElementById('section')
var folder = document.getElementById('paramore-folder')

folder.addEventListener('mouseenter', enter)
folder.addEventListener('mouseout', out)

function enter() {
    sc.style.background = "url('../images/paramore/paramore-wallpaper.jpg') center"
}

function out() {
    sc.style.background = 'white';
}