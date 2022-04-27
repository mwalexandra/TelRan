// open modal

const openModalEl = document.querySelector('.open-modal-btn');
const modal = document.querySelector('.form-modal-wrapper');
const modalCloseBtn = document.querySelector('.form-modal-form span')

openModalEl.addEventListener('click', () => {
  modal.style.display = 'flex';
});

modalCloseBtn.addEventListener('click', () => {
  modal.style.display = 'none';
});
