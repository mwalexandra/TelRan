// open modal

const openModalEl = document.querySelector('.open-modal-btn');
const modal = document.querySelector('.form-modal-wrapper');

openModalEl.addEventListener('click', () => {
  modal.style.display = 'flex';
});

