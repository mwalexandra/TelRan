const addEmpFormOpen = document.getElementById('empFormOpen'); 
const empFormWrapper = document.querySelector('.add-employee-form');
const empform = document.querySelector('.add-employee-form__form');

const daysFormOpen = document.querySelector('.employees__list_item_btn');
const daysFormWrapper = document.querySelector('.add-days-form');
const daysForm = document.querySelector('.add-days-form__form');

addEmpFormOpen.addEventListener('click', (event) => {
  empFormWrapper.style.display = 'flex';
});

daysFormOpen.addEventListener('click', event => {
  daysFormWrapper.style.display = "flex";
})

empform.addEventListener('submit', (event) => {
  event.preventDefault();
  empFormWrapper.style.display = 'none';
})

daysForm.addEventListener('submit', event => {
  event.preventDefault();
  daysFormWrapper.style.display = "none";
})
