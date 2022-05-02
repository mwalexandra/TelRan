const personsList = document.querySelector('.persons-list');
let personsArray = [
  // {
  //   id: 1,
  //   name: 'Sasha',
  //   surname: 'Makeewa',
  //   tel: '123456',
  //   email: 'sasha@gmail.com',
  //   photoLink: 'jfgkfjg.com',
  // },
  // {
  //   id: 2,
  //   name: 'Sasha2',
  //   surname: 'Makeewa',
  //   tel: '123456',
  //   email: 'sasha@gmail.com',
  //   photoLink: 'jfgkfjg.com',
  // },
  // {
  //   id: 3,
  //   name: 'Sasha3',
  //   surname: 'Makeewa',
  //   tel: '123456',
  //   email: 'sasha@gmail.com',
  //   photoLink: 'jfgkfjg.com',
  // },
];

const openModalEl = document.querySelector('.open-modal-btn');
const modal = document.querySelector('.form-modal-wrapper');
const form = document.querySelector('.form-modal-form');
const modalCloseBtn = document.querySelector('.form-modal-form span');
const modalOpenBtn = document.querySelector('.open-modal-btn');

// form elements
const nameInput = document.querySelector('#name');
const surnameInput = document.querySelector('#surname');
const telInput = document.querySelector('#tel');
const emailInput = document.querySelector('#email');
const photoLinkInput = document.querySelector('#photo-link');

// create delete btn in card
const createDeleteBtn = (person) => {
  const deleteBtn = document.createElement('span');
  deleteBtn.classList.add('delete-btn');
  deleteBtn.innerHTML = '<i class="fa-solid fa-user-xmark"></i>';
  deleteBtn.addEventListener('click', (event) => {
    event.preventDefault();
    removePersonCard(person);
    renderPersonsArray();
  });
  return deleteBtn;
}

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
  personEmail.href = 'mailto:' + obj.email;  // ???
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
  personItem.appendChild(createDeleteBtn(obj));

  personsList.prepend(personItem);
};

const renderPersonsArray = () => {
  personsList.innerHTML = '';
  personsArray.forEach((person) => {
    createNewPersonCard(person);
  });
  personsList.appendChild(modalOpenBtn);
};

// create new Person from form
const createNewPerson = () => {
  const newPerson = {
    id: Date.now(),
    name: nameInput.value,
    surname: surnameInput.value,
    tel: telInput.value,
    email: emailInput.value,
    photoLink: photoLinkInput.valu,
  };
  personsArray.push(newPerson);
};

// remove Person 
const removePersonCard = (person) => {
  // const index = personsArray.indexOf(person);
  // if(index > -1){
  //   personsArray.splice(index, 1);
  // }
  personsArray = personsArray.filter(item => item.id !== person.id);
};

const clickHandler = () => {
  createNewPerson();
  renderPersonsArray();
};

const cleanForm = () => {
  nameInput.value = '';
  surnameInput.value = '';
  telInput.value = '';
  emailInput.value = '';
  photoLinkInput.value = '';
};

const isFormNotValide = () => {
  return nameInput.value.trim() === '' || telInput.value.trim() === '';
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
  if(isFormNotValide()){
    cleanForm();
    modal.style.display = 'none';
    return;
  }
  clickHandler();
  cleanForm();
  modal.style.display = 'none';
});

renderPersonsArray(personsArray);
