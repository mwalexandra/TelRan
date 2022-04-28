const personsList = document.querySelector('.persons-list');
let personsArray = [
  {
    name: 'Alexandra',
    surname: 'Makeewa',
    tel: '0123456',
    email: 'sasha@mail.com',
    photoLink: 'https://img.com/sasha',
  },
  {
    name: 'John',
    surname: 'Doe',
    tel: '6542980',
    email: 'john@mail.com',
    photoLink: 'https://img.com/john',
  },
];

const openModalEl = document.querySelector('.open-modal-btn');
const modal = document.querySelector('.form-modal-wrapper');
const form = document.querySelector('.form-modal-form');
const modalCloseBtn = document.querySelector('.form-modal-form span')

// form elements
const nameInput = document.querySelector('#name');
const surnameInput = document.querySelector('#surname');
const telInput = document.querySelector('#tel');
const emailInput = document.querySelector('#email');
const photoLinkInput = document.querySelector('#photo-link');

//create new person card
const createNewPersonCard = (obj) => {
  const personItem = document.createElement('li');
  personItem.classList.add('person-card');
  // avatar
  const personAvatar = document.createElement('span');
  personAvatar.classList.add('person-card-avatar');
  // name
  const personName = document.createElement('p');
  personName.classList.add('person-card-name');
  personName.textContent = obj.name + ' ' + obj.surname;
  // links
  const personLinksWrapper = document.createElement('div');
  personLinksWrapper.classList.add('person-links-wrapper');
  const personPhone = document.createElement('a');
  personPhone.classList.add('person-phone');
  personPhone.textContent = obj.tel;
  personPhone.href = 'tel:' + obj.tel;
  const personEmail = document.createElement('a');
  personEmail.classList.add('person-email');
  personEmail.textContent = obj.email;
  personEmail.href = 'mailto:' + obj.email;
  const personImage = document.createElement('a');
  personImage.classList.add('person-image');
  personImage.textContent = 'Photo link';
  personImage.href = obj.photoLink;

  personLinksWrapper.appendChild(personPhone);
  personLinksWrapper.appendChild(personEmail);
  personLinksWrapper.appendChild(personImage);
  personItem.appendChild(personAvatar);
  personItem.appendChild(personName);
  personItem.appendChild(personLinksWrapper);

  personsList.prepend(personItem);
};

const renderPersonsArray = personsArray.forEach(el => {
  createNewPersonCard(el);
});

// create new Person from form
const createNewPerson = () => {
  const newPerson = [];
  newPerson.name = nameInput.value;
  newPerson.surname = surnameInput.value;
  newPerson.tel = telInput.value;
  newPerson.email = emailInput.value;
  newPerson.photoLink = photoLinkInput.value;

  personsArray.push(newPerson);
  createNewPersonCard(newPerson);
  //renderPersonsArray();
}


// open modal
openModalEl.addEventListener('click', () => {
  modal.style.display = 'flex';
});

// close modal
modalCloseBtn.addEventListener('click', () => {
  modal.style.display = 'none';
});

// form submit
form.addEventListener('submit', (event) => {
  event.preventDefault();
  createNewPerson();
  cleanForm();
  modal.style.display = 'none';
});

const cleanForm = () => {
  nameInput.value = '';
  surnameInput.value = '';
  telInput.value = '';
  emailInput.value = '';
  photoLinkInput.value = '';
}
