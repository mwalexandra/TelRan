// open form

const form = document.querySelector('.resipe-form');
const openFormBtn = document.querySelector('.open-form-btn');

openFormBtn.addEventListener('click', () => {
  form.style.transform = 'translateX(0)';
});